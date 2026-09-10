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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wz0 extends View {
    public static final iz0 R = new iz0(0);
    public static final iz0 S = new iz0(1);
    public static final iz0 T = new iz0(3);
    public static final iz0 U = new iz0(4);
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
    public final vz0 O;
    public final ArrayList P;
    public final uz0 Q;
    public final org.telegram.ui.Cells.s9 a;
    public int b;
    public final mz0 c;
    public final mz0 d;
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

    public wz0(Context context, vz0 vz0Var, org.telegram.ui.Cells.s9 s9Var) {
        super(context);
        this.c = new mz0(this, true);
        this.d = new mz0(this, false);
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
        this.O = vz0Var;
        uz0 uz0Var = new uz0(this, this);
        this.Q = uz0Var;
        r0.i0.k(this, uz0Var);
    }

    public static void i(rz0 rz0Var, int i10, int i11, int i12, int i13) {
        qz0 qz0Var = new qz0(i10, i11 + i10);
        tz0 tz0Var = rz0Var.a;
        rz0Var.a = new tz0(tz0Var.a, qz0Var, tz0Var.c, tz0Var.d);
        qz0 qz0Var2 = new qz0(i12, i13 + i12);
        tz0 tz0Var2 = rz0Var.b;
        rz0Var.b = new tz0(tz0Var2.a, qz0Var2, tz0Var2.c, tz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.P;
        pz0 pz0Var = new pz0(this, arrayList.size());
        rz0 rz0Var = new rz0();
        qz0 qz0Var = new qz0(i11, i13 + i11);
        iz0 iz0Var = U;
        rz0Var.a = new tz0(false, qz0Var, iz0Var, 0.0f);
        rz0Var.b = new tz0(false, new qz0(i10, i12 + i10), iz0Var, 0.0f);
        pz0Var.a = rz0Var;
        pz0Var.j = i11;
        arrayList.add(pz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.P;
        pz0 pz0Var = new pz0(this, arrayList.size());
        pz0Var.c = pagetablecell;
        rz0 rz0Var = new rz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        qz0 qz0Var = new qz0(i11, i13 + i11);
        iz0 iz0Var = U;
        rz0Var.a = new tz0(false, qz0Var, iz0Var, 0.0f);
        rz0Var.b = new tz0(false, new qz0(i10, i12 + i10), iz0Var, 1.0f);
        pz0Var.a = rz0Var;
        pz0Var.j = i11;
        arrayList.add(pz0Var);
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
            rz0 rz0Var = d(i17).a;
            tz0 tz0Var = z10 ? rz0Var.a : rz0Var.b;
            qz0 qz0Var = tz0Var.b;
            boolean z11 = tz0Var.a;
            int i18 = qz0Var.b;
            int i19 = qz0Var.a;
            int i20 = i18 - i19;
            if (z11) {
                i15 = i19;
            }
            tz0 tz0Var2 = z10 ? rz0Var.b : rz0Var.a;
            qz0 qz0Var2 = tz0Var2.b;
            boolean z12 = tz0Var2.a;
            int i21 = qz0Var2.b;
            int i22 = qz0Var2.a;
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
                i(rz0Var, i15, i20, i16, i23);
            } else {
                i(rz0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final pz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.P;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (pz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        uz0 uz0Var = this.Q;
        if (uz0Var == null || !uz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(pz0 pz0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(pz0Var, z10, z11);
        }
        mz0 mz0Var = z10 ? this.c : this.d;
        if (z11) {
            if (mz0Var.j == null) {
                mz0Var.j = new int[mz0Var.e() + 1];
            }
            if (!mz0Var.k) {
                mz0Var.b(true);
                mz0Var.k = true;
            }
            iArr = mz0Var.j;
        } else {
            if (mz0Var.l == null) {
                mz0Var.l = new int[mz0Var.e() + 1];
            }
            if (!mz0Var.m) {
                mz0Var.b(false);
                mz0Var.m = true;
            }
            iArr = mz0Var.l;
        }
        rz0 rz0Var = pz0Var.a;
        qz0 qz0Var = (z10 ? rz0Var.b : rz0Var.a).b;
        return iArr[z11 ? qz0Var.a : qz0Var.b];
    }

    public final int f(pz0 pz0Var, boolean z10, boolean z11) {
        rz0 rz0Var = pz0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) rz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) rz0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) rz0Var).topMargin : ((ViewGroup.MarginLayoutParams) rz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        tz0 tz0Var = z10 ? rz0Var.b : rz0Var.a;
        mz0 mz0Var = z10 ? this.c : this.d;
        qz0 qz0Var = tz0Var.b;
        if ((z10 && this.I) != z11) {
            int i11 = qz0Var.a;
            return 0;
        }
        int i12 = qz0Var.b;
        mz0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        mz0 mz0Var = this.c;
        mz0Var.k();
        mz0 mz0Var2 = this.d;
        mz0Var2.k();
        if (mz0Var == null || mz0Var2 == null) {
            return;
        }
        mz0Var.l();
        mz0Var2.l();
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
            pz0 d = d(i11);
            rz0 rz0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.O.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) rz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) rz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) rz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) rz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) rz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) rz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) rz0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                tz0 tz0Var = z11 ? rz0Var.b : rz0Var.a;
                if (tz0.a(tz0Var, z11) == U) {
                    qz0 qz0Var = tz0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e = (g10[qz0Var.b] - g10[qz0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        oz0 oz0Var = d.b;
                        int emojiOnlyCount2 = oz0Var != null ? oz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) rz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) rz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) rz0Var).width, e(d, false, false) + e(d, false, true) + e, false);
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
        wz0 wz0Var = this;
        wz0Var.c();
        mz0 mz0Var = wz0Var.d;
        mz0 mz0Var2 = wz0Var.c;
        if (mz0Var2 != null && mz0Var != null) {
            mz0Var2.l();
            mz0Var.l();
        }
        wz0Var.b = 0;
        int childCount = wz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            wz0Var.b = Math.max(wz0Var.b, wz0Var.d(i16).a.b.b.b);
        }
        wz0Var.h(i10, true);
        if (wz0Var.e == 0) {
            i12 = mz0Var2.i(i10);
            if (wz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                mz0Var2.v.a = i12;
                mz0Var2.w.a = -i12;
                mz0Var2.q = false;
                mz0Var2.g();
            }
            wz0Var.h(i10, false);
            i13 = mz0Var.i(i11);
        } else {
            int i17 = mz0Var.i(i11);
            wz0Var.h(i10, false);
            i12 = mz0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, wz0Var.getSuggestedMinimumHeight());
        wz0Var.setMeasuredDimension(i12, max);
        mz0Var2.v.a = i12;
        mz0Var2.w.a = -i12;
        mz0Var2.q = false;
        mz0Var2.g();
        mz0Var.v.a = max;
        mz0Var.w.a = -max;
        mz0Var.q = false;
        mz0Var.g();
        int[] g10 = mz0Var2.g();
        int[] g11 = mz0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = wz0Var.J;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = wz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            pz0 d = wz0Var.d(i20);
            rz0 rz0Var = d.a;
            tz0 tz0Var = rz0Var.b;
            tz0 tz0Var2 = rz0Var.a;
            qz0 qz0Var = tz0Var.b;
            qz0 qz0Var2 = tz0Var2.b;
            int i21 = childCount2;
            int i22 = g10[qz0Var.a];
            int i23 = g11[qz0Var2.a];
            int i24 = g10[qz0Var.b];
            int i25 = g11[qz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            mz0 mz0Var3 = mz0Var;
            int i29 = d.l;
            iz0 a2 = tz0.a(tz0Var, true);
            iz0 a10 = tz0.a(tz0Var2, false);
            m.e3 f7 = mz0Var2.f();
            nz0 nz0Var = (nz0) ((Object[]) f7.d)[((int[]) f7.b)[i20]];
            m.e3 f10 = mz0Var3.f();
            mz0 mz0Var4 = mz0Var2;
            nz0 nz0Var2 = (nz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - nz0Var.d(true));
            int b11 = a10.b(d, i27 - nz0Var2.d(true));
            int e = wz0Var.e(d, true, true);
            int e7 = wz0Var.e(d, false, true);
            int e10 = wz0Var.e(d, true, false);
            int i30 = e + e10;
            int e11 = e7 + wz0Var.e(d, false, false);
            int a11 = nz0Var.a(wz0Var, d, a2, i28 + i30, true);
            wz0Var = this;
            int a12 = nz0Var2.a(wz0Var, d, a10, i29 + e11, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a10.c(i29, i27 - e11);
            int i31 = i22 + b10 + a11;
            int i32 = !wz0Var.I ? e + i31 : ((i18 - c10) - e10) - i31;
            int i33 = i23 + b11 + a12 + e7;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    qz0 qz0Var3 = d.a.a.b;
                    if (qz0Var3.b - qz0Var3.a <= 1) {
                        ArrayList arrayList2 = wz0Var.K;
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
            mz0Var = mz0Var3;
            childCount2 = i21;
            mz0Var2 = mz0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            pz0 pz0Var = (pz0) arrayList.get(i35);
            int i36 = pz0Var.l;
            int i37 = pz0Var.d;
            int i38 = i36 - pz0Var.m;
            ArrayList arrayList3 = wz0Var.P;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                pz0 pz0Var2 = (pz0) arrayList3.get(i39);
                if (pz0Var.a.a.b.a != pz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = pz0Var.m;
                int i41 = pz0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = pz0Var2.l - i41;
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
                    pz0 pz0Var3 = (pz0) arrayList3.get(i43);
                    if (pz0Var.a.a.b.a != pz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = pz0Var.m;
                    int i45 = pz0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = pz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                pz0Var.l = pz0Var.m;
                pz0Var.g();
                max -= i38;
                int i47 = pz0Var.a.a.b.a;
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
                    pz0 pz0Var4 = (pz0) arrayList3.get(i50);
                    if (pz0Var == pz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = pz0Var.a.a.b.a;
                        int i52 = pz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (pz0Var4.m != pz0Var4.l) {
                                arrayList.remove(pz0Var4);
                                if (pz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = pz0Var4.l - i38;
                            pz0Var4.l = i53;
                            i14 = i50;
                            pz0Var4.d(pz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                pz0Var4.q -= i38;
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
        int childCount3 = wz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            pz0 d10 = wz0Var.d(i54);
            wz0Var.O.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        wz0Var.y = i18;
        wz0Var.E = max;
        wz0Var.F = copyOf;
        wz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        mz0 mz0Var;
        super.requestLayout();
        mz0 mz0Var2 = this.c;
        if (mz0Var2 == null || (mz0Var = this.d) == null) {
            return;
        }
        mz0Var2.l();
        mz0Var.l();
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
        mz0 mz0Var = this.c;
        mz0Var.u = z10;
        mz0Var.k();
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
            pz0 d = d(i12);
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
                pz0 d10 = d(i18);
                oz0 oz0Var = d10.b;
                int emojiOnlyCount = oz0Var != null ? oz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    qz0 qz0Var = d10.a.a.b;
                    int max = Math.max(0, qz0Var.a);
                    int min = Math.min(i15, qz0Var.b);
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
                pz0 d11 = d(i25);
                qz0 qz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, qz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, qz0Var2.b));
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
        mz0 mz0Var = this.d;
        mz0Var.u = z10;
        mz0Var.k();
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
