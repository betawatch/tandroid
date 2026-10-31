package org.telegram.ui.Components.voip;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.us;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.z11;
import org.webrtc.RendererCommon;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s0 implements us, lf.a {
    public static final ou0 b0 = new ou0(new z11(2), new z11(3));
    public static final ou0 c0 = new ou0(new z11(4), new z11(5));
    public static final s0 d0;
    public boolean D;
    public org.telegram.messenger.c E;
    public ScaleGestureDetector F;
    public m2.t G;
    public boolean H;
    public boolean I;
    public View J;
    public boolean K;
    public ValueAnimator L;
    public int M;
    public int N;
    public jf.f O;
    public float P;
    public float Q;
    public float R;
    public o1.j S;
    public o1.j T;
    public Float U;
    public boolean V;
    public boolean W;
    public w5 X;
    public com.google.android.gms.internal.cast.o Y;
    public y1 Z;
    public float a;
    public boolean a0;
    public WindowManager b;
    public WindowManager.LayoutParams c;
    public jf.g d;
    public fg.i e;
    public y1 f;
    public FrameLayout h;
    public g n;
    public g9 r;
    public bi.t0 s;
    public TLRPC.GroupCallParticipant w;
    public boolean x;
    public boolean y;

    static {
        s0 s0Var = new s0();
        s0Var.a = 1.4f;
        s0Var.n = new g();
        s0Var.x = true;
        s0Var.P = 1.0f;
        s0Var.X = new w5(s0Var, 4);
        d0 = s0Var;
    }

    public static void b() {
        s0 s0Var = d0;
        if (s0Var.V) {
            s0Var.V = false;
            org.telegram.messenger.i0.h3(new m0(0), 100L);
            zs.f(s0Var.E.a).n(s0Var, zs.w2);
            zs.f(s0Var.E.a).n(s0Var, zs.B2);
            zs.e().n(s0Var, zs.D2);
            ValueAnimator valueAnimator = s0Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (s0Var.W) {
                org.telegram.messenger.i0.r(s0Var.X);
                s0Var.W = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(gr.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(s0Var.d, (Property<jf.g, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s0Var.d, (Property<jf.g, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(s0Var.d, (Property<jf.g, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new p0(s0Var));
            animatorSet.start();
            jf.f fVar = s0Var.O;
            if (fVar != null) {
                fVar.c();
                s0Var.O = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    public static void h(Activity activity) {
        s0 s0Var = d0;
        s0Var.getClass();
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || s0Var.V) {
            return;
        }
        s0Var.V = true;
        org.telegram.messenger.c cVar = VoIPService.getSharedInstance().groupCall.C;
        s0Var.E = cVar;
        zs.f(cVar.a).b(s0Var, zs.w2);
        zs.f(s0Var.E.a).b(s0Var, zs.B2);
        zs.e().b(s0Var, zs.D2);
        s0Var.M = s0Var.f();
        s0Var.N = s0Var.e();
        s0Var.P = 1.0f;
        s0Var.K = false;
        o1.j jVar = new o1.j(s0Var, b0);
        o1.k kVar = new o1.k();
        kVar.a(0.75f);
        kVar.b(650.0f);
        jVar.m = kVar;
        s0Var.S = jVar;
        o1.j jVar2 = new o1.j(s0Var, c0);
        o1.k kVar2 = new o1.k();
        kVar2.a(0.75f);
        kVar2.b(650.0f);
        jVar2.m = kVar2;
        s0Var.T = jVar2;
        Activity activity2 = activity != null ? activity : org.telegram.messenger.w0.b;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new eg.b(s0Var, 2));
        s0Var.F = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        s0Var.F.setStylusScaleEnabled(false);
        s0Var.G = new m2.t(activity2, new q0(s0Var, scaledTouchSlop));
        s0Var.e = new fg.i(s0Var, activity2);
        jf.g gVar = new jf.g(s0Var, activity2, 3);
        s0Var.d = gVar;
        gVar.addView(s0Var.e, b6.c(-1.0f, -1));
        s0Var.e.setOutlineProvider(new bi.d2(17));
        s0Var.e.setClipToOutline(true);
        a7.i(t6.Ug, s0Var.e, null);
        g9 g9Var = new g9(activity2);
        s0Var.r = g9Var;
        s0Var.e.addView(g9Var, b6.c(-1.0f, -1));
        y1 y1Var = new y1(activity2, false, false, false, false);
        s0Var.f = y1Var;
        y1Var.setAlpha(0.0f);
        s0Var.f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        y1 y1Var2 = s0Var.f;
        y1Var2.a0 = 0;
        y1Var2.d.setRotateTextureWithScreen(true);
        s0Var.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new r0(s0Var));
        s0Var.e.addView(s0Var.f, b6.c(-1.0f, -1));
        bi.t0 t0Var = new bi.t0(s0Var, activity2, 24);
        s0Var.s = t0Var;
        s0Var.e.addView(t0Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(activity2);
        s0Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(activity2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        s0Var.h.addView(view, b6.c(-1.0f, -1));
        int L = org.telegram.messenger.i0.L(8.0f);
        ImageView e = z20.e(activity2, R.drawable.pip_video_close);
        int i10 = t6.Vg;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        a7.t(e, i10, null, mode);
        int i11 = t6.i6;
        e.setBackground(t6.h0(t6.x0(null, i11, false), 1, -1));
        e.setPadding(L, L, L, L);
        e.setOnClickListener(new bh.c(10));
        float f7 = 38;
        float f10 = 4;
        s0Var.h.addView(e, b6.d(38, f7, 5, 0.0f, f10, f10, 0.0f));
        ImageView imageView = new ImageView(activity2);
        imageView.setImageResource(R.drawable.pip_video_expand);
        a7.t(imageView, i10, null, mode);
        imageView.setBackground(t6.h0(t6.x0(null, i11, false), 1, -1));
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new ag.g(activity2, 23));
        s0Var.h.addView(imageView, b6.d(38, f7, 5, 0.0f, f10, 48, 0.0f));
        s0Var.e.addView(s0Var.h, b6.c(-1.0f, -1));
        s0Var.b = (WindowManager) activity2.getSystemService("window");
        WindowManager.LayoutParams b10 = mf.b.b(activity2, false);
        s0Var.c = b10;
        int i12 = s0Var.M;
        b10.width = i12;
        b10.height = s0Var.N;
        Point point = org.telegram.messenger.i0.q;
        float L2 = (point.x - i12) - org.telegram.messenger.i0.L(16.0f);
        s0Var.Q = L2;
        b10.x = (int) L2;
        WindowManager.LayoutParams layoutParams = s0Var.c;
        float L3 = (point.y - s0Var.N) - org.telegram.messenger.i0.L(16.0f);
        s0Var.R = L3;
        layoutParams.y = (int) L3;
        WindowManager.LayoutParams layoutParams2 = s0Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        s0Var.d.setAlpha(0.0f);
        s0Var.d.setScaleX(0.1f);
        s0Var.d.setScaleY(0.1f);
        org.telegram.messenger.i0.x3(s0Var.b, s0Var.d, s0Var.c);
        s0Var.b.addView(s0Var.d, s0Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(gr.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(s0Var.d, (Property<jf.g, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(s0Var.d, (Property<jf.g, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(s0Var.d, (Property<jf.g, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new n0(s0Var, 0));
        animatorSet.start();
        s0Var.a(false);
        zs.e().k(zs.F2, new Object[0]);
        jf.f fVar = s0Var.O;
        if (fVar != null) {
            fVar.c();
            s0Var.O = null;
        }
        if (activity == null || mf.b.a(activity) != 1) {
            return;
        }
        jf.e eVar = new jf.e(activity, s0Var);
        eVar.c = "pip-rtmp-video";
        eVar.e = 1;
        eVar.d = org.telegram.messenger.i0.L(10.0f);
        eVar.j = s0Var.d;
        eVar.k = s0Var.f.getPlaceholderView();
        s0Var.O = eVar.a();
    }

    public final void a(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z11 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.f.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = ((v3) VoIPService.getSharedInstance().groupCall.f.get(0)).a;
            if (z10 || (groupCallParticipant2 = this.w) == null || jj.C1(groupCallParticipant2.peer) != jj.C1(groupCallParticipant3.peer)) {
                if (this.w != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.w, this.D);
                }
                y1 y1Var = this.Z;
                if (y1Var == null) {
                    y1Var = this.f;
                }
                this.D = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(y1Var.d, this.D, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.D, y1Var.d, null);
                }
                int i10 = VoIPService.getSharedInstance().groupCall.C.a;
                vp r12 = vp.r1(i10);
                long C1 = jj.C1(groupCallParticipant3.peer);
                if (C1 > 0) {
                    TLRPC.User Z1 = r12.Z1(Long.valueOf(C1));
                    ic l4 = ic.l(i10, 1, Z1);
                    int d = Z1 != null ? r8.d(Z1.id) : i0.b.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().q0(l4, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, d, -16777216), i0.b.f(0.4f, d, -16777216)}), null, Z1, 0);
                } else {
                    TLRPC.Chat L0 = r12.L0(Long.valueOf(-C1));
                    ic a2 = ic.a(1, L0);
                    int d10 = L0 != null ? r8.d(L0.id) : i0.b.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().q0(a2, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, d10, -16777216), i0.b.f(0.4f, d10, -16777216)}), null, L0, 0);
                }
                this.w = groupCallParticipant3;
            }
        } else if (this.w != null) {
            if (VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().removeRemoteSink(this.w, false);
            }
            this.w = null;
        }
        if (!this.y || (groupCallParticipant = this.w) == null || (((tL_groupCallParticipantVideo = groupCallParticipant.video) == null && groupCallParticipant.presentation == null) || ((tL_groupCallParticipantVideo != null && tL_groupCallParticipantVideo.paused) || ((tL_groupCallParticipantVideo2 = groupCallParticipant.presentation) != null && tL_groupCallParticipantVideo2.paused)))) {
            z11 = true;
        }
        if (this.x != z11) {
            this.s.animate().cancel();
            ViewPropertyAnimator duration = this.s.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L);
            gr grVar = gr.f;
            duration.setInterpolator(grVar).start();
            this.r.animate().cancel();
            this.r.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(grVar).start();
            this.x = z11;
        }
        if (this.M == f() * this.P && this.N == e() * this.P) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int f7 = (int) (f() * this.P);
        this.M = f7;
        layoutParams.width = f7;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int e = (int) (e() * this.P);
        this.N = e;
        layoutParams2.height = e;
        org.telegram.messenger.i0.S3(this.b, this.d, this.c);
        o1.j jVar = this.S;
        float f10 = this.Q;
        jVar.b = f10;
        jVar.c = true;
        jVar.m.i = a1.g.A(f(), this.P, 2.0f, f10) >= org.telegram.messenger.i0.q.x / 2.0f ? (r5 - (f() * this.P)) - org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(16.0f);
        this.S.h();
        o1.j jVar2 = this.T;
        jVar2.b = this.R;
        jVar2.c = true;
        jVar2.m.i = w7.u.a(r2, org.telegram.messenger.i0.L(16.0f), (r3.y - (e() * this.P)) - org.telegram.messenger.i0.L(16.0f));
        this.T.h();
    }

    @Override // lf.a
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.Y = oVar;
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.d.clearFirstFrame();
        }
        a(true);
        this.a0 = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    public final float d() {
        float f7;
        if (this.U == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.f.isEmpty()) {
                float f10 = ((v3) VoIPService.getSharedInstance().groupCall.f.get(0)).c;
                if (f10 != 0.0f) {
                    f7 = 1.0f / f10;
                    this.U = Float.valueOf(f7);
                    Point point = org.telegram.messenger.i0.q;
                    this.a = (Math.min(point.x, point.y) - org.telegram.messenger.i0.L(32.0f)) / f();
                }
            }
            f7 = 0.5625f;
            this.U = Float.valueOf(f7);
            Point point2 = org.telegram.messenger.i0.q;
            this.a = (Math.min(point2.x, point2.y) - org.telegram.messenger.i0.L(32.0f)) / f();
        }
        return this.U.floatValue();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.D2) {
            b();
        } else if (i10 == zs.w2) {
            a(false);
        }
    }

    public final int e() {
        return (int) (d() * f());
    }

    public final int f() {
        float min;
        float f7;
        if (d() >= 1.0f) {
            Point point = org.telegram.messenger.i0.q;
            min = Math.min(point.x, point.y);
            f7 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.i0.q;
            min = Math.min(point2.x, point2.y);
            f7 = 0.6f;
        }
        return (int) (min * f7);
    }

    @Override // lf.a
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.Y = oVar;
        jf.f fVar = this.O;
        if (fVar != null && fVar.h.c()) {
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
        y1 y1Var = this.Z;
        if (y1Var != null) {
            y1Var.d.release();
            this.Z = null;
        }
        a(true);
    }

    @Override // lf.a
    public final Bitmap i() {
        y1 y1Var = this.Z;
        if (y1Var == null || !y1Var.d.isAvailable()) {
            return null;
        }
        return this.Z.d.getBitmap();
    }

    public final void j(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.L = duration;
        duration.setInterpolator(gr.f);
        this.L.addUpdateListener(new bg.k(this, 22));
        this.L.addListener(new n0(this, 1));
        this.L.start();
    }

    @Override // lf.a
    public final Bitmap m() {
        y1 y1Var = this.f;
        if (y1Var == null || !y1Var.d.isAvailable()) {
            return null;
        }
        return this.f.d.getBitmap();
    }

    @Override // lf.a
    public final /* synthetic */ boolean q() {
        return true;
    }

    @Override // lf.a
    public final View r() {
        y1 y1Var = new y1(this.f.getContext(), false, false, false, false);
        this.Z = y1Var;
        y1Var.d.setOpaque(false);
        this.Z.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        y1 y1Var2 = this.Z;
        y1Var2.a0 = 0;
        y1Var2.d.setRotateTextureWithScreen(true);
        this.Z.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new o0(this));
        View view = this.Z.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.Z;
    }

    @Override // lf.a
    public final /* synthetic */ void l(Canvas canvas) {
    }

    @Override // lf.a
    public final /* synthetic */ void n(Canvas canvas) {
    }
}
