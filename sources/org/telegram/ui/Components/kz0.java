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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kz0 extends View {
    public static final wy0 R = new wy0(0);
    public static final wy0 S = new wy0(1);
    public static final wy0 T = new wy0(3);
    public static final wy0 U = new wy0(4);
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
    public final jz0 O;
    public final ArrayList P;
    public final iz0 Q;
    public final org.telegram.ui.Cells.q9 a;
    public int b;
    public final az0 c;
    public final az0 d;
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

    public kz0(Context context, jz0 jz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.c = new az0(this, true);
        this.d = new az0(this, false);
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
        this.O = jz0Var;
        iz0 iz0Var = new iz0(this, this);
        this.Q = iz0Var;
        r0.i0.k(this, iz0Var);
    }

    public static void i(fz0 fz0Var, int i10, int i11, int i12, int i13) {
        ez0 ez0Var = new ez0(i10, i11 + i10);
        hz0 hz0Var = fz0Var.a;
        fz0Var.a = new hz0(hz0Var.a, ez0Var, hz0Var.c, hz0Var.d);
        ez0 ez0Var2 = new ez0(i12, i13 + i12);
        hz0 hz0Var2 = fz0Var.b;
        fz0Var.b = new hz0(hz0Var2.a, ez0Var2, hz0Var2.c, hz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        dz0 dz0Var = new dz0(this, arrayList.size());
        fz0 fz0Var = new fz0();
        ez0 ez0Var = new ez0(i11, i13 + i11);
        wy0 wy0Var = U;
        fz0Var.a = new hz0(false, ez0Var, wy0Var, 0.0f);
        fz0Var.b = new hz0(false, new ez0(i10, i12 + i10), wy0Var, 0.0f);
        dz0Var.a = fz0Var;
        dz0Var.j = i11;
        arrayList.add(dz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        dz0 dz0Var = new dz0(this, arrayList.size());
        dz0Var.c = pagetablecell;
        fz0 fz0Var = new fz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        ez0 ez0Var = new ez0(i11, i13 + i11);
        wy0 wy0Var = U;
        fz0Var.a = new hz0(false, ez0Var, wy0Var, 0.0f);
        fz0Var.b = new hz0(false, new ez0(i10, i12 + i10), wy0Var, 1.0f);
        dz0Var.a = fz0Var;
        dz0Var.j = i11;
        arrayList.add(dz0Var);
        if (pagetablecell.rowspan > 1) {
            this.K.add(new PointF(i11, i11 + r10));
        }
        g();
    }

    public final void c() {
        int i10 = this.n;
        int i11 = 1;
        if (i10 != 0) {
            int childCount = getChildCount();
            int i12 = 1;
            for (int i13 = 0; i13 < childCount; i13++) {
                i12 = (i12 * 31) + d(i13).a.hashCode();
            }
            if (i10 != i12) {
                g();
                c();
                return;
            }
            return;
        }
        boolean z10 = this.e == 0;
        int i14 = (z10 ? this.c : this.d).b;
        if (i14 == Integer.MIN_VALUE) {
            i14 = 0;
        }
        int[] iArr = new int[i14];
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount2; i17++) {
            fz0 fz0Var = d(i17).a;
            hz0 hz0Var = z10 ? fz0Var.a : fz0Var.b;
            ez0 ez0Var = hz0Var.b;
            boolean z11 = hz0Var.a;
            int i18 = ez0Var.b;
            int i19 = ez0Var.a;
            int i20 = i18 - i19;
            if (z11) {
                i15 = i19;
            }
            hz0 hz0Var2 = z10 ? fz0Var.b : fz0Var.a;
            ez0 ez0Var2 = hz0Var2.b;
            boolean z12 = hz0Var2.a;
            int i21 = ez0Var2.b;
            int i22 = ez0Var2.a;
            int i23 = i21 - i22;
            if (i14 != 0) {
                i23 = Math.min(i23, i14 - (z12 ? Math.min(i22, i14) : 0));
            }
            if (z12) {
                i16 = i22;
            }
            if (i14 != 0) {
                if (!z11 || !z12) {
                    while (true) {
                        int i24 = i16 + i23;
                        if (i24 <= i14) {
                            for (int i25 = i16; i25 < i24; i25++) {
                                if (iArr[i25] <= i15) {
                                }
                            }
                            break;
                        }
                        if (z12) {
                            i15++;
                        } else if (i24 <= i14) {
                            i16++;
                        } else {
                            i15++;
                            i16 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i16, i14), Math.min(i16 + i23, i14), i15 + i20);
            }
            if (z10) {
                i(fz0Var, i15, i20, i16, i23);
            } else {
                i(fz0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final dz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (dz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        iz0 iz0Var = this.Q;
        if (iz0Var == null || !iz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(dz0 dz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(dz0Var, z10, z11);
        }
        az0 az0Var = z10 ? this.c : this.d;
        if (z11) {
            if (az0Var.j == null) {
                az0Var.j = new int[az0Var.e() + 1];
            }
            if (!az0Var.k) {
                az0Var.b(true);
                az0Var.k = true;
            }
            iArr = az0Var.j;
        } else {
            if (az0Var.l == null) {
                az0Var.l = new int[az0Var.e() + 1];
            }
            if (!az0Var.m) {
                az0Var.b(false);
                az0Var.m = true;
            }
            iArr = az0Var.l;
        }
        fz0 fz0Var = dz0Var.a;
        ez0 ez0Var = (z10 ? fz0Var.b : fz0Var.a).b;
        return iArr[z11 ? ez0Var.a : ez0Var.b];
    }

    public final int f(dz0 dz0Var, boolean z10, boolean z11) {
        fz0 fz0Var = dz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) fz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) fz0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) fz0Var).topMargin : ((ViewGroup.MarginLayoutParams) fz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        hz0 hz0Var = z10 ? fz0Var.b : fz0Var.a;
        az0 az0Var = z10 ? this.c : this.d;
        ez0 ez0Var = hz0Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = ez0Var.a;
            return 0;
        }
        int i12 = ez0Var.b;
        az0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        az0 az0Var = this.c;
        az0Var.k();
        az0 az0Var2 = this.d;
        az0Var2.k();
        if (az0Var == null || az0Var2 == null) {
            return;
        }
        az0Var.l();
        az0Var2.l();
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

    public final void h(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            dz0 d = d(i11);
            fz0 fz0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) fz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) fz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) fz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) fz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) fz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) fz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) fz0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                hz0 hz0Var = z11 ? fz0Var.b : fz0Var.a;
                if (hz0.a(hz0Var, z11) == U) {
                    ez0 ez0Var = hz0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e = (g10[ez0Var.b] - g10[ez0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        cz0 cz0Var = d.b;
                        int emojiOnlyCount2 = cz0Var != null ? cz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) fz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) fz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) fz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        kz0 kz0Var = this;
        kz0Var.c();
        az0 az0Var = kz0Var.d;
        az0 az0Var2 = kz0Var.c;
        if (az0Var2 != null && az0Var != null) {
            az0Var2.l();
            az0Var.l();
        }
        kz0Var.b = 0;
        int childCount = kz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            kz0Var.b = Math.max(kz0Var.b, kz0Var.d(i16).a.b.b.b);
        }
        kz0Var.h(i10, true);
        if (kz0Var.e == 0) {
            i12 = az0Var2.i(i10);
            if (kz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                az0Var2.v.a = i12;
                az0Var2.w.a = -i12;
                az0Var2.q = false;
                az0Var2.g();
            }
            kz0Var.h(i10, false);
            i13 = az0Var.i(i11);
        } else {
            int i17 = az0Var.i(i11);
            kz0Var.h(i10, false);
            i12 = az0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, kz0Var.getSuggestedMinimumHeight());
        kz0Var.setMeasuredDimension(i12, max);
        az0Var2.v.a = i12;
        az0Var2.w.a = -i12;
        az0Var2.q = false;
        az0Var2.g();
        az0Var.v.a = max;
        az0Var.w.a = -max;
        az0Var.q = false;
        az0Var.g();
        int[] g10 = az0Var2.g();
        int[] g11 = az0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = kz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = kz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            dz0 d = kz0Var.d(i20);
            fz0 fz0Var = d.a;
            hz0 hz0Var = fz0Var.b;
            hz0 hz0Var2 = fz0Var.a;
            ez0 ez0Var = hz0Var.b;
            ez0 ez0Var2 = hz0Var2.b;
            int i21 = childCount2;
            int i22 = g10[ez0Var.a];
            int i23 = g11[ez0Var2.a];
            int i24 = g10[ez0Var.b];
            int i25 = g11[ez0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            az0 az0Var3 = az0Var;
            int i29 = d.l;
            wy0 a2 = hz0.a(hz0Var, true);
            wy0 a10 = hz0.a(hz0Var2, false);
            lf.i f7 = az0Var2.f();
            bz0 bz0Var = (bz0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            lf.i f10 = az0Var3.f();
            az0 az0Var4 = az0Var2;
            bz0 bz0Var2 = (bz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - bz0Var.d(true));
            int b11 = a10.b(d, i27 - bz0Var2.d(true));
            int e = kz0Var.e(d, true, true);
            int e7 = kz0Var.e(d, false, true);
            int e10 = kz0Var.e(d, true, false);
            int i30 = e + e10;
            int e11 = e7 + kz0Var.e(d, false, false);
            int a11 = bz0Var.a(kz0Var, d, a2, i28 + i30, true);
            kz0Var = this;
            int a12 = bz0Var2.a(kz0Var, d, a10, i29 + e11, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e11);
            int i31 = i22 + b10 + a11;
            int i32 = !kz0Var.I ? e + i31 : ((i18 - c10) - e10) - i31;
            int i33 = i23 + b11 + a12 + e7;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    ez0 ez0Var3 = d.a.a.b;
                    if (ez0Var3.b - ez0Var3.a <= 1) {
                        ArrayList arrayList2 = kz0Var.K;
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
            az0Var = az0Var3;
            childCount2 = i21;
            az0Var2 = az0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            dz0 dz0Var = (dz0) arrayList.get(i35);
            int i36 = dz0Var.l;
            int i37 = dz0Var.d;
            int i38 = i36 - dz0Var.m;
            ArrayList arrayList3 = kz0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                dz0 dz0Var2 = (dz0) arrayList3.get(i39);
                if (dz0Var.a.a.b.a != dz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = dz0Var.m;
                int i41 = dz0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = dz0Var2.l - i41;
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
                    dz0 dz0Var3 = (dz0) arrayList3.get(i43);
                    if (dz0Var.a.a.b.a != dz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = dz0Var.m;
                    int i45 = dz0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = dz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                dz0Var.l = dz0Var.m;
                dz0Var.g();
                max -= i38;
                int i47 = dz0Var.a.a.b.a;
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
                    dz0 dz0Var4 = (dz0) arrayList3.get(i50);
                    if (dz0Var == dz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = dz0Var.a.a.b.a;
                        int i52 = dz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (dz0Var4.m != dz0Var4.l) {
                                arrayList.remove(dz0Var4);
                                if (dz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = dz0Var4.l - i38;
                            dz0Var4.l = i53;
                            i14 = i50;
                            dz0Var4.d(dz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                dz0Var4.q -= i38;
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
        int childCount3 = kz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            dz0 d10 = kz0Var.d(i54);
            kz0Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        kz0Var.y = i18;
        kz0Var.E = max;
        kz0Var.F = copyOf;
        kz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        az0 az0Var;
        super.requestLayout();
        az0 az0Var2 = this.c;
        if (az0Var2 == null || (az0Var = this.d) == null) {
            return;
        }
        az0Var2.l();
        az0Var.l();
    }

    public void setAlignmentMode(int i10) {
        this.h = i10;
        requestLayout();
    }

    public void setColumnCount(int i10) {
        this.c.n(i10);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        az0 az0Var = this.c;
        az0Var.u = z10;
        az0Var.k();
        g();
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
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i10) {
        int i11;
        int measuredWidth = getMeasuredWidth();
        this.y = Math.max(measuredWidth, i10);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            dz0 d = d(i12);
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
                dz0 d10 = d(i18);
                cz0 cz0Var = d10.b;
                int emojiOnlyCount = cz0Var != null ? cz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    ez0 ez0Var = d10.a.a.b;
                    int max = Math.max(0, ez0Var.a);
                    int min = Math.min(i15, ez0Var.b);
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
                dz0 d11 = d(i25);
                ez0 ez0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, ez0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, ez0Var2.b));
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
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        az0 az0Var = this.d;
        az0Var.u = z10;
        az0Var.k();
        g();
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
