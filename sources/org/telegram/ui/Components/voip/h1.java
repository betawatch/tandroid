package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Property;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import oh.f5;
import oh.t3;
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
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h1 implements NotificationCenter.NotificationCenterDelegate, ef.a {
    public static final jv0 Y = new jv0(new mh0(14), new mh0(15));
    public static final jv0 Z = new jv0(new mh0(16), new mh0(17));
    public static final h1 a0;
    public AccountInstance B;
    public ScaleGestureDetector C;
    public org.telegram.ui.Cells.f1 D;
    public boolean E;
    public boolean F;
    public View G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public cf.f L;
    public float M;
    public float N;
    public float O;
    public o1.j P;
    public o1.j Q;
    public Float R;
    public boolean S;
    public boolean T;
    public t3 U;
    public c2.p V;
    public t2 W;
    public boolean X;
    public float a;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.g d;
    public ag.l e;
    public t2 f;
    public FrameLayout h;
    public h n;
    public p9 r;
    public fg.h0 s;
    public TLRPC.GroupCallParticipant v;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        h1 h1Var = new h1();
        h1Var.a = 1.4f;
        h1Var.n = new h();
        h1Var.w = true;
        h1Var.M = 1.0f;
        h1Var.U = new t3(h1Var, 19);
        a0 = h1Var;
    }

    public static void j() {
        h1 h1Var = a0;
        if (h1Var.S) {
            h1Var.S = false;
            AndroidUtilities.runOnUIThread(new jc(18), 100L);
            h1Var.B.getNotificationCenter().removeObserver(h1Var, NotificationCenter.groupCallUpdated);
            h1Var.B.getNotificationCenter().removeObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(h1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = h1Var.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (h1Var.T) {
                AndroidUtilities.cancelRunOnUIThread(h1Var.U);
                h1Var.T = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(pr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new e1(h1Var));
            animatorSet.start();
            cf.f fVar = h1Var.L;
            if (fVar != null) {
                fVar.c();
                h1Var.L = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    public static void n(Activity activity) {
        h1 h1Var = a0;
        h1Var.getClass();
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || h1Var.S) {
            return;
        }
        int i10 = 1;
        h1Var.S = true;
        AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
        h1Var.B = accountInstance;
        accountInstance.getNotificationCenter().addObserver(h1Var, NotificationCenter.groupCallUpdated);
        h1Var.B.getNotificationCenter().addObserver(h1Var, NotificationCenter.applyGroupCallVisibleParticipants);
        NotificationCenter.getGlobalInstance().addObserver(h1Var, NotificationCenter.didEndCall);
        h1Var.J = h1Var.m();
        h1Var.K = h1Var.l();
        h1Var.M = 1.0f;
        h1Var.H = false;
        o1.j jVar = new o1.j(h1Var, Y);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.u = kVar;
        h1Var.P = jVar;
        o1.j jVar2 = new o1.j(h1Var, Z);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.u = kVar2;
        h1Var.Q = jVar2;
        Activity activity2 = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new jg0(h1Var, i10));
        h1Var.C = scaleGestureDetector;
        int i11 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i11 >= 23) {
            h1Var.C.setStylusScaleEnabled(false);
        }
        h1Var.D = new org.telegram.ui.Cells.f1(activity2, new f1(h1Var, scaledTouchSlop));
        h1Var.e = new ag.l(h1Var, activity2);
        org.telegram.ui.g gVar = new org.telegram.ui.g(h1Var, activity2, 2);
        h1Var.d = gVar;
        gVar.addView(h1Var.e, c6.c(-1.0f, -1));
        h1Var.e.setOutlineProvider(new hg.j1(13));
        h1Var.e.setClipToOutline(true);
        h1Var.e.setBackgroundColor(k6.w0(null, k6.gg, false));
        p9 p9Var = new p9(activity2);
        h1Var.r = p9Var;
        h1Var.e.addView(p9Var, c6.c(-1.0f, -1));
        t2 t2Var = new t2(activity2, false, false, false, false);
        h1Var.f = t2Var;
        t2Var.setAlpha(0.0f);
        h1Var.f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = h1Var.f;
        t2Var2.U = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        h1Var.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new g1(h1Var));
        h1Var.e.addView(h1Var.f, c6.c(-1.0f, -1));
        fg.h0 h0Var = new fg.h0(h1Var, activity2, 22);
        h1Var.s = h0Var;
        h1Var.e.addView(h0Var, c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(activity2);
        h1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(activity2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        h1Var.h.addView(view, c6.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(activity2);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = k6.hg;
        imageView.setColorFilter(k6.w0(null, i12, false));
        int i13 = k6.i6;
        imageView.setBackground(k6.f0(k6.w0(null, i13, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new eg.m(15));
        float f10 = 38;
        float f11 = 4;
        h1Var.h.addView(imageView, c6.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(k6.w0(null, i12, false));
        imageView2.setBackground(k6.f0(k6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new o(activity2, 3));
        h1Var.h.addView(imageView2, c6.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        h1Var.e.addView(h1Var.h, c6.c(-1.0f, -1));
        h1Var.b = (WindowManager) activity2.getSystemService("window");
        WindowManager.LayoutParams b10 = ff.d.b(activity2, false);
        h1Var.c = b10;
        int i14 = h1Var.J;
        b10.width = i14;
        b10.height = h1Var.K;
        float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        h1Var.N = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = h1Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f);
        h1Var.O = dp3;
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
        animatorSet.setInterpolator(pr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(h1Var.d, (Property<org.telegram.ui.g, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new c1(h1Var, 0));
        animatorSet.start();
        h1Var.i(false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        cf.f fVar = h1Var.L;
        if (fVar != null) {
            fVar.c();
            h1Var.L = null;
        }
        if (activity == null || ff.d.a(activity) != 1) {
            return;
        }
        cf.e eVar = new cf.e(activity, h1Var);
        eVar.c = "pip-rtmp-video";
        eVar.e = 1;
        eVar.d = AndroidUtilities.dp(10.0f);
        eVar.j = h1Var.d;
        eVar.k = h1Var.f.getPlaceholderView();
        h1Var.L = eVar.a();
    }

    @Override // ef.a
    public final void a(c2.p pVar) {
        this.V = pVar;
        cf.f fVar = this.L;
        if (fVar != null && fVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.L.h.a.width();
            this.J = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.L.h.a.height();
            this.K = height;
            layoutParams2.height = height;
        }
        this.X = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        t2 t2Var = this.W;
        if (t2Var != null) {
            t2Var.d.release();
            this.W = null;
        }
        i(true);
    }

    @Override // ef.a
    public final Bitmap b() {
        t2 t2Var = this.W;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.W.d.getBitmap();
    }

    @Override // ef.a
    public final Bitmap d() {
        t2 t2Var = this.f;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.f.d.getBitmap();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didEndCall) {
            j();
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            i(false);
        }
    }

    @Override // ef.a
    public final void e(c2.p pVar) {
        this.V = pVar;
        t2 t2Var = this.f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.X = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // ef.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // ef.a
    public final View h() {
        t2 t2Var = new t2(this.f.getContext(), false, false, false, false);
        this.W = t2Var;
        t2Var.d.setOpaque(false);
        this.W.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.W;
        t2Var2.U = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        this.W.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d1(this));
        View view = this.W.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.W;
    }

    public final void i(boolean z4) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z10 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).participant;
            if (z4 || (groupCallParticipant2 = this.v) == null || MessageObject.getPeerId(groupCallParticipant2.peer) != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                if (this.v != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.v, this.y);
                }
                t2 t2Var = this.W;
                if (t2Var == null) {
                    t2Var = this.f;
                }
                this.y = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(t2Var.d, this.y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.y, t2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    int d = user != null ? z8.d(user.id) : i0.a.d(0.2f, -16777216, -1);
                    this.r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int d10 = chat != null ? z8.d(chat.id) : i0.a.d(0.2f, -16777216, -1);
                    this.r.getImageReceiver().setImage(forChat, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), null, chat, 0);
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
            z10 = true;
        }
        if (this.w != z10) {
            this.s.animate().cancel();
            ViewPropertyAnimator duration = this.s.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L);
            pr prVar = pr.f;
            duration.setInterpolator(prVar).start();
            this.r.animate().cancel();
            this.r.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(prVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(z10 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(prVar).start();
            this.w = z10;
        }
        if (this.J == m() * this.M && this.K == l() * this.M) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int m9 = (int) (m() * this.M);
        this.J = m9;
        layoutParams.width = m9;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int l10 = (int) (l() * this.M);
        this.K = l10;
        layoutParams2.height = l10;
        AndroidUtilities.updateViewLayout(this.b, this.d, this.c);
        o1.j jVar = this.P;
        float f10 = this.N;
        jVar.b = f10;
        jVar.c = true;
        jVar.u.i = android.support.v4.media.a.d(m(), this.M, 2.0f, f10) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (m() * this.M)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.P.f();
        o1.j jVar2 = this.Q;
        jVar2.b = this.O;
        jVar2.c = true;
        jVar2.u.i = k7.o.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.M)) - AndroidUtilities.dp(16.0f));
        this.Q.f();
    }

    public final float k() {
        float f10;
        if (this.R == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.isEmpty()) {
                float f11 = VoIPService.getSharedInstance().groupCall.visibleVideoParticipants.get(0).aspectRatio;
                if (f11 != 0.0f) {
                    f10 = 1.0f / f11;
                    this.R = Float.valueOf(f10);
                    Point point = AndroidUtilities.displaySize;
                    this.a = (Math.min(point.x, point.y) - AndroidUtilities.dp(32.0f)) / m();
                }
            }
            f10 = 0.5625f;
            this.R = Float.valueOf(f10);
            Point point2 = AndroidUtilities.displaySize;
            this.a = (Math.min(point2.x, point2.y) - AndroidUtilities.dp(32.0f)) / m();
        }
        return this.R.floatValue();
    }

    public final int l() {
        return (int) (k() * m());
    }

    public final int m() {
        float min;
        float f10;
        if (k() >= 1.0f) {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = AndroidUtilities.displaySize;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    public final void o(boolean z4) {
        ValueAnimator duration = ValueAnimator.ofFloat(z4 ? 0.0f : 1.0f, z4 ? 1.0f : 0.0f).setDuration(200L);
        this.I = duration;
        duration.setInterpolator(pr.f);
        this.I.addUpdateListener(new f5(this, 5));
        this.I.addListener(new c1(this, 1));
        this.I.start();
    }

    @Override // ef.a
    public final /* synthetic */ void c(Canvas canvas) {
    }

    @Override // ef.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
