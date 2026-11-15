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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class px0 extends View {
    public static final bx0 T = new bx0(0);
    public static final bx0 U = new bx0(1);
    public static final bx0 V = new bx0(3);
    public static final bx0 W = new bx0(4);
    public int E;
    public int F;
    public int[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final Path M;
    public final RectF N;
    public final float[] O;
    public final ox0 P;
    public final ArrayList Q;
    public boolean R;
    public final nx0 S;
    public final org.telegram.ui.Cells.h9 a;
    public int b;
    public final fx0 c;
    public final fx0 d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public px0(Context context, ox0 ox0Var, org.telegram.ui.Cells.h9 h9Var) {
        super(context);
        this.c = new fx0(this, true);
        this.d = new fx0(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = org.telegram.messenger.g0.L(8.0f);
        this.s = org.telegram.messenger.g0.L(9.0f);
        this.w = org.telegram.messenger.g0.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        new Path();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = h9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = ox0Var;
        nx0 nx0Var = new nx0(this, this);
        this.S = nx0Var;
        r0.i0.j(this, nx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r.b.v(str, ". "));
    }

    public static void k(kx0 kx0Var, int i7, int i10, int i11, int i12) {
        jx0 jx0Var = new jx0(i7, i10 + i7);
        mx0 mx0Var = kx0Var.a;
        kx0Var.a = new mx0(mx0Var.a, jx0Var, mx0Var.c, mx0Var.d);
        jx0 jx0Var2 = new jx0(i11, i12 + i11);
        mx0 mx0Var2 = kx0Var.b;
        kx0Var.b = new mx0(mx0Var2.a, jx0Var2, mx0Var2.c, mx0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        ix0 ix0Var = new ix0(this, arrayList.size());
        kx0 kx0Var = new kx0();
        jx0 jx0Var = new jx0(i10, i12 + i10);
        bx0 bx0Var = W;
        kx0Var.a = new mx0(false, jx0Var, bx0Var, 0.0f);
        kx0Var.b = new mx0(false, new jx0(i7, i11 + i7), bx0Var, 0.0f);
        ix0Var.a = kx0Var;
        ix0Var.j = i10;
        arrayList.add(ix0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        ix0 ix0Var = new ix0(this, arrayList.size());
        ix0Var.c = pagetablecell;
        kx0 kx0Var = new kx0();
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        jx0 jx0Var = new jx0(i10, i12 + i10);
        bx0 bx0Var = W;
        kx0Var.a = new mx0(false, jx0Var, bx0Var, 0.0f);
        kx0Var.b = new mx0(false, new jx0(i7, i11 + i7), bx0Var, 1.0f);
        ix0Var.a = kx0Var;
        ix0Var.j = i10;
        arrayList.add(ix0Var);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i10, i10 + r10));
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
        boolean z10 = this.e == 0;
        int i12 = (z10 ? this.c : this.d).b;
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
            kx0 kx0Var = d(i15).a;
            mx0 mx0Var = z10 ? kx0Var.a : kx0Var.b;
            jx0 jx0Var = mx0Var.b;
            boolean z11 = mx0Var.a;
            int a10 = jx0Var.a();
            if (a10 <= 0 || a10 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i13 = jx0Var.a;
            }
            mx0 mx0Var2 = z10 ? kx0Var.b : kx0Var.a;
            jx0 jx0Var2 = mx0Var2.b;
            int a11 = jx0Var2.a();
            int i16 = jx0Var2.a;
            if (a11 > 0) {
                th2 = null;
                if (jx0Var2.a() <= 1024) {
                    boolean z12 = mx0Var2.a;
                    int a12 = jx0Var2.a();
                    if (i12 != 0) {
                        a12 = Math.min(a12, i12 - (z12 ? Math.min(i16, i12) : 0));
                    }
                    if (z12) {
                        i14 = i16;
                    }
                    if (i12 != 0) {
                        if (!z11 || !z12) {
                            while (true) {
                                int i17 = i14 + a12;
                                if (i17 <= i12) {
                                    for (int i18 = i14; i18 < i17; i18++) {
                                        if (iArr[i18] <= i13) {
                                        }
                                    }
                                    break;
                                }
                                if (z12) {
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
                    if (z10) {
                        k(kx0Var, i13, a10, i14, a12);
                    } else {
                        k(kx0Var, i14, a12, i13, a10);
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

    public final ix0 d(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.Q;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (ix0) arrayList.get(i7);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        nx0 nx0Var = this.S;
        if (nx0Var == null || !nx0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(ix0 ix0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(ix0Var, z10, z11);
        }
        fx0 fx0Var = z10 ? this.c : this.d;
        if (z11) {
            if (fx0Var.j == null) {
                fx0Var.j = new int[fx0Var.e() + 1];
            }
            if (!fx0Var.k) {
                fx0Var.b(true);
                fx0Var.k = true;
            }
            iArr = fx0Var.j;
        } else {
            if (fx0Var.l == null) {
                fx0Var.l = new int[fx0Var.e() + 1];
            }
            if (!fx0Var.m) {
                fx0Var.b(false);
                fx0Var.m = true;
            }
            iArr = fx0Var.l;
        }
        kx0 kx0Var = ix0Var.a;
        jx0 jx0Var = (z10 ? kx0Var.b : kx0Var.a).b;
        return iArr[z11 ? jx0Var.a : jx0Var.b];
    }

    public final int f(ix0 ix0Var, boolean z10, boolean z11) {
        kx0 kx0Var = ix0Var.a;
        int i7 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) kx0Var).leftMargin : ((ViewGroup.MarginLayoutParams) kx0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) kx0Var).topMargin : ((ViewGroup.MarginLayoutParams) kx0Var).bottomMargin;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (!this.f) {
            return 0;
        }
        mx0 mx0Var = z10 ? kx0Var.b : kx0Var.a;
        fx0 fx0Var = z10 ? this.c : this.d;
        jx0 jx0Var = mx0Var.b;
        if ((z10 && this.J) != z11) {
            int i10 = jx0Var.a;
            return 0;
        }
        int i11 = jx0Var.b;
        fx0Var.e();
        return 0;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.Q.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h() {
        this.n = 0;
        fx0 fx0Var = this.c;
        fx0Var.k();
        fx0 fx0Var2 = this.d;
        fx0Var2.k();
        if (fx0Var == null || fx0Var2 == null) {
            return;
        }
        fx0Var.l();
        fx0Var2.l();
    }

    public final void i(ix0 ix0Var, int i7, int i10, boolean z10) {
        ix0Var.d(e(ix0Var, true, false) + e(ix0Var, true, true) + i7, e(ix0Var, false, false) + e(ix0Var, false, true) + i10, z10);
    }

    public final void j(int i7, boolean z10) {
        ax0 b10;
        ox0 ox0Var = this.P;
        int i10 = 0;
        if (!z10 || !this.R || this.e != 0) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ix0 d = d(i11);
                kx0 kx0Var = d.a;
                if (z10) {
                    int size = View.MeasureSpec.getSize(i7);
                    d.e(ox0Var.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w * 4) : (int) (size / 1.5f)));
                    if (d.b != null) {
                        ((ViewGroup.MarginLayoutParams) kx0Var).height = Math.max(this.x, d.f + this.r + this.s);
                        int b11 = d.b.b();
                        ((ViewGroup.MarginLayoutParams) kx0Var).width = b11 > 0 ? ((ViewGroup.MarginLayoutParams) kx0Var).height * b11 : (this.w * 2) + d.e;
                    } else {
                        ((ViewGroup.MarginLayoutParams) kx0Var).width = 0;
                        ((ViewGroup.MarginLayoutParams) kx0Var).height = 0;
                    }
                    i(d, ((ViewGroup.MarginLayoutParams) kx0Var).width, ((ViewGroup.MarginLayoutParams) kx0Var).height, true);
                } else {
                    boolean z11 = this.e == 0;
                    mx0 mx0Var = z11 ? kx0Var.b : kx0Var.a;
                    if (mx0.a(mx0Var, z11) == W) {
                        jx0 jx0Var = mx0Var.b;
                        int[] g10 = (z11 ? this.c : this.d).g();
                        int e10 = (g10[jx0Var.b] - g10[jx0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                        if (z11) {
                            hx0 hx0Var = d.b;
                            int b12 = hx0Var != null ? hx0Var.b() : 0;
                            if (b12 > 0) {
                                int max = Math.max(1, Math.round(e10 / b12));
                                ((ViewGroup.MarginLayoutParams) kx0Var).height = max;
                                d.m = max;
                            }
                            i(d, e10, ((ViewGroup.MarginLayoutParams) kx0Var).height, false);
                        } else {
                            i(d, ((ViewGroup.MarginLayoutParams) kx0Var).width, e10, false);
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
        ax0[] ax0VarArr = new ax0[childCount2];
        int i13 = 0;
        while (i13 < childCount2) {
            ix0 d2 = d(i13);
            kx0 kx0Var2 = d2.a;
            jx0 jx0Var2 = kx0Var2.b.b;
            d2.e(ox0Var.c(d2.c, max2));
            if (d2.b == null) {
                ((ViewGroup.MarginLayoutParams) kx0Var2).width = i10;
                ((ViewGroup.MarginLayoutParams) kx0Var2).height = i10;
                i(d2, i10, i10, true);
            } else {
                ((ViewGroup.MarginLayoutParams) kx0Var2).height = Math.max(this.x, d2.f + this.r + this.s);
                int b13 = d2.b.b();
                if (b13 > 0) {
                    int i14 = jx0Var2.a;
                    int a10 = jx0Var2.a();
                    int i15 = ((ViewGroup.MarginLayoutParams) kx0Var2).height * b13;
                    b10 = new ax0();
                    b10.a = i14;
                    b10.b = Math.max(1, a10);
                    b10.g = true;
                    int max3 = Math.max(0, i15);
                    b10.e = max3;
                    b10.d = max3;
                } else {
                    Layout a11 = d2.b.a();
                    b10 = c8.ra.b(a11 != null ? a11.getText() : null, a11 != null ? a11.getPaint() : null, jx0Var2.a, jx0Var2.a(), i12, max2, d2.e);
                }
                ax0VarArr[i13] = b10;
                arrayList.add(b10);
            }
            i13++;
            i10 = 0;
        }
        int[] a12 = c8.ra.a(this.b, size2, 0, arrayList);
        for (int i16 = 0; i16 < childCount2; i16++) {
            ix0 d10 = d(i16);
            ax0 ax0Var = ax0VarArr[i16];
            if (ax0Var != null) {
                kx0 kx0Var3 = d10.a;
                if (d10.b.b() > 0) {
                    ((ViewGroup.MarginLayoutParams) kx0Var3).width = ax0Var.e;
                } else {
                    jx0 jx0Var3 = kx0Var3.b.b;
                    int i17 = 0;
                    for (int max4 = Math.max(0, jx0Var3.a); max4 < Math.min(this.b, jx0Var3.b); max4++) {
                        i17 += a12[max4];
                    }
                    int max5 = Math.max(1, i17 - i12);
                    if (d10.e > max5) {
                        d10.e(ox0Var.c(d10.c, max5));
                        ((ViewGroup.MarginLayoutParams) kx0Var3).height = Math.max(this.x, d10.f + this.r + this.s);
                    }
                    ((ViewGroup.MarginLayoutParams) kx0Var3).width = d10.e + i12;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) kx0Var3).width, ((ViewGroup.MarginLayoutParams) kx0Var3).height, true);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        px0 px0Var = this;
        px0Var.c();
        fx0 fx0Var = px0Var.d;
        fx0 fx0Var2 = px0Var.c;
        if (fx0Var2 != null && fx0Var != null) {
            fx0Var2.l();
            fx0Var.l();
        }
        px0Var.b = 0;
        int childCount = px0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            px0Var.b = Math.max(px0Var.b, px0Var.d(i15).a.b.b.b);
        }
        px0Var.j(i7, true);
        if (px0Var.e == 0) {
            i11 = fx0Var2.i(i7);
            if (px0Var.y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                fx0Var2.v.a = i11;
                fx0Var2.w.a = -i11;
                fx0Var2.q = false;
                fx0Var2.g();
            }
            px0Var.j(i7, false);
            i12 = fx0Var.i(i10);
        } else {
            int i16 = fx0Var.i(i10);
            px0Var.j(i7, false);
            i11 = fx0Var2.i(i7);
            i12 = i16;
        }
        int max = Math.max(i12, px0Var.getSuggestedMinimumHeight());
        px0Var.setMeasuredDimension(i11, max);
        fx0Var2.v.a = i11;
        fx0Var2.w.a = -i11;
        fx0Var2.q = false;
        fx0Var2.g();
        fx0Var.v.a = max;
        fx0Var.w.a = -max;
        fx0Var.q = false;
        fx0Var.g();
        int[] g10 = fx0Var2.g();
        int[] g11 = fx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = px0Var.K;
        arrayList.clear();
        int i17 = g10[g10.length - 1];
        int childCount2 = px0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            ix0 d = px0Var.d(i19);
            kx0 kx0Var = d.a;
            mx0 mx0Var = kx0Var.b;
            mx0 mx0Var2 = kx0Var.a;
            jx0 jx0Var = mx0Var.b;
            jx0 jx0Var2 = mx0Var2.b;
            int i20 = childCount2;
            int i21 = g10[jx0Var.a];
            int i22 = g11[jx0Var2.a];
            int i23 = g10[jx0Var.b];
            int i24 = g11[jx0Var2.b];
            int i25 = i23 - i21;
            int i26 = i24 - i22;
            int i27 = d.k;
            fx0 fx0Var3 = fx0Var;
            int i28 = d.l;
            bx0 a10 = mx0.a(mx0Var, true);
            bx0 a11 = mx0.a(mx0Var2, false);
            h6.m f10 = fx0Var2.f();
            gx0 gx0Var = (gx0) ((Object[]) f10.d)[((int[]) f10.b)[i19]];
            h6.m f11 = fx0Var3.f();
            fx0 fx0Var4 = fx0Var2;
            gx0 gx0Var2 = (gx0) ((Object[]) f11.d)[((int[]) f11.b)[i19]];
            int b10 = a10.b(d, i25 - gx0Var.d(true));
            int b11 = a11.b(d, i26 - gx0Var2.d(true));
            int e10 = px0Var.e(d, true, true);
            int e11 = px0Var.e(d, false, true);
            int e12 = px0Var.e(d, true, false);
            int i29 = e10 + e12;
            int e13 = e11 + px0Var.e(d, false, false);
            int a12 = gx0Var.a(px0Var, d, a10, i27 + i29, true);
            px0Var = this;
            int a13 = gx0Var2.a(px0Var, d, a11, i28 + e13, false);
            int c10 = a10.c(i27, i25 - i29);
            int c11 = a11.c(i28, i26 - e13);
            int i30 = i21 + b10 + a12;
            int i31 = !px0Var.J ? e10 + i30 : ((i17 - c10) - e12) - i30;
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
                    jx0 jx0Var3 = d.a.a.b;
                    if (jx0Var3.b - jx0Var3.a <= 1) {
                        ArrayList arrayList2 = px0Var.L;
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
            fx0Var = fx0Var3;
            childCount2 = i20;
            fx0Var2 = fx0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            ix0 ix0Var = (ix0) arrayList.get(i35);
            int i36 = ix0Var.l;
            int i37 = ix0Var.d;
            int i38 = i36 - ix0Var.m;
            ArrayList arrayList3 = px0Var.Q;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                ix0 ix0Var2 = (ix0) arrayList3.get(i39);
                if (ix0Var.a.a.b.a != ix0Var2.a.a.b.a) {
                    break;
                }
                int i40 = ix0Var.m;
                int i41 = ix0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = ix0Var2.l - i41;
                if (i42 > 0) {
                    i38 = Math.min(i38, i42);
                }
            }
            z10 = false;
            if (!z10) {
                int i43 = i37 - 1;
                while (true) {
                    if (i43 < 0) {
                        break;
                    }
                    ix0 ix0Var3 = (ix0) arrayList3.get(i43);
                    if (ix0Var.a.a.b.a != ix0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = ix0Var.m;
                    int i45 = ix0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = ix0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                ix0Var.l = ix0Var.m;
                ix0Var.g();
                max -= i38;
                int i47 = ix0Var.a.a.b.a;
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
                    ix0 ix0Var4 = (ix0) arrayList3.get(i50);
                    if (ix0Var == ix0Var4) {
                        i13 = i50;
                    } else {
                        int i51 = ix0Var.a.a.b.a;
                        int i52 = ix0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (ix0Var4.m != ix0Var4.l) {
                                arrayList.remove(ix0Var4);
                                if (ix0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = ix0Var4.l - i38;
                            ix0Var4.l = i53;
                            i13 = i50;
                            ix0Var4.d(ix0Var4.k, i53, true);
                        } else {
                            i13 = i50;
                            if (i51 < i52) {
                                ix0Var4.q -= i38;
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
        int childCount3 = px0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            ix0 d2 = px0Var.d(i54);
            px0Var.P.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        px0Var.E = i17;
        px0Var.F = max;
        px0Var.G = copyOf;
        px0Var.setMeasuredDimension(i17, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        fx0 fx0Var;
        super.requestLayout();
        fx0 fx0Var2 = this.c;
        if (fx0Var2 == null || (fx0Var = this.d) == null) {
            return;
        }
        fx0Var2.l();
        fx0Var.l();
    }

    public void setAlignmentMode(int i7) {
        this.h = i7;
        requestLayout();
    }

    public void setBalancedColumns(boolean z10) {
        if (this.R == z10) {
            return;
        }
        this.R = z10;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        fx0 fx0Var = this.c;
        fx0Var.u = z10;
        fx0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.H = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
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
        this.E = Math.max(measuredWidth, i7);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ix0 d = d(i11);
            if (measuredWidth <= 0 || (i10 = this.E) == measuredWidth) {
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
                int round2 = Math.round(((d.n + d.o) * this.E) / f10);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.G;
        if (iArr.length < 2) {
            this.F = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i14 = length - 1;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int[] iArr3 = this.G;
                int i16 = i15 + 1;
                iArr2[i15] = iArr3[i16] - iArr3[i15];
                i15 = i16;
            }
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                ix0 d2 = d(i17);
                hx0 hx0Var = d2.b;
                int b10 = hx0Var != null ? hx0Var.b() : 0;
                if (b10 > 0) {
                    jx0 jx0Var = d2.a.a.b;
                    int max = Math.max(0, jx0Var.a);
                    int min = Math.min(i14, jx0Var.b);
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
            this.F = iArr4[i14];
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                ix0 d10 = d(i24);
                jx0 jx0Var2 = d10.a.a.b;
                int max3 = Math.max(0, Math.min(i14, jx0Var2.a));
                int max4 = Math.max(max3, Math.min(i14, jx0Var2.b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.q = i25;
                d10.l = Math.max(0, i26 - i25);
                if (d10.c != null) {
                    d10.g();
                }
                this.P.g(d10.b, d10.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i7) {
        this.d.n(i7);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        fx0 fx0Var = this.d;
        fx0Var.u = z10;
        fx0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.J = z10;
    }

    public void setStriped(boolean z10) {
        this.I = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f = z10;
        requestLayout();
    }
}
