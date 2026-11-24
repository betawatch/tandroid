// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class hw4 {
    public final /* synthetic */ qw4 a;

    public hw4(qw4 qw4Var) {
        this.a = qw4Var;
    }

    public final void a() {
        int i;
        qw4 qw4Var = this.a;
        ArrayList arrayList = qw4Var.c;
        ArrayList arrayList2 = qw4Var.E;
        long j = qw4Var.t;
        long j2 = qw4.G;
        if (j != j2) {
            qw4Var.t = j2;
            qw4Var.f = true;
            i = 32;
        } else {
            i = 0;
        }
        long j3 = bkb.Dm + zkb.b;
        if (qw4Var.s != j3) {
            qw4Var.s = j3;
            i |= 16;
        }
        Iterator it = qw4Var.n.iterator();
        while (it.hasNext()) {
            if (((o39) it.next()).c0()) {
                qw4Var.i++;
            }
        }
        if (i == 0) {
            return;
        }
        if (fod.a(i, 16)) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ow4 ow4Var = (ow4) arrayList2.get(i2);
                ow4Var.a.a(ow4Var.b.i());
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            pw4 pw4Var = (pw4) arrayList.get(i3);
            if (fod.a(i, 32)) {
                fw4 fw4Var = pw4Var.b;
                fx4 fx4Var = qw4.F;
                if (!Objects.equals(fw4Var.b, fx4Var)) {
                    fw4Var.b = fx4Var;
                    fw4Var.g(fx4Var);
                }
            }
            if (fod.a(i, 16)) {
                pw4Var.b.updateColors();
            }
            pw4Var.b.invalidateSelf();
            pw4Var.a.invalidate();
            pw4Var.h = true;
        }
        qw4Var.u |= i;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        ArrayList arrayList;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        qw4 qw4Var = this.a;
        ArrayList arrayList2 = qw4Var.o;
        Trace.beginSection("G.CheckPositions");
        qw4Var.y = false;
        RectF rectF = qw4Var.e;
        Rect rect = qw4Var.x;
        Rect rect2 = qw4Var.w;
        zw4 zw4Var = qw4Var.B;
        ArrayList arrayList3 = qw4Var.c;
        RectF rectF2 = qw4Var.v;
        int width = qw4Var.m.getWidth();
        int height = qw4Var.m.getHeight();
        if (qw4Var.z == width && qw4Var.A == height) {
            z = false;
        } else {
            qw4Var.z = width;
            qw4Var.A = height;
            z = true;
        }
        if (qw4Var.f) {
            qw4Var.f = false;
            z = true;
        }
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            pw4 pw4Var = (pw4) arrayList3.get(i2);
            View view = pw4Var.a;
            RectF rectF3 = pw4Var.g;
            boolean z7 = z;
            RectF rectF4 = pw4Var.f;
            int i3 = size;
            RectF rectF5 = pw4Var.d;
            int i4 = i2;
            RectF rectF6 = pw4Var.c;
            ArrayList arrayList4 = arrayList2;
            RectF rectF7 = pw4Var.e;
            RectF rectF8 = rectF;
            fw4 fw4Var = pw4Var.b;
            ArrayList arrayList5 = arrayList3;
            if (zec.c(view, qw4Var.m, rectF2)) {
                if (rectF6.equals(rectF2)) {
                    z2 = false;
                } else {
                    rectF6.set(rectF2);
                    pw4Var.h = true;
                    fw4Var.i(rectF6.left, rectF6.top);
                    z2 = true;
                }
                fw4Var.b(rect2);
                rectF2.set(rect2);
                if (!rectF5.equals(rectF2)) {
                    rectF5.set(rectF2);
                    pw4Var.h = true;
                    z2 = true;
                }
                rectF2.offset(rectF6.left, rectF6.top);
                if (!rectF7.equals(rectF2)) {
                    rectF7.set(rectF2);
                    pw4Var.h = true;
                    z2 = true;
                }
                rectF2.set(rectF7);
                rectF2.inset(-fw4Var.c(), -fw4Var.d());
                if (!rectF4.equals(rectF2)) {
                    rectF4.set(rectF2);
                    pw4Var.h = true;
                    z2 = true;
                }
                rectF2.set(rectF7);
                Rect rect3 = fw4Var.a;
                rect.set(rect3);
                if (rect3.isEmpty()) {
                    z3 = z2;
                } else {
                    float f = rect.left;
                    float f2 = rectF6.left;
                    float f3 = rect.top;
                    float f4 = rectF6.top;
                    z3 = z2;
                    rectF2.union(f + f2, f3 + f4, rect.right + f2, rect.bottom + f4);
                }
                rectF2.inset(-fw4Var.c(), -fw4Var.d());
                if (rectF3.equals(rectF2)) {
                    z4 = false;
                } else {
                    rectF3.set(rectF2);
                    z4 = true;
                }
                View view2 = pw4Var.a;
                if (!rectF7.isEmpty() && view2.isAttachedToWindow() && rectF7.intersects(0.0f, 0.0f, width, height) && fw4Var.c > 0) {
                    View view3 = view2;
                    while (view3 != null && view3 != qw4Var.m) {
                        if (view3.getVisibility() != 0 || view3.getAlpha() <= 0.0f) {
                            break;
                        }
                        Object parent = view3.getParent();
                        view3 = parent instanceof View ? (View) parent : null;
                    }
                    if (view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                        z5 = true;
                        z6 = pw4Var.i == z5 || (z5 && !(!z5 && fw4Var.e()));
                        if (z6) {
                            pw4Var.i = z5;
                            pw4Var.h = true;
                            z4 = true;
                            z3 = true;
                        }
                        if ((!z5 || z6) && z4) {
                            z = true;
                            i2 = i4 + 1;
                            size = i3;
                            arrayList2 = arrayList4;
                            rectF = rectF8;
                            arrayList3 = arrayList5;
                        } else if (z5 && z3) {
                            qw4Var.y = true;
                        }
                    }
                }
                z5 = false;
                if (pw4Var.i == z5) {
                }
                if (z6) {
                }
                if (z5) {
                }
                z = true;
                i2 = i4 + 1;
                size = i3;
                arrayList2 = arrayList4;
                rectF = rectF8;
                arrayList3 = arrayList5;
            }
            z = z7;
            i2 = i4 + 1;
            size = i3;
            arrayList2 = arrayList4;
            rectF = rectF8;
            arrayList3 = arrayList5;
        }
        ArrayList arrayList6 = arrayList2;
        RectF rectF9 = rectF;
        ArrayList arrayList7 = arrayList3;
        boolean z8 = z;
        if (z8) {
            zw4Var.b = 0;
            int size2 = arrayList7.size();
            int i5 = 0;
            while (true) {
                arrayList = arrayList7;
                if (i5 >= size2) {
                    break;
                }
                pw4 pw4Var2 = (pw4) arrayList.get(i5);
                if (pw4Var2.i && pw4Var2.b.j()) {
                    RectF rectF10 = pw4Var2.g;
                    zw4Var.a(rectF10.left, rectF10.top, rectF10.right, rectF10.bottom);
                }
                i5++;
                arrayList7 = arrayList;
            }
            if (!rectF9.isEmpty()) {
                zw4Var.a(rectF9.left, rectF9.top, rectF9.right, rectF9.bottom);
            }
            ax4 ax4Var = qw4Var.d;
            zw4 zw4Var2 = qw4Var.C;
            ax4Var.getClass();
            if (zw4Var == zw4Var2) {
                w26.j("positions and output must be different arrays");
                return;
            }
            zw4Var2.b = 0;
            int i6 = zw4Var.b;
            for (int i7 = 0; i7 < i6; i7++) {
                RectF c = zw4Var.c(i7);
                float f5 = c.left;
                float f6 = c.top;
                float f7 = c.right;
                float f8 = f6;
                float f9 = f5;
                float f10 = c.bottom;
                int i8 = 0;
                while (i8 < zw4Var2.b) {
                    RectF c2 = zw4Var2.c(i8);
                    float f11 = c2.left;
                    float f12 = c2.right;
                    if (f7 >= f11 ? f12 >= f9 || f9 - f12 <= Float.POSITIVE_INFINITY : f11 - f7 <= Float.POSITIVE_INFINITY) {
                        float f13 = c2.top;
                        float f14 = c2.bottom;
                        i = i6;
                        float f15 = ax4Var.a;
                        if (f10 >= f13 ? f14 >= f8 || f8 - f14 <= f15 : f13 - f10 <= f15) {
                            if (f11 < f9) {
                                f9 = f11;
                            }
                            if (f13 < f8) {
                                f8 = f13;
                            }
                            if (f12 > f7) {
                                f7 = f12;
                            }
                            if (f14 > f10) {
                                f10 = f14;
                            }
                            zw4Var2.d(i8);
                            i8 = 0;
                            i6 = i;
                        }
                    } else {
                        i = i6;
                    }
                    i8++;
                    i6 = i;
                }
                zw4Var2.a(f9, f8, f7, f10);
            }
            int i9 = zw4Var2.b;
            for (int i10 = 1; i10 < i9; i10++) {
                RectF c3 = zw4Var2.c(i10);
                float f16 = c3.left;
                float f17 = c3.top;
                float f18 = c3.right;
                float f19 = c3.bottom;
                int i11 = i10 - 1;
                while (i11 >= 0) {
                    RectF c4 = zw4Var2.c(i11);
                    float f20 = c4.top;
                    float f21 = c4.left;
                    int compare = Float.compare(f20, f17);
                    if (compare == 0) {
                        compare = Float.compare(f21, f16);
                    }
                    if (compare > 0) {
                        zw4Var2.c(i11 + 1).set(c4);
                        i11--;
                    }
                }
                zw4Var2.c(i11 + 1).set(f16, f17, f18, f19);
            }
        } else {
            arrayList = arrayList7;
        }
        Trace.endSection();
        int i12 = qw4Var.u;
        qw4Var.u = 0;
        if (z8) {
            i12 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList6.size();
            int i13 = 0;
            while (i13 < size3) {
                ArrayList arrayList8 = arrayList6;
                cq3 cq3Var = (cq3) arrayList8.get(i13);
                if (cq3Var.e) {
                    cq3Var.e = false;
                    qw4Var.i++;
                }
                i13++;
                arrayList6 = arrayList8;
            }
        }
        long j = qw4Var.r;
        long j2 = qw4Var.i;
        if (j != j2) {
            qw4Var.r = j2;
            i12 |= 8;
        }
        long j3 = qw4Var.q;
        long j4 = qw4Var.h;
        if (j3 != j4) {
            qw4Var.q = j4;
            i12 |= 2;
        }
        long j5 = qw4Var.p;
        long j6 = qw4Var.g;
        if (j5 != j6) {
            qw4Var.p = j6;
            i12 |= 1;
        }
        if (i12 != 0) {
            Trace.beginSection("G.Listeners");
            mw4 mw4Var = qw4Var.a;
            if (mw4Var != null) {
                mw4Var.j(i12);
            }
            Trace.endSection();
        } else if (!qw4Var.y) {
            return;
        }
        boolean a = fod.a(i12, 4);
        boolean z9 = fod.a(i12, 1) || fod.a(i12, 2);
        Trace.beginSection("G.UpdateDisplayLists");
        int size4 = arrayList.size();
        for (int i14 = 0; i14 < size4; i14++) {
            pw4 pw4Var3 = (pw4) arrayList.get(i14);
            boolean z10 = pw4Var3.i;
            fw4 fw4Var2 = pw4Var3.b;
            if (z10 && (pw4Var3.h || a || z9)) {
                pw4Var3.h = false;
                if (fw4Var2.j()) {
                    fw4Var2.a();
                } else {
                    fw4Var2.invalidateSelf();
                    pw4Var3.a.invalidate();
                }
            }
        }
        Trace.endSection();
    }
}
