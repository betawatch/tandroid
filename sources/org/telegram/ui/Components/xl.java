package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xl {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ yl O;
    public yl a;
    public org.telegram.messenger.ye b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public yh.e s;
    public Bitmap v;
    public RectF f = null;
    public final RectF g = new RectF();
    public long h = 0;
    public int i = 0;
    public float j = 1.0f;
    public float k = 0.0f;
    public RectF p = null;
    public final RectF q = new RectF();
    public String r = null;
    public final Path t = new Path();
    public final float[] u = new float[8];
    public float w = 1.0f;
    public final Paint x = new Paint(1);
    public final RectF y = new RectF();
    public final Paint z = new Paint(1);
    public final Paint A = new Paint(1);
    public final Paint D = new Paint(1);
    public Bitmap E = null;
    public String F = null;
    public Bitmap G = null;
    public String H = null;
    public final Rect I = new Rect();
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public float M = 1.0f;
    public long N = 0;

    public xl(yl ylVar) {
        this.O = ylVar;
        this.a = ylVar;
    }

    public static void a(xl xlVar, org.telegram.messenger.ye yeVar) {
        yl ylVar = xlVar.O;
        xlVar.b = yeVar;
        if (yeVar.b) {
            xlVar.r = org.telegram.messenger.g0.g0(yeVar.E, false, false);
        } else {
            xlVar.r = null;
        }
        if (xlVar.c == null) {
            xlVar.c = new ImageReceiver(ylVar.z);
            xlVar.d = new ImageReceiver(ylVar.z);
            xlVar.c.h1 = new org.telegram.ui.jo(19, xlVar, yeVar);
        }
        int i3 = yeVar.C;
        String str = yeVar.I;
        String str2 = yeVar.c;
        if (str2 != null) {
            xlVar.c.r0(org.telegram.messenger.ac.g(str2), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
            return;
        }
        if (str == null) {
            xlVar.c.w0(org.telegram.ui.ActionBar.k6.R4);
            return;
        }
        if (yeVar.b) {
            xlVar.c.r0(org.telegram.messenger.ac.g("vthumb://" + i3 + ":" + str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
            xlVar.c.u0 = true;
            return;
        }
        xlVar.c.G0(yeVar.J, 0, true);
        xlVar.c.r0(org.telegram.messenger.ac.g("thumb://" + i3 + ":" + str), null, null, null, org.telegram.ui.ActionBar.k6.R4, 0L, null, null, 0);
    }

    public static void b(xl xlVar, ul ulVar, org.telegram.messenger.ri riVar, boolean z10) {
        RectF rectF = xlVar.q;
        RectF rectF2 = xlVar.g;
        if (ulVar == null || riVar == null) {
            if (!z10) {
                xlVar.j = 0.0f;
                xlVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            xlVar.j = org.telegram.messenger.g0.T1(xlVar.j, xlVar.k, xlVar.e());
            RectF rectF3 = xlVar.f;
            if (rectF3 != null) {
                org.telegram.messenger.g0.Z1(rectF3, rectF2, xlVar.e(), xlVar.f);
            }
            xlVar.k = 0.0f;
            xlVar.h = elapsedRealtime;
            return;
        }
        xlVar.i = riVar.l;
        if (z10) {
            float e10 = xlVar.e();
            RectF rectF4 = xlVar.f;
            if (rectF4 != null) {
                org.telegram.messenger.g0.Z1(rectF4, rectF2, e10, rectF4);
            }
            RectF rectF5 = xlVar.p;
            if (rectF5 != null) {
                org.telegram.messenger.g0.Z1(rectF5, rectF, e10, rectF5);
            }
            xlVar.j = org.telegram.messenger.g0.T1(xlVar.j, xlVar.k, e10);
            xlVar.h = SystemClock.elapsedRealtime();
        }
        float f10 = riVar.q;
        float f11 = ulVar.b;
        float f12 = f10 / f11;
        float f13 = riVar.p;
        float f14 = ulVar.a;
        float f15 = f13 / f14;
        float f16 = riVar.e / f11;
        float f17 = riVar.f / f14;
        xlVar.k = 1.0f;
        rectF2.set(f12, f15, f16 + f12, f17 + f15);
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.az.Y0 - 1);
        int i3 = xlVar.i;
        float f18 = (i3 & 5) == 5 ? L2 : L;
        float f19 = (i3 & 6) == 6 ? L2 : L;
        float f20 = (i3 & 10) == 10 ? L2 : L;
        if ((i3 & 9) == 9) {
            L = L2;
        }
        rectF.set(f18, f19, f20, L);
        if (xlVar.f == null) {
            RectF rectF6 = new RectF();
            xlVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (xlVar.p == null) {
            RectF rectF7 = new RectF();
            xlVar.p = rectF7;
            rectF7.set(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x050b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x050d A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, boolean z10) {
        float f10;
        zl zlVar;
        char c2;
        int i3;
        float f11;
        Bitmap bitmap;
        String str;
        int indexOf;
        String str2;
        boolean z11;
        float f12;
        int i10;
        float L;
        float L2;
        float f13;
        float f14;
        boolean z12;
        float f15;
        float f16;
        Bitmap bitmap2;
        String str3;
        float f17;
        String str4;
        String str5;
        int i11;
        char c10;
        RectF rectF;
        float e10 = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        yl ylVar = this.O;
        zl zlVar2 = ylVar.z;
        am amVar = zlVar2.Q;
        float f18 = zlVar2.Q.K == this ? zlVar2.H : 0.0f;
        float T1 = org.telegram.messenger.g0.T1(this.j, this.k, e10);
        if (T1 <= 0.0f) {
            return false;
        }
        RectF d = d();
        float L3 = org.telegram.messenger.g0.L(org.telegram.messenger.az.Y0 - 1);
        RectF rectF2 = this.q;
        float f19 = rectF2.left;
        float f20 = rectF2.top;
        float f21 = rectF2.right;
        float f22 = rectF2.bottom;
        if (e10 < 1.0f && (rectF = this.p) != null) {
            f19 = org.telegram.messenger.g0.T1(rectF.left, f19, e10);
            f20 = org.telegram.messenger.g0.T1(this.p.top, f20, e10);
            f21 = org.telegram.messenger.g0.T1(this.p.right, f21, e10);
            f22 = org.telegram.messenger.g0.T1(this.p.bottom, f22, e10);
        }
        float T12 = org.telegram.messenger.g0.T1(f19, L3, f18);
        float T13 = org.telegram.messenger.g0.T1(f20, L3, f18);
        float T14 = org.telegram.messenger.g0.T1(f21, L3, f18);
        float T15 = org.telegram.messenger.g0.T1(f22, L3, f18);
        if (z10) {
            canvas.save();
            canvas.translate(-d.centerX(), -d.centerY());
        }
        int i12 = (int) T12;
        int i13 = (int) T13;
        int i14 = (int) T14;
        int i15 = (int) T15;
        this.c.K0(i12, i13, i14, i15);
        this.c.y0(d.left, d.top, d.width(), d.height());
        this.c.setAlpha(T1);
        this.c.h(canvas, null);
        org.telegram.messenger.ye yeVar = this.b;
        float[] fArr = this.u;
        Path path = this.t;
        if (yeVar == null) {
            f10 = T13;
            zlVar = zlVar2;
            c2 = 3;
        } else if (!yeVar.M || yeVar.R) {
            f10 = T13;
            zlVar = zlVar2;
            c2 = 3;
        } else {
            if (this.e || this.d.n() != null || this.c.n() == null) {
                i11 = 2;
                if (!this.e && this.d.n() != null) {
                    c10 = 1;
                    this.e = true;
                    fArr[c10] = T12;
                    fArr[0] = T12;
                    fArr[3] = T13;
                    fArr[i11] = T13;
                    fArr[5] = T14;
                    fArr[4] = T14;
                    fArr[7] = T15;
                    fArr[6] = T15;
                    canvas.save();
                    path.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path.addRoundRect(d, fArr, direction);
                    canvas.clipPath(path);
                    if (this.l == 0.0f) {
                        path.rewind();
                        f10 = T13;
                        path.addCircle(this.m, this.n, this.l * this.o, direction);
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                    } else {
                        f10 = T13;
                    }
                    this.d.K0(i12, i13, i14, i15);
                    this.d.y0(d.left, d.top, d.width(), d.height());
                    this.d.setAlpha(T1);
                    this.d.h(canvas, null);
                    if (this.s == null) {
                        this.s = yh.e.e(zlVar2);
                    }
                    yh.e eVar = this.s;
                    int width = zlVar2.getWidth();
                    int height = zlVar2.getHeight();
                    zlVar = zlVar2;
                    c2 = 3;
                    i3 = i11;
                    eVar.c(canvas, zlVar, width, height, 1.0f, false);
                    canvas.restore();
                    zlVar.invalidate();
                    zlVar.invalidate();
                    f11 = this.w;
                    if (f11 == 1.0f && this.v != null) {
                        fArr[1] = T12;
                        fArr[0] = T12;
                        fArr[c2] = f10;
                        fArr[i3] = f10;
                        fArr[5] = T14;
                        fArr[4] = T14;
                        fArr[7] = T15;
                        fArr[6] = T15;
                        canvas.save();
                        path.rewind();
                        path.addRoundRect(d, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        float h = org.telegram.ui.Cells.f1.h(Math.min(16L, SystemClock.elapsedRealtime() - this.h), 250.0f, this.w, 1.0f);
                        this.w = h;
                        Paint paint = this.x;
                        paint.setAlpha((int) ((1.0f - h) * 255.0f));
                        canvas.drawBitmap(this.v, d.left, d.top, paint);
                        canvas.restore();
                        zlVar.invalidate();
                    } else if (f11 == 1.0f && (bitmap = this.v) != null) {
                        bitmap.recycle();
                        str = null;
                        this.v = null;
                        zlVar.invalidate();
                        indexOf = ((ArrayList) ylVar.k.f).indexOf(this.b) + ylVar.b;
                        if (indexOf >= 0) {
                            str2 = (indexOf + 1) + "";
                        } else {
                            str2 = str;
                        }
                        float f23 = this.c.R0 ? 1.0f : 0.0f;
                        z11 = Math.abs(this.M - f23) > 0.01f;
                        if (z11) {
                            f12 = 255.0f;
                            i10 = i3;
                            long min = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
                            this.N = SystemClock.elapsedRealtime();
                            float f24 = min / 100.0f;
                            float f25 = this.M;
                            if (f23 < f25) {
                                this.M = Math.max(0.0f, f25 - f24);
                            } else {
                                this.M = Math.min(1.0f, f25 + f24);
                            }
                        } else {
                            f12 = 255.0f;
                            i10 = i3;
                        }
                        L = d.top + org.telegram.messenger.g0.L(10.0f);
                        L2 = d.right - org.telegram.messenger.g0.L(10.0f);
                        f13 = this.M * T1;
                        int L4 = org.telegram.messenger.g0.L(12.0f);
                        int L5 = org.telegram.messenger.g0.L(1.2f);
                        int i16 = (L4 + L5) * 2;
                        int i17 = L5 * 4;
                        float f26 = f12;
                        Rect rect = this.I;
                        if (str2 == null && (this.E == null || (str5 = this.F) == null || !str5.equals(str2))) {
                            if (this.E == null) {
                                this.E = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
                            }
                            f14 = L;
                            Canvas canvas2 = new Canvas(this.E);
                            canvas2.drawColor(0);
                            if (this.B == null) {
                                z12 = z11;
                                TextPaint textPaint = new TextPaint(1);
                                this.B = textPaint;
                                textPaint.setTypeface(org.telegram.messenger.g0.o());
                            } else {
                                z12 = z11;
                            }
                            TextPaint textPaint2 = this.B;
                            int i18 = org.telegram.ui.ActionBar.k6.V9;
                            f15 = L2;
                            textPaint2.setColor(org.telegram.ui.ActionBar.k6.w0(i18, amVar.a));
                            int length = str2.length();
                            float f27 = (length == 0 || length == 1 || length == i10) ? 14.0f : length != 3 ? 8.0f : 10.0f;
                            this.B.setTextSize(org.telegram.messenger.g0.L(f27));
                            float f28 = i16 / 2.0f;
                            f16 = f13;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W9, amVar.a);
                            Paint paint2 = this.z;
                            paint2.setColor(w02);
                            float f29 = (int) f28;
                            float f30 = L4;
                            canvas2.drawCircle(f29, f29, f30, paint2);
                            int S0 = org.telegram.messenger.g0.S0(1.0f, 1.0f, -1, org.telegram.ui.ActionBar.k6.w0(i18, amVar.a));
                            Paint paint3 = this.A;
                            paint3.setColor(S0);
                            paint3.setStyle(Paint.Style.STROKE);
                            paint3.setStrokeWidth(L5);
                            canvas2.drawCircle(f29, f29, f30, paint3);
                            canvas2.drawText(str2, f28 - (this.B.measureText(str2) / 2.0f), f28 + org.telegram.messenger.g0.L(1.0f) + org.telegram.messenger.g0.L(f27 / 4.0f), this.B);
                            rect.set(0, 0, i16, i16);
                            this.F = str2;
                        } else {
                            f14 = L;
                            z12 = z11;
                            f15 = L2;
                            f16 = f13;
                        }
                        bitmap2 = this.E;
                        Paint paint4 = this.D;
                        if (bitmap2 != null) {
                            float f31 = i16 * T1;
                            float f32 = i17;
                            float f33 = f14 - f32;
                            int i19 = (int) (f33 + f31);
                            Rect rect2 = this.J;
                            rect2.set((int) ((f15 - f31) + f32), (int) f33, (int) (f15 + f32), i19);
                            paint4.setAlpha((int) (f16 * f26));
                            canvas.drawBitmap(this.E, rect, rect2, paint4);
                        }
                        float L6 = d.left + org.telegram.messenger.g0.L(4.0f);
                        float L7 = d.bottom - org.telegram.messenger.g0.L(4.0f);
                        str3 = this.r;
                        float f34 = this.M * T1;
                        if (str3 != null) {
                            Bitmap bitmap3 = this.G;
                            Rect rect3 = this.K;
                            if (bitmap3 == null || (str4 = this.H) == null || !str4.equals(str3)) {
                                if (this.C == null) {
                                    TextPaint textPaint3 = new TextPaint(1);
                                    this.C = textPaint3;
                                    textPaint3.setTypeface(org.telegram.messenger.g0.o());
                                    this.C.setColor(-1);
                                }
                                float L8 = org.telegram.messenger.g0.L(12.0f);
                                this.C.setTextSize(L8);
                                float intrinsicWidth = amVar.O.getIntrinsicWidth() + this.C.measureText(str3) + org.telegram.messenger.g0.L(15.0f);
                                Drawable drawable = amVar.O;
                                float max = Math.max(L8, org.telegram.messenger.g0.L(4.0f) + amVar.O.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(intrinsicWidth);
                                int ceil2 = (int) Math.ceil(max);
                                Bitmap bitmap4 = this.G;
                                if (bitmap4 == null || bitmap4.getWidth() != ceil || this.G.getHeight() != ceil2) {
                                    Bitmap bitmap5 = this.G;
                                    if (bitmap5 != null) {
                                        bitmap5.recycle();
                                    }
                                    this.G = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                }
                                f17 = f34;
                                Canvas canvas3 = new Canvas(this.G);
                                RectF rectF3 = org.telegram.messenger.g0.P;
                                rectF3.set(0.0f, 0.0f, intrinsicWidth, max);
                                canvas3.drawRoundRect(rectF3, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.i2);
                                int L9 = org.telegram.messenger.g0.L(5.0f);
                                int intrinsicHeight = (int) ((max - drawable.getIntrinsicHeight()) / 2.0f);
                                drawable.setBounds(L9, intrinsicHeight, drawable.getIntrinsicWidth() + L9, drawable.getIntrinsicHeight() + intrinsicHeight);
                                drawable.draw(canvas3);
                                canvas3.drawText(str3, org.telegram.messenger.g0.L(18.0f), L8 + org.telegram.messenger.g0.L(-0.7f), this.C);
                                rect3.set(0, 0, ceil, ceil2);
                                this.H = str3;
                            } else {
                                f17 = f34;
                            }
                            int width2 = this.G.getWidth();
                            Rect rect4 = this.L;
                            rect4.set((int) L6, (int) (L7 - (this.G.getHeight() * T1)), (int) ((width2 * T1) + L6), (int) L7);
                            paint4.setAlpha((int) (f17 * f26));
                            canvas.drawBitmap(this.G, rect3, rect4, paint4);
                        }
                        if (z10) {
                            canvas.restore();
                        }
                        return e10 >= 1.0f || z12;
                    }
                    str = null;
                    indexOf = ((ArrayList) ylVar.k.f).indexOf(this.b) + ylVar.b;
                    if (indexOf >= 0) {
                    }
                    if (this.c.R0) {
                    }
                    if (Math.abs(this.M - f23) > 0.01f) {
                    }
                    if (z11) {
                    }
                    L = d.top + org.telegram.messenger.g0.L(10.0f);
                    L2 = d.right - org.telegram.messenger.g0.L(10.0f);
                    f13 = this.M * T1;
                    int L42 = org.telegram.messenger.g0.L(12.0f);
                    int L52 = org.telegram.messenger.g0.L(1.2f);
                    int i162 = (L42 + L52) * 2;
                    int i172 = L52 * 4;
                    float f262 = f12;
                    Rect rect5 = this.I;
                    if (str2 == null) {
                    }
                    f14 = L;
                    z12 = z11;
                    f15 = L2;
                    f16 = f13;
                    bitmap2 = this.E;
                    Paint paint42 = this.D;
                    if (bitmap2 != null) {
                    }
                    float L62 = d.left + org.telegram.messenger.g0.L(4.0f);
                    float L72 = d.bottom - org.telegram.messenger.g0.L(4.0f);
                    str3 = this.r;
                    float f342 = this.M * T1;
                    if (str3 != null) {
                    }
                    if (z10) {
                    }
                    if (e10 >= 1.0f) {
                        return true;
                    }
                }
            } else {
                this.e = true;
                i11 = 2;
                this.d.v0(Utilities.D(this.c.n(), false));
            }
            c10 = 1;
            fArr[c10] = T12;
            fArr[0] = T12;
            fArr[3] = T13;
            fArr[i11] = T13;
            fArr[5] = T14;
            fArr[4] = T14;
            fArr[7] = T15;
            fArr[6] = T15;
            canvas.save();
            path.rewind();
            Path.Direction direction2 = Path.Direction.CW;
            path.addRoundRect(d, fArr, direction2);
            canvas.clipPath(path);
            if (this.l == 0.0f) {
            }
            this.d.K0(i12, i13, i14, i15);
            this.d.y0(d.left, d.top, d.width(), d.height());
            this.d.setAlpha(T1);
            this.d.h(canvas, null);
            if (this.s == null) {
            }
            yh.e eVar2 = this.s;
            int width3 = zlVar2.getWidth();
            int height2 = zlVar2.getHeight();
            zlVar = zlVar2;
            c2 = 3;
            i3 = i11;
            eVar2.c(canvas, zlVar, width3, height2, 1.0f, false);
            canvas.restore();
            zlVar.invalidate();
            zlVar.invalidate();
            f11 = this.w;
            if (f11 == 1.0f) {
            }
            if (f11 == 1.0f) {
                bitmap.recycle();
                str = null;
                this.v = null;
                zlVar.invalidate();
                indexOf = ((ArrayList) ylVar.k.f).indexOf(this.b) + ylVar.b;
                if (indexOf >= 0) {
                }
                if (this.c.R0) {
                }
                if (Math.abs(this.M - f23) > 0.01f) {
                }
                if (z11) {
                }
                L = d.top + org.telegram.messenger.g0.L(10.0f);
                L2 = d.right - org.telegram.messenger.g0.L(10.0f);
                f13 = this.M * T1;
                int L422 = org.telegram.messenger.g0.L(12.0f);
                int L522 = org.telegram.messenger.g0.L(1.2f);
                int i1622 = (L422 + L522) * 2;
                int i1722 = L522 * 4;
                float f2622 = f12;
                Rect rect52 = this.I;
                if (str2 == null) {
                }
                f14 = L;
                z12 = z11;
                f15 = L2;
                f16 = f13;
                bitmap2 = this.E;
                Paint paint422 = this.D;
                if (bitmap2 != null) {
                }
                float L622 = d.left + org.telegram.messenger.g0.L(4.0f);
                float L722 = d.bottom - org.telegram.messenger.g0.L(4.0f);
                str3 = this.r;
                float f3422 = this.M * T1;
                if (str3 != null) {
                }
                if (z10) {
                }
                if (e10 >= 1.0f) {
                }
            }
            str = null;
            indexOf = ((ArrayList) ylVar.k.f).indexOf(this.b) + ylVar.b;
            if (indexOf >= 0) {
            }
            if (this.c.R0) {
            }
            if (Math.abs(this.M - f23) > 0.01f) {
            }
            if (z11) {
            }
            L = d.top + org.telegram.messenger.g0.L(10.0f);
            L2 = d.right - org.telegram.messenger.g0.L(10.0f);
            f13 = this.M * T1;
            int L4222 = org.telegram.messenger.g0.L(12.0f);
            int L5222 = org.telegram.messenger.g0.L(1.2f);
            int i16222 = (L4222 + L5222) * 2;
            int i17222 = L5222 * 4;
            float f26222 = f12;
            Rect rect522 = this.I;
            if (str2 == null) {
            }
            f14 = L;
            z12 = z11;
            f15 = L2;
            f16 = f13;
            bitmap2 = this.E;
            Paint paint4222 = this.D;
            if (bitmap2 != null) {
            }
            float L6222 = d.left + org.telegram.messenger.g0.L(4.0f);
            float L7222 = d.bottom - org.telegram.messenger.g0.L(4.0f);
            str3 = this.r;
            float f34222 = this.M * T1;
            if (str3 != null) {
            }
            if (z10) {
            }
            if (e10 >= 1.0f) {
            }
        }
        i3 = 2;
        f11 = this.w;
        if (f11 == 1.0f) {
        }
        if (f11 == 1.0f) {
        }
        str = null;
        indexOf = ((ArrayList) ylVar.k.f).indexOf(this.b) + ylVar.b;
        if (indexOf >= 0) {
        }
        if (this.c.R0) {
        }
        if (Math.abs(this.M - f23) > 0.01f) {
        }
        if (z11) {
        }
        L = d.top + org.telegram.messenger.g0.L(10.0f);
        L2 = d.right - org.telegram.messenger.g0.L(10.0f);
        f13 = this.M * T1;
        int L42222 = org.telegram.messenger.g0.L(12.0f);
        int L52222 = org.telegram.messenger.g0.L(1.2f);
        int i162222 = (L42222 + L52222) * 2;
        int i172222 = L52222 * 4;
        float f262222 = f12;
        Rect rect5222 = this.I;
        if (str2 == null) {
        }
        f14 = L;
        z12 = z11;
        f15 = L2;
        f16 = f13;
        bitmap2 = this.E;
        Paint paint42222 = this.D;
        if (bitmap2 != null) {
        }
        float L62222 = d.left + org.telegram.messenger.g0.L(4.0f);
        float L72222 = d.bottom - org.telegram.messenger.g0.L(4.0f);
        str3 = this.r;
        float f342222 = this.M * T1;
        if (str3 != null) {
        }
        if (z10) {
        }
        if (e10 >= 1.0f) {
        }
    }

    public final Object clone() {
        xl xlVar = new xl(this.O);
        xlVar.g.set(this.g);
        xlVar.c = this.c;
        xlVar.b = this.b;
        return xlVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        zl zlVar = this.O.z;
        xl xlVar = zlVar.Q.K;
        if (xlVar != null && xlVar.b == this.b) {
            f10 = zlVar.H;
        }
        float T1 = (((1.0f - f10) * 0.2f) + 0.8f) * org.telegram.messenger.g0.T1(this.j, this.k, e());
        RectF f11 = f(e());
        float f12 = 1.0f - T1;
        float f13 = T1 + 1.0f;
        f11.set(a1.g.e(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, a1.g.e(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
        return f11;
    }

    public final float e() {
        return this.O.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.h) / 200.0f));
    }

    public final RectF f(float f10) {
        RectF rectF;
        RectF rectF2 = this.y;
        RectF rectF3 = this.g;
        if (rectF3 == null || this.c == null) {
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF2;
        }
        yl ylVar = this.O;
        float f11 = (rectF3.left * ylVar.r) + ylVar.n;
        float f12 = (rectF3.top * ylVar.s) + ylVar.p;
        float width = rectF3.width() * ylVar.r;
        float height = rectF3.height() * ylVar.s;
        if (f10 < 1.0f && (rectF = this.f) != null) {
            f11 = org.telegram.messenger.g0.T1((rectF.left * ylVar.r) + ylVar.n, f11, f10);
            f12 = org.telegram.messenger.g0.T1((this.f.top * ylVar.s) + ylVar.p, f12, f10);
            width = org.telegram.messenger.g0.T1(this.f.width() * ylVar.r, width, f10);
            height = org.telegram.messenger.g0.T1(this.f.height() * ylVar.s, height, f10);
        }
        int i3 = this.i;
        if ((i3 & 4) == 0) {
            int i10 = ylVar.m;
            f12 += i10;
            height -= i10;
        }
        if ((i3 & 8) == 0) {
            height -= ylVar.m;
        }
        if ((i3 & 1) == 0) {
            int i11 = ylVar.m;
            f11 += i11;
            width -= i11;
        }
        if ((i3 & 2) == 0) {
            width -= ylVar.m;
        }
        rectF2.set(f11, f12, width + f11, height + f12);
        return rectF2;
    }
}
