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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class en {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ fn O;
    public fn a;
    public MediaController.PhotoEntry b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public vh.f s;
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

    public en(fn fnVar) {
        this.O = fnVar;
        this.a = fnVar;
    }

    public static void a(en enVar, MediaController.PhotoEntry photoEntry) {
        fn fnVar = enVar.O;
        enVar.b = photoEntry;
        if (photoEntry.isVideo) {
            enVar.r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            enVar.r = null;
        }
        if (enVar.c == null) {
            enVar.c = new ImageReceiver(fnVar.z);
            enVar.d = new ImageReceiver(fnVar.z);
            enVar.c.setDelegate(new y2(7, enVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            enVar.c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
            return;
        }
        if (photoEntry.path == null) {
            enVar.c.setImageBitmap(org.telegram.ui.ActionBar.i6.R4);
            return;
        }
        if (photoEntry.isVideo) {
            enVar.c.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
            enVar.c.setAllowStartAnimation(true);
            return;
        }
        enVar.c.setOrientation(photoEntry.orientation, true);
        enVar.c.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.i6.R4, 0L, null, null, 0);
    }

    public static void b(en enVar, an anVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        RectF rectF = enVar.q;
        RectF rectF2 = enVar.g;
        if (anVar == null || groupedMessagePosition == null) {
            if (!z10) {
                enVar.j = 0.0f;
                enVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            enVar.j = AndroidUtilities.lerp(enVar.j, enVar.k, enVar.e());
            RectF rectF3 = enVar.f;
            if (rectF3 != null) {
                AndroidUtilities.lerp(rectF3, rectF2, enVar.e(), enVar.f);
            }
            enVar.k = 0.0f;
            enVar.h = elapsedRealtime;
            return;
        }
        enVar.i = groupedMessagePosition.flags;
        if (z10) {
            float e7 = enVar.e();
            RectF rectF4 = enVar.f;
            if (rectF4 != null) {
                AndroidUtilities.lerp(rectF4, rectF2, e7, rectF4);
            }
            RectF rectF5 = enVar.p;
            if (rectF5 != null) {
                AndroidUtilities.lerp(rectF5, rectF, e7, rectF5);
            }
            enVar.j = AndroidUtilities.lerp(enVar.j, enVar.k, e7);
            enVar.h = SystemClock.elapsedRealtime();
        }
        float f7 = groupedMessagePosition.left;
        float f10 = anVar.c;
        float f11 = f7 / f10;
        float f12 = groupedMessagePosition.top;
        float f13 = anVar.f;
        float f14 = f12 / f13;
        float f15 = groupedMessagePosition.pw / f10;
        float f16 = groupedMessagePosition.ph / f13;
        enVar.k = 1.0f;
        rectF2.set(f11, f14, f15 + f11, f16 + f14);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        int i10 = enVar.i;
        float f17 = (i10 & 5) == 5 ? dp2 : dp;
        float f18 = (i10 & 6) == 6 ? dp2 : dp;
        float f19 = (i10 & 10) == 10 ? dp2 : dp;
        if ((i10 & 9) == 9) {
            dp = dp2;
        }
        rectF.set(f17, f18, f19, dp);
        if (enVar.f == null) {
            RectF rectF6 = new RectF();
            enVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (enVar.p == null) {
            RectF rectF7 = new RectF();
            enVar.p = rectF7;
            rectF7.set(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0502 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0504 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, boolean z10) {
        float f7;
        gn gnVar;
        char c10;
        int i10;
        float f10;
        String str;
        int i11;
        float f11;
        Bitmap bitmap;
        int indexOf;
        boolean z11;
        float dp;
        float dp2;
        float f12;
        float f13;
        boolean z12;
        float f14;
        float f15;
        Bitmap bitmap2;
        String str2;
        float f16;
        String str3;
        String str4;
        char c11;
        RectF rectF;
        float e7 = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        fn fnVar = this.O;
        gn gnVar2 = fnVar.z;
        hn hnVar = gnVar2.P;
        float f17 = gnVar2.P.J == this ? gnVar2.G : 0.0f;
        float lerp = AndroidUtilities.lerp(this.j, this.k, e7);
        if (lerp <= 0.0f) {
            return false;
        }
        RectF d = d();
        float dp3 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        RectF rectF2 = this.q;
        float f18 = rectF2.left;
        float f19 = rectF2.top;
        float f20 = rectF2.right;
        float f21 = rectF2.bottom;
        if (e7 < 1.0f && (rectF = this.p) != null) {
            f18 = AndroidUtilities.lerp(rectF.left, f18, e7);
            f19 = AndroidUtilities.lerp(this.p.top, f19, e7);
            f20 = AndroidUtilities.lerp(this.p.right, f20, e7);
            f21 = AndroidUtilities.lerp(this.p.bottom, f21, e7);
        }
        float lerp2 = AndroidUtilities.lerp(f18, dp3, f17);
        float lerp3 = AndroidUtilities.lerp(f19, dp3, f17);
        float lerp4 = AndroidUtilities.lerp(f20, dp3, f17);
        float lerp5 = AndroidUtilities.lerp(f21, dp3, f17);
        if (z10) {
            canvas.save();
            canvas.translate(-d.centerX(), -d.centerY());
        }
        int i12 = (int) lerp2;
        int i13 = (int) lerp3;
        int i14 = (int) lerp4;
        int i15 = (int) lerp5;
        this.c.setRoundRadius(i12, i13, i14, i15);
        this.c.setImageCoords(d.left, d.top, d.width(), d.height());
        this.c.setAlpha(lerp);
        this.c.draw(canvas);
        MediaController.PhotoEntry photoEntry = this.b;
        float[] fArr = this.u;
        Path path = this.t;
        if (photoEntry == null) {
            f7 = lerp3;
            gnVar = gnVar2;
            c10 = 3;
        } else {
            if (photoEntry.hasSpoiler && !photoEntry.isChatPreviewSpoilerRevealed) {
                if (!this.e && this.d.getBitmap() == null && this.c.getBitmap() != null) {
                    this.e = true;
                    this.d.setImageBitmap(Utilities.stackBlurBitmapMax(this.c.getBitmap()));
                } else if (!this.e && this.d.getBitmap() != null) {
                    c11 = 1;
                    this.e = true;
                    fArr[c11] = lerp2;
                    fArr[0] = lerp2;
                    fArr[3] = lerp3;
                    fArr[2] = lerp3;
                    fArr[5] = lerp4;
                    fArr[4] = lerp4;
                    fArr[7] = lerp5;
                    fArr[6] = lerp5;
                    canvas.save();
                    path.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path.addRoundRect(d, fArr, direction);
                    canvas.clipPath(path);
                    if (this.l == 0.0f) {
                        path.rewind();
                        f7 = lerp3;
                        path.addCircle(this.m, this.n, this.l * this.o, direction);
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                    } else {
                        f7 = lerp3;
                    }
                    this.d.setRoundRadius(i12, i13, i14, i15);
                    this.d.setImageCoords(d.left, d.top, d.width(), d.height());
                    this.d.setAlpha(lerp);
                    this.d.draw(canvas);
                    if (this.s == null) {
                        this.s = vh.f.e(gnVar2);
                    }
                    vh.f fVar = this.s;
                    int width = gnVar2.getWidth();
                    int height = gnVar2.getHeight();
                    gnVar = gnVar2;
                    c10 = 3;
                    i10 = 2;
                    fVar.c(canvas, gnVar, width, height, 1.0f, false);
                    canvas.restore();
                    gnVar.invalidate();
                    gnVar.invalidate();
                    f10 = this.w;
                    str = null;
                    if (f10 != 1.0f || this.v == null) {
                        i11 = i10;
                        f11 = 255.0f;
                        if (f10 == 1.0f && (bitmap = this.v) != null) {
                            bitmap.recycle();
                            this.v = null;
                            gnVar.invalidate();
                        }
                    } else {
                        fArr[1] = lerp2;
                        fArr[0] = lerp2;
                        fArr[c10] = f7;
                        fArr[i10] = f7;
                        fArr[5] = lerp4;
                        fArr[4] = lerp4;
                        fArr[7] = lerp5;
                        fArr[6] = lerp5;
                        canvas.save();
                        path.rewind();
                        path.addRoundRect(d, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        f11 = 255.0f;
                        i11 = i10;
                        float min = Math.min(1.0f, (Math.min(16L, SystemClock.elapsedRealtime() - this.h) / 250.0f) + this.w);
                        this.w = min;
                        int i16 = (int) ((1.0f - min) * 255.0f);
                        Paint paint = this.x;
                        paint.setAlpha(i16);
                        canvas.drawBitmap(this.v, d.left, d.top, paint);
                        canvas.restore();
                        gnVar.invalidate();
                    }
                    indexOf = fnVar.k.g.indexOf(this.b) + fnVar.b;
                    if (indexOf >= 0) {
                        str = (indexOf + 1) + "";
                    }
                    float f22 = this.c.getVisible() ? 1.0f : 0.0f;
                    z11 = Math.abs(this.M - f22) > 0.01f;
                    if (z11) {
                        long min2 = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
                        this.N = SystemClock.elapsedRealtime();
                        float f23 = min2 / 100.0f;
                        float f24 = this.M;
                        if (f22 < f24) {
                            this.M = Math.max(0.0f, f24 - f23);
                        } else {
                            this.M = Math.min(1.0f, f24 + f23);
                        }
                    }
                    dp = d.top + AndroidUtilities.dp(10.0f);
                    dp2 = d.right - AndroidUtilities.dp(10.0f);
                    f12 = this.M * lerp;
                    int dp4 = AndroidUtilities.dp(12.0f);
                    int dp5 = AndroidUtilities.dp(1.2f);
                    int i17 = (dp4 + dp5) * 2;
                    int i18 = dp5 * 4;
                    float f25 = f11;
                    Rect rect = this.I;
                    if (str == null && (this.E == null || (str4 = this.F) == null || !str4.equals(str))) {
                        if (this.E == null) {
                            this.E = Bitmap.createBitmap(i17, i17, Bitmap.Config.ARGB_8888);
                        }
                        f13 = dp;
                        Canvas canvas2 = new Canvas(this.E);
                        canvas2.drawColor(0);
                        if (this.B == null) {
                            z12 = z11;
                            TextPaint textPaint = new TextPaint(1);
                            this.B = textPaint;
                            textPaint.setTypeface(AndroidUtilities.bold());
                        } else {
                            z12 = z11;
                        }
                        TextPaint textPaint2 = this.B;
                        int i19 = org.telegram.ui.ActionBar.i6.V9;
                        f14 = dp2;
                        textPaint2.setColor(org.telegram.ui.ActionBar.i6.w0(i19, hnVar.a));
                        int length = str.length();
                        float f26 = (length == 0 || length == 1 || length == i11) ? 14.0f : length != 3 ? 8.0f : 10.0f;
                        this.B.setTextSize(AndroidUtilities.dp(f26));
                        float f27 = i17 / 2.0f;
                        f15 = f12;
                        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W9, hnVar.a);
                        Paint paint2 = this.z;
                        paint2.setColor(w02);
                        float f28 = (int) f27;
                        float f29 = dp4;
                        canvas2.drawCircle(f28, f28, f29, paint2);
                        int offsetColor = AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.i6.w0(i19, hnVar.a), 1.0f, 1.0f);
                        Paint paint3 = this.A;
                        paint3.setColor(offsetColor);
                        paint3.setStyle(Paint.Style.STROKE);
                        paint3.setStrokeWidth(dp5);
                        canvas2.drawCircle(f28, f28, f29, paint3);
                        canvas2.drawText(str, f27 - (this.B.measureText(str) / 2.0f), f27 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f26 / 4.0f), this.B);
                        rect.set(0, 0, i17, i17);
                        this.F = str;
                    } else {
                        f13 = dp;
                        z12 = z11;
                        f14 = dp2;
                        f15 = f12;
                    }
                    bitmap2 = this.E;
                    Paint paint4 = this.D;
                    if (bitmap2 != null) {
                        float f30 = i17 * lerp;
                        float f31 = i18;
                        int i20 = (int) ((f14 - f30) + f31);
                        float f32 = f13 - f31;
                        int i21 = (int) (f32 + f30);
                        Rect rect2 = this.J;
                        rect2.set(i20, (int) f32, (int) (f14 + f31), i21);
                        paint4.setAlpha((int) (f15 * f25));
                        canvas.drawBitmap(this.E, rect, rect2, paint4);
                    }
                    float dp6 = d.left + AndroidUtilities.dp(4.0f);
                    float dp7 = d.bottom - AndroidUtilities.dp(4.0f);
                    str2 = this.r;
                    float f33 = this.M * lerp;
                    if (str2 != null) {
                        Bitmap bitmap3 = this.G;
                        Rect rect3 = this.K;
                        if (bitmap3 == null || (str3 = this.H) == null || !str3.equals(str2)) {
                            if (this.C == null) {
                                TextPaint textPaint3 = new TextPaint(1);
                                this.C = textPaint3;
                                textPaint3.setTypeface(AndroidUtilities.bold());
                                this.C.setColor(-1);
                            }
                            float dp8 = AndroidUtilities.dp(12.0f);
                            this.C.setTextSize(dp8);
                            float intrinsicWidth = hnVar.N.getIntrinsicWidth() + this.C.measureText(str2) + AndroidUtilities.dp(15.0f);
                            Drawable drawable = hnVar.N;
                            float max = Math.max(dp8, AndroidUtilities.dp(4.0f) + hnVar.N.getIntrinsicHeight());
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
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            rectF3.set(0.0f, 0.0f, intrinsicWidth, max);
                            canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.i6.i2);
                            int dp9 = AndroidUtilities.dp(5.0f);
                            int intrinsicHeight = (int) ((max - drawable.getIntrinsicHeight()) / 2.0f);
                            drawable.setBounds(dp9, intrinsicHeight, drawable.getIntrinsicWidth() + dp9, drawable.getIntrinsicHeight() + intrinsicHeight);
                            drawable.draw(canvas3);
                            canvas3.drawText(str2, AndroidUtilities.dp(18.0f), dp8 + AndroidUtilities.dp(-0.7f), this.C);
                            rect3.set(0, 0, ceil, ceil2);
                            this.H = str2;
                        } else {
                            f16 = f33;
                        }
                        int width2 = this.G.getWidth();
                        Rect rect4 = this.L;
                        rect4.set((int) dp6, (int) (dp7 - (this.G.getHeight() * lerp)), (int) ((width2 * lerp) + dp6), (int) dp7);
                        paint4.setAlpha((int) (f16 * f25));
                        canvas.drawBitmap(this.G, rect3, rect4, paint4);
                    }
                    if (z10) {
                        canvas.restore();
                    }
                    return e7 >= 1.0f || z12;
                }
                c11 = 1;
                fArr[c11] = lerp2;
                fArr[0] = lerp2;
                fArr[3] = lerp3;
                fArr[2] = lerp3;
                fArr[5] = lerp4;
                fArr[4] = lerp4;
                fArr[7] = lerp5;
                fArr[6] = lerp5;
                canvas.save();
                path.rewind();
                Path.Direction direction2 = Path.Direction.CW;
                path.addRoundRect(d, fArr, direction2);
                canvas.clipPath(path);
                if (this.l == 0.0f) {
                }
                this.d.setRoundRadius(i12, i13, i14, i15);
                this.d.setImageCoords(d.left, d.top, d.width(), d.height());
                this.d.setAlpha(lerp);
                this.d.draw(canvas);
                if (this.s == null) {
                }
                vh.f fVar2 = this.s;
                int width3 = gnVar2.getWidth();
                int height2 = gnVar2.getHeight();
                gnVar = gnVar2;
                c10 = 3;
                i10 = 2;
                fVar2.c(canvas, gnVar, width3, height2, 1.0f, false);
                canvas.restore();
                gnVar.invalidate();
                gnVar.invalidate();
                f10 = this.w;
                str = null;
                if (f10 != 1.0f) {
                }
                i11 = i10;
                f11 = 255.0f;
                if (f10 == 1.0f) {
                    bitmap.recycle();
                    this.v = null;
                    gnVar.invalidate();
                }
                indexOf = fnVar.k.g.indexOf(this.b) + fnVar.b;
                if (indexOf >= 0) {
                }
                if (this.c.getVisible()) {
                }
                if (Math.abs(this.M - f22) > 0.01f) {
                }
                if (z11) {
                }
                dp = d.top + AndroidUtilities.dp(10.0f);
                dp2 = d.right - AndroidUtilities.dp(10.0f);
                f12 = this.M * lerp;
                int dp42 = AndroidUtilities.dp(12.0f);
                int dp52 = AndroidUtilities.dp(1.2f);
                int i172 = (dp42 + dp52) * 2;
                int i182 = dp52 * 4;
                float f252 = f11;
                Rect rect5 = this.I;
                if (str == null) {
                }
                f13 = dp;
                z12 = z11;
                f14 = dp2;
                f15 = f12;
                bitmap2 = this.E;
                Paint paint42 = this.D;
                if (bitmap2 != null) {
                }
                float dp62 = d.left + AndroidUtilities.dp(4.0f);
                float dp72 = d.bottom - AndroidUtilities.dp(4.0f);
                str2 = this.r;
                float f332 = this.M * lerp;
                if (str2 != null) {
                }
                if (z10) {
                }
                if (e7 >= 1.0f) {
                    return true;
                }
            }
            f7 = lerp3;
            gnVar = gnVar2;
            c10 = 3;
        }
        i10 = 2;
        f10 = this.w;
        str = null;
        if (f10 != 1.0f) {
        }
        i11 = i10;
        f11 = 255.0f;
        if (f10 == 1.0f) {
        }
        indexOf = fnVar.k.g.indexOf(this.b) + fnVar.b;
        if (indexOf >= 0) {
        }
        if (this.c.getVisible()) {
        }
        if (Math.abs(this.M - f22) > 0.01f) {
        }
        if (z11) {
        }
        dp = d.top + AndroidUtilities.dp(10.0f);
        dp2 = d.right - AndroidUtilities.dp(10.0f);
        f12 = this.M * lerp;
        int dp422 = AndroidUtilities.dp(12.0f);
        int dp522 = AndroidUtilities.dp(1.2f);
        int i1722 = (dp422 + dp522) * 2;
        int i1822 = dp522 * 4;
        float f2522 = f11;
        Rect rect52 = this.I;
        if (str == null) {
        }
        f13 = dp;
        z12 = z11;
        f14 = dp2;
        f15 = f12;
        bitmap2 = this.E;
        Paint paint422 = this.D;
        if (bitmap2 != null) {
        }
        float dp622 = d.left + AndroidUtilities.dp(4.0f);
        float dp722 = d.bottom - AndroidUtilities.dp(4.0f);
        str2 = this.r;
        float f3322 = this.M * lerp;
        if (str2 != null) {
        }
        if (z10) {
        }
        if (e7 >= 1.0f) {
        }
    }

    public final Object clone() {
        en enVar = new en(this.O);
        enVar.g.set(this.g);
        enVar.c = this.c;
        enVar.b = this.b;
        return enVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        gn gnVar = this.O.z;
        en enVar = gnVar.P.J;
        if (enVar != null && enVar.b == this.b) {
            f7 = gnVar.G;
        }
        float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.j, this.k, e());
        RectF f10 = f(e());
        float f11 = 1.0f - lerp;
        float f12 = lerp + 1.0f;
        f10.set(a1.g.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a1.g.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
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
        fn fnVar = this.O;
        float f10 = (rectF3.left * fnVar.r) + fnVar.n;
        float f11 = (rectF3.top * fnVar.s) + fnVar.p;
        float width = rectF3.width() * fnVar.r;
        float height = rectF3.height() * fnVar.s;
        if (f7 < 1.0f && (rectF = this.f) != null) {
            f10 = AndroidUtilities.lerp((rectF.left * fnVar.r) + fnVar.n, f10, f7);
            f11 = AndroidUtilities.lerp((this.f.top * fnVar.s) + fnVar.p, f11, f7);
            width = AndroidUtilities.lerp(this.f.width() * fnVar.r, width, f7);
            height = AndroidUtilities.lerp(this.f.height() * fnVar.s, height, f7);
        }
        int i10 = this.i;
        if ((i10 & 4) == 0) {
            int i11 = fnVar.m;
            f11 += i11;
            height -= i11;
        }
        if ((i10 & 8) == 0) {
            height -= fnVar.m;
        }
        if ((i10 & 1) == 0) {
            int i12 = fnVar.m;
            f10 += i12;
            width -= i12;
        }
        if ((i10 & 2) == 0) {
            width -= fnVar.m;
        }
        rectF2.set(f10, f11, width + f10, height + f11);
        return rectF2;
    }
}
