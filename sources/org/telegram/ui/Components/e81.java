package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e81 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public float K;
    public int L;
    public long M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public final d81 a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final c81 k;
    public final c81 l;
    public final org.telegram.utils.twidget.f0 m;
    public final c81 n;
    public org.telegram.utils.twidget.n1 o;
    public org.telegram.utils.twidget.d1 p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.ui.Components.c81] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Components.c81] */
    /* JADX WARN: Type inference failed for: r1v14, types: [org.telegram.ui.Components.c81] */
    public e81(d81 d81Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        final int i7 = 0;
        this.k = new Runnable(this) { // from class: org.telegram.ui.Components.c81
            public final /* synthetic */ e81 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (i7) {
                    case 0:
                        this.b.l(false, false, false);
                        break;
                    case 1:
                        e81 e81Var = this.b;
                        if (e81Var.w && e81Var.x) {
                            e81Var.a(e81Var.m.f(SystemClock.uptimeMillis()));
                            e81Var.p();
                            break;
                        }
                        break;
                    default:
                        e81 e81Var2 = this.b;
                        if (e81Var2.o != null && (d1Var = e81Var2.p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = e81Var2.o;
                            if (d == n1Var) {
                                n1Var.a.f();
                                e81Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.c81
            public final /* synthetic */ e81 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (i10) {
                    case 0:
                        this.b.l(false, false, false);
                        break;
                    case 1:
                        e81 e81Var = this.b;
                        if (e81Var.w && e81Var.x) {
                            e81Var.a(e81Var.m.f(SystemClock.uptimeMillis()));
                            e81Var.p();
                            break;
                        }
                        break;
                    default:
                        e81 e81Var2 = this.b;
                        if (e81Var2.o != null && (d1Var = e81Var2.p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = e81Var2.o;
                            if (d == n1Var) {
                                n1Var.a.f();
                                e81Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.m = new org.telegram.utils.twidget.f0();
        final int i11 = 2;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Components.c81
            public final /* synthetic */ e81 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (i11) {
                    case 0:
                        this.b.l(false, false, false);
                        break;
                    case 1:
                        e81 e81Var = this.b;
                        if (e81Var.w && e81Var.x) {
                            e81Var.a(e81Var.m.f(SystemClock.uptimeMillis()));
                            e81Var.p();
                            break;
                        }
                        break;
                    default:
                        e81 e81Var2 = this.b;
                        if (e81Var2.o != null && (d1Var = e81Var2.p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = e81Var2.o;
                            if (d == n1Var) {
                                n1Var.a.f();
                                e81Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.L = -1;
        this.a = d81Var;
        this.b = f10;
        paint.setTextSize(f10 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int k(MotionEvent motionEvent) {
        int metaState = motionEvent.getMetaState();
        return ((metaState & 2) != 0 ? 1 : 0) | ((metaState & TLObject.FLAG_12) != 0 ? 2 : 0) | ((65536 & metaState) != 0 ? 4 : 0) | ((metaState & 1) != 0 ? 8 : 0);
    }

    public final void a(int i7) {
        if (i7 == -1) {
            return;
        }
        this.L = i7;
        if ((i7 & 32) != 0 && !this.A) {
            this.A = true;
            org.telegram.utils.twidget.d1 d1Var = this.p;
            float f10 = this.P;
            float f11 = this.Q;
            boolean z10 = this.E;
            int i10 = this.I;
            int i11 = this.H;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f;
            if (p1Var != null) {
                p1Var.i(3, f10, f11, 0, true, z10, i10, i11);
            }
        }
        int i12 = i7 & 3;
        d81 d81Var = this.a;
        if (i12 == 2) {
            h();
            if (((i7 >> 6) & 7) != 1 || this.D) {
                return;
            }
            this.D = true;
            d81Var.d();
            return;
        }
        if (i12 == 1 && o() && !this.C) {
            if (this.B) {
                d81Var.b(true);
            } else {
                i();
            }
        }
    }

    public final void b(org.telegram.utils.twidget.d1 d1Var) {
        if (this.p == d1Var) {
            return;
        }
        r();
        this.p = d1Var;
        if (d1Var == null) {
            return;
        }
        d1Var.h = this;
        d1Var.k(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, int i7) {
        org.telegram.utils.twidget.p1 p1Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        char c10;
        double d;
        int i12;
        float[] fArr;
        char c11;
        float[] fArr2;
        this.R = i7;
        org.telegram.utils.twidget.d1 d1Var = this.p;
        org.telegram.utils.twidget.n1 d2 = d1Var == null ? null : d1Var.d();
        float f10 = this.b;
        if (d2 != null) {
            org.telegram.utils.twidget.o1[] o1VarArr = d2.b;
            org.telegram.utils.twidget.d0 d0Var = d2.a;
            int i13 = d2.d;
            if (i13 > 0) {
                if (!d2.a()) {
                    this.p.c();
                }
                org.telegram.utils.twidget.n1 n1Var = this.o;
                boolean z14 = true;
                if (d2 != n1Var) {
                    boolean z15 = n1Var == null;
                    this.o = d2;
                    Handler handler = this.c;
                    c81 c81Var = this.n;
                    handler.removeCallbacks(c81Var);
                    if (org.telegram.messenger.bz.K0) {
                        if (z15) {
                            d0Var.f();
                        } else {
                            handler.postDelayed(c81Var, 333L);
                        }
                    }
                }
                boolean z16 = Math.abs(i13 - i7) > 1;
                if (z16) {
                    canvas.save();
                    float f11 = i7 / i13;
                    canvas.scale(f11, f11);
                }
                char c12 = 0;
                d0Var.c(canvas, 1.0f);
                if (o1VarArr.length > 0) {
                    double nanoTime = (System.nanoTime() / 1.0E9d) + d2.c;
                    int length = o1VarArr.length;
                    int i14 = 0;
                    boolean z17 = false;
                    while (i14 < length) {
                        org.telegram.utils.twidget.o1 o1Var = o1VarArr[i14];
                        float[] fArr3 = o1Var.g;
                        float[] fArr4 = o1Var.c;
                        org.telegram.utils.twidget.d0 d0Var2 = o1Var.a;
                        boolean z18 = z14;
                        int length2 = fArr3.length / 8;
                        if (length2 == 0 || !d0Var2.e()) {
                            i10 = length;
                            z13 = z16;
                            i11 = i14;
                            c10 = c12;
                        } else {
                            i11 = i14;
                            i10 = length;
                            double max = Math.max(0.0d, nanoTime - o1Var.d);
                            double d10 = o1Var.e;
                            if (d10 <= 0.0d) {
                                d = 1.0d;
                            } else if (o1Var.f) {
                                d = (max % d10) / d10;
                                z17 = z18 ? 1 : 0;
                            } else {
                                double min = Math.min(1.0d, max / d10);
                                z17 |= min < 1.0d ? z18 ? 1 : 0 : false;
                                d = min;
                            }
                            float[] fArr5 = o1Var.g;
                            float f12 = (float) d;
                            int i15 = 0;
                            while (true) {
                                i12 = i15 + 1;
                                if (i12 >= length2 || fArr5[i12 * 8] > f12) {
                                    break;
                                }
                                i15 = i12;
                            }
                            int min2 = Math.min(i12, length2 - 1);
                            int i16 = i15 * 8;
                            float f13 = fArr5[i16];
                            int i17 = min2 * 8;
                            float f14 = fArr5[i17];
                            float max2 = Math.max(0.0f, Math.min(1.0f, (min2 == i15 || f14 <= f13) ? 0.0f : (f12 - f13) / (f14 - f13)));
                            int i18 = 0;
                            while (true) {
                                z13 = z16;
                                fArr = this.g;
                                if (i18 >= 7) {
                                    break;
                                }
                                float f15 = fArr5[i16 + 1 + i18];
                                fArr[i18] = com.google.android.gms.internal.vision.e2.z(fArr5[i17 + 1 + i18], f15, max2, f15);
                                i18++;
                                z16 = z13;
                            }
                            canvas.save();
                            float[] fArr6 = o1Var.b;
                            if (fArr6 != null) {
                                float f16 = fArr6[0];
                                float f17 = f16 * f10;
                                float f18 = fArr6[z18 ? 1 : 0];
                                char c13 = 7;
                                float f19 = f18 * f10;
                                float f20 = (f16 + fArr6[2]) * f10;
                                float f21 = (f18 + fArr6[3]) * f10;
                                RectF rectF = this.i;
                                rectF.set(f17, f19, f20, f21);
                                if (fArr4 == null) {
                                    canvas.clipRect(rectF);
                                    c11 = c13;
                                } else {
                                    int i19 = 0;
                                    while (true) {
                                        fArr2 = this.j;
                                        if (i19 >= 8) {
                                            break;
                                        }
                                        fArr2[i19] = fArr4[i19] * f10;
                                        i19++;
                                    }
                                    Path path = this.h;
                                    path.rewind();
                                    path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                                    canvas.clipPath(path);
                                    c11 = c13;
                                }
                            } else {
                                c11 = 7;
                            }
                            float f22 = fArr[0];
                            float[] fArr7 = this.f;
                            fArr7[0] = f22;
                            fArr7[z18 ? 1 : 0] = fArr[2];
                            fArr7[2] = fArr[4] * f10;
                            fArr7[3] = fArr[z18 ? 1 : 0];
                            fArr7[4] = fArr[3];
                            fArr7[5] = fArr[5] * f10;
                            fArr7[6] = 0.0f;
                            fArr7[c11] = 0.0f;
                            c10 = 0;
                            fArr7[8] = 1.0f;
                            Matrix matrix = this.e;
                            matrix.setValues(fArr7);
                            canvas.concat(matrix);
                            d0Var2.c(canvas, Math.max(0.0f, Math.min(1.0f, fArr[6])));
                            canvas.restore();
                        }
                        char c14 = c10;
                        i14 = i11 + 1;
                        c12 = c14;
                        z14 = z18 ? 1 : 0;
                        length = i10;
                        z16 = z13;
                    }
                    z10 = z16;
                    boolean z19 = z14;
                    z11 = false;
                    if (z17 && this.q) {
                        z12 = z19;
                        if (z10) {
                            canvas.restore();
                        }
                        return z12;
                    }
                } else {
                    z10 = z16;
                    z11 = false;
                }
                z12 = z11;
                if (z10) {
                }
                return z12;
            }
        }
        if (this.r) {
            return false;
        }
        org.telegram.utils.twidget.d1 d1Var2 = this.p;
        if (d1Var2 != null) {
            d1Var2.c();
        }
        org.telegram.utils.twidget.d1 d1Var3 = this.p;
        canvas.drawText(org.telegram.messenger.gd.N0(((d1Var3 != null && (p1Var = d1Var3.f) != null) ? p1Var.U : null) == null ? 2131742604 : 2131742605, null), 12.0f * f10, f10 * 28.0f, this.d);
        return false;
    }

    public final void d() {
        if (this.F) {
            this.F = false;
            org.telegram.utils.twidget.d1 d1Var = this.p;
            if (d1Var != null && !this.r) {
                float f10 = this.J;
                float f11 = this.K;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f;
                if (p1Var != null) {
                    long j3 = p1Var.v;
                    if (!p1Var.A && j3 != 0) {
                        p1Var.c.f(j3, 1, f10, f11, 0);
                    }
                }
            }
            this.a.f("auto");
        }
    }

    public final void e() {
        c81 c81Var = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(c81Var);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.d1 d1Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (!this.w || this.A || (d1Var = this.p) == null) {
            return;
        }
        this.A = true;
        float f10 = this.P;
        float f11 = this.Q;
        boolean z10 = this.E;
        int i7 = this.I;
        int i10 = this.H;
        org.telegram.utils.twidget.p1 p1Var = d1Var.f;
        if (p1Var != null) {
            p1Var.i(3, f10, f11, 0, true, z10, i7, i10);
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.d1 d1Var = this.p;
            if (d1Var != null) {
                float f10 = this.N;
                float f11 = this.O;
                boolean z10 = this.E;
                int i7 = this.I;
                int i10 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f;
                if (p1Var != null) {
                    p1Var.i(0, f10, f11, 0, true, z10, i7, i10);
                }
            }
        }
    }

    public final void h() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.B) {
            this.a.b(false);
        }
    }

    public final void i() {
        if (this.B || this.C) {
            return;
        }
        this.B = true;
        this.a.b(true);
    }

    public final float j(float f10) {
        int i7;
        return (!org.telegram.messenger.gd.a0 || (i7 = this.R) <= 0) ? f10 : (i7 / this.b) - f10;
    }

    public final void l(boolean z10, boolean z11, boolean z12) {
        if (!this.w || this.x) {
            return;
        }
        this.c.removeCallbacks(this.k);
        this.x = true;
        int b10 = this.m.b(this.M, j(this.N), this.O, z10, z11, z12, this.E, this.H);
        boolean z13 = false;
        boolean z14 = (b10 & 2048) != 0;
        this.y = z10 && !z14;
        if (z12 && !z14) {
            z13 = true;
        }
        this.z = z13;
        a(b10);
        if (this.P != this.N || this.Q != this.O) {
            a(this.m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
        }
        if (this.y || this.z || this.E) {
            i();
            if ((this.y || this.E) && !this.C) {
                this.a.b(true);
            }
        } else {
            h();
        }
        p();
    }

    public final void m(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.d1 d1Var;
        org.telegram.utils.twidget.p1 p1Var;
        float f10 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (!z10 || actionMasked == 10 || (d1Var = this.p) == null || this.r || (p1Var = d1Var.f) == null || !p1Var.I) {
            d();
            return;
        }
        this.F = true;
        this.J = motionEvent.getX() / f10;
        float y10 = motionEvent.getY() / f10;
        this.K = y10;
        org.telegram.utils.twidget.d1 d1Var2 = this.p;
        float f11 = this.J;
        int k10 = k(motionEvent);
        org.telegram.utils.twidget.p1 p1Var2 = d1Var2.f;
        if (p1Var2 != null) {
            long j3 = p1Var2.v;
            if (p1Var2.A || j3 == 0) {
                return;
            }
            p1Var2.c.f(j3, 0, f11, y10, k10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r3 != 6) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(MotionEvent motionEvent) {
        org.telegram.utils.twidget.p1 p1Var;
        int i7;
        int actionMasked;
        int actionIndex;
        int pointerCount;
        float f10;
        int actionMasked2 = motionEvent.getActionMasked();
        boolean z10 = this.w;
        boolean z11 = z10 && (actionMasked2 == 1 || actionMasked2 == 3);
        org.telegram.utils.twidget.d1 d1Var = this.p;
        if (d1Var != null && !this.r && ((((p1Var = d1Var.f) != null && p1Var.I) || z11) && (actionMasked2 != 3 || z10))) {
            int actionMasked3 = motionEvent.getActionMasked();
            if (actionMasked3 != 0) {
                if (actionMasked3 != 1) {
                    if (actionMasked3 == 2) {
                        i7 = 1;
                    } else if (actionMasked3 == 3) {
                        i7 = 3;
                    } else if (actionMasked3 != 5) {
                    }
                    actionMasked = motionEvent.getActionMasked();
                    float f11 = this.b;
                    if (actionMasked == 0) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (uptimeMillis - this.s < 100 && Math.abs(motionEvent.getX() - this.u) < 1.0f && Math.abs(motionEvent.getY() - this.v) < 1.0f) {
                            if (motionEvent.getDownTime() != 0) {
                                this.t = motionEvent.getDownTime();
                            }
                            if (!this.E && motionEvent.getToolType(0) == 3 && !this.x) {
                                this.E = true;
                                this.H = (motionEvent.getButtonState() & 2) != 0 ? 2 : 0;
                                this.I = k(motionEvent);
                                d();
                            }
                            g();
                            return true;
                        }
                        f();
                        this.s = uptimeMillis;
                        this.t = motionEvent.getDownTime();
                        this.u = motionEvent.getX();
                        this.v = motionEvent.getY();
                        e();
                        this.w = true;
                        boolean z12 = motionEvent.getToolType(0) == 3;
                        this.E = z12;
                        this.H = (!z12 || (motionEvent.getButtonState() & 2) == 0) ? 0 : 2;
                        this.I = k(motionEvent);
                        if (this.E) {
                            d();
                        }
                        this.G = motionEvent.getDownTime() == 0 && motionEvent.getToolType(0) == 0;
                        this.A = false;
                        this.D = false;
                        this.B = false;
                        this.C = false;
                        this.L = -1;
                        this.M = uptimeMillis;
                        float x10 = motionEvent.getX() / f11;
                        this.P = x10;
                        this.N = x10;
                        float y10 = motionEvent.getY() / f11;
                        this.Q = y10;
                        this.O = y10;
                        this.c.postDelayed(this.k, 150L);
                    } else if (this.w && motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6) {
                        this.P = motionEvent.getX() / f11;
                        this.Q = motionEvent.getY() / f11;
                    }
                    if (actionMasked2 != 0) {
                        g();
                    }
                    if (!this.G && (!this.A || actionMasked2 == 0)) {
                        actionIndex = (i7 != 1 || i7 == 3) ? 0 : motionEvent.getActionIndex();
                        pointerCount = (i7 != 1 || i7 == 3) ? motionEvent.getPointerCount() : actionIndex + 1;
                        while (actionIndex < pointerCount) {
                            boolean z13 = (actionIndex == 0 && this.w) ? this.E : motionEvent.getToolType(actionIndex) == 3;
                            org.telegram.utils.twidget.d1 d1Var2 = this.p;
                            float x11 = motionEvent.getX(actionIndex) / f11;
                            float y11 = motionEvent.getY(actionIndex) / f11;
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            boolean z14 = actionIndex == 0;
                            int k10 = k(motionEvent);
                            int i10 = (z13 && actionIndex == 0 && this.w) ? this.H : 0;
                            org.telegram.utils.twidget.p1 p1Var2 = d1Var2.f;
                            if (p1Var2 != null) {
                                f10 = f11;
                                p1Var2.i(i7, x11, y11, pointerId, z14, z13, k10, i10);
                            } else {
                                f10 = f11;
                            }
                            actionIndex++;
                            f11 = f10;
                        }
                    }
                    if (this.w) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        int actionMasked4 = motionEvent.getActionMasked();
                        if (actionMasked4 == 1) {
                            if (!this.x) {
                                l(false, false, false);
                            }
                            a(this.m.g(uptimeMillis2, j(this.P), this.Q));
                            e();
                            h();
                        } else {
                            if (actionMasked4 == 2) {
                                if (this.x) {
                                    a(this.m.d(uptimeMillis2, j(this.P), this.Q));
                                    return true;
                                }
                                i();
                                return true;
                            }
                            if (actionMasked4 == 3) {
                                this.m.a();
                                e();
                                h();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                i7 = 2;
                actionMasked = motionEvent.getActionMasked();
                float f112 = this.b;
                if (actionMasked == 0) {
                }
                if (actionMasked2 != 0) {
                }
                if (!this.G) {
                    if (i7 != 1) {
                    }
                    if (i7 != 1) {
                    }
                    while (actionIndex < pointerCount) {
                    }
                }
                if (this.w) {
                }
                return true;
            }
            i7 = 0;
            actionMasked = motionEvent.getActionMasked();
            float f1122 = this.b;
            if (actionMasked == 0) {
            }
            if (actionMasked2 != 0) {
            }
            if (!this.G) {
            }
            if (this.w) {
            }
            return true;
        }
        return false;
    }

    public final boolean o() {
        int i7 = this.L;
        int i10 = (i7 >> 2) & 7;
        if ((i7 & 3) == 1) {
            return i10 == 4 || i10 == 5 || i10 == 3;
        }
        return false;
    }

    public final void p() {
        Handler handler = this.c;
        c81 c81Var = this.l;
        handler.removeCallbacks(c81Var);
        double c10 = this.m.c();
        if (!this.w || c10 < 0.0d) {
            return;
        }
        handler.postDelayed(c81Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
    }

    public final void q(boolean z10) {
        if (this.q == z10) {
            return;
        }
        this.q = z10;
        org.telegram.utils.twidget.d1 d1Var = this.p;
        if (d1Var == null || this.r) {
            return;
        }
        d1Var.k(z10);
    }

    public final void r() {
        if (this.p == null) {
            return;
        }
        if (this.r) {
            this.r = false;
            this.p = null;
            return;
        }
        f();
        d();
        this.p.k(false);
        org.telegram.utils.twidget.d1 d1Var = this.p;
        if (d1Var.h == this) {
            d1Var.h = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        e();
        this.m.e();
    }
}
