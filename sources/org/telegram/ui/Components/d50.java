package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d50 extends j50 {
    public static final /* synthetic */ int K0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public final org.telegram.ui.ll D;
    public float D0;
    public final LinearLayout E;
    public int E0;
    public final vh.x1 F;
    public long F0;
    public final vh.x1 G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final vh.z1 I;
    public final z40 I0;
    public final int[] J;
    public final k2.m0 J0;
    public final Matrix K;
    public final float[] L;
    public final Paint M;
    public final int N;
    public li.x0 O;
    public li.v0 P;
    public li.w0 Q;
    public li.p0 R;
    public lz0 S;
    public org.telegram.messenger.x20 T;
    public c50 U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public ValueAnimator b0;
    public final bi0 c0;
    public bi0 d0;
    public final s40 e;
    public bi0 e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public final int h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final boolean n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final View r;
    public long r0;
    public final b50 s;
    public int s0;
    public Bitmap t0;
    public long u0;
    public float v0;
    public final jl0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final nh.f y;
    public float y0;
    public int z0;

    public d50(Activity activity, s40 s40Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.f = org.telegram.messenger.d20.s0;
        int i10 = 2;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        final int i11 = 0;
        this.I0 = new z40(this, 0);
        this.J0 = new k2.m0(this);
        this.e = s40Var;
        this.h = s40Var.getClassGuid();
        this.n = s40Var.z();
        this.r = s40Var.getFragmentView();
        setWillNotDraw(false);
        vh.z1 z1Var = new vh.z1(activity, null, this, null);
        this.I = z1Var;
        z1Var.o = 0.5f;
        z1Var.n = vh.z1.f(0.5f);
        z1Var.g();
        addView(z1Var.b, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        b50 b50Var = new b50(this, activity);
        this.s = b50Var;
        jl0 jl0Var = new jl0(activity);
        this.w = jl0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        final int i12 = 1;
        nh.f fVar = new nh.f(this, activity, 1);
        fVar.setOpaque(true);
        fVar.setClickable(true);
        fVar.setCameraDistance(org.telegram.messenger.i0.L(8000.0f));
        fVar.setOutlineProvider(new bi.d2(12));
        fVar.setClipToOutline(true);
        this.y = fVar;
        frameLayout.addView(fVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.ll llVar = new org.telegram.ui.ll(this, activity, paint);
        this.D = llVar;
        llVar.setOutlineProvider(new bi.d2(11));
        llVar.setClipToOutline(true);
        frameLayout.addView(llVar, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        jl0Var.addView(frameLayout, w7.b6.d(-1, -1.0f, org.telegram.messenger.zs.E1, 14.0f, 14.0f, 14.0f, 14.0f));
        b50Var.addView(jl0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        int i13 = org.telegram.messenger.i0.v;
        addView(b50Var, new FrameLayout.LayoutParams(i13, i13, 17));
        addView(z1Var.c, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
        addView(linearLayout, w7.b6.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        vh.x1 x1Var = new vh.x1(activity);
        this.F = x1Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        x1Var.setScaleType(scaleType);
        x1Var.setContentDescription(org.telegram.messenger.cd.L0(2131754752, null));
        linearLayout.addView(x1Var, w7.b6.o(44, 44));
        x1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a50
            public final /* synthetic */ d50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                li.w0 w0Var;
                li.p0 p0Var;
                boolean z10;
                li.w0 w0Var2;
                int i14;
                switch (i11) {
                    case 0:
                        d50 d50Var = this.b;
                        li.x0 x0Var = d50Var.O;
                        if (x0Var != null && (w0Var = d50Var.Q) != null && (p0Var = d50Var.R) != null && w0Var.a == 3 && !w0Var.f && !d50Var.n0) {
                            li.q0 q0Var = p0Var.a;
                            li.q0 q0Var2 = li.q0.a;
                            if (q0Var == q0Var2) {
                                q0Var2 = li.q0.b;
                            }
                            x0Var.getClass();
                            li.x0.u();
                            int i15 = x0Var.Z;
                            if (i15 != 7 && i15 != 8 && i15 != 9 && i15 != 10) {
                                if (x0Var.r != q0Var2) {
                                    x0Var.m.b("camera facing requested: " + x0Var.r + " -> " + q0Var2 + ", state=" + i0.a.A(x0Var.Z));
                                    x0Var.r = q0Var2;
                                    int i16 = x0Var.Z;
                                    if (i16 == 3 || i16 == 2) {
                                        x0Var.e();
                                        li.l lVar = x0Var.l;
                                        lVar.F = q0Var2;
                                        Handler handler = lVar.n;
                                        if (!lVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new k2.u(12, lVar, q0Var2));
                                            z10 = true;
                                        }
                                        x0Var.y = z10;
                                    }
                                    x0Var.n();
                                    x0Var.o();
                                }
                                d50Var.c0.M(0);
                                d50Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        d50 d50Var2 = this.b;
                        li.x0 x0Var2 = d50Var2.O;
                        if (x0Var2 != null && (w0Var2 = d50Var2.Q) != null && d50Var2.R != null) {
                            boolean z11 = !w0Var2.g;
                            li.l lVar2 = x0Var2.l;
                            li.x0.u();
                            if (x0Var2.Z == 3 && !x0Var2.y && (i14 = x0Var2.a0) != 1) {
                                x0Var2.w = z11;
                                if (i14 == 3) {
                                    x0Var2.v(z11);
                                    lVar2.T(false);
                                } else {
                                    x0Var2.v(false);
                                    lVar2.T(z11);
                                }
                                x0Var2.o();
                                d50Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        vh.x1 x1Var2 = new vh.x1(activity);
        this.G = x1Var2;
        x1Var2.setScaleType(scaleType);
        linearLayout.addView(x1Var2, w7.b6.o(44, 44));
        x1Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.a50
            public final /* synthetic */ d50 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                li.w0 w0Var;
                li.p0 p0Var;
                boolean z10;
                li.w0 w0Var2;
                int i14;
                switch (i12) {
                    case 0:
                        d50 d50Var = this.b;
                        li.x0 x0Var = d50Var.O;
                        if (x0Var != null && (w0Var = d50Var.Q) != null && (p0Var = d50Var.R) != null && w0Var.a == 3 && !w0Var.f && !d50Var.n0) {
                            li.q0 q0Var = p0Var.a;
                            li.q0 q0Var2 = li.q0.a;
                            if (q0Var == q0Var2) {
                                q0Var2 = li.q0.b;
                            }
                            x0Var.getClass();
                            li.x0.u();
                            int i15 = x0Var.Z;
                            if (i15 != 7 && i15 != 8 && i15 != 9 && i15 != 10) {
                                if (x0Var.r != q0Var2) {
                                    x0Var.m.b("camera facing requested: " + x0Var.r + " -> " + q0Var2 + ", state=" + i0.a.A(x0Var.Z));
                                    x0Var.r = q0Var2;
                                    int i16 = x0Var.Z;
                                    if (i16 == 3 || i16 == 2) {
                                        x0Var.e();
                                        li.l lVar = x0Var.l;
                                        lVar.F = q0Var2;
                                        Handler handler = lVar.n;
                                        if (!lVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new k2.u(12, lVar, q0Var2));
                                            z10 = true;
                                        }
                                        x0Var.y = z10;
                                    }
                                    x0Var.n();
                                    x0Var.o();
                                }
                                d50Var.c0.M(0);
                                d50Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        d50 d50Var2 = this.b;
                        li.x0 x0Var2 = d50Var2.O;
                        if (x0Var2 != null && (w0Var2 = d50Var2.Q) != null && d50Var2.R != null) {
                            boolean z11 = !w0Var2.g;
                            li.l lVar2 = x0Var2.l;
                            li.x0.u();
                            if (x0Var2.Z == 3 && !x0Var2.y && (i14 = x0Var2.a0) != 1) {
                                x0Var2.w = z11;
                                if (i14 == 3) {
                                    x0Var2.v(z11);
                                    lVar2.T(false);
                                } else {
                                    x0Var2.v(false);
                                    lVar2.T(z11);
                                }
                                x0Var2.o();
                                d50Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int L = org.telegram.messenger.i0.L(24.0f);
        this.N = L;
        bi0 bi0Var = new bi0(R.raw.roundcamera_flip, L, L);
        this.c0 = bi0Var;
        bi0Var.setCallback(x1Var);
        bi0Var.M(bi0Var.e[0] - 1);
        x1Var.setImageDrawable(bi0Var);
        C();
        if (p6Var != null && !p6Var.a()) {
            x1Var.setInvert(0.6f);
            x1Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.H = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.b6.e(48, 48, 17));
        fVar.setOnTouchListener(new bk(this, i10));
        super.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCameraFlipElapsedMs() {
        if (this.r0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.r0);
    }

    private long getCurrentDurationMs() {
        li.w0 w0Var;
        li.x0 x0Var = this.O;
        if (x0Var == null || (w0Var = this.Q) == null) {
            return 0L;
        }
        return w0Var.a == 3 ? x0Var.j() : w0Var.b;
    }

    public static void m(d50 d50Var) {
        if (d50Var.n0 && d50Var.q0 && d50Var.o0 && d50Var.p0) {
            d50Var.n0 = false;
            org.telegram.messenger.f8.b("RoundVideo camera flip completed: elapsedMs=" + d50Var.getCameraFlipElapsedMs());
            d50Var.B();
        }
    }

    public static void n(d50 d50Var) {
        org.telegram.ui.ll llVar = d50Var.D;
        if (d50Var.l0) {
            d50Var.l0 = false;
            llVar.invalidate();
            llVar.animate().cancel();
            llVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.mk mkVar;
        if (z10 == this.G0) {
            return;
        }
        this.G0 = z10;
        this.F0 = 0L;
        z40 z40Var = this.I0;
        if (z10) {
            rf.g.d().a(30, z40Var);
        } else {
            rf.g.d().f(z40Var);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        h50 h50Var = this.c;
        if (h50Var == null || (mkVar = ((org.telegram.ui.rj) h50Var).a.Z) == null) {
            return;
        }
        mkVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.i0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        vh.z1 z1Var = this.I;
        if (z10) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            z1Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            z1Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (this.C0) {
            this.C0 = false;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 512);
        }
    }

    public final void B() {
        li.p0 p0Var;
        li.w0 w0Var = this.Q;
        boolean z10 = false;
        boolean z11 = (w0Var == null || w0Var.a != 3 || w0Var.f || this.n0) ? false : true;
        this.F.setEnabled(z11);
        if (z11 && (p0Var = this.R) != null && p0Var.b != 1) {
            z10 = true;
        }
        this.G.setEnabled(z10);
        C();
    }

    public final void C() {
        li.w0 w0Var = this.Q;
        int i10 = this.N;
        vh.x1 x1Var = this.G;
        if (w0Var == null || !w0Var.g) {
            if (this.d0 == null) {
                bi0 bi0Var = new bi0(R.raw.roundcamera_flash_on, i10, i10);
                this.d0 = bi0Var;
                bi0Var.setCallback(x1Var);
            }
            x1Var.setImageDrawable(this.d0);
            return;
        }
        if (this.e0 == null) {
            bi0 bi0Var2 = new bi0(R.raw.roundcamera_flash_off, i10, i10);
            this.e0 = bi0Var2;
            bi0Var2.setCallback(x1Var);
        }
        x1Var.setImageDrawable(this.e0);
    }

    public final void D() {
        org.telegram.ui.mk mkVar;
        li.w0 w0Var = this.Q;
        if (w0Var != null) {
            long j10 = w0Var.d;
            if (w0Var.a != 3) {
                return;
            }
            long min = Math.min(j10, (SystemClock.elapsedRealtime() + w0Var.b) - w0Var.c);
            this.u0 = min;
            this.w.setProgress(min / j10);
            h50 h50Var = this.c;
            if (h50Var == null || (mkVar = ((org.telegram.ui.rj) h50Var).a.Z) == null || !mkVar.j1) {
                return;
            }
            mkVar.i1 = min;
            bg bgVar = mkVar.Y0;
            if (bgVar != null && bgVar.r) {
                bgVar.h = min;
                bgVar.invalidate();
            }
            yf yfVar = mkVar.l1;
            if (yfVar != null && yfVar.n) {
                if (!yfVar.h) {
                    long j11 = yfVar.r;
                    if (j11 >= 0) {
                        if (!yfVar.e) {
                            long max = Math.max(0L, min - j11) % 1200;
                            yfVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        yfVar.invalidate();
                    }
                }
                yfVar.r = min;
                yfVar.a = 1.0f;
                yfVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = mkVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.j50
    public final void a(boolean z10) {
        li.x0 x0Var = this.O;
        if (x0Var == null || !x0Var.a()) {
            return;
        }
        this.U = null;
        x(z10 ? 0 : 6);
        lz0 lz0Var = this.S;
        if (lz0Var != null) {
            lz0Var.d(true);
        }
        this.S = null;
        MediaController.B().Y(false);
        z(false, false);
    }

    @Override // org.telegram.ui.Components.j50
    public final void b(float f7, int i10) {
        li.w0 w0Var;
        if (this.O == null || (w0Var = this.Q) == null || w0Var.a != 5) {
            return;
        }
        p();
        if (i10 == 0) {
            this.O.r();
            return;
        }
        if (i10 == 1) {
            this.O.p();
            return;
        }
        if (i10 == 2) {
            li.x0 x0Var = this.O;
            long j10 = (long) (f7 * this.Q.b);
            x0Var.getClass();
            li.x0.u();
            if (x0Var.Z != 5 || x0Var.V == null) {
                return;
            }
            long j11 = x0Var.J;
            x0Var.V.Z0(5, Math.max(j11, Math.min(Math.max(j11, x0Var.K - 1), j10)));
            x0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.j50
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        li.x0 x0Var = this.O;
        if (x0Var != null) {
            li.x0.u();
            int i10 = x0Var.Z;
            if (i10 == 10) {
                if (!x0Var.F) {
                    x0Var.i();
                }
            } else if (i10 != 8) {
                x0Var.a();
            } else {
                x0Var.e();
                x0Var.s();
                x0Var.l.M();
                x0Var.F = true;
                x0Var.w(10);
                x0Var.m("released");
                x0Var.i.removeCallbacksAndMessages(null);
                x0Var.j.shutdown();
                x0Var.k.shutdown();
            }
            this.O = null;
        }
        lz0 lz0Var = this.S;
        if (lz0Var != null) {
            lz0Var.d(true ^ this.j0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        A();
        b50 b50Var = this.s;
        b50Var.setTranslationX(0.0f);
        this.w0 = 0.0f;
        b50Var.setTranslationY(0.0f + this.v0);
        b50Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override // org.telegram.ui.Components.j50
    public final boolean e() {
        li.w0 w0Var = this.Q;
        if (w0Var == null) {
            return false;
        }
        int i10 = w0Var.a;
        return i10 == 4 || i10 == 5 || i10 == 6;
    }

    @Override // org.telegram.ui.Components.j50
    public final void f(float f7) {
        float f10 = f7 * 0.5f;
        this.v0 = f10;
        this.s.setTranslationY(this.w0 + f10);
    }

    @Override // org.telegram.ui.Components.j50
    public final void g(int i10, int i11, int i12, long j10, long j11, boolean z10) {
        if (this.O == null || this.Q == null) {
            return;
        }
        if (i10 == 3) {
            w();
            return;
        }
        if ((i10 == 1 || i10 == 4) && this.U == null) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                org.telegram.messenger.zs.f(this.f).k(org.telegram.messenger.zs.t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.Q.a == 3) {
                x(5);
            }
            this.g0 = false;
            this.U = new c50(i11, i12, j10, j11, z10);
            t();
        }
    }

    @Override // org.telegram.ui.Components.j50
    public View getButtonsLayout() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.j50
    public g50 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.j50
    public RectF getCameraRect() {
        nh.f fVar = this.y;
        int[] iArr = this.J;
        fVar.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], fVar.getWidth() + r3, fVar.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.j50
    public View getMuteImageView() {
        return this.H;
    }

    @Override // org.telegram.ui.Components.j50
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.j50
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.j50
    public final void h(tg.b bVar, org.telegram.ui.jj jjVar) {
        LinearLayout linearLayout = this.E;
        vg.f c10 = bVar.c(linearLayout, jjVar, false);
        c10.p(org.telegram.messenger.i0.L(6.0f));
        c10.q(org.telegram.messenger.i0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.j50
    public final void i(boolean z10) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(org.telegram.messenger.zs.e4);
        this.j0 = false;
        this.i0 = false;
        this.U = null;
        this.V = false;
        this.f0 = false;
        this.h0 = false;
        this.u0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.ll llVar = this.D;
        if (!this.l0) {
            if (this.t0 == null) {
                try {
                    this.t0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.w0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.t0;
            if (bitmap != null) {
                llVar.setImageBitmap(bitmap);
            } else {
                llVar.setImageResource(R.drawable.icplaceholder);
            }
            this.l0 = true;
            llVar.animate().cancel();
            llVar.setAlpha(1.0f);
            llVar.invalidate();
        }
        this.S = new lz0(this.f, this.n);
        this.P = (li.v0) mi.e.e.a();
        li.o0 o0Var = new li.o0(getContext(), this.y);
        o0Var.c = new File(org.telegram.messenger.w0.h(), "cache");
        o0Var.d = (li.q0) mi.e.j.a();
        o0Var.e = this.P;
        o0Var.h = mi.e.h.a();
        o0Var.f = (li.r0) mi.e.f.a();
        o0Var.g = (li.s0) mi.e.g.a();
        mi.a aVar = mi.e.i;
        aVar.a();
        o0Var.i = aVar.d;
        k2.m0 m0Var = this.J0;
        o0Var.j = m0Var;
        lz0 lz0Var = this.S;
        o0Var.k = lz0Var;
        o0Var.l = new px(this, 5);
        if (o0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (o0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (o0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (o0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (o0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (m0Var == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (lz0Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.O = new li.x0(o0Var);
        MediaController.B().Y(true);
        li.x0 x0Var = this.O;
        x0Var.getClass();
        li.x0.u();
        if (x0Var.Z == 1) {
            try {
                x0Var.m.b("start requested");
                x0Var.c(true);
                x0Var.w(2);
                x0Var.l.X(x0Var.T, 0L, x0Var.r);
            } catch (Exception e) {
                x0Var.h(e);
            }
        }
        z(true, false);
    }

    @Override // org.telegram.ui.Components.j50
    public final void j() {
        li.w0 w0Var;
        li.x0 x0Var = this.O;
        if (x0Var == null || (w0Var = this.Q) == null) {
            return;
        }
        int i10 = w0Var.a;
        if (i10 == 3) {
            w();
            return;
        }
        if (i10 == 5) {
            li.x0.u();
            if (x0Var.Z != 5 || x0Var.K - x0Var.J >= x0Var.q) {
                return;
            }
            x0Var.P++;
            x0Var.D = false;
            x0Var.m.b("resume requested: trim=" + x0Var.J + ".." + x0Var.K + ", sourceDurationMs=" + x0Var.H);
            x0Var.s();
            x0Var.w(6);
            x0Var.j.execute(new ag.n0(x0Var, x0Var.l(), x0Var.T, x0Var.S, x0Var.U, 2));
            this.T = null;
            this.g0 = true;
            this.h0 = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScreenFlashEnabled(false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = ((float) (View.MeasureSpec.getSize(i11) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i10)) * 1.3f ? org.telegram.messenger.i0.v : org.telegram.messenger.i0.u;
        if (this.E0 != i12) {
            this.E0 = i12;
            b50 b50Var = this.s;
            b50Var.getLayoutParams().width = org.telegram.messenger.i0.L(28.0f) + i12;
            b50Var.getLayoutParams().height = org.telegram.messenger.i0.L(28.0f) + i12;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i12 / 2) - org.telegram.messenger.i0.L(24.0f);
        }
        super.onMeasure(i10, i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        vh.z1 z1Var = this.I;
        z1Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        z1Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        li.x0 x0Var;
        li.w0 w0Var;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0 || (x0Var = this.O) == null || (w0Var = this.Q) == null) {
            return;
        }
        if (w0Var.a == 3) {
            w();
        } else if (w0Var.e) {
            x0Var.p();
        }
    }

    public final void p() {
        li.w0 w0Var;
        org.telegram.messenger.x20 x20Var;
        if (this.O == null || (w0Var = this.Q) == null || (x20Var = this.T) == null) {
            return;
        }
        long j10 = w0Var.b;
        long max = Math.max(0L, x20Var.a);
        long j11 = this.T.b;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11);
        }
        li.x0 x0Var = this.O;
        x0Var.getClass();
        li.x0.u();
        if (x0Var.Z != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(x0Var.H, max));
        long max3 = Math.max(max2, Math.min(x0Var.H, j10));
        if (max3 - max2 < Math.min(800L, x0Var.H)) {
            return;
        }
        x0Var.J = max2;
        x0Var.K = max3;
        i2.i0 i0Var = x0Var.V;
        if (i0Var != null) {
            i0Var.Z0(5, max2);
        }
        x0Var.d.getClass();
        x0Var.o();
    }

    public final Bitmap q(Bitmap bitmap) {
        nh.f fVar = this.y;
        if (fVar.getWidth() > 0 && fVar.getHeight() > 0) {
            Matrix matrix = this.K;
            fVar.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / fVar.getWidth();
                float height = bitmap.getHeight() / fVar.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.M);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void r() {
        if (this.n0 || this.b0 != null) {
            this.s0++;
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.b0.cancel();
                this.b0 = null;
            }
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.n0 = false;
            this.o0 = false;
            this.p0 = false;
            this.q0 = false;
            v(false);
        }
    }

    public final org.telegram.messenger.x20 s(File file, long j10, kz0 kz0Var) {
        li.s0 s0Var;
        org.telegram.messenger.x20 x20Var = new org.telegram.messenger.x20();
        x20Var.a = -1L;
        x20Var.b = -1L;
        x20Var.r = j10;
        x20Var.q = Math.max(1L, kz0Var == null ? file.length() : kz0Var.a);
        x20Var.s = true;
        li.x0 x0Var = this.O;
        x20Var.n = (x0Var == null || (s0Var = x0Var.u) == null) ? 30 : s0Var.a;
        li.v0 v0Var = this.P;
        int i10 = v0Var == null ? 480 : v0Var.a;
        x20Var.h = i10;
        x20Var.k = i10;
        x20Var.i = i10;
        x20Var.l = i10;
        x20Var.o = file.getAbsolutePath();
        if (kz0Var != null) {
            x20Var.w = kz0Var.b;
            x20Var.x = kz0Var.c;
            x20Var.y = kz0Var.d;
            x20Var.z = kz0Var.e;
        }
        return x20Var;
    }

    @Override // org.telegram.ui.Components.j50
    public void setInternalPadding(int i10) {
        setPadding(0, 0, 0, i10);
    }

    @Override // org.telegram.ui.Components.j50
    public void setIsMessageTransition(boolean z10) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.E.setAlpha(0.0f);
        b50 b50Var = this.s;
        b50Var.setAlpha(0.0f);
        b50Var.setScaleX(0.1f);
        b50Var.setScaleY(0.1f);
        b50Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i10 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void t() {
        li.w0 w0Var;
        if (this.U == null || this.V || this.O == null || (w0Var = this.Q) == null) {
            return;
        }
        int i10 = w0Var.a;
        if (i10 == 5) {
            p();
        } else if (i10 != 3) {
            return;
        }
        li.x0 x0Var = this.O;
        boolean z10 = this.i0;
        boolean z11 = !z10;
        x0Var.getClass();
        li.x0.u();
        int i11 = x0Var.Z;
        boolean z12 = false;
        if (i11 == 3 || i11 == 5) {
            x0Var.m.b("finish requested: state=" + i0.a.A(x0Var.Z) + ", includeAudio=" + z11 + ", durationMs=" + x0Var.j() + ", trim=" + x0Var.J + ".." + x0Var.K);
            x0Var.B = z11;
            if (x0Var.Z == 3) {
                x0Var.H = x0Var.j();
                x0Var.A = true;
                x0Var.e();
                x0Var.i.removeCallbacks(x0Var.W);
                x0Var.w(7);
                boolean Y = x0Var.l.Y();
                x0Var.E = Y;
                if (!Y) {
                    x0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                }
            } else {
                x0Var.s();
                x0Var.w(7);
                x0Var.j.execute(new li.m0(x0Var, x0Var.T, x0Var.l() || z10, x0Var.U, z11, x0Var.l() ? 1 : 2, x0Var.S));
            }
            z12 = true;
        }
        this.V = z12;
    }

    public final void u() {
        if (this.B0) {
            this.B0 = false;
            this.z0 = -1;
            this.A0 = -1;
            if (this.O == null) {
                return;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y0, 0.0f);
            this.a0 = ofFloat;
            ofFloat.setDuration(350L);
            this.a0.addUpdateListener(new y40(this, 1));
            this.a0.start();
        }
    }

    public final void v(boolean z10) {
        if (this.m0) {
            this.m0 = false;
            org.telegram.ui.ll llVar = this.D;
            llVar.animate().cancel();
            if (z10) {
                llVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                llVar.setAlpha(0.0f);
            }
        }
    }

    public final void w() {
        li.w0 w0Var;
        if (this.O == null || (w0Var = this.Q) == null || w0Var.a != 3) {
            return;
        }
        x(2);
        this.O.q();
    }

    public final void x(int i10) {
        if (this.h0 && i10 == 2) {
            return;
        }
        this.h0 = true;
        org.telegram.messenger.zs.f(this.f).k(org.telegram.messenger.zs.n2, Integer.valueOf(this.h), Integer.valueOf(i10));
    }

    public final void y(boolean z10) {
        Bitmap bitmap;
        nh.f fVar = this.y;
        if (fVar.isAvailable() && (bitmap = fVar.getBitmap(org.telegram.messenger.zs.K2, org.telegram.messenger.zs.K2)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.t0;
                    this.t0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.w0.h(), "icthumb.jpg"));
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.t0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.t0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void z(boolean z10, boolean z11) {
        f50 f50Var = this.a;
        if (f50Var != null) {
            ((org.telegram.ui.re) f50Var).b.Rc.a(z10, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        b50 b50Var = this.s;
        if (z10 && !this.k0) {
            b50Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.w0 = measuredHeight;
            b50Var.setTranslationY(measuredHeight + this.v0);
        }
        this.k0 = z10;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float L = (z10 || Math.max(getCurrentDurationMs(), this.u0) <= 300) ? 0.0f : org.telegram.messenger.i0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new y40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(b50Var, (Property<b50, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(b50Var, (Property<b50, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(b50Var, (Property<b50, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(b50Var, (Property<b50, Float>) View.TRANSLATION_X, L), ObjectAnimator.ofFloat(this.H, (Property<ImageView, Float>) property, (this.i0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new w5(this, 29));
        }
        this.W.start();
    }
}
