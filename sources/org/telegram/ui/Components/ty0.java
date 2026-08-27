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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ty0 extends View {
    public static final fy0 N = new fy0(0);
    public static final fy0 O = new fy0(1);
    public static final fy0 P = new fy0(3);
    public static final fy0 Q = new fy0(4);
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
    public final sy0 K;
    public final ArrayList L;
    public final ry0 M;
    public final org.telegram.ui.Cells.j9 a;
    public int b;
    public final jy0 c;
    public final jy0 d;
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

    public ty0(Context context, sy0 sy0Var, org.telegram.ui.Cells.j9 j9Var) {
        super(context);
        this.c = new jy0(this, true);
        this.d = new jy0(this, false);
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
        this.a = j9Var;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.K = sy0Var;
        ry0 ry0Var = new ry0(this, this);
        this.M = ry0Var;
        r0.j0.k(this, ry0Var);
    }

    public static void i(oy0 oy0Var, int i10, int i11, int i12, int i13) {
        ny0 ny0Var = new ny0(i10, i11 + i10);
        qy0 qy0Var = oy0Var.a;
        oy0Var.a = new qy0(qy0Var.a, ny0Var, qy0Var.c, qy0Var.d);
        ny0 ny0Var2 = new ny0(i12, i13 + i12);
        qy0 qy0Var2 = oy0Var.b;
        oy0Var.b = new qy0(qy0Var2.a, ny0Var2, qy0Var2.c, qy0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.L;
        my0 my0Var = new my0(this, arrayList.size());
        oy0 oy0Var = new oy0();
        ny0 ny0Var = new ny0(i11, i13 + i11);
        fy0 fy0Var = Q;
        oy0Var.a = new qy0(false, ny0Var, fy0Var, 0.0f);
        oy0Var.b = new qy0(false, new ny0(i10, i12 + i10), fy0Var, 0.0f);
        my0Var.a = oy0Var;
        my0Var.j = i11;
        arrayList.add(my0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.L;
        my0 my0Var = new my0(this, arrayList.size());
        my0Var.c = pagetablecell;
        oy0 oy0Var = new oy0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        ny0 ny0Var = new ny0(i11, i13 + i11);
        fy0 fy0Var = Q;
        oy0Var.a = new qy0(false, ny0Var, fy0Var, 0.0f);
        oy0Var.b = new qy0(false, new ny0(i10, i12 + i10), fy0Var, 1.0f);
        my0Var.a = oy0Var;
        my0Var.j = i11;
        arrayList.add(my0Var);
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
            oy0 oy0Var = d(i17).a;
            qy0 qy0Var = z10 ? oy0Var.a : oy0Var.b;
            ny0 ny0Var = qy0Var.b;
            boolean z11 = qy0Var.a;
            int i18 = ny0Var.b;
            int i19 = ny0Var.a;
            int i20 = i18 - i19;
            if (z11) {
                i15 = i19;
            }
            qy0 qy0Var2 = z10 ? oy0Var.b : oy0Var.a;
            ny0 ny0Var2 = qy0Var2.b;
            boolean z12 = qy0Var2.a;
            int i21 = ny0Var2.b;
            int i22 = ny0Var2.a;
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
                i(oy0Var, i15, i20, i16, i23);
            } else {
                i(oy0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final my0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.L;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (my0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ry0 ry0Var = this.M;
        if (ry0Var == null || !ry0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(my0 my0Var, boolean z10, boolean z11) {
        int[] iArr;
        if (this.h == 1) {
            return f(my0Var, z10, z11);
        }
        jy0 jy0Var = z10 ? this.c : this.d;
        if (z11) {
            if (jy0Var.j == null) {
                jy0Var.j = new int[jy0Var.e() + 1];
            }
            if (!jy0Var.k) {
                jy0Var.b(true);
                jy0Var.k = true;
            }
            iArr = jy0Var.j;
        } else {
            if (jy0Var.l == null) {
                jy0Var.l = new int[jy0Var.e() + 1];
            }
            if (!jy0Var.m) {
                jy0Var.b(false);
                jy0Var.m = true;
            }
            iArr = jy0Var.l;
        }
        oy0 oy0Var = my0Var.a;
        ny0 ny0Var = (z10 ? oy0Var.b : oy0Var.a).b;
        return iArr[z11 ? ny0Var.a : ny0Var.b];
    }

    public final int f(my0 my0Var, boolean z10, boolean z11) {
        oy0 oy0Var = my0Var.a;
        int i10 = z10 ? z11 ? ((ViewGroup.MarginLayoutParams) oy0Var).leftMargin : ((ViewGroup.MarginLayoutParams) oy0Var).rightMargin : z11 ? ((ViewGroup.MarginLayoutParams) oy0Var).topMargin : ((ViewGroup.MarginLayoutParams) oy0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        qy0 qy0Var = z10 ? oy0Var.b : oy0Var.a;
        jy0 jy0Var = z10 ? this.c : this.d;
        ny0 ny0Var = qy0Var.b;
        if ((z10 && this.E) != z11) {
            int i11 = ny0Var.a;
            return 0;
        }
        int i12 = ny0Var.b;
        jy0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        jy0 jy0Var = this.c;
        jy0Var.k();
        jy0 jy0Var2 = this.d;
        jy0Var2.k();
        if (jy0Var == null || jy0Var2 == null) {
            return;
        }
        jy0Var.l();
        jy0Var2.l();
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
            my0 d = d(i11);
            oy0 oy0Var = d.a;
            if (z10) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.K.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) oy0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) oy0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) oy0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) oy0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) oy0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) oy0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) oy0Var).height, true);
            } else {
                boolean z11 = this.e == 0;
                qy0 qy0Var = z11 ? oy0Var.b : oy0Var.a;
                if (qy0.a(qy0Var, z11) == Q) {
                    ny0 ny0Var = qy0Var.b;
                    int[] g10 = (z11 ? this.c : this.d).g();
                    int e9 = (g10[ny0Var.b] - g10[ny0Var.a]) - (e(d, z11, false) + e(d, z11, true));
                    if (z11) {
                        ly0 ly0Var = d.b;
                        int emojiOnlyCount2 = ly0Var != null ? ly0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e9 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) oy0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e9, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) oy0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) oy0Var).width, e(d, false, false) + e(d, false, true) + e9, false);
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
        ty0 ty0Var = this;
        ty0Var.c();
        jy0 jy0Var = ty0Var.d;
        jy0 jy0Var2 = ty0Var.c;
        if (jy0Var2 != null && jy0Var != null) {
            jy0Var2.l();
            jy0Var.l();
        }
        ty0Var.b = 0;
        int childCount = ty0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            ty0Var.b = Math.max(ty0Var.b, ty0Var.d(i16).a.b.b.b);
        }
        ty0Var.h(i10, true);
        if (ty0Var.e == 0) {
            i12 = jy0Var2.i(i10);
            if (ty0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                jy0Var2.v.a = i12;
                jy0Var2.w.a = -i12;
                jy0Var2.q = false;
                jy0Var2.g();
            }
            ty0Var.h(i10, false);
            i13 = jy0Var.i(i11);
        } else {
            int i17 = jy0Var.i(i11);
            ty0Var.h(i10, false);
            i12 = jy0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, ty0Var.getSuggestedMinimumHeight());
        ty0Var.setMeasuredDimension(i12, max);
        jy0Var2.v.a = i12;
        jy0Var2.w.a = -i12;
        jy0Var2.q = false;
        jy0Var2.g();
        jy0Var.v.a = max;
        jy0Var.w.a = -max;
        jy0Var.q = false;
        jy0Var.g();
        int[] g10 = jy0Var2.g();
        int[] g11 = jy0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = ty0Var.F;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = ty0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            my0 d = ty0Var.d(i20);
            oy0 oy0Var = d.a;
            qy0 qy0Var = oy0Var.b;
            qy0 qy0Var2 = oy0Var.a;
            ny0 ny0Var = qy0Var.b;
            ny0 ny0Var2 = qy0Var2.b;
            int i21 = childCount2;
            int i22 = g10[ny0Var.a];
            int i23 = g11[ny0Var2.a];
            int i24 = g10[ny0Var.b];
            int i25 = g11[ny0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            jy0 jy0Var3 = jy0Var;
            int i29 = d.l;
            fy0 a2 = qy0.a(qy0Var, true);
            fy0 a3 = qy0.a(qy0Var2, false);
            j9.a f10 = jy0Var2.f();
            ky0 ky0Var = (ky0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            j9.a f11 = jy0Var3.f();
            jy0 jy0Var4 = jy0Var2;
            ky0 ky0Var2 = (ky0) ((Object[]) f11.d)[((int[]) f11.b)[i20]];
            int b10 = a2.b(d, i26 - ky0Var.d(true));
            int b11 = a3.b(d, i27 - ky0Var2.d(true));
            int e9 = ty0Var.e(d, true, true);
            int e10 = ty0Var.e(d, false, true);
            int e11 = ty0Var.e(d, true, false);
            int i30 = e9 + e11;
            int e12 = e10 + ty0Var.e(d, false, false);
            int a10 = ky0Var.a(ty0Var, d, a2, i28 + i30, true);
            ty0Var = this;
            int a11 = ky0Var2.a(ty0Var, d, a3, i29 + e12, false);
            int c10 = a2.c(i28, i26 - i30);
            int c11 = a3.c(i29, i27 - e12);
            int i31 = i22 + b10 + a10;
            int i32 = !ty0Var.E ? e9 + i31 : ((i18 - c10) - e11) - i31;
            int i33 = i23 + b11 + a11 + e10;
            if (d.c != null) {
                if (c10 != d.k || c11 != d.l) {
                    d.d(c10, c11, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c11) {
                    ny0 ny0Var3 = d.a.a.b;
                    if (ny0Var3.b - ny0Var3.a <= 1) {
                        ArrayList arrayList2 = ty0Var.G;
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
            jy0Var = jy0Var3;
            childCount2 = i21;
            jy0Var2 = jy0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            my0 my0Var = (my0) arrayList.get(i35);
            int i36 = my0Var.l;
            int i37 = my0Var.d;
            int i38 = i36 - my0Var.m;
            ArrayList arrayList3 = ty0Var.L;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                my0 my0Var2 = (my0) arrayList3.get(i39);
                if (my0Var.a.a.b.a != my0Var2.a.a.b.a) {
                    break;
                }
                int i40 = my0Var.m;
                int i41 = my0Var2.m;
                if (i40 < i41) {
                    z10 = true;
                    break;
                }
                int i42 = my0Var2.l - i41;
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
                    my0 my0Var3 = (my0) arrayList3.get(i43);
                    if (my0Var.a.a.b.a != my0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = my0Var.m;
                    int i45 = my0Var3.m;
                    if (i44 < i45) {
                        z10 = true;
                        break;
                    }
                    int i46 = my0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z10) {
                my0Var.l = my0Var.m;
                my0Var.g();
                max -= i38;
                int i47 = my0Var.a.a.b.a;
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
                    my0 my0Var4 = (my0) arrayList3.get(i50);
                    if (my0Var == my0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = my0Var.a.a.b.a;
                        int i52 = my0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (my0Var4.m != my0Var4.l) {
                                arrayList.remove(my0Var4);
                                if (my0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = my0Var4.l - i38;
                            my0Var4.l = i53;
                            i14 = i50;
                            my0Var4.d(my0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                my0Var4.q -= i38;
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
        int childCount3 = ty0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            my0 d10 = ty0Var.d(i54);
            ty0Var.K.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        ty0Var.y = i18;
        ty0Var.A = max;
        ty0Var.B = copyOf;
        ty0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        jy0 jy0Var;
        super.requestLayout();
        jy0 jy0Var2 = this.c;
        if (jy0Var2 == null || (jy0Var = this.d) == null) {
            return;
        }
        jy0Var2.l();
        jy0Var.l();
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
        jy0 jy0Var = this.c;
        jy0Var.u = z10;
        jy0Var.k();
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
            my0 d = d(i12);
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
                my0 d10 = d(i18);
                ly0 ly0Var = d10.b;
                int emojiOnlyCount = ly0Var != null ? ly0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    ny0 ny0Var = d10.a.a.b;
                    int max = Math.max(0, ny0Var.a);
                    int min = Math.min(i15, ny0Var.b);
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
                my0 d11 = d(i25);
                ny0 ny0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, ny0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, ny0Var2.b));
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
        jy0 jy0Var = this.d;
        jy0Var.u = z10;
        jy0Var.k();
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
