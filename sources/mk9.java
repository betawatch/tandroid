// default package

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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class mk9 extends ViewGroup {
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final ln H;
    public short I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public fhb a;
    public final ylb b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public lk9 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final Paint y;

    public mk9(Context context, ylb ylbVar) {
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
        this.b = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.N(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.L(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.H = new ln(this, 0L, 220L, d53.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        TL_iv.pageTableCell pagetablecell;
        fhb fhbVar = this.a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (fhbVar != null && fhbVar.b != 0 && fhbVar.c != 0) {
            View findFocus = findFocus();
            for (ViewParent parent = findFocus == null ? null : findFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
                if (parent instanceof nk9) {
                    pagetablecell = ((nk9) parent).b;
                    break;
                }
            }
            pagetablecell = null;
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h != null) {
                ArrayList arrayList = this.a.g;
                int size = arrayList.size();
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i2 = 0;
                int i3 = Integer.MAX_VALUE;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                    if (((LinkedHashSet) ((yf9) this.h).b).contains(pagetablecell3)) {
                        int b = this.a.b(pagetablecell3);
                        int a = this.a.a(pagetablecell3);
                        if (b < i || (b == i && a < i3)) {
                            pagetablecell2 = pagetablecell3;
                            i = b;
                            i3 = a;
                        }
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i = cmb.gi;
        ylb ylbVar = this.b;
        this.n.setColor(cmb.v0(i, ylbVar));
        int v0 = cmb.v0(cmb.L6, ylbVar);
        int red = Color.red(v0);
        int green = Color.green(v0);
        int blue = Color.blue(v0);
        this.r.setColor(cmb.v0(cmb.fi, ylbVar));
        this.s.setColor(Color.argb(20, red, green, blue));
        this.I = (short) 255;
        int i2 = cmb.Ei;
        this.w.setColor(cmb.v0(i2, ylbVar));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.x;
        paint.setStyle(style);
        this.P = cmb.v0(cmb.D6, ylbVar);
        this.Q = cmb.v0(cmb.Ii, ylbVar);
        paint.setColor(this.P);
        Paint paint2 = this.y;
        paint2.setStyle(style);
        paint2.setColor(cmb.v0(i2, ylbVar));
        invalidate();
    }

    public final boolean c(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (!n(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final boolean d(int i, int i2) {
        if (i < 0 || i2 < i) {
            return false;
        }
        while (i <= i2) {
            if (!o(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0515 A[ORIG_RETURN, RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int min;
        int min2;
        int i;
        int i2;
        fhb fhbVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TL_iv.pageBlockTable pageblocktable;
        Canvas canvas3 = canvas;
        this.K = false;
        this.J = false;
        TL_iv.pageTableCell a = a();
        if (a != null) {
            int b = this.a.b(a);
            int a2 = this.a.a(a);
            if (b >= 0 && a2 >= 0) {
                int i8 = a.rowspan;
                if (i8 == 0) {
                    i8 = 1;
                }
                int i9 = a.colspan;
                if (i9 == 0) {
                    i9 = 1;
                }
                if (o(b)) {
                    this.J = true;
                    int[] iArr = this.f;
                    this.L = iArr[b];
                    this.M = iArr[Math.min(b + i8, this.a.b)];
                }
                if (n(a2)) {
                    this.K = true;
                    int[] iArr2 = this.e;
                    this.N = iArr2[a2];
                    this.O = iArr2[Math.min(a2 + i9, this.a.c)];
                }
            }
        }
        fhb fhbVar2 = this.a;
        RectF rectF = this.E;
        if (fhbVar2 != null && fhbVar2.b != 0 && fhbVar2.c != 0) {
            TL_iv.pageBlockTable pageblocktable2 = fhbVar2.a;
            boolean z = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            float f = this.e[0];
            float f2 = this.f[0];
            fhb fhbVar3 = this.a;
            rectF.set(f, f2, r2[fhbVar3.c], r4[fhbVar3.b]);
            Path path = this.G;
            path.rewind();
            path.addRoundRect(rectF, gm.N(10.0f), gm.N(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof nk9) {
                    nk9 nk9Var = (nk9) childAt;
                    int b2 = this.a.b(nk9Var.b);
                    int a3 = this.a.a(nk9Var.b);
                    if (b2 >= 0 && a3 >= 0) {
                        int n = fhb.n(nk9Var.b);
                        int o = fhb.o(nk9Var.b);
                        int[] iArr3 = this.e;
                        int i11 = iArr3[a3];
                        int i12 = this.f[b2];
                        int i13 = iArr3[Math.min(a3 + n, this.a.c)];
                        int i14 = this.f[Math.min(o + b2, this.a.b)];
                        if (nk9Var.b.header) {
                            canvas3.drawRect(i11, i12, i13, i14, this.r);
                        } else if (z && b2 % 2 == 0) {
                            canvas3 = canvas;
                            canvas3.drawRect(i11, i12, i13, i14, this.s);
                        }
                        canvas3 = canvas;
                    }
                }
            }
            canvas3.restore();
        }
        super.dispatchDraw(canvas);
        if (l()) {
            int k = k();
            int r = r();
            int j = j();
            int q = q();
            if (d(k, r)) {
                int[] iArr4 = this.f;
                h(canvas3, iArr4[k], iArr4[r + 1]);
            }
            if (c(j, q)) {
                int[] iArr5 = this.e;
                g(canvas3, iArr5[j], iArr5[q + 1]);
            }
        } else {
            if (this.J) {
                h(canvas3, this.L, this.M);
            }
            if (this.K) {
                g(canvas3, this.N, this.O);
            }
        }
        fhb fhbVar4 = this.a;
        if (fhbVar4 != null && (pageblocktable = fhbVar4.a) != null && pageblocktable.bordered) {
            Paint paint = this.n;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float N = gm.N(10.0f);
            int[] iArr6 = this.e;
            int[] iArr7 = this.f;
            fhb fhbVar5 = this.a;
            rectF.set(iArr6[0] + strokeWidth, iArr7[0] + strokeWidth, iArr6[fhbVar5.c] - strokeWidth, iArr7[fhbVar5.b] - strokeWidth);
            canvas3.drawRoundRect(rectF, N, N, paint);
            int i15 = 1;
            while (i15 < this.a.c) {
                int i16 = this.e[i15];
                int i17 = 0;
                int i18 = -1;
                while (true) {
                    fhb fhbVar6 = this.a;
                    if (i17 >= fhbVar6.b) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = fhbVar6.d[i17];
                    if (pagetablecellArr[i15 - 1] != pagetablecellArr[i15]) {
                        if (i18 < 0) {
                            i18 = this.f[i17];
                        }
                    } else if (i18 >= 0) {
                        float f3 = i16;
                        canvas3.drawLine(f3, i18, f3, this.f[i17], paint);
                        i18 = -1;
                    }
                    i17++;
                    canvas3 = canvas;
                }
                if (i18 >= 0) {
                    float f4 = i16;
                    canvas.drawLine(f4, i18, f4, this.f[r4], paint);
                }
                i15++;
                canvas3 = canvas;
            }
            int i19 = 1;
            while (true) {
                fhbVar4 = this.a;
                if (i19 >= fhbVar4.b) {
                    break;
                }
                int i20 = this.f[i19];
                int i21 = 0;
                int i22 = -1;
                while (true) {
                    fhb fhbVar7 = this.a;
                    if (i21 >= fhbVar7.c) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = fhbVar7.d;
                    if (pagetablecellArr2[i19 - 1][i21] != pagetablecellArr2[i19][i21]) {
                        if (i22 < 0) {
                            i22 = this.e[i21];
                        }
                    } else if (i22 >= 0) {
                        float f5 = i20;
                        canvas.drawLine(i22, f5, this.e[i21], f5, paint);
                        i22 = -1;
                    }
                    i21++;
                }
                if (i22 >= 0) {
                    float f6 = i22;
                    float f7 = i20;
                    canvas.drawLine(f6, f7, this.e[r3], f7, paint);
                }
                i19++;
            }
        }
        if (fhbVar4 != null) {
            float e = this.H.e(false, l() ? 1.0f : 0.0f);
            if (e > 0.001f) {
                Paint paint2 = this.w;
                paint2.setAlpha((int) (this.I * e));
                paint2.setStrokeWidth(Math.max(0.4f, e) * gm.N(2.0f));
                int i23 = 0;
                while (true) {
                    int i24 = this.a.b;
                    if (i23 > i24) {
                        break;
                    }
                    int[] iArr8 = this.f;
                    int i25 = i23 < i24 ? iArr8[i23] : iArr8[i24];
                    int i26 = 0;
                    int i27 = -1;
                    while (true) {
                        i6 = this.a.c;
                        if (i26 >= i6) {
                            break;
                        }
                        if (p(i23 - 1, i26) != p(i23, i26)) {
                            if (i27 < 0) {
                                i27 = this.e[i26];
                            }
                        } else if (i27 >= 0) {
                            int i28 = this.e[i26];
                            if (i28 > i27) {
                                float f8 = f(i27, i25) + i27;
                                float f9 = i28 - f(i28, i25);
                                if (f9 > f8) {
                                    float f10 = i25;
                                    canvas.drawLine(f8, f10, f9, f10, paint2);
                                }
                            }
                            i27 = -1;
                        }
                        i26++;
                    }
                    if (i27 >= 0 && (i7 = this.e[i6]) > i27) {
                        float f11 = f(i27, i25) + i27;
                        float f12 = i7 - f(i7, i25);
                        if (f12 > f11) {
                            float f13 = i25;
                            canvas.drawLine(f11, f13, f12, f13, paint2);
                        }
                    }
                    i23++;
                }
                int i29 = 0;
                while (true) {
                    fhbVar = this.a;
                    i3 = fhbVar.c;
                    if (i29 > i3) {
                        break;
                    }
                    int[] iArr9 = this.e;
                    int i30 = i29 < i3 ? iArr9[i29] : iArr9[i3];
                    int i31 = 0;
                    int i32 = -1;
                    while (true) {
                        i4 = this.a.b;
                        if (i31 >= i4) {
                            break;
                        }
                        if (p(i31, i29 - 1) != p(i31, i29)) {
                            if (i32 < 0) {
                                i32 = this.f[i31];
                            }
                        } else if (i32 >= 0) {
                            int i33 = this.f[i31];
                            if (i33 > i32) {
                                float f14 = i32 + f(i30, i32);
                                float f15 = i33 - f(i30, i33);
                                if (f15 > f14) {
                                    float f16 = i30;
                                    canvas.drawLine(f16, f14, f16, f15, paint2);
                                }
                            }
                            i32 = -1;
                        }
                        i31++;
                    }
                    if (i32 >= 0 && (i5 = this.f[i4]) > i32) {
                        float f17 = i32 + f(i30, i32);
                        float f18 = i5 - f(i30, i5);
                        if (f18 > f17) {
                            float f19 = i30;
                            canvas.drawLine(f19, f17, f19, f18, paint2);
                        }
                    }
                    i29++;
                }
                canvas2 = canvas;
                int i34 = fhbVar.b;
                i(180.0f, this.e[0], this.f[0], canvas2);
                i(270.0f, this.e[i3], this.f[0], canvas2);
                i(90.0f, this.e[0], this.f[i34], canvas2);
                i(0.0f, this.e[i3], this.f[i34], canvas2);
                if (this.a == null) {
                    float N2 = gm.N(3.0f) / 2.0f;
                    float L = gm.L(8.0f);
                    float L2 = (this.e[0] - gm.L(6.0f)) - N2;
                    float L3 = gm.L(6.0f) + this.f[this.a.b] + N2;
                    boolean l = l();
                    Paint paint3 = this.x;
                    if (!l) {
                        TL_iv.pageTableCell a4 = a();
                        if (a4 != null) {
                            int b3 = this.a.b(a4);
                            int a5 = this.a.a(a4);
                            if (b3 < 0 || a5 < 0) {
                                return;
                            }
                            int i35 = a4.rowspan;
                            if (i35 == 0) {
                                i35 = 1;
                            }
                            int i36 = a4.colspan;
                            if (i36 == 0) {
                                i36 = 1;
                            }
                            int[] iArr10 = this.f;
                            float f20 = (iArr10[b3] + iArr10[Math.min(b3 + i35, this.a.b)]) / 2.0f;
                            paint3.setColor(this.J ? this.Q : this.P);
                            for (int i37 = -1; i37 <= 1; i37++) {
                                canvas2.drawCircle(L2, (i37 * L) + f20, N2, paint3);
                            }
                            int[] iArr11 = this.e;
                            float f21 = (iArr11[a5] + iArr11[Math.min(a5 + i36, this.a.c)]) / 2.0f;
                            paint3.setColor(this.K ? this.Q : this.P);
                            for (int i38 = -1; i38 <= 1; i38++) {
                                canvas2.drawCircle((i38 * L) + f21, L3, N2, paint3);
                            }
                            return;
                        }
                        return;
                    }
                    int k2 = k();
                    int r2 = r();
                    int j2 = j();
                    int q2 = q();
                    if (k2 < 0 || j2 < 0) {
                        return;
                    }
                    TL_iv.pageTableCell a6 = a();
                    boolean v = v();
                    int b4 = a6 == null ? k2 : this.a.b(a6);
                    if (a6 == null) {
                        min = b4 + 1;
                    } else {
                        int i39 = a6.rowspan;
                        if (i39 == 0) {
                            i39 = 1;
                        }
                        min = Math.min(i39 + b4, this.a.b);
                    }
                    int[] iArr12 = this.f;
                    float f22 = (v ? iArr12[k2] + iArr12[r2 + 1] : iArr12[b4] + iArr12[min]) / 2.0f;
                    paint3.setColor((v && d(k2, r2)) ? this.Q : this.P);
                    for (int i40 = -1; i40 <= 1; i40++) {
                        canvas2.drawCircle(L2, (i40 * L) + f22, N2, paint3);
                    }
                    boolean u = u();
                    int a7 = a6 == null ? j2 : this.a.a(a6);
                    if (a6 == null) {
                        min2 = a7 + 1;
                    } else {
                        int i41 = a6.colspan;
                        if (i41 == 0) {
                            i41 = 1;
                        }
                        min2 = Math.min(i41 + a7, this.a.c);
                    }
                    int[] iArr13 = this.e;
                    if (u) {
                        i = iArr13[j2];
                        i2 = iArr13[q2 + 1];
                    } else {
                        i = iArr13[a7];
                        i2 = iArr13[min2];
                    }
                    float f23 = (i + i2) / 2.0f;
                    paint3.setColor((u && c(j2, q2)) ? this.Q : this.P);
                    for (int i42 = -1; i42 <= 1; i42++) {
                        canvas2.drawCircle((i42 * L) + f23, L3, N2, paint3);
                    }
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        if (this.a == null) {
        }
    }

    public final boolean e(int i) {
        if (i >= 0 && i < this.a.c) {
            for (int i2 = 0; i2 < this.a.b; i2++) {
                if (p(i2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i, int i2) {
        int i3;
        int i4;
        fhb fhbVar = this.a;
        int i5 = fhbVar.c;
        int i6 = fhbVar.b;
        int[] iArr = this.e;
        if (i != iArr[0]) {
            if (i == iArr[i5]) {
                i3 = i5 - 1;
            }
            return 0.0f;
        }
        i3 = 0;
        int[] iArr2 = this.f;
        if (i2 != iArr2[0]) {
            i4 = i2 == iArr2[i6] ? i6 - 1 : 0;
            return 0.0f;
        }
        if (i3 >= 0 && i4 >= 0 && p(i4, i3)) {
            return Math.min(gm.N(10.0f), Math.min(this.c[i3], this.d[i4]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i, int i2) {
        float N = i - gm.N(1.0f);
        float N2 = gm.N(1.0f) + i2;
        float f = this.f[this.a.b];
        float L = gm.L(16.0f) + f;
        float min = Math.min(gm.N(10.0f), (N2 - N) / 2.0f);
        float f2 = f(i, this.f[this.a.b]);
        float f3 = f(i2, this.f[this.a.b]);
        Path path = this.G;
        path.rewind();
        path.moveTo(N, f - f2);
        path.lineTo(N, L - min);
        float f4 = min * 2.0f;
        float f5 = L - f4;
        RectF rectF = this.F;
        rectF.set(N, f5, N + f4, L);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(N2 - min, L);
        rectF.set(N2 - f4, f5, N2, L);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(N2, f - f3);
        if (f3 > 0.0f) {
            float f6 = f3 * 2.0f;
            rectF.set(N2 - f6, f - f6, N2, f);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(N2, f);
        }
        path.lineTo(N + f2, f);
        if (f2 > 0.0f) {
            float f7 = f2 * 2.0f;
            rectF.set(N, f - f7, f7 + N, f);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(N, f);
        }
        path.close();
        canvas.drawPath(path, this.y);
    }

    public fhb getModel() {
        return this.a;
    }

    public final void h(Canvas canvas, int i, int i2) {
        float N = i - gm.N(1.0f);
        float N2 = gm.N(1.0f) + i2;
        float L = this.e[0] - gm.L(16.0f);
        float min = Math.min(gm.N(10.0f), (N2 - N) / 2.0f);
        float f = f(this.e[0], i);
        float f2 = f(this.e[0], i2);
        Path path = this.G;
        path.rewind();
        path.moveTo(this.e[0] + f, N);
        path.lineTo(L + min, N);
        float f3 = min * 2.0f;
        float f4 = L + f3;
        RectF rectF = this.F;
        rectF.set(L, N, f4, N + f3);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(L, N2 - min);
        rectF.set(L, N2 - f3, f4, N2);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f2, N2);
        if (f2 > 0.0f) {
            int i3 = this.e[0];
            float f5 = f2 * 2.0f;
            rectF.set(i3, N2 - f5, i3 + f5, N2);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N2);
        }
        path.lineTo(this.e[0], N + f);
        if (f > 0.0f) {
            int i4 = this.e[0];
            float f6 = f * 2.0f;
            rectF.set(i4, N, i4 + f6, f6 + N);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], N);
        }
        path.close();
        canvas.drawPath(path, this.y);
    }

    public final void i(float f, int i, int i2, Canvas canvas) {
        float f2 = f(i, i2);
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = i == this.e[0] ? i + f2 : i - f2;
        float f4 = i2 == this.f[0] ? i2 + f2 : i2 - f2;
        RectF rectF = this.F;
        rectF.set(f3 - f2, f4 - f2, f3 + f2, f4 + f2);
        canvas.drawArc(rectF, f, 90.0f, false, this.w);
    }

    public final int j() {
        for (int i = 0; i < this.a.c; i++) {
            if (e(i)) {
                return i;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i = 0; i < this.a.b; i++) {
            if (t(i)) {
                return i;
            }
        }
        return -1;
    }

    public final boolean l() {
        fhb fhbVar = this.a;
        if (fhbVar != null && this.h != null) {
            ArrayList arrayList = fhbVar.g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((LinkedHashSet) ((yf9) this.h).b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final nk9 m(TL_iv.pageTableCell pagetablecell) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof nk9) {
                nk9 nk9Var = (nk9) childAt;
                if (nk9Var.b == pagetablecell) {
                    return nk9Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i) {
        if (i < 0 || i >= this.a.c) {
            return false;
        }
        for (int i2 = 0; i2 < this.a.b; i2++) {
            if (!p(i2, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i) {
        if (i < 0 || i >= this.a.b) {
            return false;
        }
        for (int i2 = 0; i2 < this.a.c; i2++) {
            if (!p(i, i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof nk9) {
                    nk9 nk9Var = (nk9) childAt;
                    int b = this.a.b(nk9Var.b);
                    int a = this.a.a(nk9Var.b);
                    if (b >= 0 && a >= 0) {
                        int i6 = this.e[a];
                        int i7 = this.f[b];
                        nk9Var.layout(i6, i7, nk9Var.getMeasuredWidth() + i6, nk9Var.getMeasuredHeight() + i7);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int ceil;
        int L = gm.L(20.0f);
        int L2 = gm.L(4.0f);
        int L3 = gm.L(4.0f);
        int L4 = gm.L(10.0f);
        fhb fhbVar = this.a;
        if (fhbVar == null || fhbVar.b == 0 || fhbVar.c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), L2 + L4);
            this.c = new int[0];
            this.d = new int[0];
            this.e = new int[0];
            this.f = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - L) - L3;
        fhb fhbVar2 = this.a;
        int i7 = fhbVar2.b;
        int i8 = fhbVar2.c;
        this.c = new int[i8];
        this.d = new int[i7];
        int L5 = gm.L(fhbVar2.a.compact ? 20.0f : 50.0f);
        int L6 = gm.L((this.a.a.compact ? 5 : 12) << 1);
        int max = Math.max(1, Math.max(L5, i8 > 1 ? Math.round(size * 0.8f) : size) - L6);
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < getChildCount()) {
            View childAt = getChildAt(i9);
            if (childAt instanceof nk9) {
                nk9 nk9Var = (nk9) childAt;
                ne9 ne9Var = nk9Var.a;
                int a = this.a.a(nk9Var.b);
                if (a >= 0 && a < i8) {
                    int i10 = i9;
                    Editable text = ne9Var.getText();
                    if (text == null) {
                        i4 = L;
                        i5 = L3;
                        ceil = 0;
                    } else {
                        i4 = L;
                        i5 = L3;
                        ceil = (int) Math.ceil(Layout.getDesiredWidth(text, ne9Var.getPaint()));
                    }
                    i6 = i10;
                    arrayList.add(cxe.b(text, ne9Var.getPaint(), a, fhb.n(nk9Var.b), L6, max, ceil));
                    i9 = i6 + 1;
                    L = i4;
                    L3 = i5;
                }
            }
            i4 = L;
            i5 = L3;
            i6 = i9;
            i9 = i6 + 1;
            L = i4;
            L3 = i5;
        }
        int i11 = L;
        int i12 = L3;
        System.arraycopy(cxe.a(i8, size, L5, arrayList), 0, this.c, 0, i8);
        int i13 = 0;
        for (int i14 : this.c) {
            i13 += i14;
        }
        if (i13 < size && i8 > 0) {
            int i15 = size - i13;
            int i16 = 0;
            while (i16 < i8) {
                int round = i16 == i8 + (-1) ? i15 : Math.round((this.c[i16] * i15) / i13);
                int[] iArr = this.c;
                int i17 = iArr[i16] + round;
                iArr[i16] = i17;
                i15 -= round;
                i13 -= i17 - round;
                i16++;
            }
        }
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2 instanceof nk9) {
                nk9 nk9Var2 = (nk9) childAt2;
                int b = this.a.b(nk9Var2.b);
                int a2 = this.a.a(nk9Var2.b);
                int n = fhb.n(nk9Var2.b);
                int i19 = 0;
                for (int i20 = a2; i20 < a2 + n && i20 < i8; i20++) {
                    i19 += this.c[i20];
                }
                nk9Var2.measure(View.MeasureSpec.makeMeasureSpec(i19, TLObject.FLAG_30), 0);
                if (fhb.o(nk9Var2.b) == 1) {
                    int measuredHeight = nk9Var2.getMeasuredHeight();
                    int[] iArr2 = this.d;
                    if (measuredHeight > iArr2[b]) {
                        iArr2[b] = nk9Var2.getMeasuredHeight();
                    }
                }
            }
        }
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt3 = getChildAt(i21);
            if (childAt3 instanceof nk9) {
                nk9 nk9Var3 = (nk9) childAt3;
                int b2 = this.a.b(nk9Var3.b);
                int o = fhb.o(nk9Var3.b);
                if (o > 1) {
                    int i22 = b2;
                    int i23 = 0;
                    while (true) {
                        i3 = b2 + o;
                        if (i22 >= i3 || i22 >= i7) {
                            break;
                        }
                        i23 += this.d[i22];
                        i22++;
                    }
                    int measuredHeight2 = nk9Var3.getMeasuredHeight();
                    if (measuredHeight2 > i23) {
                        int i24 = measuredHeight2 - i23;
                        int max2 = i24 / Math.max(o, 1);
                        int max3 = i24 % Math.max(o, 1);
                        while (b2 < i3 && b2 < i7) {
                            int[] iArr3 = this.d;
                            iArr3[b2] = (max3 > 0 ? 1 : 0) + max2 + iArr3[b2];
                            if (max3 > 0) {
                                max3--;
                            }
                            b2++;
                        }
                    }
                }
            }
        }
        for (int i25 = 0; i25 < getChildCount(); i25++) {
            View childAt4 = getChildAt(i25);
            if (childAt4 instanceof nk9) {
                nk9 nk9Var4 = (nk9) childAt4;
                int b3 = this.a.b(nk9Var4.b);
                int a3 = this.a.a(nk9Var4.b);
                int n2 = fhb.n(nk9Var4.b);
                int o2 = fhb.o(nk9Var4.b);
                int i26 = 0;
                for (int i27 = a3; i27 < a3 + n2 && i27 < i8; i27++) {
                    i26 += this.c[i27];
                }
                int i28 = 0;
                for (int i29 = b3; i29 < b3 + o2 && i29 < i7; i29++) {
                    i28 += this.d[i29];
                }
                nk9Var4.measure(View.MeasureSpec.makeMeasureSpec(i26, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i28, TLObject.FLAG_30));
            }
        }
        int[] iArr4 = new int[i8 + 1];
        this.e = iArr4;
        iArr4[0] = i11;
        int i30 = 0;
        while (i30 < i8) {
            int[] iArr5 = this.e;
            int i31 = i30 + 1;
            iArr5[i31] = iArr5[i30] + this.c[i30];
            i30 = i31;
        }
        int[] iArr6 = new int[i7 + 1];
        this.f = iArr6;
        iArr6[0] = L2;
        int i32 = 0;
        while (i32 < i7) {
            int[] iArr7 = this.f;
            int i33 = i32 + 1;
            iArr7[i33] = iArr7[i32] + this.d[i32];
            i32 = i33;
        }
        setMeasuredDimension(Math.max(this.e[i8] + i12, size + i11 + i12), this.f[i7] + L4);
    }

    public final boolean p(int i, int i2) {
        lk9 lk9Var;
        fhb fhbVar = this.a;
        if (fhbVar == null || (lk9Var = this.h) == null || i < 0 || i >= fhbVar.b || i2 < 0 || i2 >= fhbVar.c) {
            return false;
        }
        return ((LinkedHashSet) ((yf9) lk9Var).b).contains(fhbVar.d[i][i2]);
    }

    public final int q() {
        for (int i = this.a.c - 1; i >= 0; i--) {
            if (e(i)) {
                return i;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i = this.a.b - 1; i >= 0; i--) {
            if (t(i)) {
                return i;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof nk9) {
                removeViewAt(childCount);
            }
        }
        fhb fhbVar = this.a;
        if (fhbVar != null) {
            int size = fhbVar.g.size();
            for (int i = 0; i < size; i++) {
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.a.g.get(i);
                nk9 nk9Var = new nk9(getContext(), this.b);
                nk9Var.setCompact(this.a.a.compact);
                nk9Var.b(pagetablecell);
                addView(nk9Var);
            }
        }
    }

    public void setModel(fhb fhbVar) {
        this.a = fhbVar;
        s();
    }

    public void setSelectionProvider(lk9 lk9Var) {
        this.h = lk9Var;
        invalidate();
    }

    public final boolean t(int i) {
        if (i >= 0 && i < this.a.b) {
            for (int i2 = 0; i2 < this.a.c; i2++) {
                if (p(i, i2)) {
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
