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
import b8.be;
import b8.cg;
import b8.mf;
import gi.j3;
import org.telegram.messenger.ac;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.s3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y00;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 implements cs, wf.a {
    public static final kt0 c0 = new kt0(new lf0(16), new lf0(17));
    public static final kt0 d0 = new kt0(new lf0(18), new lf0(19));
    public static final s0 e0;
    public boolean E;
    public org.telegram.messenger.c F;
    public ScaleGestureDetector G;
    public y00 H;
    public boolean I;
    public boolean J;
    public View K;
    public boolean L;
    public ValueAnimator M;
    public int N;
    public int O;
    public uf.d P;
    public float Q;
    public float R;
    public float S;
    public q1.g T;
    public q1.g U;
    public Float V;
    public boolean W;
    public boolean X;
    public d4 Y;
    public cg Z;
    public float a;
    public z1 a0;
    public WindowManager b;
    public boolean b0;
    public WindowManager.LayoutParams c;
    public org.telegram.ui.e d;
    public ai.c0 e;
    public z1 f;
    public FrameLayout h;
    public g n;
    public k9 r;
    public r0 s;
    public TLRPC.GroupCallParticipant w;
    public boolean x;
    public boolean y;

    static {
        s0 s0Var = new s0();
        s0Var.a = 1.4f;
        s0Var.n = new g();
        s0Var.x = true;
        s0Var.Q = 1.0f;
        s0Var.Y = new d4(s0Var, 8);
        e0 = s0Var;
    }

    public static void b() {
        s0 s0Var = e0;
        if (s0Var.W) {
            s0Var.W = false;
            org.telegram.messenger.g0.i3(new go(13), 100L);
            hs.f(s0Var.F.a).n(s0Var, hs.w2);
            hs.f(s0Var.F.a).n(s0Var, hs.B2);
            hs.e().n(s0Var, hs.D2);
            ValueAnimator valueAnimator = s0Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (s0Var.X) {
                org.telegram.messenger.g0.r(s0Var.Y);
                s0Var.X = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            animatorSet.setInterpolator(xq.f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(s0Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(s0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(s0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 0.1f));
            animatorSet.addListener(new o0(s0Var));
            animatorSet.start();
            uf.d dVar = s0Var.P;
            if (dVar != null) {
                dVar.c();
                s0Var.P = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.content.Context] */
    public static void h(Activity activity) {
        s0 s0Var = e0;
        s0Var.getClass();
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || s0Var.W) {
            return;
        }
        int i3 = 1;
        s0Var.W = true;
        org.telegram.messenger.c cVar = VoIPService.getSharedInstance().groupCall.C;
        s0Var.F = cVar;
        hs.f(cVar.a).b(s0Var, hs.w2);
        hs.f(s0Var.F.a).b(s0Var, hs.B2);
        hs.e().b(s0Var, hs.D2);
        s0Var.N = s0Var.f();
        s0Var.O = s0Var.e();
        s0Var.Q = 1.0f;
        int i10 = 0;
        s0Var.L = false;
        q1.g gVar = new q1.g(s0Var, c0);
        q1.h hVar = new q1.h();
        hVar.a(0.75f);
        hVar.b(650.0f);
        gVar.m = hVar;
        s0Var.T = gVar;
        q1.g gVar2 = new q1.g(s0Var, d0);
        q1.h hVar2 = new q1.h();
        hVar2.a(0.75f);
        hVar2.b(650.0f);
        gVar2.m = hVar2;
        s0Var.U = gVar2;
        Activity activity2 = activity != null ? activity : org.telegram.messenger.t0.b;
        int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new ee0(s0Var, i3));
        s0Var.G = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        s0Var.G.setStylusScaleEnabled(false);
        s0Var.H = new y00(activity2, new p0(s0Var, scaledTouchSlop));
        s0Var.e = new ai.c0(s0Var, activity2);
        org.telegram.ui.e eVar = new org.telegram.ui.e(2, activity2, s0Var);
        s0Var.d = eVar;
        eVar.addView(s0Var.e, mf.c(-1.0f, -1));
        s0Var.e.setOutlineProvider(new cg.p0(20));
        s0Var.e.setClipToOutline(true);
        r6.i(k6.Ug, s0Var.e, null);
        k9 k9Var = new k9(activity2);
        s0Var.r = k9Var;
        s0Var.e.addView(k9Var, mf.c(-1.0f, -1));
        z1 z1Var = new z1(activity2, false, false, false, false);
        s0Var.f = z1Var;
        z1Var.setAlpha(0.0f);
        s0Var.f.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        z1 z1Var2 = s0Var.f;
        z1Var2.b0 = 0;
        z1Var2.d.setRotateTextureWithScreen(true);
        s0Var.f.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new q0(s0Var));
        s0Var.e.addView(s0Var.f, mf.c(-1.0f, -1));
        r0 r0Var = new r0(i10, activity2, s0Var);
        s0Var.s = r0Var;
        s0Var.e.addView(r0Var, mf.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(activity2);
        s0Var.h = frameLayout;
        frameLayout.setAlpha(0.0f);
        View view = new View(activity2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1140850688, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        view.setBackground(gradientDrawable);
        s0Var.h.addView(view, mf.c(-1.0f, -1));
        int L = org.telegram.messenger.g0.L(8.0f);
        ImageView e10 = org.telegram.messenger.camera.q.e(activity2, R.drawable.pip_video_close);
        int i11 = k6.Vg;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        r6.t(e10, i11, null, mode);
        int i12 = k6.i6;
        e10.setBackground(k6.h0(k6.x0(null, i12, false), 1, -1));
        e10.setPadding(L, L, L, L);
        e10.setOnClickListener(new ai.t(18));
        float f10 = 38;
        float f11 = 4;
        s0Var.h.addView(e10, mf.d(38, f10, 5, 0.0f, f11, f11, 0.0f));
        ImageView imageView = new ImageView(activity2);
        imageView.setImageResource(R.drawable.pip_video_expand);
        r6.t(imageView, i11, null, mode);
        imageView.setBackground(k6.h0(k6.x0(null, i12, false), 1, -1));
        imageView.setPadding(L, L, L, L);
        imageView.setOnClickListener(new ii.m(activity2, 23));
        s0Var.h.addView(imageView, mf.d(38, f10, 5, 0.0f, f11, 48, 0.0f));
        s0Var.e.addView(s0Var.h, mf.c(-1.0f, -1));
        s0Var.b = (WindowManager) activity2.getSystemService("window");
        WindowManager.LayoutParams b10 = xf.b.b(activity2, false);
        s0Var.c = b10;
        int i13 = s0Var.N;
        b10.width = i13;
        b10.height = s0Var.O;
        Point point = org.telegram.messenger.g0.q;
        float L2 = (point.x - i13) - org.telegram.messenger.g0.L(16.0f);
        s0Var.R = L2;
        b10.x = (int) L2;
        WindowManager.LayoutParams layoutParams = s0Var.c;
        float L3 = (point.y - s0Var.O) - org.telegram.messenger.g0.L(16.0f);
        s0Var.S = L3;
        layoutParams.y = (int) L3;
        WindowManager.LayoutParams layoutParams2 = s0Var.c;
        layoutParams2.dimAmount = 0.0f;
        layoutParams2.flags = 520;
        s0Var.d.setAlpha(0.0f);
        s0Var.d.setScaleX(0.1f);
        s0Var.d.setScaleY(0.1f);
        org.telegram.messenger.g0.y3(s0Var.b, s0Var.d, s0Var.c);
        s0Var.b.addView(s0Var.d, s0Var.c);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(xq.f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(s0Var.d, (Property<org.telegram.ui.e, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(s0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(s0Var.d, (Property<org.telegram.ui.e, Float>) View.SCALE_Y, 1.0f));
        animatorSet.addListener(new m0(s0Var, 0));
        animatorSet.start();
        s0Var.a(false);
        hs.e().k(hs.F2, new Object[0]);
        uf.d dVar = s0Var.P;
        if (dVar != null) {
            dVar.c();
            s0Var.P = null;
        }
        if (activity == null || xf.b.a(activity) != 1) {
            return;
        }
        uf.c cVar2 = new uf.c(activity, s0Var);
        cVar2.c = "pip-rtmp-video";
        cVar2.e = 1;
        cVar2.d = org.telegram.messenger.g0.L(10.0f);
        cVar2.j = s0Var.d;
        cVar2.k = s0Var.f.getPlaceholderView();
        s0Var.P = cVar2.a();
    }

    public final void a(boolean z10) {
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        boolean z11 = false;
        if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().groupCall != null && !VoIPService.getSharedInstance().groupCall.f.isEmpty()) {
            TLRPC.GroupCallParticipant groupCallParticipant3 = ((s3) VoIPService.getSharedInstance().groupCall.f.get(0)).a;
            if (z10 || (groupCallParticipant2 = this.w) == null || zi.C1(groupCallParticipant2.peer) != zi.C1(groupCallParticipant3.peer)) {
                if (this.w != null) {
                    VoIPService.getSharedInstance().removeRemoteSink(this.w, this.E);
                }
                z1 z1Var = this.a0;
                if (z1Var == null) {
                    z1Var = this.f;
                }
                this.E = groupCallParticipant3.presentation != null;
                if (groupCallParticipant3.self) {
                    VoIPService.getSharedInstance().setSinks(z1Var.d, this.E, null);
                } else {
                    VoIPService.getSharedInstance().addRemoteSink(groupCallParticipant3, this.E, z1Var.d, null);
                }
                int i3 = VoIPService.getSharedInstance().groupCall.C.a;
                hp s12 = hp.s1(i3);
                long C1 = zi.C1(groupCallParticipant3.peer);
                if (C1 > 0) {
                    TLRPC.User a22 = s12.a2(Long.valueOf(C1));
                    ac l10 = ac.l(i3, 1, a22);
                    int d = a22 != null ? u8.d(a22.id) : i0.a.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().q0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, a22, 0);
                } else {
                    TLRPC.Chat M0 = s12.M0(Long.valueOf(-C1));
                    ac a10 = ac.a(1, M0);
                    int d10 = M0 != null ? u8.d(M0.id) : i0.a.f(0.2f, -16777216, -1);
                    this.r.getImageReceiver().q0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d10, -16777216), i0.a.f(0.4f, d10, -16777216)}), null, M0, 0);
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
            xq xqVar = xq.f;
            duration.setInterpolator(xqVar).start();
            this.r.animate().cancel();
            this.r.animate().alpha(z11 ? 1.0f : 0.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.f.animate().cancel();
            this.f.animate().alpha(z11 ? 0.0f : 1.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.x = z11;
        }
        if (this.N == f() * this.Q && this.O == e() * this.Q) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        int f10 = (int) (f() * this.Q);
        this.N = f10;
        layoutParams.width = f10;
        WindowManager.LayoutParams layoutParams2 = this.c;
        int e10 = (int) (e() * this.Q);
        this.O = e10;
        layoutParams2.height = e10;
        org.telegram.messenger.g0.T3(this.b, this.d, this.c);
        q1.g gVar = this.T;
        float f11 = this.R;
        gVar.b = f11;
        gVar.c = true;
        gVar.m.i = a1.g.e(f(), this.Q, 2.0f, f11) >= org.telegram.messenger.g0.q.x / 2.0f ? (r5 - (f() * this.Q)) - org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(16.0f);
        this.T.h();
        q1.g gVar2 = this.U;
        gVar2.b = this.S;
        gVar2.c = true;
        gVar2.m.i = be.a(r2, org.telegram.messenger.g0.L(16.0f), (r3.y - (e() * this.Q)) - org.telegram.messenger.g0.L(16.0f));
        this.U.h();
    }

    @Override // wf.a
    public final void c(cg cgVar) {
        this.Z = cgVar;
        z1 z1Var = this.f;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        a(true);
        this.b0 = true;
        this.b.removeView(this.d);
        this.d.invalidate();
    }

    public final float d() {
        float f10;
        if (this.V == null) {
            if (VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().groupCall.f.isEmpty()) {
                float f11 = ((s3) VoIPService.getSharedInstance().groupCall.f.get(0)).c;
                if (f11 != 0.0f) {
                    f10 = 1.0f / f11;
                    this.V = Float.valueOf(f10);
                    Point point = org.telegram.messenger.g0.q;
                    this.a = (Math.min(point.x, point.y) - org.telegram.messenger.g0.L(32.0f)) / f();
                }
            }
            f10 = 0.5625f;
            this.V = Float.valueOf(f10);
            Point point2 = org.telegram.messenger.g0.q;
            this.a = (Math.min(point2.x, point2.y) - org.telegram.messenger.g0.L(32.0f)) / f();
        }
        return this.V.floatValue();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.D2) {
            b();
        } else if (i3 == hs.w2) {
            a(false);
        }
    }

    public final int e() {
        return (int) (d() * f());
    }

    public final int f() {
        float min;
        float f10;
        if (d() >= 1.0f) {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
            f10 = 0.35f;
        } else {
            Point point2 = org.telegram.messenger.g0.q;
            min = Math.min(point2.x, point2.y);
            f10 = 0.6f;
        }
        return (int) (min * f10);
    }

    @Override // wf.a
    public final Bitmap g() {
        z1 z1Var = this.a0;
        if (z1Var == null || !z1Var.d.isAvailable()) {
            return null;
        }
        return this.a0.d.getBitmap();
    }

    public final void j(boolean z10) {
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(200L);
        this.M = duration;
        duration.setInterpolator(xq.f);
        this.M.addUpdateListener(new j3(this, 19));
        this.M.addListener(new m0(this, 1));
        this.M.start();
    }

    @Override // wf.a
    public final Bitmap l() {
        z1 z1Var = this.f;
        if (z1Var == null || !z1Var.d.isAvailable()) {
            return null;
        }
        return this.f.d.getBitmap();
    }

    @Override // wf.a
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // wf.a
    public final View q() {
        z1 z1Var = new z1(this.f.getContext(), false, false, false, false);
        this.a0 = z1Var;
        z1Var.d.setOpaque(false);
        this.a0.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        z1 z1Var2 = this.a0;
        z1Var2.b0 = 0;
        z1Var2.d.setRotateTextureWithScreen(true);
        this.a0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new n0(this));
        View view = this.a0.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.a0;
    }

    @Override // wf.a
    public final void r(cg cgVar) {
        this.Z = cgVar;
        uf.d dVar = this.P;
        if (dVar != null && dVar.h.c()) {
            WindowManager.LayoutParams layoutParams = this.c;
            int width = ((Rect) this.P.h.a).width();
            this.N = width;
            layoutParams.width = width;
            WindowManager.LayoutParams layoutParams2 = this.c;
            int height = ((Rect) this.P.h.a).height();
            this.O = height;
            layoutParams2.height = height;
        }
        this.b0 = false;
        this.b.addView(this.d, this.c);
        this.d.invalidate();
        z1 z1Var = this.a0;
        if (z1Var != null) {
            z1Var.d.release();
            this.a0 = null;
        }
        a(true);
    }

    @Override // wf.a
    public final /* synthetic */ void i(Canvas canvas) {
    }

    @Override // wf.a
    public final /* synthetic */ void m(Canvas canvas) {
    }
}
