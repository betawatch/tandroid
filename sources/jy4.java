// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jy4 {
    public final /* synthetic */ sy4 a;

    public jy4(sy4 sy4Var) {
        this.a = sy4Var;
    }

    public final void a() {
        int i;
        sy4 sy4Var = this.a;
        ArrayList arrayList = sy4Var.c;
        ArrayList arrayList2 = sy4Var.E;
        long j = sy4Var.t;
        long j2 = sy4.G;
        if (j != j2) {
            sy4Var.t = j2;
            sy4Var.f = true;
            i = 32;
        } else {
            i = 0;
        }
        long j3 = cmb.Dm + anb.b;
        if (sy4Var.s != j3) {
            sy4Var.s = j3;
            i |= 16;
        }
        Iterator it = sy4Var.n.iterator();
        while (it.hasNext()) {
            if (((r59) it.next()).c0()) {
                sy4Var.i++;
            }
        }
        if (i == 0) {
            return;
        }
        if (iqd.a(i, 16)) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                qy4 qy4Var = (qy4) arrayList2.get(i2);
                qy4Var.a.a(qy4Var.b.i());
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ry4 ry4Var = (ry4) arrayList.get(i3);
            if (iqd.a(i, 32)) {
                hy4 hy4Var = ry4Var.b;
                hz4 hz4Var = sy4.F;
                if (!Objects.equals(hy4Var.b, hz4Var)) {
                    hy4Var.b = hz4Var;
                    hy4Var.g(hz4Var);
                }
            }
            if (iqd.a(i, 16)) {
                ry4Var.b.updateColors();
            }
            ry4Var.b.invalidateSelf();
            ry4Var.a.invalidate();
            ry4Var.h = true;
        }
        sy4Var.u |= i;
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
        sy4 sy4Var = this.a;
        ArrayList arrayList2 = sy4Var.o;
        Trace.beginSection("G.CheckPositions");
        sy4Var.y = false;
        RectF rectF = sy4Var.e;
        Rect rect = sy4Var.x;
        Rect rect2 = sy4Var.w;
        bz4 bz4Var = sy4Var.B;
        ArrayList arrayList3 = sy4Var.c;
        RectF rectF2 = sy4Var.v;
        int width = sy4Var.m.getWidth();
        int height = sy4Var.m.getHeight();
        if (sy4Var.z == width && sy4Var.A == height) {
            z = false;
        } else {
            sy4Var.z = width;
            sy4Var.A = height;
            z = true;
        }
        if (sy4Var.f) {
            sy4Var.f = false;
            z = true;
        }
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            ry4 ry4Var = (ry4) arrayList3.get(i2);
            View view = ry4Var.a;
            RectF rectF3 = ry4Var.g;
            boolean z7 = z;
            RectF rectF4 = ry4Var.f;
            int i3 = size;
            RectF rectF5 = ry4Var.d;
            int i4 = i2;
            RectF rectF6 = ry4Var.c;
            ArrayList arrayList4 = arrayList2;
            RectF rectF7 = ry4Var.e;
            RectF rectF8 = rectF;
            hy4 hy4Var = ry4Var.b;
            ArrayList arrayList5 = arrayList3;
            if (zgc.c(view, sy4Var.m, rectF2)) {
                if (rectF6.equals(rectF2)) {
                    z2 = false;
                } else {
                    rectF6.set(rectF2);
                    ry4Var.h = true;
                    hy4Var.i(rectF6.left, rectF6.top);
                    z2 = true;
                }
                hy4Var.b(rect2);
                rectF2.set(rect2);
                if (!rectF5.equals(rectF2)) {
                    rectF5.set(rectF2);
                    ry4Var.h = true;
                    z2 = true;
                }
                rectF2.offset(rectF6.left, rectF6.top);
                if (!rectF7.equals(rectF2)) {
                    rectF7.set(rectF2);
                    ry4Var.h = true;
                    z2 = true;
                }
                rectF2.set(rectF7);
                rectF2.inset(-hy4Var.c(), -hy4Var.d());
                if (!rectF4.equals(rectF2)) {
                    rectF4.set(rectF2);
                    ry4Var.h = true;
                    z2 = true;
                }
                rectF2.set(rectF7);
                Rect rect3 = hy4Var.a;
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
                rectF2.inset(-hy4Var.c(), -hy4Var.d());
                if (rectF3.equals(rectF2)) {
                    z4 = false;
                } else {
                    rectF3.set(rectF2);
                    z4 = true;
                }
                View view2 = ry4Var.a;
                if (!rectF7.isEmpty() && view2.isAttachedToWindow() && rectF7.intersects(0.0f, 0.0f, width, height) && hy4Var.c > 0) {
                    View view3 = view2;
                    while (view3 != null && view3 != sy4Var.m) {
                        if (view3.getVisibility() != 0 || view3.getAlpha() <= 0.0f) {
                            break;
                        }
                        Object parent = view3.getParent();
                        view3 = parent instanceof View ? (View) parent : null;
                    }
                    if (view2.getScaleX() != 0.0f && view2.getScaleY() != 0.0f) {
                        z5 = true;
                        z6 = ry4Var.i == z5 || (z5 && !(!z5 && hy4Var.e()));
                        if (z6) {
                            ry4Var.i = z5;
                            ry4Var.h = true;
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
                            sy4Var.y = true;
                        }
                    }
                }
                z5 = false;
                if (ry4Var.i == z5) {
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
            bz4Var.b = 0;
            int size2 = arrayList7.size();
            int i5 = 0;
            while (true) {
                arrayList = arrayList7;
                if (i5 >= size2) {
                    break;
                }
                ry4 ry4Var2 = (ry4) arrayList.get(i5);
                if (ry4Var2.i && ry4Var2.b.j()) {
                    RectF rectF10 = ry4Var2.g;
                    bz4Var.a(rectF10.left, rectF10.top, rectF10.right, rectF10.bottom);
                }
                i5++;
                arrayList7 = arrayList;
            }
            if (!rectF9.isEmpty()) {
                bz4Var.a(rectF9.left, rectF9.top, rectF9.right, rectF9.bottom);
            }
            cz4 cz4Var = sy4Var.d;
            bz4 bz4Var2 = sy4Var.C;
            cz4Var.getClass();
            if (bz4Var == bz4Var2) {
                u36.j("positions and output must be different arrays");
                return;
            }
            bz4Var2.b = 0;
            int i6 = bz4Var.b;
            for (int i7 = 0; i7 < i6; i7++) {
                RectF c = bz4Var.c(i7);
                float f5 = c.left;
                float f6 = c.top;
                float f7 = c.right;
                float f8 = f6;
                float f9 = f5;
                float f10 = c.bottom;
                int i8 = 0;
                while (i8 < bz4Var2.b) {
                    RectF c2 = bz4Var2.c(i8);
                    float f11 = c2.left;
                    float f12 = c2.right;
                    if (f7 >= f11 ? f12 >= f9 || f9 - f12 <= Float.POSITIVE_INFINITY : f11 - f7 <= Float.POSITIVE_INFINITY) {
                        float f13 = c2.top;
                        float f14 = c2.bottom;
                        i = i6;
                        float f15 = cz4Var.a;
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
                            bz4Var2.d(i8);
                            i8 = 0;
                            i6 = i;
                        }
                    } else {
                        i = i6;
                    }
                    i8++;
                    i6 = i;
                }
                bz4Var2.a(f9, f8, f7, f10);
            }
            int i9 = bz4Var2.b;
            for (int i10 = 1; i10 < i9; i10++) {
                RectF c3 = bz4Var2.c(i10);
                float f16 = c3.left;
                float f17 = c3.top;
                float f18 = c3.right;
                float f19 = c3.bottom;
                int i11 = i10 - 1;
                while (i11 >= 0) {
                    RectF c4 = bz4Var2.c(i11);
                    float f20 = c4.top;
                    float f21 = c4.left;
                    int compare = Float.compare(f20, f17);
                    if (compare == 0) {
                        compare = Float.compare(f21, f16);
                    }
                    if (compare > 0) {
                        bz4Var2.c(i11 + 1).set(c4);
                        i11--;
                    }
                }
                bz4Var2.c(i11 + 1).set(f16, f17, f18, f19);
            }
        } else {
            arrayList = arrayList7;
        }
        Trace.endSection();
        int i12 = sy4Var.u;
        sy4Var.u = 0;
        if (z8) {
            i12 |= 4;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            int size3 = arrayList6.size();
            int i13 = 0;
            while (i13 < size3) {
                ArrayList arrayList8 = arrayList6;
                mr3 mr3Var = (mr3) arrayList8.get(i13);
                if (mr3Var.e) {
                    mr3Var.e = false;
                    sy4Var.i++;
                }
                i13++;
                arrayList6 = arrayList8;
            }
        }
        long j = sy4Var.r;
        long j2 = sy4Var.i;
        if (j != j2) {
            sy4Var.r = j2;
            i12 |= 8;
        }
        long j3 = sy4Var.q;
        long j4 = sy4Var.h;
        if (j3 != j4) {
            sy4Var.q = j4;
            i12 |= 2;
        }
        long j5 = sy4Var.p;
        long j6 = sy4Var.g;
        if (j5 != j6) {
            sy4Var.p = j6;
            i12 |= 1;
        }
        if (i12 != 0) {
            Trace.beginSection("G.Listeners");
            oy4 oy4Var = sy4Var.a;
            if (oy4Var != null) {
                oy4Var.s(i12);
            }
            Trace.endSection();
        } else if (!sy4Var.y) {
            return;
        }
        boolean a = iqd.a(i12, 4);
        boolean z9 = iqd.a(i12, 1) || iqd.a(i12, 2);
        Trace.beginSection("G.UpdateDisplayLists");
        int size4 = arrayList.size();
        for (int i14 = 0; i14 < size4; i14++) {
            ry4 ry4Var3 = (ry4) arrayList.get(i14);
            boolean z10 = ry4Var3.i;
            hy4 hy4Var2 = ry4Var3.b;
            if (z10 && (ry4Var3.h || a || z9)) {
                ry4Var3.h = false;
                if (hy4Var2.j()) {
                    hy4Var2.a();
                } else {
                    hy4Var2.invalidateSelf();
                    ry4Var3.a.invalidate();
                }
            }
        }
        Trace.endSection();
    }
}
