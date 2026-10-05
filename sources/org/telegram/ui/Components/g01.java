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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class g01 extends View {
    public static final sz0 R = new sz0(0);
    public static final sz0 S = new sz0(1);
    public static final sz0 T = new sz0(3);
    public static final sz0 U = new sz0(4);
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
    public final f01 O;
    public final ArrayList P;
    public final e01 Q;
    public final org.telegram.ui.Cells.q9 a;
    public int b;
    public final wz0 c;
    public final wz0 d;
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

    public g01(Context context, f01 f01Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.c = new wz0(this, true);
        this.d = new wz0(this, false);
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
        this.a = q9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = f01Var;
        e01 e01Var = new e01(this, this);
        this.Q = e01Var;
        r0.i0.k(this, e01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(sa.e.v(str, ". "));
    }

    public static void j(b01 b01Var, int i10, int i11, int i12, int i13) {
        a01 a01Var = new a01(i10, i11 + i10);
        d01 d01Var = b01Var.a;
        b01Var.a = new d01(d01Var.a, a01Var, d01Var.c, d01Var.d);
        a01 a01Var2 = new a01(i12, i13 + i12);
        d01 d01Var2 = b01Var.b;
        b01Var.b = new d01(d01Var2.a, a01Var2, d01Var2.c, d01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        zz0 zz0Var = new zz0(this, arrayList.size());
        b01 b01Var = new b01();
        a01 a01Var = new a01(i11, i13 + i11);
        sz0 sz0Var = U;
        b01Var.a = new d01(false, a01Var, sz0Var, 0.0f);
        b01Var.b = new d01(false, new a01(i10, i12 + i10), sz0Var, 0.0f);
        zz0Var.a = b01Var;
        zz0Var.j = i11;
        arrayList.add(zz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        zz0 zz0Var = new zz0(this, arrayList.size());
        zz0Var.c = pagetablecell;
        b01 b01Var = new b01();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        a01 a01Var = new a01(i11, i13 + i11);
        sz0 sz0Var = U;
        b01Var.a = new d01(false, a01Var, sz0Var, 0.0f);
        b01Var.b = new d01(false, new a01(i10, i12 + i10), sz0Var, 1.0f);
        zz0Var.a = b01Var;
        zz0Var.j = i11;
        arrayList.add(zz0Var);
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
            b01 b01Var = d(i16).a;
            d01 d01Var = z10 ? b01Var.a : b01Var.b;
            a01 a01Var = d01Var.b;
            boolean z11 = d01Var.a;
            int a2 = a01Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = a01Var.a;
            }
            d01 d01Var2 = z10 ? b01Var.b : b01Var.a;
            a01 a01Var2 = d01Var2.b;
            int a10 = a01Var2.a();
            int i17 = a01Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (a01Var2.a() <= 1024) {
                    boolean z12 = d01Var2.a;
                    int a11 = a01Var2.a();
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
                        j(b01Var, i14, a2, i15, a11);
                    } else {
                        j(b01Var, i15, a11, i14, a2);
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

    public final zz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (zz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        e01 e01Var = this.Q;
        if (e01Var == null || !e01Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(zz0 zz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(zz0Var, z10, z11);
        }
        wz0 wz0Var = z10 ? this.c : this.d;
        if (z11) {
            if (wz0Var.j == null) {
                wz0Var.j = new int[wz0Var.e() + 1];
            }
            if (!wz0Var.k) {
                wz0Var.b(true);
                wz0Var.k = true;
            }
            iArr = wz0Var.j;
        } else {
            if (wz0Var.l == null) {
                wz0Var.l = new int[wz0Var.e() + 1];
            }
            if (!wz0Var.m) {
                wz0Var.b(false);
                wz0Var.m = true;
            }
            iArr = wz0Var.l;
        }
        b01 b01Var = zz0Var.a;
        a01 a01Var = (z10 ? b01Var.b : b01Var.a).b;
        return iArr[z11 ? a01Var.a : a01Var.b];
    }

    public final int f(zz0 zz0Var, boolean z10, boolean z11) {
        b01 b01Var = zz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) b01Var).leftMargin : ((ViewGroup.MarginLayoutParams) b01Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) b01Var).topMargin : ((ViewGroup.MarginLayoutParams) b01Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        d01 d01Var = z10 ? b01Var.b : b01Var.a;
        wz0 wz0Var = z10 ? this.c : this.d;
        a01 a01Var = d01Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = a01Var.a;
            return 0;
        }
        int i12 = a01Var.b;
        wz0Var.e();
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
        wz0 wz0Var = this.c;
        wz0Var.k();
        wz0 wz0Var2 = this.d;
        wz0Var2.k();
        if (wz0Var == null || wz0Var2 == null) {
            return;
        }
        wz0Var.l();
        wz0Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            zz0 d = d(i11);
            b01 b01Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) b01Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) b01Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) b01Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) b01Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) b01Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) b01Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) b01Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                d01 d01Var = z11 ? b01Var.b : b01Var.a;
                if (d01.a(d01Var, z11) == U) {
                    a01 a01Var = d01Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e7 = (g10[a01Var.b] - g10[a01Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        yz0 yz0Var = d.b;
                        int emojiOnlyCount2 = yz0Var != null ? yz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e7 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) b01Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) b01Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) b01Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        g01 g01Var = this;
        g01Var.c();
        wz0 wz0Var = g01Var.d;
        wz0 wz0Var2 = g01Var.c;
        if (wz0Var2 != null && wz0Var != null) {
            wz0Var2.l();
            wz0Var.l();
        }
        g01Var.b = 0;
        int childCount = g01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            g01Var.b = Math.max(g01Var.b, g01Var.d(i16).a.b.b.b);
        }
        g01Var.i(i10, true);
        if (g01Var.e == 0) {
            i12 = wz0Var2.i(i10);
            if (g01Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                wz0Var2.v.a = i12;
                wz0Var2.w.a = -i12;
                wz0Var2.q = false;
                wz0Var2.g();
            }
            g01Var.i(i10, false);
            i13 = wz0Var.i(i11);
        } else {
            int i17 = wz0Var.i(i11);
            g01Var.i(i10, false);
            i12 = wz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, g01Var.getSuggestedMinimumHeight());
        g01Var.setMeasuredDimension(i12, max);
        wz0Var2.v.a = i12;
        wz0Var2.w.a = -i12;
        wz0Var2.q = false;
        wz0Var2.g();
        wz0Var.v.a = max;
        wz0Var.w.a = -max;
        wz0Var.q = false;
        wz0Var.g();
        int[] g10 = wz0Var2.g();
        int[] g11 = wz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = g01Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = g01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            zz0 d = g01Var.d(i20);
            b01 b01Var = d.a;
            d01 d01Var = b01Var.b;
            d01 d01Var2 = b01Var.a;
            a01 a01Var = d01Var.b;
            a01 a01Var2 = d01Var2.b;
            int i21 = childCount2;
            int i22 = g10[a01Var.a];
            int i23 = g11[a01Var2.a];
            int i24 = g10[a01Var.b];
            int i25 = g11[a01Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            wz0 wz0Var3 = wz0Var;
            int i29 = d.l;
            sz0 a2 = d01.a(d01Var, true);
            sz0 a10 = d01.a(d01Var2, false);
            la.h f7 = wz0Var2.f();
            xz0 xz0Var = (xz0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            la.h f10 = wz0Var3.f();
            wz0 wz0Var4 = wz0Var2;
            xz0 xz0Var2 = (xz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - xz0Var.d(true));
            int b11 = a10.b(d, i27 - xz0Var2.d(true));
            int e7 = g01Var.e(d, true, true);
            int e10 = g01Var.e(d, false, true);
            int e11 = g01Var.e(d, true, false);
            int i30 = e7 + e11;
            int e12 = e10 + g01Var.e(d, false, false);
            int a11 = xz0Var.a(g01Var, d, a2, i28 + i30, true);
            g01Var = this;
            int a12 = xz0Var2.a(g01Var, d, a10, i29 + e12, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e12);
            int i31 = i22 + b10 + a11;
            int i32 = !g01Var.I ? e7 + i31 : ((i18 - c10) - e11) - i31;
            int i33 = i23 + b11 + a12 + e10;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    a01 a01Var3 = d.a.a.b;
                    if (a01Var3.b - a01Var3.a <= 1) {
                        ArrayList arrayList2 = g01Var.K;
                        int size = arrayList2.size();
                        while (true) {
                            if (i15 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i15);
                            float f11 = pointF.x;
                            float f12 = d.a.a.b.a;
                            i15 = (f11 > f12 || pointF.y <= f12) ? i15 + 1 : 0;
                        }
                    }
                }
            }
            d.p = i32;
            d.q = i33;
            i19 = i20 + 1;
            wz0Var = wz0Var3;
            childCount2 = i21;
            wz0Var2 = wz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            zz0 zz0Var = (zz0) arrayList.get(i35);
            int i36 = zz0Var.l;
            int i37 = zz0Var.d;
            int i38 = i36 - zz0Var.m;
            ArrayList arrayList3 = g01Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                zz0 zz0Var2 = (zz0) arrayList3.get(i39);
                if (zz0Var.a.a.b.a != zz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = zz0Var.m;
                int i41 = zz0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = zz0Var2.l - i41;
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
                    zz0 zz0Var3 = (zz0) arrayList3.get(i43);
                    if (zz0Var.a.a.b.a != zz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = zz0Var.m;
                    int i45 = zz0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = zz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                zz0Var.l = zz0Var.m;
                zz0Var.g();
                max -= i38;
                int i47 = zz0Var.a.a.b.a;
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
                    zz0 zz0Var4 = (zz0) arrayList3.get(i50);
                    if (zz0Var == zz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = zz0Var.a.a.b.a;
                        int i52 = zz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (zz0Var4.m != zz0Var4.l) {
                                arrayList.remove(zz0Var4);
                                if (zz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = zz0Var4.l - i38;
                            zz0Var4.l = i53;
                            i14 = i50;
                            zz0Var4.d(zz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                zz0Var4.q -= i38;
                            }
                        }
                    }
                    i50 = i14 + 1;
                }
                i35 = i49;
                size2 = i48;
            }
            i35++;
        }
        int childCount3 = g01Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            zz0 d10 = g01Var.d(i54);
            g01Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        g01Var.y = i18;
        g01Var.E = max;
        g01Var.F = copyOf;
        g01Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        wz0 wz0Var;
        super.requestLayout();
        wz0 wz0Var2 = this.c;
        if (wz0Var2 == null || (wz0Var = this.d) == null) {
            return;
        }
        wz0Var2.l();
        wz0Var.l();
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
        wz0 wz0Var = this.c;
        wz0Var.u = z10;
        wz0Var.k();
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
            zz0 d = d(i12);
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
                zz0 d10 = d(i18);
                yz0 yz0Var = d10.b;
                int emojiOnlyCount = yz0Var != null ? yz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    a01 a01Var = d10.a.a.b;
                    int max = Math.max(0, a01Var.a);
                    int min = Math.min(i15, a01Var.b);
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
                zz0 d11 = d(i25);
                a01 a01Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, a01Var2.a));
                int max4 = Math.max(max3, Math.min(i15, a01Var2.b));
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
        wz0 wz0Var = this.d;
        wz0Var.u = z10;
        wz0Var.k();
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
