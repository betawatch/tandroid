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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gm {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ hm O;
    public hm a;
    public org.telegram.messenger.ef b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public nh.h s;
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

    public gm(hm hmVar) {
        this.O = hmVar;
        this.a = hmVar;
    }

    public static void a(gm gmVar, org.telegram.messenger.ef efVar) {
        hm hmVar = gmVar.O;
        gmVar.b = efVar;
        if (efVar.b) {
            gmVar.r = org.telegram.messenger.i0.g0(efVar.E, false, false);
        } else {
            gmVar.r = null;
        }
        if (gmVar.c == null) {
            gmVar.c = new ImageReceiver(hmVar.z);
            gmVar.d = new ImageReceiver(hmVar.z);
            gmVar.c.g1 = new f2(10, gmVar, efVar);
        }
        int i10 = efVar.C;
        String str = efVar.I;
        String str2 = efVar.c;
        if (str2 != null) {
            gmVar.c.r0(org.telegram.messenger.ic.g(str2), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
            return;
        }
        if (str == null) {
            gmVar.c.w0(org.telegram.ui.ActionBar.t6.R4);
            return;
        }
        if (efVar.b) {
            gmVar.c.r0(org.telegram.messenger.ic.g("vthumb://" + i10 + ":" + str), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
            gmVar.c.t0 = true;
            return;
        }
        gmVar.c.G0(efVar.J, 0, true);
        gmVar.c.r0(org.telegram.messenger.ic.g("thumb://" + i10 + ":" + str), null, null, null, org.telegram.ui.ActionBar.t6.R4, 0L, null, null, 0);
    }

    public static void b(gm gmVar, dm dmVar, org.telegram.messenger.bj bjVar, boolean z10) {
        RectF rectF = gmVar.q;
        RectF rectF2 = gmVar.g;
        if (dmVar == null || bjVar == null) {
            if (!z10) {
                gmVar.j = 0.0f;
                gmVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            gmVar.j = org.telegram.messenger.i0.T1(gmVar.j, gmVar.k, gmVar.e());
            RectF rectF3 = gmVar.f;
            if (rectF3 != null) {
                org.telegram.messenger.i0.Z1(rectF3, rectF2, gmVar.e(), gmVar.f);
            }
            gmVar.k = 0.0f;
            gmVar.h = elapsedRealtime;
            return;
        }
        gmVar.i = bjVar.l;
        if (z10) {
            float e = gmVar.e();
            RectF rectF4 = gmVar.f;
            if (rectF4 != null) {
                org.telegram.messenger.i0.Z1(rectF4, rectF2, e, rectF4);
            }
            RectF rectF5 = gmVar.p;
            if (rectF5 != null) {
                org.telegram.messenger.i0.Z1(rectF5, rectF, e, rectF5);
            }
            gmVar.j = org.telegram.messenger.i0.T1(gmVar.j, gmVar.k, e);
            gmVar.h = SystemClock.elapsedRealtime();
        }
        float f7 = bjVar.q;
        float f10 = dmVar.b;
        float f11 = f7 / f10;
        float f12 = bjVar.p;
        float f13 = dmVar.a;
        float f14 = f12 / f13;
        float f15 = bjVar.e / f10;
        float f16 = bjVar.f / f13;
        gmVar.k = 1.0f;
        rectF2.set(f11, f14, f15 + f11, f16 + f14);
        float L = org.telegram.messenger.i0.L(2.0f);
        float L2 = org.telegram.messenger.i0.L(org.telegram.messenger.tz.Y0 - 1);
        int i10 = gmVar.i;
        float f17 = (i10 & 5) == 5 ? L2 : L;
        float f18 = (i10 & 6) == 6 ? L2 : L;
        float f19 = (i10 & 10) == 10 ? L2 : L;
        if ((i10 & 9) == 9) {
            L = L2;
        }
        rectF.set(f17, f18, f19, L);
        if (gmVar.f == null) {
            RectF rectF6 = new RectF();
            gmVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (gmVar.p == null) {
            RectF rectF7 = new RectF();
            gmVar.p = rectF7;
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
        float f7;
        im imVar;
        char c10;
        int i10;
        float f10;
        Bitmap bitmap;
        String str;
        int indexOf;
        String str2;
        boolean z11;
        float f11;
        int i11;
        float L;
        float L2;
        float f12;
        float f13;
        boolean z12;
        float f14;
        float f15;
        Bitmap bitmap2;
        String str3;
        float f16;
        String str4;
        String str5;
        int i12;
        char c11;
        RectF rectF;
        float e = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        hm hmVar = this.O;
        im imVar2 = hmVar.z;
        jm jmVar = imVar2.P;
        float f17 = imVar2.P.J == this ? imVar2.G : 0.0f;
        float T1 = org.telegram.messenger.i0.T1(this.j, this.k, e);
        if (T1 <= 0.0f) {
            return false;
        }
        RectF d = d();
        float L3 = org.telegram.messenger.i0.L(org.telegram.messenger.tz.Y0 - 1);
        RectF rectF2 = this.q;
        float f18 = rectF2.left;
        float f19 = rectF2.top;
        float f20 = rectF2.right;
        float f21 = rectF2.bottom;
        if (e < 1.0f && (rectF = this.p) != null) {
            f18 = org.telegram.messenger.i0.T1(rectF.left, f18, e);
            f19 = org.telegram.messenger.i0.T1(this.p.top, f19, e);
            f20 = org.telegram.messenger.i0.T1(this.p.right, f20, e);
            f21 = org.telegram.messenger.i0.T1(this.p.bottom, f21, e);
        }
        float T12 = org.telegram.messenger.i0.T1(f18, L3, f17);
        float T13 = org.telegram.messenger.i0.T1(f19, L3, f17);
        float T14 = org.telegram.messenger.i0.T1(f20, L3, f17);
        float T15 = org.telegram.messenger.i0.T1(f21, L3, f17);
        if (z10) {
            canvas.save();
            canvas.translate(-d.centerX(), -d.centerY());
        }
        int i13 = (int) T12;
        int i14 = (int) T13;
        int i15 = (int) T14;
        int i16 = (int) T15;
        this.c.K0(i13, i14, i15, i16);
        this.c.y0(d.left, d.top, d.width(), d.height());
        this.c.setAlpha(T1);
        this.c.h(canvas, null);
        org.telegram.messenger.ef efVar = this.b;
        float[] fArr = this.u;
        Path path = this.t;
        if (efVar == null) {
            f7 = T13;
            imVar = imVar2;
            c10 = 3;
        } else if (!efVar.M || efVar.R) {
            f7 = T13;
            imVar = imVar2;
            c10 = 3;
        } else {
            if (this.e || this.d.n() != null || this.c.n() == null) {
                i12 = 2;
                if (!this.e && this.d.n() != null) {
                    c11 = 1;
                    this.e = true;
                    fArr[c11] = T12;
                    fArr[0] = T12;
                    fArr[3] = T13;
                    fArr[i12] = T13;
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
                        f7 = T13;
                        path.addCircle(this.m, this.n, this.l * this.o, direction);
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                    } else {
                        f7 = T13;
                    }
                    this.d.K0(i13, i14, i15, i16);
                    this.d.y0(d.left, d.top, d.width(), d.height());
                    this.d.setAlpha(T1);
                    this.d.h(canvas, null);
                    if (this.s == null) {
                        this.s = nh.h.e(imVar2);
                    }
                    nh.h hVar = this.s;
                    int width = imVar2.getWidth();
                    int height = imVar2.getHeight();
                    imVar = imVar2;
                    c10 = 3;
                    i10 = i12;
                    hVar.c(canvas, imVar, width, height, 1.0f, false);
                    canvas.restore();
                    imVar.invalidate();
                    imVar.invalidate();
                    f10 = this.w;
                    if (f10 == 1.0f && this.v != null) {
                        fArr[1] = T12;
                        fArr[0] = T12;
                        fArr[c10] = f7;
                        fArr[i10] = f7;
                        fArr[5] = T14;
                        fArr[4] = T14;
                        fArr[7] = T15;
                        fArr[6] = T15;
                        canvas.save();
                        path.rewind();
                        path.addRoundRect(d, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        float e7 = org.telegram.ui.Cells.f1.e(Math.min(16L, SystemClock.elapsedRealtime() - this.h), 250.0f, this.w, 1.0f);
                        this.w = e7;
                        Paint paint = this.x;
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        canvas.drawBitmap(this.v, d.left, d.top, paint);
                        canvas.restore();
                        imVar.invalidate();
                    } else if (f10 == 1.0f && (bitmap = this.v) != null) {
                        bitmap.recycle();
                        str = null;
                        this.v = null;
                        imVar.invalidate();
                        indexOf = ((ArrayList) hmVar.k.f).indexOf(this.b) + hmVar.b;
                        if (indexOf >= 0) {
                            str2 = (indexOf + 1) + "";
                        } else {
                            str2 = str;
                        }
                        float f22 = this.c.Q0 ? 1.0f : 0.0f;
                        z11 = Math.abs(this.M - f22) > 0.01f;
                        if (z11) {
                            f11 = 255.0f;
                            i11 = i10;
                            long min = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
                            this.N = SystemClock.elapsedRealtime();
                            float f23 = min / 100.0f;
                            float f24 = this.M;
                            if (f22 < f24) {
                                this.M = Math.max(0.0f, f24 - f23);
                            } else {
                                this.M = Math.min(1.0f, f24 + f23);
                            }
                        } else {
                            f11 = 255.0f;
                            i11 = i10;
                        }
                        L = d.top + org.telegram.messenger.i0.L(10.0f);
                        L2 = d.right - org.telegram.messenger.i0.L(10.0f);
                        f12 = this.M * T1;
                        int L4 = org.telegram.messenger.i0.L(12.0f);
                        int L5 = org.telegram.messenger.i0.L(1.2f);
                        int i17 = (L4 + L5) * 2;
                        int i18 = L5 * 4;
                        float f25 = f11;
                        Rect rect = this.I;
                        if (str2 == null && (this.E == null || (str5 = this.F) == null || !str5.equals(str2))) {
                            if (this.E == null) {
                                this.E = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                            }
                            f13 = L;
                            Canvas canvas2 = new Canvas(this.E);
                            canvas2.drawColor(0);
                            if (this.B == null) {
                                z12 = z11;
                                TextPaint textPaint = new TextPaint(1);
                                this.B = textPaint;
                                textPaint.setTypeface(org.telegram.messenger.i0.o());
                            } else {
                                z12 = z11;
                            }
                            TextPaint textPaint2 = this.B;
                            int i19 = org.telegram.ui.ActionBar.t6.V9;
                            f14 = L2;
                            textPaint2.setColor(org.telegram.ui.ActionBar.t6.w0(i19, jmVar.a));
                            int length = str2.length();
                            float f26 = (length == 0 || length == 1 || length == i11) ? 14.0f : length != 3 ? 8.0f : 10.0f;
                            this.B.setTextSize(org.telegram.messenger.i0.L(f26));
                            float f27 = i17 / 2.0f;
                            f15 = f12;
                            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.W9, jmVar.a);
                            Paint paint2 = this.z;
                            paint2.setColor(w02);
                            float f28 = (int) f27;
                            float f29 = L4;
                            canvas2.drawCircle(f28, f28, f29, paint2);
                            int S0 = org.telegram.messenger.i0.S0(1.0f, 1.0f, -1, org.telegram.ui.ActionBar.t6.w0(i19, jmVar.a));
                            Paint paint3 = this.A;
                            paint3.setColor(S0);
                            paint3.setStyle(Paint.Style.STROKE);
                            paint3.setStrokeWidth(L5);
                            canvas2.drawCircle(f28, f28, f29, paint3);
                            canvas2.drawText(str2, f27 - (this.B.measureText(str2) / 2.0f), f27 + org.telegram.messenger.i0.L(1.0f) + org.telegram.messenger.i0.L(f26 / 4.0f), this.B);
                            rect.set(0, 0, i17, i17);
                            this.F = str2;
                        } else {
                            f13 = L;
                            z12 = z11;
                            f14 = L2;
                            f15 = f12;
                        }
                        bitmap2 = this.E;
                        Paint paint4 = this.D;
                        if (bitmap2 != null) {
                            float f30 = i17 * T1;
                            float f31 = i18;
                            float f32 = f13 - f31;
                            int i20 = (int) (f32 + f30);
                            Rect rect2 = this.J;
                            rect2.set((int) ((f14 - f30) + f31), (int) f32, (int) (f14 + f31), i20);
                            paint4.setAlpha((int) (f15 * f25));
                            canvas.drawBitmap(this.E, rect, rect2, paint4);
                        }
                        float L6 = d.left + org.telegram.messenger.i0.L(4.0f);
                        float L7 = d.bottom - org.telegram.messenger.i0.L(4.0f);
                        str3 = this.r;
                        float f33 = this.M * T1;
                        if (str3 != null) {
                            Bitmap bitmap3 = this.G;
                            Rect rect3 = this.K;
                            if (bitmap3 == null || (str4 = this.H) == null || !str4.equals(str3)) {
                                if (this.C == null) {
                                    TextPaint textPaint3 = new TextPaint(1);
                                    this.C = textPaint3;
                                    textPaint3.setTypeface(org.telegram.messenger.i0.o());
                                    this.C.setColor(-1);
                                }
                                float L8 = org.telegram.messenger.i0.L(12.0f);
                                this.C.setTextSize(L8);
                                float intrinsicWidth = jmVar.N.getIntrinsicWidth() + this.C.measureText(str3) + org.telegram.messenger.i0.L(15.0f);
                                Drawable drawable = jmVar.N;
                                float max = Math.max(L8, org.telegram.messenger.i0.L(4.0f) + jmVar.N.getIntrinsicHeight());
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
                                f16 = f33;
                                Canvas canvas3 = new Canvas(this.G);
                                RectF rectF3 = org.telegram.messenger.i0.P;
                                rectF3.set(0.0f, 0.0f, intrinsicWidth, max);
                                canvas3.drawRoundRect(rectF3, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.i2);
                                int L9 = org.telegram.messenger.i0.L(5.0f);
                                int intrinsicHeight = (int) ((max - drawable.getIntrinsicHeight()) / 2.0f);
                                drawable.setBounds(L9, intrinsicHeight, drawable.getIntrinsicWidth() + L9, drawable.getIntrinsicHeight() + intrinsicHeight);
                                drawable.draw(canvas3);
                                canvas3.drawText(str3, org.telegram.messenger.i0.L(18.0f), L8 + org.telegram.messenger.i0.L(-0.7f), this.C);
                                rect3.set(0, 0, ceil, ceil2);
                                this.H = str3;
                            } else {
                                f16 = f33;
                            }
                            int width2 = this.G.getWidth();
                            Rect rect4 = this.L;
                            rect4.set((int) L6, (int) (L7 - (this.G.getHeight() * T1)), (int) ((width2 * T1) + L6), (int) L7);
                            paint4.setAlpha((int) (f16 * f25));
                            canvas.drawBitmap(this.G, rect3, rect4, paint4);
                        }
                        if (z10) {
                            canvas.restore();
                        }
                        return e >= 1.0f || z12;
                    }
                    str = null;
                    indexOf = ((ArrayList) hmVar.k.f).indexOf(this.b) + hmVar.b;
                    if (indexOf >= 0) {
                    }
                    if (this.c.Q0) {
                    }
                    if (Math.abs(this.M - f22) > 0.01f) {
                    }
                    if (z11) {
                    }
                    L = d.top + org.telegram.messenger.i0.L(10.0f);
                    L2 = d.right - org.telegram.messenger.i0.L(10.0f);
                    f12 = this.M * T1;
                    int L42 = org.telegram.messenger.i0.L(12.0f);
                    int L52 = org.telegram.messenger.i0.L(1.2f);
                    int i172 = (L42 + L52) * 2;
                    int i182 = L52 * 4;
                    float f252 = f11;
                    Rect rect5 = this.I;
                    if (str2 == null) {
                    }
                    f13 = L;
                    z12 = z11;
                    f14 = L2;
                    f15 = f12;
                    bitmap2 = this.E;
                    Paint paint42 = this.D;
                    if (bitmap2 != null) {
                    }
                    float L62 = d.left + org.telegram.messenger.i0.L(4.0f);
                    float L72 = d.bottom - org.telegram.messenger.i0.L(4.0f);
                    str3 = this.r;
                    float f332 = this.M * T1;
                    if (str3 != null) {
                    }
                    if (z10) {
                    }
                    if (e >= 1.0f) {
                        return true;
                    }
                }
            } else {
                this.e = true;
                i12 = 2;
                this.d.v0(Utilities.D(this.c.n(), false));
            }
            c11 = 1;
            fArr[c11] = T12;
            fArr[0] = T12;
            fArr[3] = T13;
            fArr[i12] = T13;
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
            this.d.K0(i13, i14, i15, i16);
            this.d.y0(d.left, d.top, d.width(), d.height());
            this.d.setAlpha(T1);
            this.d.h(canvas, null);
            if (this.s == null) {
            }
            nh.h hVar2 = this.s;
            int width3 = imVar2.getWidth();
            int height2 = imVar2.getHeight();
            imVar = imVar2;
            c10 = 3;
            i10 = i12;
            hVar2.c(canvas, imVar, width3, height2, 1.0f, false);
            canvas.restore();
            imVar.invalidate();
            imVar.invalidate();
            f10 = this.w;
            if (f10 == 1.0f) {
            }
            if (f10 == 1.0f) {
                bitmap.recycle();
                str = null;
                this.v = null;
                imVar.invalidate();
                indexOf = ((ArrayList) hmVar.k.f).indexOf(this.b) + hmVar.b;
                if (indexOf >= 0) {
                }
                if (this.c.Q0) {
                }
                if (Math.abs(this.M - f22) > 0.01f) {
                }
                if (z11) {
                }
                L = d.top + org.telegram.messenger.i0.L(10.0f);
                L2 = d.right - org.telegram.messenger.i0.L(10.0f);
                f12 = this.M * T1;
                int L422 = org.telegram.messenger.i0.L(12.0f);
                int L522 = org.telegram.messenger.i0.L(1.2f);
                int i1722 = (L422 + L522) * 2;
                int i1822 = L522 * 4;
                float f2522 = f11;
                Rect rect52 = this.I;
                if (str2 == null) {
                }
                f13 = L;
                z12 = z11;
                f14 = L2;
                f15 = f12;
                bitmap2 = this.E;
                Paint paint422 = this.D;
                if (bitmap2 != null) {
                }
                float L622 = d.left + org.telegram.messenger.i0.L(4.0f);
                float L722 = d.bottom - org.telegram.messenger.i0.L(4.0f);
                str3 = this.r;
                float f3322 = this.M * T1;
                if (str3 != null) {
                }
                if (z10) {
                }
                if (e >= 1.0f) {
                }
            }
            str = null;
            indexOf = ((ArrayList) hmVar.k.f).indexOf(this.b) + hmVar.b;
            if (indexOf >= 0) {
            }
            if (this.c.Q0) {
            }
            if (Math.abs(this.M - f22) > 0.01f) {
            }
            if (z11) {
            }
            L = d.top + org.telegram.messenger.i0.L(10.0f);
            L2 = d.right - org.telegram.messenger.i0.L(10.0f);
            f12 = this.M * T1;
            int L4222 = org.telegram.messenger.i0.L(12.0f);
            int L5222 = org.telegram.messenger.i0.L(1.2f);
            int i17222 = (L4222 + L5222) * 2;
            int i18222 = L5222 * 4;
            float f25222 = f11;
            Rect rect522 = this.I;
            if (str2 == null) {
            }
            f13 = L;
            z12 = z11;
            f14 = L2;
            f15 = f12;
            bitmap2 = this.E;
            Paint paint4222 = this.D;
            if (bitmap2 != null) {
            }
            float L6222 = d.left + org.telegram.messenger.i0.L(4.0f);
            float L7222 = d.bottom - org.telegram.messenger.i0.L(4.0f);
            str3 = this.r;
            float f33222 = this.M * T1;
            if (str3 != null) {
            }
            if (z10) {
            }
            if (e >= 1.0f) {
            }
        }
        i10 = 2;
        f10 = this.w;
        if (f10 == 1.0f) {
        }
        if (f10 == 1.0f) {
        }
        str = null;
        indexOf = ((ArrayList) hmVar.k.f).indexOf(this.b) + hmVar.b;
        if (indexOf >= 0) {
        }
        if (this.c.Q0) {
        }
        if (Math.abs(this.M - f22) > 0.01f) {
        }
        if (z11) {
        }
        L = d.top + org.telegram.messenger.i0.L(10.0f);
        L2 = d.right - org.telegram.messenger.i0.L(10.0f);
        f12 = this.M * T1;
        int L42222 = org.telegram.messenger.i0.L(12.0f);
        int L52222 = org.telegram.messenger.i0.L(1.2f);
        int i172222 = (L42222 + L52222) * 2;
        int i182222 = L52222 * 4;
        float f252222 = f11;
        Rect rect5222 = this.I;
        if (str2 == null) {
        }
        f13 = L;
        z12 = z11;
        f14 = L2;
        f15 = f12;
        bitmap2 = this.E;
        Paint paint42222 = this.D;
        if (bitmap2 != null) {
        }
        float L62222 = d.left + org.telegram.messenger.i0.L(4.0f);
        float L72222 = d.bottom - org.telegram.messenger.i0.L(4.0f);
        str3 = this.r;
        float f332222 = this.M * T1;
        if (str3 != null) {
        }
        if (z10) {
        }
        if (e >= 1.0f) {
        }
    }

    public final Object clone() {
        gm gmVar = new gm(this.O);
        gmVar.g.set(this.g);
        gmVar.c = this.c;
        gmVar.b = this.b;
        return gmVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        im imVar = this.O.z;
        gm gmVar = imVar.P.J;
        if (gmVar != null && gmVar.b == this.b) {
            f7 = imVar.G;
        }
        float T1 = (((1.0f - f7) * 0.2f) + 0.8f) * org.telegram.messenger.i0.T1(this.j, this.k, e());
        RectF f10 = f(e());
        float f11 = 1.0f - T1;
        float f12 = T1 + 1.0f;
        f10.set(a1.g.A(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.A(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
        return f10;
    }

    public final float e() {
        return this.O.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.h) / 200.0f));
    }

    public final RectF f(float f7) {
        RectF rectF;
        RectF rectF2 = this.y;
        RectF rectF3 = this.g;
        if (rectF3 == null || this.c == null) {
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF2;
        }
        hm hmVar = this.O;
        float f10 = (rectF3.left * hmVar.r) + hmVar.n;
        float f11 = (rectF3.top * hmVar.s) + hmVar.p;
        float width = rectF3.width() * hmVar.r;
        float height = rectF3.height() * hmVar.s;
        if (f7 < 1.0f && (rectF = this.f) != null) {
            f10 = org.telegram.messenger.i0.T1((rectF.left * hmVar.r) + hmVar.n, f10, f7);
            f11 = org.telegram.messenger.i0.T1((this.f.top * hmVar.s) + hmVar.p, f11, f7);
            width = org.telegram.messenger.i0.T1(this.f.width() * hmVar.r, width, f7);
            height = org.telegram.messenger.i0.T1(this.f.height() * hmVar.s, height, f7);
        }
        int i10 = this.i;
        if ((i10 & 4) == 0) {
            int i11 = hmVar.m;
            f11 += i11;
            height -= i11;
        }
        if ((i10 & 8) == 0) {
            height -= hmVar.m;
        }
        if ((i10 & 1) == 0) {
            int i12 = hmVar.m;
            f10 += i12;
            width -= i12;
        }
        if ((i10 & 2) == 0) {
            width -= hmVar.m;
        }
        rectF2.set(f10, f11, width + f10, height + f11);
        return rectF2;
    }
}
