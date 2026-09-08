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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class jz0 extends View {
    public static final vy0 R = new vy0(0);
    public static final vy0 S = new vy0(1);
    public static final vy0 T = new vy0(3);
    public static final vy0 U = new vy0(4);
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
    public final iz0 O;
    public final ArrayList P;
    public final hz0 Q;
    public final org.telegram.ui.Cells.q9 a;
    public int b;
    public final zy0 c;
    public final zy0 d;
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

    public jz0(Context context, iz0 iz0Var, org.telegram.ui.Cells.q9 q9Var) {
        super(context);
        this.c = new zy0(this, true);
        this.d = new zy0(this, false);
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
        this.O = iz0Var;
        hz0 hz0Var = new hz0(this, this);
        this.Q = hz0Var;
        r0.i0.k(this, hz0Var);
    }

    public static void i(ez0 ez0Var, int i10, int i11, int i12, int i13) {
        dz0 dz0Var = new dz0(i10, i11 + i10);
        gz0 gz0Var = ez0Var.a;
        ez0Var.a = new gz0(gz0Var.a, dz0Var, gz0Var.c, gz0Var.d);
        dz0 dz0Var2 = new dz0(i12, i13 + i12);
        gz0 gz0Var2 = ez0Var.b;
        ez0Var.b = new gz0(gz0Var2.a, dz0Var2, gz0Var2.c, gz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        cz0 cz0Var = new cz0(this, arrayList.size());
        ez0 ez0Var = new ez0();
        dz0 dz0Var = new dz0(i11, i13 + i11);
        vy0 vy0Var = U;
        ez0Var.a = new gz0(false, dz0Var, vy0Var, 0.0f);
        ez0Var.b = new gz0(false, new dz0(i10, i12 + i10), vy0Var, 0.0f);
        cz0Var.a = ez0Var;
        cz0Var.j = i11;
        arrayList.add(cz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        cz0 cz0Var = new cz0(this, arrayList.size());
        cz0Var.c = pagetablecell;
        ez0 ez0Var = new ez0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        dz0 dz0Var = new dz0(i11, i13 + i11);
        vy0 vy0Var = U;
        ez0Var.a = new gz0(false, dz0Var, vy0Var, 0.0f);
        ez0Var.b = new gz0(false, new dz0(i10, i12 + i10), vy0Var, 1.0f);
        cz0Var.a = ez0Var;
        cz0Var.j = i11;
        arrayList.add(cz0Var);
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
            ez0 ez0Var = d(i17).a;
            gz0 gz0Var = z10 ? ez0Var.a : ez0Var.b;
            dz0 dz0Var = gz0Var.b;
            boolean z11 = gz0Var.a;
            int i18 = dz0Var.b;
            int i19 = dz0Var.a;
            int i20 = i18 - i19;
            if (z11) {
                i15 = i19;
            }
            gz0 gz0Var2 = z10 ? ez0Var.b : ez0Var.a;
            dz0 dz0Var2 = gz0Var2.b;
            boolean z12 = gz0Var2.a;
            int i21 = dz0Var2.b;
            int i22 = dz0Var2.a;
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
                i(ez0Var, i15, i20, i16, i23);
            } else {
                i(ez0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final cz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (cz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        hz0 hz0Var = this.Q;
        if (hz0Var == null || !hz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(cz0 cz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(cz0Var, z10, z11);
        }
        zy0 zy0Var = z10 ? this.c : this.d;
        if (z11) {
            if (zy0Var.j == null) {
                zy0Var.j = new int[zy0Var.e() + 1];
            }
            if (!zy0Var.k) {
                zy0Var.b(true);
                zy0Var.k = true;
            }
            iArr = zy0Var.j;
        } else {
            if (zy0Var.l == null) {
                zy0Var.l = new int[zy0Var.e() + 1];
            }
            if (!zy0Var.m) {
                zy0Var.b(false);
                zy0Var.m = true;
            }
            iArr = zy0Var.l;
        }
        ez0 ez0Var = cz0Var.a;
        dz0 dz0Var = (z10 ? ez0Var.b : ez0Var.a).b;
        return iArr[z11 ? dz0Var.a : dz0Var.b];
    }

    public final int f(cz0 cz0Var, boolean z10, boolean z11) {
        ez0 ez0Var = cz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) ez0Var).leftMargin : ((ViewGroup.MarginLayoutParams) ez0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) ez0Var).topMargin : ((ViewGroup.MarginLayoutParams) ez0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        gz0 gz0Var = z10 ? ez0Var.b : ez0Var.a;
        zy0 zy0Var = z10 ? this.c : this.d;
        dz0 dz0Var = gz0Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = dz0Var.a;
            return 0;
        }
        int i12 = dz0Var.b;
        zy0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        zy0 zy0Var = this.c;
        zy0Var.k();
        zy0 zy0Var2 = this.d;
        zy0Var2.k();
        if (zy0Var == null || zy0Var2 == null) {
            return;
        }
        zy0Var.l();
        zy0Var2.l();
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
            cz0 d = d(i11);
            ez0 ez0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) ez0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) ez0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) ez0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) ez0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) ez0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ez0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ez0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                gz0 gz0Var = z11 ? ez0Var.b : ez0Var.a;
                if (gz0.a(gz0Var, z11) == U) {
                    dz0 dz0Var = gz0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e7 = (g10[dz0Var.b] - g10[dz0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        bz0 bz0Var = d.b;
                        int emojiOnlyCount2 = bz0Var != null ? bz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e7 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) ez0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e7, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) ez0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) ez0Var).width, e(d, false, false) + e(d, false, true) + e7, false);
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
        jz0 jz0Var = this;
        jz0Var.c();
        zy0 zy0Var = jz0Var.d;
        zy0 zy0Var2 = jz0Var.c;
        if (zy0Var2 != null && zy0Var != null) {
            zy0Var2.l();
            zy0Var.l();
        }
        jz0Var.b = 0;
        int childCount = jz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            jz0Var.b = Math.max(jz0Var.b, jz0Var.d(i16).a.b.b.b);
        }
        jz0Var.h(i10, true);
        if (jz0Var.e == 0) {
            i12 = zy0Var2.i(i10);
            if (jz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                zy0Var2.v.a = i12;
                zy0Var2.w.a = -i12;
                zy0Var2.q = false;
                zy0Var2.g();
            }
            jz0Var.h(i10, false);
            i13 = zy0Var.i(i11);
        } else {
            int i17 = zy0Var.i(i11);
            jz0Var.h(i10, false);
            i12 = zy0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, jz0Var.getSuggestedMinimumHeight());
        jz0Var.setMeasuredDimension(i12, max);
        zy0Var2.v.a = i12;
        zy0Var2.w.a = -i12;
        zy0Var2.q = false;
        zy0Var2.g();
        zy0Var.v.a = max;
        zy0Var.w.a = -max;
        zy0Var.q = false;
        zy0Var.g();
        int[] g10 = zy0Var2.g();
        int[] g11 = zy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = jz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = jz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            cz0 d = jz0Var.d(i20);
            ez0 ez0Var = d.a;
            gz0 gz0Var = ez0Var.b;
            gz0 gz0Var2 = ez0Var.a;
            dz0 dz0Var = gz0Var.b;
            dz0 dz0Var2 = gz0Var2.b;
            int i21 = childCount2;
            int i22 = g10[dz0Var.a];
            int i23 = g11[dz0Var2.a];
            int i24 = g10[dz0Var.b];
            int i25 = g11[dz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            zy0 zy0Var3 = zy0Var;
            int i29 = d.l;
            vy0 a2 = gz0.a(gz0Var, true);
            vy0 a10 = gz0.a(gz0Var2, false);
            m2.t f7 = zy0Var2.f();
            az0 az0Var = (az0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            m2.t f10 = zy0Var3.f();
            zy0 zy0Var4 = zy0Var2;
            az0 az0Var2 = (az0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - az0Var.d(true));
            int b11 = a10.b(d, i27 - az0Var2.d(true));
            int e7 = jz0Var.e(d, true, true);
            int e10 = jz0Var.e(d, false, true);
            int e11 = jz0Var.e(d, true, false);
            int i30 = e7 + e11;
            int e12 = e10 + jz0Var.e(d, false, false);
            int a11 = az0Var.a(jz0Var, d, a2, i28 + i30, true);
            jz0Var = this;
            int a12 = az0Var2.a(jz0Var, d, a10, i29 + e12, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e12);
            int i31 = i22 + b10 + a11;
            int i32 = !jz0Var.I ? e7 + i31 : ((i18 - c10) - e11) - i31;
            int i33 = i23 + b11 + a12 + e10;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    dz0 dz0Var3 = d.a.a.b;
                    if (dz0Var3.b - dz0Var3.a <= 1) {
                        ArrayList arrayList2 = jz0Var.K;
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
            zy0Var = zy0Var3;
            childCount2 = i21;
            zy0Var2 = zy0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            cz0 cz0Var = (cz0) arrayList.get(i35);
            int i36 = cz0Var.l;
            int i37 = cz0Var.d;
            int i38 = i36 - cz0Var.m;
            ArrayList arrayList3 = jz0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                cz0 cz0Var2 = (cz0) arrayList3.get(i39);
                if (cz0Var.a.a.b.a != cz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = cz0Var.m;
                int i41 = cz0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = cz0Var2.l - i41;
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
                    cz0 cz0Var3 = (cz0) arrayList3.get(i43);
                    if (cz0Var.a.a.b.a != cz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = cz0Var.m;
                    int i45 = cz0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = cz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                cz0Var.l = cz0Var.m;
                cz0Var.g();
                max -= i38;
                int i47 = cz0Var.a.a.b.a;
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
                    cz0 cz0Var4 = (cz0) arrayList3.get(i50);
                    if (cz0Var == cz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = cz0Var.a.a.b.a;
                        int i52 = cz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (cz0Var4.m != cz0Var4.l) {
                                arrayList.remove(cz0Var4);
                                if (cz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = cz0Var4.l - i38;
                            cz0Var4.l = i53;
                            i14 = i50;
                            cz0Var4.d(cz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                cz0Var4.q -= i38;
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
        int childCount3 = jz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            cz0 d10 = jz0Var.d(i54);
            jz0Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        jz0Var.y = i18;
        jz0Var.E = max;
        jz0Var.F = copyOf;
        jz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        zy0 zy0Var;
        super.requestLayout();
        zy0 zy0Var2 = this.c;
        if (zy0Var2 == null || (zy0Var = this.d) == null) {
            return;
        }
        zy0Var2.l();
        zy0Var.l();
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
        zy0 zy0Var = this.c;
        zy0Var.u = z10;
        zy0Var.k();
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
            cz0 d = d(i12);
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
                cz0 d10 = d(i18);
                bz0 bz0Var = d10.b;
                int emojiOnlyCount = bz0Var != null ? bz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    dz0 dz0Var = d10.a.a.b;
                    int max = Math.max(0, dz0Var.a);
                    int min = Math.min(i15, dz0Var.b);
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
                cz0 d11 = d(i25);
                dz0 dz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, dz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, dz0Var2.b));
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
        zy0 zy0Var = this.d;
        zy0Var.u = z10;
        zy0Var.k();
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
