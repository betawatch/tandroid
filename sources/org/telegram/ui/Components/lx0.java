package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class lx0 extends View {
    public static final xw0 R = new xw0(0);
    public static final xw0 S = new xw0(1);
    public static final xw0 T = new xw0(3);
    public static final xw0 U = new xw0(4);
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
    public final kx0 O;
    public final ArrayList P;
    public final jx0 Q;
    public final org.telegram.ui.Cells.i9 a;
    public int b;
    public final bx0 c;
    public final bx0 d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public lx0(Context context, kx0 kx0Var, org.telegram.ui.Cells.i9 i9Var) {
        super(context);
        this.c = new bx0(this, true);
        this.d = new bx0(this, false);
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
        this.O = kx0Var;
        jx0 jx0Var = new jx0(this, this);
        this.Q = jx0Var;
        r0.i0.j(this, jx0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(rf.b.q(str, ". "));
    }

    public static void j(gx0 gx0Var, int i7, int i10, int i11, int i12) {
        fx0 fx0Var = new fx0(i7, i10 + i7);
        ix0 ix0Var = gx0Var.a;
        gx0Var.a = new ix0(ix0Var.a, fx0Var, ix0Var.c, ix0Var.d);
        fx0 fx0Var2 = new fx0(i11, i12 + i11);
        ix0 ix0Var2 = gx0Var.b;
        gx0Var.b = new ix0(ix0Var2.a, fx0Var2, ix0Var2.c, ix0Var2.d);
    }

    public final void a(int i7, int i10, int i11, int i12) {
        ArrayList arrayList = this.P;
        ex0 ex0Var = new ex0(this, arrayList.size());
        gx0 gx0Var = new gx0();
        fx0 fx0Var = new fx0(i10, i12 + i10);
        xw0 xw0Var = U;
        gx0Var.a = new ix0(false, fx0Var, xw0Var, 0.0f);
        gx0Var.b = new ix0(false, new fx0(i7, i11 + i7), xw0Var, 0.0f);
        ex0Var.a = gx0Var;
        ex0Var.j = i10;
        arrayList.add(ex0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i7, int i10, int i11) {
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.P;
        ex0 ex0Var = new ex0(this, arrayList.size());
        ex0Var.c = pagetablecell;
        gx0 gx0Var = new gx0();
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        fx0 fx0Var = new fx0(i10, i12 + i10);
        xw0 xw0Var = U;
        gx0Var.a = new ix0(false, fx0Var, xw0Var, 0.0f);
        gx0Var.b = new ix0(false, new fx0(i7, i11 + i7), xw0Var, 1.0f);
        ex0Var.a = gx0Var;
        ex0Var.j = i10;
        arrayList.add(ex0Var);
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
            gx0 gx0Var = d(i15).a;
            ix0 ix0Var = z9 ? gx0Var.a : gx0Var.b;
            fx0 fx0Var = ix0Var.b;
            boolean z10 = ix0Var.a;
            int a10 = fx0Var.a();
            if (a10 <= 0 || a10 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z10) {
                i13 = fx0Var.a;
            }
            ix0 ix0Var2 = z9 ? gx0Var.b : gx0Var.a;
            fx0 fx0Var2 = ix0Var2.b;
            int a11 = fx0Var2.a();
            int i16 = fx0Var2.a;
            if (a11 > 0) {
                th2 = null;
                if (fx0Var2.a() <= 1024) {
                    boolean z11 = ix0Var2.a;
                    int a12 = fx0Var2.a();
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
                        j(gx0Var, i13, a10, i14, a12);
                    } else {
                        j(gx0Var, i14, a12, i13, a10);
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

    public final ex0 d(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (ex0) arrayList.get(i7);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        jx0 jx0Var = this.Q;
        if (jx0Var == null || !jx0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(ex0 ex0Var, boolean z9, boolean z10) {
        int[] iArr;
        if (this.h == 1) {
            return f(ex0Var, z9, z10);
        }
        bx0 bx0Var = z9 ? this.c : this.d;
        if (z10) {
            if (bx0Var.j == null) {
                bx0Var.j = new int[bx0Var.e() + 1];
            }
            if (!bx0Var.k) {
                bx0Var.b(true);
                bx0Var.k = true;
            }
            iArr = bx0Var.j;
        } else {
            if (bx0Var.l == null) {
                bx0Var.l = new int[bx0Var.e() + 1];
            }
            if (!bx0Var.m) {
                bx0Var.b(false);
                bx0Var.m = true;
            }
            iArr = bx0Var.l;
        }
        gx0 gx0Var = ex0Var.a;
        fx0 fx0Var = (z9 ? gx0Var.b : gx0Var.a).b;
        return iArr[z10 ? fx0Var.a : fx0Var.b];
    }

    public final int f(ex0 ex0Var, boolean z9, boolean z10) {
        gx0 gx0Var = ex0Var.a;
        int i7 = z9 ? z10 ? ((ViewGroup.MarginLayoutParams) gx0Var).leftMargin : ((ViewGroup.MarginLayoutParams) gx0Var).rightMargin : z10 ? ((ViewGroup.MarginLayoutParams) gx0Var).topMargin : ((ViewGroup.MarginLayoutParams) gx0Var).bottomMargin;
        if (i7 != Integer.MIN_VALUE) {
            return i7;
        }
        if (!this.f) {
            return 0;
        }
        ix0 ix0Var = z9 ? gx0Var.b : gx0Var.a;
        bx0 bx0Var = z9 ? this.c : this.d;
        fx0 fx0Var = ix0Var.b;
        if ((z9 && this.I) != z10) {
            int i10 = fx0Var.a;
            return 0;
        }
        int i11 = fx0Var.b;
        bx0Var.e();
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
        bx0 bx0Var = this.c;
        bx0Var.k();
        bx0 bx0Var2 = this.d;
        bx0Var2.k();
        if (bx0Var == null || bx0Var2 == null) {
            return;
        }
        bx0Var.l();
        bx0Var2.l();
    }

    public final void i(int i7, boolean z9) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ex0 d = d(i10);
            gx0 gx0Var = d.a;
            if (z9) {
                int size = View.MeasureSpec.getSize(i7);
                d.e(this.O.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) gx0Var).height = Math.max(this.x, d.f + this.r + this.s);
                    int b10 = d.b.b();
                    ((ViewGroup.MarginLayoutParams) gx0Var).width = b10 > 0 ? ((ViewGroup.MarginLayoutParams) gx0Var).height * b10 : (this.w * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) gx0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) gx0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) gx0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) gx0Var).height, true);
            } else {
                boolean z10 = this.e == 0;
                ix0 ix0Var = z10 ? gx0Var.b : gx0Var.a;
                if (ix0.a(ix0Var, z10) == U) {
                    fx0 fx0Var = ix0Var.b;
                    int[] g10 = (z10 ? this.c : this.d).g();
                    int e10 = (g10[fx0Var.b] - g10[fx0Var.a]) - (e(d, z10, false) + e(d, z10, true));
                    if (z10) {
                        dx0 dx0Var = d.b;
                        int b11 = dx0Var != null ? dx0Var.b() : 0;
                        if (b11 > 0) {
                            int max = Math.max(1, Math.round(e10 / b11));
                            ((ViewGroup.MarginLayoutParams) gx0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e10, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) gx0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) gx0Var).width, e(d, false, false) + e(d, false, true) + e10, false);
                    }
                }
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
        lx0 lx0Var = this;
        lx0Var.c();
        bx0 bx0Var = lx0Var.d;
        bx0 bx0Var2 = lx0Var.c;
        if (bx0Var2 != null && bx0Var != null) {
            bx0Var2.l();
            bx0Var.l();
        }
        lx0Var.b = 0;
        int childCount = lx0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            lx0Var.b = Math.max(lx0Var.b, lx0Var.d(i15).a.b.b.b);
        }
        lx0Var.i(i7, true);
        if (lx0Var.e == 0) {
            i11 = bx0Var2.i(i7);
            if (lx0Var.y) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i7));
                bx0Var2.v.a = i11;
                bx0Var2.w.a = -i11;
                bx0Var2.q = false;
                bx0Var2.g();
            }
            lx0Var.i(i7, false);
            i12 = bx0Var.i(i10);
        } else {
            int i16 = bx0Var.i(i10);
            lx0Var.i(i7, false);
            i11 = bx0Var2.i(i7);
            i12 = i16;
        }
        int max = Math.max(i12, lx0Var.getSuggestedMinimumHeight());
        lx0Var.setMeasuredDimension(i11, max);
        bx0Var2.v.a = i11;
        bx0Var2.w.a = -i11;
        bx0Var2.q = false;
        bx0Var2.g();
        bx0Var.v.a = max;
        bx0Var.w.a = -max;
        bx0Var.q = false;
        bx0Var.g();
        int[] g10 = bx0Var2.g();
        int[] g11 = bx0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = lx0Var.J;
        arrayList.clear();
        int i17 = g10[g10.length - 1];
        int childCount2 = lx0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            ex0 d = lx0Var.d(i19);
            gx0 gx0Var = d.a;
            ix0 ix0Var = gx0Var.b;
            ix0 ix0Var2 = gx0Var.a;
            fx0 fx0Var = ix0Var.b;
            fx0 fx0Var2 = ix0Var2.b;
            int i20 = childCount2;
            int i21 = g10[fx0Var.a];
            int i22 = g11[fx0Var2.a];
            int i23 = g10[fx0Var.b];
            int i24 = g11[fx0Var2.b];
            int i25 = i23 - i21;
            int i26 = i24 - i22;
            int i27 = d.k;
            bx0 bx0Var3 = bx0Var;
            int i28 = d.l;
            xw0 a10 = ix0.a(ix0Var, true);
            xw0 a11 = ix0.a(ix0Var2, false);
            h6.m f10 = bx0Var2.f();
            cx0 cx0Var = (cx0) ((Object[]) f10.d)[((int[]) f10.b)[i19]];
            h6.m f11 = bx0Var3.f();
            bx0 bx0Var4 = bx0Var2;
            cx0 cx0Var2 = (cx0) ((Object[]) f11.d)[((int[]) f11.b)[i19]];
            int b10 = a10.b(d, i25 - cx0Var.d(true));
            int b11 = a11.b(d, i26 - cx0Var2.d(true));
            int e10 = lx0Var.e(d, true, true);
            int e11 = lx0Var.e(d, false, true);
            int e12 = lx0Var.e(d, true, false);
            int i29 = e10 + e12;
            int e13 = e11 + lx0Var.e(d, false, false);
            int a12 = cx0Var.a(lx0Var, d, a10, i27 + i29, true);
            lx0Var = this;
            int a13 = cx0Var2.a(lx0Var, d, a11, i28 + e13, false);
            int c10 = a10.c(i27, i25 - i29);
            int c11 = a11.c(i28, i26 - e13);
            int i30 = i21 + b10 + a12;
            int i31 = !lx0Var.I ? e10 + i30 : ((i17 - c10) - e12) - i30;
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
                    fx0 fx0Var3 = d.a.a.b;
                    if (fx0Var3.b - fx0Var3.a <= 1) {
                        ArrayList arrayList2 = lx0Var.K;
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
            bx0Var = bx0Var3;
            childCount2 = i20;
            bx0Var2 = bx0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            ex0 ex0Var = (ex0) arrayList.get(i35);
            int i36 = ex0Var.l;
            int i37 = ex0Var.d;
            int i38 = i36 - ex0Var.m;
            ArrayList arrayList3 = lx0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                ex0 ex0Var2 = (ex0) arrayList3.get(i39);
                if (ex0Var.a.a.b.a != ex0Var2.a.a.b.a) {
                    break;
                }
                int i40 = ex0Var.m;
                int i41 = ex0Var2.m;
                if (i40 < i41) {
                    z9 = true;
                    break;
                }
                int i42 = ex0Var2.l - i41;
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
                    ex0 ex0Var3 = (ex0) arrayList3.get(i43);
                    if (ex0Var.a.a.b.a != ex0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = ex0Var.m;
                    int i45 = ex0Var3.m;
                    if (i44 < i45) {
                        z9 = true;
                        break;
                    }
                    int i46 = ex0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z9) {
                ex0Var.l = ex0Var.m;
                ex0Var.g();
                max -= i38;
                int i47 = ex0Var.a.a.b.a;
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
                    ex0 ex0Var4 = (ex0) arrayList3.get(i50);
                    if (ex0Var == ex0Var4) {
                        i13 = i50;
                    } else {
                        int i51 = ex0Var.a.a.b.a;
                        int i52 = ex0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (ex0Var4.m != ex0Var4.l) {
                                arrayList.remove(ex0Var4);
                                if (ex0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = ex0Var4.l - i38;
                            ex0Var4.l = i53;
                            i13 = i50;
                            ex0Var4.d(ex0Var4.k, i53, true);
                        } else {
                            i13 = i50;
                            if (i51 < i52) {
                                ex0Var4.q -= i38;
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
        int childCount3 = lx0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            ex0 d2 = lx0Var.d(i54);
            lx0Var.O.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        lx0Var.D = i17;
        lx0Var.E = max;
        lx0Var.F = copyOf;
        lx0Var.setMeasuredDimension(i17, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        bx0 bx0Var;
        super.requestLayout();
        bx0 bx0Var2 = this.c;
        if (bx0Var2 == null || (bx0Var = this.d) == null) {
            return;
        }
        bx0Var2.l();
        bx0Var.l();
    }

    public void setAlignmentMode(int i7) {
        this.h = i7;
        requestLayout();
    }

    public void setColumnCount(int i7) {
        this.c.n(i7);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z9) {
        bx0 bx0Var = this.c;
        bx0Var.u = z9;
        bx0Var.k();
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
            ex0 d = d(i11);
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
                ex0 d2 = d(i17);
                dx0 dx0Var = d2.b;
                int b10 = dx0Var != null ? dx0Var.b() : 0;
                if (b10 > 0) {
                    fx0 fx0Var = d2.a.a.b;
                    int max = Math.max(0, fx0Var.a);
                    int min = Math.min(i14, fx0Var.b);
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
                ex0 d10 = d(i24);
                fx0 fx0Var2 = d10.a.a.b;
                int max3 = Math.max(0, Math.min(i14, fx0Var2.a));
                int max4 = Math.max(max3, Math.min(i14, fx0Var2.b));
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
        bx0 bx0Var = this.d;
        bx0Var.u = z9;
        bx0Var.k();
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
