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
import bi.d5;
import bi.n7;
import bi.nc;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.webrtc.RendererCommon;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i1 implements NotificationCenter.NotificationCenterDelegate, rf.a {
    public static final sv0 b0 = new sv0(new gp0(11), new gp0(12));
    public static final sv0 c0 = new sv0(new gp0(13), new gp0(14));
    public static final i1 d0;
    public AccountInstance E;
    public ScaleGestureDetector F;
    public l2.h G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public pf.e O;
    public float P;
    public float Q;
    public float R;
    public o1.k S;
    public o1.k T;
    public Float U;
    public boolean V;
    public boolean W;
    public x X;
    public com.google.android.gms.internal.cast.p Y;
    public r2 Z;
    public float a;
    public boolean a0;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.f d;
    public n7 e;
    public r2 f;
    public FrameLayout h;
    public h n;
    public w9 r;
    public nc s;
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
        i1Var.X = new x(i1Var, 1);
        d0 = i1Var;
    }

    public static void j() {
        i1 i1Var = d0;
        if (i1Var.V) {
            i1Var.V = false;
            AndroidUtilities.runOnUIThread(new c30(8), 100L);
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
            animatorSet.setInterpolator(wr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new f1(i1Var));
            animatorSet.start();
            pf.e eVar = i1Var.O;
            if (eVar != null) {
                eVar.c();
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
        o1.k kVar = new o1.k(i1Var, b0);
        o1.l lVar = new o1.l();
        lVar.a(0.75f);
        lVar.b(650.0f);
        kVar.u = lVar;
        i1Var.S = kVar;
        o1.k kVar2 = new o1.k(i1Var, c0);
        o1.l lVar2 = new o1.l();
        lVar2.a(0.75f);
        lVar2.b(650.0f);
        kVar2.u = lVar2;
        i1Var.T = kVar2;
        Activity activity2 = activity != null ? activity : ApplicationLoader.applicationContext;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        int i10 = 2;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new kg.b(i1Var, i10));
        i1Var.F = scaleGestureDetector;
        int i11 = Build.VERSION.SDK_INT;
        scaleGestureDetector.setQuickScaleEnabled(false);
        if (i11 >= 23) {
            i1Var.F.setStylusScaleEnabled(false);
        }
        i1Var.G = new l2.h(activity2, new g1(i1Var, scaledTouchSlop));
        i1Var.e = new n7(i1Var, activity2);
        org.telegram.ui.f fVar = new org.telegram.ui.f(i1Var, activity2, i10);
        i1Var.d = fVar;
        fVar.addView(i1Var.e, a6.c(-1.0f, -1));
        i1Var.e.setOutlineProvider(new bi.g(14));
        i1Var.e.setClipToOutline(true);
        i1Var.e.setBackgroundColor(j6.w0(null, j6.gg, false));
        w9 w9Var = new w9(activity2);
        i1Var.r = w9Var;
        i1Var.e.addView(w9Var, a6.c(-1.0f, -1));
        r2 r2Var = new r2(activity2, false, false, false, false);
        i1Var.f = r2Var;
        r2Var.setAlpha(0.0f);
        i1Var.f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = i1Var.f;
        r2Var2.a0 = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
        i1Var.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new h1(i1Var));
        i1Var.e.addView(i1Var.f, a6.c(-1.0f, -1));
        nc ncVar = new nc(i1Var, activity2, 27);
        i1Var.s = ncVar;
        i1Var.e.addView(ncVar, a6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(activity2);
        i1Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(activity2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        i1Var.h.addView(view, a6.c(-1.0f, -1));
        int dp = AndroidUtilities.dp(8.0f);
        ImageView imageView = new ImageView(activity2);
        imageView.setImageResource(R.drawable.pip_video_close);
        int i12 = j6.hg;
        imageView.setColorFilter(j6.w0(null, i12, false));
        int i13 = j6.i6;
        imageView.setBackground(j6.f0(j6.w0(null, i13, false), 1, -1));
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new d5(12));
        float f7 = 38;
        float f10 = 4;
        i1Var.h.addView(imageView, a6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView2 = new ImageView(activity2);
        imageView2.setImageResource(R.drawable.pip_video_expand);
        imageView2.setColorFilter(j6.w0(null, i12, false));
        imageView2.setBackground(j6.f0(j6.w0(null, i13, false), 1, -1));
        imageView2.setPadding(dp, dp, dp, dp);
        imageView2.setOnClickListener(new ai.u(activity2, 29));
        i1Var.h.addView(imageView2, a6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
        i1Var.e.addView(i1Var.h, a6.c(-1.0f, -1));
        i1Var.b = (WindowManager) activity2.getSystemService("window");
        WindowManager.LayoutParams b10 = sf.c.b(activity2, false);
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
        animatorSet.setInterpolator(wr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.f, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(i1Var.d, (Property<org.telegram.ui.f, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new d1(i1Var, 0));
        animatorSet.start();
        i1Var.i(false);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        pf.e eVar = i1Var.O;
        if (eVar != null) {
            eVar.c();
            i1Var.O = null;
        }
        if (activity == null || sf.c.a(activity) != 1) {
            return;
        }
        pf.d dVar = new pf.d(activity, i1Var);
        dVar.c = "pip-rtmp-video";
        dVar.e = 1;
        dVar.d = AndroidUtilities.dp(10.0f);
        dVar.j = i1Var.d;
        dVar.k = i1Var.f.getPlaceholderView();
        i1Var.O = dVar.a();
    }

    @Override // rf.a
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        r2 r2Var = this.f;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        i(true);
        this.a0 = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    @Override // rf.a
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.Y = pVar;
        pf.e eVar = this.O;
        if (eVar != null && eVar.h.b()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = this.O.h.a.width();
            this.M = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = this.O.h.a.height();
            this.N = height;
            layoutParams2.height = height;
        }
        this.a0 = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        r2 r2Var = this.Z;
        if (r2Var != null) {
            r2Var.d.release();
            this.Z = null;
        }
        i(true);
    }

    @Override // rf.a
    public final Bitmap c() {
        r2 r2Var = this.Z;
        if (r2Var == null || !r2Var.d.isAvailable()) {
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

    @Override // rf.a
    public final Bitmap e() {
        r2 r2Var = this.f;
        if (r2Var == null || !r2Var.d.isAvailable()) {
            return null;
        }
        return this.f.d.getBitmap();
    }

    @Override // rf.a
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // rf.a
    public final View h() {
        r2 r2Var = new r2(this.f.getContext(), false, false, false, false);
        this.Z = r2Var;
        r2Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        r2 r2Var2 = this.Z;
        r2Var2.a0 = 0;
        r2Var2.d.setRotateTextureWithScreen(true);
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
                r2 r2Var = this.Z;
                if (r2Var == null) {
                    r2Var = this.f;
                }
                this.y = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(r2Var.d, this.y, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.y, r2Var.d, null);
                }
                AccountInstance accountInstance = VoIPService.getSharedInstance().groupCall.currentAccount;
                MessagesController messagesController = accountInstance.getMessagesController();
                long peerId = MessageObject.getPeerId(groupCallParticipant3.peer);
                if (peerId > 0) {
                    TLRPC.User user = messagesController.getUser(Long.valueOf(peerId));
                    ImageLocation forUser = ImageLocation.getForUser(accountInstance.getCurrentAccount(), user, 1);
                    int d = user != null ? g9.d(user.id) : i0.a.d(0.2f, -16777216, -1);
                    this.r.getImageReceiver().setImage(forUser, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), null, user, 0);
                } else {
                    TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-peerId));
                    ImageLocation forChat = ImageLocation.getForChat(accountInstance.getCurrentAccount(), chat, 1);
                    int d10 = chat != null ? g9.d(chat.id) : i0.a.d(0.2f, -16777216, -1);
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
            z11 = true;
        }
        if (this.w != z11) {
            this.s.animate().cancel();
            ViewPropertyAnimator duration = this.s.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L);
            wr wrVar = wr.f;
            duration.setInterpolator(wrVar).start();
            this.r.animate().cancel();
            this.r.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(wrVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(wrVar).start();
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
        kVar.u.i = a4.a.A(m(), this.P, 2.0f, f7) >= AndroidUtilities.displaySize.x / 2.0f ? (r3 - (m() * this.P)) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
        this.S.f();
        o1.k kVar2 = this.T;
        kVar2.b = this.R;
        kVar2.c = true;
        kVar2.u.i = w7.q.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - (l() * this.P)) - AndroidUtilities.dp(16.0f));
        this.T.f();
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
        duration.setInterpolator(wr.f);
        this.L.addUpdateListener(new ai.a(this, 18));
        this.L.addListener(new d1(this, 1));
        this.L.start();
    }

    @Override // rf.a
    public final /* synthetic */ void d(Canvas canvas) {
    }

    @Override // rf.a
    public final /* synthetic */ void f(Canvas canvas) {
    }
}
