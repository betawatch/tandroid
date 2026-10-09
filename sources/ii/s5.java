package ii;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class s5 extends ViewGroup {
    public final RectF E;
    public final Path F;
    public final org.telegram.ui.Components.g6 G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public j6 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public r5 h;
    public final Paint n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final Paint x;
    public final RectF y;

    public s5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.v = paint2;
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.y = new RectF();
        this.E = new RectF();
        this.F = new Path();
        this.b = e6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.G = new org.telegram.ui.Components.g6(this, 0L, 220L, hs.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        TL_iv.pageTableCell pagetablecell;
        j6 j6Var = this.a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (j6Var != null && j6Var.b != 0 && j6Var.c != 0) {
            View findFocus = findFocus();
            for (ViewParent parent = findFocus == null ? null : findFocus.getParent(); parent != null && parent != this; parent = parent.getParent()) {
                if (parent instanceof t5) {
                    pagetablecell = ((t5) parent).b;
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
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((ei.c5) this.h).b).contains(pagetablecell3)) {
                    int b10 = this.a.b(pagetablecell3);
                    int a2 = this.a.a(pagetablecell3);
                    if (b10 < i10 || (b10 == i10 && a2 < i12)) {
                        pagetablecell2 = pagetablecell3;
                        i10 = b10;
                        i12 = a2;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i10 = org.telegram.ui.ActionBar.i6.qh;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        this.n.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.M6, e6Var);
        int red = Color.red(w02);
        int green = Color.green(w02);
        int blue = Color.blue(w02);
        this.r.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ph, e6Var));
        this.s.setColor(Color.argb(20, red, green, blue));
        this.H = 255;
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        this.v.setColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.w;
        paint.setStyle(style);
        this.O = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E6, e6Var);
        this.P = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Sh, e6Var);
        paint.setColor(this.O);
        Paint paint2 = this.x;
        paint2.setStyle(style);
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        invalidate();
    }

    public final boolean c(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!n(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final boolean d(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!o(i10)) {
                return false;
            }
            i10++;
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
        int i10;
        int i11;
        int min2;
        float f7;
        j6 j6Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TL_iv.pageBlockTable pageblocktable;
        Canvas canvas3 = canvas;
        this.J = false;
        this.I = false;
        TL_iv.pageTableCell a2 = a();
        if (a2 != null) {
            int b10 = this.a.b(a2);
            int a10 = this.a.a(a2);
            if (b10 >= 0 && a10 >= 0) {
                int i17 = a2.rowspan;
                if (i17 == 0) {
                    i17 = 1;
                }
                int i18 = a2.colspan;
                if (i18 == 0) {
                    i18 = 1;
                }
                if (o(b10)) {
                    this.I = true;
                    int[] iArr = this.f;
                    this.K = iArr[b10];
                    this.L = iArr[Math.min(b10 + i17, this.a.b)];
                }
                if (n(a10)) {
                    this.J = true;
                    int[] iArr2 = this.e;
                    this.M = iArr2[a10];
                    this.N = iArr2[Math.min(a10 + i18, this.a.c)];
                }
            }
        }
        j6 j6Var2 = this.a;
        RectF rectF = this.y;
        if (j6Var2 != null && j6Var2.b != 0 && j6Var2.c != 0) {
            TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
            boolean z10 = pageblocktable2 != null && pageblocktable2.striped;
            canvas3.save();
            float f10 = this.e[0];
            float f11 = this.f[0];
            j6 j6Var3 = this.a;
            rectF.set(f10, f11, r2[j6Var3.c], r4[j6Var3.b]);
            Path path = this.F;
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dpf2(10.0f), AndroidUtilities.dpf2(10.0f), Path.Direction.CW);
            canvas3.clipPath(path);
            for (int i19 = 0; i19 < getChildCount(); i19++) {
                View childAt = getChildAt(i19);
                if (childAt instanceof t5) {
                    t5 t5Var = (t5) childAt;
                    int b11 = this.a.b(t5Var.b);
                    int a11 = this.a.a(t5Var.b);
                    if (b11 >= 0 && a11 >= 0) {
                        int n10 = j6.n(t5Var.b);
                        int o9 = j6.o(t5Var.b);
                        int[] iArr3 = this.e;
                        int i20 = iArr3[a11];
                        int i21 = this.f[b11];
                        int i22 = iArr3[Math.min(a11 + n10, this.a.c)];
                        int i23 = this.f[Math.min(o9 + b11, this.a.b)];
                        if (t5Var.b.header) {
                            canvas3.drawRect(i20, i21, i22, i23, this.r);
                        } else if (z10 && b11 % 2 == 0) {
                            canvas3 = canvas;
                            canvas3.drawRect(i20, i21, i22, i23, this.s);
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
            int q6 = q();
            if (d(k10, r10)) {
                int[] iArr4 = this.f;
                h(canvas3, iArr4[k10], iArr4[r10 + 1]);
            }
            if (c(j3, q6)) {
                int[] iArr5 = this.e;
                g(canvas3, iArr5[j3], iArr5[q6 + 1]);
            }
        } else {
            if (this.I) {
                h(canvas3, this.K, this.L);
            }
            if (this.J) {
                g(canvas3, this.M, this.N);
            }
        }
        j6 j6Var4 = this.a;
        if (j6Var4 != null && (pageblocktable = j6Var4.a) != null && pageblocktable.bordered) {
            Paint paint = this.n;
            float strokeWidth = paint.getStrokeWidth() / 2.0f;
            float dpf2 = AndroidUtilities.dpf2(10.0f);
            int[] iArr6 = this.e;
            int[] iArr7 = this.f;
            j6 j6Var5 = this.a;
            rectF.set(iArr6[0] + strokeWidth, iArr7[0] + strokeWidth, iArr6[j6Var5.c] - strokeWidth, iArr7[j6Var5.b] - strokeWidth);
            canvas3.drawRoundRect(rectF, dpf2, dpf2, paint);
            int i24 = 1;
            while (i24 < this.a.c) {
                int i25 = this.e[i24];
                int i26 = 0;
                int i27 = -1;
                while (true) {
                    j6 j6Var6 = this.a;
                    if (i26 >= j6Var6.b) {
                        break;
                    }
                    TL_iv.pageTableCell[] pagetablecellArr = j6Var6.d[i26];
                    if (pagetablecellArr[i24 - 1] != pagetablecellArr[i24]) {
                        if (i27 < 0) {
                            i27 = this.f[i26];
                        }
                    } else if (i27 >= 0) {
                        float f12 = i25;
                        canvas3.drawLine(f12, i27, f12, this.f[i26], paint);
                        i27 = -1;
                    }
                    i26++;
                    canvas3 = canvas;
                }
                if (i27 >= 0) {
                    float f13 = i25;
                    canvas.drawLine(f13, i27, f13, this.f[r4], paint);
                }
                i24++;
                canvas3 = canvas;
            }
            for (int i28 = 1; i28 < this.a.b; i28++) {
                int i29 = this.f[i28];
                int i30 = 0;
                int i31 = -1;
                while (true) {
                    j6 j6Var7 = this.a;
                    if (i30 >= j6Var7.c) {
                        break;
                    }
                    TL_iv.pageTableCell[][] pagetablecellArr2 = j6Var7.d;
                    if (pagetablecellArr2[i28 - 1][i30] != pagetablecellArr2[i28][i30]) {
                        if (i31 < 0) {
                            i31 = this.e[i30];
                        }
                    } else if (i31 >= 0) {
                        float f14 = i29;
                        canvas.drawLine(i31, f14, this.e[i30], f14, paint);
                        i31 = -1;
                    }
                    i30++;
                }
                if (i31 >= 0) {
                    float f15 = i31;
                    float f16 = i29;
                    canvas.drawLine(f15, f16, this.e[r3], f16, paint);
                }
            }
        }
        if (this.a != null) {
            float d = this.G.d(l() ? 1.0f : 0.0f, false);
            if (d > 0.001f) {
                Paint paint2 = this.v;
                paint2.setAlpha((int) (this.H * d));
                paint2.setStrokeWidth(Math.max(0.4f, d) * AndroidUtilities.dpf2(2.0f));
                int i32 = 0;
                while (true) {
                    int i33 = this.a.b;
                    if (i32 > i33) {
                        break;
                    }
                    int i34 = i32 < i33 ? this.f[i32] : this.f[i33];
                    int i35 = 0;
                    int i36 = -1;
                    while (true) {
                        i15 = this.a.c;
                        if (i35 >= i15) {
                            break;
                        }
                        if (p(i32 - 1, i35) != p(i32, i35)) {
                            if (i36 < 0) {
                                i36 = this.e[i35];
                            }
                        } else if (i36 >= 0) {
                            int i37 = this.e[i35];
                            if (i37 > i36) {
                                float f17 = f(i36, i34) + i36;
                                float f18 = i37 - f(i37, i34);
                                if (f18 > f17) {
                                    float f19 = i34;
                                    canvas.drawLine(f17, f19, f18, f19, paint2);
                                }
                            }
                            i36 = -1;
                        }
                        i35++;
                    }
                    if (i36 >= 0 && (i16 = this.e[i15]) > i36) {
                        float f20 = f(i36, i34) + i36;
                        float f21 = i16 - f(i16, i34);
                        if (f21 > f20) {
                            float f22 = i34;
                            canvas.drawLine(f20, f22, f21, f22, paint2);
                        }
                    }
                    i32++;
                }
                int i38 = 0;
                while (true) {
                    j6Var = this.a;
                    i12 = j6Var.c;
                    if (i38 > i12) {
                        break;
                    }
                    int[] iArr8 = this.e;
                    int i39 = i38 < i12 ? iArr8[i38] : iArr8[i12];
                    int i40 = 0;
                    int i41 = -1;
                    while (true) {
                        i13 = this.a.b;
                        if (i40 >= i13) {
                            break;
                        }
                        if (p(i40, i38 - 1) != p(i40, i38)) {
                            if (i41 < 0) {
                                i41 = this.f[i40];
                            }
                        } else if (i41 >= 0) {
                            int i42 = this.f[i40];
                            if (i42 > i41) {
                                float f23 = i41 + f(i39, i41);
                                float f24 = i42 - f(i39, i42);
                                if (f24 > f23) {
                                    float f25 = i39;
                                    canvas.drawLine(f25, f23, f25, f24, paint2);
                                }
                            }
                            i41 = -1;
                        }
                        i40++;
                    }
                    if (i41 >= 0 && (i14 = this.f[i13]) > i41) {
                        float f26 = i41 + f(i39, i41);
                        float f27 = i14 - f(i39, i14);
                        if (f27 > f26) {
                            float f28 = i39;
                            canvas.drawLine(f28, f26, f28, f27, paint2);
                            i38++;
                        }
                    }
                    i38++;
                }
                canvas2 = canvas;
                int i43 = j6Var.b;
                i(180.0f, this.e[0], this.f[0], canvas2);
                i(270.0f, this.e[i12], this.f[0], canvas2);
                i(90.0f, this.e[0], this.f[i43], canvas2);
                i(0.0f, this.e[i12], this.f[i43], canvas2);
                if (this.a != null) {
                    return;
                }
                float dpf22 = AndroidUtilities.dpf2(3.0f) / 2.0f;
                float dp = AndroidUtilities.dp(8.0f);
                float dp2 = (this.e[0] - AndroidUtilities.dp(6.0f)) - dpf22;
                float dp3 = AndroidUtilities.dp(6.0f) + this.f[this.a.b] + dpf22;
                boolean l4 = l();
                Paint paint3 = this.w;
                if (!l4) {
                    TL_iv.pageTableCell a12 = a();
                    if (a12 == null) {
                        return;
                    }
                    int b12 = this.a.b(a12);
                    int a13 = this.a.a(a12);
                    if (b12 < 0 || a13 < 0) {
                        return;
                    }
                    int i44 = a12.rowspan;
                    if (i44 == 0) {
                        i44 = 1;
                    }
                    int i45 = a12.colspan;
                    if (i45 == 0) {
                        i45 = 1;
                    }
                    int[] iArr9 = this.f;
                    float f29 = (iArr9[b12] + iArr9[Math.min(b12 + i44, this.a.b)]) / 2.0f;
                    paint3.setColor(this.I ? this.P : this.O);
                    for (int i46 = -1; i46 <= 1; i46++) {
                        canvas2.drawCircle(dp2, (i46 * dp) + f29, dpf22, paint3);
                    }
                    int[] iArr10 = this.e;
                    float f30 = (iArr10[a13] + iArr10[Math.min(a13 + i45, this.a.c)]) / 2.0f;
                    paint3.setColor(this.J ? this.P : this.O);
                    for (int i47 = -1; i47 <= 1; i47++) {
                        canvas2.drawCircle((i47 * dp) + f30, dp3, dpf22, paint3);
                    }
                    return;
                }
                int k11 = k();
                int r11 = r();
                int j10 = j();
                int q10 = q();
                if (k11 < 0 || j10 < 0) {
                    return;
                }
                TL_iv.pageTableCell a14 = a();
                boolean v = v();
                int b13 = a14 == null ? k11 : this.a.b(a14);
                if (a14 == null) {
                    min = b13 + 1;
                } else {
                    int i48 = a14.rowspan;
                    if (i48 == 0) {
                        i48 = 1;
                    }
                    min = Math.min(i48 + b13, this.a.b);
                }
                if (v) {
                    int[] iArr11 = this.f;
                    i10 = iArr11[k11];
                    i11 = iArr11[r11 + 1];
                } else {
                    int[] iArr12 = this.f;
                    i10 = iArr12[b13];
                    i11 = iArr12[min];
                }
                float f31 = (i10 + i11) / 2.0f;
                paint3.setColor((v && d(k11, r11)) ? this.P : this.O);
                for (int i49 = -1; i49 <= 1; i49++) {
                    canvas2.drawCircle(dp2, (i49 * dp) + f31, dpf22, paint3);
                }
                boolean u10 = u();
                int a15 = a14 == null ? j10 : this.a.a(a14);
                if (a14 == null) {
                    min2 = a15 + 1;
                } else {
                    int i50 = a14.colspan;
                    if (i50 == 0) {
                        i50 = 1;
                    }
                    min2 = Math.min(i50 + a15, this.a.c);
                }
                if (u10) {
                    int[] iArr13 = this.e;
                    f7 = iArr13[j10] + iArr13[q10 + 1];
                } else {
                    int[] iArr14 = this.e;
                    f7 = iArr14[a15] + iArr14[min2];
                }
                float f32 = f7 / 2.0f;
                paint3.setColor((u10 && c(j10, q10)) ? this.P : this.O);
                for (int i51 = -1; i51 <= 1; i51++) {
                    canvas2.drawCircle((i51 * dp) + f32, dp3, dpf22, paint3);
                }
                return;
            }
        }
        canvas2 = canvas;
        if (this.a != null) {
        }
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.a.c) {
            for (int i11 = 0; i11 < this.a.b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        int i13;
        j6 j6Var = this.a;
        int i14 = j6Var.c;
        int i15 = j6Var.b;
        int[] iArr = this.e;
        if (i10 != iArr[0]) {
            if (i10 == iArr[i14]) {
                i12 = i14 - 1;
            }
            return 0.0f;
        }
        i12 = 0;
        int[] iArr2 = this.f;
        if (i11 != iArr2[0]) {
            i13 = i11 == iArr2[i15] ? i15 - 1 : 0;
            return 0.0f;
        }
        if (i12 >= 0 && i13 >= 0 && p(i13, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.c[i12], this.d[i13]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f7 = this.f[this.a.b];
        float dp = AndroidUtilities.dp(16.0f) + f7;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(i10, this.f[this.a.b]);
        float f11 = f(i11, this.f[this.a.b]);
        Path path = this.F;
        path.rewind();
        path.moveTo(dpf2, f7 - f10);
        path.lineTo(dpf2, dp - min);
        float f12 = min * 2.0f;
        float f13 = dp - f12;
        RectF rectF = this.E;
        rectF.set(dpf2, f13, dpf2 + f12, dp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(dpf22 - min, dp);
        rectF.set(dpf22 - f12, f13, dpf22, dp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(dpf22, f7 - f11);
        if (f11 > 0.0f) {
            float f14 = f11 * 2.0f;
            rectF.set(dpf22 - f14, f7 - f14, dpf22, f7);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(dpf22, f7);
        }
        path.lineTo(dpf2 + f10, f7);
        if (f10 > 0.0f) {
            float f15 = f10 * 2.0f;
            rectF.set(dpf2, f7 - f15, f15 + dpf2, f7);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(dpf2, f7);
        }
        path.close();
        canvas.drawPath(path, this.x);
    }

    public j6 getModel() {
        return this.a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float dp = this.e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f7 = f(this.e[0], i10);
        float f10 = f(this.e[0], i11);
        Path path = this.F;
        path.rewind();
        path.moveTo(this.e[0] + f7, dpf2);
        path.lineTo(dp + min, dpf2);
        float f11 = min * 2.0f;
        float f12 = dp + f11;
        RectF rectF = this.E;
        rectF.set(dp, dpf2, f12, dpf2 + f11);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f11, f12, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f10, dpf22);
        if (f10 > 0.0f) {
            int i12 = this.e[0];
            float f13 = f10 * 2.0f;
            rectF.set(i12, dpf22 - f13, i12 + f13, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf22);
        }
        path.lineTo(this.e[0], dpf2 + f7);
        if (f7 > 0.0f) {
            int i13 = this.e[0];
            float f14 = f7 * 2.0f;
            rectF.set(i13, dpf2, i13 + f14, f14 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.x);
    }

    public final void i(float f7, int i10, int i11, Canvas canvas) {
        float f10 = f(i10, i11);
        if (f10 <= 0.0f) {
            return;
        }
        float f11 = i10 == this.e[0] ? i10 + f10 : i10 - f10;
        float f12 = i11 == this.f[0] ? i11 + f10 : i11 - f10;
        RectF rectF = this.E;
        rectF.set(f11 - f10, f12 - f10, f11 + f10, f12 + f10);
        canvas.drawArc(rectF, f7, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.a.c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.a.b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        j6 j6Var = this.a;
        if (j6Var != null && this.h != null) {
            ArrayList arrayList = j6Var.g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((ei.c5) this.h).b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final t5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                if (t5Var.b == pagetablecell) {
                    return t5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.a.c) {
            return false;
        }
        for (int i11 = 0; i11 < this.a.b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.a.b) {
            return false;
        }
        for (int i11 = 0; i11 < this.a.c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.a == null) {
            return;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                int b10 = this.a.b(t5Var.b);
                int a2 = this.a.a(t5Var.b);
                if (b10 >= 0 && a2 >= 0) {
                    int i15 = this.e[a2];
                    int i16 = this.f[b10];
                    t5Var.layout(i15, i16, t5Var.getMeasuredWidth() + i15, t5Var.getMeasuredHeight() + i16);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int a2;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        j6 j6Var = this.a;
        int i17 = 0;
        if (j6Var == null || j6Var.b == 0 || j6Var.c == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
            this.c = new int[0];
            this.d = new int[0];
            this.e = new int[0];
            this.f = new int[0];
            return;
        }
        int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
        j6 j6Var2 = this.a;
        int i18 = j6Var2.b;
        int i19 = j6Var2.c;
        this.c = new int[i19];
        this.d = new int[i18];
        int dp5 = AndroidUtilities.dp(j6Var2.a.compact ? 20.0f : 50.0f);
        int i20 = this.a.a.compact ? 5 : 12;
        int b10 = i19 == 2 ? org.telegram.messenger.q.b(i20 * 4, size / 2, 0) : Math.max(0, Math.round(size / 1.5f));
        float f7 = i20 * 2;
        int y3 = org.telegram.messenger.q.y(f7, b10, dp5);
        for (int i21 = 0; i21 < i19; i21++) {
            this.c[i21] = dp5;
        }
        int i22 = 0;
        while (true) {
            i12 = 1;
            if (i22 >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i22);
            if (childAt instanceof t5) {
                t5 t5Var = (t5) childAt;
                i1 i1Var = t5Var.a;
                if (j6.n(t5Var.b) == 1 && (a2 = this.a.a(t5Var.b)) >= 0 && a2 < i19) {
                    int dp6 = AndroidUtilities.dp(f7) + Math.round(Layout.getDesiredWidth(i1Var.getText(), i1Var.getPaint()));
                    int[] iArr = this.c;
                    iArr[a2] = Math.max(iArr[a2], Math.min(y3, dp6));
                }
            }
            i22++;
        }
        int i23 = 0;
        while (i23 < getChildCount()) {
            View childAt2 = getChildAt(i23);
            if (childAt2 instanceof t5) {
                t5 t5Var2 = (t5) childAt2;
                i1 i1Var2 = t5Var2.a;
                int n10 = j6.n(t5Var2.b);
                if (n10 > i12) {
                    i16 = i12;
                    int a10 = this.a.a(t5Var2.b);
                    int min = Math.min(i19, n10 + a10);
                    if (a10 >= 0 && a10 < min) {
                        int i24 = i17;
                        for (int i25 = a10; i25 < min; i25++) {
                            i24 += this.c[i25];
                        }
                        int min2 = Math.min((min - a10) * y3, AndroidUtilities.dp(f7) + Math.round(Layout.getDesiredWidth(i1Var2.getText(), i1Var2.getPaint()))) - i24;
                        while (a10 < min && min2 > 0) {
                            int i26 = ((min2 + r14) - 1) / (min - a10);
                            int[] iArr2 = this.c;
                            iArr2[a10] = iArr2[a10] + i26;
                            min2 -= i26;
                            a10++;
                        }
                    }
                    i23++;
                    i12 = i16;
                    i17 = 0;
                }
            }
            i16 = i12;
            i23++;
            i12 = i16;
            i17 = 0;
        }
        int i27 = i12;
        int i28 = 0;
        for (int i29 : this.c) {
            i28 += i29;
        }
        if (i28 < size && i19 > 0) {
            int i30 = size - i28;
            int i31 = 0;
            while (i31 < i19) {
                int round = i31 == i19 + (-1) ? i30 : Math.round((this.c[i31] * i30) / i28);
                int[] iArr3 = this.c;
                int i32 = iArr3[i31] + round;
                iArr3[i31] = i32;
                i30 -= round;
                i28 -= i32 - round;
                i31++;
            }
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i33 = 0;
        while (i33 < getChildCount()) {
            View childAt3 = getChildAt(i33);
            if (childAt3 instanceof t5) {
                t5 t5Var3 = (t5) childAt3;
                int b11 = this.a.b(t5Var3.b);
                int a11 = this.a.a(t5Var3.b);
                int n11 = j6.n(t5Var3.b);
                i15 = i33;
                int i34 = 0;
                for (int i35 = a11; i35 < a11 + n11 && i35 < i19; i35++) {
                    i34 += this.c[i35];
                }
                t5Var3.measure(View.MeasureSpec.makeMeasureSpec(i34, TLObject.FLAG_30), makeMeasureSpec);
                if (j6.o(t5Var3.b) == i27) {
                    int measuredHeight = t5Var3.getMeasuredHeight();
                    int[] iArr4 = this.d;
                    if (measuredHeight > iArr4[b11]) {
                        iArr4[b11] = t5Var3.getMeasuredHeight();
                    }
                }
            } else {
                i15 = i33;
            }
            i33 = i15 + 1;
            i27 = 1;
        }
        for (int i36 = 0; i36 < getChildCount(); i36++) {
            View childAt4 = getChildAt(i36);
            if (childAt4 instanceof t5) {
                t5 t5Var4 = (t5) childAt4;
                int b12 = this.a.b(t5Var4.b);
                int o9 = j6.o(t5Var4.b);
                if (o9 > 1) {
                    int i37 = b12;
                    int i38 = 0;
                    while (true) {
                        i14 = b12 + o9;
                        if (i37 >= i14 || i37 >= i18) {
                            break;
                        }
                        i38 += this.d[i37];
                        i37++;
                    }
                    int measuredHeight2 = t5Var4.getMeasuredHeight();
                    if (measuredHeight2 > i38) {
                        int i39 = measuredHeight2 - i38;
                        int max = i39 / Math.max(o9, 1);
                        int max2 = i39 % Math.max(o9, 1);
                        while (b12 < i14 && b12 < i18) {
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
        int i40 = 0;
        while (i40 < getChildCount()) {
            View childAt5 = getChildAt(i40);
            if (childAt5 instanceof t5) {
                t5 t5Var5 = (t5) childAt5;
                int b13 = this.a.b(t5Var5.b);
                int a12 = this.a.a(t5Var5.b);
                int n12 = j6.n(t5Var5.b);
                int o10 = j6.o(t5Var5.b);
                i13 = i40;
                int i41 = 0;
                for (int i42 = a12; i42 < a12 + n12 && i42 < i19; i42++) {
                    i41 += this.c[i42];
                }
                int i43 = 0;
                for (int i44 = b13; i44 < b13 + o10 && i44 < i18; i44++) {
                    i43 += this.d[i44];
                }
                t5Var5.measure(View.MeasureSpec.makeMeasureSpec(i41, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i43, TLObject.FLAG_30));
            } else {
                i13 = i40;
            }
            i40 = i13 + 1;
        }
        int[] iArr6 = new int[i19 + 1];
        this.e = iArr6;
        iArr6[0] = dp;
        int i45 = 0;
        while (i45 < i19) {
            int[] iArr7 = this.e;
            int i46 = i45 + 1;
            iArr7[i46] = iArr7[i45] + this.c[i45];
            i45 = i46;
        }
        int[] iArr8 = new int[i18 + 1];
        this.f = iArr8;
        iArr8[0] = dp2;
        int i47 = 0;
        while (i47 < i18) {
            int[] iArr9 = this.f;
            int i48 = i47 + 1;
            iArr9[i48] = iArr9[i47] + this.d[i47];
            i47 = i48;
        }
        setMeasuredDimension(Math.max(this.e[i19] + dp3, size + dp + dp3), this.f[i18] + dp4);
    }

    public final boolean p(int i10, int i11) {
        r5 r5Var;
        j6 j6Var = this.a;
        if (j6Var == null || (r5Var = this.h) == null || i10 < 0 || i10 >= j6Var.b || i11 < 0 || i11 >= j6Var.c) {
            return false;
        }
        return ((LinkedHashSet) ((ei.c5) r5Var).b).contains(j6Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.a.c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.a.b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof t5) {
                removeViewAt(childCount);
            }
        }
        j6 j6Var = this.a;
        if (j6Var == null) {
            return;
        }
        int size = j6Var.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.a.g.get(i10);
            t5 t5Var = new t5(getContext(), this.b);
            t5Var.setCompact(this.a.a.compact);
            t5Var.b(pagetablecell);
            addView(t5Var);
        }
    }

    public void setModel(j6 j6Var) {
        this.a = j6Var;
        s();
    }

    public void setSelectionProvider(r5 r5Var) {
        this.h = r5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.a.b) {
            for (int i11 = 0; i11 < this.a.c; i11++) {
                if (p(i10, i11)) {
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
