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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p71 {
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
    public final o71 a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final n71 k;
    public final n71 l;
    public final org.telegram.utils.twidget.e0 m;
    public final n71 n;
    public org.telegram.utils.twidget.g1 o;
    public org.telegram.utils.twidget.v0 p;
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

    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.ui.Components.n71] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Components.n71] */
    /* JADX WARN: Type inference failed for: r1v14, types: [org.telegram.ui.Components.n71] */
    public p71(o71 o71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        final int i7 = 0;
        this.k = new Runnable(this) { // from class: org.telegram.ui.Components.n71
            public final /* synthetic */ p71 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (i7) {
                    case 0:
                        this.b.k(false, false, false);
                        break;
                    case 1:
                        p71 p71Var = this.b;
                        if (p71Var.w && p71Var.x) {
                            p71Var.a(p71Var.m.f(SystemClock.uptimeMillis()));
                            p71Var.o();
                            break;
                        }
                        break;
                    default:
                        p71 p71Var2 = this.b;
                        if (p71Var2.o != null && (v0Var = p71Var2.p) != null) {
                            org.telegram.utils.twidget.g1 d = v0Var.d();
                            org.telegram.utils.twidget.g1 g1Var = p71Var2.o;
                            if (d == g1Var) {
                                g1Var.a.f();
                                p71Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.n71
            public final /* synthetic */ p71 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (i10) {
                    case 0:
                        this.b.k(false, false, false);
                        break;
                    case 1:
                        p71 p71Var = this.b;
                        if (p71Var.w && p71Var.x) {
                            p71Var.a(p71Var.m.f(SystemClock.uptimeMillis()));
                            p71Var.o();
                            break;
                        }
                        break;
                    default:
                        p71 p71Var2 = this.b;
                        if (p71Var2.o != null && (v0Var = p71Var2.p) != null) {
                            org.telegram.utils.twidget.g1 d = v0Var.d();
                            org.telegram.utils.twidget.g1 g1Var = p71Var2.o;
                            if (d == g1Var) {
                                g1Var.a.f();
                                p71Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.m = new org.telegram.utils.twidget.e0();
        final int i11 = 2;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Components.n71
            public final /* synthetic */ p71 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (i11) {
                    case 0:
                        this.b.k(false, false, false);
                        break;
                    case 1:
                        p71 p71Var = this.b;
                        if (p71Var.w && p71Var.x) {
                            p71Var.a(p71Var.m.f(SystemClock.uptimeMillis()));
                            p71Var.o();
                            break;
                        }
                        break;
                    default:
                        p71 p71Var2 = this.b;
                        if (p71Var2.o != null && (v0Var = p71Var2.p) != null) {
                            org.telegram.utils.twidget.g1 d = v0Var.d();
                            org.telegram.utils.twidget.g1 g1Var = p71Var2.o;
                            if (d == g1Var) {
                                g1Var.a.f();
                                p71Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.L = -1;
        this.a = o71Var;
        this.b = f10;
        paint.setTextSize(f10 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int j(MotionEvent motionEvent) {
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
            this.p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
        int i10 = i7 & 3;
        o71 o71Var = this.a;
        if (i10 == 2) {
            g();
            if (((i7 >> 6) & 7) != 1 || this.D) {
                return;
            }
            this.D = true;
            o71Var.d();
            return;
        }
        if (i10 == 1 && n() && !this.C) {
            if (this.B) {
                o71Var.b(true);
            } else {
                h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Canvas canvas, int i7) {
        org.telegram.utils.twidget.i1 i1Var;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int i11;
        char c10;
        double d;
        int i12;
        float[] fArr;
        char c11;
        float[] fArr2;
        this.R = i7;
        org.telegram.utils.twidget.v0 v0Var = this.p;
        org.telegram.utils.twidget.g1 d2 = v0Var == null ? null : v0Var.d();
        float f10 = this.b;
        if (d2 != null) {
            org.telegram.utils.twidget.h1[] h1VarArr = d2.b;
            org.telegram.utils.twidget.c0 c0Var = d2.a;
            int i13 = d2.d;
            if (i13 > 0) {
                if (!d2.a()) {
                    this.p.c();
                }
                org.telegram.utils.twidget.g1 g1Var = this.o;
                boolean z13 = true;
                if (d2 != g1Var) {
                    boolean z14 = g1Var == null;
                    this.o = d2;
                    Handler handler = this.c;
                    n71 n71Var = this.n;
                    handler.removeCallbacks(n71Var);
                    if (org.telegram.messenger.iz.K0) {
                        if (z14) {
                            c0Var.f();
                        } else {
                            handler.postDelayed(n71Var, 333L);
                        }
                    }
                }
                boolean z15 = Math.abs(i13 - i7) > 1;
                if (z15) {
                    canvas.save();
                    float f11 = i7 / i13;
                    canvas.scale(f11, f11);
                }
                char c12 = 0;
                c0Var.c(canvas, 1.0f);
                if (h1VarArr.length > 0) {
                    double nanoTime = (System.nanoTime() / 1.0E9d) + d2.c;
                    int length = h1VarArr.length;
                    int i14 = 0;
                    boolean z16 = false;
                    while (i14 < length) {
                        org.telegram.utils.twidget.h1 h1Var = h1VarArr[i14];
                        float[] fArr3 = h1Var.g;
                        float[] fArr4 = h1Var.c;
                        org.telegram.utils.twidget.c0 c0Var2 = h1Var.a;
                        boolean z17 = z13;
                        int length2 = fArr3.length / 8;
                        if (length2 == 0 || !c0Var2.e()) {
                            i10 = length;
                            z12 = z15;
                            i11 = i14;
                            c10 = c12;
                        } else {
                            i11 = i14;
                            i10 = length;
                            double max = Math.max(0.0d, nanoTime - h1Var.d);
                            double d10 = h1Var.e;
                            if (d10 <= 0.0d) {
                                d = 1.0d;
                            } else if (h1Var.f) {
                                d = (max % d10) / d10;
                                z16 = z17 ? 1 : 0;
                            } else {
                                double min = Math.min(1.0d, max / d10);
                                z16 |= min < 1.0d ? z17 ? 1 : 0 : false;
                                d = min;
                            }
                            float[] fArr5 = h1Var.g;
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
                                z12 = z15;
                                fArr = this.g;
                                if (i18 >= 7) {
                                    break;
                                }
                                float f15 = fArr5[i16 + 1 + i18];
                                fArr[i18] = com.google.android.recaptcha.internal.a.z(fArr5[i17 + 1 + i18], f15, max2, f15);
                                i18++;
                                z15 = z12;
                            }
                            canvas.save();
                            float[] fArr6 = h1Var.b;
                            if (fArr6 != null) {
                                float f16 = fArr6[0];
                                float f17 = f16 * f10;
                                float f18 = fArr6[z17 ? 1 : 0];
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
                            fArr7[z17 ? 1 : 0] = fArr[2];
                            fArr7[2] = fArr[4] * f10;
                            fArr7[3] = fArr[z17 ? 1 : 0];
                            fArr7[4] = fArr[3];
                            fArr7[5] = fArr[5] * f10;
                            fArr7[6] = 0.0f;
                            fArr7[c11] = 0.0f;
                            c10 = 0;
                            fArr7[8] = 1.0f;
                            Matrix matrix = this.e;
                            matrix.setValues(fArr7);
                            canvas.concat(matrix);
                            c0Var2.c(canvas, Math.max(0.0f, Math.min(1.0f, fArr[6])));
                            canvas.restore();
                        }
                        char c14 = c10;
                        i14 = i11 + 1;
                        c12 = c14;
                        z13 = z17 ? 1 : 0;
                        length = i10;
                        z15 = z12;
                    }
                    z9 = z15;
                    boolean z18 = z13;
                    z10 = false;
                    if (z16 && this.q) {
                        z11 = z18;
                        if (z9) {
                            canvas.restore();
                        }
                        return z11;
                    }
                } else {
                    z9 = z15;
                    z10 = false;
                }
                z11 = z10;
                if (z9) {
                }
                return z11;
            }
        }
        if (this.r) {
            return false;
        }
        org.telegram.utils.twidget.v0 v0Var2 = this.p;
        if (v0Var2 != null) {
            v0Var2.c();
        }
        org.telegram.utils.twidget.v0 v0Var3 = this.p;
        canvas.drawText(org.telegram.messenger.id.M0(((v0Var3 != null && (i1Var = v0Var3.f) != null) ? i1Var.N : null) == null ? 2131742875 : 2131742876, null), 12.0f * f10, f10 * 28.0f, this.d);
        return false;
    }

    public final void c() {
        if (this.F) {
            this.F = false;
            org.telegram.utils.twidget.v0 v0Var = this.p;
            if (v0Var != null && !this.r) {
                v0Var.e(this.J, this.K, 1, 0);
            }
            this.a.f("auto");
        }
    }

    public final void d() {
        n71 n71Var = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(n71Var);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.v0 v0Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (!this.w || this.A || (v0Var = this.p) == null) {
            return;
        }
        this.A = true;
        v0Var.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.v0 v0Var = this.p;
            if (v0Var != null) {
                v0Var.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.B) {
            this.a.b(false);
        }
    }

    public final void h() {
        if (this.B || this.C) {
            return;
        }
        this.B = true;
        this.a.b(true);
    }

    public final float i(float f10) {
        int i7;
        return (!org.telegram.messenger.id.a0 || (i7 = this.R) <= 0) ? f10 : (i7 / this.b) - f10;
    }

    public final void k(boolean z9, boolean z10, boolean z11) {
        if (!this.w || this.x) {
            return;
        }
        this.c.removeCallbacks(this.k);
        this.x = true;
        int b10 = this.m.b(this.M, i(this.N), this.O, z9, z10, z11, this.E, this.H);
        boolean z12 = false;
        boolean z13 = (b10 & 2048) != 0;
        this.y = z9 && !z13;
        if (z11 && !z13) {
            z12 = true;
        }
        this.z = z12;
        a(b10);
        if (this.P != this.N || this.Q != this.O) {
            a(this.m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
        }
        if (this.y || this.z || this.E) {
            h();
            if ((this.y || this.E) && !this.C) {
                this.a.b(true);
            }
        } else {
            g();
        }
        o();
    }

    public final void l(MotionEvent motionEvent, boolean z9) {
        org.telegram.utils.twidget.v0 v0Var;
        org.telegram.utils.twidget.i1 i1Var;
        int actionMasked = motionEvent.getActionMasked();
        if (!z9 || actionMasked == 10 || (v0Var = this.p) == null || this.r || (i1Var = v0Var.f) == null || !i1Var.C) {
            c();
            return;
        }
        this.F = true;
        float x10 = motionEvent.getX();
        float f10 = this.b;
        this.J = x10 / f10;
        float y10 = motionEvent.getY() / f10;
        this.K = y10;
        this.p.e(this.J, y10, 0, j(motionEvent));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r3 != 6) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(MotionEvent motionEvent) {
        org.telegram.utils.twidget.i1 i1Var;
        int i7;
        int actionMasked;
        int actionIndex;
        int pointerCount;
        int actionMasked2 = motionEvent.getActionMasked();
        boolean z9 = this.w;
        boolean z10 = z9 && (actionMasked2 == 1 || actionMasked2 == 3);
        org.telegram.utils.twidget.v0 v0Var = this.p;
        if (v0Var != null && !this.r && ((((i1Var = v0Var.f) != null && i1Var.C) || z10) && (actionMasked2 != 3 || z9))) {
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
                    float f10 = this.b;
                    if (actionMasked == 0) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (uptimeMillis - this.s < 100 && Math.abs(motionEvent.getX() - this.u) < 1.0f && Math.abs(motionEvent.getY() - this.v) < 1.0f) {
                            if (motionEvent.getDownTime() != 0) {
                                this.t = motionEvent.getDownTime();
                            }
                            if (!this.E && motionEvent.getToolType(0) == 3 && !this.x) {
                                this.E = true;
                                this.H = (motionEvent.getButtonState() & 2) != 0 ? 2 : 0;
                                this.I = j(motionEvent);
                                c();
                            }
                            f();
                            return true;
                        }
                        e();
                        this.s = uptimeMillis;
                        this.t = motionEvent.getDownTime();
                        this.u = motionEvent.getX();
                        this.v = motionEvent.getY();
                        d();
                        this.w = true;
                        boolean z11 = motionEvent.getToolType(0) == 3;
                        this.E = z11;
                        this.H = (!z11 || (motionEvent.getButtonState() & 2) == 0) ? 0 : 2;
                        this.I = j(motionEvent);
                        if (this.E) {
                            c();
                        }
                        this.G = motionEvent.getDownTime() == 0 && motionEvent.getToolType(0) == 0;
                        this.A = false;
                        this.D = false;
                        this.B = false;
                        this.C = false;
                        this.L = -1;
                        this.M = uptimeMillis;
                        float x10 = motionEvent.getX() / f10;
                        this.P = x10;
                        this.N = x10;
                        float y10 = motionEvent.getY() / f10;
                        this.Q = y10;
                        this.O = y10;
                        this.c.postDelayed(this.k, 150L);
                    } else if (this.w && motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6) {
                        this.P = motionEvent.getX() / f10;
                        this.Q = motionEvent.getY() / f10;
                    }
                    if (actionMasked2 != 0) {
                        f();
                    }
                    if (!this.G && (!this.A || actionMasked2 == 0)) {
                        actionIndex = (i7 != 1 || i7 == 3) ? 0 : motionEvent.getActionIndex();
                        pointerCount = (i7 != 1 || i7 == 3) ? motionEvent.getPointerCount() : actionIndex + 1;
                        while (actionIndex < pointerCount) {
                            boolean z12 = (actionIndex == 0 && this.w) ? this.E : motionEvent.getToolType(actionIndex) == 3;
                            float f11 = f10;
                            this.p.o(i7, motionEvent.getX(actionIndex) / f11, motionEvent.getY(actionIndex) / f11, motionEvent.getPointerId(actionIndex), actionIndex == 0, z12, j(motionEvent), (z12 && actionIndex == 0 && this.w) ? this.H : 0);
                            actionIndex++;
                            f10 = f11;
                        }
                    }
                    if (this.w) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        int actionMasked4 = motionEvent.getActionMasked();
                        if (actionMasked4 == 1) {
                            if (!this.x) {
                                k(false, false, false);
                            }
                            a(this.m.g(uptimeMillis2, i(this.P), this.Q));
                            d();
                            g();
                        } else {
                            if (actionMasked4 == 2) {
                                if (this.x) {
                                    a(this.m.d(uptimeMillis2, i(this.P), this.Q));
                                    return true;
                                }
                                h();
                                return true;
                            }
                            if (actionMasked4 == 3) {
                                this.m.a();
                                d();
                                g();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                i7 = 2;
                actionMasked = motionEvent.getActionMasked();
                float f102 = this.b;
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
            float f1022 = this.b;
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

    public final boolean n() {
        int i7 = this.L;
        int i10 = (i7 >> 2) & 7;
        if ((i7 & 3) == 1) {
            return i10 == 4 || i10 == 5 || i10 == 3;
        }
        return false;
    }

    public final void o() {
        Handler handler = this.c;
        n71 n71Var = this.l;
        handler.removeCallbacks(n71Var);
        double c10 = this.m.c();
        if (!this.w || c10 < 0.0d) {
            return;
        }
        handler.postDelayed(n71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
    }

    public final void p(boolean z9) {
        if (this.q == z9) {
            return;
        }
        this.q = z9;
        org.telegram.utils.twidget.v0 v0Var = this.p;
        if (v0Var == null || this.r) {
            return;
        }
        v0Var.m(z9);
    }

    public final void q() {
        if (this.p == null) {
            return;
        }
        if (this.r) {
            this.r = false;
            this.p = null;
            return;
        }
        e();
        c();
        this.p.m(false);
        org.telegram.utils.twidget.v0 v0Var = this.p;
        if (v0Var.h == this) {
            v0Var.h = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        d();
        this.m.e();
    }
}
