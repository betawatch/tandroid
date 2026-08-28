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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ry0 extends View {
    public static final dy0 N = new dy0(0);
    public static final dy0 O = new dy0(1);
    public static final dy0 P = new dy0(3);
    public static final dy0 Q = new dy0(4);
    public int A;
    public int[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final ArrayList F;
    public final ArrayList G;
    public final Path H;
    public final RectF I;
    public final float[] J;
    public final qy0 K;
    public final ArrayList L;
    public final py0 M;
    public final org.telegram.ui.Cells.n9 a;
    public int b;
    public final hy0 c;
    public final hy0 d;
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

    public ry0(Context context, qy0 qy0Var, org.telegram.ui.Cells.n9 n9Var) {
        super(context);
        this.c = new hy0(this, true);
        this.d = new hy0(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = AndroidUtilities.dp(8.0f);
        this.s = AndroidUtilities.dp(9.0f);
        this.v = AndroidUtilities.dp(12.0f);
        this.x = true;
        this.B = new int[0];
        this.F = new ArrayList();
        this.G = new ArrayList();
        new Path();
        this.H = new Path();
        this.I = new RectF();
        this.J = new float[8];
        this.L = new ArrayList();
        this.a = n9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.K = qy0Var;
        py0 py0Var = new py0(this, this);
        this.M = py0Var;
        r0.j0.k(this, py0Var);
    }

    public static void i(my0 my0Var, int i9, int i10, int i11, int i12) {
        ly0 ly0Var = new ly0(i9, i10 + i9);
        oy0 oy0Var = my0Var.a;
        my0Var.a = new oy0(oy0Var.a, ly0Var, oy0Var.c, oy0Var.d);
        ly0 ly0Var2 = new ly0(i11, i12 + i11);
        oy0 oy0Var2 = my0Var.b;
        my0Var.b = new oy0(oy0Var2.a, ly0Var2, oy0Var2.c, oy0Var2.d);
    }

    public final void a(int i9, int i10, int i11, int i12) {
        ArrayList arrayList = this.L;
        ky0 ky0Var = new ky0(this, arrayList.size());
        my0 my0Var = new my0();
        ly0 ly0Var = new ly0(i10, i12 + i10);
        dy0 dy0Var = Q;
        my0Var.a = new oy0(false, ly0Var, dy0Var, 0.0f);
        my0Var.b = new oy0(false, new ly0(i9, i11 + i9), dy0Var, 0.0f);
        ky0Var.a = my0Var;
        ky0Var.j = i10;
        arrayList.add(ky0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i9, int i10, int i11) {
        if (i11 == 0) {
            i11 = 1;
        }
        ArrayList arrayList = this.L;
        ky0 ky0Var = new ky0(this, arrayList.size());
        ky0Var.c = pagetablecell;
        my0 my0Var = new my0();
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        ly0 ly0Var = new ly0(i10, i12 + i10);
        dy0 dy0Var = Q;
        my0Var.a = new oy0(false, ly0Var, dy0Var, 0.0f);
        my0Var.b = new oy0(false, new ly0(i9, i11 + i9), dy0Var, 1.0f);
        ky0Var.a = my0Var;
        ky0Var.j = i10;
        arrayList.add(ky0Var);
        if (pagetablecell.rowspan > 1) {
            this.G.add(new PointF(i10, i10 + r10));
        }
        g();
    }

    public final void c() {
        int i9 = this.n;
        int i10 = 1;
        if (i9 != 0) {
            int childCount = getChildCount();
            int i11 = 1;
            for (int i12 = 0; i12 < childCount; i12++) {
                i11 = (i11 * 31) + d(i12).a.hashCode();
            }
            if (i9 != i11) {
                g();
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
        int[] iArr = new int[i13];
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount2; i16++) {
            my0 my0Var = d(i16).a;
            oy0 oy0Var = z10 ? my0Var.a : my0Var.b;
            ly0 ly0Var = oy0Var.b;
            boolean z11 = oy0Var.a;
            int i17 = ly0Var.b;
            int i18 = ly0Var.a;
            int i19 = i17 - i18;
            if (z11) {
                i14 = i18;
            }
            oy0 oy0Var2 = z10 ? my0Var.b : my0Var.a;
            ly0 ly0Var2 = oy0Var2.b;
            boolean z12 = oy0Var2.a;
            int i20 = ly0Var2.b;
            int i21 = ly0Var2.a;
            int i22 = i20 - i21;
            if (i13 != 0) {
                i22 = Math.min(i22, i13 - (z12 ? Math.min(i21, i13) : 0));
            }
            if (z12) {
                i15 = i21;
            }
            if (i13 != 0) {
                if (!z11 || !z12) {
                    while (true) {
                        int i23 = i15 + i22;
                        if (i23 <= i13) {
                            for (int i24 = i15; i24 < i23; i24++) {
                                if (iArr[i24] <= i14) {
                                }
                            }
                            break;
                        }
                        if (z12) {
                            i14++;
                        } else if (i23 <= i13) {
                            i15++;
                        } else {
                            i14++;
                            i15 = 0;
                        }
                    }
                }
                Arrays.fill(iArr, Math.min(i15, i13), Math.min(i15 + i22, i13), i14 + i19);
            }
            if (z10) {
                i(my0Var, i14, i19, i15, i22);
            } else {
                i(my0Var, i15, i22, i14, i19);
            }
            i15 += i22;
        }
        int childCount3 = getChildCount();
        for (int i25 = 0; i25 < childCount3; i25++) {
            i10 = (i10 * 31) + d(i25).a.hashCode();
        }
        this.n = i10;
    }

    public final ky0 d(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.L;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return (ky0) arrayList.get(i9);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        py0 py0Var = this.M;
        if (py0Var == null || !py0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(ky0 ky0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(ky0Var, z10, z11);
        }
        hy0 hy0Var = z10 ? this.c : this.d;
        if (z11) {
            if (hy0Var.j == null) {
                hy0Var.j = new int[hy0Var.e() + 1];
            }
            if (!hy0Var.k) {
                hy0Var.b(true);
                hy0Var.k = true;
            }
            iArr = hy0Var.j;
        } else {
            if (hy0Var.l == null) {
                hy0Var.l = new int[hy0Var.e() + 1];
            }
            if (!hy0Var.m) {
                hy0Var.b(false);
                hy0Var.m = true;
            }
            iArr = hy0Var.l;
        }
        my0 my0Var = ky0Var.a;
        ly0 ly0Var = (z10 ? my0Var.b : my0Var.a).b;
        return iArr[z11 ? ly0Var.a : ly0Var.b];
    }

    public final int f(ky0 ky0Var, boolean z10, boolean z11) {
        my0 my0Var = ky0Var.a;
        int i9 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) my0Var).leftMargin : ((ViewGroup.MarginLayoutParams) my0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) my0Var).topMargin : ((ViewGroup.MarginLayoutParams) my0Var).bottomMargin;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (!this.f) {
            return 0;
        }
        oy0 oy0Var = z10 ? my0Var.b : my0Var.a;
        hy0 hy0Var = z10 ? this.c : this.d;
        ly0 ly0Var = oy0Var.b;
        if ((z10 && this.E) != z11) {
            int i10 = ly0Var.a;
            return 0;
        }
        int i11 = ly0Var.b;
        hy0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        hy0 hy0Var = this.c;
        hy0Var.k();
        hy0 hy0Var2 = this.d;
        hy0Var2.k();
        if (hy0Var == null || hy0Var2 == null) {
            return;
        }
        hy0Var.l();
        hy0Var2.l();
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.L.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.A;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h(int i9, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ky0 d = d(i10);
            my0 my0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i9);
                d.e(this.K.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) my0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) my0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) my0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) my0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) my0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) my0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) my0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                oy0 oy0Var = z11 ? my0Var.b : my0Var.a;
                if (oy0.a(oy0Var, z11) == Q) {
                    ly0 ly0Var = oy0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e10 = (g10[ly0Var.b] - g10[ly0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        jy0 jy0Var = d.b;
                        int emojiOnlyCount2 = jy0Var != null ? jy0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e10 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) my0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e10, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) my0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) my0Var).width, e(d, false, false) + e(d, false, true) + e10, false);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            d(i9).a(canvas, this, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        ry0 ry0Var = this;
        ry0Var.c();
        hy0 hy0Var = ry0Var.d;
        hy0 hy0Var2 = ry0Var.c;
        if (hy0Var2 != null && hy0Var != null) {
            hy0Var2.l();
            hy0Var.l();
        }
        ry0Var.b = 0;
        int childCount = ry0Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            ry0Var.b = Math.max(ry0Var.b, ry0Var.d(i15).a.b.b.b);
        }
        ry0Var.h(i9, true);
        if (ry0Var.e == 0) {
            i11 = hy0Var2.i(i9);
            if (ry0Var.x) {
                i11 = Math.max(i11, View.MeasureSpec.getSize(i9));
                hy0Var2.v.a = i11;
                hy0Var2.w.a = -i11;
                hy0Var2.q = false;
                hy0Var2.g();
            }
            ry0Var.h(i9, false);
            i12 = hy0Var.i(i10);
        } else {
            int i16 = hy0Var.i(i10);
            ry0Var.h(i9, false);
            i11 = hy0Var2.i(i9);
            i12 = i16;
        }
        int max = Math.max(i12, ry0Var.getSuggestedMinimumHeight());
        ry0Var.setMeasuredDimension(i11, max);
        hy0Var2.v.a = i11;
        hy0Var2.w.a = -i11;
        hy0Var2.q = false;
        hy0Var2.g();
        hy0Var.v.a = max;
        hy0Var.w.a = -max;
        hy0Var.q = false;
        hy0Var.g();
        int[] g10 = hy0Var2.g();
        int[] g11 = hy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = ry0Var.F;
        arrayList.clear();
        int i17 = g10[g10.length - 1];
        int childCount2 = ry0Var.getChildCount();
        int i18 = 0;
        while (i18 < childCount2) {
            int i19 = i18;
            ky0 d = ry0Var.d(i19);
            my0 my0Var = d.a;
            oy0 oy0Var = my0Var.b;
            oy0 oy0Var2 = my0Var.a;
            ly0 ly0Var = oy0Var.b;
            ly0 ly0Var2 = oy0Var2.b;
            int i20 = childCount2;
            int i21 = g10[ly0Var.a];
            int i22 = g11[ly0Var2.a];
            int i23 = g10[ly0Var.b];
            int i24 = g11[ly0Var2.b];
            int i25 = i23 - i21;
            int i26 = i24 - i22;
            int i27 = d.k;
            hy0 hy0Var3 = hy0Var;
            int i28 = d.l;
            dy0 a2 = oy0.a(oy0Var, true);
            dy0 a3 = oy0.a(oy0Var2, false);
            j4.c f10 = hy0Var2.f();
            iy0 iy0Var = (iy0) ((Object[]) f10.d)[((int[]) f10.b)[i19]];
            j4.c f11 = hy0Var3.f();
            hy0 hy0Var4 = hy0Var2;
            iy0 iy0Var2 = (iy0) ((Object[]) f11.d)[((int[]) f11.b)[i19]];
            int b10 = a2.b(d, i25 - iy0Var.d(true));
            int b11 = a3.b(d, i26 - iy0Var2.d(true));
            int e10 = ry0Var.e(d, true, true);
            int e11 = ry0Var.e(d, false, true);
            int e12 = ry0Var.e(d, true, false);
            int i29 = e10 + e12;
            int e13 = e11 + ry0Var.e(d, false, false);
            int a10 = iy0Var.a(ry0Var, d, a2, i27 + i29, true);
            ry0Var = this;
            int a11 = iy0Var2.a(ry0Var, d, a3, i28 + e13, false);
            int c10 = a2.c(i27, i25 - i29);
            int c11 = a3.c(i28, i26 - e13);
            int i30 = i21 + b10 + a10;
            int i31 = !ry0Var.E ? e10 + i30 : ((i17 - c10) - e12) - i30;
            int i32 = i22 + b11 + a11 + e11;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i33 = d.m;
                if (i33 != 0 && i33 != c11) {
                    ly0 ly0Var3 = d.a.a.b;
                    if (ly0Var3.b - ly0Var3.a <= 1) {
                        ArrayList arrayList2 = ry0Var.G;
                        int size = arrayList2.size();
                        while (true) {
                            if (i14 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i14);
                            float f12 = pointF.x;
                            float f13 = d.a.a.b.a;
                            i14 = (f12 > f13 || pointF.y <= f13) ? i14 + 1 : 0;
                        }
                    }
                }
            }
            d.p = i31;
            d.q = i32;
            i18 = i19 + 1;
            hy0Var = hy0Var3;
            childCount2 = i20;
            hy0Var2 = hy0Var4;
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            ky0 ky0Var = (ky0) arrayList.get(i34);
            int i35 = ky0Var.l;
            int i36 = ky0Var.d;
            int i37 = i35 - ky0Var.m;
            ArrayList arrayList3 = ry0Var.L;
            int size3 = arrayList3.size();
            for (int i38 = i36 + 1; i38 < size3; i38++) {
                ky0 ky0Var2 = (ky0) arrayList3.get(i38);
                if (ky0Var.a.a.b.a != ky0Var2.a.a.b.a) {
                    break;
                }
                int i39 = ky0Var.m;
                int i40 = ky0Var2.m;
                if (i39 < i40) {
                    z10 = true;
                    break;
                }
                int i41 = ky0Var2.l - i40;
                if (i41 > 0) {
                    i37 = Math.min(i37, i41);
                }
            }
            z10 = false;
            if (!z10) {
                int i42 = i36 - 1;
                while (true) {
                    if (i42 < 0) {
                        break;
                    }
                    ky0 ky0Var3 = (ky0) arrayList3.get(i42);
                    if (ky0Var.a.a.b.a != ky0Var3.a.a.b.a) {
                        break;
                    }
                    int i43 = ky0Var.m;
                    int i44 = ky0Var3.m;
                    if (i43 < i44) {
                        z10 = true;
                        break;
                    }
                    int i45 = ky0Var3.l - i44;
                    if (i45 > 0) {
                        i37 = Math.min(i37, i45);
                    }
                    i42--;
                }
            }
            if (!z10) {
                ky0Var.l = ky0Var.m;
                ky0Var.g();
                max -= i37;
                int i46 = ky0Var.a.a.b.a;
                while (true) {
                    i46++;
                    if (i46 >= copyOf.length) {
                        break;
                    } else {
                        copyOf[i46] = copyOf[i46] - i37;
                    }
                }
                int size4 = arrayList3.size();
                int i47 = size2;
                int i48 = i34;
                int i49 = 0;
                while (i49 < size4) {
                    ky0 ky0Var4 = (ky0) arrayList3.get(i49);
                    if (ky0Var == ky0Var4) {
                        i13 = i49;
                    } else {
                        int i50 = ky0Var.a.a.b.a;
                        int i51 = ky0Var4.a.a.b.a;
                        if (i50 == i51) {
                            if (ky0Var4.m != ky0Var4.l) {
                                arrayList.remove(ky0Var4);
                                if (ky0Var4.d < i36) {
                                    i48--;
                                }
                                i47--;
                            }
                            int i52 = ky0Var4.l - i37;
                            ky0Var4.l = i52;
                            i13 = i49;
                            ky0Var4.d(ky0Var4.k, i52, true);
                        } else {
                            i13 = i49;
                            if (i50 < i51) {
                                ky0Var4.q -= i37;
                            }
                        }
                    }
                    i49 = i13 + 1;
                }
                i34 = i48;
                size2 = i47;
            }
            i34++;
        }
        int childCount3 = ry0Var.getChildCount();
        for (int i53 = 0; i53 < childCount3; i53++) {
            ky0 d9 = ry0Var.d(i53);
            ry0Var.K.onLayoutChild(d9.b, d9.b(), d9.c());
            d9.n = d9.p;
            d9.o = d9.k;
        }
        ry0Var.y = i17;
        ry0Var.A = max;
        ry0Var.B = copyOf;
        ry0Var.setMeasuredDimension(i17, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        hy0 hy0Var;
        super.requestLayout();
        hy0 hy0Var2 = this.c;
        if (hy0Var2 == null || (hy0Var = this.d) == null) {
            return;
        }
        hy0Var2.l();
        hy0Var.l();
    }

    public void setAlignmentMode(int i9) {
        this.h = i9;
        requestLayout();
    }

    public void setColumnCount(int i9) {
        this.c.n(i9);
        g();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z10) {
        hy0 hy0Var = this.c;
        hy0Var.u = z10;
        hy0Var.k();
        g();
        requestLayout();
    }

    public void setDrawLines(boolean z10) {
        this.C = z10;
    }

    public void setFillWidth(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        requestLayout();
    }

    public void setMinimumCellHeight(int i9) {
        this.w = i9;
        requestLayout();
    }

    public void setOrientation(int i9) {
        if (this.e != i9) {
            this.e = i9;
            g();
            requestLayout();
        }
    }

    public void setRenderWidth(int i9) {
        int i10;
        int measuredWidth = getMeasuredWidth();
        this.y = Math.max(measuredWidth, i9);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            ky0 d = d(i11);
            if (measuredWidth <= 0 || (i10 = this.y) == measuredWidth) {
                int i12 = d.n;
                int i13 = d.o + i12;
                d.p = i12;
                d.k = Math.max(0, i13 - i12);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f10 = measuredWidth;
                int round = Math.round((d.n * i10) / f10);
                int round2 = Math.round(((d.n + d.o) * this.y) / f10);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.B;
        if (iArr.length < 2) {
            this.A = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i14 = length - 1;
            int[] iArr2 = new int[i14];
            int i15 = 0;
            while (i15 < i14) {
                int[] iArr3 = this.B;
                int i16 = i15 + 1;
                iArr2[i15] = iArr3[i16] - iArr3[i15];
                i15 = i16;
            }
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                ky0 d9 = d(i17);
                jy0 jy0Var = d9.b;
                int emojiOnlyCount = jy0Var != null ? jy0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    ly0 ly0Var = d9.a.a.b;
                    int max = Math.max(0, ly0Var.a);
                    int min = Math.min(i14, ly0Var.b);
                    if (max < min) {
                        int i18 = 0;
                        for (int i19 = max; i19 < min; i19++) {
                            i18 += iArr2[i19];
                        }
                        int max2 = Math.max(1, Math.round(d9.k / emojiOnlyCount)) - i18;
                        while (max < min && max2 > 0) {
                            int i20 = min - max;
                            int i21 = ((max2 + i20) - 1) / i20;
                            iArr2[max] = iArr2[max] + i21;
                            max2 -= i21;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i22 = 0;
            while (i22 < i14) {
                int i23 = i22 + 1;
                iArr4[i23] = iArr4[i22] + iArr2[i22];
                i22 = i23;
            }
            this.A = iArr4[i14];
            for (int i24 = 0; i24 < getChildCount(); i24++) {
                ky0 d10 = d(i24);
                ly0 ly0Var2 = d10.a.a.b;
                int max3 = Math.max(0, Math.min(i14, ly0Var2.a));
                int max4 = Math.max(max3, Math.min(i14, ly0Var2.b));
                int i25 = iArr4[max3];
                int i26 = iArr4[max4];
                d10.q = i25;
                d10.l = Math.max(0, i26 - i25);
                if (d10.c != null) {
                    d10.g();
                }
                this.K.onLayoutChild(d10.b, d10.b(), d10.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i9) {
        this.d.n(i9);
        g();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z10) {
        hy0 hy0Var = this.d;
        hy0Var.u = z10;
        hy0Var.k();
        g();
        requestLayout();
    }

    public void setRtl(boolean z10) {
        this.E = z10;
    }

    public void setStriped(boolean z10) {
        this.D = z10;
    }

    public void setUseDefaultMargins(boolean z10) {
        this.f = z10;
        requestLayout();
    }
}
