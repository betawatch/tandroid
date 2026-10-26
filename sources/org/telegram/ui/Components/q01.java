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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q01 extends View {
    public static final c01 R = new c01(0);
    public static final c01 S = new c01(1);
    public static final c01 T = new c01(3);
    public static final c01 U = new c01(4);
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
    public final p01 O;
    public final ArrayList P;
    public final o01 Q;
    public final org.telegram.ui.Cells.s9 a;
    public int b;
    public final g01 c;
    public final g01 d;
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

    public q01(Context context, p01 p01Var, org.telegram.ui.Cells.s9 s9Var) {
        super(context);
        this.c = new g01(this, true);
        this.d = new g01(this, false);
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
        this.O = p01Var;
        o01 o01Var = new o01(this, this);
        this.Q = o01Var;
        r0.i0.k(this, o01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(b10.u(str, ". "));
    }

    public static void j(l01 l01Var, int i10, int i11, int i12, int i13) {
        k01 k01Var = new k01(i10, i11 + i10);
        n01 n01Var = l01Var.a;
        l01Var.a = new n01(n01Var.a, k01Var, n01Var.c, n01Var.d);
        k01 k01Var2 = new k01(i12, i13 + i12);
        n01 n01Var2 = l01Var.b;
        l01Var.b = new n01(n01Var2.a, k01Var2, n01Var2.c, n01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        j01 j01Var = new j01(this, arrayList.size());
        l01 l01Var = new l01();
        k01 k01Var = new k01(i11, i13 + i11);
        c01 c01Var = U;
        l01Var.a = new n01(false, k01Var, c01Var, 0.0f);
        l01Var.b = new n01(false, new k01(i10, i12 + i10), c01Var, 0.0f);
        j01Var.a = l01Var;
        j01Var.j = i11;
        arrayList.add(j01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        j01 j01Var = new j01(this, arrayList.size());
        j01Var.c = pagetablecell;
        l01 l01Var = new l01();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        k01 k01Var = new k01(i11, i13 + i11);
        c01 c01Var = U;
        l01Var.a = new n01(false, k01Var, c01Var, 0.0f);
        l01Var.b = new n01(false, new k01(i10, i12 + i10), c01Var, 1.0f);
        j01Var.a = l01Var;
        j01Var.j = i11;
        arrayList.add(j01Var);
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
            l01 l01Var = d(i16).a;
            n01 n01Var = z10 ? l01Var.a : l01Var.b;
            k01 k01Var = n01Var.b;
            boolean z11 = n01Var.a;
            int a2 = k01Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = k01Var.a;
            }
            n01 n01Var2 = z10 ? l01Var.b : l01Var.a;
            k01 k01Var2 = n01Var2.b;
            int a10 = k01Var2.a();
            int i17 = k01Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (k01Var2.a() <= 1024) {
                    boolean z12 = n01Var2.a;
                    int a11 = k01Var2.a();
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
                        j(l01Var, i14, a2, i15, a11);
                    } else {
                        j(l01Var, i15, a11, i14, a2);
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

    public final j01 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (j01) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        o01 o01Var = this.Q;
        if (o01Var == null || !o01Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(j01 j01Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(j01Var, z10, z11);
        }
        g01 g01Var = z10 ? this.c : this.d;
        if (z11) {
            if (g01Var.j == null) {
                g01Var.j = new int[g01Var.e() + 1];
            }
            if (!g01Var.k) {
                g01Var.b(true);
                g01Var.k = true;
            }
            iArr = g01Var.j;
        } else {
            if (g01Var.l == null) {
                g01Var.l = new int[g01Var.e() + 1];
            }
            if (!g01Var.m) {
                g01Var.b(false);
                g01Var.m = true;
            }
            iArr = g01Var.l;
        }
        l01 l01Var = j01Var.a;
        k01 k01Var = (z10 ? l01Var.b : l01Var.a).b;
        return iArr[z11 ? k01Var.a : k01Var.b];
    }

    public final int f(j01 j01Var, boolean z10, boolean z11) {
        l01 l01Var = j01Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) l01Var).leftMargin : ((ViewGroup.MarginLayoutParams) l01Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) l01Var).topMargin : ((ViewGroup.MarginLayoutParams) l01Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        n01 n01Var = z10 ? l01Var.b : l01Var.a;
        g01 g01Var = z10 ? this.c : this.d;
        k01 k01Var = n01Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = k01Var.a;
            return 0;
        }
        int i12 = k01Var.b;
        g01Var.e();
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
        g01 g01Var = this.c;
        g01Var.k();
        g01 g01Var2 = this.d;
        g01Var2.k();
        if (g01Var == null || g01Var2 == null) {
            return;
        }
        g01Var.l();
        g01Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            j01 d = d(i11);
            l01 l01Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) l01Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) l01Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) l01Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) l01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) l01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) l01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) l01Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                n01 n01Var = z11 ? l01Var.b : l01Var.a;
                if (n01.a(n01Var, z11) == U) {
                    k01 k01Var = n01Var.b;
                    int[] g7 = (z11 ? this.c : this.d).g();
                    int e = (g7[k01Var.b] - g7[k01Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        i01 i01Var = d.b;
                        int emojiOnlyCount2 = i01Var != null ? i01Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) l01Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) l01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) l01Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        q01 q01Var = this;
        q01Var.c();
        g01 g01Var = q01Var.d;
        g01 g01Var2 = q01Var.c;
        if (g01Var2 != null && g01Var != null) {
            g01Var2.l();
            g01Var.l();
        }
        q01Var.b = 0;
        int childCount = q01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            q01Var.b = Math.max(q01Var.b, q01Var.d(i16).a.b.b.b);
        }
        q01Var.i(i10, true);
        if (q01Var.e == 0) {
            i12 = g01Var2.i(i10);
            if (q01Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                g01Var2.v.a = i12;
                g01Var2.w.a = -i12;
                g01Var2.q = false;
                g01Var2.g();
            }
            q01Var.i(i10, false);
            i13 = g01Var.i(i11);
        } else {
            int i17 = g01Var.i(i11);
            q01Var.i(i10, false);
            i12 = g01Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, q01Var.getSuggestedMinimumHeight());
        q01Var.setMeasuredDimension(i12, max);
        g01Var2.v.a = i12;
        g01Var2.w.a = -i12;
        g01Var2.q = false;
        g01Var2.g();
        g01Var.v.a = max;
        g01Var.w.a = -max;
        g01Var.q = false;
        g01Var.g();
        int[] g7 = g01Var2.g();
        int[] g10 = g01Var.g();
        int[] copyOf = Arrays.copyOf(g10, g10.length);
        ArrayList arrayList = q01Var.J;
        arrayList.clear();
        int i18 = g7[g7.length - 1];
        int childCount2 = q01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            j01 d = q01Var.d(i20);
            l01 l01Var = d.a;
            n01 n01Var = l01Var.b;
            n01 n01Var2 = l01Var.a;
            k01 k01Var = n01Var.b;
            k01 k01Var2 = n01Var2.b;
            int i21 = childCount2;
            int i22 = g7[k01Var.a];
            int i23 = g10[k01Var2.a];
            int i24 = g7[k01Var.b];
            int i25 = g10[k01Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            g01 g01Var3 = g01Var;
            int i29 = d.l;
            gb1 a2 = n01.a(n01Var, true);
            gb1 a10 = n01.a(n01Var2, false);
            k6.c f7 = g01Var2.f();
            h01 h01Var = (h01) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            k6.c f10 = g01Var3.f();
            g01 g01Var4 = g01Var2;
            h01 h01Var2 = (h01) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int H = a2.H(d, i26 - h01Var.d(true));
            int H2 = a10.H(d, i27 - h01Var2.d(true));
            int e = q01Var.e(d, true, true);
            int e10 = q01Var.e(d, false, true);
            int e11 = q01Var.e(d, true, false);
            int i30 = e + e11;
            int e12 = e10 + q01Var.e(d, false, false);
            int a11 = h01Var.a(q01Var, d, a2, i28 + i30, true);
            q01Var = this;
            int a12 = h01Var2.a(q01Var, d, a10, i29 + e12, false);
            int J = a2.J(i28, i26 - i30);
            int J2 = a10.J(i29, i27 - e12);
            int i31 = i22 + H + a11;
            int i32 = !q01Var.I ? e + i31 : ((i18 - J) - e11) - i31;
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
                    k01 k01Var3 = d.a.a.b;
                    if (k01Var3.b - k01Var3.a <= 1) {
                        ArrayList arrayList2 = q01Var.K;
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
            g01Var = g01Var3;
            childCount2 = i21;
            g01Var2 = g01Var4;
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            j01 j01Var = (j01) arrayList.get(i36);
            int i37 = j01Var.l;
            int i38 = j01Var.d;
            int i39 = i37 - j01Var.m;
            ArrayList arrayList3 = q01Var.P;
            int size3 = arrayList3.size();
            for (int i40 = i38 + 1; i40 < size3; i40++) {
                j01 j01Var2 = (j01) arrayList3.get(i40);
                if (j01Var.a.a.b.a != j01Var2.a.a.b.a) {
                    break;
                }
                int i41 = j01Var.m;
                int i42 = j01Var2.m;
                if (i41 < i42) {
                    z10 = true;
                    break;
                }
                int i43 = j01Var2.l - i42;
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
                    j01 j01Var3 = (j01) arrayList3.get(i44);
                    if (j01Var.a.a.b.a != j01Var3.a.a.b.a) {
                        break;
                    }
                    int i45 = j01Var.m;
                    int i46 = j01Var3.m;
                    if (i45 < i46) {
                        z10 = true;
                        break;
                    }
                    int i47 = j01Var3.l - i46;
                    if (i47 > 0) {
                        i39 = Math.min(i39, i47);
                    }
                    i44--;
                }
            }
            if (!z10) {
                j01Var.l = j01Var.m;
                j01Var.g();
                max -= i39;
                int i48 = j01Var.a.a.b.a;
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
                    j01 j01Var4 = (j01) arrayList3.get(i51);
                    if (j01Var == j01Var4) {
                        i14 = i51;
                    } else {
                        int i52 = j01Var.a.a.b.a;
                        int i53 = j01Var4.a.a.b.a;
                        if (i52 == i53) {
                            if (j01Var4.m != j01Var4.l) {
                                arrayList.remove(j01Var4);
                                if (j01Var4.d < i38) {
                                    i50--;
                                }
                                i49--;
                            }
                            int i54 = j01Var4.l - i39;
                            j01Var4.l = i54;
                            i14 = i51;
                            j01Var4.d(j01Var4.k, i54, true);
                        } else {
                            i14 = i51;
                            if (i52 < i53) {
                                j01Var4.q -= i39;
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
        int childCount3 = q01Var.getChildCount();
        for (int i55 = 0; i55 < childCount3; i55++) {
            j01 d10 = q01Var.d(i55);
            q01Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        q01Var.y = i18;
        q01Var.E = max;
        q01Var.F = copyOf;
        q01Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        g01 g01Var;
        super.requestLayout();
        g01 g01Var2 = this.c;
        if (g01Var2 == null || (g01Var = this.d) == null) {
            return;
        }
        g01Var2.l();
        g01Var.l();
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
        g01 g01Var = this.c;
        g01Var.u = z10;
        g01Var.k();
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
            j01 d = d(i12);
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
                j01 d10 = d(i18);
                i01 i01Var = d10.b;
                int emojiOnlyCount = i01Var != null ? i01Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    k01 k01Var = d10.a.a.b;
                    int max = Math.max(0, k01Var.a);
                    int min = Math.min(i15, k01Var.b);
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
                j01 d11 = d(i25);
                k01 k01Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, k01Var2.a));
                int max4 = Math.max(max3, Math.min(i15, k01Var2.b));
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
        g01 g01Var = this.d;
        g01Var.u = z10;
        g01Var.k();
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
