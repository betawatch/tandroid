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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vz0 extends View {
    public static final hz0 R = new hz0(0);
    public static final hz0 S = new hz0(1);
    public static final hz0 T = new hz0(3);
    public static final hz0 U = new hz0(4);
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
    public final uz0 O;
    public final ArrayList P;
    public final tz0 Q;
    public final org.telegram.ui.Cells.r9 a;
    public int b;
    public final lz0 c;
    public final lz0 d;
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

    public vz0(Context context, uz0 uz0Var, org.telegram.ui.Cells.r9 r9Var) {
        super(context);
        this.c = new lz0(this, true);
        this.d = new lz0(this, false);
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
        this.a = r9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.O = uz0Var;
        tz0 tz0Var = new tz0(this, this);
        this.Q = tz0Var;
        r0.i0.k(this, tz0Var);
    }

    public static void i(qz0 qz0Var, int i10, int i11, int i12, int i13) {
        pz0 pz0Var = new pz0(i10, i11 + i10);
        sz0 sz0Var = qz0Var.a;
        qz0Var.a = new sz0(sz0Var.a, pz0Var, sz0Var.c, sz0Var.d);
        pz0 pz0Var2 = new pz0(i12, i13 + i12);
        sz0 sz0Var2 = qz0Var.b;
        qz0Var.b = new sz0(sz0Var2.a, pz0Var2, sz0Var2.c, sz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        oz0 oz0Var = new oz0(this, arrayList.size());
        qz0 qz0Var = new qz0();
        pz0 pz0Var = new pz0(i11, i13 + i11);
        hz0 hz0Var = U;
        qz0Var.a = new sz0(false, pz0Var, hz0Var, 0.0f);
        qz0Var.b = new sz0(false, new pz0(i10, i12 + i10), hz0Var, 0.0f);
        oz0Var.a = qz0Var;
        oz0Var.j = i11;
        arrayList.add(oz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        oz0 oz0Var = new oz0(this, arrayList.size());
        oz0Var.c = pagetablecell;
        qz0 qz0Var = new qz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        pz0 pz0Var = new pz0(i11, i13 + i11);
        hz0 hz0Var = U;
        qz0Var.a = new sz0(false, pz0Var, hz0Var, 0.0f);
        qz0Var.b = new sz0(false, new pz0(i10, i12 + i10), hz0Var, 1.0f);
        oz0Var.a = qz0Var;
        oz0Var.j = i11;
        arrayList.add(oz0Var);
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
            qz0 qz0Var = d(i17).a;
            sz0 sz0Var = z10 ? qz0Var.a : qz0Var.b;
            pz0 pz0Var = sz0Var.b;
            boolean z11 = sz0Var.a;
            int i18 = pz0Var.b;
            int i19 = pz0Var.a;
            int i20 = i18 - i19;
            if (z11) {
                i15 = i19;
            }
            sz0 sz0Var2 = z10 ? qz0Var.b : qz0Var.a;
            pz0 pz0Var2 = sz0Var2.b;
            boolean z12 = sz0Var2.a;
            int i21 = pz0Var2.b;
            int i22 = pz0Var2.a;
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
                i(qz0Var, i15, i20, i16, i23);
            } else {
                i(qz0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final oz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (oz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        tz0 tz0Var = this.Q;
        if (tz0Var == null || !tz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(oz0 oz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(oz0Var, z10, z11);
        }
        lz0 lz0Var = z10 ? this.c : this.d;
        if (z11) {
            if (lz0Var.j == null) {
                lz0Var.j = new int[lz0Var.e() + 1];
            }
            if (!lz0Var.k) {
                lz0Var.b(true);
                lz0Var.k = true;
            }
            iArr = lz0Var.j;
        } else {
            if (lz0Var.l == null) {
                lz0Var.l = new int[lz0Var.e() + 1];
            }
            if (!lz0Var.m) {
                lz0Var.b(false);
                lz0Var.m = true;
            }
            iArr = lz0Var.l;
        }
        qz0 qz0Var = oz0Var.a;
        pz0 pz0Var = (z10 ? qz0Var.b : qz0Var.a).b;
        return iArr[z11 ? pz0Var.a : pz0Var.b];
    }

    public final int f(oz0 oz0Var, boolean z10, boolean z11) {
        qz0 qz0Var = oz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) qz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) qz0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) qz0Var).topMargin : ((ViewGroup.MarginLayoutParams) qz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        sz0 sz0Var = z10 ? qz0Var.b : qz0Var.a;
        lz0 lz0Var = z10 ? this.c : this.d;
        pz0 pz0Var = sz0Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = pz0Var.a;
            return 0;
        }
        int i12 = pz0Var.b;
        lz0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        lz0 lz0Var = this.c;
        lz0Var.k();
        lz0 lz0Var2 = this.d;
        lz0Var2.k();
        if (lz0Var == null || lz0Var2 == null) {
            return;
        }
        lz0Var.l();
        lz0Var2.l();
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
            oz0 d = d(i11);
            qz0 qz0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) qz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) qz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) qz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) qz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) qz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) qz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) qz0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                sz0 sz0Var = z11 ? qz0Var.b : qz0Var.a;
                if (sz0.a(sz0Var, z11) == U) {
                    pz0 pz0Var = sz0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e = (g10[pz0Var.b] - g10[pz0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        nz0 nz0Var = d.b;
                        int emojiOnlyCount2 = nz0Var != null ? nz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) qz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) qz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) qz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        vz0 vz0Var = this;
        vz0Var.c();
        lz0 lz0Var = vz0Var.d;
        lz0 lz0Var2 = vz0Var.c;
        if (lz0Var2 != null && lz0Var != null) {
            lz0Var2.l();
            lz0Var.l();
        }
        vz0Var.b = 0;
        int childCount = vz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            vz0Var.b = Math.max(vz0Var.b, vz0Var.d(i16).a.b.b.b);
        }
        vz0Var.h(i10, true);
        if (vz0Var.e == 0) {
            i12 = lz0Var2.i(i10);
            if (vz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                lz0Var2.v.a = i12;
                lz0Var2.w.a = -i12;
                lz0Var2.q = false;
                lz0Var2.g();
            }
            vz0Var.h(i10, false);
            i13 = lz0Var.i(i11);
        } else {
            int i17 = lz0Var.i(i11);
            vz0Var.h(i10, false);
            i12 = lz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, vz0Var.getSuggestedMinimumHeight());
        vz0Var.setMeasuredDimension(i12, max);
        lz0Var2.v.a = i12;
        lz0Var2.w.a = -i12;
        lz0Var2.q = false;
        lz0Var2.g();
        lz0Var.v.a = max;
        lz0Var.w.a = -max;
        lz0Var.q = false;
        lz0Var.g();
        int[] g10 = lz0Var2.g();
        int[] g11 = lz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = vz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = vz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            oz0 d = vz0Var.d(i20);
            qz0 qz0Var = d.a;
            sz0 sz0Var = qz0Var.b;
            sz0 sz0Var2 = qz0Var.a;
            pz0 pz0Var = sz0Var.b;
            pz0 pz0Var2 = sz0Var2.b;
            int i21 = childCount2;
            int i22 = g10[pz0Var.a];
            int i23 = g11[pz0Var2.a];
            int i24 = g10[pz0Var.b];
            int i25 = g11[pz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            lz0 lz0Var3 = lz0Var;
            int i29 = d.l;
            hz0 a2 = sz0.a(sz0Var, true);
            hz0 a10 = sz0.a(sz0Var2, false);
            lf.h f7 = lz0Var2.f();
            mz0 mz0Var = (mz0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            lf.h f10 = lz0Var3.f();
            lz0 lz0Var4 = lz0Var2;
            mz0 mz0Var2 = (mz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - mz0Var.d(true));
            int b11 = a10.b(d, i27 - mz0Var2.d(true));
            int e = vz0Var.e(d, true, true);
            int e7 = vz0Var.e(d, false, true);
            int e10 = vz0Var.e(d, true, false);
            int i30 = e + e10;
            int e11 = e7 + vz0Var.e(d, false, false);
            int a11 = mz0Var.a(vz0Var, d, a2, i28 + i30, true);
            vz0Var = this;
            int a12 = mz0Var2.a(vz0Var, d, a10, i29 + e11, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e11);
            int i31 = i22 + b10 + a11;
            int i32 = !vz0Var.I ? e + i31 : ((i18 - c10) - e10) - i31;
            int i33 = i23 + b11 + a12 + e7;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    pz0 pz0Var3 = d.a.a.b;
                    if (pz0Var3.b - pz0Var3.a <= 1) {
                        ArrayList arrayList2 = vz0Var.K;
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
            lz0Var = lz0Var3;
            childCount2 = i21;
            lz0Var2 = lz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            oz0 oz0Var = (oz0) arrayList.get(i35);
            int i36 = oz0Var.l;
            int i37 = oz0Var.d;
            int i38 = i36 - oz0Var.m;
            ArrayList arrayList3 = vz0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                oz0 oz0Var2 = (oz0) arrayList3.get(i39);
                if (oz0Var.a.a.b.a != oz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = oz0Var.m;
                int i41 = oz0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = oz0Var2.l - i41;
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
                    oz0 oz0Var3 = (oz0) arrayList3.get(i43);
                    if (oz0Var.a.a.b.a != oz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = oz0Var.m;
                    int i45 = oz0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = oz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                oz0Var.l = oz0Var.m;
                oz0Var.g();
                max -= i38;
                int i47 = oz0Var.a.a.b.a;
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
                    oz0 oz0Var4 = (oz0) arrayList3.get(i50);
                    if (oz0Var == oz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = oz0Var.a.a.b.a;
                        int i52 = oz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (oz0Var4.m != oz0Var4.l) {
                                arrayList.remove(oz0Var4);
                                if (oz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = oz0Var4.l - i38;
                            oz0Var4.l = i53;
                            i14 = i50;
                            oz0Var4.d(oz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                oz0Var4.q -= i38;
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
        int childCount3 = vz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            oz0 d10 = vz0Var.d(i54);
            vz0Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        vz0Var.y = i18;
        vz0Var.E = max;
        vz0Var.F = copyOf;
        vz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        lz0 lz0Var;
        super.requestLayout();
        lz0 lz0Var2 = this.c;
        if (lz0Var2 == null || (lz0Var = this.d) == null) {
            return;
        }
        lz0Var2.l();
        lz0Var.l();
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
        lz0 lz0Var = this.c;
        lz0Var.u = z10;
        lz0Var.k();
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
            oz0 d = d(i12);
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
                oz0 d10 = d(i18);
                nz0 nz0Var = d10.b;
                int emojiOnlyCount = nz0Var != null ? nz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    pz0 pz0Var = d10.a.a.b;
                    int max = Math.max(0, pz0Var.a);
                    int min = Math.min(i15, pz0Var.b);
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
                oz0 d11 = d(i25);
                pz0 pz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, pz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, pz0Var2.b));
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
        lz0 lz0Var = this.d;
        lz0Var.u = z10;
        lz0Var.k();
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
