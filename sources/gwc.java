// default package

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
import org.telegram.utils.twidget.p;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gwc {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public byte H;
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
    public final fwc a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final ewc k;
    public final ewc l;
    public final p m;
    public final ewc n;
    public kwc o;
    public bwc p;
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

    /* JADX WARN: Type inference failed for: r1v3, types: [ewc] */
    /* JADX WARN: Type inference failed for: r2v10, types: [ewc] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ewc] */
    public gwc(fwc fwcVar, float f) {
        final byte b = 1;
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        final byte b2 = 0;
        this.k = new Runnable(this) { // from class: ewc
            public final /* synthetic */ gwc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwc bwcVar;
                byte b3 = b2;
                gwc gwcVar = this.b;
                switch (b3) {
                    case 0:
                        gwcVar.l(false, false, false);
                        break;
                    case 1:
                        if (gwcVar.w && gwcVar.x) {
                            gwcVar.a(gwcVar.m.f(SystemClock.uptimeMillis()));
                            gwcVar.p();
                            break;
                        }
                        break;
                    default:
                        if (gwcVar.o != null && (bwcVar = gwcVar.p) != null) {
                            kwc d = bwcVar.d();
                            kwc kwcVar = gwcVar.o;
                            if (d == kwcVar) {
                                kwcVar.a.f();
                                gwcVar.a.g();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.l = new Runnable(this) { // from class: ewc
            public final /* synthetic */ gwc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwc bwcVar;
                byte b3 = b;
                gwc gwcVar = this.b;
                switch (b3) {
                    case 0:
                        gwcVar.l(false, false, false);
                        break;
                    case 1:
                        if (gwcVar.w && gwcVar.x) {
                            gwcVar.a(gwcVar.m.f(SystemClock.uptimeMillis()));
                            gwcVar.p();
                            break;
                        }
                        break;
                    default:
                        if (gwcVar.o != null && (bwcVar = gwcVar.p) != null) {
                            kwc d = bwcVar.d();
                            kwc kwcVar = gwcVar.o;
                            if (d == kwcVar) {
                                kwcVar.a.f();
                                gwcVar.a.g();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.m = new p();
        final byte b3 = 2;
        this.n = new Runnable(this) { // from class: ewc
            public final /* synthetic */ gwc b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwc bwcVar;
                byte b32 = b3;
                gwc gwcVar = this.b;
                switch (b32) {
                    case 0:
                        gwcVar.l(false, false, false);
                        break;
                    case 1:
                        if (gwcVar.w && gwcVar.x) {
                            gwcVar.a(gwcVar.m.f(SystemClock.uptimeMillis()));
                            gwcVar.p();
                            break;
                        }
                        break;
                    default:
                        if (gwcVar.o != null && (bwcVar = gwcVar.p) != null) {
                            kwc d = bwcVar.d();
                            kwc kwcVar = gwcVar.o;
                            if (d == kwcVar) {
                                kwcVar.a.f();
                                gwcVar.a.g();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.L = -1;
        this.a = fwcVar;
        this.b = f;
        paint.setTextSize(f * 14.0f);
        paint.setColor(-8355712);
    }

    public static int k(MotionEvent motionEvent) {
        int metaState = motionEvent.getMetaState();
        return ((metaState & 2) != 0 ? 1 : 0) | ((metaState & TLObject.FLAG_12) != 0 ? 2 : 0) | ((65536 & metaState) != 0 ? 4 : 0) | ((metaState & 1) != 0 ? 8 : 0);
    }

    public final void a(int i) {
        if (i != -1) {
            this.L = i;
            if ((i & 32) != 0 && !this.A) {
                this.A = true;
                bwc bwcVar = this.p;
                float f = this.P;
                float f2 = this.Q;
                boolean z = this.E;
                int i2 = this.I;
                byte b = this.H;
                z zVar = bwcVar.e;
                if (zVar != null) {
                    zVar.i(3, f, f2, 0, true, z, i2, b);
                }
            }
            int i3 = i & 3;
            fwc fwcVar = this.a;
            if (i3 == 2) {
                h();
                if (((i >> 6) & 7) != 1 || this.D) {
                    return;
                }
                this.D = true;
                fwcVar.d();
                return;
            }
            if (i3 == 1 && o() && !this.C) {
                if (this.B) {
                    fwcVar.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(bwc bwcVar) {
        if (this.p != bwcVar) {
            r();
            this.p = bwcVar;
            if (bwcVar == null) {
                return;
            }
            bwcVar.g = this;
            bwcVar.k(this.q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, int i) {
        z zVar;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        double d;
        int i4;
        float[] fArr;
        char c;
        float[] fArr2;
        this.R = i;
        bwc bwcVar = this.p;
        kwc d2 = bwcVar == null ? null : bwcVar.d();
        float f = this.b;
        if (d2 != null) {
            lwc[] lwcVarArr = d2.b;
            ovc ovcVar = d2.a;
            int i5 = d2.d;
            if (i5 > 0) {
                if (!d2.a()) {
                    this.p.c();
                }
                kwc kwcVar = this.o;
                boolean z5 = true;
                if (d2 != kwcVar) {
                    boolean z6 = kwcVar == null;
                    this.o = d2;
                    Handler handler = this.c;
                    ewc ewcVar = this.n;
                    handler.removeCallbacks(ewcVar);
                    if (gba.G0) {
                        if (z6) {
                            ovcVar.f();
                        } else {
                            handler.postDelayed(ewcVar, 333L);
                        }
                    }
                }
                boolean z7 = Math.abs(i5 - i) > 1;
                if (z7) {
                    canvas.save();
                    float f2 = i / i5;
                    canvas.scale(f2, f2);
                }
                ovcVar.c(canvas, 1.0f);
                if (lwcVarArr.length > 0) {
                    double nanoTime = (System.nanoTime() / 1.0E9d) + d2.c;
                    int length = lwcVarArr.length;
                    int i6 = 0;
                    boolean z8 = false;
                    while (i6 < length) {
                        lwc lwcVar = lwcVarArr[i6];
                        float[] fArr3 = lwcVar.g;
                        float[] fArr4 = lwcVar.c;
                        ovc ovcVar2 = lwcVar.a;
                        boolean z9 = z5;
                        int length2 = fArr3.length / 8;
                        if (length2 == 0 || !ovcVar2.e()) {
                            i2 = length;
                            z4 = z7;
                            i3 = i6;
                        } else {
                            i3 = i6;
                            i2 = length;
                            double max = Math.max(0.0d, nanoTime - lwcVar.d);
                            double d3 = lwcVar.e;
                            if (d3 <= 0.0d) {
                                d = 1.0d;
                            } else if (lwcVar.f) {
                                d = (max % d3) / d3;
                                z8 = z9 ? 1 : 0;
                            } else {
                                double min = Math.min(1.0d, max / d3);
                                z8 |= min < 1.0d ? z9 ? 1 : 0 : false;
                                d = min;
                            }
                            float[] fArr5 = lwcVar.g;
                            float f3 = (float) d;
                            int i7 = 0;
                            while (true) {
                                i4 = i7 + 1;
                                if (i4 >= length2 || fArr5[i4 << 3] > f3) {
                                    break;
                                }
                                i7 = i4;
                            }
                            int min2 = Math.min(i4, length2 - 1);
                            int i8 = i7 << 3;
                            float f4 = fArr5[i8];
                            int i9 = min2 << 3;
                            float f5 = fArr5[i9];
                            float max2 = Math.max(0.0f, Math.min(1.0f, (min2 == i7 || f5 <= f4) ? 0.0f : (f3 - f4) / (f5 - f4)));
                            int i10 = 0;
                            while (true) {
                                z4 = z7;
                                fArr = this.g;
                                if (i10 >= 7) {
                                    break;
                                }
                                float f6 = fArr5[i8 + 1 + i10];
                                fArr[i10] = tb4.A(fArr5[i9 + 1 + i10], f6, max2, f6);
                                i10++;
                                z7 = z4;
                            }
                            canvas.save();
                            float[] fArr6 = lwcVar.b;
                            if (fArr6 != null) {
                                float f7 = fArr6[0];
                                float f8 = f7 * f;
                                float f9 = fArr6[z9 ? 1 : 0];
                                char c2 = 7;
                                float f10 = f9 * f;
                                float f11 = (f7 + fArr6[2]) * f;
                                float f12 = (f9 + fArr6[3]) * f;
                                RectF rectF = this.i;
                                rectF.set(f8, f10, f11, f12);
                                if (fArr4 == null) {
                                    canvas.clipRect(rectF);
                                    c = c2;
                                } else {
                                    int i11 = 0;
                                    while (true) {
                                        fArr2 = this.j;
                                        if (i11 >= 8) {
                                            break;
                                        }
                                        fArr2[i11] = fArr4[i11] * f;
                                        i11++;
                                    }
                                    Path path = this.h;
                                    path.rewind();
                                    path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                                    canvas.clipPath(path);
                                    c = c2;
                                }
                            } else {
                                c = 7;
                            }
                            float f13 = fArr[0];
                            float[] fArr7 = this.f;
                            fArr7[0] = f13;
                            fArr7[z9 ? 1 : 0] = fArr[2];
                            fArr7[2] = fArr[4] * f;
                            fArr7[3] = fArr[z9 ? 1 : 0];
                            fArr7[4] = fArr[3];
                            fArr7[5] = fArr[5] * f;
                            fArr7[6] = 0.0f;
                            fArr7[c] = 0.0f;
                            fArr7[8] = 1.0f;
                            Matrix matrix = this.e;
                            matrix.setValues(fArr7);
                            canvas.concat(matrix);
                            ovcVar2.c(canvas, Math.max(0.0f, Math.min(1.0f, fArr[6])));
                            canvas.restore();
                        }
                        i6 = i3 + 1;
                        z5 = z9 ? 1 : 0;
                        length = i2;
                        z7 = z4;
                    }
                    z = z7;
                    boolean z10 = z5;
                    z2 = false;
                    if (z8 && this.q) {
                        z3 = z10;
                        if (z) {
                            canvas.restore();
                        }
                        return z3;
                    }
                } else {
                    z = z7;
                    z2 = false;
                }
                z3 = z2;
                if (z) {
                }
                return z3;
            }
        }
        if (this.r) {
            return false;
        }
        bwc bwcVar2 = this.p;
        if (bwcVar2 != null) {
            bwcVar2.c();
        }
        bwc bwcVar3 = this.p;
        canvas.drawText(k96.M0(((bwcVar3 == null || (zVar = bwcVar3.e) == null) ? null : zVar.U) == null ? 2131742612 : 2131742613, null), 12.0f * f, f * 28.0f, this.d);
        return false;
    }

    public final void d() {
        if (this.F) {
            this.F = false;
            bwc bwcVar = this.p;
            if (bwcVar != null && !this.r) {
                float f = this.J;
                float f2 = this.K;
                z zVar = bwcVar.e;
                if (zVar != null) {
                    long j = zVar.v;
                    if (!zVar.A && j != 0) {
                        zVar.c.e(j, 1, f, f2, 0);
                    }
                }
            }
            this.a.f("auto");
        }
    }

    public final void e() {
        ewc ewcVar = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(ewcVar);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void f() {
        bwc bwcVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (!this.w || this.A || (bwcVar = this.p) == null) {
            return;
        }
        this.A = true;
        float f = this.P;
        float f2 = this.Q;
        boolean z = this.E;
        int i = this.I;
        byte b = this.H;
        z zVar = bwcVar.e;
        if (zVar != null) {
            zVar.i(3, f, f2, 0, true, z, i, b);
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            bwc bwcVar = this.p;
            if (bwcVar != null) {
                float f = this.N;
                float f2 = this.O;
                boolean z = this.E;
                int i = this.I;
                byte b = this.H;
                z zVar = bwcVar.e;
                if (zVar != null) {
                    zVar.i(0, f, f2, 0, true, z, i, b);
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

    public final float j(float f) {
        int i;
        return (!k96.a0 || (i = this.R) <= 0) ? f : (i / this.b) - f;
    }

    public final void l(boolean z, boolean z2, boolean z3) {
        if (!this.w || this.x) {
            return;
        }
        this.c.removeCallbacks(this.k);
        this.x = true;
        int b = this.m.b(this.M, j(this.N), this.O, z, z2, z3, this.E, this.H);
        boolean z4 = false;
        boolean z5 = (b & 2048) != 0;
        this.y = z && !z5;
        if (z3 && !z5) {
            z4 = true;
        }
        this.z = z4;
        a(b);
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

    public final void m(MotionEvent motionEvent, boolean z) {
        bwc bwcVar;
        z zVar;
        float f = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (!z || actionMasked == 10 || (bwcVar = this.p) == null || this.r || (zVar = bwcVar.e) == null || !zVar.I) {
            d();
            return;
        }
        this.F = true;
        this.J = motionEvent.getX() / f;
        float y = motionEvent.getY() / f;
        this.K = y;
        bwc bwcVar2 = this.p;
        float f2 = this.J;
        int k = k(motionEvent);
        z zVar2 = bwcVar2.e;
        if (zVar2 != null) {
            long j = zVar2.v;
            if (zVar2.A || j == 0) {
                return;
            }
            zVar2.c.e(j, 0, f2, y, k);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r3 != 6) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(MotionEvent motionEvent) {
        z zVar;
        int i;
        int actionMasked;
        int actionIndex;
        int pointerCount;
        float f;
        int actionMasked2 = motionEvent.getActionMasked();
        boolean z = this.w;
        boolean z2 = z && (actionMasked2 == 1 || actionMasked2 == 3);
        bwc bwcVar = this.p;
        if (bwcVar != null && !this.r && ((((zVar = bwcVar.e) != null && zVar.I) || z2) && (actionMasked2 != 3 || z))) {
            int actionMasked3 = motionEvent.getActionMasked();
            if (actionMasked3 != 0) {
                if (actionMasked3 != 1) {
                    if (actionMasked3 == 2) {
                        i = 1;
                    } else if (actionMasked3 == 3) {
                        i = 3;
                    } else if (actionMasked3 != 5) {
                    }
                    actionMasked = motionEvent.getActionMasked();
                    float f2 = this.b;
                    if (actionMasked == 0) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (uptimeMillis - this.s < 100 && Math.abs(motionEvent.getX() - this.u) < 1.0f && Math.abs(motionEvent.getY() - this.v) < 1.0f) {
                            if (motionEvent.getDownTime() != 0) {
                                this.t = motionEvent.getDownTime();
                            }
                            if (!this.E && motionEvent.getToolType(0) == 3 && !this.x) {
                                this.E = true;
                                this.H = (motionEvent.getButtonState() & 2) != 0 ? (byte) 2 : (byte) 0;
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
                        boolean z3 = motionEvent.getToolType(0) == 3;
                        this.E = z3;
                        this.H = (!z3 || (motionEvent.getButtonState() & 2) == 0) ? (byte) 0 : (byte) 2;
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
                        float x = motionEvent.getX() / f2;
                        this.P = x;
                        this.N = x;
                        float y = motionEvent.getY() / f2;
                        this.Q = y;
                        this.O = y;
                        this.c.postDelayed(this.k, 150L);
                    } else if (this.w && motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6) {
                        this.P = motionEvent.getX() / f2;
                        this.Q = motionEvent.getY() / f2;
                    }
                    if (actionMasked2 != 0) {
                        g();
                    }
                    if (!this.G && (!this.A || actionMasked2 == 0)) {
                        actionIndex = (i != 1 || i == 3) ? 0 : motionEvent.getActionIndex();
                        pointerCount = (i != 1 || i == 3) ? motionEvent.getPointerCount() : actionIndex + 1;
                        while (actionIndex < pointerCount) {
                            boolean z4 = (actionIndex == 0 && this.w) ? this.E : motionEvent.getToolType(actionIndex) == 3;
                            bwc bwcVar2 = this.p;
                            float x2 = motionEvent.getX(actionIndex) / f2;
                            float y2 = motionEvent.getY(actionIndex) / f2;
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            boolean z5 = actionIndex == 0;
                            int k = k(motionEvent);
                            byte b = (z4 && actionIndex == 0 && this.w) ? this.H : (byte) 0;
                            z zVar2 = bwcVar2.e;
                            if (zVar2 != null) {
                                f = f2;
                                zVar2.i(i, x2, y2, pointerId, z5, z4, k, b);
                            } else {
                                f = f2;
                            }
                            actionIndex++;
                            f2 = f;
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
                i = 2;
                actionMasked = motionEvent.getActionMasked();
                float f22 = this.b;
                if (actionMasked == 0) {
                }
                if (actionMasked2 != 0) {
                }
                if (!this.G) {
                    if (i != 1) {
                    }
                    if (i != 1) {
                    }
                    while (actionIndex < pointerCount) {
                    }
                }
                if (this.w) {
                }
                return true;
            }
            i = 0;
            actionMasked = motionEvent.getActionMasked();
            float f222 = this.b;
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
        int i = this.L;
        int i2 = (i >> 2) & 7;
        if ((i & 3) == 1) {
            return i2 == 4 || i2 == 5 || i2 == 3;
        }
        return false;
    }

    public final void p() {
        Handler handler = this.c;
        ewc ewcVar = this.l;
        handler.removeCallbacks(ewcVar);
        double c = this.m.c();
        if (!this.w || c < 0.0d) {
            return;
        }
        handler.postDelayed(ewcVar, Math.max(0L, ((long) Math.ceil(c)) - SystemClock.uptimeMillis()));
    }

    public final void q(boolean z) {
        if (this.q != z) {
            this.q = z;
            bwc bwcVar = this.p;
            if (bwcVar == null || this.r) {
                return;
            }
            bwcVar.k(z);
        }
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
        bwc bwcVar = this.p;
        if (bwcVar.g == this) {
            bwcVar.g = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        e();
        this.m.e();
    }
}
