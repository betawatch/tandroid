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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class e01 extends View {
    public static final qz0 R = new qz0(0);
    public static final qz0 S = new qz0(1);
    public static final qz0 T = new qz0(3);
    public static final qz0 U = new qz0(4);
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
    public final d01 O;
    public final ArrayList P;
    public final c01 Q;
    public final org.telegram.ui.Cells.n9 a;
    public int b;
    public final uz0 c;
    public final uz0 d;
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

    public e01(Context context, d01 d01Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.c = new uz0(this, true);
        this.d = new uz0(this, false);
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
        this.a = n9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = d01Var;
        c01 c01Var = new c01(this, this);
        this.Q = c01Var;
        r0.i0.j(this, c01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r4.c.u(str, ". "));
    }

    public static void j(zz0 zz0Var, int i10, int i11, int i12, int i13) {
        yz0 yz0Var = new yz0(i10, i11 + i10);
        b01 b01Var = zz0Var.a;
        zz0Var.a = new b01(b01Var.a, yz0Var, b01Var.c, b01Var.d);
        yz0 yz0Var2 = new yz0(i12, i13 + i12);
        b01 b01Var2 = zz0Var.b;
        zz0Var.b = new b01(b01Var2.a, yz0Var2, b01Var2.c, b01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        xz0 xz0Var = new xz0(this, arrayList.size());
        zz0 zz0Var = new zz0();
        yz0 yz0Var = new yz0(i11, i13 + i11);
        qz0 qz0Var = U;
        zz0Var.a = new b01(false, yz0Var, qz0Var, 0.0f);
        zz0Var.b = new b01(false, new yz0(i10, i12 + i10), qz0Var, 0.0f);
        xz0Var.a = zz0Var;
        xz0Var.j = i11;
        arrayList.add(xz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        xz0 xz0Var = new xz0(this, arrayList.size());
        xz0Var.c = pagetablecell;
        zz0 zz0Var = new zz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        yz0 yz0Var = new yz0(i11, i13 + i11);
        qz0 qz0Var = U;
        zz0Var.a = new b01(false, yz0Var, qz0Var, 0.0f);
        zz0Var.b = new b01(false, new yz0(i10, i12 + i10), qz0Var, 1.0f);
        xz0Var.a = zz0Var;
        xz0Var.j = i11;
        arrayList.add(xz0Var);
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
            zz0 zz0Var = d(i16).a;
            b01 b01Var = z10 ? zz0Var.a : zz0Var.b;
            yz0 yz0Var = b01Var.b;
            boolean z11 = b01Var.a;
            int a2 = yz0Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = yz0Var.a;
            }
            b01 b01Var2 = z10 ? zz0Var.b : zz0Var.a;
            yz0 yz0Var2 = b01Var2.b;
            int a10 = yz0Var2.a();
            int i17 = yz0Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (yz0Var2.a() <= 1024) {
                    boolean z12 = b01Var2.a;
                    int a11 = yz0Var2.a();
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
                        j(zz0Var, i14, a2, i15, a11);
                    } else {
                        j(zz0Var, i15, a11, i14, a2);
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

    public final xz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (xz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        c01 c01Var = this.Q;
        if (c01Var == null || !c01Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(xz0 xz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(xz0Var, z10, z11);
        }
        uz0 uz0Var = z10 ? this.c : this.d;
        if (z11) {
            if (uz0Var.j == null) {
                uz0Var.j = new int[uz0Var.e() + 1];
            }
            if (!uz0Var.k) {
                uz0Var.b(true);
                uz0Var.k = true;
            }
            iArr = uz0Var.j;
        } else {
            if (uz0Var.l == null) {
                uz0Var.l = new int[uz0Var.e() + 1];
            }
            if (!uz0Var.m) {
                uz0Var.b(false);
                uz0Var.m = true;
            }
            iArr = uz0Var.l;
        }
        zz0 zz0Var = xz0Var.a;
        yz0 yz0Var = (z10 ? zz0Var.b : zz0Var.a).b;
        return iArr[z11 ? yz0Var.a : yz0Var.b];
    }

    public final int f(xz0 xz0Var, boolean z10, boolean z11) {
        zz0 zz0Var = xz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) zz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) zz0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) zz0Var).topMargin : ((ViewGroup.MarginLayoutParams) zz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        b01 b01Var = z10 ? zz0Var.b : zz0Var.a;
        uz0 uz0Var = z10 ? this.c : this.d;
        yz0 yz0Var = b01Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = yz0Var.a;
            return 0;
        }
        int i12 = yz0Var.b;
        uz0Var.e();
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
        uz0 uz0Var = this.c;
        uz0Var.k();
        uz0 uz0Var2 = this.d;
        uz0Var2.k();
        if (uz0Var == null || uz0Var2 == null) {
            return;
        }
        uz0Var.l();
        uz0Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            xz0 d = d(i11);
            zz0 zz0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) zz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) zz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) zz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) zz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) zz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) zz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) zz0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                b01 b01Var = z11 ? zz0Var.b : zz0Var.a;
                if (b01.a(b01Var, z11) == U) {
                    yz0 yz0Var = b01Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e = (g10[yz0Var.b] - g10[yz0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        wz0 wz0Var = d.b;
                        int emojiOnlyCount2 = wz0Var != null ? wz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) zz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) zz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) zz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        e01 e01Var = this;
        e01Var.c();
        uz0 uz0Var = e01Var.d;
        uz0 uz0Var2 = e01Var.c;
        if (uz0Var2 != null && uz0Var != null) {
            uz0Var2.l();
            uz0Var.l();
        }
        e01Var.b = 0;
        int childCount = e01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            e01Var.b = Math.max(e01Var.b, e01Var.d(i16).a.b.b.b);
        }
        e01Var.i(i10, true);
        if (e01Var.e == 0) {
            i12 = uz0Var2.i(i10);
            if (e01Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                uz0Var2.v.a = i12;
                uz0Var2.w.a = -i12;
                uz0Var2.q = false;
                uz0Var2.g();
            }
            e01Var.i(i10, false);
            i13 = uz0Var.i(i11);
        } else {
            int i17 = uz0Var.i(i11);
            e01Var.i(i10, false);
            i12 = uz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, e01Var.getSuggestedMinimumHeight());
        e01Var.setMeasuredDimension(i12, max);
        uz0Var2.v.a = i12;
        uz0Var2.w.a = -i12;
        uz0Var2.q = false;
        uz0Var2.g();
        uz0Var.v.a = max;
        uz0Var.w.a = -max;
        uz0Var.q = false;
        uz0Var.g();
        int[] g10 = uz0Var2.g();
        int[] g11 = uz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = e01Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = e01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            xz0 d = e01Var.d(i20);
            zz0 zz0Var = d.a;
            b01 b01Var = zz0Var.b;
            b01 b01Var2 = zz0Var.a;
            yz0 yz0Var = b01Var.b;
            yz0 yz0Var2 = b01Var2.b;
            int i21 = childCount2;
            int i22 = g10[yz0Var.a];
            int i23 = g11[yz0Var2.a];
            int i24 = g10[yz0Var.b];
            int i25 = g11[yz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            uz0 uz0Var3 = uz0Var;
            int i29 = d.l;
            qz0 a2 = b01.a(b01Var, true);
            qz0 a10 = b01.a(b01Var2, false);
            m.g3 f7 = uz0Var2.f();
            vz0 vz0Var = (vz0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            m.g3 f10 = uz0Var3.f();
            uz0 uz0Var4 = uz0Var2;
            vz0 vz0Var2 = (vz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - vz0Var.d(true));
            int b11 = a10.b(d, i27 - vz0Var2.d(true));
            int e = e01Var.e(d, true, true);
            int e7 = e01Var.e(d, false, true);
            int e10 = e01Var.e(d, true, false);
            int i30 = e + e10;
            int e11 = e7 + e01Var.e(d, false, false);
            int a11 = vz0Var.a(e01Var, d, a2, i28 + i30, true);
            e01Var = this;
            int a12 = vz0Var2.a(e01Var, d, a10, i29 + e11, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e11);
            int i31 = i22 + b10 + a11;
            int i32 = !e01Var.I ? e + i31 : ((i18 - c10) - e10) - i31;
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
                    yz0 yz0Var3 = d.a.a.b;
                    if (yz0Var3.b - yz0Var3.a <= 1) {
                        ArrayList arrayList2 = e01Var.K;
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
            uz0Var = uz0Var3;
            childCount2 = i21;
            uz0Var2 = uz0Var4;
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            xz0 xz0Var = (xz0) arrayList.get(i36);
            int i37 = xz0Var.l;
            int i38 = xz0Var.d;
            int i39 = i37 - xz0Var.m;
            ArrayList arrayList3 = e01Var.P;
            int size3 = arrayList3.size();
            for (int i40 = i38 + 1; i40 < size3; i40++) {
                xz0 xz0Var2 = (xz0) arrayList3.get(i40);
                if (xz0Var.a.a.b.a != xz0Var2.a.a.b.a) {
                    break;
                }
                int i41 = xz0Var.m;
                int i42 = xz0Var2.m;
                if (i41 < i42) {
                    z10 = true;
                    break;
                }
                int i43 = xz0Var2.l - i42;
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
                    xz0 xz0Var3 = (xz0) arrayList3.get(i44);
                    if (xz0Var.a.a.b.a != xz0Var3.a.a.b.a) {
                        break;
                    }
                    int i45 = xz0Var.m;
                    int i46 = xz0Var3.m;
                    if (i45 < i46) {
                        z10 = true;
                        break;
                    }
                    int i47 = xz0Var3.l - i46;
                    if (i47 > 0) {
                        i39 = Math.min(i39, i47);
                    }
                    i44--;
                }
            }
            if (!z10) {
                xz0Var.l = xz0Var.m;
                xz0Var.g();
                max -= i39;
                int i48 = xz0Var.a.a.b.a;
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
                    xz0 xz0Var4 = (xz0) arrayList3.get(i51);
                    if (xz0Var == xz0Var4) {
                        i14 = i51;
                    } else {
                        int i52 = xz0Var.a.a.b.a;
                        int i53 = xz0Var4.a.a.b.a;
                        if (i52 == i53) {
                            if (xz0Var4.m != xz0Var4.l) {
                                arrayList.remove(xz0Var4);
                                if (xz0Var4.d < i38) {
                                    i50--;
                                }
                                i49--;
                            }
                            int i54 = xz0Var4.l - i39;
                            xz0Var4.l = i54;
                            i14 = i51;
                            xz0Var4.d(xz0Var4.k, i54, true);
                        } else {
                            i14 = i51;
                            if (i52 < i53) {
                                xz0Var4.q -= i39;
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
        int childCount3 = e01Var.getChildCount();
        for (int i55 = 0; i55 < childCount3; i55++) {
            xz0 d10 = e01Var.d(i55);
            e01Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        e01Var.y = i18;
        e01Var.E = max;
        e01Var.F = copyOf;
        e01Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        uz0 uz0Var;
        super.requestLayout();
        uz0 uz0Var2 = this.c;
        if (uz0Var2 == null || (uz0Var = this.d) == null) {
            return;
        }
        uz0Var2.l();
        uz0Var.l();
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
        uz0 uz0Var = this.c;
        uz0Var.u = z10;
        uz0Var.k();
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
            xz0 d = d(i12);
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
                xz0 d10 = d(i18);
                wz0 wz0Var = d10.b;
                int emojiOnlyCount = wz0Var != null ? wz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    yz0 yz0Var = d10.a.a.b;
                    int max = Math.max(0, yz0Var.a);
                    int min = Math.min(i15, yz0Var.b);
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
                xz0 d11 = d(i25);
                yz0 yz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, yz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, yz0Var2.b));
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
        uz0 uz0Var = this.d;
        uz0Var.u = z10;
        uz0Var.k();
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
