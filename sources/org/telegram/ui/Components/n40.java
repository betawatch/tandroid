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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n40 extends t40 {
    public static final /* synthetic */ int K0 = 0;
    public int A0;
    public boolean B0;
    public boolean C0;
    public final org.telegram.ui.pk D;
    public float D0;
    public final LinearLayout E;
    public int E0;
    public final fi.n2 F;
    public long F0;
    public final fi.n2 G;
    public boolean G0;
    public final ImageView H;
    public boolean H0;
    public final fi.p2 I;
    public final i40 I0;
    public final int[] J;
    public final qt J0;
    public final Matrix K;
    public final float[] L;
    public final Paint M;
    public final int N;
    public wi.t0 O;
    public wi.r0 P;
    public wi.s0 Q;
    public wi.l0 R;
    public gy0 S;
    public org.telegram.messenger.j20 T;
    public m40 U;
    public boolean V;
    public AnimatorSet W;
    public ValueAnimator a0;
    public ValueAnimator b0;
    public final zg0 c0;
    public zg0 d0;
    public final b40 e;
    public zg0 e0;
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
    public final l40 s;
    public int s0;
    public Bitmap t0;
    public long u0;
    public float v0;
    public final fk0 w;
    public float w0;
    public final FrameLayout x;
    public float x0;
    public final k40 y;
    public float y0;
    public int z0;

    public n40(Activity activity, b40 b40Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f = org.telegram.messenger.p10.s0;
        int i7 = 2;
        this.J = new int[2];
        this.K = new Matrix();
        this.L = new float[9];
        this.M = new Paint(3);
        this.z0 = -1;
        this.A0 = -1;
        this.D0 = Float.NaN;
        final int i10 = 0;
        this.I0 = new i40(this, 0);
        this.J0 = new qt(this, i7);
        this.e = b40Var;
        this.h = b40Var.getClassGuid();
        this.n = b40Var.z();
        this.r = b40Var.getFragmentView();
        setWillNotDraw(false);
        fi.p2 p2Var = new fi.p2(activity, null, this, null);
        this.I = p2Var;
        p2Var.o = 0.5f;
        p2Var.n = fi.p2.f(0.5f);
        p2Var.g();
        addView(p2Var.b, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        l40 l40Var = new l40(this, activity);
        this.s = l40Var;
        fk0 fk0Var = new fk0(activity);
        this.w = fk0Var;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.x = frameLayout;
        k40 k40Var = new k40(i10, activity, this);
        final int i11 = 1;
        k40Var.setOpaque(true);
        k40Var.setClickable(true);
        k40Var.setCameraDistance(org.telegram.messenger.g0.L(8000.0f));
        k40Var.setOutlineProvider(new bg.q0(12));
        k40Var.setClipToOutline(true);
        this.y = k40Var;
        frameLayout.addView(k40Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(40, 0, 0, 0));
        org.telegram.ui.pk pkVar = new org.telegram.ui.pk(this, activity, paint);
        this.D = pkVar;
        pkVar.setOutlineProvider(new bg.q0(11));
        pkVar.setClipToOutline(true);
        frameLayout.addView(pkVar, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        fk0Var.addView(frameLayout, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 14.0f, 14.0f, 14.0f, 14.0f));
        l40Var.addView(fk0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        int i12 = org.telegram.messenger.g0.v;
        addView(l40Var, new FrameLayout.LayoutParams(i12, i12, 17));
        addView(p2Var.c, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
        addView(linearLayout, c8.ha.d(-2, 56.0f, 83, 1.0f, 0.0f, 0.0f, 0.0f));
        fi.n2 n2Var = new fi.n2(activity);
        this.F = n2Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        n2Var.setScaleType(scaleType);
        n2Var.setContentDescription(org.telegram.messenger.hd.M0(2131754752, null));
        linearLayout.addView(n2Var, c8.ha.o(44, 44));
        n2Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j40
            public final /* synthetic */ n40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z9;
                wi.s0 s0Var2;
                int i13;
                switch (i10) {
                    case 0:
                        n40 n40Var = this.b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.a == 3 && !s0Var.f && !n40Var.n0) {
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
                                    t0Var.m.b("camera facing requested: " + t0Var.r + " -> " + m0Var2 + ", state=" + rf.b.t(t0Var.Z));
                                    t0Var.r = m0Var2;
                                    int i15 = t0Var.Z;
                                    if (i15 == 3 || i15 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z9 = false;
                                        } else {
                                            handler.post(new ti.p(28, jVar, m0Var2));
                                            z9 = true;
                                        }
                                        t0Var.y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.c0.M(0);
                                n40Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        n40 n40Var2 = this.b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.g;
                            wi.j jVar2 = t0Var2.l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.y && (i13 = t0Var2.a0) != 1) {
                                t0Var2.w = z10;
                                if (i13 == 3) {
                                    t0Var2.v(z10);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z10);
                                }
                                t0Var2.o();
                                n40Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        fi.n2 n2Var2 = new fi.n2(activity);
        this.G = n2Var2;
        n2Var2.setScaleType(scaleType);
        linearLayout.addView(n2Var2, c8.ha.o(44, 44));
        n2Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.j40
            public final /* synthetic */ n40 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wi.s0 s0Var;
                wi.l0 l0Var;
                boolean z9;
                wi.s0 s0Var2;
                int i13;
                switch (i11) {
                    case 0:
                        n40 n40Var = this.b;
                        wi.t0 t0Var = n40Var.O;
                        if (t0Var != null && (s0Var = n40Var.Q) != null && (l0Var = n40Var.R) != null && s0Var.a == 3 && !s0Var.f && !n40Var.n0) {
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
                                    t0Var.m.b("camera facing requested: " + t0Var.r + " -> " + m0Var2 + ", state=" + rf.b.t(t0Var.Z));
                                    t0Var.r = m0Var2;
                                    int i15 = t0Var.Z;
                                    if (i15 == 3 || i15 == 2) {
                                        t0Var.e();
                                        wi.j jVar = t0Var.l;
                                        jVar.F = m0Var2;
                                        Handler handler = jVar.n;
                                        if (!jVar.V || handler == null) {
                                            z9 = false;
                                        } else {
                                            handler.post(new ti.p(28, jVar, m0Var2));
                                            z9 = true;
                                        }
                                        t0Var.y = z9;
                                    }
                                    t0Var.n();
                                    t0Var.o();
                                }
                                n40Var.c0.M(0);
                                n40Var.c0.start();
                                break;
                            }
                        }
                        break;
                    default:
                        n40 n40Var2 = this.b;
                        wi.t0 t0Var2 = n40Var2.O;
                        if (t0Var2 != null && (s0Var2 = n40Var2.Q) != null && n40Var2.R != null) {
                            boolean z10 = !s0Var2.g;
                            wi.j jVar2 = t0Var2.l;
                            wi.t0.u();
                            if (t0Var2.Z == 3 && !t0Var2.y && (i13 = t0Var2.a0) != 1) {
                                t0Var2.w = z10;
                                if (i13 == 3) {
                                    t0Var2.v(z10);
                                    jVar2.T(false);
                                } else {
                                    t0Var2.v(false);
                                    jVar2.T(z10);
                                }
                                t0Var2.o();
                                n40Var2.C();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        int L = org.telegram.messenger.g0.L(24.0f);
        this.N = L;
        zg0 zg0Var = new zg0(R.raw.roundcamera_flip, L, L);
        this.c0 = zg0Var;
        zg0Var.setCallback(n2Var);
        zg0Var.M(zg0Var.e[0] - 1);
        n2Var.setImageDrawable(zg0Var);
        C();
        if (f6Var != null && !f6Var.a()) {
            n2Var.setInvert(0.6f);
            n2Var2.setInvert(0.6f);
        }
        ImageView imageView = new ImageView(activity);
        this.H = imageView;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.video_mute);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ha.e(48, 48, 17));
        k40Var.setOnTouchListener(new zj(this, i7));
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
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var == null || (s0Var = this.Q) == null) {
            return 0L;
        }
        return s0Var.a == 3 ? t0Var.j() : s0Var.b;
    }

    public static void m(n40 n40Var) {
        if (n40Var.n0 && n40Var.q0 && n40Var.o0 && n40Var.p0) {
            n40Var.n0 = false;
            org.telegram.messenger.a8.b("RoundVideo camera flip completed: elapsedMs=" + n40Var.getCameraFlipElapsedMs());
            n40Var.B();
        }
    }

    public static void n(n40 n40Var) {
        org.telegram.ui.pk pkVar = n40Var.D;
        if (n40Var.l0) {
            n40Var.l0 = false;
            pkVar.invalidate();
            pkVar.animate().cancel();
            pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecordingUiFrameClockActive(boolean z9) {
        org.telegram.ui.qj qjVar;
        if (z9 == this.G0) {
            return;
        }
        this.G0 = z9;
        this.F0 = 0L;
        i40 i40Var = this.I0;
        if (z9) {
            bg.k.d().a(30, i40Var);
        } else {
            bg.k.d().f(i40Var);
        }
        if (this.d == z9) {
            return;
        }
        this.d = z9;
        r40 r40Var = this.c;
        if (r40Var == null || (qjVar = ((org.telegram.ui.wi) r40Var).a.Z) == null) {
            return;
        }
        qjVar.setRoundVideoUiFrameClockActive(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlashEnabled(boolean z9) {
        Activity parentActivity = this.e.getParentActivity();
        if (parentActivity == null) {
            parentActivity = org.telegram.messenger.g0.W(getContext());
        }
        if (parentActivity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = parentActivity.getWindow().getAttributes();
        fi.p2 p2Var = this.I;
        if (z9) {
            if (Float.isNaN(this.D0)) {
                this.D0 = attributes.screenBrightness;
            }
            attributes.screenBrightness = 1.0f;
            p2Var.c(null);
        } else {
            if (!Float.isNaN(this.D0)) {
                attributes.screenBrightness = this.D0;
                this.D0 = Float.NaN;
            }
            p2Var.d();
        }
        parentActivity.getWindow().setAttributes(attributes);
    }

    public final void A() {
        if (this.C0) {
            this.C0 = false;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 512);
        }
    }

    public final void B() {
        wi.l0 l0Var;
        wi.s0 s0Var = this.Q;
        boolean z9 = false;
        boolean z10 = (s0Var == null || s0Var.a != 3 || s0Var.f || this.n0) ? false : true;
        this.F.setEnabled(z10);
        if (z10 && (l0Var = this.R) != null && l0Var.b != 1) {
            z9 = true;
        }
        this.G.setEnabled(z9);
        C();
    }

    public final void C() {
        wi.s0 s0Var = this.Q;
        int i7 = this.N;
        fi.n2 n2Var = this.G;
        if (s0Var == null || !s0Var.g) {
            if (this.d0 == null) {
                zg0 zg0Var = new zg0(R.raw.roundcamera_flash_on, i7, i7);
                this.d0 = zg0Var;
                zg0Var.setCallback(n2Var);
            }
            n2Var.setImageDrawable(this.d0);
            return;
        }
        if (this.e0 == null) {
            zg0 zg0Var2 = new zg0(R.raw.roundcamera_flash_off, i7, i7);
            this.e0 = zg0Var2;
            zg0Var2.setCallback(n2Var);
        }
        n2Var.setImageDrawable(this.e0);
    }

    public final void D() {
        org.telegram.ui.qj qjVar;
        wi.s0 s0Var = this.Q;
        if (s0Var != null) {
            long j3 = s0Var.d;
            if (s0Var.a != 3) {
                return;
            }
            long min = Math.min(j3, (SystemClock.elapsedRealtime() + s0Var.b) - s0Var.c);
            this.u0 = min;
            this.w.setProgress(min / j3);
            r40 r40Var = this.c;
            if (r40Var == null || (qjVar = ((org.telegram.ui.wi) r40Var).a.Z) == null || !qjVar.j1) {
                return;
            }
            qjVar.i1 = min;
            fg fgVar = qjVar.Y0;
            if (fgVar != null && fgVar.r) {
                fgVar.h = min;
                fgVar.invalidate();
            }
            cg cgVar = qjVar.l1;
            if (cgVar != null && cgVar.n) {
                if (!cgVar.h) {
                    long j10 = cgVar.r;
                    if (j10 >= 0) {
                        if (!cgVar.e) {
                            long max = Math.max(0L, min - j10) % 1200;
                            cgVar.a = max < 600 ? 1.0f - (max / 600.0f) : (max - 600) / 600.0f;
                        }
                        cgVar.invalidate();
                    }
                }
                cgVar.r = min;
                cgVar.a = 1.0f;
                cgVar.invalidate();
            }
            ChatActivityEnterView.SlideTextView slideTextView = qjVar.k1;
            if (slideTextView == null || !slideTextView.J || slideTextView.n == 1.0f) {
                return;
            }
            slideTextView.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void a(boolean z9) {
        wi.t0 t0Var = this.O;
        if (t0Var == null || !t0Var.a()) {
            return;
        }
        this.U = null;
        x(z9 ? 0 : 6);
        gy0 gy0Var = this.S;
        if (gy0Var != null) {
            gy0Var.d(true);
        }
        this.S = null;
        MediaController.B().Y(false);
        z(false, false);
    }

    @Override // org.telegram.ui.Components.t40
    public final void b(float f10, int i7) {
        wi.s0 s0Var;
        if (this.O == null || (s0Var = this.Q) == null || s0Var.a != 5) {
            return;
        }
        p();
        if (i7 == 0) {
            this.O.r();
            return;
        }
        if (i7 == 1) {
            this.O.p();
            return;
        }
        if (i7 == 2) {
            wi.t0 t0Var = this.O;
            long j3 = (long) (f10 * this.Q.b);
            t0Var.getClass();
            wi.t0.u();
            if (t0Var.Z != 5 || t0Var.V == null) {
                return;
            }
            long j10 = t0Var.J;
            t0Var.V.Z0(5, Math.max(j10, Math.min(Math.max(j10, t0Var.K - 1), j3)));
            t0Var.d.getClass();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public final void c(boolean z9) {
        setRecordingUiFrameClockActive(false);
        r();
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        wi.t0 t0Var = this.O;
        if (t0Var != null) {
            wi.t0.u();
            int i7 = t0Var.Z;
            if (i7 == 10) {
                if (!t0Var.F) {
                    t0Var.i();
                }
            } else if (i7 != 8) {
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
            this.O = null;
        }
        gy0 gy0Var = this.S;
        if (gy0Var != null) {
            gy0Var.d(true ^ this.j0);
            this.S = null;
        }
        setScreenFlashEnabled(false);
        MediaController.B().Y(false);
        A();
        l40 l40Var = this.s;
        l40Var.setTranslationX(0.0f);
        this.w0 = 0.0f;
        l40Var.setTranslationY(0.0f + this.v0);
        l40Var.setImageReceiver(null);
        MediaController.B().c0();
    }

    @Override // org.telegram.ui.Components.t40
    public final boolean e() {
        wi.s0 s0Var = this.Q;
        if (s0Var == null) {
            return false;
        }
        int i7 = s0Var.a;
        return i7 == 4 || i7 == 5 || i7 == 6;
    }

    @Override // org.telegram.ui.Components.t40
    public final void f(float f10) {
        float f11 = f10 * 0.5f;
        this.v0 = f11;
        this.s.setTranslationY(this.w0 + f11);
    }

    @Override // org.telegram.ui.Components.t40
    public final void g(int i7, int i10, int i11, long j3, long j10, boolean z9) {
        if (this.O == null || this.Q == null) {
            return;
        }
        if (i7 == 3) {
            w();
            return;
        }
        if ((i7 == 1 || i7 == 4) && this.U == null) {
            long currentDurationMs = getCurrentDurationMs();
            if (currentDurationMs < 800) {
                org.telegram.messenger.qs.f(this.f).k(org.telegram.messenger.qs.t2, Integer.valueOf(this.h), Boolean.TRUE, Integer.valueOf((int) currentDurationMs));
                a(false);
                return;
            }
            if (this.Q.a == 3) {
                x(5);
            }
            this.g0 = false;
            this.U = new m40(i10, i11, j3, j10, z9);
            t();
        }
    }

    @Override // org.telegram.ui.Components.t40
    public View getButtonsLayout() {
        return this.E;
    }

    @Override // org.telegram.ui.Components.t40
    public q40 getCameraContainer() {
        return this.s;
    }

    @Override // org.telegram.ui.Components.t40
    public RectF getCameraRect() {
        k40 k40Var = this.y;
        int[] iArr = this.J;
        k40Var.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], k40Var.getWidth() + r3, k40Var.getHeight() + iArr[1]);
    }

    @Override // org.telegram.ui.Components.t40
    public View getMuteImageView() {
        return this.H;
    }

    @Override // org.telegram.ui.Components.t40
    public Paint getPaint() {
        return this.w.getPaint();
    }

    @Override // org.telegram.ui.Components.t40
    public TextureView getTextureView() {
        return this.y;
    }

    @Override // org.telegram.ui.Components.t40
    public final void h(dh.c cVar, org.telegram.ui.oi oiVar) {
        LinearLayout linearLayout = this.E;
        fh.g c10 = cVar.c(linearLayout, oiVar, false);
        c10.q(org.telegram.messenger.g0.L(6.0f));
        c10.r(org.telegram.messenger.g0.L(21.0f));
        linearLayout.setBackground(c10);
    }

    @Override // org.telegram.ui.Components.t40
    public final void i(boolean z9) {
        if (this.O != null) {
            return;
        }
        setVisibility(0);
        this.w.getPaint().setAlpha(org.telegram.messenger.qs.e4);
        this.j0 = false;
        this.i0 = false;
        this.U = null;
        this.V = false;
        this.f0 = false;
        this.h0 = false;
        this.u0 = 0L;
        this.w.setProgress(0.0f);
        org.telegram.ui.pk pkVar = this.D;
        if (!this.l0) {
            if (this.t0 == null) {
                try {
                    this.t0 = BitmapFactory.decodeFile(new File(org.telegram.messenger.t0.h(), "icthumb.jpg").getAbsolutePath());
                } catch (Throwable unused) {
                }
            }
            Bitmap bitmap = this.t0;
            if (bitmap != null) {
                pkVar.setImageBitmap(bitmap);
            } else {
                pkVar.setImageResource(R.drawable.icplaceholder);
            }
            this.l0 = true;
            pkVar.animate().cancel();
            pkVar.setAlpha(1.0f);
            pkVar.invalidate();
        }
        this.S = new gy0(this.f, this.n);
        this.P = (wi.r0) xi.e.e.a();
        wi.k0 k0Var = new wi.k0(getContext(), this.y);
        k0Var.c = new File(org.telegram.messenger.t0.h(), "cache");
        k0Var.d = (wi.m0) xi.e.j.a();
        k0Var.e = this.P;
        k0Var.h = xi.e.h.a();
        k0Var.f = (wi.n0) xi.e.f.a();
        k0Var.g = (wi.o0) xi.e.g.a();
        xi.a aVar = xi.e.i;
        aVar.a();
        k0Var.i = aVar.d;
        qt qtVar = this.J0;
        k0Var.j = qtVar;
        gy0 gy0Var = this.S;
        k0Var.k = gy0Var;
        k0Var.l = new ax(this, 5);
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
        if (qtVar == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (gy0Var == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.O = new wi.t0(k0Var);
        MediaController.B().Y(true);
        wi.t0 t0Var = this.O;
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

    @Override // org.telegram.ui.Components.t40
    public final void j() {
        wi.s0 s0Var;
        wi.t0 t0Var = this.O;
        if (t0Var == null || (s0Var = this.Q) == null) {
            return;
        }
        int i7 = s0Var.a;
        if (i7 == 3) {
            w();
            return;
        }
        if (i7 == 5) {
            wi.t0.u();
            if (t0Var.Z != 5 || t0Var.K - t0Var.J >= t0Var.q) {
                return;
            }
            t0Var.P++;
            t0Var.D = false;
            t0Var.m.b("resume requested: trim=" + t0Var.J + ".." + t0Var.K + ", sourceDurationMs=" + t0Var.H);
            t0Var.s();
            t0Var.w(6);
            t0Var.j.execute(new fi.q1(t0Var, t0Var.l(), t0Var.T, t0Var.S, t0Var.U));
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
    public final void onMeasure(int i7, int i10) {
        int i11 = ((float) (View.MeasureSpec.getSize(i10) - getPaddingBottom())) > ((float) View.MeasureSpec.getSize(i7)) * 1.3f ? org.telegram.messenger.g0.v : org.telegram.messenger.g0.u;
        if (this.E0 != i11) {
            this.E0 = i11;
            l40 l40Var = this.s;
            l40Var.getLayoutParams().width = org.telegram.messenger.g0.L(28.0f) + i11;
            l40Var.getLayoutParams().height = org.telegram.messenger.g0.L(28.0f) + i11;
            ((FrameLayout.LayoutParams) this.H.getLayoutParams()).topMargin = (i11 / 2) - org.telegram.messenger.g0.L(24.0f);
        }
        super.onMeasure(i7, i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        fi.p2 p2Var = this.I;
        p2Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        p2Var.c.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getAction() != 0 || motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i7) {
        wi.t0 t0Var;
        wi.s0 s0Var;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0 || (t0Var = this.O) == null || (s0Var = this.Q) == null) {
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
        org.telegram.messenger.j20 j20Var;
        if (this.O == null || (s0Var = this.Q) == null || (j20Var = this.T) == null) {
            return;
        }
        long j3 = s0Var.b;
        long max = Math.max(0L, j20Var.a);
        long j10 = this.T.b;
        if (j10 >= 0) {
            j3 = Math.min(j3, j10);
        }
        wi.t0 t0Var = this.O;
        t0Var.getClass();
        wi.t0.u();
        if (t0Var.Z != 5) {
            return;
        }
        long max2 = Math.max(0L, Math.min(t0Var.H, max));
        long max3 = Math.max(max2, Math.min(t0Var.H, j3));
        if (max3 - max2 < Math.min(800L, t0Var.H)) {
            return;
        }
        t0Var.J = max2;
        t0Var.K = max3;
        l2.i0 i0Var = t0Var.V;
        if (i0Var != null) {
            i0Var.Z0(5, max2);
        }
        t0Var.d.getClass();
        t0Var.o();
    }

    public final Bitmap q(Bitmap bitmap) {
        k40 k40Var = this.y;
        if (k40Var.getWidth() > 0 && k40Var.getHeight() > 0) {
            Matrix matrix = this.K;
            k40Var.getTransform(matrix);
            if (!matrix.isIdentity()) {
                float[] fArr = this.L;
                matrix.getValues(fArr);
                float width = bitmap.getWidth() / k40Var.getWidth();
                float height = bitmap.getHeight() / k40Var.getHeight();
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

    public final org.telegram.messenger.j20 s(File file, long j3, fy0 fy0Var) {
        wi.o0 o0Var;
        org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
        j20Var.a = -1L;
        j20Var.b = -1L;
        j20Var.r = j3;
        j20Var.q = Math.max(1L, fy0Var == null ? file.length() : fy0Var.a);
        j20Var.s = true;
        wi.t0 t0Var = this.O;
        j20Var.n = (t0Var == null || (o0Var = t0Var.u) == null) ? 30 : o0Var.a;
        wi.r0 r0Var = this.P;
        int i7 = r0Var == null ? 480 : r0Var.a;
        j20Var.h = i7;
        j20Var.k = i7;
        j20Var.i = i7;
        j20Var.l = i7;
        j20Var.o = file.getAbsolutePath();
        if (fy0Var != null) {
            j20Var.w = fy0Var.b;
            j20Var.x = fy0Var.c;
            j20Var.y = fy0Var.d;
            j20Var.z = fy0Var.e;
        }
        return j20Var;
    }

    @Override // org.telegram.ui.Components.t40
    public void setInternalPadding(int i7) {
        setPadding(0, 0, 0, i7);
    }

    @Override // org.telegram.ui.Components.t40
    public void setIsMessageTransition(boolean z9) {
        this.s.getClass();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        this.E.setAlpha(0.0f);
        l40 l40Var = this.s;
        l40Var.setAlpha(0.0f);
        l40Var.setScaleX(0.1f);
        l40Var.setScaleY(0.1f);
        l40Var.setTranslationX(0.0f);
        ImageView imageView = this.H;
        imageView.setAlpha(0.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        this.w.getPaint().setAlpha(0);
        try {
            Activity activity = (Activity) getContext();
            if (i7 == 0) {
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
        if (this.U == null || this.V || this.O == null || (s0Var = this.Q) == null) {
            return;
        }
        int i7 = s0Var.a;
        if (i7 == 5) {
            p();
        } else if (i7 != 3) {
            return;
        }
        wi.t0 t0Var = this.O;
        boolean z9 = this.i0;
        boolean z10 = !z9;
        t0Var.getClass();
        wi.t0.u();
        int i10 = t0Var.Z;
        boolean z11 = false;
        if (i10 == 3 || i10 == 5) {
            t0Var.m.b("finish requested: state=" + rf.b.t(t0Var.Z) + ", includeAudio=" + z10 + ", durationMs=" + t0Var.j() + ", trim=" + t0Var.J + ".." + t0Var.K);
            t0Var.B = z10;
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
                t0Var.j.execute(new bi.sb(t0Var, t0Var.T, t0Var.l() || z9, t0Var.U, z10, t0Var.l() ? 1 : 2, t0Var.S));
            }
            z11 = true;
        }
        this.V = z11;
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
            this.a0.addUpdateListener(new h40(this, 1));
            this.a0.start();
        }
    }

    public final void v(boolean z9) {
        if (this.m0) {
            this.m0 = false;
            org.telegram.ui.pk pkVar = this.D;
            pkVar.animate().cancel();
            if (z9) {
                pkVar.animate().alpha(0.0f).setDuration(120L).setInterpolator(new DecelerateInterpolator()).start();
            } else {
                pkVar.setAlpha(0.0f);
            }
        }
    }

    public final void w() {
        wi.s0 s0Var;
        if (this.O == null || (s0Var = this.Q) == null || s0Var.a != 3) {
            return;
        }
        x(2);
        this.O.q();
    }

    public final void x(int i7) {
        if (this.h0 && i7 == 2) {
            return;
        }
        this.h0 = true;
        org.telegram.messenger.qs.f(this.f).k(org.telegram.messenger.qs.n2, Integer.valueOf(this.h), Integer.valueOf(i7));
    }

    public final void y(boolean z9) {
        Bitmap bitmap;
        k40 k40Var = this.y;
        if (k40Var.isAvailable() && (bitmap = k40Var.getBitmap(org.telegram.messenger.qs.K2, org.telegram.messenger.qs.K2)) != null) {
            try {
                if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && bitmap.getPixel(bitmap.getWidth() / 2, bitmap.getHeight() / 2) != 0) {
                    bitmap = q(bitmap);
                    Utilities.stackBlurBitmap(bitmap, 15);
                    Bitmap bitmap2 = this.t0;
                    this.t0 = bitmap;
                    if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
                        bitmap2.recycle();
                    }
                    if (z9) {
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

    public final void z(boolean z9, boolean z10) {
        p40 p40Var = this.a;
        if (p40Var != null) {
            ((org.telegram.ui.fe) p40Var).b.Zc.a(z9, true);
        }
        AnimatorSet animatorSet = this.W;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.W.cancel();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            pipRoundVideoView.e(!z9);
        }
        l40 l40Var = this.s;
        if (z9 && !this.k0) {
            l40Var.setTranslationX(0.0f);
            float measuredHeight = getMeasuredHeight() * 0.5f;
            this.w0 = measuredHeight;
            l40Var.setTranslationY(measuredHeight + this.v0);
        }
        this.k0 = z9;
        View view = this.r;
        if (view != null) {
            view.invalidate();
        }
        float L = (z9 || Math.max(getCurrentDurationMs(), this.u0) <= 300) ? 0.0f : org.telegram.messenger.g0.L(24.0f) - (getMeasuredWidth() * 0.5f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z9 ? 1.0f : 0.0f, z9 ? 0.0f : 1.0f);
        ofFloat.addUpdateListener(new h40(this, 0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.W = animatorSet2;
        float[] fArr = {z9 ? 1.0f : 0.0f};
        LinearLayout linearLayout = this.E;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, fArr), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) property, z9 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) View.SCALE_X, z9 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) View.SCALE_Y, z9 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(l40Var, (Property<l40, Float>) View.TRANSLATION_X, L), ObjectAnimator.ofFloat(this.H, (Property<ImageView, Float>) property, (this.i0 && z9) ? 1.0f : 0.0f), ofFloat);
        this.W.setDuration(180L);
        this.W.setInterpolator(new DecelerateInterpolator());
        if (z9) {
            setTranslationX(0.0f);
        } else {
            this.W.addListener(new z5(this, 29));
        }
        this.W.start();
    }
}
