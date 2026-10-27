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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r01 extends View {
    public static final d01 R = new d01(0);
    public static final d01 S = new d01(1);
    public static final d01 T = new d01(3);
    public static final d01 U = new d01(4);
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
    public final q01 O;
    public final ArrayList P;
    public final p01 Q;
    public final org.telegram.ui.Cells.s9 a;
    public int b;
    public final h01 c;
    public final h01 d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public int y;

    public r01(Context context, q01 q01Var, org.telegram.ui.Cells.s9 s9Var) {
        super(context);
        this.c = new h01(this, true);
        this.d = new h01(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = AndroidUtilities.dp(8.0f);
        this.s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.x = true;
        this.F = new int[0];
        this.J = new ArrayList();
        this.K = new ArrayList();
        new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new float[8];
        this.P = new ArrayList();
        this.a = s9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = q01Var;
        p01 p01Var = new p01(this, this);
        this.Q = p01Var;
        r0.i0.k(this, p01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(b10.u(str, ". "));
    }

    public static void j(m01 m01Var, int i10, int i11, int i12, int i13) {
        l01 l01Var = new l01(i10, i11 + i10);
        o01 o01Var = m01Var.a;
        m01Var.a = new o01(o01Var.a, l01Var, o01Var.c, o01Var.d);
        l01 l01Var2 = new l01(i12, i13 + i12);
        o01 o01Var2 = m01Var.b;
        m01Var.b = new o01(o01Var2.a, l01Var2, o01Var2.c, o01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        k01 k01Var = new k01(this, arrayList.size());
        m01 m01Var = new m01();
        l01 l01Var = new l01(i11, i13 + i11);
        d01 d01Var = U;
        m01Var.a = new o01(false, l01Var, d01Var, 0.0f);
        m01Var.b = new o01(false, new l01(i10, i12 + i10), d01Var, 0.0f);
        k01Var.a = m01Var;
        k01Var.j = i11;
        arrayList.add(k01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        k01 k01Var = new k01(this, arrayList.size());
        k01Var.c = pagetablecell;
        m01 m01Var = new m01();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        l01 l01Var = new l01(i11, i13 + i11);
        d01 d01Var = U;
        m01Var.a = new o01(false, l01Var, d01Var, 0.0f);
        m01Var.b = new o01(false, new l01(i10, i12 + i10), d01Var, 1.0f);
        k01Var.a = m01Var;
        k01Var.j = i11;
        arrayList.add(k01Var);
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
            m01 m01Var = d(i16).a;
            o01 o01Var = z10 ? m01Var.a : m01Var.b;
            l01 l01Var = o01Var.b;
            boolean z11 = o01Var.a;
            int a2 = l01Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = l01Var.a;
            }
            o01 o01Var2 = z10 ? m01Var.b : m01Var.a;
            l01 l01Var2 = o01Var2.b;
            int a10 = l01Var2.a();
            int i17 = l01Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (l01Var2.a() <= 1024) {
                    boolean z12 = o01Var2.a;
                    int a11 = l01Var2.a();
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
                        j(m01Var, i14, a2, i15, a11);
                    } else {
                        j(m01Var, i15, a11, i14, a2);
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

    public final k01 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (k01) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        p01 p01Var = this.Q;
        if (p01Var == null || !p01Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(k01 k01Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(k01Var, z10, z11);
        }
        h01 h01Var = z10 ? this.c : this.d;
        if (z11) {
            if (h01Var.j == null) {
                h01Var.j = new int[h01Var.e() + 1];
            }
            if (!h01Var.k) {
                h01Var.b(true);
                h01Var.k = true;
            }
            iArr = h01Var.j;
        } else {
            if (h01Var.l == null) {
                h01Var.l = new int[h01Var.e() + 1];
            }
            if (!h01Var.m) {
                h01Var.b(false);
                h01Var.m = true;
            }
            iArr = h01Var.l;
        }
        m01 m01Var = k01Var.a;
        l01 l01Var = (z10 ? m01Var.b : m01Var.a).b;
        return iArr[z11 ? l01Var.a : l01Var.b];
    }

    public final int f(k01 k01Var, boolean z10, boolean z11) {
        m01 m01Var = k01Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) m01Var).leftMargin : ((ViewGroup.MarginLayoutParams) m01Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) m01Var).topMargin : ((ViewGroup.MarginLayoutParams) m01Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        o01 o01Var = z10 ? m01Var.b : m01Var.a;
        h01 h01Var = z10 ? this.c : this.d;
        l01 l01Var = o01Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = l01Var.a;
            return 0;
        }
        int i12 = l01Var.b;
        h01Var.e();
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
        h01 h01Var = this.c;
        h01Var.k();
        h01 h01Var2 = this.d;
        h01Var2.k();
        if (h01Var == null || h01Var2 == null) {
            return;
        }
        h01Var.l();
        h01Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            k01 d = d(i11);
            m01 m01Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) m01Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) m01Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) m01Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) m01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) m01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) m01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) m01Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                o01 o01Var = z11 ? m01Var.b : m01Var.a;
                if (o01.a(o01Var, z11) == U) {
                    l01 l01Var = o01Var.b;
                    int[] g7 = (z11 ? this.c : this.d).g();
                    int e = (g7[l01Var.b] - g7[l01Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        j01 j01Var = d.b;
                        int emojiOnlyCount2 = j01Var != null ? j01Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) m01Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) m01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) m01Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        r01 r01Var = this;
        r01Var.c();
        h01 h01Var = r01Var.d;
        h01 h01Var2 = r01Var.c;
        if (h01Var2 != null && h01Var != null) {
            h01Var2.l();
            h01Var.l();
        }
        r01Var.b = 0;
        int childCount = r01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            r01Var.b = Math.max(r01Var.b, r01Var.d(i16).a.b.b.b);
        }
        r01Var.i(i10, true);
        if (r01Var.e == 0) {
            i12 = h01Var2.i(i10);
            if (r01Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                h01Var2.v.a = i12;
                h01Var2.w.a = -i12;
                h01Var2.q = false;
                h01Var2.g();
            }
            r01Var.i(i10, false);
            i13 = h01Var.i(i11);
        } else {
            int i17 = h01Var.i(i11);
            r01Var.i(i10, false);
            i12 = h01Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, r01Var.getSuggestedMinimumHeight());
        r01Var.setMeasuredDimension(i12, max);
        h01Var2.v.a = i12;
        h01Var2.w.a = -i12;
        h01Var2.q = false;
        h01Var2.g();
        h01Var.v.a = max;
        h01Var.w.a = -max;
        h01Var.q = false;
        h01Var.g();
        int[] g7 = h01Var2.g();
        int[] g10 = h01Var.g();
        int[] copyOf = Arrays.copyOf(g10, g10.length);
        ArrayList arrayList = r01Var.J;
        arrayList.clear();
        int i18 = g7[g7.length - 1];
        int childCount2 = r01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            k01 d = r01Var.d(i20);
            m01 m01Var = d.a;
            o01 o01Var = m01Var.b;
            o01 o01Var2 = m01Var.a;
            l01 l01Var = o01Var.b;
            l01 l01Var2 = o01Var2.b;
            int i21 = childCount2;
            int i22 = g7[l01Var.a];
            int i23 = g10[l01Var2.a];
            int i24 = g7[l01Var.b];
            int i25 = g10[l01Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            h01 h01Var3 = h01Var;
            int i29 = d.l;
            kb1 a2 = o01.a(o01Var, true);
            kb1 a10 = o01.a(o01Var2, false);
            k6.c f7 = h01Var2.f();
            i01 i01Var = (i01) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            k6.c f10 = h01Var3.f();
            h01 h01Var4 = h01Var2;
            i01 i01Var2 = (i01) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int H = a2.H(d, i26 - i01Var.d(true));
            int H2 = a10.H(d, i27 - i01Var2.d(true));
            int e = r01Var.e(d, true, true);
            int e10 = r01Var.e(d, false, true);
            int e11 = r01Var.e(d, true, false);
            int i30 = e + e11;
            int e12 = e10 + r01Var.e(d, false, false);
            int a11 = i01Var.a(r01Var, d, a2, i28 + i30, true);
            r01Var = this;
            int a12 = i01Var2.a(r01Var, d, a10, i29 + e12, false);
            int J = a2.J(i28, i26 - i30);
            int J2 = a10.J(i29, i27 - e12);
            int i31 = i22 + H + a11;
            int i32 = !r01Var.I ? e + i31 : ((i18 - J) - e11) - i31;
            int i33 = i23 + H2 + a12 + e10;
            if (d.c != null) {
                if (J == d.k && J2 == d.l) {
                    i15 = 0;
                } else {
                    i15 = 0;
                    d.d(J, J2, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != J2) {
                    l01 l01Var3 = d.a.a.b;
                    if (l01Var3.b - l01Var3.a <= 1) {
                        ArrayList arrayList2 = r01Var.K;
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
            h01Var = h01Var3;
            childCount2 = i21;
            h01Var2 = h01Var4;
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            k01 k01Var = (k01) arrayList.get(i36);
            int i37 = k01Var.l;
            int i38 = k01Var.d;
            int i39 = i37 - k01Var.m;
            ArrayList arrayList3 = r01Var.P;
            int size3 = arrayList3.size();
            for (int i40 = i38 + 1; i40 < size3; i40++) {
                k01 k01Var2 = (k01) arrayList3.get(i40);
                if (k01Var.a.a.b.a != k01Var2.a.a.b.a) {
                    break;
                }
                int i41 = k01Var.m;
                int i42 = k01Var2.m;
                if (i41 < i42) {
                    z10 = true;
                    break;
                }
                int i43 = k01Var2.l - i42;
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
                    k01 k01Var3 = (k01) arrayList3.get(i44);
                    if (k01Var.a.a.b.a != k01Var3.a.a.b.a) {
                        break;
                    }
                    int i45 = k01Var.m;
                    int i46 = k01Var3.m;
                    if (i45 < i46) {
                        z10 = true;
                        break;
                    }
                    int i47 = k01Var3.l - i46;
                    if (i47 > 0) {
                        i39 = Math.min(i39, i47);
                    }
                    i44--;
                }
            }
            if (!z10) {
                k01Var.l = k01Var.m;
                k01Var.g();
                max -= i39;
                int i48 = k01Var.a.a.b.a;
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
                    k01 k01Var4 = (k01) arrayList3.get(i51);
                    if (k01Var == k01Var4) {
                        i14 = i51;
                    } else {
                        int i52 = k01Var.a.a.b.a;
                        int i53 = k01Var4.a.a.b.a;
                        if (i52 == i53) {
                            if (k01Var4.m != k01Var4.l) {
                                arrayList.remove(k01Var4);
                                if (k01Var4.d < i38) {
                                    i50--;
                                }
                                i49--;
                            }
                            int i54 = k01Var4.l - i39;
                            k01Var4.l = i54;
                            i14 = i51;
                            k01Var4.d(k01Var4.k, i54, true);
                        } else {
                            i14 = i51;
                            if (i52 < i53) {
                                k01Var4.q -= i39;
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
        int childCount3 = r01Var.getChildCount();
        for (int i55 = 0; i55 < childCount3; i55++) {
            k01 d10 = r01Var.d(i55);
            r01Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        r01Var.y = i18;
        r01Var.E = max;
        r01Var.F = copyOf;
        r01Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        h01 h01Var;
        super.requestLayout();
        h01 h01Var2 = this.c;
        if (h01Var2 == null || (h01Var = this.d) == null) {
            return;
        }
        h01Var2.l();
        h01Var.l();
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
        h01 h01Var = this.c;
        h01Var.u = z10;
        h01Var.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.G = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i10) {
        this.w = i10;
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
        this.y = Math.max(measuredWidth, i10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            k01 d = d(i12);
            if (measuredWidth <= 0 || (i11 = this.y) == measuredWidth) {
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
                int round2 = Math.round(((d.n + d.o) * this.y) / f7);
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
                k01 d10 = d(i18);
                j01 j01Var = d10.b;
                int emojiOnlyCount = j01Var != null ? j01Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    l01 l01Var = d10.a.a.b;
                    int max = Math.max(0, l01Var.a);
                    int min = Math.min(i15, l01Var.b);
                    if (max < min) {
                        int i19 = 0;
                        for (int i20 = max; i20 < min; i20++) {
                            i19 += iArr2[i20];
                        }
                        int max2 = Math.max(1, Math.round(d10.k / emojiOnlyCount)) - i19;
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
                k01 d11 = d(i25);
                l01 l01Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, l01Var2.a));
                int max4 = Math.max(max3, Math.min(i15, l01Var2.b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.q = i26;
                d11.l = Math.max(0, i27 - i26);
                if (d11.c != null) {
                    d11.g();
                }
                this.O.onLayoutChild(d11.b, d11.b(), d11.c());
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
        h01 h01Var = this.d;
        h01Var.u = z10;
        h01Var.k();
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
