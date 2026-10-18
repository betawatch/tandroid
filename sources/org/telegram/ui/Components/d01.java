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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class d01 extends View {
    public static final pz0 R = new pz0(0);
    public static final pz0 S = new pz0(1);
    public static final pz0 T = new pz0(3);
    public static final pz0 U = new pz0(4);
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
    public final c01 O;
    public final ArrayList P;
    public final b01 Q;
    public final org.telegram.ui.Cells.n9 a;
    public int b;
    public final tz0 c;
    public final tz0 d;
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

    public d01(Context context, c01 c01Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.c = new tz0(this, true);
        this.d = new tz0(this, false);
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
        this.O = c01Var;
        b01 b01Var = new b01(this, this);
        this.Q = b01Var;
        r0.i0.j(this, b01Var);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(r4.c.u(str, ". "));
    }

    public static void j(yz0 yz0Var, int i10, int i11, int i12, int i13) {
        xz0 xz0Var = new xz0(i10, i11 + i10);
        a01 a01Var = yz0Var.a;
        yz0Var.a = new a01(a01Var.a, xz0Var, a01Var.c, a01Var.d);
        xz0 xz0Var2 = new xz0(i12, i13 + i12);
        a01 a01Var2 = yz0Var.b;
        yz0Var.b = new a01(a01Var2.a, xz0Var2, a01Var2.c, a01Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        wz0 wz0Var = new wz0(this, arrayList.size());
        yz0 yz0Var = new yz0();
        xz0 xz0Var = new xz0(i11, i13 + i11);
        pz0 pz0Var = U;
        yz0Var.a = new a01(false, xz0Var, pz0Var, 0.0f);
        yz0Var.b = new a01(false, new xz0(i10, i12 + i10), pz0Var, 0.0f);
        wz0Var.a = yz0Var;
        wz0Var.j = i11;
        arrayList.add(wz0Var);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        wz0 wz0Var = new wz0(this, arrayList.size());
        wz0Var.c = pagetablecell;
        yz0 yz0Var = new yz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        xz0 xz0Var = new xz0(i11, i13 + i11);
        pz0 pz0Var = U;
        yz0Var.a = new a01(false, xz0Var, pz0Var, 0.0f);
        yz0Var.b = new a01(false, new xz0(i10, i12 + i10), pz0Var, 1.0f);
        wz0Var.a = yz0Var;
        wz0Var.j = i11;
        arrayList.add(wz0Var);
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
            yz0 yz0Var = d(i16).a;
            a01 a01Var = z10 ? yz0Var.a : yz0Var.b;
            xz0 xz0Var = a01Var.b;
            boolean z11 = a01Var.a;
            int a2 = xz0Var.a();
            if (a2 <= 0 || a2 > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z11) {
                i14 = xz0Var.a;
            }
            a01 a01Var2 = z10 ? yz0Var.b : yz0Var.a;
            xz0 xz0Var2 = a01Var2.b;
            int a10 = xz0Var2.a();
            int i17 = xz0Var2.a;
            if (a10 > 0) {
                th2 = null;
                if (xz0Var2.a() <= 1024) {
                    boolean z12 = a01Var2.a;
                    int a11 = xz0Var2.a();
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
                        j(yz0Var, i14, a2, i15, a11);
                    } else {
                        j(yz0Var, i15, a11, i14, a2);
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

    public final wz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (wz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        b01 b01Var = this.Q;
        if (b01Var == null || !b01Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(wz0 wz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(wz0Var, z10, z11);
        }
        tz0 tz0Var = z10 ? this.c : this.d;
        if (z11) {
            if (tz0Var.j == null) {
                tz0Var.j = new int[tz0Var.e() + 1];
            }
            if (!tz0Var.k) {
                tz0Var.b(true);
                tz0Var.k = true;
            }
            iArr = tz0Var.j;
        } else {
            if (tz0Var.l == null) {
                tz0Var.l = new int[tz0Var.e() + 1];
            }
            if (!tz0Var.m) {
                tz0Var.b(false);
                tz0Var.m = true;
            }
            iArr = tz0Var.l;
        }
        yz0 yz0Var = wz0Var.a;
        xz0 xz0Var = (z10 ? yz0Var.b : yz0Var.a).b;
        return iArr[z11 ? xz0Var.a : xz0Var.b];
    }

    public final int f(wz0 wz0Var, boolean z10, boolean z11) {
        yz0 yz0Var = wz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) yz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) yz0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) yz0Var).topMargin : ((ViewGroup.MarginLayoutParams) yz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        a01 a01Var = z10 ? yz0Var.b : yz0Var.a;
        tz0 tz0Var = z10 ? this.c : this.d;
        xz0 xz0Var = a01Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = xz0Var.a;
            return 0;
        }
        int i12 = xz0Var.b;
        tz0Var.e();
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
        tz0 tz0Var = this.c;
        tz0Var.k();
        tz0 tz0Var2 = this.d;
        tz0Var2.k();
        if (tz0Var == null || tz0Var2 == null) {
            return;
        }
        tz0Var.l();
        tz0Var2.l();
    }

    public final void i(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            wz0 d = d(i11);
            yz0 yz0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) yz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) yz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) yz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) yz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) yz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) yz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) yz0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                a01 a01Var = z11 ? yz0Var.b : yz0Var.a;
                if (a01.a(a01Var, z11) == U) {
                    xz0 xz0Var = a01Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e = (g10[xz0Var.b] - g10[xz0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        vz0 vz0Var = d.b;
                        int emojiOnlyCount2 = vz0Var != null ? vz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) yz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) yz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) yz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        d01 d01Var = this;
        d01Var.c();
        tz0 tz0Var = d01Var.d;
        tz0 tz0Var2 = d01Var.c;
        if (tz0Var2 != null && tz0Var != null) {
            tz0Var2.l();
            tz0Var.l();
        }
        d01Var.b = 0;
        int childCount = d01Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            d01Var.b = Math.max(d01Var.b, d01Var.d(i16).a.b.b.b);
        }
        d01Var.i(i10, true);
        if (d01Var.e == 0) {
            i12 = tz0Var2.i(i10);
            if (d01Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                tz0Var2.v.a = i12;
                tz0Var2.w.a = -i12;
                tz0Var2.q = false;
                tz0Var2.g();
            }
            d01Var.i(i10, false);
            i13 = tz0Var.i(i11);
        } else {
            int i17 = tz0Var.i(i11);
            d01Var.i(i10, false);
            i12 = tz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, d01Var.getSuggestedMinimumHeight());
        d01Var.setMeasuredDimension(i12, max);
        tz0Var2.v.a = i12;
        tz0Var2.w.a = -i12;
        tz0Var2.q = false;
        tz0Var2.g();
        tz0Var.v.a = max;
        tz0Var.w.a = -max;
        tz0Var.q = false;
        tz0Var.g();
        int[] g10 = tz0Var2.g();
        int[] g11 = tz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = d01Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = d01Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            wz0 d = d01Var.d(i20);
            yz0 yz0Var = d.a;
            a01 a01Var = yz0Var.b;
            a01 a01Var2 = yz0Var.a;
            xz0 xz0Var = a01Var.b;
            xz0 xz0Var2 = a01Var2.b;
            int i21 = childCount2;
            int i22 = g10[xz0Var.a];
            int i23 = g11[xz0Var2.a];
            int i24 = g10[xz0Var.b];
            int i25 = g11[xz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            tz0 tz0Var3 = tz0Var;
            int i29 = d.l;
            pz0 a2 = a01.a(a01Var, true);
            pz0 a10 = a01.a(a01Var2, false);
            m.g3 f7 = tz0Var2.f();
            uz0 uz0Var = (uz0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            m.g3 f10 = tz0Var3.f();
            tz0 tz0Var4 = tz0Var2;
            uz0 uz0Var2 = (uz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - uz0Var.d(true));
            int b11 = a10.b(d, i27 - uz0Var2.d(true));
            int e = d01Var.e(d, true, true);
            int e7 = d01Var.e(d, false, true);
            int e10 = d01Var.e(d, true, false);
            int i30 = e + e10;
            int e11 = e7 + d01Var.e(d, false, false);
            int a11 = uz0Var.a(d01Var, d, a2, i28 + i30, true);
            d01Var = this;
            int a12 = uz0Var2.a(d01Var, d, a10, i29 + e11, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e11);
            int i31 = i22 + b10 + a11;
            int i32 = !d01Var.I ? e + i31 : ((i18 - c10) - e10) - i31;
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
                    xz0 xz0Var3 = d.a.a.b;
                    if (xz0Var3.b - xz0Var3.a <= 1) {
                        ArrayList arrayList2 = d01Var.K;
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
            tz0Var = tz0Var3;
            childCount2 = i21;
            tz0Var2 = tz0Var4;
        }
        int size2 = arrayList.size();
        int i36 = 0;
        while (i36 < size2) {
            wz0 wz0Var = (wz0) arrayList.get(i36);
            int i37 = wz0Var.l;
            int i38 = wz0Var.d;
            int i39 = i37 - wz0Var.m;
            ArrayList arrayList3 = d01Var.P;
            int size3 = arrayList3.size();
            for (int i40 = i38 + 1; i40 < size3; i40++) {
                wz0 wz0Var2 = (wz0) arrayList3.get(i40);
                if (wz0Var.a.a.b.a != wz0Var2.a.a.b.a) {
                    break;
                }
                int i41 = wz0Var.m;
                int i42 = wz0Var2.m;
                if (i41 < i42) {
                    z10 = true;
                    break;
                }
                int i43 = wz0Var2.l - i42;
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
                    wz0 wz0Var3 = (wz0) arrayList3.get(i44);
                    if (wz0Var.a.a.b.a != wz0Var3.a.a.b.a) {
                        break;
                    }
                    int i45 = wz0Var.m;
                    int i46 = wz0Var3.m;
                    if (i45 < i46) {
                        z10 = true;
                        break;
                    }
                    int i47 = wz0Var3.l - i46;
                    if (i47 > 0) {
                        i39 = Math.min(i39, i47);
                    }
                    i44--;
                }
            }
            if (!z10) {
                wz0Var.l = wz0Var.m;
                wz0Var.g();
                max -= i39;
                int i48 = wz0Var.a.a.b.a;
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
                    wz0 wz0Var4 = (wz0) arrayList3.get(i51);
                    if (wz0Var == wz0Var4) {
                        i14 = i51;
                    } else {
                        int i52 = wz0Var.a.a.b.a;
                        int i53 = wz0Var4.a.a.b.a;
                        if (i52 == i53) {
                            if (wz0Var4.m != wz0Var4.l) {
                                arrayList.remove(wz0Var4);
                                if (wz0Var4.d < i38) {
                                    i50--;
                                }
                                i49--;
                            }
                            int i54 = wz0Var4.l - i39;
                            wz0Var4.l = i54;
                            i14 = i51;
                            wz0Var4.d(wz0Var4.k, i54, true);
                        } else {
                            i14 = i51;
                            if (i52 < i53) {
                                wz0Var4.q -= i39;
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
        int childCount3 = d01Var.getChildCount();
        for (int i55 = 0; i55 < childCount3; i55++) {
            wz0 d10 = d01Var.d(i55);
            d01Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        d01Var.y = i18;
        d01Var.E = max;
        d01Var.F = copyOf;
        d01Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        tz0 tz0Var;
        super.requestLayout();
        tz0 tz0Var2 = this.c;
        if (tz0Var2 == null || (tz0Var = this.d) == null) {
            return;
        }
        tz0Var2.l();
        tz0Var.l();
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
        tz0 tz0Var = this.c;
        tz0Var.u = z10;
        tz0Var.k();
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
            wz0 d = d(i12);
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
                wz0 d10 = d(i18);
                vz0 vz0Var = d10.b;
                int emojiOnlyCount = vz0Var != null ? vz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    xz0 xz0Var = d10.a.a.b;
                    int max = Math.max(0, xz0Var.a);
                    int min = Math.min(i15, xz0Var.b);
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
                wz0 d11 = d(i25);
                xz0 xz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, xz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, xz0Var2.b));
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
        tz0 tz0Var = this.d;
        tz0Var.u = z10;
        tz0Var.k();
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
