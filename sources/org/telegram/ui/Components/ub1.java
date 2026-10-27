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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ub1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public float J;
    public int K;
    public long L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public final tb1 a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final sb1 k;
    public final sb1 l;
    public final c3.s m;
    public final sb1 n;
    public ac1 o;
    public nb1 p;
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

    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.ui.Components.sb1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Components.sb1] */
    /* JADX WARN: Type inference failed for: r1v14, types: [org.telegram.ui.Components.sb1] */
    public ub1(tb1 tb1Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        final int i10 = 1;
        this.k = new Runnable(this) { // from class: org.telegram.ui.Components.sb1
            public final /* synthetic */ ub1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nb1 nb1Var;
                switch (i10) {
                    case 0:
                        ub1 ub1Var = this.b;
                        if (ub1Var.w && ub1Var.x) {
                            c3.s sVar = ub1Var.m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.a;
                            ub1Var.a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j10, uptimeMillis));
                            ub1Var.o();
                            break;
                        }
                        break;
                    case 1:
                        this.b.k(false, false, false);
                        break;
                    default:
                        ub1 ub1Var2 = this.b;
                        if (ub1Var2.o != null && (nb1Var = ub1Var2.p) != null) {
                            ac1 l4 = nb1Var.l();
                            ac1 ac1Var = ub1Var2.o;
                            if (l4 == ac1Var) {
                                ac1Var.a.g();
                                ub1Var2.a.d();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 0;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.sb1
            public final /* synthetic */ ub1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nb1 nb1Var;
                switch (i11) {
                    case 0:
                        ub1 ub1Var = this.b;
                        if (ub1Var.w && ub1Var.x) {
                            c3.s sVar = ub1Var.m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.a;
                            ub1Var.a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j10, uptimeMillis));
                            ub1Var.o();
                            break;
                        }
                        break;
                    case 1:
                        this.b.k(false, false, false);
                        break;
                    default:
                        ub1 ub1Var2 = this.b;
                        if (ub1Var2.o != null && (nb1Var = ub1Var2.p) != null) {
                            ac1 l4 = nb1Var.l();
                            ac1 ac1Var = ub1Var2.o;
                            if (l4 == ac1Var) {
                                ac1Var.a.g();
                                ub1Var2.a.d();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.m = new c3.s();
        final int i12 = 2;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Components.sb1
            public final /* synthetic */ ub1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nb1 nb1Var;
                switch (i12) {
                    case 0:
                        ub1 ub1Var = this.b;
                        if (ub1Var.w && ub1Var.x) {
                            c3.s sVar = ub1Var.m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.a;
                            ub1Var.a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j10, uptimeMillis));
                            ub1Var.o();
                            break;
                        }
                        break;
                    case 1:
                        this.b.k(false, false, false);
                        break;
                    default:
                        ub1 ub1Var2 = this.b;
                        if (ub1Var2.o != null && (nb1Var = ub1Var2.p) != null) {
                            ac1 l4 = nb1Var.l();
                            ac1 ac1Var = ub1Var2.o;
                            if (l4 == ac1Var) {
                                ac1Var.a.g();
                                ub1Var2.a.d();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.K = -1;
        this.a = tb1Var;
        this.b = f7;
        paint.setTextSize(f7 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int j(MotionEvent motionEvent) {
        int metaState = motionEvent.getMetaState();
        return ((metaState & 2) != 0 ? 1 : 0) | ((metaState & 4096) != 0 ? 2 : 0) | ((65536 & metaState) != 0 ? 4 : 0) | ((metaState & 1) != 0 ? 8 : 0);
    }

    public final void a(int i10) {
        tb1 tb1Var = this.a;
        if (i10 == -1) {
            return;
        }
        this.K = i10;
        if ((i10 & 32) != 0 && !this.A) {
            this.A = true;
            nb1 nb1Var = this.p;
            float f7 = this.O;
            float f10 = this.P;
            boolean z10 = this.D;
            int i11 = this.H;
            int i12 = this.G;
            dc1 dc1Var = nb1Var.f;
            if (dc1Var != null) {
                long j10 = dc1Var.s;
                if (!dc1Var.t && j10 != 0) {
                    WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i11, i12);
                }
            }
        }
        int i13 = i10 & 3;
        if (i13 == 2) {
            g();
            if (((i10 >> 6) & 7) == 1) {
                tb1Var.b();
                return;
            }
            return;
        }
        if (i13 == 1 && n() && !this.C) {
            if (this.B) {
                tb1Var.a(true);
            } else {
                h();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Canvas canvas, int i10) {
        dc1 dc1Var;
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
        this.Q = i10;
        nb1 nb1Var = this.p;
        String str = null;
        ac1 l4 = nb1Var == null ? null : nb1Var.l();
        float f7 = this.b;
        if (l4 != null) {
            bc1[] bc1VarArr = l4.b;
            db1 db1Var = l4.a;
            int i14 = l4.d;
            if (i14 > 0 && db1Var.b(canvas)) {
                if (!l4.a()) {
                    this.p.k();
                }
                ac1 ac1Var = this.o;
                boolean z14 = true;
                if (l4 != ac1Var) {
                    boolean z15 = ac1Var == null;
                    this.o = l4;
                    Handler handler = this.c;
                    sb1 sb1Var = this.n;
                    handler.removeCallbacks(sb1Var);
                    if (SharedConfig.widgetStaticLayers) {
                        if (z15) {
                            db1Var.g();
                        } else {
                            handler.postDelayed(sb1Var, 333L);
                        }
                    }
                }
                boolean z16 = Math.abs(i14 - i10) > 1;
                if (z16) {
                    canvas.save();
                    float f10 = i10 / i14;
                    canvas.scale(f10, f10);
                }
                char c12 = 0;
                db1Var.d(canvas, 1.0f);
                if (bc1VarArr.length > 0) {
                    double nanoTime = (System.nanoTime() / 1.0E9d) + l4.c;
                    int length = bc1VarArr.length;
                    int i15 = 0;
                    boolean z17 = false;
                    while (i15 < length) {
                        bc1 bc1Var = bc1VarArr[i15];
                        float[] fArr3 = bc1Var.g;
                        float[] fArr4 = bc1Var.c;
                        db1 db1Var2 = bc1Var.a;
                        boolean z18 = z14;
                        int length2 = fArr3.length / 8;
                        if (length2 == 0 || !db1Var2.f()) {
                            i11 = length;
                            z13 = z16;
                            i12 = i15;
                            c10 = c12;
                        } else {
                            i12 = i15;
                            i11 = length;
                            double max = Math.max(0.0d, nanoTime - bc1Var.d);
                            double d10 = bc1Var.e;
                            if (d10 <= 0.0d) {
                                d = 1.0d;
                            } else if (bc1Var.f) {
                                d = (max % d10) / d10;
                                z17 = z18 ? 1 : 0;
                            } else {
                                double min = Math.min(1.0d, max / d10);
                                z17 |= min < 1.0d ? z18 ? 1 : 0 : false;
                                d = min;
                            }
                            float[] fArr5 = bc1Var.g;
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
                                fArr[i19] = c3.h0.z(fArr5[i18 + 1 + i19], f14, max2, f14);
                                i19++;
                                z16 = z13;
                            }
                            canvas.save();
                            float[] fArr6 = bc1Var.b;
                            if (fArr6 != null) {
                                float f15 = fArr6[0];
                                float f16 = f15 * f7;
                                float f17 = fArr6[z18 ? 1 : 0];
                                char c13 = 7;
                                float f18 = f17 * f7;
                                float f19 = (f15 + fArr6[2]) * f7;
                                float f20 = (f17 + fArr6[3]) * f7;
                                RectF rectF = this.i;
                                rectF.set(f16, f18, f19, f20);
                                if (fArr4 == null) {
                                    canvas.clipRect(rectF);
                                    c11 = c13;
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
                                    c11 = c13;
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
                            db1Var2.d(canvas, Math.max(0.0f, Math.min(1.0f, fArr[6])));
                            canvas.restore();
                        }
                        char c14 = c10;
                        i15 = i12 + 1;
                        c12 = c14;
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
        nb1 nb1Var2 = this.p;
        if (nb1Var2 != null) {
            nb1Var2.k();
        }
        nb1 nb1Var3 = this.p;
        if (nb1Var3 != null && (dc1Var = nb1Var3.f) != null) {
            str = dc1Var.M;
        }
        canvas.drawText(LocaleController.getString(str == null ? R.string.WidgetLoading : R.string.WidgetLoadFailed), 12.0f * f7, f7 * 28.0f, this.d);
        return false;
    }

    public final void c() {
        if (this.E) {
            this.E = false;
            nb1 nb1Var = this.p;
            if (nb1Var != null && !this.r) {
                float f7 = this.I;
                float f10 = this.J;
                dc1 dc1Var = nb1Var.f;
                if (dc1Var != null) {
                    long j10 = dc1Var.s;
                    if (!dc1Var.t && j10 != 0) {
                        WidgetSandboxNative.hover(j10, 1, f7, f10, 0);
                    }
                }
            }
            this.a.c("auto");
        }
    }

    public final void d() {
        sb1 sb1Var = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(sb1Var);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void e() {
        nb1 nb1Var;
        if (this.F) {
            this.F = false;
            this.A = true;
        }
        if (!this.w || this.A || (nb1Var = this.p) == null) {
            return;
        }
        this.A = true;
        float f7 = this.O;
        float f10 = this.P;
        boolean z10 = this.D;
        int i10 = this.H;
        int i11 = this.G;
        dc1 dc1Var = nb1Var.f;
        if (dc1Var != null) {
            long j10 = dc1Var.s;
            if (dc1Var.t || j10 == 0) {
                return;
            }
            WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i10, i11);
        }
    }

    public final void f() {
        if (this.F) {
            this.F = false;
            nb1 nb1Var = this.p;
            if (nb1Var != null) {
                float f7 = this.M;
                float f10 = this.N;
                boolean z10 = this.D;
                int i10 = this.H;
                int i11 = this.G;
                dc1 dc1Var = nb1Var.f;
                if (dc1Var != null) {
                    long j10 = dc1Var.s;
                    if (dc1Var.t || j10 == 0) {
                        return;
                    }
                    WidgetSandboxNative.touch(j10, 0, f7, f10, 0, true, z10, i10, i11);
                }
            }
        }
    }

    public final void g() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.B) {
            this.a.a(false);
        }
    }

    public final void h() {
        if (this.B || this.C) {
            return;
        }
        this.B = true;
        this.a.a(true);
    }

    public final float i(float f7) {
        int i10;
        return (!LocaleController.isRTL || (i10 = this.Q) <= 0) ? f7 : (i10 / this.b) - f7;
    }

    public final void k(boolean z10, boolean z11, boolean z12) {
        if (!this.w || this.x) {
            return;
        }
        this.c.removeCallbacks(this.k);
        this.x = true;
        double d = this.L;
        double i10 = i(this.M);
        double d10 = this.N;
        boolean z13 = this.D;
        int i11 = this.G;
        c3.s sVar = this.m;
        if (sVar.a == 0) {
            sVar.a = WidgetSandboxNative.arbiterCreate();
        }
        int arbiterDown = WidgetSandboxNative.arbiterDown(sVar.a, d, i10, d10, z10, z11, z12, z13, i11);
        boolean z14 = false;
        boolean z15 = (arbiterDown & 2048) != 0;
        this.y = z10 && !z15;
        if (z12 && !z15) {
            z14 = true;
        }
        this.z = z14;
        a(arbiterDown);
        if (this.O != this.M || this.P != this.N) {
            double uptimeMillis = SystemClock.uptimeMillis();
            double i12 = i(this.O);
            double d11 = this.P;
            long j10 = sVar.a;
            a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterMove(j10, uptimeMillis, i12, d11));
        }
        if (this.y || this.z || this.D) {
            h();
            if ((this.y || this.D) && !this.C) {
                this.a.a(true);
            }
        } else {
            g();
        }
        o();
    }

    public final void l(MotionEvent motionEvent, boolean z10) {
        nb1 nb1Var;
        dc1 dc1Var;
        float f7 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (!z10 || actionMasked == 10 || (nb1Var = this.p) == null || this.r || (dc1Var = nb1Var.f) == null || !dc1Var.z) {
            c();
            return;
        }
        this.E = true;
        this.I = motionEvent.getX() / f7;
        float y3 = motionEvent.getY() / f7;
        this.J = y3;
        nb1 nb1Var2 = this.p;
        float f10 = this.I;
        int j10 = j(motionEvent);
        dc1 dc1Var2 = nb1Var2.f;
        if (dc1Var2 != null) {
            long j11 = dc1Var2.s;
            if (dc1Var2.t || j11 == 0) {
                return;
            }
            WidgetSandboxNative.hover(j11, 0, f10, y3, j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r4 != 6) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(MotionEvent motionEvent) {
        dc1 dc1Var;
        int i10;
        int actionIndex;
        int pointerCount;
        float f7 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = this.w;
        boolean z11 = z10 && (actionMasked == 1 || actionMasked == 3);
        nb1 nb1Var = this.p;
        if (nb1Var != null && !this.r && ((((dc1Var = nb1Var.f) != null && dc1Var.z) || z11) && (actionMasked != 3 || z10))) {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 != 0) {
                if (actionMasked2 != 1) {
                    if (actionMasked2 == 2) {
                        i10 = 1;
                    } else if (actionMasked2 == 3) {
                        i10 = 3;
                    } else if (actionMasked2 != 5) {
                    }
                    int i11 = -1;
                    if (motionEvent.getActionMasked() == 0) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (uptimeMillis - this.s < 100 && Math.abs(motionEvent.getX() - this.u) < 1.0f && Math.abs(motionEvent.getY() - this.v) < 1.0f) {
                            if (motionEvent.getDownTime() != 0) {
                                this.t = motionEvent.getDownTime();
                            }
                            if (!this.D && motionEvent.getToolType(0) == 3 && !this.x) {
                                this.D = true;
                                this.G = (motionEvent.getButtonState() & 2) != 0 ? 2 : 0;
                                this.H = j(motionEvent);
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
                        boolean z12 = motionEvent.getToolType(0) == 3;
                        this.D = z12;
                        this.G = (!z12 || (motionEvent.getButtonState() & 2) == 0) ? 0 : 2;
                        this.H = j(motionEvent);
                        if (this.D) {
                            c();
                        }
                        this.F = motionEvent.getDownTime() == 0 && motionEvent.getToolType(0) == 0;
                        this.A = false;
                        this.B = false;
                        this.C = false;
                        this.K = -1;
                        this.L = uptimeMillis;
                        float x9 = motionEvent.getX() / f7;
                        this.O = x9;
                        this.M = x9;
                        float y3 = motionEvent.getY() / f7;
                        this.P = y3;
                        this.N = y3;
                        this.c.postDelayed(this.k, 150L);
                    } else if (this.w && motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6) {
                        this.O = motionEvent.getX() / f7;
                        this.P = motionEvent.getY() / f7;
                    }
                    if (actionMasked != 0) {
                        f();
                    }
                    if (!this.F && (!this.A || actionMasked == 0)) {
                        actionIndex = (i10 != 1 || i10 == 3) ? 0 : motionEvent.getActionIndex();
                        pointerCount = (i10 != 1 || i10 == 3) ? motionEvent.getPointerCount() : actionIndex + 1;
                        while (actionIndex < pointerCount) {
                            boolean z13 = (actionIndex == 0 && this.w) ? this.D : motionEvent.getToolType(actionIndex) == 3;
                            nb1 nb1Var2 = this.p;
                            float x10 = motionEvent.getX(actionIndex) / f7;
                            float y10 = motionEvent.getY(actionIndex) / f7;
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            boolean z14 = actionIndex == 0;
                            int j10 = j(motionEvent);
                            int i12 = (z13 && actionIndex == 0 && this.w) ? this.G : 0;
                            dc1 dc1Var2 = nb1Var2.f;
                            int i13 = i11;
                            if (dc1Var2 != null) {
                                long j11 = dc1Var2.s;
                                if (!dc1Var2.t && j11 != 0) {
                                    WidgetSandboxNative.touch(j11, i10, x10, y10, pointerId, z14, z13, j10, i12);
                                }
                            }
                            actionIndex++;
                            i11 = i13;
                        }
                    }
                    int i14 = i11;
                    if (this.w) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        int actionMasked3 = motionEvent.getActionMasked();
                        if (actionMasked3 == 1) {
                            if (!this.x) {
                                k(false, false, false);
                            }
                            c3.s sVar = this.m;
                            double d = uptimeMillis2;
                            double i15 = i(this.O);
                            double d10 = this.P;
                            long j12 = sVar.a;
                            a(j12 == 0 ? i14 : WidgetSandboxNative.arbiterUp(j12, d, i15, d10));
                            d();
                            g();
                        } else {
                            if (actionMasked3 == 2) {
                                if (!this.x) {
                                    h();
                                    return true;
                                }
                                c3.s sVar2 = this.m;
                                double d11 = uptimeMillis2;
                                double i16 = i(this.O);
                                double d12 = this.P;
                                long j13 = sVar2.a;
                                a(j13 == 0 ? i14 : WidgetSandboxNative.arbiterMove(j13, d11, i16, d12));
                                return true;
                            }
                            if (actionMasked3 == 3) {
                                long j14 = this.m.a;
                                if (j14 != 0) {
                                    WidgetSandboxNative.arbiterCancel(j14);
                                }
                                d();
                                g();
                                return true;
                            }
                        }
                    }
                    return true;
                }
                i10 = 2;
                int i112 = -1;
                if (motionEvent.getActionMasked() == 0) {
                }
                if (actionMasked != 0) {
                }
                if (!this.F) {
                    if (i10 != 1) {
                    }
                    if (i10 != 1) {
                    }
                    while (actionIndex < pointerCount) {
                    }
                }
                int i142 = i112;
                if (this.w) {
                }
                return true;
            }
            i10 = 0;
            int i1122 = -1;
            if (motionEvent.getActionMasked() == 0) {
            }
            if (actionMasked != 0) {
            }
            if (!this.F) {
            }
            int i1422 = i1122;
            if (this.w) {
            }
            return true;
        }
        return false;
    }

    public final boolean n() {
        int i10 = this.K;
        int i11 = (i10 >> 2) & 7;
        if ((i10 & 3) == 1) {
            return i11 == 4 || i11 == 5 || i11 == 3;
        }
        return false;
    }

    public final void o() {
        Handler handler = this.c;
        sb1 sb1Var = this.l;
        handler.removeCallbacks(sb1Var);
        long j10 = this.m.a;
        double arbiterHoldDeadline = j10 == 0 ? -1.0d : WidgetSandboxNative.arbiterHoldDeadline(j10);
        if (!this.w || arbiterHoldDeadline < 0.0d) {
            return;
        }
        handler.postDelayed(sb1Var, Math.max(0L, ((long) Math.ceil(arbiterHoldDeadline)) - SystemClock.uptimeMillis()));
    }

    public final void p(boolean z10) {
        if (this.q == z10) {
            return;
        }
        this.q = z10;
        nb1 nb1Var = this.p;
        if (nb1Var == null || this.r) {
            return;
        }
        nb1Var.p(z10);
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
        this.p.p(false);
        nb1 nb1Var = this.p;
        if (nb1Var.h == this) {
            nb1Var.h = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        d();
        c3.s sVar = this.m;
        long j10 = sVar.a;
        if (j10 == 0) {
            return;
        }
        WidgetSandboxNative.arbiterDestroy(j10);
        sVar.a = 0L;
    }
}
