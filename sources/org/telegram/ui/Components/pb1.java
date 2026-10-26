package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class pb1 {
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
    public final an0 a;
    public final float b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f;
    public final float[] g;
    public final Path h;
    public final RectF i;
    public final float[] j;
    public final ob1 k;
    public final ob1 l;
    public final c3.s m;
    public final ob1 n;
    public vb1 o;
    public jb1 p;
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

    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.ui.Components.ob1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.ui.Components.ob1] */
    /* JADX WARN: Type inference failed for: r1v14, types: [org.telegram.ui.Components.ob1] */
    public pb1(an0 an0Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f = new float[9];
        this.g = new float[7];
        this.h = new Path();
        this.i = new RectF();
        this.j = new float[8];
        final int i10 = 1;
        this.k = new Runnable(this) { // from class: org.telegram.ui.Components.ob1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jb1 jb1Var;
                switch (i10) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (pb1Var.w && pb1Var.x) {
                            c3.s sVar = pb1Var.m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.a;
                            pb1Var.a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j10, uptimeMillis));
                            pb1Var.o();
                            break;
                        }
                        break;
                    case 1:
                        this.b.j(false, false, false);
                        break;
                    default:
                        pb1 pb1Var2 = this.b;
                        if (pb1Var2.o != null && (jb1Var = pb1Var2.p) != null) {
                            vb1 i11 = jb1Var.i();
                            vb1 vb1Var = pb1Var2.o;
                            if (i11 == vb1Var) {
                                vb1Var.a.g();
                                pb1Var2.a.j();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i11 = 0;
        this.l = new Runnable(this) { // from class: org.telegram.ui.Components.ob1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jb1 jb1Var;
                switch (i11) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (pb1Var.w && pb1Var.x) {
                            c3.s sVar = pb1Var.m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.a;
                            pb1Var.a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j10, uptimeMillis));
                            pb1Var.o();
                            break;
                        }
                        break;
                    case 1:
                        this.b.j(false, false, false);
                        break;
                    default:
                        pb1 pb1Var2 = this.b;
                        if (pb1Var2.o != null && (jb1Var = pb1Var2.p) != null) {
                            vb1 i112 = jb1Var.i();
                            vb1 vb1Var = pb1Var2.o;
                            if (i112 == vb1Var) {
                                vb1Var.a.g();
                                pb1Var2.a.j();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.m = new c3.s();
        final int i12 = 2;
        this.n = new Runnable(this) { // from class: org.telegram.ui.Components.ob1
            public final /* synthetic */ pb1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jb1 jb1Var;
                switch (i12) {
                    case 0:
                        pb1 pb1Var = this.b;
                        if (pb1Var.w && pb1Var.x) {
                            c3.s sVar = pb1Var.m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.a;
                            pb1Var.a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterTick(j10, uptimeMillis));
                            pb1Var.o();
                            break;
                        }
                        break;
                    case 1:
                        this.b.j(false, false, false);
                        break;
                    default:
                        pb1 pb1Var2 = this.b;
                        if (pb1Var2.o != null && (jb1Var = pb1Var2.p) != null) {
                            vb1 i112 = jb1Var.i();
                            vb1 vb1Var = pb1Var2.o;
                            if (i112 == vb1Var) {
                                vb1Var.a.g();
                                pb1Var2.a.j();
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.K = -1;
        this.a = an0Var;
        this.b = f7;
        paint.setTextSize(f7 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int i(MotionEvent motionEvent) {
        int metaState = motionEvent.getMetaState();
        return ((metaState & 2) != 0 ? 1 : 0) | ((metaState & 4096) != 0 ? 2 : 0) | ((65536 & metaState) != 0 ? 4 : 0) | ((metaState & 1) != 0 ? 8 : 0);
    }

    public final void a(int i10) {
        org.telegram.ui.Cells.s1 cell;
        an0 an0Var = this.a;
        if (i10 == -1) {
            return;
        }
        this.K = i10;
        if ((i10 & 32) != 0 && !this.A) {
            this.A = true;
            jb1 jb1Var = this.p;
            float f7 = this.O;
            float f10 = this.P;
            boolean z10 = this.D;
            int i11 = this.H;
            int i12 = this.G;
            yb1 yb1Var = jb1Var.f;
            if (yb1Var != null) {
                long j10 = yb1Var.r;
                if (!yb1Var.s && j10 != 0) {
                    WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i11, i12);
                }
            }
        }
        int i13 = i10 & 3;
        if (i13 == 2) {
            f();
            if (((i10 >> 6) & 7) != 1 || (cell = an0Var.root.getCell()) == null || cell.Jc == null) {
                return;
            }
            try {
                cell.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            cell.Jc.j0(cell, cell.g1, cell.h1);
            return;
        }
        if (i13 == 1 && n() && !this.C) {
            if (this.B) {
                an0Var.requestDisallowParentIntercept(true);
            } else {
                g();
            }
        }
    }

    public final void b() {
        if (this.E) {
            this.E = false;
            jb1 jb1Var = this.p;
            if (jb1Var != null && !this.r) {
                float f7 = this.I;
                float f10 = this.J;
                yb1 yb1Var = jb1Var.f;
                if (yb1Var != null) {
                    long j10 = yb1Var.r;
                    if (!yb1Var.s && j10 != 0) {
                        WidgetSandboxNative.hover(j10, 1, f7, f10, 0);
                    }
                }
            }
            this.a.o("auto");
        }
    }

    public final void c() {
        ob1 ob1Var = this.k;
        Handler handler = this.c;
        handler.removeCallbacks(ob1Var);
        handler.removeCallbacks(this.l);
        this.w = false;
        this.x = false;
    }

    public final void d() {
        jb1 jb1Var;
        if (this.F) {
            this.F = false;
            this.A = true;
        }
        if (!this.w || this.A || (jb1Var = this.p) == null) {
            return;
        }
        this.A = true;
        float f7 = this.O;
        float f10 = this.P;
        boolean z10 = this.D;
        int i10 = this.H;
        int i11 = this.G;
        yb1 yb1Var = jb1Var.f;
        if (yb1Var != null) {
            long j10 = yb1Var.r;
            if (yb1Var.s || j10 == 0) {
                return;
            }
            WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i10, i11);
        }
    }

    public final void e() {
        if (this.F) {
            this.F = false;
            jb1 jb1Var = this.p;
            if (jb1Var != null) {
                float f7 = this.M;
                float f10 = this.N;
                boolean z10 = this.D;
                int i10 = this.H;
                int i11 = this.G;
                yb1 yb1Var = jb1Var.f;
                if (yb1Var != null) {
                    long j10 = yb1Var.r;
                    if (yb1Var.s || j10 == 0) {
                        return;
                    }
                    WidgetSandboxNative.touch(j10, 0, f7, f10, 0, true, z10, i10, i11);
                }
            }
        }
    }

    public final void f() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (this.B) {
            this.a.requestDisallowParentIntercept(false);
        }
    }

    public final void g() {
        if (this.B || this.C) {
            return;
        }
        this.B = true;
        this.a.requestDisallowParentIntercept(true);
    }

    public final float h(float f7) {
        int i10;
        return (!LocaleController.isRTL || (i10 = this.Q) <= 0) ? f7 : (i10 / this.b) - f7;
    }

    public final void j(boolean z10, boolean z11, boolean z12) {
        if (!this.w || this.x) {
            return;
        }
        this.c.removeCallbacks(this.k);
        this.x = true;
        double d = this.L;
        double h = h(this.M);
        double d10 = this.N;
        boolean z13 = this.D;
        int i10 = this.G;
        c3.s sVar = this.m;
        if (sVar.a == 0) {
            sVar.a = WidgetSandboxNative.arbiterCreate();
        }
        int arbiterDown = WidgetSandboxNative.arbiterDown(sVar.a, d, h, d10, z10, z11, z12, z13, i10);
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
            double h10 = h(this.O);
            double d11 = this.P;
            long j10 = sVar.a;
            a(j10 == 0 ? -1 : WidgetSandboxNative.arbiterMove(j10, uptimeMillis, h10, d11));
        }
        if (this.y || this.z || this.D) {
            g();
            if ((this.y || this.D) && !this.C) {
                this.a.requestDisallowParentIntercept(true);
            }
        } else {
            f();
        }
        o();
    }

    public final void k(MotionEvent motionEvent, boolean z10) {
        jb1 jb1Var;
        yb1 yb1Var;
        float f7 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (!z10 || actionMasked == 10 || (jb1Var = this.p) == null || this.r || (yb1Var = jb1Var.f) == null || !yb1Var.y) {
            b();
            return;
        }
        this.E = true;
        this.I = motionEvent.getX() / f7;
        float y3 = motionEvent.getY() / f7;
        this.J = y3;
        jb1 jb1Var2 = this.p;
        float f10 = this.I;
        int i10 = i(motionEvent);
        yb1 yb1Var2 = jb1Var2.f;
        if (yb1Var2 != null) {
            long j10 = yb1Var2.r;
            if (yb1Var2.s || j10 == 0) {
                return;
            }
            WidgetSandboxNative.hover(j10, 0, f10, y3, i10);
        }
    }

    public final void l(boolean z10) {
        vb1 vb1Var;
        an0 an0Var = this.a;
        if (z10) {
            wa0 wa0Var = an0Var.w;
            AndroidUtilities.cancelRunOnUIThread(wa0Var);
            if (!an0Var.v) {
                yb1 yb1Var = an0Var.b.f;
                if (yb1Var == null || (vb1Var = yb1Var.D) == null || !(vb1Var.g || yb1Var.v)) {
                    AndroidUtilities.runOnUIThread(wa0Var, 1500L);
                } else {
                    an0Var.v = true;
                    an0Var.s = SystemClock.uptimeMillis();
                    if (an0Var.h() != an0Var.x) {
                        an0Var.m("on screen, loaded", true);
                    }
                }
            } else if (SystemClock.uptimeMillis() - an0Var.s < 1500) {
                AndroidUtilities.runOnUIThread(wa0Var, 200L);
            } else if (an0Var.h() != an0Var.x) {
                an0Var.m("on screen", true);
            }
        }
        an0Var.j();
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
        yb1 yb1Var;
        int i10;
        int actionIndex;
        int pointerCount;
        float f7 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = this.w;
        boolean z11 = z10 && (actionMasked == 1 || actionMasked == 3);
        jb1 jb1Var = this.p;
        if (jb1Var != null && !this.r && ((((yb1Var = jb1Var.f) != null && yb1Var.y) || z11) && (actionMasked != 3 || z10))) {
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
                                this.H = i(motionEvent);
                                b();
                            }
                            e();
                            return true;
                        }
                        d();
                        this.s = uptimeMillis;
                        this.t = motionEvent.getDownTime();
                        this.u = motionEvent.getX();
                        this.v = motionEvent.getY();
                        c();
                        this.w = true;
                        boolean z12 = motionEvent.getToolType(0) == 3;
                        this.D = z12;
                        this.G = (!z12 || (motionEvent.getButtonState() & 2) == 0) ? 0 : 2;
                        this.H = i(motionEvent);
                        if (this.D) {
                            b();
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
                        e();
                    }
                    if (!this.F && (!this.A || actionMasked == 0)) {
                        actionIndex = (i10 != 1 || i10 == 3) ? 0 : motionEvent.getActionIndex();
                        pointerCount = (i10 != 1 || i10 == 3) ? motionEvent.getPointerCount() : actionIndex + 1;
                        while (actionIndex < pointerCount) {
                            boolean z13 = (actionIndex == 0 && this.w) ? this.D : motionEvent.getToolType(actionIndex) == 3;
                            jb1 jb1Var2 = this.p;
                            float x10 = motionEvent.getX(actionIndex) / f7;
                            float y10 = motionEvent.getY(actionIndex) / f7;
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            boolean z14 = actionIndex == 0;
                            int i12 = i(motionEvent);
                            int i13 = (z13 && actionIndex == 0 && this.w) ? this.G : 0;
                            yb1 yb1Var2 = jb1Var2.f;
                            int i14 = i11;
                            if (yb1Var2 != null) {
                                long j10 = yb1Var2.r;
                                if (!yb1Var2.s && j10 != 0) {
                                    WidgetSandboxNative.touch(j10, i10, x10, y10, pointerId, z14, z13, i12, i13);
                                }
                            }
                            actionIndex++;
                            i11 = i14;
                        }
                    }
                    int i15 = i11;
                    if (this.w) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        int actionMasked3 = motionEvent.getActionMasked();
                        if (actionMasked3 == 1) {
                            if (!this.x) {
                                j(false, false, false);
                            }
                            c3.s sVar = this.m;
                            double d = uptimeMillis2;
                            double h = h(this.O);
                            double d10 = this.P;
                            long j11 = sVar.a;
                            a(j11 == 0 ? i15 : WidgetSandboxNative.arbiterUp(j11, d, h, d10));
                            c();
                            f();
                        } else {
                            if (actionMasked3 == 2) {
                                if (!this.x) {
                                    g();
                                    return true;
                                }
                                c3.s sVar2 = this.m;
                                double d11 = uptimeMillis2;
                                double h10 = h(this.O);
                                double d12 = this.P;
                                long j12 = sVar2.a;
                                a(j12 == 0 ? i15 : WidgetSandboxNative.arbiterMove(j12, d11, h10, d12));
                                return true;
                            }
                            if (actionMasked3 == 3) {
                                long j13 = this.m.a;
                                if (j13 != 0) {
                                    WidgetSandboxNative.arbiterCancel(j13);
                                }
                                c();
                                f();
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
                int i152 = i112;
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
            int i1522 = i1122;
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
        ob1 ob1Var = this.l;
        handler.removeCallbacks(ob1Var);
        long j10 = this.m.a;
        double arbiterHoldDeadline = j10 == 0 ? -1.0d : WidgetSandboxNative.arbiterHoldDeadline(j10);
        if (!this.w || arbiterHoldDeadline < 0.0d) {
            return;
        }
        handler.postDelayed(ob1Var, Math.max(0L, ((long) Math.ceil(arbiterHoldDeadline)) - SystemClock.uptimeMillis()));
    }

    public final void p() {
        if (this.p == null) {
            return;
        }
        if (this.r) {
            this.r = false;
            this.p = null;
            return;
        }
        d();
        b();
        this.p.k(false);
        jb1 jb1Var = this.p;
        if (jb1Var.h == this) {
            jb1Var.h = null;
        }
        this.p = null;
        this.c.removeCallbacks(this.n);
        this.o = null;
        c();
        c3.s sVar = this.m;
        long j10 = sVar.a;
        if (j10 == 0) {
            return;
        }
        WidgetSandboxNative.arbiterDestroy(j10);
        sVar.a = 0L;
    }
}
