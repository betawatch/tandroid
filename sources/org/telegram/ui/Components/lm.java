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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lm {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ mm O;
    public mm a;
    public MediaController.PhotoEntry b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public ih.j s;
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

    public lm(mm mmVar) {
        this.O = mmVar;
        this.a = mmVar;
    }

    public static void a(lm lmVar, MediaController.PhotoEntry photoEntry) {
        mm mmVar = lmVar.O;
        lmVar.b = photoEntry;
        if (photoEntry.isVideo) {
            lmVar.r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            lmVar.r = null;
        }
        if (lmVar.c == null) {
            lmVar.c = new ImageReceiver(mmVar.z);
            lmVar.d = new ImageReceiver(mmVar.z);
            lmVar.c.setDelegate(new o1(14, lmVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            lmVar.c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
            return;
        }
        if (photoEntry.path == null) {
            lmVar.c.setImageBitmap(org.telegram.ui.ActionBar.j6.R4);
            return;
        }
        if (photoEntry.isVideo) {
            lmVar.c.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
            lmVar.c.setAllowStartAnimation(true);
            return;
        }
        lmVar.c.setOrientation(photoEntry.orientation, true);
        lmVar.c.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.j6.R4, 0L, null, null, 0);
    }

    public static void b(lm lmVar, gm gmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z4) {
        RectF rectF = lmVar.q;
        RectF rectF2 = lmVar.g;
        if (gmVar == null || groupedMessagePosition == null) {
            if (!z4) {
                lmVar.j = 0.0f;
                lmVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            lmVar.j = AndroidUtilities.lerp(lmVar.j, lmVar.k, lmVar.e());
            RectF rectF3 = lmVar.f;
            if (rectF3 != null) {
                AndroidUtilities.lerp(rectF3, rectF2, lmVar.e(), lmVar.f);
            }
            lmVar.k = 0.0f;
            lmVar.h = elapsedRealtime;
            return;
        }
        lmVar.i = groupedMessagePosition.flags;
        if (z4) {
            float e = lmVar.e();
            RectF rectF4 = lmVar.f;
            if (rectF4 != null) {
                AndroidUtilities.lerp(rectF4, rectF2, e, rectF4);
            }
            RectF rectF5 = lmVar.p;
            if (rectF5 != null) {
                AndroidUtilities.lerp(rectF5, rectF, e, rectF5);
            }
            lmVar.j = AndroidUtilities.lerp(lmVar.j, lmVar.k, e);
            lmVar.h = SystemClock.elapsedRealtime();
        }
        float f10 = groupedMessagePosition.left;
        float f11 = gmVar.c;
        float f12 = f10 / f11;
        float f13 = groupedMessagePosition.top;
        float f14 = gmVar.f;
        float f15 = f13 / f14;
        float f16 = groupedMessagePosition.pw / f11;
        float f17 = groupedMessagePosition.ph / f14;
        lmVar.k = 1.0f;
        rectF2.set(f12, f15, f16 + f12, f17 + f15);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        int i10 = lmVar.i;
        float f18 = (i10 & 5) == 5 ? dp2 : dp;
        float f19 = (i10 & 6) == 6 ? dp2 : dp;
        float f20 = (i10 & 10) == 10 ? dp2 : dp;
        if ((i10 & 9) == 9) {
            dp = dp2;
        }
        rectF.set(f18, f19, f20, dp);
        if (lmVar.f == null) {
            RectF rectF6 = new RectF();
            lmVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (lmVar.p == null) {
            RectF rectF7 = new RectF();
            lmVar.p = rectF7;
            rectF7.set(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, boolean z4) {
        float f10;
        nm nmVar;
        char c3;
        char c10;
        Bitmap bitmap;
        float f11;
        boolean z10;
        float f12;
        float f13;
        float f14;
        String str;
        String str2;
        char c11;
        RectF rectF;
        float e = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        mm mmVar = this.O;
        nm nmVar2 = mmVar.z;
        om omVar = nmVar2.M;
        float f15 = nmVar2.M.G == this ? nmVar2.D : 0.0f;
        float lerp = AndroidUtilities.lerp(this.j, this.k, e);
        if (lerp <= 0.0f) {
            return false;
        }
        RectF d = d();
        float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        RectF rectF2 = this.q;
        float f16 = rectF2.left;
        float f17 = rectF2.top;
        float f18 = rectF2.right;
        float f19 = rectF2.bottom;
        if (e < 1.0f && (rectF = this.p) != null) {
            f16 = AndroidUtilities.lerp(rectF.left, f16, e);
            f17 = AndroidUtilities.lerp(this.p.top, f17, e);
            f18 = AndroidUtilities.lerp(this.p.right, f18, e);
            f19 = AndroidUtilities.lerp(this.p.bottom, f19, e);
        }
        float lerp2 = AndroidUtilities.lerp(f16, dp, f15);
        float lerp3 = AndroidUtilities.lerp(f17, dp, f15);
        float lerp4 = AndroidUtilities.lerp(f18, dp, f15);
        float lerp5 = AndroidUtilities.lerp(f19, dp, f15);
        if (z4) {
            canvas.save();
            canvas.translate(-d.centerX(), -d.centerY());
        }
        int i10 = (int) lerp2;
        int i11 = (int) lerp3;
        int i12 = (int) lerp4;
        int i13 = (int) lerp5;
        this.c.setRoundRadius(i10, i11, i12, i13);
        this.c.setImageCoords(d.left, d.top, d.width(), d.height());
        this.c.setAlpha(lerp);
        this.c.draw(canvas);
        MediaController.PhotoEntry photoEntry = this.b;
        float[] fArr = this.u;
        Path path = this.t;
        if (photoEntry == null || !photoEntry.hasSpoiler || photoEntry.isChatPreviewSpoilerRevealed) {
            f10 = lerp3;
            nmVar = nmVar2;
            c3 = 3;
            c10 = 2;
        } else {
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
                    f10 = lerp3;
                    path.addCircle(this.m, this.n, this.l * this.o, direction);
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    f10 = lerp3;
                }
                this.d.setRoundRadius(i10, i11, i12, i13);
                this.d.setImageCoords(d.left, d.top, d.width(), d.height());
                this.d.setAlpha(lerp);
                this.d.draw(canvas);
                if (this.s == null) {
                    this.s = ih.j.e(nmVar2);
                }
                ih.j jVar = this.s;
                int width = nmVar2.getWidth();
                int height = nmVar2.getHeight();
                nmVar = nmVar2;
                c3 = 3;
                c10 = 2;
                jVar.c(canvas, nmVar, width, height, 1.0f, false);
                canvas.restore();
                nmVar.invalidate();
                nmVar.invalidate();
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
            this.d.setRoundRadius(i10, i11, i12, i13);
            this.d.setImageCoords(d.left, d.top, d.width(), d.height());
            this.d.setAlpha(lerp);
            this.d.draw(canvas);
            if (this.s == null) {
            }
            ih.j jVar2 = this.s;
            int width2 = nmVar2.getWidth();
            int height2 = nmVar2.getHeight();
            nmVar = nmVar2;
            c3 = 3;
            c10 = 2;
            jVar2.c(canvas, nmVar, width2, height2, 1.0f, false);
            canvas.restore();
            nmVar.invalidate();
            nmVar.invalidate();
        }
        float f20 = this.w;
        String str3 = null;
        if (f20 != 1.0f && this.v != null) {
            fArr[1] = lerp2;
            fArr[0] = lerp2;
            fArr[c3] = f10;
            fArr[c10] = f10;
            fArr[5] = lerp4;
            fArr[4] = lerp4;
            fArr[7] = lerp5;
            fArr[6] = lerp5;
            canvas.save();
            path.rewind();
            path.addRoundRect(d, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            float min = Math.min(1.0f, (Math.min(16L, SystemClock.elapsedRealtime() - this.h) / 250.0f) + this.w);
            this.w = min;
            int i14 = (int) ((1.0f - min) * 255.0f);
            Paint paint = this.x;
            paint.setAlpha(i14);
            canvas.drawBitmap(this.v, d.left, d.top, paint);
            canvas.restore();
            nmVar.invalidate();
        } else if (f20 == 1.0f && (bitmap = this.v) != null) {
            bitmap.recycle();
            this.v = null;
            nmVar.invalidate();
        }
        int indexOf = mmVar.k.g.indexOf(this.b) + mmVar.b;
        if (indexOf >= 0) {
            str3 = (indexOf + 1) + "";
        }
        float f21 = this.c.getVisible() ? 1.0f : 0.0f;
        boolean z11 = Math.abs(this.M - f21) > 0.01f;
        if (z11) {
            long min2 = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
            this.N = SystemClock.elapsedRealtime();
            float f22 = min2 / 100.0f;
            float f23 = this.M;
            if (f21 < f23) {
                this.M = Math.max(0.0f, f23 - f22);
            } else {
                this.M = Math.min(1.0f, f23 + f22);
            }
        }
        float dp2 = d.top + AndroidUtilities.dp(10.0f);
        float dp3 = d.right - AndroidUtilities.dp(10.0f);
        float f24 = this.M * lerp;
        int dp4 = AndroidUtilities.dp(12.0f);
        int dp5 = AndroidUtilities.dp(1.2f);
        int i15 = (dp4 + dp5) * 2;
        int i16 = dp5 * 4;
        Rect rect = this.I;
        if (str3 == null || !(this.E == null || (str2 = this.F) == null || !str2.equals(str3))) {
            f11 = dp2;
            z10 = z11;
            f12 = dp3;
            f13 = f24;
        } else {
            if (this.E == null) {
                this.E = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
            }
            f11 = dp2;
            Canvas canvas2 = new Canvas(this.E);
            canvas2.drawColor(0);
            if (this.B == null) {
                z10 = z11;
                TextPaint textPaint = new TextPaint(1);
                this.B = textPaint;
                textPaint.setTypeface(AndroidUtilities.bold());
            } else {
                z10 = z11;
            }
            TextPaint textPaint2 = this.B;
            int i17 = org.telegram.ui.ActionBar.j6.V9;
            f12 = dp3;
            textPaint2.setColor(org.telegram.ui.ActionBar.j6.v0(i17, omVar.a));
            int length = str3.length();
            float f25 = (length == 0 || length == 1 || length == 2) ? 14.0f : length != 3 ? 8.0f : 10.0f;
            this.B.setTextSize(AndroidUtilities.dp(f25));
            float f26 = i15 / 2.0f;
            f13 = f24;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W9, omVar.a);
            Paint paint2 = this.z;
            paint2.setColor(v02);
            float f27 = (int) f26;
            float f28 = dp4;
            canvas2.drawCircle(f27, f27, f28, paint2);
            int offsetColor = AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(i17, omVar.a), 1.0f, 1.0f);
            Paint paint3 = this.A;
            paint3.setColor(offsetColor);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(dp5);
            canvas2.drawCircle(f27, f27, f28, paint3);
            canvas2.drawText(str3, f26 - (this.B.measureText(str3) / 2.0f), f26 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f25 / 4.0f), this.B);
            rect.set(0, 0, i15, i15);
            this.F = str3;
        }
        Bitmap bitmap2 = this.E;
        Paint paint4 = this.D;
        if (bitmap2 != null) {
            float f29 = i15 * lerp;
            float f30 = i16;
            int i18 = (int) ((f12 - f29) + f30);
            float f31 = f11 - f30;
            int i19 = (int) (f31 + f29);
            Rect rect2 = this.J;
            rect2.set(i18, (int) f31, (int) (f12 + f30), i19);
            paint4.setAlpha((int) (f13 * 255.0f));
            canvas.drawBitmap(this.E, rect, rect2, paint4);
        }
        float dp6 = d.left + AndroidUtilities.dp(4.0f);
        float dp7 = d.bottom - AndroidUtilities.dp(4.0f);
        String str4 = this.r;
        float f32 = this.M * lerp;
        if (str4 != null) {
            Bitmap bitmap3 = this.G;
            Rect rect3 = this.K;
            if (bitmap3 == null || (str = this.H) == null || !str.equals(str4)) {
                if (this.C == null) {
                    TextPaint textPaint3 = new TextPaint(1);
                    this.C = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    this.C.setColor(-1);
                }
                float dp8 = AndroidUtilities.dp(12.0f);
                this.C.setTextSize(dp8);
                float intrinsicWidth = omVar.K.getIntrinsicWidth() + this.C.measureText(str4) + AndroidUtilities.dp(15.0f);
                Drawable drawable = omVar.K;
                float max = Math.max(dp8, AndroidUtilities.dp(4.0f) + omVar.K.getIntrinsicHeight());
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
                f14 = f32;
                Canvas canvas3 = new Canvas(this.G);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, intrinsicWidth, max);
                canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.i2);
                int dp9 = AndroidUtilities.dp(5.0f);
                int intrinsicHeight = (int) ((max - drawable.getIntrinsicHeight()) / 2.0f);
                drawable.setBounds(dp9, intrinsicHeight, drawable.getIntrinsicWidth() + dp9, drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.draw(canvas3);
                canvas3.drawText(str4, AndroidUtilities.dp(18.0f), dp8 + AndroidUtilities.dp(-0.7f), this.C);
                rect3.set(0, 0, ceil, ceil2);
                this.H = str4;
            } else {
                f14 = f32;
            }
            int width3 = this.G.getWidth();
            Rect rect4 = this.L;
            rect4.set((int) dp6, (int) (dp7 - (this.G.getHeight() * lerp)), (int) ((width3 * lerp) + dp6), (int) dp7);
            paint4.setAlpha((int) (f14 * 255.0f));
            canvas.drawBitmap(this.G, rect3, rect4, paint4);
        }
        if (z4) {
            canvas.restore();
        }
        return e < 1.0f || z10;
    }

    public final Object clone() {
        lm lmVar = new lm(this.O);
        lmVar.g.set(this.g);
        lmVar.c = this.c;
        lmVar.b = this.b;
        return lmVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        nm nmVar = this.O.z;
        lm lmVar = nmVar.M.G;
        if (lmVar != null && lmVar.b == this.b) {
            f10 = nmVar.D;
        }
        float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.j, this.k, e());
        RectF f11 = f(e());
        float f12 = 1.0f - lerp;
        float f13 = lerp + 1.0f;
        f11.set(android.support.v4.media.a.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, android.support.v4.media.a.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
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
        mm mmVar = this.O;
        float f11 = (rectF3.left * mmVar.r) + mmVar.n;
        float f12 = (rectF3.top * mmVar.s) + mmVar.p;
        float width = rectF3.width() * mmVar.r;
        float height = rectF3.height() * mmVar.s;
        if (f10 < 1.0f && (rectF = this.f) != null) {
            f11 = AndroidUtilities.lerp((rectF.left * mmVar.r) + mmVar.n, f11, f10);
            f12 = AndroidUtilities.lerp((this.f.top * mmVar.s) + mmVar.p, f12, f10);
            width = AndroidUtilities.lerp(this.f.width() * mmVar.r, width, f10);
            height = AndroidUtilities.lerp(this.f.height() * mmVar.s, height, f10);
        }
        int i10 = this.i;
        if ((i10 & 4) == 0) {
            int i11 = mmVar.m;
            f12 += i11;
            height -= i11;
        }
        if ((i10 & 8) == 0) {
            height -= mmVar.m;
        }
        if ((i10 & 1) == 0) {
            int i12 = mmVar.m;
            f11 += i12;
            width -= i12;
        }
        if ((i10 & 2) == 0) {
            width -= mmVar.m;
        }
        rectF2.set(f11, f12, width + f11, height + f12);
        return rectF2;
    }
}
