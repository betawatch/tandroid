// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ehb extends View {
    public static final qgb T = new qgb(0);
    public static final qgb U = new qgb(1);
    public static final qgb V = new qgb(3);
    public static final qgb W = new qgb(4);
    public int E;
    public int F;
    public int[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final Path M;
    public final RectF N;
    public final float[] O;
    public final dhb P;
    public final ArrayList Q;
    public boolean R;
    public final chb S;
    public final gkb a;
    public int b;
    public final ugb c;
    public final ugb d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public ehb(Context context, dhb dhbVar, gkb gkbVar) {
        super(context);
        this.c = new ugb(this, true);
        this.d = new ugb(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = gm.L(8.0f);
        this.s = gm.L(9.0f);
        this.w = gm.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = gkbVar;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = dhbVar;
        chb chbVar = new chb(this, this);
        this.S = chbVar;
        kfc.k(this, chbVar);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(zgb zgbVar, int i, int i2, int i3, int i4) {
        ygb ygbVar = new ygb(i, i2 + i);
        bhb bhbVar = zgbVar.a;
        zgbVar.a = new bhb(bhbVar.a, ygbVar, bhbVar.c, bhbVar.d);
        ygb ygbVar2 = new ygb(i3, i4 + i3);
        bhb bhbVar2 = zgbVar.b;
        zgbVar.b = new bhb(bhbVar2.a, ygbVar2, bhbVar2.c, bhbVar2.d);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.Q;
        xgb xgbVar = new xgb(this, arrayList.size());
        zgb zgbVar = new zgb();
        ygb ygbVar = new ygb(i2, i4 + i2);
        qgb qgbVar = W;
        zgbVar.a = new bhb(false, ygbVar, qgbVar, 0.0f);
        zgbVar.b = new bhb(false, new ygb(i, i3 + i), qgbVar, 0.0f);
        xgbVar.a = zgbVar;
        xgbVar.j = i2;
        arrayList.add(xgbVar);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.Q;
        xgb xgbVar = new xgb(this, arrayList.size());
        xgbVar.c = pagetablecell;
        zgb zgbVar = new zgb();
        int i4 = pagetablecell.rowspan;
        if (i4 == 0) {
            i4 = 1;
        }
        ygb ygbVar = new ygb(i2, i4 + i2);
        qgb qgbVar = W;
        zgbVar.a = new bhb(false, ygbVar, qgbVar, 0.0f);
        zgbVar.b = new bhb(false, new ygb(i, i3 + i), qgbVar, 1.0f);
        xgbVar.a = zgbVar;
        xgbVar.j = i2;
        arrayList.add(xgbVar);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i2, i2 + r10));
        }
        h();
    }

    public final void c() {
        Throwable th;
        int i = this.n;
        if (i != 0) {
            int childCount = getChildCount();
            int i2 = 1;
            for (int i3 = 0; i3 < childCount; i3++) {
                i2 = (i2 * 31) + d(i3).a.hashCode();
            }
            if (i != i2) {
                h();
                c();
                return;
            }
            return;
        }
        boolean z = this.e == 0;
        int i4 = (z ? this.c : this.d).b;
        if (i4 == Integer.MIN_VALUE) {
            i4 = 0;
        }
        if (i4 < 0 || i4 > 1024) {
            g("Table grid count out of bounds");
            throw null;
        }
        int[] iArr = new int[i4];
        int childCount2 = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount2; i7++) {
            zgb zgbVar = d(i7).a;
            bhb bhbVar = z ? zgbVar.a : zgbVar.b;
            ygb ygbVar = bhbVar.b;
            boolean z2 = bhbVar.a;
            int a = ygbVar.a();
            if (a <= 0 || a > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z2) {
                i5 = ygbVar.a;
            }
            bhb bhbVar2 = z ? zgbVar.b : zgbVar.a;
            ygb ygbVar2 = bhbVar2.b;
            int a2 = ygbVar2.a();
            int i8 = ygbVar2.a;
            if (a2 > 0) {
                th = null;
                if (ygbVar2.a() <= 1024) {
                    boolean z3 = bhbVar2.a;
                    int a3 = ygbVar2.a();
                    if (i4 != 0) {
                        a3 = Math.min(a3, i4 - (z3 ? Math.min(i8, i4) : 0));
                    }
                    if (z3) {
                        i6 = i8;
                    }
                    if (i4 != 0) {
                        if (!z2 || !z3) {
                            while (true) {
                                int i9 = i6 + a3;
                                if (i9 <= i4) {
                                    for (int i10 = i6; i10 < i9; i10++) {
                                        if (iArr[i10] <= i5) {
                                        }
                                    }
                                    break;
                                }
                                if (z3) {
                                    i5++;
                                } else if (i9 <= i4) {
                                    i6++;
                                } else {
                                    i5++;
                                    i6 = 0;
                                }
                            }
                        }
                        Arrays.fill(iArr, Math.min(i6, i4), Math.min(i6 + a3, i4), i5 + a);
                    }
                    if (z) {
                        k(zgbVar, i5, a, i6, a3);
                    } else {
                        k(zgbVar, i6, a3, i5, a);
                    }
                    i6 += a3;
                }
            } else {
                th = null;
            }
            g("Table row or column span out of bounds");
            throw th;
        }
        int childCount3 = getChildCount();
        int i11 = 1;
        for (int i12 = 0; i12 < childCount3; i12++) {
            i11 = (i11 * 31) + d(i12).a.hashCode();
        }
        this.n = i11;
    }

    public final xgb d(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Q;
        if (i < arrayList.size()) {
            return (xgb) arrayList.get(i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        chb chbVar = this.S;
        if (chbVar == null || !chbVar.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(xgb xgbVar, boolean z, boolean z2) {
        int[] iArr;
        if (this.h == 1) {
            return f(xgbVar, z, z2);
        }
        ugb ugbVar = z ? this.c : this.d;
        if (z2) {
            if (ugbVar.j == null) {
                ugbVar.j = new int[ugbVar.e() + 1];
            }
            if (!ugbVar.k) {
                ugbVar.b(true);
                ugbVar.k = true;
            }
            iArr = ugbVar.j;
        } else {
            if (ugbVar.l == null) {
                ugbVar.l = new int[ugbVar.e() + 1];
            }
            if (!ugbVar.m) {
                ugbVar.b(false);
                ugbVar.m = true;
            }
            iArr = ugbVar.l;
        }
        zgb zgbVar = xgbVar.a;
        ygb ygbVar = (z ? zgbVar.b : zgbVar.a).b;
        return iArr[z2 ? ygbVar.a : ygbVar.b];
    }

    public final int f(xgb xgbVar, boolean z, boolean z2) {
        bhb bhbVar;
        ugb ugbVar;
        zgb zgbVar = xgbVar.a;
        int i = z ? z2 ? ((ViewGroup.MarginLayoutParams) zgbVar).leftMargin : ((ViewGroup.MarginLayoutParams) zgbVar).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) zgbVar).topMargin : ((ViewGroup.MarginLayoutParams) zgbVar).bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (!this.f) {
            return 0;
        }
        if (z) {
            bhbVar = zgbVar.b;
            ugbVar = this.c;
        } else {
            bhbVar = zgbVar.a;
            ugbVar = this.d;
        }
        ygb ygbVar = bhbVar.b;
        if ((z && this.J) != z2) {
            return 0;
        }
        ugbVar.e();
        return 0;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.Q.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h() {
        this.n = 0;
        ugb ugbVar = this.c;
        ugbVar.k();
        ugb ugbVar2 = this.d;
        ugbVar2.k();
        if (ugbVar == null || ugbVar2 == null) {
            return;
        }
        ugbVar.l();
        ugbVar2.l();
    }

    public final void i(xgb xgbVar, int i, int i2, boolean z) {
        xgbVar.d(e(xgbVar, true, false) + e(xgbVar, true, true) + i, e(xgbVar, false, false) + e(xgbVar, false, true) + i2, z);
    }

    public final void j(int i, boolean z) {
        int i2;
        int i3;
        TextPaint textPaint;
        CharSequence charSequence;
        ogb b;
        dhb dhbVar = this.P;
        int i4 = 0;
        if (!z || !this.R || this.e != 0) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                xgb d = d(i5);
                zgb zgbVar = d.a;
                if (z) {
                    float size = View.MeasureSpec.getSize(i);
                    d.e(dhbVar.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w << 2) : (int) (size / 1.5f)));
                    if (d.b != null) {
                        ((ViewGroup.MarginLayoutParams) zgbVar).height = Math.max(this.x, d.f + this.r + this.s);
                        int b2 = d.b.b();
                        i2 = b2 > 0 ? ((ViewGroup.MarginLayoutParams) zgbVar).height * b2 : d.e + (this.w << 1);
                        ((ViewGroup.MarginLayoutParams) zgbVar).width = i2;
                    } else {
                        ((ViewGroup.MarginLayoutParams) zgbVar).width = 0;
                        ((ViewGroup.MarginLayoutParams) zgbVar).height = 0;
                        i2 = 0;
                    }
                    i(d, i2, ((ViewGroup.MarginLayoutParams) zgbVar).height, true);
                } else {
                    boolean z2 = this.e == 0;
                    bhb bhbVar = z2 ? zgbVar.b : zgbVar.a;
                    bhb bhbVar2 = bhb.e;
                    if (bhbVar.a(z2) == W) {
                        ygb ygbVar = bhbVar.b;
                        int[] g = (z2 ? this.c : this.d).g();
                        int e = (g[ygbVar.b] - g[ygbVar.a]) - (e(d, z2, false) + e(d, z2, true));
                        if (z2) {
                            wgb wgbVar = d.b;
                            int b3 = wgbVar != null ? wgbVar.b() : 0;
                            if (b3 > 0) {
                                int max = Math.max(1, Math.round(e / b3));
                                ((ViewGroup.MarginLayoutParams) zgbVar).height = max;
                                d.m = max;
                            }
                            i(d, e, ((ViewGroup.MarginLayoutParams) zgbVar).height, false);
                        } else {
                            i(d, ((ViewGroup.MarginLayoutParams) zgbVar).width, e, false);
                        }
                    }
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        int size2 = View.MeasureSpec.getSize(i);
        int i6 = this.w << 1;
        int max2 = Math.max(1, (this.b > 1 ? Math.round(size2 * 0.8f) : size2) - i6);
        ArrayList arrayList = new ArrayList(childCount2);
        ogb[] ogbVarArr = new ogb[childCount2];
        int i7 = 0;
        while (i7 < childCount2) {
            xgb d2 = d(i7);
            zgb zgbVar2 = d2.a;
            ygb ygbVar2 = zgbVar2.b.b;
            d2.e(dhbVar.c(d2.c, max2));
            if (d2.b == null) {
                ((ViewGroup.MarginLayoutParams) zgbVar2).width = i4;
                ((ViewGroup.MarginLayoutParams) zgbVar2).height = i4;
                i(d2, i4, i4, true);
            } else {
                ((ViewGroup.MarginLayoutParams) zgbVar2).height = Math.max(this.x, d2.f + this.r + this.s);
                int b4 = d2.b.b();
                if (b4 > 0) {
                    int i8 = ygbVar2.a;
                    int a = ygbVar2.a();
                    int i9 = ((ViewGroup.MarginLayoutParams) zgbVar2).height * b4;
                    b = new ogb();
                    b.a = i8;
                    b.b = Math.max(1, a);
                    b.g = true;
                    int max3 = Math.max(0, i9);
                    b.e = max3;
                    b.d = max3;
                } else {
                    Layout a2 = d2.b.a();
                    if (a2 != null) {
                        CharSequence text = a2.getText();
                        textPaint = a2.getPaint();
                        charSequence = text;
                    } else {
                        textPaint = null;
                        charSequence = null;
                    }
                    b = cxe.b(charSequence, textPaint, ygbVar2.a, ygbVar2.a(), i6, max2, d2.e);
                }
                ogbVarArr[i7] = b;
                arrayList.add(b);
            }
            i7++;
            i4 = 0;
        }
        int[] a3 = cxe.a(this.b, size2, 0, arrayList);
        for (int i10 = 0; i10 < childCount2; i10++) {
            xgb d3 = d(i10);
            ogb ogbVar = ogbVarArr[i10];
            if (ogbVar != null) {
                zgb zgbVar3 = d3.a;
                if (d3.b.b() > 0) {
                    i3 = ogbVar.e;
                    ((ViewGroup.MarginLayoutParams) zgbVar3).width = i3;
                } else {
                    ygb ygbVar3 = zgbVar3.b.b;
                    int i11 = 0;
                    for (int max4 = Math.max(0, ygbVar3.a); max4 < Math.min(this.b, ygbVar3.b); max4++) {
                        i11 += a3[max4];
                    }
                    int max5 = Math.max(1, i11 - i6);
                    if (d3.e > max5) {
                        d3.e(dhbVar.c(d3.c, max5));
                        ((ViewGroup.MarginLayoutParams) zgbVar3).height = Math.max(this.x, d3.f + this.r + this.s);
                    }
                    i3 = d3.e + i6;
                    ((ViewGroup.MarginLayoutParams) zgbVar3).width = i3;
                }
                i(d3, i3, ((ViewGroup.MarginLayoutParams) zgbVar3).height, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d(i).a(canvas, this, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        ehb ehbVar = this;
        ehbVar.c();
        ugb ugbVar = ehbVar.d;
        ugb ugbVar2 = ehbVar.c;
        if (ugbVar2 != null && ugbVar != null) {
            ugbVar2.l();
            ugbVar.l();
        }
        ehbVar.b = 0;
        int childCount = ehbVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ehbVar.b = Math.max(ehbVar.b, ehbVar.d(i7).a.b.b.b);
        }
        ehbVar.j(i, true);
        if (ehbVar.e == 0) {
            i3 = ugbVar2.i(i);
            if (ehbVar.y) {
                i3 = Math.max(i3, View.MeasureSpec.getSize(i));
                ugbVar2.v.a = i3;
                ugbVar2.w.a = -i3;
                ugbVar2.q = false;
                ugbVar2.g();
            }
            ehbVar.j(i, false);
            i4 = ugbVar.i(i2);
        } else {
            int i8 = ugbVar.i(i2);
            ehbVar.j(i, false);
            i3 = ugbVar2.i(i);
            i4 = i8;
        }
        int max = Math.max(i4, ehbVar.getSuggestedMinimumHeight());
        ehbVar.setMeasuredDimension(i3, max);
        ugbVar2.v.a = i3;
        ugbVar2.w.a = -i3;
        ugbVar2.q = false;
        ugbVar2.g();
        ugbVar.v.a = max;
        ugbVar.w.a = -max;
        ugbVar.q = false;
        ugbVar.g();
        int[] g = ugbVar2.g();
        int[] g2 = ugbVar.g();
        int[] copyOf = Arrays.copyOf(g2, g2.length);
        ArrayList arrayList = ehbVar.K;
        arrayList.clear();
        int i9 = g[g.length - 1];
        int childCount2 = ehbVar.getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11 = i10;
            xgb d = ehbVar.d(i11);
            zgb zgbVar = d.a;
            bhb bhbVar = zgbVar.b;
            bhb bhbVar2 = zgbVar.a;
            ygb ygbVar = bhbVar.b;
            ygb ygbVar2 = bhbVar2.b;
            int i12 = childCount2;
            int i13 = g[ygbVar.a];
            int i14 = g2[ygbVar2.a];
            int i15 = g[ygbVar.b];
            int i16 = g2[ygbVar2.b];
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            int i19 = d.k;
            ugb ugbVar3 = ugbVar;
            int i20 = d.l;
            qgb a = bhbVar.a(true);
            qgb a2 = bhbVar2.a(false);
            wm9 f = ugbVar2.f();
            vgb vgbVar = (vgb) ((Object[]) f.d)[((int[]) f.b)[i11]];
            wm9 f2 = ugbVar3.f();
            ugb ugbVar4 = ugbVar2;
            vgb vgbVar2 = (vgb) ((Object[]) f2.d)[((int[]) f2.b)[i11]];
            int b = a.b(d, i17 - vgbVar.d(true));
            int b2 = a2.b(d, i18 - vgbVar2.d(true));
            int e = ehbVar.e(d, true, true);
            int e2 = ehbVar.e(d, false, true);
            int e3 = ehbVar.e(d, true, false);
            int i21 = e + e3;
            int e4 = e2 + ehbVar.e(d, false, false);
            int a3 = vgbVar.a(ehbVar, d, a, i19 + i21, true);
            ehbVar = this;
            int a4 = vgbVar2.a(ehbVar, d, a2, i20 + e4, false);
            int c = a.c(i19, i17 - i21);
            int c2 = a2.c(i20, i18 - e4);
            int i22 = i13 + b + a3;
            int f3 = !ehbVar.J ? e + i22 : td4.f(i9, c, e3, i22);
            int i23 = i14 + b2 + a4 + e2;
            if (d.c != null) {
                if (c == d.k && c2 == d.l) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    d.d(c, c2, false);
                }
                int i24 = d.m;
                if (i24 != 0 && i24 != c2) {
                    ygb ygbVar3 = d.a.a.b;
                    if (ygbVar3.b - ygbVar3.a <= 1) {
                        ArrayList arrayList2 = ehbVar.L;
                        int size = arrayList2.size();
                        int i25 = i6;
                        while (true) {
                            if (i25 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i25);
                            float f4 = pointF.x;
                            float f5 = d.a.a.b.a;
                            if (f4 > f5 || pointF.y <= f5) {
                                i25++;
                            }
                        }
                    }
                }
            }
            d.p = f3;
            d.q = i23;
            i10 = i11 + 1;
            ugbVar = ugbVar3;
            childCount2 = i12;
            ugbVar2 = ugbVar4;
        }
        int size2 = arrayList.size();
        int i26 = 0;
        while (i26 < size2) {
            xgb xgbVar = (xgb) arrayList.get(i26);
            int i27 = xgbVar.l;
            int i28 = xgbVar.d;
            int i29 = i27 - xgbVar.m;
            ArrayList arrayList3 = ehbVar.Q;
            int size3 = arrayList3.size();
            for (int i30 = i28 + 1; i30 < size3; i30++) {
                xgb xgbVar2 = (xgb) arrayList3.get(i30);
                if (xgbVar.a.a.b.a != xgbVar2.a.a.b.a) {
                    break;
                }
                int i31 = xgbVar.m;
                int i32 = xgbVar2.m;
                if (i31 < i32) {
                    z = true;
                    break;
                }
                int i33 = xgbVar2.l - i32;
                if (i33 > 0) {
                    i29 = Math.min(i29, i33);
                }
            }
            z = false;
            if (!z) {
                int i34 = i28 - 1;
                while (true) {
                    if (i34 < 0) {
                        break;
                    }
                    xgb xgbVar3 = (xgb) arrayList3.get(i34);
                    if (xgbVar.a.a.b.a != xgbVar3.a.a.b.a) {
                        break;
                    }
                    int i35 = xgbVar.m;
                    int i36 = xgbVar3.m;
                    if (i35 < i36) {
                        z = true;
                        break;
                    }
                    int i37 = xgbVar3.l - i36;
                    if (i37 > 0) {
                        i29 = Math.min(i29, i37);
                    }
                    i34--;
                }
            }
            if (!z) {
                xgbVar.l = xgbVar.m;
                xgbVar.g();
                max -= i29;
                int i38 = xgbVar.a.a.b.a;
                while (true) {
                    i38++;
                    if (i38 >= copyOf.length) {
                        break;
                    } else {
                        copyOf[i38] = copyOf[i38] - i29;
                    }
                }
                int size4 = arrayList3.size();
                int i39 = size2;
                int i40 = i26;
                int i41 = 0;
                while (i41 < size4) {
                    xgb xgbVar4 = (xgb) arrayList3.get(i41);
                    if (xgbVar == xgbVar4) {
                        i5 = i41;
                    } else {
                        int i42 = xgbVar.a.a.b.a;
                        int i43 = xgbVar4.a.a.b.a;
                        if (i42 == i43) {
                            if (xgbVar4.m != xgbVar4.l) {
                                arrayList.remove(xgbVar4);
                                if (xgbVar4.d < i28) {
                                    i40--;
                                }
                                i39--;
                            }
                            int i44 = xgbVar4.l - i29;
                            xgbVar4.l = i44;
                            i5 = i41;
                            xgbVar4.d(xgbVar4.k, i44, true);
                        } else {
                            i5 = i41;
                            if (i42 < i43) {
                                xgbVar4.q -= i29;
                            }
                        }
                    }
                    i41 = i5 + 1;
                }
                i26 = i40;
                size2 = i39;
            }
            i26++;
        }
        int childCount3 = ehbVar.getChildCount();
        for (int i45 = 0; i45 < childCount3; i45++) {
            xgb d2 = ehbVar.d(i45);
            ehbVar.P.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        ehbVar.E = i9;
        ehbVar.F = max;
        ehbVar.G = copyOf;
        ehbVar.setMeasuredDimension(i9, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        ugb ugbVar;
        super.requestLayout();
        ugb ugbVar2 = this.c;
        if (ugbVar2 == null || (ugbVar = this.d) == null) {
            return;
        }
        ugbVar2.l();
        ugbVar.l();
    }

    public void setAlignmentMode(int i) {
        this.h = i;
        requestLayout();
    }

    public void setBalancedColumns(boolean z) {
        if (this.R == z) {
            return;
        }
        this.R = z;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.c.n(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        ugb ugbVar = this.c;
        ugbVar.u = z;
        ugbVar.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z) {
        this.H = z;
    }

    public void setFillWidth(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        requestLayout();
    }

    public void setMinimumCellHeight(int i) {
        this.x = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.e != i) {
            this.e = i;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i) {
        int i2;
        int measuredWidth = getMeasuredWidth();
        this.E = Math.max(measuredWidth, i);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            xgb d = d(i3);
            if (measuredWidth <= 0 || (i2 = this.E) == measuredWidth) {
                int i4 = d.n;
                int i5 = d.o + i4;
                d.p = i4;
                d.k = Math.max(0, i5 - i4);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f = measuredWidth;
                int round = Math.round((d.n * i2) / f);
                int round2 = Math.round(((d.n + d.o) * this.E) / f);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.G;
        if (iArr.length < 2) {
            this.F = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i6 = length - 1;
            int[] iArr2 = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int[] iArr3 = this.G;
                int i8 = i7 + 1;
                iArr2[i7] = iArr3[i8] - iArr3[i7];
                i7 = i8;
            }
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                xgb d2 = d(i9);
                wgb wgbVar = d2.b;
                int b = wgbVar != null ? wgbVar.b() : 0;
                if (b > 0) {
                    ygb ygbVar = d2.a.a.b;
                    int max = Math.max(0, ygbVar.a);
                    int min = Math.min(i6, ygbVar.b);
                    if (max < min) {
                        int i10 = 0;
                        for (int i11 = max; i11 < min; i11++) {
                            i10 += iArr2[i11];
                        }
                        int max2 = Math.max(1, Math.round(d2.k / b)) - i10;
                        while (max < min && max2 > 0) {
                            int i12 = min - max;
                            int i13 = ((max2 + i12) - 1) / i12;
                            iArr2[max] = iArr2[max] + i13;
                            max2 -= i13;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i14 = 0;
            while (i14 < i6) {
                int i15 = i14 + 1;
                iArr4[i15] = iArr4[i14] + iArr2[i14];
                i14 = i15;
            }
            this.F = iArr4[i6];
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                xgb d3 = d(i16);
                ygb ygbVar2 = d3.a.a.b;
                int max3 = Math.max(0, Math.min(i6, ygbVar2.a));
                int max4 = Math.max(max3, Math.min(i6, ygbVar2.b));
                int i17 = iArr4[max3];
                int i18 = iArr4[max4];
                d3.q = i17;
                d3.l = Math.max(0, i18 - i17);
                if (d3.c != null) {
                    d3.g();
                }
                this.P.g(d3.b, d3.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i) {
        this.d.n(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        ugb ugbVar = this.d;
        ugbVar.u = z;
        ugbVar.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z) {
        this.J = z;
    }

    public void setStriped(boolean z) {
        this.I = z;
    }

    public void setUseDefaultMargins(boolean z) {
        this.f = z;
        requestLayout();
    }
}
