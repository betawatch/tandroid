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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l01 extends View {
    public static final xz0 R = new xz0(0);
    public static final xz0 S = new xz0(1);
    public static final xz0 T = new xz0(3);
    public static final xz0 U = new xz0(4);
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
    public final k01 O;
    public final ArrayList P;
    public final j01 Q;
    public final org.telegram.ui.Cells.o9 a;
    public int b;
    public final b01 c;
    public final b01 d;
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

    public l01(Context context, k01 k01Var, org.telegram.ui.Cells.o9 o9Var) {
        super(context);
        this.c = new b01(this, true);
        this.d = new b01(this, false);
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
        this.a = o9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = k01Var;
        j01 j01Var = new j01(this, this);
        this.Q = j01Var;
        r0.i0.j(this, j01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sc.v.v(str, ". "));
    }

    public static void j(g01 g01Var, int i10, int i11, int i12, int i13) {
        f01 f01Var = new f01(i10, i11 + i10);
        i01 i01Var = g01Var.a;
        g01Var.a = new i01(i01Var.a, f01Var, i01Var.c, i01Var.d);
        f01 f01Var2 = new f01(i12, i13 + i12);
        i01 i01Var2 = g01Var.b;
        g01Var.b = new i01(i01Var2.a, f01Var2, i01Var2.c, i01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        e01 e01Var = new e01(this, arrayList.size());
        g01 g01Var = new g01();
        f01 f01Var = new f01(i11, i13 + i11);
        xz0 xz0Var = U;
        g01Var.a = new i01(false, f01Var, xz0Var, 0.0f);
        g01Var.b = new i01(false, new f01(i10, i12 + i10), xz0Var, 0.0f);
        e01Var.a = g01Var;
        e01Var.j = i11;
        arrayList.add(e01Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        e01 e01Var = new e01(this, arrayList.size());
        e01Var.c = pagetablecell;
        g01 g01Var = new g01();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        f01 f01Var = new f01(i11, i13 + i11);
        xz0 xz0Var = U;
        g01Var.a = new i01(false, f01Var, xz0Var, 0.0f);
        g01Var.b = new i01(false, new f01(i10, i12 + i10), xz0Var, 1.0f);
        e01Var.a = g01Var;
        e01Var.j = i11;
        arrayList.add(e01Var);
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
            g01 g01Var = d(i16).a;
            i01 i01Var = z10 ? g01Var.a : g01Var.b;
            f01 f01Var = i01Var.b;
            boolean z11 = i01Var.a;
            int a2 = f01Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = f01Var.a;
            }
            i01 i01Var2 = z10 ? g01Var.b : g01Var.a;
            f01 f01Var2 = i01Var2.b;
            int a10 = f01Var2.a();
            int i17 = f01Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (f01Var2.a() <= 1024) {
                    boolean z12 = i01Var2.a;
                    int a11 = f01Var2.a();
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
                        j(g01Var, i14, a2, i15, a11);
                    } else {
                        j(g01Var, i15, a11, i14, a2);
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

    public final e01 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (e01) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        j01 j01Var = this.Q;
        if (j01Var == null || !j01Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(e01 e01Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(e01Var, z10, z11);
        }
        b01 b01Var = z10 ? this.c : this.d;
        if (z11) {
            if (b01Var.j == null) {
                b01Var.j = new int[b01Var.e() + 1];
            }
            if (!b01Var.k) {
                b01Var.b(true);
                b01Var.k = true;
            }
            iArr = b01Var.j;
        } else {
            if (b01Var.l == null) {
                b01Var.l = new int[b01Var.e() + 1];
            }
            if (!b01Var.m) {
                b01Var.b(false);
                b01Var.m = true;
            }
            iArr = b01Var.l;
        }
        g01 g01Var = e01Var.a;
        f01 f01Var = (z10 ? g01Var.b : g01Var.a).b;
        return iArr[z11 ? f01Var.a : f01Var.b];
    }

    public final int f(e01 e01Var, boolean z10, boolean z11) {
        g01 g01Var = e01Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) g01Var).leftMargin : ((ViewGroup.MarginLayoutParams) g01Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) g01Var).topMargin : ((ViewGroup.MarginLayoutParams) g01Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        i01 i01Var = z10 ? g01Var.b : g01Var.a;
        b01 b01Var = z10 ? this.c : this.d;
        f01 f01Var = i01Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = f01Var.a;
            return 0;
        }
        int i12 = f01Var.b;
        b01Var.e();
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
        b01 b01Var = this.c;
        b01Var.k();
        b01 b01Var2 = this.d;
        b01Var2.k();
        if (b01Var == null || b01Var2 == null) {
            return;
        }
        b01Var.l();
        b01Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            e01 d = d(i11);
            g01 g01Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) g01Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) g01Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) g01Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) g01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) g01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) g01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) g01Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                i01 i01Var = z11 ? g01Var.b : g01Var.a;
                if (i01.a(i01Var, z11) == U) {
                    f01 f01Var = i01Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e7 = (g10[f01Var.b] - g10[f01Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        d01 d01Var = d.b;
                        int emojiOnlyCount2 = d01Var != null ? d01Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e7 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) g01Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) g01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) g01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        l01 l01Var = this;
        l01Var.c();
        b01 b01Var = l01Var.d;
        b01 b01Var2 = l01Var.c;
        if (b01Var2 != null && b01Var != null) {
            b01Var2.l();
            b01Var.l();
        }
        l01Var.b = 0;
        int childCount = l01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            l01Var.b = Math.max(l01Var.b, l01Var.d(i16).a.b.b.b);
        }
        l01Var.i(i10, true);
        if (l01Var.e == 0) {
            i12 = b01Var2.i(i10);
            if (l01Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                b01Var2.v.a = i12;
                b01Var2.w.a = -i12;
                b01Var2.q = false;
                b01Var2.g();
            }
            l01Var.i(i10, false);
            i13 = b01Var.i(i11);
        } else {
            int i17 = b01Var.i(i11);
            l01Var.i(i10, false);
            i12 = b01Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, l01Var.getSuggestedMinimumHeight());
        l01Var.setMeasuredDimension(i12, max);
        b01Var2.v.a = i12;
        b01Var2.w.a = -i12;
        b01Var2.q = false;
        b01Var2.g();
        b01Var.v.a = max;
        b01Var.w.a = -max;
        b01Var.q = false;
        b01Var.g();
        int[] g10 = b01Var2.g();
        int[] g11 = b01Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = l01Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = l01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            e01 d = l01Var.d(i20);
            g01 g01Var = d.a;
            i01 i01Var = g01Var.b;
            i01 i01Var2 = g01Var.a;
            f01 f01Var = i01Var.b;
            f01 f01Var2 = i01Var2.b;
            int i21 = childCount2;
            int i22 = g10[f01Var.a];
            int i23 = g11[f01Var2.a];
            int i24 = g10[f01Var.b];
            int i25 = g11[f01Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            b01 b01Var3 = b01Var;
            int i29 = d.l;
            xz0 a2 = i01.a(i01Var, true);
            xz0 a10 = i01.a(i01Var2, false);
            la.h f7 = b01Var2.f();
            c01 c01Var = (c01) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            la.h f10 = b01Var3.f();
            b01 b01Var4 = b01Var2;
            c01 c01Var2 = (c01) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - c01Var.d(true));
            int b11 = a10.b(d, i27 - c01Var2.d(true));
            int e7 = l01Var.e(d, true, true);
            int e10 = l01Var.e(d, false, true);
            int e11 = l01Var.e(d, true, false);
            int i30 = e7 + e11;
            int e12 = e10 + l01Var.e(d, false, false);
            int a11 = c01Var.a(l01Var, d, a2, i28 + i30, true);
            l01Var = this;
            int a12 = c01Var2.a(l01Var, d, a10, i29 + e12, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e12);
            int i31 = i22 + b10 + a11;
            int i32 = !l01Var.I ? e7 + i31 : ((i18 - c10) - e11) - i31;
            int i33 = i23 + b11 + a12 + e10;
            if (d.c != null) {
                if (c10 == d.k && c11 == d.l) {
                    i15 = 0;
                } else {
                    i15 = 0;
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    f01 f01Var3 = d.a.a.b;
                    if (f01Var3.b - f01Var3.a <= 1) {
                        ArrayList arrayList2 = l01Var.K;
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
            b01Var = b01Var3;
            childCount2 = i21;
            b01Var2 = b01Var4;
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            e01 e01Var = (e01) arrayList.get(i36);
            int i37 = e01Var.l;
            int i38 = e01Var.d;
            int i39 = i37 - e01Var.m;
            ArrayList arrayList3 = l01Var.P;
            int size3 = arrayList3.size();
            for (int i40 = i38 + 1; i40 < size3; i40++) {
                e01 e01Var2 = (e01) arrayList3.get(i40);
                if (e01Var.a.a.b.a != e01Var2.a.a.b.a) {
                    break;
                }
                int i41 = e01Var.m;
                int i42 = e01Var2.m;
                if (i41 < i42) {
                    z10 = true;
                    break;
                }
                int i43 = e01Var2.l - i42;
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
                    e01 e01Var3 = (e01) arrayList3.get(i44);
                    if (e01Var.a.a.b.a != e01Var3.a.a.b.a) {
                        break;
                    }
                    int i45 = e01Var.m;
                    int i46 = e01Var3.m;
                    if (i45 < i46) {
                        z10 = true;
                        break;
                    }
                    int i47 = e01Var3.l - i46;
                    if (i47 > 0) {
                        i39 = Math.min(i39, i47);
                    }
                    i44--;
                }
            }
            if (!z10) {
                e01Var.l = e01Var.m;
                e01Var.g();
                max -= i39;
                int i48 = e01Var.a.a.b.a;
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
                    e01 e01Var4 = (e01) arrayList3.get(i51);
                    if (e01Var == e01Var4) {
                        i14 = i51;
                    } else {
                        int i52 = e01Var.a.a.b.a;
                        int i53 = e01Var4.a.a.b.a;
                        if (i52 == i53) {
                            if (e01Var4.m != e01Var4.l) {
                                arrayList.remove(e01Var4);
                                if (e01Var4.d < i38) {
                                    i50--;
                                }
                                i49--;
                            }
                            int i54 = e01Var4.l - i39;
                            e01Var4.l = i54;
                            i14 = i51;
                            e01Var4.d(e01Var4.k, i54, true);
                        } else {
                            i14 = i51;
                            if (i52 < i53) {
                                e01Var4.q -= i39;
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
        int childCount3 = l01Var.getChildCount();
        for (int i55 = 0; i55 < childCount3; i55++) {
            e01 d10 = l01Var.d(i55);
            l01Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        l01Var.y = i18;
        l01Var.E = max;
        l01Var.F = copyOf;
        l01Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        b01 b01Var;
        super.requestLayout();
        b01 b01Var2 = this.c;
        if (b01Var2 == null || (b01Var = this.d) == null) {
            return;
        }
        b01Var2.l();
        b01Var.l();
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
        b01 b01Var = this.c;
        b01Var.u = z10;
        b01Var.k();
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
            e01 d = d(i12);
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
                e01 d10 = d(i18);
                d01 d01Var = d10.b;
                int emojiOnlyCount = d01Var != null ? d01Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    f01 f01Var = d10.a.a.b;
                    int max = Math.max(0, f01Var.a);
                    int min = Math.min(i15, f01Var.b);
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
                e01 d11 = d(i25);
                f01 f01Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, f01Var2.a));
                int max4 = Math.max(max3, Math.min(i15, f01Var2.b));
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
        b01 b01Var = this.d;
        b01Var.u = z10;
        b01Var.k();
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
