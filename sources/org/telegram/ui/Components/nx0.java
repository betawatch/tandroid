package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nx0 extends View {
    public static final zw0 S = new zw0(0);
    public static final zw0 T = new zw0(1);
    public static final zw0 U = new zw0(3);
    public static final zw0 V = new zw0(4);
    public int D;
    public int E;
    public int[] F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final Path L;
    public final RectF M;
    public final float[] N;
    public final mx0 O;
    public final ArrayList P;
    public boolean Q;
    public final lx0 R;
    public final org.telegram.ui.Cells.i9 a;
    public int b;
    public final dx0 c;
    public final dx0 d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public nx0(Context context, mx0 mx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.c = new dx0(this, true);
        this.d = new dx0(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = org.telegram.messenger.g0.L(8.0f);
        this.s = org.telegram.messenger.g0.L(9.0f);
        this.w = org.telegram.messenger.g0.L(12.0f);
        this.y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.a = i9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = mx0Var;
        lx0 lx0Var = new lx0(this, this);
        this.R = lx0Var;
        r0.i0.j(this, lx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(rf.b.r(str, ". "));
    }

    public static void k(ix0 ix0Var, int i7, int i10, int i11, int i12) {
        hx0 hx0Var = new hx0(i7, i10 + i7);
        kx0 kx0Var = ix0Var.a;
        ix0Var.a = new kx0(kx0Var.a, hx0Var, kx0Var.c, kx0Var.d);
        hx0 hx0Var2 = new hx0(i11, i12 + i11);
        kx0 kx0Var2 = ix0Var.b;
        ix0Var.b = new kx0(kx0Var2.a, hx0Var2, kx0Var2.c, kx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.P;
        gx0 gx0Var = new gx0(this, arrayList.size());
        ix0 ix0Var = new ix0();
        hx0 hx0Var = new hx0(i10, i12 + i10);
        zw0 zw0Var = V;
        ix0Var.a = new kx0(false, hx0Var, zw0Var, 0.0f);
        ix0Var.b = new kx0(false, new hx0(i7, i11 + i7), zw0Var, 0.0f);
        gx0Var.a = ix0Var;
        gx0Var.j = i10;
        arrayList.add(gx0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.P;
        gx0 gx0Var = new gx0(this, arrayList.size());
        gx0Var.c = pagetablecell;
        ix0 ix0Var = new ix0();
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        hx0 hx0Var = new hx0(i10, i12 + i10);
        zw0 zw0Var = V;
        ix0Var.a = new kx0(false, hx0Var, zw0Var, 0.0f);
        ix0Var.b = new kx0(false, new hx0(i7, i11 + i7), zw0Var, 1.0f);
        gx0Var.a = ix0Var;
        gx0Var.j = i10;
        arrayList.add(gx0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i10, i10 + r10));
        }
        h();
    }

    public final void c() {
        Throwable th2;
        int i7 = this.n;
        if (i7 != 0) {
            int childCount = getChildCount();
            int i10 = 1;
            for (int i11 = 0; i11 < childCount; i11++) {
                i10 = (i10 * 31) + d(i11).a.hashCode();
            }
            if (i7 != i10) {
                h();
                c();
                return;
            }
            return;
        }
        boolean z9 = this.e == 0;
        int i12 = (z9 ? this.c : this.d).b;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 0;
        }
        if (i12 < 0 || i12 > 1024) {
            g("Table grid count out of bounds");
            throw null;
        }
        int[] iArr = new int[i12];
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount2; i15++) {
            ix0 ix0Var = d(i15).a;
            kx0 kx0Var = z9 ? ix0Var.a : ix0Var.b;
            hx0 hx0Var = kx0Var.b;
            boolean z10 = kx0Var.a;
            int a10 = hx0Var.a();
            if (a10 <= 0 || a10 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z10) {
                i13 = hx0Var.a;
            }
            kx0 kx0Var2 = z9 ? ix0Var.b : ix0Var.a;
            hx0 hx0Var2 = kx0Var2.b;
            int a11 = hx0Var2.a();
            int i16 = hx0Var2.a;
            if (a11 > 0) {
                th2 = null;
                if (hx0Var2.a() <= 1024) {
                    boolean z11 = kx0Var2.a;
                    int a12 = hx0Var2.a();
                    if (i12 != 0) {
                        a12 = Math.min(a12, i12 - (z11 ? Math.min(i16, i12) : 0));
                    }
                    if (z11) {
                        i14 = i16;
                    }
                    if (i12 != 0) {
                        if (!z10 || !z11) {
                            while (true) {
                                int i17 = i14 + a12;
                                if (i17 <= i12) {
                                    for (int i18 = i14; i18 < i17; i18++) {
                                        if (iArr[i18] <= i13) {
                                        }
                                    }
                                    break;
                                }
                                if (z11) {
                                    i13++;
                                } else if (i17 <= i12) {
                                    i14++;
                                } else {
                                    i13++;
                                    i14 = 0;
                                }
                            }
                        }
                        Arrays.fill(iArr, Math.min(i14, i12), Math.min(i14 + a12, i12), i13 + a10);
                    }
                    if (z9) {
                        k(ix0Var, i13, a10, i14, a12);
                    } else {
                        k(ix0Var, i14, a12, i13, a10);
                    }
                    i14 += a12;
                }
            } else {
                th2 = null;
            }
            g("Table row or column span out of bounds");
            throw th2;
        }
        int childCount3 = getChildCount();
        int i19 = 1;
        for (int i20 = 0; i20 < childCount3; i20++) {
            i19 = (i19 * 31) + d(i20).a.hashCode();
        }
        this.n = i19;
    }

    public final gx0 d(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (gx0) arrayList.get(i7);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        lx0 lx0Var = this.R;
        if (lx0Var == null || !lx0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(gx0 gx0Var, boolean z9, boolean z10) {
        int[] iArr;
        if (this.h == 1) {
            return f(gx0Var, z9, z10);
        }
        dx0 dx0Var = z9 ? this.c : this.d;
        if (z10) {
            if (dx0Var.j == null) {
                dx0Var.j = new int[dx0Var.e() + 1];
            }
            if (!dx0Var.k) {
                dx0Var.b(true);
                dx0Var.k = true;
            }
            iArr = dx0Var.j;
        } else {
            if (dx0Var.l == null) {
                dx0Var.l = new int[dx0Var.e() + 1];
            }
            if (!dx0Var.m) {
                dx0Var.b(false);
                dx0Var.m = true;
            }
            iArr = dx0Var.l;
        }
        ix0 ix0Var = gx0Var.a;
        hx0 hx0Var = (z9 ? ix0Var.b : ix0Var.a).b;
        return iArr[z10 ? hx0Var.a : hx0Var.b];
    }

    public final int f(gx0 gx0Var, boolean z9, boolean z10) {
        ix0 ix0Var = gx0Var.a;
        int i7 = z9 ? z10 ? ((ViewGroup.MarginLayoutParams) ix0Var).leftMargin : ((ViewGroup.MarginLayoutParams) ix0Var).rightMargin : z10 ? ((ViewGroup.MarginLayoutParams) ix0Var).topMargin : ((ViewGroup.MarginLayoutParams) ix0Var).bottomMargin;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (!this.f) {
            return 0;
        }
        kx0 kx0Var = z9 ? ix0Var.b : ix0Var.a;
        dx0 dx0Var = z9 ? this.c : this.d;
        hx0 hx0Var = kx0Var.b;
        if ((z9 && this.I) != z10) {
            int i10 = hx0Var.a;
            return 0;
        }
        int i11 = hx0Var.b;
        dx0Var.e();
        return 0;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.P.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.E;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h() {
        this.n = 0;
        dx0 dx0Var = this.c;
        dx0Var.k();
        dx0 dx0Var2 = this.d;
        dx0Var2.k();
        if (dx0Var == null || dx0Var2 == null) {
            return;
        }
        dx0Var.l();
        dx0Var2.l();
    }

    public final void i(gx0 gx0Var, int i7, int i10, boolean z9) {
        gx0Var.d(e(gx0Var, true, false) + e(gx0Var, true, true) + i7, e(gx0Var, false, false) + e(gx0Var, false, true) + i10, z9);
    }

    public final void j(int i7, boolean z9) {
        yw0 b10;
        mx0 mx0Var = this.O;
        int i10 = 0;
        if (!z9 || !this.Q || this.e != 0) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                gx0 d = d(i11);
                ix0 ix0Var = d.a;
                if (z9) {
                    int size = View.MeasureSpec.getSize(i7);
                    d.e(mx0Var.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w * 4) : (int) (size / 1.5f)));
                    if (d.b != null) {
                        ((ViewGroup.MarginLayoutParams) ix0Var).height = Math.max(this.x, d.f + this.r + this.s);
                        int b11 = d.b.b();
                        ((ViewGroup.MarginLayoutParams) ix0Var).width = b11 > 0 ? ((ViewGroup.MarginLayoutParams) ix0Var).height * b11 : (this.w * 2) + d.e;
                    } else {
                        ((ViewGroup.MarginLayoutParams) ix0Var).width = 0;
                        ((ViewGroup.MarginLayoutParams) ix0Var).height = 0;
                    }
                    i(d, ((ViewGroup.MarginLayoutParams) ix0Var).width, ((ViewGroup.MarginLayoutParams) ix0Var).height, true);
                } else {
                    boolean z10 = this.e == 0;
                    kx0 kx0Var = z10 ? ix0Var.b : ix0Var.a;
                    if (kx0.a(kx0Var, z10) == V) {
                        hx0 hx0Var = kx0Var.b;
                        int[] g10 = (z10 ? this.c : this.d).g();
                        int e10 = (g10[hx0Var.b] - g10[hx0Var.a]) - (e(d, z10, false) + e(d, z10, true));
                        if (z10) {
                            fx0 fx0Var = d.b;
                            int b12 = fx0Var != null ? fx0Var.b() : 0;
                            if (b12 > 0) {
                                int max = Math.max(1, Math.round(e10 / b12));
                                ((ViewGroup.MarginLayoutParams) ix0Var).height = max;
                                d.m = max;
                            }
                            i(d, e10, ((ViewGroup.MarginLayoutParams) ix0Var).height, false);
                        } else {
                            i(d, ((ViewGroup.MarginLayoutParams) ix0Var).width, e10, false);
                        }
                    }
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        int size2 = View.MeasureSpec.getSize(i7);
        int i12 = this.w * 2;
        int max2 = Math.max(1, (this.b > 1 ? Math.round(size2 * 0.8f) : size2) - i12);
        ArrayList arrayList = new ArrayList(childCount2);
        yw0[] yw0VarArr = new yw0[childCount2];
        int i13 = 0;
        while (i13 < childCount2) {
            gx0 d2 = d(i13);
            ix0 ix0Var2 = d2.a;
            hx0 hx0Var2 = ix0Var2.b.b;
            d2.e(mx0Var.c(d2.c, max2));
            if (d2.b == null) {
                ((ViewGroup.MarginLayoutParams) ix0Var2).width = i10;
                ((ViewGroup.MarginLayoutParams) ix0Var2).height = i10;
                i(d2, i10, i10, true);
            } else {
                ((ViewGroup.MarginLayoutParams) ix0Var2).height = Math.max(this.x, d2.f + this.r + this.s);
                int b13 = d2.b.b();
                if (b13 > 0) {
                    int i14 = hx0Var2.a;
                    int a10 = hx0Var2.a();
                    int i15 = ((ViewGroup.MarginLayoutParams) ix0Var2).height * b13;
                    b10 = new yw0();
                    b10.a = i14;
                    b10.b = Math.max(1, a10);
                    b10.g = true;
                    int max3 = Math.max(0, i15);
                    b10.e = max3;
                    b10.d = max3;
                } else {
                    Layout a11 = d2.b.a();
                    b10 = c8.na.b(a11 != null ? a11.getText() : null, a11 != null ? a11.getPaint() : null, hx0Var2.a, hx0Var2.a(), i12, max2, d2.e);
                }
                yw0VarArr[i13] = b10;
                arrayList.add(b10);
            }
            i13++;
            i10 = 0;
        }
        int[] a12 = c8.na.a(this.b, size2, 0, arrayList);
        for (int i16 = 0; i16 < childCount2; i16++) {
            gx0 d10 = d(i16);
            yw0 yw0Var = yw0VarArr[i16];
            if (yw0Var != null) {
                ix0 ix0Var3 = d10.a;
                if (d10.b.b() > 0) {
                    ((ViewGroup.MarginLayoutParams) ix0Var3).width = yw0Var.e;
                } else {
                    hx0 hx0Var3 = ix0Var3.b.b;
                    int i17 = 0;
                    for (int max4 = Math.max(0, hx0Var3.a); max4 < Math.min(this.b, hx0Var3.b); max4++) {
                        i17 += a12[max4];
                    }
                    int max5 = Math.max(1, i17 - i12);
                    if (d10.e > max5) {
                        d10.e(mx0Var.c(d10.c, max5));
                        ((ViewGroup.MarginLayoutParams) ix0Var3).height = Math.max(this.x, d10.f + this.r + this.s);
                    }
                    ((ViewGroup.MarginLayoutParams) ix0Var3).width = d10.e + i12;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) ix0Var3).width, ((ViewGroup.MarginLayoutParams) ix0Var3).height, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            d(i7).a(canvas, this, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        boolean z9;
        int i13;
        int i14;
        nx0 nx0Var = this;
        nx0Var.c();
        dx0 dx0Var = nx0Var.d;
        dx0 dx0Var2 = nx0Var.c;
        if (dx0Var2 != null && dx0Var != null) {
            dx0Var2.l();
            dx0Var.l();
        }
        nx0Var.b = 0;
        int childCount = nx0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            nx0Var.b = Math.max(nx0Var.b, nx0Var.d(i15).a.b.b.b);
        }
        nx0Var.j(i7, true);
        if (nx0Var.e == 0) {
            i11 = dx0Var2.i(i7);
            if (nx0Var.y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                dx0Var2.v.a = i11;
                dx0Var2.w.a = -i11;
                dx0Var2.q = false;
                dx0Var2.g();
            }
            nx0Var.j(i7, false);
            i12 = dx0Var.i(i10);
        } else {
            int i16 = dx0Var.i(i10);
            nx0Var.j(i7, false);
            i11 = dx0Var2.i(i7);
            i12 = i16;
        }
        int max = Math.max(i12, nx0Var.getSuggestedMinimumHeight());
        nx0Var.setMeasuredDimension(i11, max);
        dx0Var2.v.a = i11;
        dx0Var2.w.a = -i11;
        dx0Var2.q = false;
        dx0Var2.g();
        dx0Var.v.a = max;
        dx0Var.w.a = -max;
        dx0Var.q = false;
        dx0Var.g();
        int[] g10 = dx0Var2.g();
        int[] g11 = dx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = nx0Var.J;
        arrayList.clear();
        int i17 = g10[g10.length - 1];
        int childCount2 = nx0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            gx0 d = nx0Var.d(i19);
            ix0 ix0Var = d.a;
            kx0 kx0Var = ix0Var.b;
            kx0 kx0Var2 = ix0Var.a;
            hx0 hx0Var = kx0Var.b;
            hx0 hx0Var2 = kx0Var2.b;
            int i20 = childCount2;
            int i21 = g10[hx0Var.a];
            int i22 = g11[hx0Var2.a];
            int i23 = g10[hx0Var.b];
            int i24 = g11[hx0Var2.b];
            int i25 = i23 - i21;
            int i26 = i24 - i22;
            int i27 = d.k;
            dx0 dx0Var3 = dx0Var;
            int i28 = d.l;
            zw0 a10 = kx0.a(kx0Var, true);
            zw0 a11 = kx0.a(kx0Var2, false);
            h6.m f10 = dx0Var2.f();
            ex0 ex0Var = (ex0) ((Object[]) f10.d)[((int[]) f10.b)[i19]];
            h6.m f11 = dx0Var3.f();
            dx0 dx0Var4 = dx0Var2;
            ex0 ex0Var2 = (ex0) ((Object[]) f11.d)[((int[]) f11.b)[i19]];
            int b10 = a10.b(d, i25 - ex0Var.d(true));
            int b11 = a11.b(d, i26 - ex0Var2.d(true));
            int e10 = nx0Var.e(d, true, true);
            int e11 = nx0Var.e(d, false, true);
            int e12 = nx0Var.e(d, true, false);
            int i29 = e10 + e12;
            int e13 = e11 + nx0Var.e(d, false, false);
            int a12 = ex0Var.a(nx0Var, d, a10, i27 + i29, true);
            nx0Var = this;
            int a13 = ex0Var2.a(nx0Var, d, a11, i28 + e13, false);
            int c10 = a10.c(i27, i25 - i29);
            int c11 = a11.c(i28, i26 - e13);
            int i30 = i21 + b10 + a12;
            int i31 = !nx0Var.I ? e10 + i30 : ((i17 - c10) - e12) - i30;
            int i32 = i22 + b11 + a13 + e11;
            if (d.c != null) {
                if (c10 == d.k && c11 == d.l) {
                    i14 = 0;
                } else {
                    i14 = 0;
                    d.d(c10, c11, false);
                }
                int i33 = d.m;
                if (i33 != 0 && i33 != c11) {
                    hx0 hx0Var3 = d.a.a.b;
                    if (hx0Var3.b - hx0Var3.a <= 1) {
                        ArrayList arrayList2 = nx0Var.K;
                        int size = arrayList2.size();
                        int i34 = i14;
                        while (true) {
                            if (i34 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i34);
                            float f12 = pointF.x;
                            float f13 = d.a.a.b.a;
                            if (f12 > f13 || pointF.y <= f13) {
                                i34++;
                            }
                        }
                    }
                }
            }
            d.p = i31;
            d.q = i32;
            i18 = i19 + 1;
            dx0Var = dx0Var3;
            childCount2 = i20;
            dx0Var2 = dx0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            gx0 gx0Var = (gx0) arrayList.get(i35);
            int i36 = gx0Var.l;
            int i37 = gx0Var.d;
            int i38 = i36 - gx0Var.m;
            ArrayList arrayList3 = nx0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                gx0 gx0Var2 = (gx0) arrayList3.get(i39);
                if (gx0Var.a.a.b.a != gx0Var2.a.a.b.a) {
                    break;
                }
                int i40 = gx0Var.m;
                int i41 = gx0Var2.m;
                if (i40 < i41) {
                    z9 = true;
                    break;
                }
                int i42 = gx0Var2.l - i41;
                if (i42 > 0) {
                    i38 = Math.min(i38, i42);
                }
            }
            z9 = false;
            if (!z9) {
                int i43 = i37 - 1;
                while (true) {
                    if (i43 < 0) {
                        break;
                    }
                    gx0 gx0Var3 = (gx0) arrayList3.get(i43);
                    if (gx0Var.a.a.b.a != gx0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = gx0Var.m;
                    int i45 = gx0Var3.m;
                    if (i44 < i45) {
                        z9 = true;
                        break;
                    }
                    int i46 = gx0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z9) {
                gx0Var.l = gx0Var.m;
                gx0Var.g();
                max -= i38;
                int i47 = gx0Var.a.a.b.a;
                while (true) {
                    i47++;
                    if (i47 >= copyOf.length) {
                        break;
                    } else {
                        copyOf[i47] = copyOf[i47] - i38;
                    }
                }
                int size4 = arrayList3.size();
                int i48 = size2;
                int i49 = i35;
                int i50 = 0;
                while (i50 < size4) {
                    gx0 gx0Var4 = (gx0) arrayList3.get(i50);
                    if (gx0Var == gx0Var4) {
                        i13 = i50;
                    } else {
                        int i51 = gx0Var.a.a.b.a;
                        int i52 = gx0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (gx0Var4.m != gx0Var4.l) {
                                arrayList.remove(gx0Var4);
                                if (gx0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = gx0Var4.l - i38;
                            gx0Var4.l = i53;
                            i13 = i50;
                            gx0Var4.d(gx0Var4.k, i53, true);
                        } else {
                            i13 = i50;
                            if (i51 < i52) {
                                gx0Var4.q -= i38;
                            }
                        }
                    }
                    i50 = i13 + 1;
                }
                i35 = i49;
                size2 = i48;
            }
            i35++;
        }
        int childCount3 = nx0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            gx0 d2 = nx0Var.d(i54);
            nx0Var.O.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        nx0Var.D = i17;
        nx0Var.E = max;
        nx0Var.F = copyOf;
        nx0Var.setMeasuredDimension(i17, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        dx0 dx0Var;
        super.requestLayout();
        dx0 dx0Var2 = this.c;
        if (dx0Var2 == null || (dx0Var = this.d) == null) {
            return;
        }
        dx0Var2.l();
        dx0Var.l();
    }

    public void setAlignmentMode(int i7) {
        this.h = i7;
        requestLayout();
    }

    public void setBalancedColumns(boolean z9) {
        if (this.Q == z9) {
            return;
        }
        this.Q = z9;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z9) {
        dx0 dx0Var = this.c;
        dx0Var.u = z9;
        dx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z9) {
        this.G = z9;
    }

    public void setFillWidth(boolean z9) {
        if (this.y == z9) {
            return;
        }
        this.y = z9;
        requestLayout();
    }

    public void setMinimumCellHeight(int i7) {
        this.x = i7;
        requestLayout();
    }

    public void setOrientation(int i7) {
        if (this.e != i7) {
            this.e = i7;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i7) {
        int i10;
        int measuredWidth = getMeasuredWidth();
        this.D = Math.max(measuredWidth, i7);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            gx0 d = d(i11);
            if (measuredWidth <= 0 || (i10 = this.D) == measuredWidth) {
                int i12 = d.n;
                int i13 = d.o + i12;
                d.p = i12;
                d.k = Math.max(0, i13 - i12);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f10 = measuredWidth;
                int round = Math.round((d.n * i10) / f10);
                int round2 = Math.round(((d.n + d.o) * this.D) / f10);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.F;
        if (iArr.length < 2) {
            this.E = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i14 = length - 1;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int[] iArr3 = this.F;
                int i16 = i15 + 1;
                iArr2[i15] = iArr3[i16] - iArr3[i15];
                i15 = i16;
            }
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                gx0 d2 = d(i17);
                fx0 fx0Var = d2.b;
                int b10 = fx0Var != null ? fx0Var.b() : 0;
                if (b10 > 0) {
                    hx0 hx0Var = d2.a.a.b;
                    int max = Math.max(0, hx0Var.a);
                    int min = Math.min(i14, hx0Var.b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d2.k / b10)) - i18;
                        while (max < min && max2 > 0) {
                            int i20 = min - max;
                            int i21 = ((max2 + i20) - 1) / i20;
                            iArr2[max] = iArr2[max] + i21;
                            max2 -= i21;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i22 = 0;
            while (i22 < i14) {
                int i23 = i22 + 1;
                iArr4[i23] = iArr4[i22] + iArr2[i22];
                i22 = i23;
            }
            this.E = iArr4[i14];
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                gx0 d10 = d(i24);
                hx0 hx0Var2 = d10.a.a.b;
                int max3 = Math.max(0, Math.min(i14, hx0Var2.a));
                int max4 = Math.max(max3, Math.min(i14, hx0Var2.b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.q = i25;
                d10.l = Math.max(0, i26 - i25);
                if (d10.c != null) {
                    d10.g();
                }
                this.O.g(d10.b, d10.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i7) {
        this.d.n(i7);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z9) {
        dx0 dx0Var = this.d;
        dx0Var.u = z9;
        dx0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z9) {
        this.I = z9;
    }

    public void setStriped(boolean z9) {
        this.H = z9;
    }

    public void setUseDefaultMargins(boolean z9) {
        this.f = z9;
        requestLayout();
    }
}
