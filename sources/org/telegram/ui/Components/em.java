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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class em {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ fm O;
    public fm a;
    public MediaController.PhotoEntry b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public dh.k s;
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

    public em(fm fmVar) {
        this.O = fmVar;
        this.a = fmVar;
    }

    public static void a(em emVar, MediaController.PhotoEntry photoEntry) {
        fm fmVar = emVar.O;
        emVar.b = photoEntry;
        if (photoEntry.isVideo) {
            emVar.r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            emVar.r = null;
        }
        if (emVar.c == null) {
            emVar.c = new ImageReceiver(fmVar.z);
            emVar.d = new ImageReceiver(fmVar.z);
            emVar.c.setDelegate(new g1(15, emVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            emVar.c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.f6.R4, 0L, null, null, 0);
            return;
        }
        if (photoEntry.path == null) {
            emVar.c.setImageBitmap(org.telegram.ui.ActionBar.f6.R4);
            return;
        }
        if (photoEntry.isVideo) {
            emVar.c.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.f6.R4, 0L, null, null, 0);
            emVar.c.setAllowStartAnimation(true);
            return;
        }
        emVar.c.setOrientation(photoEntry.orientation, true);
        emVar.c.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.f6.R4, 0L, null, null, 0);
    }

    public static void b(em emVar, am amVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        RectF rectF = emVar.q;
        RectF rectF2 = emVar.g;
        if (amVar == null || groupedMessagePosition == null) {
            if (!z10) {
                emVar.j = 0.0f;
                emVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            emVar.j = AndroidUtilities.lerp(emVar.j, emVar.k, emVar.e());
            RectF rectF3 = emVar.f;
            if (rectF3 != null) {
                AndroidUtilities.lerp(rectF3, rectF2, emVar.e(), emVar.f);
            }
            emVar.k = 0.0f;
            emVar.h = elapsedRealtime;
            return;
        }
        emVar.i = groupedMessagePosition.flags;
        if (z10) {
            float e10 = emVar.e();
            RectF rectF4 = emVar.f;
            if (rectF4 != null) {
                AndroidUtilities.lerp(rectF4, rectF2, e10, rectF4);
            }
            RectF rectF5 = emVar.p;
            if (rectF5 != null) {
                AndroidUtilities.lerp(rectF5, rectF, e10, rectF5);
            }
            emVar.j = AndroidUtilities.lerp(emVar.j, emVar.k, e10);
            emVar.h = SystemClock.elapsedRealtime();
        }
        float f10 = groupedMessagePosition.left;
        float f11 = amVar.c;
        float f12 = f10 / f11;
        float f13 = groupedMessagePosition.top;
        float f14 = amVar.f;
        float f15 = f13 / f14;
        float f16 = groupedMessagePosition.pw / f11;
        float f17 = groupedMessagePosition.ph / f14;
        emVar.k = 1.0f;
        rectF2.set(f12, f15, f16 + f12, f17 + f15);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        int i9 = emVar.i;
        float f18 = (i9 & 5) == 5 ? dp2 : dp;
        float f19 = (i9 & 6) == 6 ? dp2 : dp;
        float f20 = (i9 & 10) == 10 ? dp2 : dp;
        if ((i9 & 9) == 9) {
            dp = dp2;
        }
        rectF.set(f18, f19, f20, dp);
        if (emVar.f == null) {
            RectF rectF6 = new RectF();
            emVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (emVar.p == null) {
            RectF rectF7 = new RectF();
            emVar.p = rectF7;
            rectF7.set(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, boolean z10) {
        float f10;
        gm gmVar;
        char c10;
        char c11;
        Bitmap bitmap;
        float f11;
        boolean z11;
        float f12;
        float f13;
        float f14;
        String str;
        String str2;
        char c12;
        RectF rectF;
        float e10 = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        fm fmVar = this.O;
        gm gmVar2 = fmVar.z;
        hm hmVar = gmVar2.L;
        float f15 = gmVar2.L.F == this ? gmVar2.C : 0.0f;
        float lerp = AndroidUtilities.lerp(this.j, this.k, e10);
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
        if (e10 < 1.0f && (rectF = this.p) != null) {
            f16 = AndroidUtilities.lerp(rectF.left, f16, e10);
            f17 = AndroidUtilities.lerp(this.p.top, f17, e10);
            f18 = AndroidUtilities.lerp(this.p.right, f18, e10);
            f19 = AndroidUtilities.lerp(this.p.bottom, f19, e10);
        }
        float lerp2 = AndroidUtilities.lerp(f16, dp, f15);
        float lerp3 = AndroidUtilities.lerp(f17, dp, f15);
        float lerp4 = AndroidUtilities.lerp(f18, dp, f15);
        float lerp5 = AndroidUtilities.lerp(f19, dp, f15);
        if (z10) {
            canvas.save();
            canvas.translate(-d.centerX(), -d.centerY());
        }
        int i9 = (int) lerp2;
        int i10 = (int) lerp3;
        int i11 = (int) lerp4;
        int i12 = (int) lerp5;
        this.c.setRoundRadius(i9, i10, i11, i12);
        this.c.setImageCoords(d.left, d.top, d.width(), d.height());
        this.c.setAlpha(lerp);
        this.c.draw(canvas);
        MediaController.PhotoEntry photoEntry = this.b;
        float[] fArr = this.u;
        Path path = this.t;
        if (photoEntry == null || !photoEntry.hasSpoiler || photoEntry.isChatPreviewSpoilerRevealed) {
            f10 = lerp3;
            gmVar = gmVar2;
            c10 = 3;
            c11 = 2;
        } else {
            if (!this.e && this.d.getBitmap() == null && this.c.getBitmap() != null) {
                this.e = true;
                this.d.setImageBitmap(Utilities.stackBlurBitmapMax(this.c.getBitmap()));
            } else if (!this.e && this.d.getBitmap() != null) {
                c12 = 1;
                this.e = true;
                fArr[c12] = lerp2;
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
                this.d.setRoundRadius(i9, i10, i11, i12);
                this.d.setImageCoords(d.left, d.top, d.width(), d.height());
                this.d.setAlpha(lerp);
                this.d.draw(canvas);
                if (this.s == null) {
                    this.s = dh.k.e(gmVar2);
                }
                dh.k kVar = this.s;
                int width = gmVar2.getWidth();
                int height = gmVar2.getHeight();
                gmVar = gmVar2;
                c10 = 3;
                c11 = 2;
                kVar.c(canvas, gmVar, width, height, 1.0f, false);
                canvas.restore();
                gmVar.invalidate();
                gmVar.invalidate();
            }
            c12 = 1;
            fArr[c12] = lerp2;
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
            this.d.setRoundRadius(i9, i10, i11, i12);
            this.d.setImageCoords(d.left, d.top, d.width(), d.height());
            this.d.setAlpha(lerp);
            this.d.draw(canvas);
            if (this.s == null) {
            }
            dh.k kVar2 = this.s;
            int width2 = gmVar2.getWidth();
            int height2 = gmVar2.getHeight();
            gmVar = gmVar2;
            c10 = 3;
            c11 = 2;
            kVar2.c(canvas, gmVar, width2, height2, 1.0f, false);
            canvas.restore();
            gmVar.invalidate();
            gmVar.invalidate();
        }
        float f20 = this.w;
        String str3 = null;
        if (f20 != 1.0f && this.v != null) {
            fArr[1] = lerp2;
            fArr[0] = lerp2;
            fArr[c10] = f10;
            fArr[c11] = f10;
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
            int i13 = (int) ((1.0f - min) * 255.0f);
            Paint paint = this.x;
            paint.setAlpha(i13);
            canvas.drawBitmap(this.v, d.left, d.top, paint);
            canvas.restore();
            gmVar.invalidate();
        } else if (f20 == 1.0f && (bitmap = this.v) != null) {
            bitmap.recycle();
            this.v = null;
            gmVar.invalidate();
        }
        int indexOf = fmVar.k.g.indexOf(this.b) + fmVar.b;
        if (indexOf >= 0) {
            str3 = (indexOf + 1) + "";
        }
        float f21 = this.c.getVisible() ? 1.0f : 0.0f;
        boolean z12 = Math.abs(this.M - f21) > 0.01f;
        if (z12) {
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
        int i14 = (dp4 + dp5) * 2;
        int i15 = dp5 * 4;
        Rect rect = this.I;
        if (str3 == null || !(this.E == null || (str2 = this.F) == null || !str2.equals(str3))) {
            f11 = dp2;
            z11 = z12;
            f12 = dp3;
            f13 = f24;
        } else {
            if (this.E == null) {
                this.E = Bitmap.createBitmap(i14, i14, Bitmap.Config.ARGB_8888);
            }
            f11 = dp2;
            Canvas canvas2 = new Canvas(this.E);
            canvas2.drawColor(0);
            if (this.B == null) {
                z11 = z12;
                TextPaint textPaint = new TextPaint(1);
                this.B = textPaint;
                textPaint.setTypeface(AndroidUtilities.bold());
            } else {
                z11 = z12;
            }
            TextPaint textPaint2 = this.B;
            int i16 = org.telegram.ui.ActionBar.f6.V9;
            f12 = dp3;
            textPaint2.setColor(org.telegram.ui.ActionBar.f6.v0(i16, hmVar.a));
            int length = str3.length();
            float f25 = (length == 0 || length == 1 || length == 2) ? 14.0f : length != 3 ? 8.0f : 10.0f;
            this.B.setTextSize(AndroidUtilities.dp(f25));
            float f26 = i14 / 2.0f;
            f13 = f24;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W9, hmVar.a);
            Paint paint2 = this.z;
            paint2.setColor(v02);
            float f27 = (int) f26;
            float f28 = dp4;
            canvas2.drawCircle(f27, f27, f28, paint2);
            int offsetColor = AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.f6.v0(i16, hmVar.a), 1.0f, 1.0f);
            Paint paint3 = this.A;
            paint3.setColor(offsetColor);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(dp5);
            canvas2.drawCircle(f27, f27, f28, paint3);
            canvas2.drawText(str3, f26 - (this.B.measureText(str3) / 2.0f), f26 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f25 / 4.0f), this.B);
            rect.set(0, 0, i14, i14);
            this.F = str3;
        }
        Bitmap bitmap2 = this.E;
        Paint paint4 = this.D;
        if (bitmap2 != null) {
            float f29 = i14 * lerp;
            float f30 = i15;
            int i17 = (int) ((f12 - f29) + f30);
            float f31 = f11 - f30;
            int i18 = (int) (f31 + f29);
            Rect rect2 = this.J;
            rect2.set(i17, (int) f31, (int) (f12 + f30), i18);
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
                float intrinsicWidth = hmVar.J.getIntrinsicWidth() + this.C.measureText(str4) + AndroidUtilities.dp(15.0f);
                Drawable drawable = hmVar.J;
                float max = Math.max(dp8, AndroidUtilities.dp(4.0f) + hmVar.J.getIntrinsicHeight());
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
                canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.f6.i2);
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
        if (z10) {
            canvas.restore();
        }
        return e10 < 1.0f || z11;
    }

    public final Object clone() {
        em emVar = new em(this.O);
        emVar.g.set(this.g);
        emVar.c = this.c;
        emVar.b = this.b;
        return emVar;
    }

    public final RectF d() {
        float f10 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        gm gmVar = this.O.z;
        em emVar = gmVar.L.F;
        if (emVar != null && emVar.b == this.b) {
            f10 = gmVar.C;
        }
        float lerp = (((1.0f - f10) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.j, this.k, e());
        RectF f11 = f(e());
        float f12 = 1.0f - lerp;
        float f13 = lerp + 1.0f;
        f11.set(aa.d.d(f11.width(), f12, 2.0f, f11.left), ((f11.height() * f12) / 2.0f) + f11.top, aa.d.d(f11.width(), f13, 2.0f, f11.left), ((f11.height() * f13) / 2.0f) + f11.top);
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
        fm fmVar = this.O;
        float f11 = (rectF3.left * fmVar.r) + fmVar.n;
        float f12 = (rectF3.top * fmVar.s) + fmVar.p;
        float width = rectF3.width() * fmVar.r;
        float height = rectF3.height() * fmVar.s;
        if (f10 < 1.0f && (rectF = this.f) != null) {
            f11 = AndroidUtilities.lerp((rectF.left * fmVar.r) + fmVar.n, f11, f10);
            f12 = AndroidUtilities.lerp((this.f.top * fmVar.s) + fmVar.p, f12, f10);
            width = AndroidUtilities.lerp(this.f.width() * fmVar.r, width, f10);
            height = AndroidUtilities.lerp(this.f.height() * fmVar.s, height, f10);
        }
        int i9 = this.i;
        if ((i9 & 4) == 0) {
            int i10 = fmVar.m;
            f12 += i10;
            height -= i10;
        }
        if ((i9 & 8) == 0) {
            height -= fmVar.m;
        }
        if ((i9 & 1) == 0) {
            int i11 = fmVar.m;
            f11 += i11;
            width -= i11;
        }
        if ((i9 & 2) == 0) {
            width -= fmVar.m;
        }
        rectF2.set(f11, f12, width + f11, height + f12);
        return rectF2;
    }
}
