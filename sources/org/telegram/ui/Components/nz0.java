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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nz0 extends View {
    public static final zy0 O = new zy0(0);
    public static final zy0 P = new zy0(1);
    public static final zy0 Q = new zy0(3);
    public static final zy0 R = new zy0(4);
    public int B;
    public int[] C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final Path I;
    public final RectF J;
    public final float[] K;
    public final mz0 L;
    public final ArrayList M;
    public final lz0 N;
    public final org.telegram.ui.Cells.m9 a;
    public int b;
    public final dz0 c;
    public final dz0 d;
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

    public nz0(Context context, mz0 mz0Var, org.telegram.ui.Cells.m9 m9Var) {
        super(context);
        this.c = new dz0(this, true);
        this.d = new dz0(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = AndroidUtilities.dp(8.0f);
        this.s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.x = true;
        this.C = new int[0];
        this.G = new ArrayList();
        this.H = new ArrayList();
        new Path();
        this.I = new Path();
        this.J = new RectF();
        this.K = new float[8];
        this.M = new ArrayList();
        this.a = m9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.L = mz0Var;
        lz0 lz0Var = new lz0(this, this);
        this.N = lz0Var;
        r0.j0.k(this, lz0Var);
    }

    public static void i(iz0 iz0Var, int i10, int i11, int i12, int i13) {
        hz0 hz0Var = new hz0(i10, i11 + i10);
        kz0 kz0Var = iz0Var.a;
        iz0Var.a = new kz0(kz0Var.a, hz0Var, kz0Var.c, kz0Var.d);
        hz0 hz0Var2 = new hz0(i12, i13 + i12);
        kz0 kz0Var2 = iz0Var.b;
        iz0Var.b = new kz0(kz0Var2.a, hz0Var2, kz0Var2.c, kz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.M;
        gz0 gz0Var = new gz0(this, arrayList.size());
        iz0 iz0Var = new iz0();
        hz0 hz0Var = new hz0(i11, i13 + i11);
        zy0 zy0Var = R;
        iz0Var.a = new kz0(false, hz0Var, zy0Var, 0.0f);
        iz0Var.b = new kz0(false, new hz0(i10, i12 + i10), zy0Var, 0.0f);
        gz0Var.a = iz0Var;
        gz0Var.j = i11;
        arrayList.add(gz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.M;
        gz0 gz0Var = new gz0(this, arrayList.size());
        gz0Var.c = pagetablecell;
        iz0 iz0Var = new iz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        hz0 hz0Var = new hz0(i11, i13 + i11);
        zy0 zy0Var = R;
        iz0Var.a = new kz0(false, hz0Var, zy0Var, 0.0f);
        iz0Var.b = new kz0(false, new hz0(i10, i12 + i10), zy0Var, 1.0f);
        gz0Var.a = iz0Var;
        gz0Var.j = i11;
        arrayList.add(gz0Var);
        if (pagetablecell.rowspan > 1) {
            this.H.add(new PointF(i11, i11 + r10));
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
        boolean z4 = this.e == 0;
        int i14 = (z4 ? this.c : this.d).b;
        if (i14 == Integer.MIN_VALUE) {
            i14 = 0;
        }
        int[] iArr = new int[i14];
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount2; i17++) {
            iz0 iz0Var = d(i17).a;
            kz0 kz0Var = z4 ? iz0Var.a : iz0Var.b;
            hz0 hz0Var = kz0Var.b;
            boolean z10 = kz0Var.a;
            int i18 = hz0Var.b;
            int i19 = hz0Var.a;
            int i20 = i18 - i19;
            if (z10) {
                i15 = i19;
            }
            kz0 kz0Var2 = z4 ? iz0Var.b : iz0Var.a;
            hz0 hz0Var2 = kz0Var2.b;
            boolean z11 = kz0Var2.a;
            int i21 = hz0Var2.b;
            int i22 = hz0Var2.a;
            int i23 = i21 - i22;
            if (i14 != 0) {
                i23 = Math.min(i23, i14 - (z11 ? Math.min(i22, i14) : 0));
            }
            if (z11) {
                i16 = i22;
            }
            if (i14 != 0) {
                if (!z10 || !z11) {
                    while (true) {
                        int i24 = i16 + i23;
                        if (i24 <= i14) {
                            for (int i25 = i16; i25 < i24; i25++) {
                                if (iArr[i25] <= i15) {
                                }
                            }
                            break;
                        }
                        if (z11) {
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
            if (z4) {
                i(iz0Var, i15, i20, i16, i23);
            } else {
                i(iz0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final gz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.M;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (gz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        lz0 lz0Var = this.N;
        if (lz0Var == null || !lz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(gz0 gz0Var, boolean z4, boolean z10) {
        int[] iArr;
        if (this.h == 1) {
            return f(gz0Var, z4, z10);
        }
        dz0 dz0Var = z4 ? this.c : this.d;
        if (z10) {
            if (dz0Var.j == null) {
                dz0Var.j = new int[dz0Var.e() + 1];
            }
            if (!dz0Var.k) {
                dz0Var.b(true);
                dz0Var.k = true;
            }
            iArr = dz0Var.j;
        } else {
            if (dz0Var.l == null) {
                dz0Var.l = new int[dz0Var.e() + 1];
            }
            if (!dz0Var.m) {
                dz0Var.b(false);
                dz0Var.m = true;
            }
            iArr = dz0Var.l;
        }
        iz0 iz0Var = gz0Var.a;
        hz0 hz0Var = (z4 ? iz0Var.b : iz0Var.a).b;
        return iArr[z10 ? hz0Var.a : hz0Var.b];
    }

    public final int f(gz0 gz0Var, boolean z4, boolean z10) {
        iz0 iz0Var = gz0Var.a;
        int i10 = z4 ? z10 ? ((ViewGroup.MarginLayoutParams) iz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) iz0Var).rightMargin : z10 ? ((ViewGroup.MarginLayoutParams) iz0Var).topMargin : ((ViewGroup.MarginLayoutParams) iz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        kz0 kz0Var = z4 ? iz0Var.b : iz0Var.a;
        dz0 dz0Var = z4 ? this.c : this.d;
        hz0 hz0Var = kz0Var.b;
        if ((z4 && this.F) != z10) {
            int i11 = hz0Var.a;
            return 0;
        }
        int i12 = hz0Var.b;
        dz0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        dz0 dz0Var = this.c;
        dz0Var.k();
        dz0 dz0Var2 = this.d;
        dz0Var2.k();
        if (dz0Var == null || dz0Var2 == null) {
            return;
        }
        dz0Var.l();
        dz0Var2.l();
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.M.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.B;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h(int i10, boolean z4) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            gz0 d = d(i11);
            iz0 iz0Var = d.a;
            if (z4) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.L.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) iz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) iz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) iz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) iz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) iz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) iz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) iz0Var).height, true);
            } else {
                boolean z10 = this.e == 0;
                kz0 kz0Var = z10 ? iz0Var.b : iz0Var.a;
                if (kz0.a(kz0Var, z10) == R) {
                    hz0 hz0Var = kz0Var.b;
                    int[] g10 = (z10 ? this.c : this.d).g();
                    int e6 = (g10[hz0Var.b] - g10[hz0Var.a]) - (e(d, z10, false) + e(d, z10, true));
                    if (z10) {
                        fz0 fz0Var = d.b;
                        int emojiOnlyCount2 = fz0Var != null ? fz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e6 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) iz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e6, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) iz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) iz0Var).width, e(d, false, false) + e(d, false, true) + e6, false);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean z4;
        int i14;
        int i15;
        nz0 nz0Var = this;
        nz0Var.c();
        dz0 dz0Var = nz0Var.d;
        dz0 dz0Var2 = nz0Var.c;
        if (dz0Var2 != null && dz0Var != null) {
            dz0Var2.l();
            dz0Var.l();
        }
        nz0Var.b = 0;
        int childCount = nz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            nz0Var.b = Math.max(nz0Var.b, nz0Var.d(i16).a.b.b.b);
        }
        nz0Var.h(i10, true);
        if (nz0Var.e == 0) {
            i12 = dz0Var2.i(i10);
            if (nz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                dz0Var2.v.a = i12;
                dz0Var2.w.a = -i12;
                dz0Var2.q = false;
                dz0Var2.g();
            }
            nz0Var.h(i10, false);
            i13 = dz0Var.i(i11);
        } else {
            int i17 = dz0Var.i(i11);
            nz0Var.h(i10, false);
            i12 = dz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, nz0Var.getSuggestedMinimumHeight());
        nz0Var.setMeasuredDimension(i12, max);
        dz0Var2.v.a = i12;
        dz0Var2.w.a = -i12;
        dz0Var2.q = false;
        dz0Var2.g();
        dz0Var.v.a = max;
        dz0Var.w.a = -max;
        dz0Var.q = false;
        dz0Var.g();
        int[] g10 = dz0Var2.g();
        int[] g11 = dz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = nz0Var.G;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = nz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            gz0 d = nz0Var.d(i20);
            iz0 iz0Var = d.a;
            kz0 kz0Var = iz0Var.b;
            kz0 kz0Var2 = iz0Var.a;
            hz0 hz0Var = kz0Var.b;
            hz0 hz0Var2 = kz0Var2.b;
            int i21 = childCount2;
            int i22 = g10[hz0Var.a];
            int i23 = g11[hz0Var2.a];
            int i24 = g10[hz0Var.b];
            int i25 = g11[hz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            dz0 dz0Var3 = dz0Var;
            int i29 = d.l;
            zy0 a2 = kz0.a(kz0Var, true);
            zy0 a10 = kz0.a(kz0Var2, false);
            l7.w0 f10 = dz0Var2.f();
            ez0 ez0Var = (ez0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            l7.w0 f11 = dz0Var3.f();
            dz0 dz0Var4 = dz0Var2;
            ez0 ez0Var2 = (ez0) ((Object[]) f11.d)[((int[]) f11.b)[i20]];
            int b10 = a2.b(d, i26 - ez0Var.d(true));
            int b11 = a10.b(d, i27 - ez0Var2.d(true));
            int e6 = nz0Var.e(d, true, true);
            int e10 = nz0Var.e(d, false, true);
            int e11 = nz0Var.e(d, true, false);
            int i30 = e6 + e11;
            int e12 = e10 + nz0Var.e(d, false, false);
            int a11 = ez0Var.a(nz0Var, d, a2, i28 + i30, true);
            nz0Var = this;
            int a12 = ez0Var2.a(nz0Var, d, a10, i29 + e12, false);
            int c3 = a2.c(i28, i26 - i30);
            int c10 = a10.c(i29, i27 - e12);
            int i31 = i22 + b10 + a11;
            int i32 = !nz0Var.F ? e6 + i31 : ((i18 - c3) - e11) - i31;
            int i33 = i23 + b11 + a12 + e10;
            if (d.c != null) {
                if (c3 != d.k || c10 != d.l) {
                    d.d(c3, c10, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c10) {
                    hz0 hz0Var3 = d.a.a.b;
                    if (hz0Var3.b - hz0Var3.a <= 1) {
                        ArrayList arrayList2 = nz0Var.H;
                        int size = arrayList2.size();
                        while (true) {
                            if (i15 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i15);
                            float f12 = pointF.x;
                            float f13 = d.a.a.b.a;
                            i15 = (f12 > f13 || pointF.y <= f13) ? i15 + 1 : 0;
                        }
                    }
                }
            }
            d.p = i32;
            d.q = i33;
            i19 = i20 + 1;
            dz0Var = dz0Var3;
            childCount2 = i21;
            dz0Var2 = dz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            gz0 gz0Var = (gz0) arrayList.get(i35);
            int i36 = gz0Var.l;
            int i37 = gz0Var.d;
            int i38 = i36 - gz0Var.m;
            ArrayList arrayList3 = nz0Var.M;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                gz0 gz0Var2 = (gz0) arrayList3.get(i39);
                if (gz0Var.a.a.b.a != gz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = gz0Var.m;
                int i41 = gz0Var2.m;
                if (i40 < i41) {
                    z4 = true;
                    break;
                }
                int i42 = gz0Var2.l - i41;
                if (i42 > 0) {
                    i38 = Math.min(i38, i42);
                }
            }
            z4 = false;
            if (!z4) {
                int i43 = i37 - 1;
                while (true) {
                    if (i43 < 0) {
                        break;
                    }
                    gz0 gz0Var3 = (gz0) arrayList3.get(i43);
                    if (gz0Var.a.a.b.a != gz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = gz0Var.m;
                    int i45 = gz0Var3.m;
                    if (i44 < i45) {
                        z4 = true;
                        break;
                    }
                    int i46 = gz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z4) {
                gz0Var.l = gz0Var.m;
                gz0Var.g();
                max -= i38;
                int i47 = gz0Var.a.a.b.a;
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
                    gz0 gz0Var4 = (gz0) arrayList3.get(i50);
                    if (gz0Var == gz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = gz0Var.a.a.b.a;
                        int i52 = gz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (gz0Var4.m != gz0Var4.l) {
                                arrayList.remove(gz0Var4);
                                if (gz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = gz0Var4.l - i38;
                            gz0Var4.l = i53;
                            i14 = i50;
                            gz0Var4.d(gz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                gz0Var4.q -= i38;
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
        int childCount3 = nz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            gz0 d10 = nz0Var.d(i54);
            nz0Var.L.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        nz0Var.y = i18;
        nz0Var.B = max;
        nz0Var.C = copyOf;
        nz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        dz0 dz0Var;
        super.requestLayout();
        dz0 dz0Var2 = this.c;
        if (dz0Var2 == null || (dz0Var = this.d) == null) {
            return;
        }
        dz0Var2.l();
        dz0Var.l();
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

    public void setColumnOrderPreserved(boolean z4) {
        dz0 dz0Var = this.c;
        dz0Var.u = z4;
        dz0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z4) {
        this.D = z4;
    }

    public void setFillWidth(boolean z4) {
        if (this.x == z4) {
            return;
        }
        this.x = z4;
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
            gz0 d = d(i12);
            if (measuredWidth <= 0 || (i11 = this.y) == measuredWidth) {
                int i13 = d.n;
                int i14 = d.o + i13;
                d.p = i13;
                d.k = Math.max(0, i14 - i13);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f10 = measuredWidth;
                int round = Math.round((d.n * i11) / f10);
                int round2 = Math.round(((d.n + d.o) * this.y) / f10);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.C;
        if (iArr.length < 2) {
            this.B = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.C;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                gz0 d10 = d(i18);
                fz0 fz0Var = d10.b;
                int emojiOnlyCount = fz0Var != null ? fz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    hz0 hz0Var = d10.a.a.b;
                    int max = Math.max(0, hz0Var.a);
                    int min = Math.min(i15, hz0Var.b);
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
            this.B = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                gz0 d11 = d(i25);
                hz0 hz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, hz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, hz0Var2.b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.q = i26;
                d11.l = Math.max(0, i27 - i26);
                if (d11.c != null) {
                    d11.g();
                }
                this.L.onLayoutChild(d11.b, d11.b(), d11.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i10) {
        this.d.n(i10);
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z4) {
        dz0 dz0Var = this.d;
        dz0Var.u = z4;
        dz0Var.k();
        g();
        requestLayout();
    }

    public void setRtl(boolean z4) {
        this.F = z4;
    }

    public void setStriped(boolean z4) {
        this.E = z4;
    }

    public void setUseDefaultMargins(boolean z4) {
        this.f = z4;
        requestLayout();
    }
}
