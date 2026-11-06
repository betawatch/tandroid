package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c8.na;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class o5 extends ViewGroup {
    public final RectF D;
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.w5 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public e6 a;
    public final f6 b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public n5 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final Paint y;

    public o5(Context context, f6 f6Var) {
        super(context);
        this.c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f = new int[0];
        Paint paint = new Paint(1);
        this.n = paint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.w = paint2;
        this.x = new Paint(1);
        this.y = new Paint(1);
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.b = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.G = new org.telegram.ui.Components.w5(this, 0L, 220L, xq.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        TL_iv.pageTableCell pagetablecell;
        e6 e6Var = this.a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (e6Var != null && e6Var.b != 0 && e6Var.c != 0) {
            View findFocus = findFocus();
            for (ViewParent parent = findFocus == null ? null : findFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
                if (parent instanceof p5) {
                    pagetablecell = ((p5) parent).b;
                    break;
                }
            }
            pagetablecell = null;
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h == null) {
                return null;
            }
            ArrayList arrayList = this.a.g;
            int size = arrayList.size();
            int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((l2.y) this.h).b).contains(pagetablecell3)) {
                    int b10 = this.a.b(pagetablecell3);
                    int a10 = this.a.a(pagetablecell3);
                    if (b10 < i7 || (b10 == i7 && a10 < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i7 = b10;
                        i11 = a10;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i7 = k6.ei;
        f6 f6Var = this.b;
        this.n.setColor(k6.w0(i7, f6Var));
        int w02 = k6.w0(k6.M6, f6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.r.setColor(k6.w0(k6.di, f6Var));
        this.s.setColor(Color.argb(20, red, green, blue));
        this.H = qs.e4;
        int i10 = k6.Ci;
        this.w.setColor(k6.w0(i10, f6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.x;
        paint.setStyle(style);
        this.O = k6.w0(k6.E6, f6Var);
        this.P = k6.w0(k6.Gi, f6Var);
        paint.setColor(this.O);
        Paint paint2 = this.y;
        paint2.setStyle(style);
        paint2.setColor(k6.w0(i10, f6Var));
        invalidate();
    }

    public final boolean c(int i7, int i10) {
        if (i7 < 0 || i10 < i7) {
            return false;
        }
        while (i7 <= i10) {
            if (!n(i7)) {
                return false;
            }
            i7++;
        }
        return true;
    }

    public final boolean d(int i7, int i10) {
        if (i7 < 0 || i10 < i7) {
            return false;
        }
        while (i7 <= i10) {
            if (!o(i7)) {
                return false;
            }
            i7++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int min;
        int i7;
        int i10;
        int min2;
        float f10;
        e6 e6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_iv.pageBlockTable pageblocktable;
        Canvas canvas3 = canvas;
        this.J = false;
        this.I = false;
        TL_iv.pageTableCell a10 = a();
        if (a10 != null) {
            int b10 = this.a.b(a10);
            int a11 = this.a.a(a10);
            if (b10 >= 0 && a11 >= 0) {
                int i16 = a10.rowspan;
                if (i16 == 0) {
                    i16 = 1;
                }
                int i17 = a10.colspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                if (o(b10)) {
                    this.I = true;
                    int[] iArr = this.f;
                    this.K = iArr[b10];
                    this.L = iArr[Math.min(b10 + i16, this.a.b)];
                }
                if (n(a11)) {
                    this.J = true;
                    int[] iArr2 = this.e;
                    this.M = iArr2[a11];
                    this.N = iArr2[Math.min(a11 + i17, this.a.c)];
                }
            }
        }
        e6 e6Var2 = this.a;
        RectF rectF = this.D;
        if (e6Var2 != null && e6Var2.b != 0 && e6Var2.c != 0) {
            TL_iv.pageBlockTable pageblocktable2 = e6Var2.a;
            boolean z9 = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            float f11 = this.e[0];
            float f12 = this.f[0];
            e6 e6Var3 = this.a;
            rectF.set(f11, f12, r2[e6Var3.c], r4[e6Var3.b]);
            Path path = this.F;
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.g0.N(10.0f), org.telegram.messenger.g0.N(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                View childAt = getChildAt(i18);
                if (childAt instanceof p5) {
                    p5 p5Var = (p5) childAt;
                    int b11 = this.a.b(p5Var.b);
                    int a12 = this.a.a(p5Var.b);
                    if (b11 >= 0 && a12 >= 0) {
                        int n10 = e6.n(p5Var.b);
                        int o4 = e6.o(p5Var.b);
                        int[] iArr3 = this.e;
                        int i19 = iArr3[a12];
                        int i20 = this.f[b11];
                        int i21 = iArr3[Math.min(a12 + n10, this.a.c)];
                        int i22 = this.f[Math.min(o4 + b11, this.a.b)];
                        if (p5Var.b.header) {
                            canvas3.drawRect(i19, i20, i21, i22, this.r);
                        } else if (z9 && b11 % 2 == 0) {
                            canvas3 = canvas;
                            canvas3.drawRect(i19, i20, i21, i22, this.s);
                        }
                        canvas3 = canvas;
                    }
                }
            }
            canvas3.restore();
        }
        super.dispatchDraw(canvas);
        if (l()) {
            int k10 = k();
            int r10 = r();
            int j3 = j();
            int q10 = q();
            if (d(k10, r10)) {
                int[] iArr4 = this.f;
                h(canvas3, iArr4[k10], iArr4[r10 + 1]);
            }
            if (c(j3, q10)) {
                int[] iArr5 = this.e;
                g(canvas3, iArr5[j3], iArr5[q10 + 1]);
            }
        } else {
            if (this.I) {
                h(canvas3, this.K, this.L);
            }
            if (this.J) {
                g(canvas3, this.M, this.N);
            }
        }
        e6 e6Var4 = this.a;
        if (e6Var4 != null && (pageblocktable = e6Var4.a) != null && pageblocktable.bordered) {
            Paint paint = this.n;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float N = org.telegram.messenger.g0.N(10.0f);
            int[] iArr6 = this.e;
            int[] iArr7 = this.f;
            e6 e6Var5 = this.a;
            rectF.set(iArr6[0] + strokeWidth, iArr7[0] + strokeWidth, iArr6[e6Var5.c] - strokeWidth, iArr7[e6Var5.b] - strokeWidth);
            canvas3.drawRoundRect(rectF, N, N, paint);
            int i23 = 1;
            while (i23 < this.a.c) {
                int i24 = this.e[i23];
                int i25 = 0;
                int i26 = -1;
                while (true) {
                    e6 e6Var6 = this.a;
                    if (i25 >= e6Var6.b) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = e6Var6.d[i25];
                    if (pagetablecellArr[i23 - 1] != pagetablecellArr[i23]) {
                        if (i26 < 0) {
                            i26 = this.f[i25];
                        }
                    } else if (i26 >= 0) {
                        float f13 = i24;
                        canvas3.drawLine(f13, i26, f13, this.f[i25], paint);
                        i26 = -1;
                    }
                    i25++;
                    canvas3 = canvas;
                }
                if (i26 >= 0) {
                    float f14 = i24;
                    canvas.drawLine(f14, i26, f14, this.f[r4], paint);
                }
                i23++;
                canvas3 = canvas;
            }
            for (int i27 = 1; i27 < this.a.b; i27++) {
                int i28 = this.f[i27];
                int i29 = 0;
                int i30 = -1;
                while (true) {
                    e6 e6Var7 = this.a;
                    if (i29 >= e6Var7.c) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = e6Var7.d;
                    if (pagetablecellArr2[i27 - 1][i29] != pagetablecellArr2[i27][i29]) {
                        if (i30 < 0) {
                            i30 = this.e[i29];
                        }
                    } else if (i30 >= 0) {
                        float f15 = i28;
                        canvas.drawLine(i30, f15, this.e[i29], f15, paint);
                        i30 = -1;
                    }
                    i29++;
                }
                if (i30 >= 0) {
                    float f16 = i30;
                    float f17 = i28;
                    canvas.drawLine(f16, f17, this.e[r3], f17, paint);
                }
            }
        }
        if (this.a != null) {
            float e10 = this.G.e(false, l() ? 1.0f : 0.0f);
            if (e10 > 0.001f) {
                Paint paint2 = this.w;
                paint2.setAlpha((int) (this.H * e10));
                paint2.setStrokeWidth(Math.max(0.4f, e10) * org.telegram.messenger.g0.N(2.0f));
                int i31 = 0;
                while (true) {
                    int i32 = this.a.b;
                    if (i31 > i32) {
                        break;
                    }
                    int i33 = i31 < i32 ? this.f[i31] : this.f[i32];
                    int i34 = 0;
                    int i35 = -1;
                    while (true) {
                        i14 = this.a.c;
                        if (i34 >= i14) {
                            break;
                        }
                        if (p(i31 - 1, i34) != p(i31, i34)) {
                            if (i35 < 0) {
                                i35 = this.e[i34];
                            }
                        } else if (i35 >= 0) {
                            int i36 = this.e[i34];
                            if (i36 > i35) {
                                float f18 = f(i35, i33) + i35;
                                float f19 = i36 - f(i36, i33);
                                if (f19 > f18) {
                                    float f20 = i33;
                                    canvas.drawLine(f18, f20, f19, f20, paint2);
                                }
                            }
                            i35 = -1;
                        }
                        i34++;
                    }
                    if (i35 >= 0 && (i15 = this.e[i14]) > i35) {
                        float f21 = f(i35, i33) + i35;
                        float f22 = i15 - f(i15, i33);
                        if (f22 > f21) {
                            float f23 = i33;
                            canvas.drawLine(f21, f23, f22, f23, paint2);
                        }
                    }
                    i31++;
                }
                int i37 = 0;
                while (true) {
                    e6Var = this.a;
                    i11 = e6Var.c;
                    if (i37 > i11) {
                        break;
                    }
                    int[] iArr8 = this.e;
                    int i38 = i37 < i11 ? iArr8[i37] : iArr8[i11];
                    int i39 = 0;
                    int i40 = -1;
                    while (true) {
                        i12 = this.a.b;
                        if (i39 >= i12) {
                            break;
                        }
                        if (p(i39, i37 - 1) != p(i39, i37)) {
                            if (i40 < 0) {
                                i40 = this.f[i39];
                            }
                        } else if (i40 >= 0) {
                            int i41 = this.f[i39];
                            if (i41 > i40) {
                                float f24 = i40 + f(i38, i40);
                                float f25 = i41 - f(i38, i41);
                                if (f25 > f24) {
                                    float f26 = i38;
                                    canvas.drawLine(f26, f24, f26, f25, paint2);
                                }
                            }
                            i40 = -1;
                        }
                        i39++;
                    }
                    if (i40 >= 0 && (i13 = this.f[i12]) > i40) {
                        float f27 = i40 + f(i38, i40);
                        float f28 = i13 - f(i38, i13);
                        if (f28 > f27) {
                            float f29 = i38;
                            canvas.drawLine(f29, f27, f29, f28, paint2);
                            i37++;
                        }
                    }
                    i37++;
                }
                canvas2 = canvas;
                int i42 = e6Var.b;
                i(180.0f, this.e[0], this.f[0], canvas2);
                i(270.0f, this.e[i11], this.f[0], canvas2);
                i(90.0f, this.e[0], this.f[i42], canvas2);
                i(0.0f, this.e[i11], this.f[i42], canvas2);
                if (this.a != null) {
                    return;
                }
                float N2 = org.telegram.messenger.g0.N(3.0f) / 2.0f;
                float L = org.telegram.messenger.g0.L(8.0f);
                float L2 = (this.e[0] - org.telegram.messenger.g0.L(6.0f)) - N2;
                float L3 = org.telegram.messenger.g0.L(6.0f) + this.f[this.a.b] + N2;
                boolean l10 = l();
                Paint paint3 = this.x;
                if (!l10) {
                    TL_iv.pageTableCell a13 = a();
                    if (a13 == null) {
                        return;
                    }
                    int b12 = this.a.b(a13);
                    int a14 = this.a.a(a13);
                    if (b12 < 0 || a14 < 0) {
                        return;
                    }
                    int i43 = a13.rowspan;
                    if (i43 == 0) {
                        i43 = 1;
                    }
                    int i44 = a13.colspan;
                    if (i44 == 0) {
                        i44 = 1;
                    }
                    int[] iArr9 = this.f;
                    float f30 = (iArr9[b12] + iArr9[Math.min(b12 + i43, this.a.b)]) / 2.0f;
                    paint3.setColor(this.I ? this.P : this.O);
                    for (int i45 = -1; i45 <= 1; i45++) {
                        canvas2.drawCircle(L2, (i45 * L) + f30, N2, paint3);
                    }
                    int[] iArr10 = this.e;
                    float f31 = (iArr10[a14] + iArr10[Math.min(a14 + i44, this.a.c)]) / 2.0f;
                    paint3.setColor(this.J ? this.P : this.O);
                    for (int i46 = -1; i46 <= 1; i46++) {
                        canvas2.drawCircle((i46 * L) + f31, L3, N2, paint3);
                    }
                    return;
                }
                int k11 = k();
                int r11 = r();
                int j10 = j();
                int q11 = q();
                if (k11 < 0 || j10 < 0) {
                    return;
                }
                TL_iv.pageTableCell a15 = a();
                boolean v = v();
                int b13 = a15 == null ? k11 : this.a.b(a15);
                if (a15 == null) {
                    min = b13 + 1;
                } else {
                    int i47 = a15.rowspan;
                    if (i47 == 0) {
                        i47 = 1;
                    }
                    min = Math.min(i47 + b13, this.a.b);
                }
                if (v) {
                    int[] iArr11 = this.f;
                    i7 = iArr11[k11];
                    i10 = iArr11[r11 + 1];
                } else {
                    int[] iArr12 = this.f;
                    i7 = iArr12[b13];
                    i10 = iArr12[min];
                }
                float f32 = (i7 + i10) / 2.0f;
                paint3.setColor((v && d(k11, r11)) ? this.P : this.O);
                for (int i48 = -1; i48 <= 1; i48++) {
                    canvas2.drawCircle(L2, (i48 * L) + f32, N2, paint3);
                }
                boolean u10 = u();
                int a16 = a15 == null ? j10 : this.a.a(a15);
                if (a15 == null) {
                    min2 = a16 + 1;
                } else {
                    int i49 = a15.colspan;
                    if (i49 == 0) {
                        i49 = 1;
                    }
                    min2 = Math.min(i49 + a16, this.a.c);
                }
                if (u10) {
                    int[] iArr13 = this.e;
                    f10 = iArr13[j10] + iArr13[q11 + 1];
                } else {
                    int[] iArr14 = this.e;
                    f10 = iArr14[a16] + iArr14[min2];
                }
                float f33 = f10 / 2.0f;
                paint3.setColor((u10 && c(j10, q11)) ? this.P : this.O);
                for (int i50 = -1; i50 <= 1; i50++) {
                    canvas2.drawCircle((i50 * L) + f33, L3, N2, paint3);
                }
                return;
            }
        }
        canvas2 = canvas;
        if (this.a != null) {
        }
    }

    public final boolean e(int i7) {
        if (i7 >= 0 && i7 < this.a.c) {
            for (int i10 = 0; i10 < this.a.b; i10++) {
                if (p(i10, i7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i7, int i10) {
        int i11;
        int i12;
        e6 e6Var = this.a;
        int i13 = e6Var.c;
        int i14 = e6Var.b;
        int[] iArr = this.e;
        if (i7 != iArr[0]) {
            if (i7 == iArr[i13]) {
                i11 = i13 - 1;
            }
            return 0.0f;
        }
        i11 = 0;
        int[] iArr2 = this.f;
        if (i10 != iArr2[0]) {
            i12 = i10 == iArr2[i14] ? i14 - 1 : 0;
            return 0.0f;
        }
        if (i11 >= 0 && i12 >= 0 && p(i12, i11)) {
            return Math.min(org.telegram.messenger.g0.N(10.0f), Math.min(this.c[i11], this.d[i12]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i7, int i10) {
        float N = i7 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float f10 = this.f[this.a.b];
        float L = org.telegram.messenger.g0.L(16.0f) + f10;
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f11 = f(i7, this.f[this.a.b]);
        float f12 = f(i10, this.f[this.a.b]);
        Path path = this.F;
        path.rewind();
        path.moveTo(N, f10 - f11);
        path.lineTo(N, L - min);
        float f13 = min * 2.0f;
        float f14 = L - f13;
        RectF rectF = this.E;
        rectF.set(N, f14, N + f13, L);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(N2 - min, L);
        rectF.set(N2 - f13, f14, N2, L);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(N2, f10 - f12);
        if (f12 > 0.0f) {
            float f15 = f12 * 2.0f;
            rectF.set(N2 - f15, f10 - f15, N2, f10);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(N2, f10);
        }
        path.lineTo(N + f11, f10);
        if (f11 > 0.0f) {
            float f16 = f11 * 2.0f;
            rectF.set(N, f10 - f16, f16 + N, f10);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(N, f10);
        }
        path.close();
        canvas.drawPath(path, this.y);
    }

    public e6 getModel() {
        return this.a;
    }

    public final void h(Canvas canvas, int i7, int i10) {
        float N = i7 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float L = this.e[0] - org.telegram.messenger.g0.L(16.0f);
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f10 = f(this.e[0], i7);
        float f11 = f(this.e[0], i10);
        Path path = this.F;
        path.rewind();
        path.moveTo(this.e[0] + f10, N);
        path.lineTo(L + min, N);
        float f12 = min * 2.0f;
        float f13 = L + f12;
        RectF rectF = this.E;
        rectF.set(L, N, f13, N + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f12, f13, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f11, N2);
        if (f11 > 0.0f) {
            int i11 = this.e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i11, N2 - f14, i11 + f14, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N2);
        }
        path.lineTo(this.e[0], N + f10);
        if (f10 > 0.0f) {
            int i12 = this.e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i12, N, i12 + f15, f15 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.y);
    }

    public final void i(float f10, int i7, int i10, Canvas canvas) {
        float f11 = f(i7, i10);
        if (f11 <= 0.0f) {
            return;
        }
        float f12 = i7 == this.e[0] ? i7 + f11 : i7 - f11;
        float f13 = i10 == this.f[0] ? i10 + f11 : i10 - f11;
        RectF rectF = this.E;
        rectF.set(f12 - f11, f13 - f11, f12 + f11, f13 + f11);
        canvas.drawArc(rectF, f10, 90.0f, false, this.w);
    }

    public final int j() {
        for (int i7 = 0; i7 < this.a.c; i7++) {
            if (e(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i7 = 0; i7 < this.a.b; i7++) {
            if (t(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean l() {
        e6 e6Var = this.a;
        if (e6Var != null && this.h != null) {
            ArrayList arrayList = e6Var.g;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                if (((LinkedHashSet) ((l2.y) this.h).b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final p5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                if (p5Var.b == pagetablecell) {
                    return p5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i7) {
        if (i7 < 0 || i7 >= this.a.c) {
            return false;
        }
        for (int i10 = 0; i10 < this.a.b; i10++) {
            if (!p(i10, i7)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i7) {
        if (i7 < 0 || i7 >= this.a.b) {
            return false;
        }
        for (int i10 = 0; i10 < this.a.c; i10++) {
            if (!p(i7, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.a == null) {
            return;
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                int b10 = this.a.b(p5Var.b);
                int a10 = this.a.a(p5Var.b);
                if (b10 >= 0 && a10 >= 0) {
                    int i14 = this.e[a10];
                    int i15 = this.f[b10];
                    p5Var.layout(i14, i15, p5Var.getMeasuredWidth() + i14, p5Var.getMeasuredHeight() + i15);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        int ceil;
        int i14;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int L3 = org.telegram.messenger.g0.L(4.0f);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        e6 e6Var = this.a;
        if (e6Var == null || e6Var.b == 0 || e6Var.c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), L2 + L4);
            this.c = new int[0];
            this.d = new int[0];
            this.e = new int[0];
            this.f = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i7) - L) - L3;
        e6 e6Var2 = this.a;
        int i15 = e6Var2.b;
        int i16 = e6Var2.c;
        this.c = new int[i16];
        this.d = new int[i15];
        int L5 = org.telegram.messenger.g0.L(e6Var2.a.compact ? 20.0f : 50.0f);
        int L6 = org.telegram.messenger.g0.L((this.a.a.compact ? 5 : 12) * 2);
        int max = Math.max(1, Math.max(L5, i16 > 1 ? Math.round(size * 0.8f) : size) - L6);
        ArrayList arrayList2 = new ArrayList();
        int i17 = 0;
        while (i17 < getChildCount()) {
            View childAt = getChildAt(i17);
            if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                g1 g1Var = p5Var.a;
                int a10 = this.a.a(p5Var.b);
                if (a10 >= 0 && a10 < i16) {
                    arrayList = arrayList2;
                    Editable text = g1Var.getText();
                    i12 = L;
                    if (text == null) {
                        i13 = L3;
                        ceil = 0;
                    } else {
                        i13 = L3;
                        ceil = (int) Math.ceil(Layout.getDesiredWidth(text, g1Var.getPaint()));
                    }
                    i14 = i17;
                    arrayList.add(na.b(text, g1Var.getPaint(), a10, e6.n(p5Var.b), L6, max, ceil));
                    i17 = i14 + 1;
                    arrayList2 = arrayList;
                    L = i12;
                    L3 = i13;
                }
            }
            i12 = L;
            i13 = L3;
            arrayList = arrayList2;
            i14 = i17;
            i17 = i14 + 1;
            arrayList2 = arrayList;
            L = i12;
            L3 = i13;
        }
        int i18 = L;
        int i19 = L3;
        System.arraycopy(na.a(i16, size, L5, arrayList2), 0, this.c, 0, i16);
        int i20 = 0;
        for (int i21 : this.c) {
            i20 += i21;
        }
        if (i20 < size && i16 > 0) {
            int i22 = size - i20;
            int i23 = 0;
            while (i23 < i16) {
                int round = i23 == i16 + (-1) ? i22 : Math.round((this.c[i23] * i22) / i20);
                int[] iArr = this.c;
                int i24 = iArr[i23] + round;
                iArr[i23] = i24;
                i22 -= round;
                i20 -= i24 - round;
                i23++;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        for (int i25 = 0; i25 < getChildCount(); i25++) {
            View childAt2 = getChildAt(i25);
            if (childAt2 instanceof p5) {
                p5 p5Var2 = (p5) childAt2;
                int b10 = this.a.b(p5Var2.b);
                int a11 = this.a.a(p5Var2.b);
                int n10 = e6.n(p5Var2.b);
                int i26 = 0;
                for (int i27 = a11; i27 < a11 + n10 && i27 < i16; i27++) {
                    i26 += this.c[i27];
                }
                p5Var2.measure(View.MeasureSpec.makeMeasureSpec(i26, TLObject.FLAG_30), makeMeasureSpec);
                if (e6.o(p5Var2.b) == 1) {
                    int measuredHeight = p5Var2.getMeasuredHeight();
                    int[] iArr2 = this.d;
                    if (measuredHeight > iArr2[b10]) {
                        iArr2[b10] = p5Var2.getMeasuredHeight();
                    }
                }
            }
        }
        for (int i28 = 0; i28 < getChildCount(); i28++) {
            View childAt3 = getChildAt(i28);
            if (childAt3 instanceof p5) {
                p5 p5Var3 = (p5) childAt3;
                int b11 = this.a.b(p5Var3.b);
                int o4 = e6.o(p5Var3.b);
                if (o4 > 1) {
                    int i29 = b11;
                    int i30 = 0;
                    while (true) {
                        i11 = b11 + o4;
                        if (i29 >= i11 || i29 >= i15) {
                            break;
                        }
                        i30 += this.d[i29];
                        i29++;
                    }
                    int measuredHeight2 = p5Var3.getMeasuredHeight();
                    if (measuredHeight2 > i30) {
                        int i31 = measuredHeight2 - i30;
                        int max2 = i31 / Math.max(o4, 1);
                        int max3 = i31 % Math.max(o4, 1);
                        while (b11 < i11 && b11 < i15) {
                            int[] iArr3 = this.d;
                            iArr3[b11] = (max3 > 0 ? 1 : 0) + max2 + iArr3[b11];
                            if (max3 > 0) {
                                max3--;
                            }
                            b11++;
                        }
                    }
                }
            }
        }
        for (int i32 = 0; i32 < getChildCount(); i32++) {
            View childAt4 = getChildAt(i32);
            if (childAt4 instanceof p5) {
                p5 p5Var4 = (p5) childAt4;
                int b12 = this.a.b(p5Var4.b);
                int a12 = this.a.a(p5Var4.b);
                int n11 = e6.n(p5Var4.b);
                int o10 = e6.o(p5Var4.b);
                int i33 = 0;
                for (int i34 = a12; i34 < a12 + n11 && i34 < i16; i34++) {
                    i33 += this.c[i34];
                }
                int i35 = 0;
                for (int i36 = b12; i36 < b12 + o10 && i36 < i15; i36++) {
                    i35 += this.d[i36];
                }
                p5Var4.measure(View.MeasureSpec.makeMeasureSpec(i33, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i35, TLObject.FLAG_30));
            }
        }
        int[] iArr4 = new int[i16 + 1];
        this.e = iArr4;
        iArr4[0] = i18;
        int i37 = 0;
        while (i37 < i16) {
            int[] iArr5 = this.e;
            int i38 = i37 + 1;
            iArr5[i38] = iArr5[i37] + this.c[i37];
            i37 = i38;
        }
        int[] iArr6 = new int[i15 + 1];
        this.f = iArr6;
        iArr6[0] = L2;
        int i39 = 0;
        while (i39 < i15) {
            int[] iArr7 = this.f;
            int i40 = i39 + 1;
            iArr7[i40] = iArr7[i39] + this.d[i39];
            i39 = i40;
        }
        setMeasuredDimension(Math.max(this.e[i16] + i19, size + i18 + i19), this.f[i15] + L4);
    }

    public final boolean p(int i7, int i10) {
        n5 n5Var;
        e6 e6Var = this.a;
        if (e6Var == null || (n5Var = this.h) == null || i7 < 0 || i7 >= e6Var.b || i10 < 0 || i10 >= e6Var.c) {
            return false;
        }
        return ((LinkedHashSet) ((l2.y) n5Var).b).contains(e6Var.d[i7][i10]);
    }

    public final int q() {
        for (int i7 = this.a.c - 1; i7 >= 0; i7--) {
            if (e(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i7 = this.a.b - 1; i7 >= 0; i7--) {
            if (t(i7)) {
                return i7;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof p5) {
                removeViewAt(childCount);
            }
        }
        e6 e6Var = this.a;
        if (e6Var == null) {
            return;
        }
        int size = e6Var.g.size();
        for (int i7 = 0; i7 < size; i7++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.a.g.get(i7);
            p5 p5Var = new p5(getContext(), this.b);
            p5Var.setCompact(this.a.a.compact);
            p5Var.b(pagetablecell);
            addView(p5Var);
        }
    }

    public void setModel(e6 e6Var) {
        this.a = e6Var;
        s();
    }

    public void setSelectionProvider(n5 n5Var) {
        this.h = n5Var;
        invalidate();
    }

    public final boolean t(int i7) {
        if (i7 >= 0 && i7 < this.a.b) {
            for (int i10 = 0; i10 < this.a.c; i10++) {
                if (p(i7, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        if (l()) {
            return !d(k(), r()) || c(j(), q());
        }
        return false;
    }

    public final boolean v() {
        if (l()) {
            return !c(j(), q()) || d(k(), r());
        }
        return false;
    }
}
