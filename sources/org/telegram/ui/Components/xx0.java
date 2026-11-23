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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xx0 extends View {
    public static final jx0 T = new jx0(0);
    public static final jx0 U = new jx0(1);
    public static final jx0 V = new jx0(3);
    public static final jx0 W = new jx0(4);
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
    public final wx0 P;
    public final ArrayList Q;
    public boolean R;
    public final vx0 S;
    public final org.telegram.ui.Cells.i9 a;
    public int b;
    public final nx0 c;
    public final nx0 d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public xx0(Context context, wx0 wx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.c = new nx0(this, true);
        this.d = new nx0(this, false);
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
        this.a = i9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = wx0Var;
        vx0 vx0Var = new vx0(this, this);
        this.S = vx0Var;
        r0.i0.j(this, vx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(p5.c.v(str, ". "));
    }

    public static void k(sx0 sx0Var, int i7, int i10, int i11, int i12) {
        rx0 rx0Var = new rx0(i7, i10 + i7);
        ux0 ux0Var = sx0Var.a;
        sx0Var.a = new ux0(ux0Var.a, rx0Var, ux0Var.c, ux0Var.d);
        rx0 rx0Var2 = new rx0(i11, i12 + i11);
        ux0 ux0Var2 = sx0Var.b;
        sx0Var.b = new ux0(ux0Var2.a, rx0Var2, ux0Var2.c, ux0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.Q;
        qx0 qx0Var = new qx0(this, arrayList.size());
        sx0 sx0Var = new sx0();
        rx0 rx0Var = new rx0(i10, i12 + i10);
        jx0 jx0Var = W;
        sx0Var.a = new ux0(false, rx0Var, jx0Var, 0.0f);
        sx0Var.b = new ux0(false, new rx0(i7, i11 + i7), jx0Var, 0.0f);
        qx0Var.a = sx0Var;
        qx0Var.j = i10;
        arrayList.add(qx0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.Q;
        qx0 qx0Var = new qx0(this, arrayList.size());
        qx0Var.c = pagetablecell;
        sx0 sx0Var = new sx0();
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        rx0 rx0Var = new rx0(i10, i12 + i10);
        jx0 jx0Var = W;
        sx0Var.a = new ux0(false, rx0Var, jx0Var, 0.0f);
        sx0Var.b = new ux0(false, new rx0(i7, i11 + i7), jx0Var, 1.0f);
        qx0Var.a = sx0Var;
        qx0Var.j = i10;
        arrayList.add(qx0Var);
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
            sx0 sx0Var = d(i15).a;
            ux0 ux0Var = z10 ? sx0Var.a : sx0Var.b;
            rx0 rx0Var = ux0Var.b;
            boolean z11 = ux0Var.a;
            int a10 = rx0Var.a();
            if (a10 <= 0 || a10 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i13 = rx0Var.a;
            }
            ux0 ux0Var2 = z10 ? sx0Var.b : sx0Var.a;
            rx0 rx0Var2 = ux0Var2.b;
            int a11 = rx0Var2.a();
            int i16 = rx0Var2.a;
            if (a11 > 0) {
                th2 = null;
                if (rx0Var2.a() <= 1024) {
                    boolean z12 = ux0Var2.a;
                    int a12 = rx0Var2.a();
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
                        k(sx0Var, i13, a10, i14, a12);
                    } else {
                        k(sx0Var, i14, a12, i13, a10);
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

    public final qx0 d(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.Q;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (qx0) arrayList.get(i7);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        vx0 vx0Var = this.S;
        if (vx0Var == null || !vx0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(qx0 qx0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(qx0Var, z10, z11);
        }
        nx0 nx0Var = z10 ? this.c : this.d;
        if (z11) {
            if (nx0Var.j == null) {
                nx0Var.j = new int[nx0Var.e() + 1];
            }
            if (!nx0Var.k) {
                nx0Var.b(true);
                nx0Var.k = true;
            }
            iArr = nx0Var.j;
        } else {
            if (nx0Var.l == null) {
                nx0Var.l = new int[nx0Var.e() + 1];
            }
            if (!nx0Var.m) {
                nx0Var.b(false);
                nx0Var.m = true;
            }
            iArr = nx0Var.l;
        }
        sx0 sx0Var = qx0Var.a;
        rx0 rx0Var = (z10 ? sx0Var.b : sx0Var.a).b;
        return iArr[z11 ? rx0Var.a : rx0Var.b];
    }

    public final int f(qx0 qx0Var, boolean z10, boolean z11) {
        sx0 sx0Var = qx0Var.a;
        int i7 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) sx0Var).leftMargin : ((ViewGroup.MarginLayoutParams) sx0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) sx0Var).topMargin : ((ViewGroup.MarginLayoutParams) sx0Var).bottomMargin;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (!this.f) {
            return 0;
        }
        ux0 ux0Var = z10 ? sx0Var.b : sx0Var.a;
        nx0 nx0Var = z10 ? this.c : this.d;
        rx0 rx0Var = ux0Var.b;
        if ((z10 && this.J) != z11) {
            int i10 = rx0Var.a;
            return 0;
        }
        int i11 = rx0Var.b;
        nx0Var.e();
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
        nx0 nx0Var = this.c;
        nx0Var.k();
        nx0 nx0Var2 = this.d;
        nx0Var2.k();
        if (nx0Var == null || nx0Var2 == null) {
            return;
        }
        nx0Var.l();
        nx0Var2.l();
    }

    public final void i(qx0 qx0Var, int i7, int i10, boolean z10) {
        qx0Var.d(e(qx0Var, true, false) + e(qx0Var, true, true) + i7, e(qx0Var, false, false) + e(qx0Var, false, true) + i10, z10);
    }

    public final void j(int i7, boolean z10) {
        ix0 b10;
        wx0 wx0Var = this.P;
        int i10 = 0;
        if (!z10 || !this.R || this.e != 0) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                qx0 d = d(i11);
                sx0 sx0Var = d.a;
                if (z10) {
                    int size = View.MeasureSpec.getSize(i7);
                    d.e(wx0Var.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w * 4) : (int) (size / 1.5f)));
                    if (d.b != null) {
                        ((ViewGroup.MarginLayoutParams) sx0Var).height = Math.max(this.x, d.f + this.r + this.s);
                        int b11 = d.b.b();
                        ((ViewGroup.MarginLayoutParams) sx0Var).width = b11 > 0 ? ((ViewGroup.MarginLayoutParams) sx0Var).height * b11 : (this.w * 2) + d.e;
                    } else {
                        ((ViewGroup.MarginLayoutParams) sx0Var).width = 0;
                        ((ViewGroup.MarginLayoutParams) sx0Var).height = 0;
                    }
                    i(d, ((ViewGroup.MarginLayoutParams) sx0Var).width, ((ViewGroup.MarginLayoutParams) sx0Var).height, true);
                } else {
                    boolean z11 = this.e == 0;
                    ux0 ux0Var = z11 ? sx0Var.b : sx0Var.a;
                    if (ux0.a(ux0Var, z11) == W) {
                        rx0 rx0Var = ux0Var.b;
                        int[] g10 = (z11 ? this.c : this.d).g();
                        int e10 = (g10[rx0Var.b] - g10[rx0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                        if (z11) {
                            px0 px0Var = d.b;
                            int b12 = px0Var != null ? px0Var.b() : 0;
                            if (b12 > 0) {
                                int max = Math.max(1, Math.round(e10 / b12));
                                ((ViewGroup.MarginLayoutParams) sx0Var).height = max;
                                d.m = max;
                            }
                            i(d, e10, ((ViewGroup.MarginLayoutParams) sx0Var).height, false);
                        } else {
                            i(d, ((ViewGroup.MarginLayoutParams) sx0Var).width, e10, false);
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
        ix0[] ix0VarArr = new ix0[childCount2];
        int i13 = 0;
        while (i13 < childCount2) {
            qx0 d2 = d(i13);
            sx0 sx0Var2 = d2.a;
            rx0 rx0Var2 = sx0Var2.b.b;
            d2.e(wx0Var.c(d2.c, max2));
            if (d2.b == null) {
                ((ViewGroup.MarginLayoutParams) sx0Var2).width = i10;
                ((ViewGroup.MarginLayoutParams) sx0Var2).height = i10;
                i(d2, i10, i10, true);
            } else {
                ((ViewGroup.MarginLayoutParams) sx0Var2).height = Math.max(this.x, d2.f + this.r + this.s);
                int b13 = d2.b.b();
                if (b13 > 0) {
                    int i14 = rx0Var2.a;
                    int a10 = rx0Var2.a();
                    int i15 = ((ViewGroup.MarginLayoutParams) sx0Var2).height * b13;
                    b10 = new ix0();
                    b10.a = i14;
                    b10.b = Math.max(1, a10);
                    b10.g = true;
                    int max3 = Math.max(0, i15);
                    b10.e = max3;
                    b10.d = max3;
                } else {
                    Layout a11 = d2.b.a();
                    b10 = c8.va.b(a11 != null ? a11.getText() : null, a11 != null ? a11.getPaint() : null, rx0Var2.a, rx0Var2.a(), i12, max2, d2.e);
                }
                ix0VarArr[i13] = b10;
                arrayList.add(b10);
            }
            i13++;
            i10 = 0;
        }
        int[] a12 = c8.va.a(this.b, size2, 0, arrayList);
        for (int i16 = 0; i16 < childCount2; i16++) {
            qx0 d10 = d(i16);
            ix0 ix0Var = ix0VarArr[i16];
            if (ix0Var != null) {
                sx0 sx0Var3 = d10.a;
                if (d10.b.b() > 0) {
                    ((ViewGroup.MarginLayoutParams) sx0Var3).width = ix0Var.e;
                } else {
                    rx0 rx0Var3 = sx0Var3.b.b;
                    int i17 = 0;
                    for (int max4 = Math.max(0, rx0Var3.a); max4 < Math.min(this.b, rx0Var3.b); max4++) {
                        i17 += a12[max4];
                    }
                    int max5 = Math.max(1, i17 - i12);
                    if (d10.e > max5) {
                        d10.e(wx0Var.c(d10.c, max5));
                        ((ViewGroup.MarginLayoutParams) sx0Var3).height = Math.max(this.x, d10.f + this.r + this.s);
                    }
                    ((ViewGroup.MarginLayoutParams) sx0Var3).width = d10.e + i12;
                }
                i(d10, ((ViewGroup.MarginLayoutParams) sx0Var3).width, ((ViewGroup.MarginLayoutParams) sx0Var3).height, true);
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
        xx0 xx0Var = this;
        xx0Var.c();
        nx0 nx0Var = xx0Var.d;
        nx0 nx0Var2 = xx0Var.c;
        if (nx0Var2 != null && nx0Var != null) {
            nx0Var2.l();
            nx0Var.l();
        }
        xx0Var.b = 0;
        int childCount = xx0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            xx0Var.b = Math.max(xx0Var.b, xx0Var.d(i15).a.b.b.b);
        }
        xx0Var.j(i7, true);
        if (xx0Var.e == 0) {
            i11 = nx0Var2.i(i7);
            if (xx0Var.y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                nx0Var2.v.a = i11;
                nx0Var2.w.a = -i11;
                nx0Var2.q = false;
                nx0Var2.g();
            }
            xx0Var.j(i7, false);
            i12 = nx0Var.i(i10);
        } else {
            int i16 = nx0Var.i(i10);
            xx0Var.j(i7, false);
            i11 = nx0Var2.i(i7);
            i12 = i16;
        }
        int max = Math.max(i12, xx0Var.getSuggestedMinimumHeight());
        xx0Var.setMeasuredDimension(i11, max);
        nx0Var2.v.a = i11;
        nx0Var2.w.a = -i11;
        nx0Var2.q = false;
        nx0Var2.g();
        nx0Var.v.a = max;
        nx0Var.w.a = -max;
        nx0Var.q = false;
        nx0Var.g();
        int[] g10 = nx0Var2.g();
        int[] g11 = nx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = xx0Var.K;
        arrayList.clear();
        int i17 = g10[g10.length - 1];
        int childCount2 = xx0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            qx0 d = xx0Var.d(i19);
            sx0 sx0Var = d.a;
            ux0 ux0Var = sx0Var.b;
            ux0 ux0Var2 = sx0Var.a;
            rx0 rx0Var = ux0Var.b;
            rx0 rx0Var2 = ux0Var2.b;
            int i20 = childCount2;
            int i21 = g10[rx0Var.a];
            int i22 = g11[rx0Var2.a];
            int i23 = g10[rx0Var.b];
            int i24 = g11[rx0Var2.b];
            int i25 = i23 - i21;
            int i26 = i24 - i22;
            int i27 = d.k;
            nx0 nx0Var3 = nx0Var;
            int i28 = d.l;
            jx0 a10 = ux0.a(ux0Var, true);
            jx0 a11 = ux0.a(ux0Var2, false);
            h6.m f10 = nx0Var2.f();
            ox0 ox0Var = (ox0) ((Object[]) f10.d)[((int[]) f10.b)[i19]];
            h6.m f11 = nx0Var3.f();
            nx0 nx0Var4 = nx0Var2;
            ox0 ox0Var2 = (ox0) ((Object[]) f11.d)[((int[]) f11.b)[i19]];
            int b10 = a10.b(d, i25 - ox0Var.d(true));
            int b11 = a11.b(d, i26 - ox0Var2.d(true));
            int e10 = xx0Var.e(d, true, true);
            int e11 = xx0Var.e(d, false, true);
            int e12 = xx0Var.e(d, true, false);
            int i29 = e10 + e12;
            int e13 = e11 + xx0Var.e(d, false, false);
            int a12 = ox0Var.a(xx0Var, d, a10, i27 + i29, true);
            xx0Var = this;
            int a13 = ox0Var2.a(xx0Var, d, a11, i28 + e13, false);
            int c10 = a10.c(i27, i25 - i29);
            int c11 = a11.c(i28, i26 - e13);
            int i30 = i21 + b10 + a12;
            int i31 = !xx0Var.J ? e10 + i30 : ((i17 - c10) - e12) - i30;
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
                    rx0 rx0Var3 = d.a.a.b;
                    if (rx0Var3.b - rx0Var3.a <= 1) {
                        ArrayList arrayList2 = xx0Var.L;
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
            nx0Var = nx0Var3;
            childCount2 = i20;
            nx0Var2 = nx0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            qx0 qx0Var = (qx0) arrayList.get(i35);
            int i36 = qx0Var.l;
            int i37 = qx0Var.d;
            int i38 = i36 - qx0Var.m;
            ArrayList arrayList3 = xx0Var.Q;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                qx0 qx0Var2 = (qx0) arrayList3.get(i39);
                if (qx0Var.a.a.b.a != qx0Var2.a.a.b.a) {
                    break;
                }
                int i40 = qx0Var.m;
                int i41 = qx0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = qx0Var2.l - i41;
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
                    qx0 qx0Var3 = (qx0) arrayList3.get(i43);
                    if (qx0Var.a.a.b.a != qx0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = qx0Var.m;
                    int i45 = qx0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = qx0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                qx0Var.l = qx0Var.m;
                qx0Var.g();
                max -= i38;
                int i47 = qx0Var.a.a.b.a;
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
                    qx0 qx0Var4 = (qx0) arrayList3.get(i50);
                    if (qx0Var == qx0Var4) {
                        i13 = i50;
                    } else {
                        int i51 = qx0Var.a.a.b.a;
                        int i52 = qx0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (qx0Var4.m != qx0Var4.l) {
                                arrayList.remove(qx0Var4);
                                if (qx0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = qx0Var4.l - i38;
                            qx0Var4.l = i53;
                            i13 = i50;
                            qx0Var4.d(qx0Var4.k, i53, true);
                        } else {
                            i13 = i50;
                            if (i51 < i52) {
                                qx0Var4.q -= i38;
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
        int childCount3 = xx0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            qx0 d2 = xx0Var.d(i54);
            xx0Var.P.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        xx0Var.E = i17;
        xx0Var.F = max;
        xx0Var.G = copyOf;
        xx0Var.setMeasuredDimension(i17, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        nx0 nx0Var;
        super.requestLayout();
        nx0 nx0Var2 = this.c;
        if (nx0Var2 == null || (nx0Var = this.d) == null) {
            return;
        }
        nx0Var2.l();
        nx0Var.l();
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
        nx0 nx0Var = this.c;
        nx0Var.u = z10;
        nx0Var.k();
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
            qx0 d = d(i11);
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
                qx0 d2 = d(i17);
                px0 px0Var = d2.b;
                int b10 = px0Var != null ? px0Var.b() : 0;
                if (b10 > 0) {
                    rx0 rx0Var = d2.a.a.b;
                    int max = Math.max(0, rx0Var.a);
                    int min = Math.min(i14, rx0Var.b);
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
                qx0 d10 = d(i24);
                rx0 rx0Var2 = d10.a.a.b;
                int max3 = Math.max(0, Math.min(i14, rx0Var2.a));
                int max4 = Math.max(max3, Math.min(i14, rx0Var2.b));
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
        nx0 nx0Var = this.d;
        nx0Var.u = z10;
        nx0Var.k();
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
