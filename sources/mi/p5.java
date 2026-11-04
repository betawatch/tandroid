package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class p5 extends ViewGroup {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final org.telegram.ui.Components.u5 H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public f6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public o5 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final Paint y;

    public p5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.b = e6Var;
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
        this.H = new org.telegram.ui.Components.u5(this, 0L, 220L, xq.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        TL_iv.pageTableCell pagetablecell;
        f6 f6Var = this.a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (f6Var != null && f6Var.b != 0 && f6Var.c != 0) {
            View findFocus = findFocus();
            for (ViewParent parent = findFocus == null ? null : findFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
                if (parent instanceof q5) {
                    pagetablecell = ((q5) parent).b;
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
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((l5.b) this.h).b).contains(pagetablecell3)) {
                    int b10 = this.a.b(pagetablecell3);
                    int a10 = this.a.a(pagetablecell3);
                    if (b10 < i3 || (b10 == i3 && a10 < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i3 = b10;
                        i11 = a10;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i3 = k6.ei;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.n.setColor(k6.w0(i3, e6Var));
        int w02 = k6.w0(k6.M6, e6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.r.setColor(k6.w0(k6.di, e6Var));
        this.s.setColor(Color.argb(20, red, green, blue));
        this.I = hs.e4;
        int i10 = k6.Ci;
        this.w.setColor(k6.w0(i10, e6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.x;
        paint.setStyle(style);
        this.P = k6.w0(k6.E6, e6Var);
        this.Q = k6.w0(k6.Gi, e6Var);
        paint.setColor(this.P);
        Paint paint2 = this.y;
        paint2.setStyle(style);
        paint2.setColor(k6.w0(i10, e6Var));
        invalidate();
    }

    public final boolean c(int i3, int i10) {
        if (i3 < 0 || i10 < i3) {
            return false;
        }
        while (i3 <= i10) {
            if (!n(i3)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    public final boolean d(int i3, int i10) {
        if (i3 < 0 || i10 < i3) {
            return false;
        }
        while (i3 <= i10) {
            if (!o(i3)) {
                return false;
            }
            i3++;
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
        int i3;
        int i10;
        int min2;
        float f10;
        f6 f6Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_iv.pageBlockTable pageblocktable;
        Canvas canvas3 = canvas;
        this.K = false;
        this.J = false;
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
                    this.J = true;
                    int[] iArr = this.f;
                    this.L = iArr[b10];
                    this.M = iArr[Math.min(b10 + i16, this.a.b)];
                }
                if (n(a11)) {
                    this.K = true;
                    int[] iArr2 = this.e;
                    this.N = iArr2[a11];
                    this.O = iArr2[Math.min(a11 + i17, this.a.c)];
                }
            }
        }
        f6 f6Var2 = this.a;
        RectF rectF = this.E;
        if (f6Var2 != null && f6Var2.b != 0 && f6Var2.c != 0) {
            TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
            boolean z10 = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            float f11 = this.e[0];
            float f12 = this.f[0];
            f6 f6Var3 = this.a;
            rectF.set(f11, f12, r2[f6Var3.c], r4[f6Var3.b]);
            Path path = this.G;
            path.rewind();
            path.addRoundRect(rectF, org.telegram.messenger.g0.N(10.0f), org.telegram.messenger.g0.N(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i18 = 0; i18 < getChildCount(); i18++) {
                View childAt = getChildAt(i18);
                if (childAt instanceof q5) {
                    q5 q5Var = (q5) childAt;
                    int b11 = this.a.b(q5Var.b);
                    int a12 = this.a.a(q5Var.b);
                    if (b11 >= 0 && a12 >= 0) {
                        int n4 = f6.n(q5Var.b);
                        int o10 = f6.o(q5Var.b);
                        int[] iArr3 = this.e;
                        int i19 = iArr3[a12];
                        int i20 = this.f[b11];
                        int i21 = iArr3[Math.min(a12 + n4, this.a.c)];
                        int i22 = this.f[Math.min(o10 + b11, this.a.b)];
                        if (q5Var.b.header) {
                            canvas3.drawRect(i19, i20, i21, i22, this.r);
                        } else if (z10 && b11 % 2 == 0) {
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
            int r5 = r();
            int j10 = j();
            int q10 = q();
            if (d(k10, r5)) {
                int[] iArr4 = this.f;
                h(canvas3, iArr4[k10], iArr4[r5 + 1]);
            }
            if (c(j10, q10)) {
                int[] iArr5 = this.e;
                g(canvas3, iArr5[j10], iArr5[q10 + 1]);
            }
        } else {
            if (this.J) {
                h(canvas3, this.L, this.M);
            }
            if (this.K) {
                g(canvas3, this.N, this.O);
            }
        }
        f6 f6Var4 = this.a;
        if (f6Var4 != null && (pageblocktable = f6Var4.a) != null && pageblocktable.bordered) {
            Paint paint = this.n;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float N = org.telegram.messenger.g0.N(10.0f);
            int[] iArr6 = this.e;
            int[] iArr7 = this.f;
            f6 f6Var5 = this.a;
            rectF.set(iArr6[0] + strokeWidth, iArr7[0] + strokeWidth, iArr6[f6Var5.c] - strokeWidth, iArr7[f6Var5.b] - strokeWidth);
            canvas3.drawRoundRect(rectF, N, N, paint);
            int i23 = 1;
            while (i23 < this.a.c) {
                int i24 = this.e[i23];
                int i25 = 0;
                int i26 = -1;
                while (true) {
                    f6 f6Var6 = this.a;
                    if (i25 >= f6Var6.b) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = f6Var6.d[i25];
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
                    f6 f6Var7 = this.a;
                    if (i29 >= f6Var7.c) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = f6Var7.d;
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
            float e10 = this.H.e(false, l() ? 1.0f : 0.0f);
            if (e10 > 0.001f) {
                Paint paint2 = this.w;
                paint2.setAlpha((int) (this.I * e10));
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
                    f6Var = this.a;
                    i11 = f6Var.c;
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
                int i42 = f6Var.b;
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
                    paint3.setColor(this.J ? this.Q : this.P);
                    for (int i45 = -1; i45 <= 1; i45++) {
                        canvas2.drawCircle(L2, (i45 * L) + f30, N2, paint3);
                    }
                    int[] iArr10 = this.e;
                    float f31 = (iArr10[a14] + iArr10[Math.min(a14 + i44, this.a.c)]) / 2.0f;
                    paint3.setColor(this.K ? this.Q : this.P);
                    for (int i46 = -1; i46 <= 1; i46++) {
                        canvas2.drawCircle((i46 * L) + f31, L3, N2, paint3);
                    }
                    return;
                }
                int k11 = k();
                int r9 = r();
                int j11 = j();
                int q11 = q();
                if (k11 < 0 || j11 < 0) {
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
                    i3 = iArr11[k11];
                    i10 = iArr11[r9 + 1];
                } else {
                    int[] iArr12 = this.f;
                    i3 = iArr12[b13];
                    i10 = iArr12[min];
                }
                float f32 = (i3 + i10) / 2.0f;
                paint3.setColor((v && d(k11, r9)) ? this.Q : this.P);
                for (int i48 = -1; i48 <= 1; i48++) {
                    canvas2.drawCircle(L2, (i48 * L) + f32, N2, paint3);
                }
                boolean u10 = u();
                int a16 = a15 == null ? j11 : this.a.a(a15);
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
                    f10 = iArr13[j11] + iArr13[q11 + 1];
                } else {
                    int[] iArr14 = this.e;
                    f10 = iArr14[a16] + iArr14[min2];
                }
                float f33 = f10 / 2.0f;
                paint3.setColor((u10 && c(j11, q11)) ? this.Q : this.P);
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

    public final boolean e(int i3) {
        if (i3 >= 0 && i3 < this.a.c) {
            for (int i10 = 0; i10 < this.a.b; i10++) {
                if (p(i10, i3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i3, int i10) {
        int i11;
        int i12;
        f6 f6Var = this.a;
        int i13 = f6Var.c;
        int i14 = f6Var.b;
        int[] iArr = this.e;
        if (i3 != iArr[0]) {
            if (i3 == iArr[i13]) {
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

    public final void g(Canvas canvas, int i3, int i10) {
        float N = i3 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float f10 = this.f[this.a.b];
        float L = org.telegram.messenger.g0.L(16.0f) + f10;
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f11 = f(i3, this.f[this.a.b]);
        float f12 = f(i10, this.f[this.a.b]);
        Path path = this.G;
        path.rewind();
        path.moveTo(N, f10 - f11);
        path.lineTo(N, L - min);
        float f13 = min * 2.0f;
        float f14 = L - f13;
        RectF rectF = this.F;
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

    public f6 getModel() {
        return this.a;
    }

    public final void h(Canvas canvas, int i3, int i10) {
        float N = i3 - org.telegram.messenger.g0.N(1.0f);
        float N2 = org.telegram.messenger.g0.N(1.0f) + i10;
        float L = this.e[0] - org.telegram.messenger.g0.L(16.0f);
        float min = Math.min(org.telegram.messenger.g0.N(10.0f), (N2 - N) / 2.0f);
        float f10 = f(this.e[0], i3);
        float f11 = f(this.e[0], i10);
        Path path = this.G;
        path.rewind();
        path.moveTo(this.e[0] + f10, N);
        path.lineTo(L + min, N);
        float f12 = min * 2.0f;
        float f13 = L + f12;
        RectF rectF = this.F;
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

    public final void i(float f10, int i3, int i10, Canvas canvas) {
        float f11 = f(i3, i10);
        if (f11 <= 0.0f) {
            return;
        }
        float f12 = i3 == this.e[0] ? i3 + f11 : i3 - f11;
        float f13 = i10 == this.f[0] ? i10 + f11 : i10 - f11;
        RectF rectF = this.F;
        rectF.set(f12 - f11, f13 - f11, f12 + f11, f13 + f11);
        canvas.drawArc(rectF, f10, 90.0f, false, this.w);
    }

    public final int j() {
        for (int i3 = 0; i3 < this.a.c; i3++) {
            if (e(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i3 = 0; i3 < this.a.b; i3++) {
            if (t(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean l() {
        f6 f6Var = this.a;
        if (f6Var != null && this.h != null) {
            ArrayList arrayList = f6Var.g;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (((LinkedHashSet) ((l5.b) this.h).b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final q5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                if (q5Var.b == pagetablecell) {
                    return q5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i3) {
        if (i3 < 0 || i3 >= this.a.c) {
            return false;
        }
        for (int i10 = 0; i10 < this.a.b; i10++) {
            if (!p(i10, i3)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i3) {
        if (i3 < 0 || i3 >= this.a.b) {
            return false;
        }
        for (int i10 = 0; i10 < this.a.c; i10++) {
            if (!p(i3, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        if (this.a == null) {
            return;
        }
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                int b10 = this.a.b(q5Var.b);
                int a10 = this.a.a(q5Var.b);
                if (b10 >= 0 && a10 >= 0) {
                    int i14 = this.e[a10];
                    int i15 = this.f[b10];
                    q5Var.layout(i14, i15, q5Var.getMeasuredWidth() + i14, q5Var.getMeasuredHeight() + i15);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int a10;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f);
        int L3 = org.telegram.messenger.g0.L(4.0f);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        f6 f6Var = this.a;
        int i16 = 0;
        if (f6Var == null || f6Var.b == 0 || f6Var.c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), L2 + L4);
            this.c = new int[0];
            this.d = new int[0];
            this.e = new int[0];
            this.f = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i3) - L) - L3;
        f6 f6Var2 = this.a;
        int i17 = f6Var2.b;
        int i18 = f6Var2.c;
        this.c = new int[i18];
        this.d = new int[i17];
        int L5 = org.telegram.messenger.g0.L(f6Var2.a.compact ? 20.0f : 50.0f);
        int i19 = this.a.a.compact ? 5 : 12;
        int d = i18 == 2 ? k2.p1.d(i19 * 4, size / 2, 0) : Math.max(0, Math.round(size / 1.5f));
        float f10 = i19 * 2;
        int b10 = org.telegram.messenger.k5.b(f10, d, L5);
        for (int i20 = 0; i20 < i18; i20++) {
            this.c[i20] = L5;
        }
        int i21 = 0;
        while (true) {
            i11 = 1;
            if (i21 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i21);
            if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                h1 h1Var = q5Var.a;
                if (f6.n(q5Var.b) == 1 && (a10 = this.a.a(q5Var.b)) >= 0 && a10 < i18) {
                    int L6 = org.telegram.messenger.g0.L(f10) + Math.round(Layout.getDesiredWidth(h1Var.getText(), h1Var.getPaint()));
                    int[] iArr = this.c;
                    iArr[a10] = Math.max(iArr[a10], Math.min(b10, L6));
                }
            }
            i21++;
        }
        int i22 = 0;
        while (i22 < getChildCount()) {
            View childAt2 = getChildAt(i22);
            if (childAt2 instanceof q5) {
                q5 q5Var2 = (q5) childAt2;
                h1 h1Var2 = q5Var2.a;
                int n4 = f6.n(q5Var2.b);
                if (n4 > i11) {
                    i15 = i11;
                    int a11 = this.a.a(q5Var2.b);
                    int min = Math.min(i18, n4 + a11);
                    if (a11 >= 0 && a11 < min) {
                        int i23 = i16;
                        for (int i24 = a11; i24 < min; i24++) {
                            i23 += this.c[i24];
                        }
                        int min2 = Math.min((min - a11) * b10, org.telegram.messenger.g0.L(f10) + Math.round(Layout.getDesiredWidth(h1Var2.getText(), h1Var2.getPaint()))) - i23;
                        while (a11 < min && min2 > 0) {
                            int i25 = ((min2 + r14) - 1) / (min - a11);
                            int[] iArr2 = this.c;
                            iArr2[a11] = iArr2[a11] + i25;
                            min2 -= i25;
                            a11++;
                        }
                    }
                    i22++;
                    i11 = i15;
                    i16 = 0;
                }
            }
            i15 = i11;
            i22++;
            i11 = i15;
            i16 = 0;
        }
        int i26 = i11;
        int i27 = 0;
        for (int i28 : this.c) {
            i27 += i28;
        }
        if (i27 < size && i18 > 0) {
            int i29 = size - i27;
            int i30 = 0;
            while (i30 < i18) {
                int round = i30 == i18 + (-1) ? i29 : Math.round((this.c[i30] * i29) / i27);
                int[] iArr3 = this.c;
                int i31 = iArr3[i30] + round;
                iArr3[i30] = i31;
                i29 -= round;
                i27 -= i31 - round;
                i30++;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i32 = 0;
        while (i32 < getChildCount()) {
            View childAt3 = getChildAt(i32);
            if (childAt3 instanceof q5) {
                q5 q5Var3 = (q5) childAt3;
                int b11 = this.a.b(q5Var3.b);
                int a12 = this.a.a(q5Var3.b);
                int n10 = f6.n(q5Var3.b);
                i14 = i32;
                int i33 = 0;
                for (int i34 = a12; i34 < a12 + n10 && i34 < i18; i34++) {
                    i33 += this.c[i34];
                }
                q5Var3.measure(View.MeasureSpec.makeMeasureSpec(i33, TLObject.FLAG_30), makeMeasureSpec);
                if (f6.o(q5Var3.b) == i26) {
                    int measuredHeight = q5Var3.getMeasuredHeight();
                    int[] iArr4 = this.d;
                    if (measuredHeight > iArr4[b11]) {
                        iArr4[b11] = q5Var3.getMeasuredHeight();
                    }
                }
            } else {
                i14 = i32;
            }
            i32 = i14 + 1;
            i26 = 1;
        }
        for (int i35 = 0; i35 < getChildCount(); i35++) {
            View childAt4 = getChildAt(i35);
            if (childAt4 instanceof q5) {
                q5 q5Var4 = (q5) childAt4;
                int b12 = this.a.b(q5Var4.b);
                int o10 = f6.o(q5Var4.b);
                if (o10 > 1) {
                    int i36 = b12;
                    int i37 = 0;
                    while (true) {
                        i13 = b12 + o10;
                        if (i36 >= i13 || i36 >= i17) {
                            break;
                        }
                        i37 += this.d[i36];
                        i36++;
                    }
                    int measuredHeight2 = q5Var4.getMeasuredHeight();
                    if (measuredHeight2 > i37) {
                        int i38 = measuredHeight2 - i37;
                        int max = i38 / Math.max(o10, 1);
                        int max2 = i38 % Math.max(o10, 1);
                        while (b12 < i13 && b12 < i17) {
                            int[] iArr5 = this.d;
                            iArr5[b12] = max + (max2 > 0 ? 1 : 0) + iArr5[b12];
                            if (max2 > 0) {
                                max2--;
                            }
                            b12++;
                        }
                    }
                }
            }
        }
        int i39 = 0;
        while (i39 < getChildCount()) {
            View childAt5 = getChildAt(i39);
            if (childAt5 instanceof q5) {
                q5 q5Var5 = (q5) childAt5;
                int b13 = this.a.b(q5Var5.b);
                int a13 = this.a.a(q5Var5.b);
                int n11 = f6.n(q5Var5.b);
                int o11 = f6.o(q5Var5.b);
                i12 = i39;
                int i40 = 0;
                for (int i41 = a13; i41 < a13 + n11 && i41 < i18; i41++) {
                    i40 += this.c[i41];
                }
                int i42 = 0;
                for (int i43 = b13; i43 < b13 + o11 && i43 < i17; i43++) {
                    i42 += this.d[i43];
                }
                q5Var5.measure(View.MeasureSpec.makeMeasureSpec(i40, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i42, TLObject.FLAG_30));
            } else {
                i12 = i39;
            }
            i39 = i12 + 1;
        }
        int[] iArr6 = new int[i18 + 1];
        this.e = iArr6;
        iArr6[0] = L;
        int i44 = 0;
        while (i44 < i18) {
            int[] iArr7 = this.e;
            int i45 = i44 + 1;
            iArr7[i45] = iArr7[i44] + this.c[i44];
            i44 = i45;
        }
        int[] iArr8 = new int[i17 + 1];
        this.f = iArr8;
        iArr8[0] = L2;
        int i46 = 0;
        while (i46 < i17) {
            int[] iArr9 = this.f;
            int i47 = i46 + 1;
            iArr9[i47] = iArr9[i46] + this.d[i46];
            i46 = i47;
        }
        setMeasuredDimension(Math.max(this.e[i18] + L3, size + L + L3), this.f[i17] + L4);
    }

    public final boolean p(int i3, int i10) {
        o5 o5Var;
        f6 f6Var = this.a;
        if (f6Var == null || (o5Var = this.h) == null || i3 < 0 || i3 >= f6Var.b || i10 < 0 || i10 >= f6Var.c) {
            return false;
        }
        return ((LinkedHashSet) ((l5.b) o5Var).b).contains(f6Var.d[i3][i10]);
    }

    public final int q() {
        for (int i3 = this.a.c - 1; i3 >= 0; i3--) {
            if (e(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i3 = this.a.b - 1; i3 >= 0; i3--) {
            if (t(i3)) {
                return i3;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof q5) {
                removeViewAt(childCount);
            }
        }
        f6 f6Var = this.a;
        if (f6Var == null) {
            return;
        }
        int size = f6Var.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.a.g.get(i3);
            q5 q5Var = new q5(getContext(), this.b);
            q5Var.setCompact(this.a.a.compact);
            q5Var.b(pagetablecell);
            addView(q5Var);
        }
    }

    public void setModel(f6 f6Var) {
        this.a = f6Var;
        s();
    }

    public void setSelectionProvider(o5 o5Var) {
        this.h = o5Var;
        invalidate();
    }

    public final boolean t(int i3) {
        if (i3 >= 0 && i3 < this.a.b) {
            for (int i10 = 0; i10 < this.a.c; i10++) {
                if (p(i3, i10)) {
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
