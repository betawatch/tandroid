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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j40 extends p40 {
    public static final /* synthetic */ int L0 = 0;
    public int A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public final org.telegram.ui.lk E;
    public float E0;
    public final LinearLayout F;
    public int F0;
    public final gi.l2 G;
    public long G0;
    public final gi.l2 H;
    public boolean H0;
    public final ImageView I;
    public boolean I0;
    public final gi.n2 J;
    public final e40 J0;
    public final int[] K;
    public final y00 K0;
    public final Matrix L;
    public final float[] M;
    public final Paint N;
    public final int O;
    public wi.t0 P;
    public wi.r0 Q;
    public wi.s0 R;
    public wi.l0 S;
    public gy0 T;
    public org.telegram.messenger.b20 U;
    public i40 V;
    public boolean W;
    public AnimatorSet a0;
    public ValueAnimator b0;
    public ValueAnimator c0;
    public final ch0 d0;
    public final x30 e;
    public ch0 e0;
    public final int f;
    public ch0 f0;
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
    public boolean r0;
    public final h40 s;
    public long s0;
    public int t0;
    public Bitmap u0;
    public long v0;
    public final jk0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final g40 y;
    public float y0;
    public float z0;

    public j40(Activity activity, x30 x30Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f = org.telegram.messenger.h10.t0;
        int i3 = 2;
        this.K = new int[2];
        this.L = new Matrix();
        this.M = new float[9];
        this.N = new Paint(3);
        this.A0 = -1;
        this.B0 = -1;
        this.E0 = Float.NaN;
        final int i10 = 0;
        this.J0 = new e40(this, 0);
        this.K0 = new y00(this);
        this.e = x30Var;
        this.h = x30Var.getClassGuid();
        this.n = x30Var.z();
        this.r = x30Var.getFragmentView();
        setWillNotDraw(false);
        gi.n2 n2Var = new gi.n2(activity, null, this, null);
        this.J = n2Var;
        n2Var.o = 0.5f;
        n2Var.n = gi.n2.f(0.5f);
        n2Var.g();
        addView(n2Var.b, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        h40 h40Var = new h40(this, activity);
        this.s = h40Var;
        jk0 jk0Var = new jk0(activity);
        this.w = jk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        g40 g40Var = new g40(i10, activity, this);
        final int i11 = 1;
        g40Var.setOpaque(true);
        g40Var.setClickable(true);
        g40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        g40Var.setOutlineProvider(new cg.p0(15));
        g40Var.setClipToOutline(true);
        this.y = g40Var;
        frameLayout.addView(g40Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.lk lkVar = new org.telegram.ui.lk(this, activity, paint);
        this.E = lkVar;
        lkVar.setOutlineProvider(new cg.p0(14));
        lkVar.setClipToOutline(true);
        frameLayout.addView(lkVar, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        jk0Var.addView(frameLayout, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 14.0f, 14.0f, 14.0f, 14.0f));
        h40Var.addView(jk0Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        int i12 = org.telegram.messenger.g0.v;
        addView(h40Var, new FrameLayout.LayoutParams(i12, i12, 17));
        addView(n2Var.c, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, b8.mf.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        gi.l2 l2Var = new gi.l2(activity);
        this.G = l2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        l2Var.setScaleType(scaleType);
        l2Var.setContentDescription(org.telegram.messenger.bd.M0(2131754752, null));
        linearLayout.addView(l2Var, b8.mf.o(44, 44));
        l2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f40
            public final /* synthetic */ j40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z10;
                wi.s0 s0Var2;
                int i13;
                switch (i10) {
                    case 0:
                        j40 j40Var = this.b;
                        wi.t0 t0Var = j40Var.P;
                        if (t0Var != null && (s0Var = j40Var.R) != null && (l0Var = j40Var.S) != null && s0Var.a == 3 && !s0Var.f && !j40Var.o0) {
                            wi.m0 m0Var = l0Var.a;
                            wi.m0 m0Var2 = wi.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.b;
                            }
                            t0Var.getClass();
                            wi.t0.u();
                            int i14 = t0Var.Z;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (t0Var.r != m0Var2) {
                                    t0Var.m.b("camera facing requested: " + t0Var.r + " -> " + m0Var2 + ", state=" + t4.c.t(t0Var.Z));
                                    t0Var.r = m0Var2;
                                    int i15 = t0Var.Z;
                                    if (i15 == 3 || i15 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new u9.a(18, jVar, m0Var2));
                                            z10 = true;
                                        }
                                        t0Var.y = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                j40Var.d0.M(0);
                                j40Var.d0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        j40 j40Var2 = this.b;
                        wi.t0 t0Var2 = j40Var2.P;
                        if (t0Var2 != null && (s0Var2 = j40Var2.R) != null && j40Var2.S != null) {
                            boolean z11 = !s0Var2.g;
                            wi.j jVar2 = t0Var2.l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.y && (i13 = t0Var2.a0) != 1) {
                                t0Var2.w = z11;
                                if (i13 == 3) {
                                    t0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                t0Var2.o();
                                j40Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        gi.l2 l2Var2 = new gi.l2(activity);
        this.H = l2Var2;
        l2Var2.setScaleType(scaleType);
        linearLayout.addView(l2Var2, b8.mf.o(44, 44));
        l2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f40
            public final /* synthetic */ j40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z10;
                wi.s0 s0Var2;
                int i13;
                switch (i11) {
                    case 0:
                        j40 j40Var = this.b;
                        wi.t0 t0Var = j40Var.P;
                        if (t0Var != null && (s0Var = j40Var.R) != null && (l0Var = j40Var.S) != null && s0Var.a == 3 && !s0Var.f && !j40Var.o0) {
                            wi.m0 m0Var = l0Var.a;
                            wi.m0 m0Var2 = wi.m0.a;
                            if (m0Var == m0Var2) {
                                m0Var2 = wi.m0.b;
                            }
                            t0Var.getClass();
                            wi.t0.u();
                            int i14 = t0Var.Z;
                            if (i14 != 7 && i14 != 8 && i14 != 9 && i14 != 10) {
                                if (t0Var.r != m0Var2) {
                                    t0Var.m.b("camera facing requested: " + t0Var.r + " -> " + m0Var2 + ", state=" + t4.c.t(t0Var.Z));
                                    t0Var.r = m0Var2;
                                    int i15 = t0Var.Z;
                                    if (i15 == 3 || i15 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z10 = false;
                                        } else {
                                            handler.post(new u9.a(18, jVar, m0Var2));
                                            z10 = true;
                                        }
                                        t0Var.y = z10;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                j40Var.d0.M(0);
                                j40Var.d0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        j40 j40Var2 = this.b;
                        wi.t0 t0Var2 = j40Var2.P;
                        if (t0Var2 != null && (s0Var2 = j40Var2.R) != null && j40Var2.S != null) {
                            boolean z11 = !s0Var2.g;
                            wi.j jVar2 = t0Var2.l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.y && (i13 = t0Var2.a0) != 1) {
                                t0Var2.w = z11;
                                if (i13 == 3) {
                                    t0Var2.v(z11);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z11);
                                }
                                t0Var2.o();
                                j40Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.O = L;
        ch0 ch0Var = new ch0(R.raw.roundcamera_flip, L, L);
        this.d0 = ch0Var;
        ch0Var.setCallback(l2Var);
        ch0Var.M(ch0Var.e[0] - 1);
        l2Var.setImageDrawable(ch0Var);
        C();
        if (e6Var != null && !e6Var.a()) {
            l2Var.setInvert(0.6f);
            l2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.I = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, b8.mf.e(48, 48, 17));
        g40Var.setOnTouchListener(new yj(this, i3));
        super.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCameraFlipElapsedMs() {
        if (this.s0 == 0) {
            return 0L;
        }
        return Math.max(0L, SystemClock.elapsedRealtime() - this.s0);
    }

    private long getCurrentDurationMs() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.P;
        if (t0Var == null || (s0Var = this.R) == null) {
            return 0L;
        }
        return s0Var.a == 3 ? t0Var.j() : s0Var.b;
    }

    public static void m(j40 j40Var) {
        if (j40Var.o0 && j40Var.r0 && j40Var.p0 && j40Var.q0) {
            j40Var.o0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + j40Var.getCameraFlipElapsedMs());
            j40Var.B();
        }
    }

    public static void n(j40 j40Var) {
        org.telegram.ui.lk lkVar = j40Var.E;
        if (j40Var.m0) {
            j40Var.m0 = false;
            lkVar.invalidate();
            lkVar.animate().cancel();
            lkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z10) {
        org.telegram.ui.mj mjVar;
        if (z10 == this.H0) {
            return;
        }
        this.H0 = z10;
        this.G0 = 0L;
        e40 e40Var = this.J0;
        if (z10) {
            cg.j.d().a(30, e40Var);
        } else {
            cg.j.d().f(e40Var);
        }
        if (this.d == z10) {
            return;
        }
        this.d = z10;
        n40 n40Var = this.c;
        if (n40Var == null || (mjVar = ((org.telegram.ui.si) n40Var).a.a0) == null) {
            return;
        }
        mjVar.setRoundVideoUiFrameClockActive(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z10) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        gi.n2 n2Var = this.J;
        if (z10) {
            if (Float.isNaN(this.E0)) {
                this.E0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            n2Var.c(null);
        } else {
            if (!Float.isNaN(this.E0)) {
                attributes.screenBrightness = this.E0;
                this.E0 = Float.NaN;
            }
            n2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (this.D0) {
            this.D0 = false;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 512);
        }
    }

    public final void B() {
        wi.l0 l0Var;
        wi.s0 s0Var = this.R;
        boolean z10 = false;
        boolean z11 = (s0Var == null || s0Var.a != 3 || s0Var.f || this.o0) ? false : true;
        this.G.setEnabled(z11);
        if (z11 && (l0Var = this.S) != null && l0Var.b != 1) {
            z10 = true;
        }
        this.H.setEnabled(z10);
        C();
    }

    public final void C() {
        wi.s0 s0Var = this.R;
        int i3 = this.O;
        gi.l2 l2Var = this.H;
        if (s0Var == null || !s0Var.g) {
            if (this.e0 == null) {
                ch0 ch0Var = new ch0(R.raw.roundcamera_flash_on, i3, i3);
                this.e0 = ch0Var;
                ch0Var.setCallback(l2Var);
            }
            l2Var.setImageDrawable(this.e0);
            return;
        }
        if (this.f0 == null) {
            ch0 ch0Var2 = new ch0(R.raw.roundcamera_flash_off, i3, i3);
            this.f0 = ch0Var2;
            ch0Var2.setCallback(l2Var);
        }
        l2Var.setImageDrawable(this.f0);
    }

    public final void D() {
        org.telegram.ui.mj mjVar;
        wi.s0 s0Var = this.R;
        if (s0Var != null) {
            long j10 = s0Var.d;
            if (s0Var.a != 3) {
                return;
            }
            long min = Math.min(j10, (SystemClock.elapsedRealtime() + s0Var.b) - s0Var.c);
            this.v0 = min;
            this.w.setProgress(min / j10);
            n40 n40Var = this.c;
            if (n40Var == null || (mjVar = ((org.telegram.ui.si) n40Var).a.a0) == null || !mjVar.k1) {
                return;
            }
            mjVar.j1 = min;
            dg dgVar = mjVar.Z0;
            if (dgVar != null && dgVar.r) {
                dgVar.h = min;
                dgVar.invalidate();
            }
            ag agVar = mjVar.m1;
            if (agVar != null && agVar.n) {
                if (!agVar.h) {
                    long j11 = agVar.r;
                    if (j11 >= 0) {
                        if (!agVar.e) {
                            long max = Math.max(0L, min - j11) % 1200;
                            agVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        agVar.invalidate();
                    }
                }
                agVar.r = min;
                agVar.a = 1.0f;
                agVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = mjVar.l1;
            if (slideTextView == null || !slideTextView.K || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.p40
    public final void a(boolean z10) {
        wi.t0 t0Var = this.P;
        if (t0Var == null || !t0Var.a()) {
            return;
        }
        this.V = null;
        x(z10 ? 0 : 6);
        gy0 gy0Var = this.T;
        if (gy0Var != null) {
            gy0Var.d(true);
        }
        this.T = null;
        MediaController.B().Y(false);
        z(false, false);
    }

    @Override // org.telegram.ui.Components.p40
    public final void b(float f10, int i3) {
        wi.s0 s0Var;
        if (this.P == null || (s0Var = this.R) == null || s0Var.a != 5) {
            return;
        }
        p();
        if (i3 == 0) {
            this.P.r();
            return;
        }
        if (i3 == 1) {
            this.P.p();
            return;
        }
        if (i3 == 2) {
            wi.t0 t0Var = this.P;
            long j10 = (long) (f10 * this.R.b);
            t0Var.getClass();
            wi.t0.u();
            if (t0Var.Z != 5 || t0Var.V == null) {
                return;
            }
            long j11 = t0Var.J;
            t0Var.V.Z0(5, Math.max(j11, Math.min(Math.max(j11, t0Var.K - 1), j10)));
            t0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.p40
    public final void c(boolean z10) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wi.t0 t0Var = this.P;
        if (t0Var != null) {
            wi.t0.u();
            int i3 = t0Var.Z;
            if (i3 == 10) {
                if (!t0Var.F) {
                    t0Var.i();
                }
            } else if (i3 != 8) {
                t0Var.a();
            } else {
                t0Var.e();
                t0Var.s();
                t0Var.l.M();
                t0Var.F = true;
                t0Var.w(10);
                t0Var.m("released");
                t0Var.i.removeCallbacksAndMessages(null);
                t0Var.j.shutdown();
                t0Var.k.shutdown();
            }
            this.P = null;
        }
        gy0 gy0Var = this.T;
        if (gy0Var != null) {
            gy0Var.d(true ^ this.k0);
            this.T = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        A();
        h40 h40Var = this.s;
        h40Var.setTranslationX(0.0f);
        this.x0 = 0.0f;
        h40Var.setTranslationY(0.0f + this.w0);
        h40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override // org.telegram.ui.Components.p40
    public final boolean e() {
        wi.s0 s0Var = this.R;
        if (s0Var == null) {
            return false;
        }
        int i3 = s0Var.a;
        return i3 == 4 || i3 == 5 || i3 == 6;
    }

    @Override // org.telegram.ui.Components.p40
    public final void f(float f10) {
        float f11 = f10 * 0.5f;
        this.w0 = f11;
        this.s.setTranslationY(this.x0 + f11);
    }

    @Override // org.telegram.ui.Components.p40
    public final void g(int i3, int i10, int i11, long j10, long j11, boolean z10) {
        if (this.P == null || this.R == null) {
            return;
        }
        if (i3 == 3) {
            w();
            return;
        }
        if ((i3 == 1 || i3 == 4) && this.V == null) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                org.telegram.messenger.hs.f(this.f).k(org.telegram.messenger.hs.t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.R.a == 3) {
                x(5);
            }
            this.h0 = false;
            this.V = new i40(i10, i11, j10, j11, z10);
            t();
        }
    }

    @Override // org.telegram.ui.Components.p40
    public View getButtonsLayout() {
        return this.F;
    }

    @Override // org.telegram.ui.Components.p40
    public m40 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.p40
    public RectF getCameraRect() {
        g40 g40Var = this.y;
        int[] iArr = this.K;
        g40Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], g40Var.getWidth() + r3, g40Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.p40
    public View getMuteImageView() {
        return this.I;
    }

    @Override // org.telegram.ui.Components.p40
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.p40
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.p40
    public final void h(eh.c cVar, org.telegram.ui.ki kiVar) {
        LinearLayout linearLayout = this.F;
        gh.g c2 = cVar.c(linearLayout, kiVar, false);
        c2.q(org.telegram.messenger.g0.L(6.0f));
        c2.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c2);
    }

    @Override // org.telegram.ui.Components.p40
    public final void i(boolean z10) {
        if (this.P != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(org.telegram.messenger.hs.e4);
        this.k0 = false;
        this.j0 = false;
        this.V = null;
        this.W = false;
        this.g0 = false;
        this.i0 = false;
        this.v0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.lk lkVar = this.E;
        if (!this.m0) {
            if (this.u0 == null) {
                try {
                    this.u0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.u0;
            if (bitmap != null) {
                lkVar.setImageBitmap(bitmap);
            } else {
                lkVar.setImageResource(R.drawable.icplaceholder);
            }
            this.m0 = true;
            lkVar.animate().cancel();
            lkVar.setAlpha(1.0f);
            lkVar.invalidate();
        }
        this.T = new gy0(this.f, this.n);
        this.Q = (wi.r0) xi.e.e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.y);
        k0Var.c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.j.a();
        k0Var.e = this.Q;
        k0Var.h = xi.e.h.a();
        k0Var.f = (wi.n0) xi.e.f.a();
        k0Var.g = (wi.o0) xi.e.g.a();
        xi.a aVar = xi.e.i;
        aVar.a();
        k0Var.i = aVar.d;
        y00 y00Var = this.K0;
        k0Var.j = y00Var;
        gy0 gy0Var = this.T;
        k0Var.k = gy0Var;
        k0Var.l = new zw(this, 5);
        if (k0Var.d == null) {
            throw new IllegalStateException("Initial camera is required");
        }
        if (k0Var.e == null) {
            throw new IllegalStateException("Output resolution is required");
        }
        if (k0Var.h <= 0) {
            throw new IllegalStateException("Video bitrate is required");
        }
        if (k0Var.f == null) {
            throw new IllegalStateException("Camera resolution is required");
        }
        if (k0Var.g == null) {
            throw new IllegalStateException("Frame rate is required");
        }
        if (y00Var == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (gy0Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.P = new wi.t0(k0Var);
        MediaController.B().Y(true);
        wi.t0 t0Var = this.P;
        t0Var.getClass();
        wi.t0.u();
        if (t0Var.Z == 1) {
            try {
                t0Var.m.b("start requested");
                t0Var.c(true);
                t0Var.w(2);
                t0Var.l.X(t0Var.T, 0L, t0Var.r);
            } catch (Exception e10) {
                t0Var.h(e10);
            }
        }
        z(true, false);
    }

    @Override // org.telegram.ui.Components.p40
    public final void j() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.P;
        if (t0Var == null || (s0Var = this.R) == null) {
            return;
        }
        int i3 = s0Var.a;
        if (i3 == 3) {
            w();
            return;
        }
        if (i3 == 5) {
            wi.t0.u();
            if (t0Var.Z != 5 || t0Var.K - t0Var.J >= t0Var.q) {
                return;
            }
            t0Var.P++;
            t0Var.D = false;
            t0Var.m.b("resume requested: trim=" + t0Var.J + ".." + t0Var.K + ", sourceDurationMs=" + t0Var.H);
            t0Var.s();
            t0Var.w(6);
            t0Var.j.execute(new gi.q1(t0Var, t0Var.l(), t0Var.T, t0Var.S, t0Var.U));
            this.U = null;
            this.h0 = true;
            this.i0 = false;
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
    public final void onMeasure(int i3, int i10) {
        int i11 = ((float) (View.MeasureSpec.getSize(i10) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i3)) * 1.3f ? org.telegram.messenger.g0.v : org.telegram.messenger.g0.u;
        if (this.F0 != i11) {
            this.F0 = i11;
            h40 h40Var = this.s;
            h40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            h40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i3, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        gi.n2 n2Var = this.J;
        n2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        n2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        wi.t0 t0Var;
        wi.s0 s0Var;
        super.onWindowVisibilityChanged(i3);
        if (i3 == 0 || (t0Var = this.P) == null || (s0Var = this.R) == null) {
            return;
        }
        if (s0Var.a == 3) {
            w();
        } else if (s0Var.e) {
            t0Var.p();
        }
    }

    public final void p() {
        wi.s0 s0Var;
        org.telegram.messenger.b20 b20Var;
        if (this.P == null || (s0Var = this.R) == null || (b20Var = this.U) == null) {
            return;
        }
        long j10 = s0Var.b;
        long max = Math.max(0L, b20Var.a);
        long j11 = this.U.b;
        if (j11 >= 0) {
            j10 = Math.min(j10, j11);
        }
        wi.t0 t0Var = this.P;
        t0Var.getClass();
        wi.t0.u();
        if (t0Var.Z != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(t0Var.H, max));
        long max3 = Math.max(max2, Math.min(t0Var.H, j10));
        if (max3 - max2 < Math.min(800L, t0Var.H)) {
            return;
        }
        t0Var.J = max2;
        t0Var.K = max3;
        k2.i0 i0Var = t0Var.V;
        if (i0Var != null) {
            i0Var.Z0(5, max2);
        }
        t0Var.d.getClass();
        t0Var.o();
    }

    public final Bitmap q(Bitmap bitmap) {
        g40 g40Var = this.y;
        if (g40Var.getWidth() > 0 && g40Var.getHeight() > 0) {
            Matrix matrix = this.L;
            g40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.M;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / g40Var.getWidth();
                float height = bitmap.getHeight() / g40Var.getHeight();
                fArr[1] = (width / height) * fArr[1];
                fArr[2] = fArr[2] * width;
                fArr[3] = (height / width) * fArr[3];
                fArr[5] = fArr[5] * height;
                fArr[6] = fArr[6] / width;
                fArr[7] = fArr[7] / height;
                matrix.setValues(fArr);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, this.N);
                bitmap.recycle();
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void r() {
        if (this.o0 || this.c0 != null) {
            this.t0++;
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c0.cancel();
                this.c0 = null;
            }
            FrameLayout frameLayout = this.x;
            frameLayout.animate().cancel();
            frameLayout.animate().setListener(null);
            frameLayout.setRotationY(0.0f);
            this.o0 = false;
            this.p0 = false;
            this.q0 = false;
            this.r0 = false;
            v(false);
        }
    }

    public final org.telegram.messenger.b20 s(File file, long j10, fy0 fy0Var) {
        wi.o0 o0Var;
        org.telegram.messenger.b20 b20Var = new org.telegram.messenger.b20();
        b20Var.a = -1L;
        b20Var.b = -1L;
        b20Var.r = j10;
        b20Var.q = Math.max(1L, fy0Var == null ? file.length() : fy0Var.a);
        b20Var.s = true;
        wi.t0 t0Var = this.P;
        b20Var.n = (t0Var == null || (o0Var = t0Var.u) == null) ? 30 : o0Var.a;
        wi.r0 r0Var = this.Q;
        int i3 = r0Var == null ? 480 : r0Var.a;
        b20Var.h = i3;
        b20Var.k = i3;
        b20Var.i = i3;
        b20Var.l = i3;
        b20Var.o = file.getAbsolutePath();
        if (fy0Var != null) {
            b20Var.w = fy0Var.b;
            b20Var.x = fy0Var.c;
            b20Var.y = fy0Var.d;
            b20Var.z = fy0Var.e;
        }
        return b20Var;
    }

    @Override // org.telegram.ui.Components.p40
    public void setInternalPadding(int i3) {
        setPadding(0, 0, 0, i3);
    }

    @Override // org.telegram.ui.Components.p40
    public void setIsMessageTransition(boolean z10) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        this.F.setAlpha(0.0f);
        h40 h40Var = this.s;
        h40Var.setAlpha(0.0f);
        h40Var.setScaleX(0.1f);
        h40Var.setScaleY(0.1f);
        h40Var.setTranslationX(0.0f);
        ImageView imageView = this.I;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i3 == 0) {
                activity.getWindow().addFlags(128);
            } else {
                activity.getWindow().clearFlags(128);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t() {
        wi.s0 s0Var;
        if (this.V == null || this.W || this.P == null || (s0Var = this.R) == null) {
            return;
        }
        int i3 = s0Var.a;
        if (i3 == 5) {
            p();
        } else if (i3 != 3) {
            return;
        }
        wi.t0 t0Var = this.P;
        boolean z10 = this.j0;
        boolean z11 = !z10;
        t0Var.getClass();
        wi.t0.u();
        int i10 = t0Var.Z;
        boolean z12 = false;
        if (i10 == 3 || i10 == 5) {
            t0Var.m.b("finish requested: state=" + t4.c.t(t0Var.Z) + ", includeAudio=" + z11 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.J + ".." + t0Var.K);
            t0Var.B = z11;
            if (t0Var.Z == 3) {
                t0Var.H = t0Var.j();
                t0Var.A = true;
                t0Var.e();
                t0Var.i.removeCallbacks(t0Var.W);
                t0Var.w(7);
                boolean Y = t0Var.l.Y();
                t0Var.E = Y;
                if (!Y) {
                    t0Var.h(new IllegalStateException("Unable to stop the camera segment"));
                }
            } else {
                t0Var.s();
                t0Var.w(7);
                t0Var.j.execute(new ci.pa(t0Var, t0Var.T, t0Var.l() || z10, t0Var.U, z11, t0Var.l() ? 1 : 2, t0Var.S));
            }
            z12 = true;
        }
        this.W = z12;
    }

    public final void u() {
        if (this.C0) {
            this.C0 = false;
            this.A0 = -1;
            this.B0 = -1;
            if (this.P == null) {
                return;
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.z0, 0.0f);
            this.b0 = ofFloat;
            ofFloat.setDuration(350L);
            this.b0.addUpdateListener(new d40(this, 1));
            this.b0.start();
        }
    }

    public final void v(boolean z10) {
        if (this.n0) {
            this.n0 = false;
            org.telegram.ui.lk lkVar = this.E;
            lkVar.animate().cancel();
            if (z10) {
                lkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                lkVar.setAlpha(0.0f);
            }
        }
    }

    public final void w() {
        wi.s0 s0Var;
        if (this.P == null || (s0Var = this.R) == null || s0Var.a != 3) {
            return;
        }
        x(2);
        this.P.q();
    }

    public final void x(int i3) {
        if (this.i0 && i3 == 2) {
            return;
        }
        this.i0 = true;
        org.telegram.messenger.hs.f(this.f).k(org.telegram.messenger.hs.n2, Integer.valueOf(this.h), Integer.valueOf(i3));
    }

    public final void y(boolean z10) {
        Bitmap bitmap;
        g40 g40Var = this.y;
        if (g40Var.isAvailable() && (bitmap = g40Var.getBitmap(org.telegram.messenger.hs.K2, org.telegram.messenger.hs.K2)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.u0;
                    this.u0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z10) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(org.telegram.messenger.t0.h(), "icthumb.jpg"));
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (bitmap != this.u0) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            } finally {
                if (bitmap != this.u0) {
                    bitmap.recycle();
                }
            }
        }
    }

    public final void z(boolean z10, boolean z11) {
        l40 l40Var = this.a;
        if (l40Var != null) {
            ((org.telegram.ui.de) l40Var).b.ad.a(z10, true);
        }
        AnimatorSet animatorSet = this.a0;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.a0.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.G;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z10);
        }
        h40 h40Var = this.s;
        if (z10 && !this.l0) {
            h40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.x0 = measuredHeight;
            h40Var.setTranslationY(measuredHeight + this.w0);
        }
        this.l0 = z10;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float L = (z10 || Math.max(getCurrentDurationMs(), this.v0) <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z10 ? 1.0f : 0.0f, z10 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new d40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a0 = animatorSet2;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.F;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) property, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) View.SCALE_X, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) View.SCALE_Y, z10 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(h40Var, (Property<h40, Float>) View.TRANSLATION_X, L), ObjectAnimator.ofFloat(this.I, (Property<ImageView, Float>) property, (this.j0 && z10) ? 1.0f : 0.0f), ofFloat);
        this.a0.setDuration(180L);
        this.a0.setInterpolator(new DecelerateInterpolator());
        if (z10) {
            setTranslationX(0.0f);
        } else {
            this.a0.addListener(new x5(this, 29));
        }
        this.a0.start();
    }
}
