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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cz0 extends View {
    public static final oy0 N = new oy0(0);
    public static final oy0 O = new oy0(1);
    public static final oy0 P = new oy0(3);
    public static final oy0 Q = new oy0(4);
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
    public final bz0 K;
    public final ArrayList L;
    public final az0 M;
    public final org.telegram.ui.Cells.k9 a;
    public int b;
    public final sy0 c;
    public final sy0 d;
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

    public cz0(Context context, bz0 bz0Var, org.telegram.ui.Cells.k9 k9Var) {
        super(context);
        this.c = new sy0(this, true);
        this.d = new sy0(this, false);
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
        this.a = k9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.K = bz0Var;
        az0 az0Var = new az0(this, this);
        this.M = az0Var;
        r0.j0.k(this, az0Var);
    }

    public static void i(xy0 xy0Var, int i10, int i11, int i12, int i13) {
        wy0 wy0Var = new wy0(i10, i11 + i10);
        zy0 zy0Var = xy0Var.a;
        xy0Var.a = new zy0(zy0Var.a, wy0Var, zy0Var.c, zy0Var.d);
        wy0 wy0Var2 = new wy0(i12, i13 + i12);
        zy0 zy0Var2 = xy0Var.b;
        xy0Var.b = new zy0(zy0Var2.a, wy0Var2, zy0Var2.c, zy0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.L;
        vy0 vy0Var = new vy0(this, arrayList.size());
        xy0 xy0Var = new xy0();
        wy0 wy0Var = new wy0(i11, i13 + i11);
        oy0 oy0Var = Q;
        xy0Var.a = new zy0(false, wy0Var, oy0Var, 0.0f);
        xy0Var.b = new zy0(false, new wy0(i10, i12 + i10), oy0Var, 0.0f);
        vy0Var.a = xy0Var;
        vy0Var.j = i11;
        arrayList.add(vy0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.L;
        vy0 vy0Var = new vy0(this, arrayList.size());
        vy0Var.c = pagetablecell;
        xy0 xy0Var = new xy0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        wy0 wy0Var = new wy0(i11, i13 + i11);
        oy0 oy0Var = Q;
        xy0Var.a = new zy0(false, wy0Var, oy0Var, 0.0f);
        xy0Var.b = new zy0(false, new wy0(i10, i12 + i10), oy0Var, 1.0f);
        vy0Var.a = xy0Var;
        vy0Var.j = i11;
        arrayList.add(vy0Var);
        if (pagetablecell.rowspan > 1) {
            this.G.add(new PointF(i11, i11 + r10));
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
            xy0 xy0Var = d(i17).a;
            zy0 zy0Var = z10 ? xy0Var.a : xy0Var.b;
            wy0 wy0Var = zy0Var.b;
            boolean z11 = zy0Var.a;
            int i18 = wy0Var.b;
            int i19 = wy0Var.a;
            int i20 = i18 - i19;
            if (z11) {
                i15 = i19;
            }
            zy0 zy0Var2 = z10 ? xy0Var.b : xy0Var.a;
            wy0 wy0Var2 = zy0Var2.b;
            boolean z12 = zy0Var2.a;
            int i21 = wy0Var2.b;
            int i22 = wy0Var2.a;
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
                i(xy0Var, i15, i20, i16, i23);
            } else {
                i(xy0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final vy0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.L;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (vy0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        az0 az0Var = this.M;
        if (az0Var == null || !az0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(vy0 vy0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(vy0Var, z10, z11);
        }
        sy0 sy0Var = z10 ? this.c : this.d;
        if (z11) {
            if (sy0Var.j == null) {
                sy0Var.j = new int[sy0Var.e() + 1];
            }
            if (!sy0Var.k) {
                sy0Var.b(true);
                sy0Var.k = true;
            }
            iArr = sy0Var.j;
        } else {
            if (sy0Var.l == null) {
                sy0Var.l = new int[sy0Var.e() + 1];
            }
            if (!sy0Var.m) {
                sy0Var.b(false);
                sy0Var.m = true;
            }
            iArr = sy0Var.l;
        }
        xy0 xy0Var = vy0Var.a;
        wy0 wy0Var = (z10 ? xy0Var.b : xy0Var.a).b;
        return iArr[z11 ? wy0Var.a : wy0Var.b];
    }

    public final int f(vy0 vy0Var, boolean z10, boolean z11) {
        xy0 xy0Var = vy0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) xy0Var).leftMargin : ((ViewGroup.MarginLayoutParams) xy0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) xy0Var).topMargin : ((ViewGroup.MarginLayoutParams) xy0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        zy0 zy0Var = z10 ? xy0Var.b : xy0Var.a;
        sy0 sy0Var = z10 ? this.c : this.d;
        wy0 wy0Var = zy0Var.b;
        if ((z10 && this.E) != z11) {
            int i11 = wy0Var.a;
            return 0;
        }
        int i12 = wy0Var.b;
        sy0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        sy0 sy0Var = this.c;
        sy0Var.k();
        sy0 sy0Var2 = this.d;
        sy0Var2.k();
        if (sy0Var == null || sy0Var2 == null) {
            return;
        }
        sy0Var.l();
        sy0Var2.l();
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

    public final void h(int i10, boolean z10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            vy0 d = d(i11);
            xy0 xy0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.K.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) xy0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) xy0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) xy0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) xy0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) xy0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) xy0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) xy0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                zy0 zy0Var = z11 ? xy0Var.b : xy0Var.a;
                if (zy0.a(zy0Var, z11) == Q) {
                    wy0 wy0Var = zy0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e10 = (g10[wy0Var.b] - g10[wy0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        uy0 uy0Var = d.b;
                        int emojiOnlyCount2 = uy0Var != null ? uy0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e10 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) xy0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e10, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) xy0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) xy0Var).width, e(d, false, false) + e(d, false, true) + e10, false);
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
        cz0 cz0Var = this;
        cz0Var.c();
        sy0 sy0Var = cz0Var.d;
        sy0 sy0Var2 = cz0Var.c;
        if (sy0Var2 != null && sy0Var != null) {
            sy0Var2.l();
            sy0Var.l();
        }
        cz0Var.b = 0;
        int childCount = cz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            cz0Var.b = Math.max(cz0Var.b, cz0Var.d(i16).a.b.b.b);
        }
        cz0Var.h(i10, true);
        if (cz0Var.e == 0) {
            i12 = sy0Var2.i(i10);
            if (cz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                sy0Var2.v.a = i12;
                sy0Var2.w.a = -i12;
                sy0Var2.q = false;
                sy0Var2.g();
            }
            cz0Var.h(i10, false);
            i13 = sy0Var.i(i11);
        } else {
            int i17 = sy0Var.i(i11);
            cz0Var.h(i10, false);
            i12 = sy0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, cz0Var.getSuggestedMinimumHeight());
        cz0Var.setMeasuredDimension(i12, max);
        sy0Var2.v.a = i12;
        sy0Var2.w.a = -i12;
        sy0Var2.q = false;
        sy0Var2.g();
        sy0Var.v.a = max;
        sy0Var.w.a = -max;
        sy0Var.q = false;
        sy0Var.g();
        int[] g10 = sy0Var2.g();
        int[] g11 = sy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = cz0Var.F;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = cz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            vy0 d = cz0Var.d(i20);
            xy0 xy0Var = d.a;
            zy0 zy0Var = xy0Var.b;
            zy0 zy0Var2 = xy0Var.a;
            wy0 wy0Var = zy0Var.b;
            wy0 wy0Var2 = zy0Var2.b;
            int i21 = childCount2;
            int i22 = g10[wy0Var.a];
            int i23 = g11[wy0Var2.a];
            int i24 = g10[wy0Var.b];
            int i25 = g11[wy0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            sy0 sy0Var3 = sy0Var;
            int i29 = d.l;
            oy0 a2 = zy0.a(zy0Var, true);
            oy0 a10 = zy0.a(zy0Var2, false);
            l3.g0 f9 = sy0Var2.f();
            ty0 ty0Var = (ty0) ((Object[]) f9.d)[((int[]) f9.b)[i20]];
            l3.g0 f10 = sy0Var3.f();
            sy0 sy0Var4 = sy0Var2;
            ty0 ty0Var2 = (ty0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            int b10 = a2.b(d, i26 - ty0Var.d(true));
            int b11 = a10.b(d, i27 - ty0Var2.d(true));
            int e10 = cz0Var.e(d, true, true);
            int e11 = cz0Var.e(d, false, true);
            int e12 = cz0Var.e(d, true, false);
            int i30 = e10 + e12;
            int e13 = e11 + cz0Var.e(d, false, false);
            int a11 = ty0Var.a(cz0Var, d, a2, i28 + i30, true);
            cz0Var = this;
            int a12 = ty0Var2.a(cz0Var, d, a10, i29 + e13, false);
            int c3 = a2.c(i28, i26 - i30);
            int c6 = a10.c(i29, i27 - e13);
            int i31 = i22 + b10 + a11;
            int i32 = !cz0Var.E ? e10 + i31 : ((i18 - c3) - e12) - i31;
            int i33 = i23 + b11 + a12 + e11;
            if (d.c != null) {
                if (c3 != d.k || c6 != d.l) {
                    d.d(c3, c6, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c6) {
                    wy0 wy0Var3 = d.a.a.b;
                    if (wy0Var3.b - wy0Var3.a <= 1) {
                        ArrayList arrayList2 = cz0Var.G;
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
            sy0Var = sy0Var3;
            childCount2 = i21;
            sy0Var2 = sy0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            vy0 vy0Var = (vy0) arrayList.get(i35);
            int i36 = vy0Var.l;
            int i37 = vy0Var.d;
            int i38 = i36 - vy0Var.m;
            ArrayList arrayList3 = cz0Var.L;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                vy0 vy0Var2 = (vy0) arrayList3.get(i39);
                if (vy0Var.a.a.b.a != vy0Var2.a.a.b.a) {
                    break;
                }
                int i40 = vy0Var.m;
                int i41 = vy0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = vy0Var2.l - i41;
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
                    vy0 vy0Var3 = (vy0) arrayList3.get(i43);
                    if (vy0Var.a.a.b.a != vy0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = vy0Var.m;
                    int i45 = vy0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = vy0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                vy0Var.l = vy0Var.m;
                vy0Var.g();
                max -= i38;
                int i47 = vy0Var.a.a.b.a;
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
                    vy0 vy0Var4 = (vy0) arrayList3.get(i50);
                    if (vy0Var == vy0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = vy0Var.a.a.b.a;
                        int i52 = vy0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (vy0Var4.m != vy0Var4.l) {
                                arrayList.remove(vy0Var4);
                                if (vy0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = vy0Var4.l - i38;
                            vy0Var4.l = i53;
                            i14 = i50;
                            vy0Var4.d(vy0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                vy0Var4.q -= i38;
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
        int childCount3 = cz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            vy0 d10 = cz0Var.d(i54);
            cz0Var.K.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        cz0Var.y = i18;
        cz0Var.A = max;
        cz0Var.B = copyOf;
        cz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        sy0 sy0Var;
        super.requestLayout();
        sy0 sy0Var2 = this.c;
        if (sy0Var2 == null || (sy0Var = this.d) == null) {
            return;
        }
        sy0Var2.l();
        sy0Var.l();
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
        sy0 sy0Var = this.c;
        sy0Var.u = z10;
        sy0Var.k();
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
            vy0 d = d(i12);
            if (measuredWidth <= 0 || (i11 = this.y) == measuredWidth) {
                int i13 = d.n;
                int i14 = d.o + i13;
                d.p = i13;
                d.k = Math.max(0, i14 - i13);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f9 = measuredWidth;
                int round = Math.round((d.n * i11) / f9);
                int round2 = Math.round(((d.n + d.o) * this.y) / f9);
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
            int i15 = length - 1;
            int[] iArr2 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int[] iArr3 = this.B;
                int i17 = i16 + 1;
                iArr2[i16] = iArr3[i17] - iArr3[i16];
                i16 = i17;
            }
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                vy0 d10 = d(i18);
                uy0 uy0Var = d10.b;
                int emojiOnlyCount = uy0Var != null ? uy0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    wy0 wy0Var = d10.a.a.b;
                    int max = Math.max(0, wy0Var.a);
                    int min = Math.min(i15, wy0Var.b);
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
            this.A = iArr4[i15];
            for (int i25 = 0; i25 < getChildCount(); i25++) {
                vy0 d11 = d(i25);
                wy0 wy0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, wy0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, wy0Var2.b));
                int i26 = iArr4[max3];
                int i27 = iArr4[max4];
                d11.q = i26;
                d11.l = Math.max(0, i27 - i26);
                if (d11.c != null) {
                    d11.g();
                }
                this.K.onLayoutChild(d11.b, d11.b(), d11.c());
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
        sy0 sy0Var = this.d;
        sy0Var.u = z10;
        sy0Var.k();
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
