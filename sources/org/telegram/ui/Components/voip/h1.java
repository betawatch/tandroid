package org.telegram.ui.Components.voip;

import ai.jc;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ei.i6;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.w9;
import org.webrtc.RendererCommon;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class h1 implements NotificationCenter.NotificationCenterDelegate, tf.a {
    public static final hw0 b0 = new hw0(new ud0(24), new ud0(25));
    public static final hw0 c0 = new hw0(new ud0(26), new ud0(27));
    public static final h1 d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public le.b G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public rf.d O;
    public float P;
    public float Q;
    public float R;
    public o1.k S;
    public o1.k T;
    public Float U;
    public boolean V;
    public boolean W;
    public ki.u X;
    public com.google.android.gms.internal.cast.p Y;
    public q2 Z;
    public float a;
    public boolean a0;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.e d;
    public ah.v e;
    public q2 f;
    public FrameLayout h;
    public h n;
    public w9 r;
    public jc s;
    public TLRPC.GroupCallParticipant v;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        h1 h1Var = new h1();
        h1Var.a = 1.4f;
        h1Var.n = new h();
        h1Var.w = true;
        h1Var.P = 1.0f;
        h1Var.X = new ki.u(h1Var, 14);
        d0 = h1Var;
    }

    public static void j() {
        h1 h1Var = d0;
        if (h1Var.V) {
            h1Var.V = false;
            AndroidUtilities.runOnUIThread(new rc(20), 100L);
            h1Var.E.getNotificationCenter().removeObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.E.getNotificationCenter().removeObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(h1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = h1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (h1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(h1Var.X);
                h1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(bs.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new e1(h1Var));
            animatorSet.start();
            rf.d dVar = h1Var.O;
            if (dVar != null) {
                dVar.c();
                h1Var.O = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    public static void n(Activity activity) {
        h1 h1Var = d0;
        h1Var.getClass();
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || h1Var.V) {
            return;
        }
        h1Var.V = true;
        AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
        h1Var.E = accountInstance;
        accountInstance.getNotificationCenter().addObserver(h1Var, NotificationCenter.groupCallUpdated);
        h1Var.E.getNotificationCenter().addObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
        NotificationCenter.getGlobalInstance().addObserver(h1Var, NotificationCenter.didEndCall);
        h1Var.M = h1Var.m();
        h1Var.N = h1Var.l();
        h1Var.P = 1.0f;
        h1Var.K = false;
        o1.k kVar = new o1.k(h1Var, b0);
        o1.l lVar = new o1.l();
        lVar.a(0.75f);
        lVar.b(650.0f);
        kVar.u = lVar;
        h1Var.S = kVar;
        o1.k kVar2 = new o1.k(h1Var, c0);
        o1.l lVar2 = new o1.l();
        lVar2.a(0.75f);
        lVar2.b(650.0f);
        kVar2.u = lVar2;
        h1Var.T = kVar2;
        Activity activity2 = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        int i10 = 2;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new mg.b(h1Var, i10));
        h1Var.F = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        h1Var.F.setStylusScaleEnabled(false);
        h1Var.G = new le.b(activity2, new f1(h1Var, scaledTouchSlop));
        h1Var.e = new ah.v(h1Var, activity2);
        org.telegram.ui.e eVar = new org.telegram.ui.e(h1Var, activity2, i10);
        h1Var.d = eVar;
        eVar.addView(h1Var.e, z5.c(-1.0f, -1));
        h1Var.e.setOutlineProvider(new ci.n1(17));
        h1Var.e.setClipToOutline(true);
        r6.i(k6.gg, h1Var.e, null);
        w9 w9Var = new w9(activity2);
        h1Var.r = w9Var;
        h1Var.e.addView(w9Var, z5.c(-1.0f, -1));
        q2 q2Var = new q2(activity2, false, false, false, false);
        h1Var.f = q2Var;
        q2Var.setAlpha(0.0f);
        h1Var.f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        q2 q2Var2 = h1Var.f;
        q2Var2.a0 = 0;
        q2Var2.d.setRotateTextureWithScreen(true);
        h1Var.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(h1Var));
        h1Var.e.addView(h1Var.f, z5.c(-1.0f, -1));
        jc jcVar = new jc(h1Var, activity2, 27);
        h1Var.s = jcVar;
        h1Var.e.addView(jcVar, z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(activity2);
        h1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(activity2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        h1Var.h.addView(view, z5.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(activity2);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i11 = k6.hg;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(imageView, i11, null, mode);
        int i12 = k6.i6;
        imageView.setBackground(k6.g0(k6.x0(null, i12, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new ah.f(15));
        float f7 = 38;
        float f10 = 4;
        h1Var.h.addView(imageView, z5.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        r6.t(imageView2, i11, null, mode);
        imageView2.setBackground(k6.g0(k6.x0(null, i12, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new hg.r0(activity2, 14));
        h1Var.h.addView(imageView2, z5.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
        h1Var.e.addView(h1Var.h, z5.c(-1.0f, -1));
        h1Var.b = (WindowManager) activity2.getSystemService("window");
        WindowManager.LayoutParams b10 = uf.b.b(activity2, false);
        h1Var.c = b10;
        int i13 = h1Var.M;
        b10.width = i13;
        b10.height = h1Var.N;
        float dp2 = (AndroidUtilities.displaySize.x - i13) - AndroidUtilities.dp(16.0f);
        h1Var.Q = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = h1Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f);
        h1Var.R = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = h1Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        h1Var.d.setAlpha(0.0f);
        h1Var.d.setScaleX(0.1f);
        h1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(h1Var.b, h1Var.d, h1Var.c);
        h1Var.b.addView(h1Var.d, h1Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(bs.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new c1(h1Var, 0));
        animatorSet.start();
        h1Var.i(false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        rf.d dVar = h1Var.O;
        if (dVar != null) {
            dVar.c();
            h1Var.O = null;
        }
        if (activity == null || uf.b.a(activity) != 1) {
            return;
        }
        rf.c cVar = new rf.c(activity, h1Var);
        cVar.c = "pip-rtmp-video";
        cVar.e = 1;
        cVar.d = AndroidUtilities.dp(10.0f);
        cVar.j = h1Var.d;
        cVar.k = h1Var.f.getPlaceholderView();
        h1Var.O = cVar.a();
    }

    @Override // tf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        q2 q2Var = this.f;
        if (q2Var != null) {
            q2Var.d.clearFirstFrame();
        }
        i(true);
        this.a0 = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // tf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        rf.d dVar = this.O;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.O.h.a).width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.O.h.a).height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.a0 = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        q2 q2Var = this.Z;
        if (q2Var != null) {
            q2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override // tf.a
    public final Bitmap c() {
        q2 q2Var = this.Z;
        if (q2Var == null || !q2Var.d.isAvailable()) {
            return null;
        }
        return this.Z.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i(false);
        }
    }

    @Override // tf.a
    public final Bitmap e() {
        q2 q2Var = this.f;
        if (q2Var == null || !q2Var.d.isAvailable()) {
            return null;
        }
        return this.f.d.getBitmap();
    }

    @Override // tf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // tf.a
    public final View h() {
        q2 q2Var = new q2(this.f.getContext(), false, false, false, false);
        this.Z = q2Var;
        q2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        q2 q2Var2 = this.Z;
        q2Var2.a0 = 0;
        q2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d1(this));
        View view = this.Z.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Z;
    }

    public final void i(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z11 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z10 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.y);
                }
                q2 q2Var = this.Z;
                if (q2Var == null) {
                    q2Var = this.f;
                }
                this.y = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(q2Var.d, this.y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.y, q2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    int d = user != null ? h9.d(user.id) : i0.a.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int d10 = chat != null ? h9.d(chat.id) : i0.a.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d10, -16777216), i0.a.f(0.4f, d10, -16777216)}), null, chat, 0);
                }
                this.v = groupCallParticipant3;
            }
        } else if (this.v != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.v, false);
            }
            this.v = null;
        }
        if (!this.x || (groupCallParticipant = this.v) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z11 = true;
        }
        if (this.w != z11) {
            this.s.animate().cancel();
            ViewPropertyAnimator duration = this.s.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L);
            bs bsVar = bs.f;
            duration.setInterpolator(bsVar).start();
            this.r.animate().cancel();
            this.r.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(bsVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(bsVar).start();
            this.w = z11;
        }
        if (this.M == m() * this.P && this.N == l() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int m10 = (int) (m() * this.P);
        this.M = m10;
        layoutParams.width = m10;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int l4 = (int) (l() * this.P);
        this.N = l4;
        layoutParams2.height = l4;
        AndroidUtilities.updateViewLayout(this.b, this.d, this.c);
        o1.k kVar = this.S;
        float f7 = this.Q;
        kVar.b = f7;
        kVar.c = true;
        kVar.u.i = a1.g.B(m(), this.P, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (m() * this.P)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.S.h();
        o1.k kVar2 = this.T;
        kVar2.b = this.R;
        kVar2.c = true;
        kVar2.u.i = w7.r.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
        this.T.h();
    }

    public final float k() {
        float f7;
        if (this.U == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f10 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f10 != 0.0f) {
                    f7 = 1.0f / f10;
                    this.U = Float.valueOf(f7);
                    Point point = AndroidUtilities.displaySize;
                    this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = AndroidUtilities.displaySize;
            this.a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.U.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float min;
        float f7;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    public final void o(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.L = duration;
        duration.setInterpolator(bs.f);
        this.L.addUpdateListener(new i6(this, 10));
        this.L.addListener(new c1(this, 1));
        this.L.start();
    }

    @Override // tf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // tf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
