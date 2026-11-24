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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class efb extends View {
    public static final qeb T = new qeb(0);
    public static final qeb U = new qeb(1);
    public static final qeb V = new qeb(3);
    public static final qeb W = new qeb(4);
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
    public final dfb P;
    public final ArrayList Q;
    public boolean R;
    public final cfb S;
    public final fib a;
    public int b;
    public final ueb c;
    public final ueb d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public efb(Context context, dfb dfbVar, fib fibVar) {
        super(context);
        this.c = new ueb(this, true);
        this.d = new ueb(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = gl.L(8.0f);
        this.s = gl.L(9.0f);
        this.w = gl.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = fibVar;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = dfbVar;
        cfb cfbVar = new cfb(this, this);
        this.S = cfbVar;
        jdc.k(this, cfbVar);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(zeb zebVar, int i, int i2, int i3, int i4) {
        yeb yebVar = new yeb(i, i2 + i);
        bfb bfbVar = zebVar.a;
        zebVar.a = new bfb(bfbVar.a, yebVar, bfbVar.c, bfbVar.d);
        yeb yebVar2 = new yeb(i3, i4 + i3);
        bfb bfbVar2 = zebVar.b;
        zebVar.b = new bfb(bfbVar2.a, yebVar2, bfbVar2.c, bfbVar2.d);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.Q;
        xeb xebVar = new xeb(this, arrayList.size());
        zeb zebVar = new zeb();
        yeb yebVar = new yeb(i2, i4 + i2);
        qeb qebVar = W;
        zebVar.a = new bfb(false, yebVar, qebVar, 0.0f);
        zebVar.b = new bfb(false, new yeb(i, i3 + i), qebVar, 0.0f);
        xebVar.a = zebVar;
        xebVar.j = i2;
        arrayList.add(xebVar);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.Q;
        xeb xebVar = new xeb(this, arrayList.size());
        xebVar.c = pagetablecell;
        zeb zebVar = new zeb();
        int i4 = pagetablecell.rowspan;
        if (i4 == 0) {
            i4 = 1;
        }
        yeb yebVar = new yeb(i2, i4 + i2);
        qeb qebVar = W;
        zebVar.a = new bfb(false, yebVar, qebVar, 0.0f);
        zebVar.b = new bfb(false, new yeb(i, i3 + i), qebVar, 1.0f);
        xebVar.a = zebVar;
        xebVar.j = i2;
        arrayList.add(xebVar);
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
            zeb zebVar = d(i7).a;
            bfb bfbVar = z ? zebVar.a : zebVar.b;
            yeb yebVar = bfbVar.b;
            boolean z2 = bfbVar.a;
            int a = yebVar.a();
            if (a <= 0 || a > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z2) {
                i5 = yebVar.a;
            }
            bfb bfbVar2 = z ? zebVar.b : zebVar.a;
            yeb yebVar2 = bfbVar2.b;
            int a2 = yebVar2.a();
            int i8 = yebVar2.a;
            if (a2 > 0) {
                th = null;
                if (yebVar2.a() <= 1024) {
                    boolean z3 = bfbVar2.a;
                    int a3 = yebVar2.a();
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
                        k(zebVar, i5, a, i6, a3);
                    } else {
                        k(zebVar, i6, a3, i5, a);
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

    public final xeb d(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Q;
        if (i < arrayList.size()) {
            return (xeb) arrayList.get(i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        cfb cfbVar = this.S;
        if (cfbVar == null || !cfbVar.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(xeb xebVar, boolean z, boolean z2) {
        int[] iArr;
        if (this.h == 1) {
            return f(xebVar, z, z2);
        }
        ueb uebVar = z ? this.c : this.d;
        if (z2) {
            if (uebVar.j == null) {
                uebVar.j = new int[uebVar.e() + 1];
            }
            if (!uebVar.k) {
                uebVar.b(true);
                uebVar.k = true;
            }
            iArr = uebVar.j;
        } else {
            if (uebVar.l == null) {
                uebVar.l = new int[uebVar.e() + 1];
            }
            if (!uebVar.m) {
                uebVar.b(false);
                uebVar.m = true;
            }
            iArr = uebVar.l;
        }
        zeb zebVar = xebVar.a;
        yeb yebVar = (z ? zebVar.b : zebVar.a).b;
        return iArr[z2 ? yebVar.a : yebVar.b];
    }

    public final int f(xeb xebVar, boolean z, boolean z2) {
        bfb bfbVar;
        ueb uebVar;
        zeb zebVar = xebVar.a;
        int i = z ? z2 ? ((ViewGroup.MarginLayoutParams) zebVar).leftMargin : ((ViewGroup.MarginLayoutParams) zebVar).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) zebVar).topMargin : ((ViewGroup.MarginLayoutParams) zebVar).bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (!this.f) {
            return 0;
        }
        if (z) {
            bfbVar = zebVar.b;
            uebVar = this.c;
        } else {
            bfbVar = zebVar.a;
            uebVar = this.d;
        }
        yeb yebVar = bfbVar.b;
        if ((z && this.J) != z2) {
            return 0;
        }
        uebVar.e();
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
        ueb uebVar = this.c;
        uebVar.k();
        ueb uebVar2 = this.d;
        uebVar2.k();
        if (uebVar == null || uebVar2 == null) {
            return;
        }
        uebVar.l();
        uebVar2.l();
    }

    public final void i(xeb xebVar, int i, int i2, boolean z) {
        xebVar.d(e(xebVar, true, false) + e(xebVar, true, true) + i, e(xebVar, false, false) + e(xebVar, false, true) + i2, z);
    }

    public final void j(int i, boolean z) {
        int i2;
        int i3;
        TextPaint textPaint;
        CharSequence charSequence;
        oeb b;
        dfb dfbVar = this.P;
        int i4 = 0;
        if (!z || !this.R || this.e != 0) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                xeb d = d(i5);
                zeb zebVar = d.a;
                if (z) {
                    float size = View.MeasureSpec.getSize(i);
                    d.e(dfbVar.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w << 2) : (int) (size / 1.5f)));
                    if (d.b != null) {
                        ((ViewGroup.MarginLayoutParams) zebVar).height = Math.max(this.x, d.f + this.r + this.s);
                        int b2 = d.b.b();
                        i2 = b2 > 0 ? ((ViewGroup.MarginLayoutParams) zebVar).height * b2 : d.e + (this.w << 1);
                        ((ViewGroup.MarginLayoutParams) zebVar).width = i2;
                    } else {
                        ((ViewGroup.MarginLayoutParams) zebVar).width = 0;
                        ((ViewGroup.MarginLayoutParams) zebVar).height = 0;
                        i2 = 0;
                    }
                    i(d, i2, ((ViewGroup.MarginLayoutParams) zebVar).height, true);
                } else {
                    boolean z2 = this.e == 0;
                    bfb bfbVar = z2 ? zebVar.b : zebVar.a;
                    bfb bfbVar2 = bfb.e;
                    if (bfbVar.a(z2) == W) {
                        yeb yebVar = bfbVar.b;
                        int[] g = (z2 ? this.c : this.d).g();
                        int e = (g[yebVar.b] - g[yebVar.a]) - (e(d, z2, false) + e(d, z2, true));
                        if (z2) {
                            web webVar = d.b;
                            int b3 = webVar != null ? webVar.b() : 0;
                            if (b3 > 0) {
                                int max = Math.max(1, Math.round(e / b3));
                                ((ViewGroup.MarginLayoutParams) zebVar).height = max;
                                d.m = max;
                            }
                            i(d, e, ((ViewGroup.MarginLayoutParams) zebVar).height, false);
                        } else {
                            i(d, ((ViewGroup.MarginLayoutParams) zebVar).width, e, false);
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
        oeb[] oebVarArr = new oeb[childCount2];
        int i7 = 0;
        while (i7 < childCount2) {
            xeb d2 = d(i7);
            zeb zebVar2 = d2.a;
            yeb yebVar2 = zebVar2.b.b;
            d2.e(dfbVar.c(d2.c, max2));
            if (d2.b == null) {
                ((ViewGroup.MarginLayoutParams) zebVar2).width = i4;
                ((ViewGroup.MarginLayoutParams) zebVar2).height = i4;
                i(d2, i4, i4, true);
            } else {
                ((ViewGroup.MarginLayoutParams) zebVar2).height = Math.max(this.x, d2.f + this.r + this.s);
                int b4 = d2.b.b();
                if (b4 > 0) {
                    int i8 = yebVar2.a;
                    int a = yebVar2.a();
                    int i9 = ((ViewGroup.MarginLayoutParams) zebVar2).height * b4;
                    b = new oeb();
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
                    b = ave.b(charSequence, textPaint, yebVar2.a, yebVar2.a(), i6, max2, d2.e);
                }
                oebVarArr[i7] = b;
                arrayList.add(b);
            }
            i7++;
            i4 = 0;
        }
        int[] a3 = ave.a(this.b, size2, 0, arrayList);
        for (int i10 = 0; i10 < childCount2; i10++) {
            xeb d3 = d(i10);
            oeb oebVar = oebVarArr[i10];
            if (oebVar != null) {
                zeb zebVar3 = d3.a;
                if (d3.b.b() > 0) {
                    i3 = oebVar.e;
                    ((ViewGroup.MarginLayoutParams) zebVar3).width = i3;
                } else {
                    yeb yebVar3 = zebVar3.b.b;
                    int i11 = 0;
                    for (int max4 = Math.max(0, yebVar3.a); max4 < Math.min(this.b, yebVar3.b); max4++) {
                        i11 += a3[max4];
                    }
                    int max5 = Math.max(1, i11 - i6);
                    if (d3.e > max5) {
                        d3.e(dfbVar.c(d3.c, max5));
                        ((ViewGroup.MarginLayoutParams) zebVar3).height = Math.max(this.x, d3.f + this.r + this.s);
                    }
                    i3 = d3.e + i6;
                    ((ViewGroup.MarginLayoutParams) zebVar3).width = i3;
                }
                i(d3, i3, ((ViewGroup.MarginLayoutParams) zebVar3).height, true);
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
        efb efbVar = this;
        efbVar.c();
        ueb uebVar = efbVar.d;
        ueb uebVar2 = efbVar.c;
        if (uebVar2 != null && uebVar != null) {
            uebVar2.l();
            uebVar.l();
        }
        efbVar.b = 0;
        int childCount = efbVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            efbVar.b = Math.max(efbVar.b, efbVar.d(i7).a.b.b.b);
        }
        efbVar.j(i, true);
        if (efbVar.e == 0) {
            i3 = uebVar2.i(i);
            if (efbVar.y) {
                i3 = Math.max(i3, View.MeasureSpec.getSize(i));
                uebVar2.v.a = i3;
                uebVar2.w.a = -i3;
                uebVar2.q = false;
                uebVar2.g();
            }
            efbVar.j(i, false);
            i4 = uebVar.i(i2);
        } else {
            int i8 = uebVar.i(i2);
            efbVar.j(i, false);
            i3 = uebVar2.i(i);
            i4 = i8;
        }
        int max = Math.max(i4, efbVar.getSuggestedMinimumHeight());
        efbVar.setMeasuredDimension(i3, max);
        uebVar2.v.a = i3;
        uebVar2.w.a = -i3;
        uebVar2.q = false;
        uebVar2.g();
        uebVar.v.a = max;
        uebVar.w.a = -max;
        uebVar.q = false;
        uebVar.g();
        int[] g = uebVar2.g();
        int[] g2 = uebVar.g();
        int[] copyOf = Arrays.copyOf(g2, g2.length);
        ArrayList arrayList = efbVar.K;
        arrayList.clear();
        int i9 = g[g.length - 1];
        int childCount2 = efbVar.getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11 = i10;
            xeb d = efbVar.d(i11);
            zeb zebVar = d.a;
            bfb bfbVar = zebVar.b;
            bfb bfbVar2 = zebVar.a;
            yeb yebVar = bfbVar.b;
            yeb yebVar2 = bfbVar2.b;
            int i12 = childCount2;
            int i13 = g[yebVar.a];
            int i14 = g2[yebVar2.a];
            int i15 = g[yebVar.b];
            int i16 = g2[yebVar2.b];
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            int i19 = d.k;
            ueb uebVar3 = uebVar;
            int i20 = d.l;
            qeb a = bfbVar.a(true);
            qeb a2 = bfbVar2.a(false);
            vk9 f = uebVar2.f();
            veb vebVar = (veb) ((Object[]) f.d)[((int[]) f.b)[i11]];
            vk9 f2 = uebVar3.f();
            ueb uebVar4 = uebVar2;
            veb vebVar2 = (veb) ((Object[]) f2.d)[((int[]) f2.b)[i11]];
            int b = a.b(d, i17 - vebVar.d(true));
            int b2 = a2.b(d, i18 - vebVar2.d(true));
            int e = efbVar.e(d, true, true);
            int e2 = efbVar.e(d, false, true);
            int e3 = efbVar.e(d, true, false);
            int i21 = e + e3;
            int e4 = e2 + efbVar.e(d, false, false);
            int a3 = vebVar.a(efbVar, d, a, i19 + i21, true);
            efbVar = this;
            int a4 = vebVar2.a(efbVar, d, a2, i20 + e4, false);
            int c = a.c(i19, i17 - i21);
            int c2 = a2.c(i20, i18 - e4);
            int i22 = i13 + b + a3;
            int f3 = !efbVar.J ? e + i22 : tb4.f(i9, c, e3, i22);
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
                    yeb yebVar3 = d.a.a.b;
                    if (yebVar3.b - yebVar3.a <= 1) {
                        ArrayList arrayList2 = efbVar.L;
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
            uebVar = uebVar3;
            childCount2 = i12;
            uebVar2 = uebVar4;
        }
        int size2 = arrayList.size();
        int i26 = 0;
        while (i26 < size2) {
            xeb xebVar = (xeb) arrayList.get(i26);
            int i27 = xebVar.l;
            int i28 = xebVar.d;
            int i29 = i27 - xebVar.m;
            ArrayList arrayList3 = efbVar.Q;
            int size3 = arrayList3.size();
            for (int i30 = i28 + 1; i30 < size3; i30++) {
                xeb xebVar2 = (xeb) arrayList3.get(i30);
                if (xebVar.a.a.b.a != xebVar2.a.a.b.a) {
                    break;
                }
                int i31 = xebVar.m;
                int i32 = xebVar2.m;
                if (i31 < i32) {
                    z = true;
                    break;
                }
                int i33 = xebVar2.l - i32;
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
                    xeb xebVar3 = (xeb) arrayList3.get(i34);
                    if (xebVar.a.a.b.a != xebVar3.a.a.b.a) {
                        break;
                    }
                    int i35 = xebVar.m;
                    int i36 = xebVar3.m;
                    if (i35 < i36) {
                        z = true;
                        break;
                    }
                    int i37 = xebVar3.l - i36;
                    if (i37 > 0) {
                        i29 = Math.min(i29, i37);
                    }
                    i34--;
                }
            }
            if (!z) {
                xebVar.l = xebVar.m;
                xebVar.g();
                max -= i29;
                int i38 = xebVar.a.a.b.a;
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
                    xeb xebVar4 = (xeb) arrayList3.get(i41);
                    if (xebVar == xebVar4) {
                        i5 = i41;
                    } else {
                        int i42 = xebVar.a.a.b.a;
                        int i43 = xebVar4.a.a.b.a;
                        if (i42 == i43) {
                            if (xebVar4.m != xebVar4.l) {
                                arrayList.remove(xebVar4);
                                if (xebVar4.d < i28) {
                                    i40--;
                                }
                                i39--;
                            }
                            int i44 = xebVar4.l - i29;
                            xebVar4.l = i44;
                            i5 = i41;
                            xebVar4.d(xebVar4.k, i44, true);
                        } else {
                            i5 = i41;
                            if (i42 < i43) {
                                xebVar4.q -= i29;
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
        int childCount3 = efbVar.getChildCount();
        for (int i45 = 0; i45 < childCount3; i45++) {
            xeb d2 = efbVar.d(i45);
            efbVar.P.h(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        efbVar.E = i9;
        efbVar.F = max;
        efbVar.G = copyOf;
        efbVar.setMeasuredDimension(i9, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        ueb uebVar;
        super.requestLayout();
        ueb uebVar2 = this.c;
        if (uebVar2 == null || (uebVar = this.d) == null) {
            return;
        }
        uebVar2.l();
        uebVar.l();
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
        ueb uebVar = this.c;
        uebVar.u = z;
        uebVar.k();
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
            xeb d = d(i3);
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
                xeb d2 = d(i9);
                web webVar = d2.b;
                int b = webVar != null ? webVar.b() : 0;
                if (b > 0) {
                    yeb yebVar = d2.a.a.b;
                    int max = Math.max(0, yebVar.a);
                    int min = Math.min(i6, yebVar.b);
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
                xeb d3 = d(i16);
                yeb yebVar2 = d3.a.a.b;
                int max3 = Math.max(0, Math.min(i6, yebVar2.a));
                int max4 = Math.max(max3, Math.min(i6, yebVar2.b));
                int i17 = iArr4[max3];
                int i18 = iArr4[max4];
                d3.q = i17;
                d3.l = Math.max(0, i18 - i17);
                if (d3.c != null) {
                    d3.g();
                }
                this.P.h(d3.b, d3.c());
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
        ueb uebVar = this.d;
        uebVar.u = z;
        uebVar.k();
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
