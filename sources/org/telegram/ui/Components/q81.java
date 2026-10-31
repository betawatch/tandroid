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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q81 {
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
    public final p81 a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final o81 k;
    public final o81 l;
    public final org.telegram.utils.twidget.h m;
    public final o81 n;
    public org.telegram.utils.twidget.i0 o;
    public org.telegram.utils.twidget.w p;
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

    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.ui.Components.o81] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Components.o81] */
    /* JADX WARN: Type inference failed for: r1v14, types: [org.telegram.ui.Components.o81] */
    public q81(p81 p81Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        final int i10 = 0;
        this.k = new Runnable(this) { // from class: org.telegram.ui.Components.o81
            public final /* synthetic */ q81 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (i10) {
                    case 0:
                        this.b.l(false, false, false);
                        break;
                    case 1:
                        q81 q81Var = this.b;
                        if (q81Var.w && q81Var.x) {
                            q81Var.a(q81Var.m.f(SystemClock.uptimeMillis()));
                            q81Var.p();
                            break;
                        }
                        break;
                    default:
                        q81 q81Var2 = this.b;
                        if (q81Var2.o != null && (wVar = q81Var2.p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = q81Var2.o;
                            if (c10 == i0Var) {
                                i0Var.a.g();
                                q81Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.o81
            public final /* synthetic */ q81 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (i11) {
                    case 0:
                        this.b.l(false, false, false);
                        break;
                    case 1:
                        q81 q81Var = this.b;
                        if (q81Var.w && q81Var.x) {
                            q81Var.a(q81Var.m.f(SystemClock.uptimeMillis()));
                            q81Var.p();
                            break;
                        }
                        break;
                    default:
                        q81 q81Var2 = this.b;
                        if (q81Var2.o != null && (wVar = q81Var2.p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = q81Var2.o;
                            if (c10 == i0Var) {
                                i0Var.a.g();
                                q81Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.m = new org.telegram.utils.twidget.h();
        final int i12 = 2;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Components.o81
            public final /* synthetic */ q81 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (i12) {
                    case 0:
                        this.b.l(false, false, false);
                        break;
                    case 1:
                        q81 q81Var = this.b;
                        if (q81Var.w && q81Var.x) {
                            q81Var.a(q81Var.m.f(SystemClock.uptimeMillis()));
                            q81Var.p();
                            break;
                        }
                        break;
                    default:
                        q81 q81Var2 = this.b;
                        if (q81Var2.o != null && (wVar = q81Var2.p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = q81Var2.o;
                            if (c10 == i0Var) {
                                i0Var.a.g();
                                q81Var2.a.h();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.L = -1;
        this.a = p81Var;
        this.b = f7;
        paint.setTextSize(f7 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int k(MotionEvent motionEvent) {
        int metaState = motionEvent.getMetaState();
        return ((metaState & 2) != 0 ? 1 : 0) | ((metaState & TLObject.FLAG_12) != 0 ? 2 : 0) | ((65536 & metaState) != 0 ? 4 : 0) | ((metaState & 1) != 0 ? 8 : 0);
    }

    public final void a(int i10) {
        if (i10 == -1) {
            return;
        }
        this.L = i10;
        if ((i10 & 32) != 0 && !this.A) {
            this.A = true;
            this.p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
        int i11 = i10 & 3;
        p81 p81Var = this.a;
        if (i11 == 2) {
            h();
            if (((i10 >> 6) & 7) != 1 || this.D) {
                return;
            }
            this.D = true;
            p81Var.d();
            return;
        }
        if (i11 == 1 && o() && !this.C) {
            if (this.B) {
                p81Var.b(true);
            } else {
                i();
            }
        }
    }

    public final void b(org.telegram.utils.twidget.w wVar) {
        if (this.p == wVar) {
            return;
        }
        r();
        this.p = wVar;
        if (wVar == null) {
            return;
        }
        wVar.h = this;
        wVar.m(this.q);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, int i10) {
        org.telegram.utils.twidget.k0 k0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        int i12;
        char c10;
        double d;
        int i13;
        float[] fArr;
        char c11;
        float[] fArr2;
        this.R = i10;
        org.telegram.utils.twidget.w wVar = this.p;
        org.telegram.utils.twidget.i0 c12 = wVar == null ? null : wVar.c();
        float f7 = this.b;
        if (c12 != null) {
            org.telegram.utils.twidget.j0[] j0VarArr = c12.b;
            org.telegram.utils.twidget.g gVar = c12.a;
            int i14 = c12.d;
            if (i14 > 0 && gVar.b(canvas)) {
                if (!c12.a()) {
                    this.p.b();
                }
                org.telegram.utils.twidget.i0 i0Var = this.o;
                boolean z14 = true;
                if (c12 != i0Var) {
                    boolean z15 = i0Var == null;
                    this.o = c12;
                    Handler handler = this.c;
                    o81 o81Var = this.n;
                    handler.removeCallbacks(o81Var);
                    if (org.telegram.messenger.tz.K0) {
                        if (z15) {
                            gVar.g();
                        } else {
                            handler.postDelayed(o81Var, 333L);
                        }
                    }
                }
                boolean z16 = Math.abs(i14 - i10) > 1;
                if (z16) {
                    canvas.save();
                    float f10 = i10 / i14;
                    canvas.scale(f10, f10);
                }
                char c13 = 0;
                gVar.d(canvas, 1.0f);
                if (j0VarArr.length > 0) {
                    double nanoTime = (System.nanoTime() / 1.0E9d) + c12.c;
                    int length = j0VarArr.length;
                    int i15 = 0;
                    boolean z17 = false;
                    while (i15 < length) {
                        org.telegram.utils.twidget.j0 j0Var = j0VarArr[i15];
                        float[] fArr3 = j0Var.g;
                        float[] fArr4 = j0Var.c;
                        org.telegram.utils.twidget.g gVar2 = j0Var.a;
                        boolean z18 = z14;
                        int length2 = fArr3.length / 8;
                        if (length2 == 0 || !gVar2.f()) {
                            i11 = length;
                            z13 = z16;
                            i12 = i15;
                            c10 = c13;
                        } else {
                            i12 = i15;
                            i11 = length;
                            double max = Math.max(0.0d, nanoTime - j0Var.d);
                            double d10 = j0Var.e;
                            if (d10 <= 0.0d) {
                                d = 1.0d;
                            } else if (j0Var.f) {
                                d = (max % d10) / d10;
                                z17 = z18 ? 1 : 0;
                            } else {
                                double min = Math.min(1.0d, max / d10);
                                z17 |= min < 1.0d ? z18 ? 1 : 0 : false;
                                d = min;
                            }
                            float[] fArr5 = j0Var.g;
                            float f11 = (float) d;
                            int i16 = 0;
                            while (true) {
                                i13 = i16 + 1;
                                if (i13 >= length2 || fArr5[i13 * 8] > f11) {
                                    break;
                                }
                                i16 = i13;
                            }
                            int min2 = Math.min(i13, length2 - 1);
                            int i17 = i16 * 8;
                            float f12 = fArr5[i17];
                            int i18 = min2 * 8;
                            float f13 = fArr5[i18];
                            float max2 = Math.max(0.0f, Math.min(1.0f, (min2 == i16 || f13 <= f12) ? 0.0f : (f11 - f12) / (f13 - f12)));
                            int i19 = 0;
                            while (true) {
                                z13 = z16;
                                fArr = this.g;
                                if (i19 >= 7) {
                                    break;
                                }
                                float f14 = fArr5[i17 + 1 + i19];
                                fArr[i19] = c3.i0.z(fArr5[i18 + 1 + i19], f14, max2, f14);
                                i19++;
                                z16 = z13;
                            }
                            canvas.save();
                            float[] fArr6 = j0Var.b;
                            if (fArr6 != null) {
                                float f15 = fArr6[0];
                                float f16 = f15 * f7;
                                float f17 = fArr6[z18 ? 1 : 0];
                                char c14 = 7;
                                float f18 = f17 * f7;
                                float f19 = (f15 + fArr6[2]) * f7;
                                float f20 = (f17 + fArr6[3]) * f7;
                                RectF rectF = this.i;
                                rectF.set(f16, f18, f19, f20);
                                if (fArr4 == null) {
                                    canvas.clipRect(rectF);
                                    c11 = c14;
                                } else {
                                    int i20 = 0;
                                    while (true) {
                                        fArr2 = this.j;
                                        if (i20 >= 8) {
                                            break;
                                        }
                                        fArr2[i20] = fArr4[i20] * f7;
                                        i20++;
                                    }
                                    Path path = this.h;
                                    path.rewind();
                                    path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                                    canvas.clipPath(path);
                                    c11 = c14;
                                }
                            } else {
                                c11 = 7;
                            }
                            float f21 = fArr[0];
                            float[] fArr7 = this.f;
                            fArr7[0] = f21;
                            fArr7[z18 ? 1 : 0] = fArr[2];
                            fArr7[2] = fArr[4] * f7;
                            fArr7[3] = fArr[z18 ? 1 : 0];
                            fArr7[4] = fArr[3];
                            fArr7[5] = fArr[5] * f7;
                            fArr7[6] = 0.0f;
                            fArr7[c11] = 0.0f;
                            c10 = 0;
                            fArr7[8] = 1.0f;
                            Matrix matrix = this.e;
                            matrix.setValues(fArr7);
                            canvas.concat(matrix);
                            gVar2.d(canvas, Math.max(0.0f, Math.min(1.0f, fArr[6])));
                            canvas.restore();
                        }
                        char c15 = c10;
                        i15 = i12 + 1;
                        c13 = c15;
                        z14 = z18 ? 1 : 0;
                        length = i11;
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
        org.telegram.utils.twidget.w wVar2 = this.p;
        if (wVar2 != null) {
            wVar2.b();
        }
        org.telegram.utils.twidget.w wVar3 = this.p;
        canvas.drawText(org.telegram.messenger.cd.L0(((wVar3 != null && (k0Var = wVar3.f) != null) ? k0Var.M : null) == null ? 2131742901 : 2131742902, null), 12.0f * f7, f7 * 28.0f, this.d);
        return false;
    }

    public final void d() {
        if (this.F) {
            this.F = false;
            org.telegram.utils.twidget.w wVar = this.p;
            if (wVar != null && !this.r) {
                wVar.d(this.J, this.K, 1, 0);
            }
            this.a.f("auto");
        }
    }

    public final void e() {
        o81 o81Var = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(o81Var);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.w wVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (!this.w || this.A || (wVar = this.p) == null) {
            return;
        }
        this.A = true;
        wVar.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.w wVar = this.p;
            if (wVar != null) {
                wVar.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
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

    public final float j(float f7) {
        int i10;
        return (!org.telegram.messenger.cd.X || (i10 = this.R) <= 0) ? f7 : (i10 / this.b) - f7;
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
        org.telegram.utils.twidget.w wVar;
        org.telegram.utils.twidget.k0 k0Var;
        int actionMasked = motionEvent.getActionMasked();
        if (!z10 || actionMasked == 10 || (wVar = this.p) == null || this.r || (k0Var = wVar.f) == null || !k0Var.A) {
            d();
            return;
        }
        this.F = true;
        float x10 = motionEvent.getX();
        float f7 = this.b;
        this.J = x10 / f7;
        float y3 = motionEvent.getY() / f7;
        this.K = y3;
        this.p.d(this.J, y3, 0, k(motionEvent));
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
    public final boolean n(MotionEvent motionEvent) {
        org.telegram.utils.twidget.k0 k0Var;
        int i10;
        int actionMasked;
        int actionIndex;
        int pointerCount;
        int actionMasked2 = motionEvent.getActionMasked();
        boolean z10 = this.w;
        boolean z11 = z10 && (actionMasked2 == 1 || actionMasked2 == 3);
        org.telegram.utils.twidget.w wVar = this.p;
        if (wVar != null && !this.r && ((((k0Var = wVar.f) != null && k0Var.A) || z11) && (actionMasked2 != 3 || z10))) {
            int actionMasked3 = motionEvent.getActionMasked();
            if (actionMasked3 != 0) {
                if (actionMasked3 != 1) {
                    if (actionMasked3 == 2) {
                        i10 = 1;
                    } else if (actionMasked3 == 3) {
                        i10 = 3;
                    } else if (actionMasked3 != 5) {
                    }
                    actionMasked = motionEvent.getActionMasked();
                    float f7 = this.b;
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
                        float x10 = motionEvent.getX() / f7;
                        this.P = x10;
                        this.N = x10;
                        float y3 = motionEvent.getY() / f7;
                        this.Q = y3;
                        this.O = y3;
                        this.c.postDelayed(this.k, 150L);
                    } else if (this.w && motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6) {
                        this.P = motionEvent.getX() / f7;
                        this.Q = motionEvent.getY() / f7;
                    }
                    if (actionMasked2 != 0) {
                        g();
                    }
                    if (!this.G && (!this.A || actionMasked2 == 0)) {
                        actionIndex = (i10 != 1 || i10 == 3) ? 0 : motionEvent.getActionIndex();
                        pointerCount = (i10 != 1 || i10 == 3) ? motionEvent.getPointerCount() : actionIndex + 1;
                        while (actionIndex < pointerCount) {
                            boolean z13 = (actionIndex == 0 && this.w) ? this.E : motionEvent.getToolType(actionIndex) == 3;
                            float f10 = f7;
                            this.p.o(i10, motionEvent.getX(actionIndex) / f10, motionEvent.getY(actionIndex) / f10, motionEvent.getPointerId(actionIndex), actionIndex == 0, z13, k(motionEvent), (z13 && actionIndex == 0 && this.w) ? this.H : 0);
                            actionIndex++;
                            f7 = f10;
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
                i10 = 2;
                actionMasked = motionEvent.getActionMasked();
                float f72 = this.b;
                if (actionMasked == 0) {
                }
                if (actionMasked2 != 0) {
                }
                if (!this.G) {
                    if (i10 != 1) {
                    }
                    if (i10 != 1) {
                    }
                    while (actionIndex < pointerCount) {
                    }
                }
                if (this.w) {
                }
                return true;
            }
            i10 = 0;
            actionMasked = motionEvent.getActionMasked();
            float f722 = this.b;
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
        int i10 = this.L;
        int i11 = (i10 >> 2) & 7;
        if ((i10 & 3) == 1) {
            return i11 == 4 || i11 == 5 || i11 == 3;
        }
        return false;
    }

    public final void p() {
        Handler handler = this.c;
        o81 o81Var = this.l;
        handler.removeCallbacks(o81Var);
        double c10 = this.m.c();
        if (!this.w || c10 < 0.0d) {
            return;
        }
        handler.postDelayed(o81Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
    }

    public final void q(boolean z10) {
        if (this.q == z10) {
            return;
        }
        this.q = z10;
        org.telegram.utils.twidget.w wVar = this.p;
        if (wVar == null || this.r) {
            return;
        }
        wVar.m(z10);
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
        this.p.m(false);
        org.telegram.utils.twidget.w wVar = this.p;
        if (wVar.h == this) {
            wVar.h = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        e();
        this.m.e();
    }
}
