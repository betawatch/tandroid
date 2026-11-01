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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qy0 extends View {
    public static final cy0 R = new cy0(0);
    public static final cy0 S = new cy0(1);
    public static final cy0 T = new cy0(3);
    public static final cy0 U = new cy0(4);
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
    public final py0 O;
    public final ArrayList P;
    public final oy0 Q;
    public final org.telegram.ui.Cells.k9 a;
    public int b;
    public final gy0 c;
    public final gy0 d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public qy0(Context context, py0 py0Var, org.telegram.ui.Cells.k9 k9Var) {
        super(context);
        this.c = new gy0(this, true);
        this.d = new gy0(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = org.telegram.messenger.i0.L(8.0f);
        this.s = org.telegram.messenger.i0.L(9.0f);
        this.w = org.telegram.messenger.i0.L(12.0f);
        this.y = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.a = k9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = py0Var;
        oy0 oy0Var = new oy0(this, this);
        this.Q = oy0Var;
        r0.h0.j(this, oy0Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.e.A(str, ". "));
    }

    public static void j(ly0 ly0Var, int i10, int i11, int i12, int i13) {
        ky0 ky0Var = new ky0(i10, i11 + i10);
        ny0 ny0Var = ly0Var.a;
        ly0Var.a = new ny0(ny0Var.a, ky0Var, ny0Var.c, ny0Var.d);
        ky0 ky0Var2 = new ky0(i12, i13 + i12);
        ny0 ny0Var2 = ly0Var.b;
        ly0Var.b = new ny0(ny0Var2.a, ky0Var2, ny0Var2.c, ny0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        jy0 jy0Var = new jy0(this, arrayList.size());
        ly0 ly0Var = new ly0();
        ky0 ky0Var = new ky0(i11, i13 + i11);
        cy0 cy0Var = U;
        ly0Var.a = new ny0(false, ky0Var, cy0Var, 0.0f);
        ly0Var.b = new ny0(false, new ky0(i10, i12 + i10), cy0Var, 0.0f);
        jy0Var.a = ly0Var;
        jy0Var.j = i11;
        arrayList.add(jy0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        jy0 jy0Var = new jy0(this, arrayList.size());
        jy0Var.c = pagetablecell;
        ly0 ly0Var = new ly0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        ky0 ky0Var = new ky0(i11, i13 + i11);
        cy0 cy0Var = U;
        ly0Var.a = new ny0(false, ky0Var, cy0Var, 0.0f);
        ly0Var.b = new ny0(false, new ky0(i10, i12 + i10), cy0Var, 1.0f);
        jy0Var.a = ly0Var;
        jy0Var.j = i11;
        arrayList.add(jy0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + r10));
        }
        h();
    }

    public final void c() {
        Throwable th2;
        int i10 = this.n;
        if (i10 != 0) {
            int childCount = getChildCount();
            int i11 = 1;
            for (int i12 = 0; i12 < childCount; i12++) {
                i11 = (i11 * 31) + d(i12).a.hashCode();
            }
            if (i10 != i11) {
                h();
                c();
                return;
            }
            return;
        }
        boolean z10 = this.e == 0;
        int i13 = (z10 ? this.c : this.d).b;
        if (i13 == Integer.MIN_VALUE) {
            i13 = 0;
        }
        if (i13 < 0 || i13 > 1024) {
            g("Table grid count out of bounds");
            throw null;
        }
        int[] iArr = new int[i13];
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount2; i16++) {
            ly0 ly0Var = d(i16).a;
            ny0 ny0Var = z10 ? ly0Var.a : ly0Var.b;
            ky0 ky0Var = ny0Var.b;
            boolean z11 = ny0Var.a;
            int a2 = ky0Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = ky0Var.a;
            }
            ny0 ny0Var2 = z10 ? ly0Var.b : ly0Var.a;
            ky0 ky0Var2 = ny0Var2.b;
            int a10 = ky0Var2.a();
            int i17 = ky0Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (ky0Var2.a() <= 1024) {
                    boolean z12 = ny0Var2.a;
                    int a11 = ky0Var2.a();
                    if (i13 != 0) {
                        a11 = Math.min(a11, i13 - (z12 ? Math.min(i17, i13) : 0));
                    }
                    if (z12) {
                        i15 = i17;
                    }
                    if (i13 != 0) {
                        if (!z11 || !z12) {
                            while (true) {
                                int i18 = i15 + a11;
                                if (i18 <= i13) {
                                    for (int i19 = i15; i19 < i18; i19++) {
                                        if (iArr[i19] <= i14) {
                                        }
                                    }
                                    break;
                                }
                                if (z12) {
                                    i14++;
                                } else if (i18 <= i13) {
                                    i15++;
                                } else {
                                    i14++;
                                    i15 = 0;
                                }
                            }
                        }
                        Arrays.fill(iArr, Math.min(i15, i13), Math.min(i15 + a11, i13), i14 + a2);
                    }
                    if (z10) {
                        j(ly0Var, i14, a2, i15, a11);
                    } else {
                        j(ly0Var, i15, a11, i14, a2);
                    }
                    i15 += a11;
                }
            } else {
                th2 = null;
            }
            g("Table row or column span out of bounds");
            throw th2;
        }
        int childCount3 = getChildCount();
        int i20 = 1;
        for (int i21 = 0; i21 < childCount3; i21++) {
            i20 = (i20 * 31) + d(i21).a.hashCode();
        }
        this.n = i20;
    }

    public final jy0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (jy0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        oy0 oy0Var = this.Q;
        if (oy0Var == null || !oy0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(jy0 jy0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(jy0Var, z10, z11);
        }
        gy0 gy0Var = z10 ? this.c : this.d;
        if (z11) {
            if (gy0Var.j == null) {
                gy0Var.j = new int[gy0Var.e() + 1];
            }
            if (!gy0Var.k) {
                gy0Var.b(true);
                gy0Var.k = true;
            }
            iArr = gy0Var.j;
        } else {
            if (gy0Var.l == null) {
                gy0Var.l = new int[gy0Var.e() + 1];
            }
            if (!gy0Var.m) {
                gy0Var.b(false);
                gy0Var.m = true;
            }
            iArr = gy0Var.l;
        }
        ly0 ly0Var = jy0Var.a;
        ky0 ky0Var = (z10 ? ly0Var.b : ly0Var.a).b;
        return iArr[z11 ? ky0Var.a : ky0Var.b];
    }

    public final int f(jy0 jy0Var, boolean z10, boolean z11) {
        ly0 ly0Var = jy0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) ly0Var).leftMargin : ((ViewGroup.MarginLayoutParams) ly0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) ly0Var).topMargin : ((ViewGroup.MarginLayoutParams) ly0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        ny0 ny0Var = z10 ? ly0Var.b : ly0Var.a;
        gy0 gy0Var = z10 ? this.c : this.d;
        ky0 ky0Var = ny0Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = ky0Var.a;
            return 0;
        }
        int i12 = ky0Var.b;
        gy0Var.e();
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
        gy0 gy0Var = this.c;
        gy0Var.k();
        gy0 gy0Var2 = this.d;
        gy0Var2.k();
        if (gy0Var == null || gy0Var2 == null) {
            return;
        }
        gy0Var.l();
        gy0Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            jy0 d = d(i11);
            ly0 ly0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) ly0Var).height = Math.max(this.x, d.f + this.r + this.s);
                    int b10 = d.b.b();
                    ((ViewGroup.MarginLayoutParams) ly0Var).width = b10 > 0 ? ((ViewGroup.MarginLayoutParams) ly0Var).height * b10 : (this.w * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) ly0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) ly0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ly0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ly0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                ny0 ny0Var = z11 ? ly0Var.b : ly0Var.a;
                if (ny0.a(ny0Var, z11) == U) {
                    ky0 ky0Var = ny0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e = (g10[ky0Var.b] - g10[ky0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        iy0 iy0Var = d.b;
                        int b11 = iy0Var != null ? iy0Var.b() : 0;
                        if (b11 > 0) {
                            int max = Math.max(1, Math.round(e / b11));
                            ((ViewGroup.MarginLayoutParams) ly0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ly0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ly0Var).width, e(d, false, false) + e(d, false, true) + e, false);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            d(i10).a(canvas, this, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        qy0 qy0Var = this;
        qy0Var.c();
        gy0 gy0Var = qy0Var.d;
        gy0 gy0Var2 = qy0Var.c;
        if (gy0Var2 != null && gy0Var != null) {
            gy0Var2.l();
            gy0Var.l();
        }
        qy0Var.b = 0;
        int childCount = qy0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            qy0Var.b = Math.max(qy0Var.b, qy0Var.d(i16).a.b.b.b);
        }
        qy0Var.i(i10, true);
        if (qy0Var.e == 0) {
            i12 = gy0Var2.i(i10);
            if (qy0Var.y) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                gy0Var2.v.a = i12;
                gy0Var2.w.a = -i12;
                gy0Var2.q = false;
                gy0Var2.g();
            }
            qy0Var.i(i10, false);
            i13 = gy0Var.i(i11);
        } else {
            int i17 = gy0Var.i(i11);
            qy0Var.i(i10, false);
            i12 = gy0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, qy0Var.getSuggestedMinimumHeight());
        qy0Var.setMeasuredDimension(i12, max);
        gy0Var2.v.a = i12;
        gy0Var2.w.a = -i12;
        gy0Var2.q = false;
        gy0Var2.g();
        gy0Var.v.a = max;
        gy0Var.w.a = -max;
        gy0Var.q = false;
        gy0Var.g();
        int[] g10 = gy0Var2.g();
        int[] g11 = gy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = qy0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = qy0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            jy0 d = qy0Var.d(i20);
            ly0 ly0Var = d.a;
            ny0 ny0Var = ly0Var.b;
            ny0 ny0Var2 = ly0Var.a;
            ky0 ky0Var = ny0Var.b;
            ky0 ky0Var2 = ny0Var2.b;
            int i21 = childCount2;
            int i22 = g10[ky0Var.a];
            int i23 = g11[ky0Var2.a];
            int i24 = g10[ky0Var.b];
            int i25 = g11[ky0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            gy0 gy0Var3 = gy0Var;
            int i29 = d.l;
            cy0 a2 = ny0.a(ny0Var, true);
            cy0 a10 = ny0.a(ny0Var2, false);
            li.k f7 = gy0Var2.f();
            hy0 hy0Var = (hy0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            li.k f10 = gy0Var3.f();
            gy0 gy0Var4 = gy0Var2;
            hy0 hy0Var2 = (hy0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - hy0Var.d(true));
            int b11 = a10.b(d, i27 - hy0Var2.d(true));
            int e = qy0Var.e(d, true, true);
            int e7 = qy0Var.e(d, false, true);
            int e10 = qy0Var.e(d, true, false);
            int i30 = e + e10;
            int e11 = e7 + qy0Var.e(d, false, false);
            int a11 = hy0Var.a(qy0Var, d, a2, i28 + i30, true);
            qy0Var = this;
            int a12 = hy0Var2.a(qy0Var, d, a10, i29 + e11, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e11);
            int i31 = i22 + b10 + a11;
            int i32 = !qy0Var.I ? e + i31 : ((i18 - c10) - e10) - i31;
            int i33 = i23 + b11 + a12 + e7;
            if (d.c != null) {
                if (c10 == d.k && c11 == d.l) {
                    i15 = 0;
                } else {
                    i15 = 0;
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    ky0 ky0Var3 = d.a.a.b;
                    if (ky0Var3.b - ky0Var3.a <= 1) {
                        ArrayList arrayList2 = qy0Var.K;
                        int size = arrayList2.size();
                        int i35 = i15;
                        while (true) {
                            if (i35 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i35);
                            float f11 = pointF.x;
                            float f12 = d.a.a.b.a;
                            if (f11 > f12 || pointF.y <= f12) {
                                i35++;
                            }
                        }
                    }
                }
            }
            d.p = i32;
            d.q = i33;
            i19 = i20 + 1;
            gy0Var = gy0Var3;
            childCount2 = i21;
            gy0Var2 = gy0Var4;
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            jy0 jy0Var = (jy0) arrayList.get(i36);
            int i37 = jy0Var.l;
            int i38 = jy0Var.d;
            int i39 = i37 - jy0Var.m;
            ArrayList arrayList3 = qy0Var.P;
            int size3 = arrayList3.size();
            for (int i40 = i38 + 1; i40 < size3; i40++) {
                jy0 jy0Var2 = (jy0) arrayList3.get(i40);
                if (jy0Var.a.a.b.a != jy0Var2.a.a.b.a) {
                    break;
                }
                int i41 = jy0Var.m;
                int i42 = jy0Var2.m;
                if (i41 < i42) {
                    z10 = true;
                    break;
                }
                int i43 = jy0Var2.l - i42;
                if (i43 > 0) {
                    i39 = Math.min(i39, i43);
                }
            }
            z10 = false;
            if (!z10) {
                int i44 = i38 - 1;
                while (true) {
                    if (i44 < 0) {
                        break;
                    }
                    jy0 jy0Var3 = (jy0) arrayList3.get(i44);
                    if (jy0Var.a.a.b.a != jy0Var3.a.a.b.a) {
                        break;
                    }
                    int i45 = jy0Var.m;
                    int i46 = jy0Var3.m;
                    if (i45 < i46) {
                        z10 = true;
                        break;
                    }
                    int i47 = jy0Var3.l - i46;
                    if (i47 > 0) {
                        i39 = Math.min(i39, i47);
                    }
                    i44--;
                }
            }
            if (!z10) {
                jy0Var.l = jy0Var.m;
                jy0Var.g();
                max -= i39;
                int i48 = jy0Var.a.a.b.a;
                while (true) {
                    i48++;
                    if (i48 >= copyOf.length) {
                        break;
                    } else {
                        copyOf[i48] = copyOf[i48] - i39;
                    }
                }
                int size4 = arrayList3.size();
                int i49 = size2;
                int i50 = i36;
                int i51 = 0;
                while (i51 < size4) {
                    jy0 jy0Var4 = (jy0) arrayList3.get(i51);
                    if (jy0Var == jy0Var4) {
                        i14 = i51;
                    } else {
                        int i52 = jy0Var.a.a.b.a;
                        int i53 = jy0Var4.a.a.b.a;
                        if (i52 == i53) {
                            if (jy0Var4.m != jy0Var4.l) {
                                arrayList.remove(jy0Var4);
                                if (jy0Var4.d < i38) {
                                    i50--;
                                }
                                i49--;
                            }
                            int i54 = jy0Var4.l - i39;
                            jy0Var4.l = i54;
                            i14 = i51;
                            jy0Var4.d(jy0Var4.k, i54, true);
                        } else {
                            i14 = i51;
                            if (i52 < i53) {
                                jy0Var4.q -= i39;
                            }
                        }
                    }
                    i51 = i14 + 1;
                }
                i36 = i50;
                size2 = i49;
            }
            i36++;
        }
        int childCount3 = qy0Var.getChildCount();
        for (int i55 = 0; i55 < childCount3; i55++) {
            jy0 d10 = qy0Var.d(i55);
            qy0Var.O.g(d10.b, d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        qy0Var.D = i18;
        qy0Var.E = max;
        qy0Var.F = copyOf;
        qy0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        gy0 gy0Var;
        super.requestLayout();
        gy0 gy0Var2 = this.c;
        if (gy0Var2 == null || (gy0Var = this.d) == null) {
            return;
        }
        gy0Var2.l();
        gy0Var.l();
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.c.n(i10);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        gy0 gy0Var = this.c;
        gy0Var.u = z10;
        gy0Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.x = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        if (this.e != i10) {
            this.e = i10;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.D = Math.max(measuredWidth, i10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            jy0 d = d(i12);
            if (measuredWidth <= 0 || (i11 = this.D) == measuredWidth) {
                int i13 = d.n;
                int i14 = d.o + i13;
                d.p = i13;
                d.k = Math.max(0, i14 - i13);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f7 = measuredWidth;
                int round = Math.round((d.n * i11) / f7);
                int round2 = Math.round(((d.n + d.o) * this.D) / f7);
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
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.F;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                jy0 d10 = d(i18);
                iy0 iy0Var = d10.b;
                int b10 = iy0Var != null ? iy0Var.b() : 0;
                if (b10 > 0) {
                    ky0 ky0Var = d10.a.a.b;
                    int max = Math.max(0, ky0Var.a);
                    int min = Math.min(i15, ky0Var.b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.k / b10)) - i19;
                        while (max < min && max2 > 0) {
                            int i21 = min - max;
                            int i22 = ((max2 + i21) - 1) / i21;
                            iArr2[max] = iArr2[max] + i22;
                            max2 -= i22;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i23 = 0;
            while (i23 < i15) {
                int i24 = i23 + 1;
                iArr4[i24] = iArr4[i23] + iArr2[i23];
                i23 = i24;
            }
            this.E = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                jy0 d11 = d(i25);
                ky0 ky0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, ky0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, ky0Var2.b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.q = i26;
                d11.l = Math.max(0, i27 - i26);
                if (d11.c != null) {
                    d11.g();
                }
                this.O.g(d11.b, d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        gy0 gy0Var = this.d;
        gy0Var.u = z10;
        gy0Var.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.I = z10;
    }

    public void setStriped(boolean z10) {
        this.H = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f = z10;
        requestLayout();
    }
}
