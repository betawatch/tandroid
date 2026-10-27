package org.telegram.ui.Components.voip;

import a8.ee;
import a8.fg;
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
import bi.cc;
import fi.e4;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.sa1;
import org.telegram.ui.Components.y9;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i1 implements NotificationCenter.NotificationCenterDelegate, uf.a {
    public static final qw0 b0 = new qw0(new sa1(), new c1(0));
    public static final qw0 c0 = new qw0(new c1(1), new c1(2));
    public static final i1 d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public jg.s0 G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public sf.d O;
    public float P;
    public float Q;
    public float R;
    public o1.j S;
    public o1.j T;
    public Float U;
    public boolean V;
    public boolean W;
    public k2.c X;
    public fg Y;
    public t2 Z;
    public float a;
    public boolean a0;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.e d;
    public bh.p e;
    public t2 f;
    public FrameLayout h;
    public h n;
    public y9 r;
    public cc s;
    public TLRPC.GroupCallParticipant v;
    public boolean w;
    public boolean x;
    public boolean y;

    static {
        i1 i1Var = new i1();
        i1Var.a = 1.4f;
        i1Var.n = new h();
        i1Var.w = true;
        i1Var.P = 1.0f;
        i1Var.X = new k2.c(i1Var, 17);
        d0 = i1Var;
    }

    public static void j() {
        i1 i1Var = d0;
        if (i1Var.V) {
            i1Var.V = false;
            AndroidUtilities.runOnUIThread(new k5(23), 100L);
            i1Var.E.getNotificationCenter().removeObserver(i1Var, NotificationCenter.groupCallUpdated);
            i1Var.E.getNotificationCenter().removeObserver(i1Var, NotificationCenter.applyGroupCallVisibleParticipants);
            NotificationCenter.getGlobalInstance().removeObserver(i1Var, NotificationCenter.didEndCall);
            ValueAnimator valueAnimator = i1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i1Var.W) {
                AndroidUtilities.cancelRunOnUIThread(i1Var.X);
                i1Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(ds.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new f1(i1Var));
            animatorSet.start();
            sf.d dVar = i1Var.O;
            if (dVar != null) {
                dVar.c();
                i1Var.O = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    public static void n(Activity activity) {
        i1 i1Var = d0;
        i1Var.getClass();
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || i1Var.V) {
            return;
        }
        i1Var.V = true;
        AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
        i1Var.E = accountInstance;
        accountInstance.getNotificationCenter().addObserver(i1Var, NotificationCenter.groupCallUpdated);
        i1Var.E.getNotificationCenter().addObserver(i1Var, NotificationCenter.applyGroupCallVisibleParticipants);
        NotificationCenter.getGlobalInstance().addObserver(i1Var, NotificationCenter.didEndCall);
        i1Var.M = i1Var.m();
        i1Var.N = i1Var.l();
        i1Var.P = 1.0f;
        i1Var.K = false;
        o1.j jVar = new o1.j(i1Var, b0);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.u = kVar;
        i1Var.S = jVar;
        o1.j jVar2 = new o1.j(i1Var, c0);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.u = kVar2;
        i1Var.T = jVar2;
        Activity activity2 = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        int i10 = 2;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new ng.b(i1Var, i10));
        i1Var.F = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        i1Var.F.setStylusScaleEnabled(false);
        i1Var.G = new jg.s0(activity2, new g1(i1Var, scaledTouchSlop));
        i1Var.e = new bh.p(i1Var, activity2);
        org.telegram.ui.e eVar = new org.telegram.ui.e(i1Var, activity2, i10);
        i1Var.d = eVar;
        eVar.addView(i1Var.e, kb1.g(-1.0f, -1));
        i1Var.e.setOutlineProvider(new ag.v0(19));
        i1Var.e.setClipToOutline(true);
        f7.i(y6.gg, i1Var.e, null);
        y9 y9Var = new y9(activity2);
        i1Var.r = y9Var;
        i1Var.e.addView(y9Var, kb1.g(-1.0f, -1));
        t2 t2Var = new t2(activity2, false, false, false, false);
        i1Var.f = t2Var;
        t2Var.setAlpha(0.0f);
        i1Var.f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = i1Var.f;
        t2Var2.a0 = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        i1Var.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new h1(i1Var));
        i1Var.e.addView(i1Var.f, kb1.g(-1.0f, -1));
        cc ccVar = new cc(i1Var, activity2, 28);
        i1Var.s = ccVar;
        i1Var.e.addView(ccVar, kb1.g(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(activity2);
        i1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(activity2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        i1Var.h.addView(view, kb1.g(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(activity2);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i11 = y6.hg;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        f7.t(imageView, i11, null, mode);
        int i12 = y6.i6;
        imageView.setBackground(y6.g0(y6.x0(null, i12, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        int i13 = 15;
        imageView.setOnClickListener(new bh.f(i13));
        float f7 = 38;
        float f10 = 4;
        i1Var.h.addView(imageView, kb1.h(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        f7.t(imageView2, i11, null, mode);
        imageView2.setBackground(y6.g0(y6.x0(null, i12, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new ig.d0(activity2, i13));
        i1Var.h.addView(imageView2, kb1.h(38, f7, 5, 0.0f, f10, 48, 0.0f));
        i1Var.e.addView(i1Var.h, kb1.g(-1.0f, -1));
        i1Var.b = (WindowManager) activity2.getSystemService("window");
        WindowManager.LayoutParams b10 = vf.b.b(activity2, false);
        i1Var.c = b10;
        int i14 = i1Var.M;
        b10.width = i14;
        b10.height = i1Var.N;
        float dp2 = (AndroidUtilities.displaySize.x - i14) - AndroidUtilities.dp(16.0f);
        i1Var.Q = dp2;
        b10.x = (int) dp2;
        WindowManager.LayoutParams layoutParams = i1Var.c;
        float dp3 = (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f);
        i1Var.R = dp3;
        layoutParams.y = (int) dp3;
        WindowManager.LayoutParams layoutParams2 = i1Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        i1Var.d.setAlpha(0.0f);
        i1Var.d.setScaleX(0.1f);
        i1Var.d.setScaleY(0.1f);
        AndroidUtilities.setPreferredMaxRefreshRate(i1Var.b, i1Var.d, i1Var.c);
        i1Var.b.addView(i1Var.d, i1Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(ds.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new d1(i1Var, 0));
        animatorSet.start();
        i1Var.i(false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        sf.d dVar = i1Var.O;
        if (dVar != null) {
            dVar.c();
            i1Var.O = null;
        }
        if (activity == null || vf.b.a(activity) != 1) {
            return;
        }
        sf.c cVar = new sf.c(activity, i1Var);
        cVar.c = "pip-rtmp-video";
        cVar.e = 1;
        cVar.d = AndroidUtilities.dp(10.0f);
        cVar.j = i1Var.d;
        cVar.k = i1Var.f.getPlaceholderView();
        i1Var.O = cVar.a();
    }

    @Override // uf.a
    public final void a(fg fgVar) {
        this.Y = fgVar;
        t2 t2Var = this.f;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        i(true);
        this.a0 = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // uf.a
    public final void b(fg fgVar) {
        this.Y = fgVar;
        sf.d dVar = this.O;
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
        t2 t2Var = this.Z;
        if (t2Var != null) {
            t2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override // uf.a
    public final Bitmap c() {
        t2 t2Var = this.Z;
        if (t2Var == null || !t2Var.d.isAvailable()) {
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

    @Override // uf.a
    public final Bitmap e() {
        t2 t2Var = this.f;
        if (t2Var == null || !t2Var.d.isAvailable()) {
            return null;
        }
        return this.f.d.getBitmap();
    }

    @Override // uf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // uf.a
    public final View h() {
        t2 t2Var = new t2(this.f.getContext(), false, false, false, false);
        this.Z = t2Var;
        t2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        t2 t2Var2 = this.Z;
        t2Var2.a0 = 0;
        t2Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new e1(this));
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
                t2 t2Var = this.Z;
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
                    int d = user != null ? j9.d(user.id) : i0.a.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int d10 = chat != null ? j9.d(chat.id) : i0.a.f(0.2f, -16777216, -1);
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
            ds dsVar = ds.f;
            duration.setInterpolator(dsVar).start();
            this.r.animate().cancel();
            this.r.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(dsVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(dsVar).start();
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
        o1.j jVar = this.S;
        float f7 = this.Q;
        jVar.b = f7;
        jVar.c = true;
        jVar.u.i = a1.g.C(m(), this.P, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (m() * this.P)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.S.h();
        o1.j jVar2 = this.T;
        jVar2.b = this.R;
        jVar2.c = true;
        jVar2.u.i = ee.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
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
        duration.setInterpolator(ds.f);
        this.L.addUpdateListener(new e4(this, 13));
        this.L.addListener(new d1(this, 1));
        this.L.start();
    }

    @Override // uf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // uf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
