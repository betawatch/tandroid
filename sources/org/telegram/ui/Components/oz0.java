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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oz0 extends View {
    public static final az0 O = new az0(0);
    public static final az0 P = new az0(1);
    public static final az0 Q = new az0(3);
    public static final az0 R = new az0(4);
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
    public final nz0 L;
    public final ArrayList M;
    public final mz0 N;
    public final org.telegram.ui.Cells.m9 a;
    public int b;
    public final ez0 c;
    public final ez0 d;
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

    public oz0(Context context, nz0 nz0Var, org.telegram.ui.Cells.m9 m9Var) {
        super(context);
        this.c = new ez0(this, true);
        this.d = new ez0(this, false);
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
        this.L = nz0Var;
        mz0 mz0Var = new mz0(this, this);
        this.N = mz0Var;
        r0.j0.k(this, mz0Var);
    }

    public static void i(jz0 jz0Var, int i10, int i11, int i12, int i13) {
        iz0 iz0Var = new iz0(i10, i11 + i10);
        lz0 lz0Var = jz0Var.a;
        jz0Var.a = new lz0(lz0Var.a, iz0Var, lz0Var.c, lz0Var.d);
        iz0 iz0Var2 = new iz0(i12, i13 + i12);
        lz0 lz0Var2 = jz0Var.b;
        jz0Var.b = new lz0(lz0Var2.a, iz0Var2, lz0Var2.c, lz0Var2.d);
    }

    public final void a(int i10, int i11, int i12, int i13) {
        ArrayList arrayList = this.M;
        hz0 hz0Var = new hz0(this, arrayList.size());
        jz0 jz0Var = new jz0();
        iz0 iz0Var = new iz0(i11, i13 + i11);
        az0 az0Var = R;
        jz0Var.a = new lz0(false, iz0Var, az0Var, 0.0f);
        jz0Var.b = new lz0(false, new iz0(i10, i12 + i10), az0Var, 0.0f);
        hz0Var.a = jz0Var;
        hz0Var.j = i11;
        arrayList.add(hz0Var);
        g();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 1;
        }
        ArrayList arrayList = this.M;
        hz0 hz0Var = new hz0(this, arrayList.size());
        hz0Var.c = pagetablecell;
        jz0 jz0Var = new jz0();
        int i13 = pagetablecell.rowspan;
        if (i13 == 0) {
            i13 = 1;
        }
        iz0 iz0Var = new iz0(i11, i13 + i11);
        az0 az0Var = R;
        jz0Var.a = new lz0(false, iz0Var, az0Var, 0.0f);
        jz0Var.b = new lz0(false, new iz0(i10, i12 + i10), az0Var, 1.0f);
        hz0Var.a = jz0Var;
        hz0Var.j = i11;
        arrayList.add(hz0Var);
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
            jz0 jz0Var = d(i17).a;
            lz0 lz0Var = z4 ? jz0Var.a : jz0Var.b;
            iz0 iz0Var = lz0Var.b;
            boolean z10 = lz0Var.a;
            int i18 = iz0Var.b;
            int i19 = iz0Var.a;
            int i20 = i18 - i19;
            if (z10) {
                i15 = i19;
            }
            lz0 lz0Var2 = z4 ? jz0Var.b : jz0Var.a;
            iz0 iz0Var2 = lz0Var2.b;
            boolean z11 = lz0Var2.a;
            int i21 = iz0Var2.b;
            int i22 = iz0Var2.a;
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
                i(jz0Var, i15, i20, i16, i23);
            } else {
                i(jz0Var, i16, i23, i15, i20);
            }
            i16 += i23;
        }
        int childCount3 = getChildCount();
        for (int i26 = 0; i26 < childCount3; i26++) {
            i11 = (i11 * 31) + d(i26).a.hashCode();
        }
        this.n = i11;
    }

    public final hz0 d(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.M;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (hz0) arrayList.get(i10);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        mz0 mz0Var = this.N;
        if (mz0Var == null || !mz0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(hz0 hz0Var, boolean z4, boolean z10) {
        int[] iArr;
        if (this.h == 1) {
            return f(hz0Var, z4, z10);
        }
        ez0 ez0Var = z4 ? this.c : this.d;
        if (z10) {
            if (ez0Var.j == null) {
                ez0Var.j = new int[ez0Var.e() + 1];
            }
            if (!ez0Var.k) {
                ez0Var.b(true);
                ez0Var.k = true;
            }
            iArr = ez0Var.j;
        } else {
            if (ez0Var.l == null) {
                ez0Var.l = new int[ez0Var.e() + 1];
            }
            if (!ez0Var.m) {
                ez0Var.b(false);
                ez0Var.m = true;
            }
            iArr = ez0Var.l;
        }
        jz0 jz0Var = hz0Var.a;
        iz0 iz0Var = (z4 ? jz0Var.b : jz0Var.a).b;
        return iArr[z10 ? iz0Var.a : iz0Var.b];
    }

    public final int f(hz0 hz0Var, boolean z4, boolean z10) {
        jz0 jz0Var = hz0Var.a;
        int i10 = z4 ? z10 ? ((ViewGroup.MarginLayoutParams) jz0Var).leftMargin : ((ViewGroup.MarginLayoutParams) jz0Var).rightMargin : z10 ? ((ViewGroup.MarginLayoutParams) jz0Var).topMargin : ((ViewGroup.MarginLayoutParams) jz0Var).bottomMargin;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (!this.f) {
            return 0;
        }
        lz0 lz0Var = z4 ? jz0Var.b : jz0Var.a;
        ez0 ez0Var = z4 ? this.c : this.d;
        iz0 iz0Var = lz0Var.b;
        if ((z4 && this.F) != z10) {
            int i11 = iz0Var.a;
            return 0;
        }
        int i12 = iz0Var.b;
        ez0Var.e();
        return 0;
    }

    public final void g() {
        this.n = 0;
        ez0 ez0Var = this.c;
        ez0Var.k();
        ez0 ez0Var2 = this.d;
        ez0Var2.k();
        if (ez0Var == null || ez0Var2 == null) {
            return;
        }
        ez0Var.l();
        ez0Var2.l();
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
            hz0 d = d(i11);
            jz0 jz0Var = d.a;
            if (z4) {
                int size = View.MeasureSpec.getSize(i10);
                d.e(this.L.createTextLayout(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.v * 4) : (int) (size / 1.5f)));
                if (d.b != null) {
                    ((ViewGroup.MarginLayoutParams) jz0Var).height = Math.max(this.w, d.f + this.r + this.s);
                    int emojiOnlyCount = d.b.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) jz0Var).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) jz0Var).height * emojiOnlyCount : (this.v * 2) + d.e;
                } else {
                    ((ViewGroup.MarginLayoutParams) jz0Var).width = 0;
                    ((ViewGroup.MarginLayoutParams) jz0Var).height = 0;
                }
                d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) jz0Var).width, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) jz0Var).height, true);
            } else {
                boolean z10 = this.e == 0;
                lz0 lz0Var = z10 ? jz0Var.b : jz0Var.a;
                if (lz0.a(lz0Var, z10) == R) {
                    iz0 iz0Var = lz0Var.b;
                    int[] g10 = (z10 ? this.c : this.d).g();
                    int e6 = (g10[iz0Var.b] - g10[iz0Var.a]) - (e(d, z10, false) + e(d, z10, true));
                    if (z10) {
                        gz0 gz0Var = d.b;
                        int emojiOnlyCount2 = gz0Var != null ? gz0Var.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int max = Math.max(1, Math.round(e6 / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) jz0Var).height = max;
                            d.m = max;
                        }
                        d.d(e(d, true, false) + e(d, true, true) + e6, e(d, false, false) + e(d, false, true) + ((ViewGroup.MarginLayoutParams) jz0Var).height, false);
                    } else {
                        d.d(e(d, true, false) + e(d, true, true) + ((ViewGroup.MarginLayoutParams) jz0Var).width, e(d, false, false) + e(d, false, true) + e6, false);
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
        oz0 oz0Var = this;
        oz0Var.c();
        ez0 ez0Var = oz0Var.d;
        ez0 ez0Var2 = oz0Var.c;
        if (ez0Var2 != null && ez0Var != null) {
            ez0Var2.l();
            ez0Var.l();
        }
        oz0Var.b = 0;
        int childCount = oz0Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            oz0Var.b = Math.max(oz0Var.b, oz0Var.d(i16).a.b.b.b);
        }
        oz0Var.h(i10, true);
        if (oz0Var.e == 0) {
            i12 = ez0Var2.i(i10);
            if (oz0Var.x) {
                i12 = Math.max(i12, View.MeasureSpec.getSize(i10));
                ez0Var2.v.a = i12;
                ez0Var2.w.a = -i12;
                ez0Var2.q = false;
                ez0Var2.g();
            }
            oz0Var.h(i10, false);
            i13 = ez0Var.i(i11);
        } else {
            int i17 = ez0Var.i(i11);
            oz0Var.h(i10, false);
            i12 = ez0Var2.i(i10);
            i13 = i17;
        }
        int max = Math.max(i13, oz0Var.getSuggestedMinimumHeight());
        oz0Var.setMeasuredDimension(i12, max);
        ez0Var2.v.a = i12;
        ez0Var2.w.a = -i12;
        ez0Var2.q = false;
        ez0Var2.g();
        ez0Var.v.a = max;
        ez0Var.w.a = -max;
        ez0Var.q = false;
        ez0Var.g();
        int[] g10 = ez0Var2.g();
        int[] g11 = ez0Var.g();
        int[] copyOf = Arrays.copyOf(g11, g11.length);
        ArrayList arrayList = oz0Var.G;
        arrayList.clear();
        int i18 = g10[g10.length - 1];
        int childCount2 = oz0Var.getChildCount();
        int i19 = 0;
        while (i19 < childCount2) {
            int i20 = i19;
            hz0 d = oz0Var.d(i20);
            jz0 jz0Var = d.a;
            lz0 lz0Var = jz0Var.b;
            lz0 lz0Var2 = jz0Var.a;
            iz0 iz0Var = lz0Var.b;
            iz0 iz0Var2 = lz0Var2.b;
            int i21 = childCount2;
            int i22 = g10[iz0Var.a];
            int i23 = g11[iz0Var2.a];
            int i24 = g10[iz0Var.b];
            int i25 = g11[iz0Var2.b];
            int i26 = i24 - i22;
            int i27 = i25 - i23;
            int i28 = d.k;
            ez0 ez0Var3 = ez0Var;
            int i29 = d.l;
            az0 a2 = lz0.a(lz0Var, true);
            az0 a10 = lz0.a(lz0Var2, false);
            l7.w0 f10 = ez0Var2.f();
            fz0 fz0Var = (fz0) ((Object[]) f10.d)[((int[]) f10.b)[i20]];
            l7.w0 f11 = ez0Var3.f();
            ez0 ez0Var4 = ez0Var2;
            fz0 fz0Var2 = (fz0) ((Object[]) f11.d)[((int[]) f11.b)[i20]];
            int b10 = a2.b(d, i26 - fz0Var.d(true));
            int b11 = a10.b(d, i27 - fz0Var2.d(true));
            int e6 = oz0Var.e(d, true, true);
            int e10 = oz0Var.e(d, false, true);
            int e11 = oz0Var.e(d, true, false);
            int i30 = e6 + e11;
            int e12 = e10 + oz0Var.e(d, false, false);
            int a11 = fz0Var.a(oz0Var, d, a2, i28 + i30, true);
            oz0Var = this;
            int a12 = fz0Var2.a(oz0Var, d, a10, i29 + e12, false);
            int c3 = a2.c(i28, i26 - i30);
            int c10 = a10.c(i29, i27 - e12);
            int i31 = i22 + b10 + a11;
            int i32 = !oz0Var.F ? e6 + i31 : ((i18 - c3) - e11) - i31;
            int i33 = i23 + b11 + a12 + e10;
            if (d.c != null) {
                if (c3 != d.k || c10 != d.l) {
                    d.d(c3, c10, false);
                }
                int i34 = d.m;
                if (i34 != 0 && i34 != c10) {
                    iz0 iz0Var3 = d.a.a.b;
                    if (iz0Var3.b - iz0Var3.a <= 1) {
                        ArrayList arrayList2 = oz0Var.H;
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
            ez0Var = ez0Var3;
            childCount2 = i21;
            ez0Var2 = ez0Var4;
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            hz0 hz0Var = (hz0) arrayList.get(i35);
            int i36 = hz0Var.l;
            int i37 = hz0Var.d;
            int i38 = i36 - hz0Var.m;
            ArrayList arrayList3 = oz0Var.M;
            int size3 = arrayList3.size();
            for (int i39 = i37 + 1; i39 < size3; i39++) {
                hz0 hz0Var2 = (hz0) arrayList3.get(i39);
                if (hz0Var.a.a.b.a != hz0Var2.a.a.b.a) {
                    break;
                }
                int i40 = hz0Var.m;
                int i41 = hz0Var2.m;
                if (i40 < i41) {
                    z4 = true;
                    break;
                }
                int i42 = hz0Var2.l - i41;
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
                    hz0 hz0Var3 = (hz0) arrayList3.get(i43);
                    if (hz0Var.a.a.b.a != hz0Var3.a.a.b.a) {
                        break;
                    }
                    int i44 = hz0Var.m;
                    int i45 = hz0Var3.m;
                    if (i44 < i45) {
                        z4 = true;
                        break;
                    }
                    int i46 = hz0Var3.l - i45;
                    if (i46 > 0) {
                        i38 = Math.min(i38, i46);
                    }
                    i43--;
                }
            }
            if (!z4) {
                hz0Var.l = hz0Var.m;
                hz0Var.g();
                max -= i38;
                int i47 = hz0Var.a.a.b.a;
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
                    hz0 hz0Var4 = (hz0) arrayList3.get(i50);
                    if (hz0Var == hz0Var4) {
                        i14 = i50;
                    } else {
                        int i51 = hz0Var.a.a.b.a;
                        int i52 = hz0Var4.a.a.b.a;
                        if (i51 == i52) {
                            if (hz0Var4.m != hz0Var4.l) {
                                arrayList.remove(hz0Var4);
                                if (hz0Var4.d < i37) {
                                    i49--;
                                }
                                i48--;
                            }
                            int i53 = hz0Var4.l - i38;
                            hz0Var4.l = i53;
                            i14 = i50;
                            hz0Var4.d(hz0Var4.k, i53, true);
                        } else {
                            i14 = i50;
                            if (i51 < i52) {
                                hz0Var4.q -= i38;
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
        int childCount3 = oz0Var.getChildCount();
        for (int i54 = 0; i54 < childCount3; i54++) {
            hz0 d10 = oz0Var.d(i54);
            oz0Var.L.onLayoutChild(d10.b, d10.b(), d10.c());
            d10.n = d10.p;
            d10.o = d10.k;
        }
        oz0Var.y = i18;
        oz0Var.B = max;
        oz0Var.C = copyOf;
        oz0Var.setMeasuredDimension(i18, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        ez0 ez0Var;
        super.requestLayout();
        ez0 ez0Var2 = this.c;
        if (ez0Var2 == null || (ez0Var = this.d) == null) {
            return;
        }
        ez0Var2.l();
        ez0Var.l();
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
        ez0 ez0Var = this.c;
        ez0Var.u = z4;
        ez0Var.k();
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
            hz0 d = d(i12);
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
                hz0 d10 = d(i18);
                gz0 gz0Var = d10.b;
                int emojiOnlyCount = gz0Var != null ? gz0Var.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    iz0 iz0Var = d10.a.a.b;
                    int max = Math.max(0, iz0Var.a);
                    int min = Math.min(i15, iz0Var.b);
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
                hz0 d11 = d(i25);
                iz0 iz0Var2 = d11.a.a.b;
                int max3 = Math.max(0, Math.min(i15, iz0Var2.a));
                int max4 = Math.max(max3, Math.min(i15, iz0Var2.b));
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
        ez0 ez0Var = this.d;
        ez0Var.u = z4;
        ez0Var.k();
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
