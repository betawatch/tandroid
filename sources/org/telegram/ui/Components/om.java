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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class om {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ pm O;
    public pm a;
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

    public om(pm pmVar) {
        this.O = pmVar;
        this.a = pmVar;
    }

    public static void a(om omVar, MediaController.PhotoEntry photoEntry) {
        pm pmVar = omVar.O;
        omVar.b = photoEntry;
        if (photoEntry.isVideo) {
            omVar.r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            omVar.r = null;
        }
        if (omVar.c == null) {
            omVar.c = new ImageReceiver(pmVar.z);
            omVar.d = new ImageReceiver(pmVar.z);
            omVar.c.setDelegate(new w2(7, omVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            omVar.c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
            return;
        }
        if (photoEntry.path == null) {
            omVar.c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
            return;
        }
        if (photoEntry.isVideo) {
            omVar.c.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
            omVar.c.setAllowStartAnimation(true);
            return;
        }
        omVar.c.setOrientation(photoEntry.orientation, true);
        omVar.c.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
    }

    public static void b(om omVar, km kmVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        RectF rectF = omVar.q;
        RectF rectF2 = omVar.g;
        if (kmVar == null || groupedMessagePosition == null) {
            if (!z10) {
                omVar.j = 0.0f;
                omVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            omVar.j = AndroidUtilities.lerp(omVar.j, omVar.k, omVar.e());
            RectF rectF3 = omVar.f;
            if (rectF3 != null) {
                AndroidUtilities.lerp(rectF3, rectF2, omVar.e(), omVar.f);
            }
            omVar.k = 0.0f;
            omVar.h = elapsedRealtime;
            return;
        }
        omVar.i = groupedMessagePosition.flags;
        if (z10) {
            float e = omVar.e();
            RectF rectF4 = omVar.f;
            if (rectF4 != null) {
                AndroidUtilities.lerp(rectF4, rectF2, e, rectF4);
            }
            RectF rectF5 = omVar.p;
            if (rectF5 != null) {
                AndroidUtilities.lerp(rectF5, rectF, e, rectF5);
            }
            omVar.j = AndroidUtilities.lerp(omVar.j, omVar.k, e);
            omVar.h = SystemClock.elapsedRealtime();
        }
        float f7 = groupedMessagePosition.left;
        float f10 = kmVar.c;
        float f11 = f7 / f10;
        float f12 = groupedMessagePosition.top;
        float f13 = kmVar.f;
        float f14 = f12 / f13;
        float f15 = groupedMessagePosition.pw / f10;
        float f16 = groupedMessagePosition.ph / f13;
        omVar.k = 1.0f;
        rectF2.set(f11, f14, f15 + f11, f16 + f14);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        int i10 = omVar.i;
        float f17 = (i10 & 5) == 5 ? dp2 : dp;
        float f18 = (i10 & 6) == 6 ? dp2 : dp;
        float f19 = (i10 & 10) == 10 ? dp2 : dp;
        if ((i10 & 9) == 9) {
            dp = dp2;
        }
        rectF.set(f17, f18, f19, dp);
        if (omVar.f == null) {
            RectF rectF6 = new RectF();
            omVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (omVar.p == null) {
            RectF rectF7 = new RectF();
            omVar.p = rectF7;
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
        float f7;
        qm qmVar;
        char c10;
        char c11;
        Bitmap bitmap;
        float f10;
        boolean z11;
        float f11;
        float f12;
        float f13;
        String str;
        String str2;
        char c12;
        RectF rectF;
        float e = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        pm pmVar = this.O;
        qm qmVar2 = pmVar.z;
        rm rmVar = qmVar2.P;
        float f14 = qmVar2.P.J == this ? qmVar2.G : 0.0f;
        float lerp = AndroidUtilities.lerp(this.j, this.k, e);
        if (lerp <= 0.0f) {
            return false;
        }
        RectF d = d();
        float dp = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        RectF rectF2 = this.q;
        float f15 = rectF2.left;
        float f16 = rectF2.top;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        if (e < 1.0f && (rectF = this.p) != null) {
            f15 = AndroidUtilities.lerp(rectF.left, f15, e);
            f16 = AndroidUtilities.lerp(this.p.top, f16, e);
            f17 = AndroidUtilities.lerp(this.p.right, f17, e);
            f18 = AndroidUtilities.lerp(this.p.bottom, f18, e);
        }
        float lerp2 = AndroidUtilities.lerp(f15, dp, f14);
        float lerp3 = AndroidUtilities.lerp(f16, dp, f14);
        float lerp4 = AndroidUtilities.lerp(f17, dp, f14);
        float lerp5 = AndroidUtilities.lerp(f18, dp, f14);
        if (z10) {
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
            f7 = lerp3;
            qmVar = qmVar2;
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
                    f7 = lerp3;
                    path.addCircle(this.m, this.n, this.l * this.o, direction);
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    f7 = lerp3;
                }
                this.d.setRoundRadius(i10, i11, i12, i13);
                this.d.setImageCoords(d.left, d.top, d.width(), d.height());
                this.d.setAlpha(lerp);
                this.d.draw(canvas);
                if (this.s == null) {
                    this.s = vh.f.e(qmVar2);
                }
                vh.f fVar = this.s;
                int width = qmVar2.getWidth();
                int height = qmVar2.getHeight();
                qmVar = qmVar2;
                c10 = 3;
                c11 = 2;
                fVar.c(canvas, qmVar, width, height, 1.0f, false);
                canvas.restore();
                qmVar.invalidate();
                qmVar.invalidate();
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
            this.d.setRoundRadius(i10, i11, i12, i13);
            this.d.setImageCoords(d.left, d.top, d.width(), d.height());
            this.d.setAlpha(lerp);
            this.d.draw(canvas);
            if (this.s == null) {
            }
            vh.f fVar2 = this.s;
            int width2 = qmVar2.getWidth();
            int height2 = qmVar2.getHeight();
            qmVar = qmVar2;
            c10 = 3;
            c11 = 2;
            fVar2.c(canvas, qmVar, width2, height2, 1.0f, false);
            canvas.restore();
            qmVar.invalidate();
            qmVar.invalidate();
        }
        float f19 = this.w;
        String str3 = null;
        if (f19 != 1.0f && this.v != null) {
            fArr[1] = lerp2;
            fArr[0] = lerp2;
            fArr[c10] = f7;
            fArr[c11] = f7;
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
            qmVar.invalidate();
        } else if (f19 == 1.0f && (bitmap = this.v) != null) {
            bitmap.recycle();
            this.v = null;
            qmVar.invalidate();
        }
        int indexOf = pmVar.k.g.indexOf(this.b) + pmVar.b;
        if (indexOf >= 0) {
            str3 = (indexOf + 1) + "";
        }
        float f20 = this.c.getVisible() ? 1.0f : 0.0f;
        boolean z12 = Math.abs(this.M - f20) > 0.01f;
        if (z12) {
            long min2 = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
            this.N = SystemClock.elapsedRealtime();
            float f21 = min2 / 100.0f;
            float f22 = this.M;
            if (f20 < f22) {
                this.M = Math.max(0.0f, f22 - f21);
            } else {
                this.M = Math.min(1.0f, f22 + f21);
            }
        }
        float dp2 = d.top + AndroidUtilities.dp(10.0f);
        float dp3 = d.right - AndroidUtilities.dp(10.0f);
        float f23 = this.M * lerp;
        int dp4 = AndroidUtilities.dp(12.0f);
        int dp5 = AndroidUtilities.dp(1.2f);
        int i15 = (dp4 + dp5) * 2;
        int i16 = dp5 * 4;
        Rect rect = this.I;
        if (str3 == null || !(this.E == null || (str2 = this.F) == null || !str2.equals(str3))) {
            f10 = dp2;
            z11 = z12;
            f11 = dp3;
            f12 = f23;
        } else {
            if (this.E == null) {
                this.E = Bitmap.createBitmap(i15, i15, Bitmap.Config.ARGB_8888);
            }
            f10 = dp2;
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
            int i17 = org.telegram.ui.ActionBar.h6.V9;
            f11 = dp3;
            textPaint2.setColor(org.telegram.ui.ActionBar.h6.v0(i17, rmVar.a));
            int length = str3.length();
            float f24 = (length == 0 || length == 1 || length == 2) ? 14.0f : length != 3 ? 8.0f : 10.0f;
            this.B.setTextSize(AndroidUtilities.dp(f24));
            float f25 = i15 / 2.0f;
            f12 = f23;
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W9, rmVar.a);
            Paint paint2 = this.z;
            paint2.setColor(v02);
            float f26 = (int) f25;
            float f27 = dp4;
            canvas2.drawCircle(f26, f26, f27, paint2);
            int offsetColor = AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.h6.v0(i17, rmVar.a), 1.0f, 1.0f);
            Paint paint3 = this.A;
            paint3.setColor(offsetColor);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(dp5);
            canvas2.drawCircle(f26, f26, f27, paint3);
            canvas2.drawText(str3, f25 - (this.B.measureText(str3) / 2.0f), f25 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f24 / 4.0f), this.B);
            rect.set(0, 0, i15, i15);
            this.F = str3;
        }
        Bitmap bitmap2 = this.E;
        Paint paint4 = this.D;
        if (bitmap2 != null) {
            float f28 = i15 * lerp;
            float f29 = i16;
            int i18 = (int) ((f11 - f28) + f29);
            float f30 = f10 - f29;
            int i19 = (int) (f30 + f28);
            Rect rect2 = this.J;
            rect2.set(i18, (int) f30, (int) (f11 + f29), i19);
            paint4.setAlpha((int) (f12 * 255.0f));
            canvas.drawBitmap(this.E, rect, rect2, paint4);
        }
        float dp6 = d.left + AndroidUtilities.dp(4.0f);
        float dp7 = d.bottom - AndroidUtilities.dp(4.0f);
        String str4 = this.r;
        float f31 = this.M * lerp;
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
                float intrinsicWidth = rmVar.N.getIntrinsicWidth() + this.C.measureText(str4) + AndroidUtilities.dp(15.0f);
                Drawable drawable = rmVar.N;
                float max = Math.max(dp8, AndroidUtilities.dp(4.0f) + rmVar.N.getIntrinsicHeight());
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
                f13 = f31;
                Canvas canvas3 = new Canvas(this.G);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, intrinsicWidth, max);
                canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.i2);
                int dp9 = AndroidUtilities.dp(5.0f);
                int intrinsicHeight = (int) ((max - drawable.getIntrinsicHeight()) / 2.0f);
                drawable.setBounds(dp9, intrinsicHeight, drawable.getIntrinsicWidth() + dp9, drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.draw(canvas3);
                canvas3.drawText(str4, AndroidUtilities.dp(18.0f), dp8 + AndroidUtilities.dp(-0.7f), this.C);
                rect3.set(0, 0, ceil, ceil2);
                this.H = str4;
            } else {
                f13 = f31;
            }
            int width3 = this.G.getWidth();
            Rect rect4 = this.L;
            rect4.set((int) dp6, (int) (dp7 - (this.G.getHeight() * lerp)), (int) ((width3 * lerp) + dp6), (int) dp7);
            paint4.setAlpha((int) (f13 * 255.0f));
            canvas.drawBitmap(this.G, rect3, rect4, paint4);
        }
        if (z10) {
            canvas.restore();
        }
        return e < 1.0f || z11;
    }

    public final Object clone() {
        om omVar = new om(this.O);
        omVar.g.set(this.g);
        omVar.c = this.c;
        omVar.b = this.b;
        return omVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        qm qmVar = this.O.z;
        om omVar = qmVar.P.J;
        if (omVar != null && omVar.b == this.b) {
            f7 = qmVar.G;
        }
        float lerp = (((1.0f - f7) * 0.2f) + 0.8f) * AndroidUtilities.lerp(this.j, this.k, e());
        RectF f10 = f(e());
        float f11 = 1.0f - lerp;
        float f12 = lerp + 1.0f;
        f10.set(a4.a.B(f10.width(), f11, 2.0f, f10.left), ((f10.height() * f11) / 2.0f) + f10.top, a4.a.B(f10.width(), f12, 2.0f, f10.left), ((f10.height() * f12) / 2.0f) + f10.top);
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
        pm pmVar = this.O;
        float f10 = (rectF3.left * pmVar.r) + pmVar.n;
        float f11 = (rectF3.top * pmVar.s) + pmVar.p;
        float width = rectF3.width() * pmVar.r;
        float height = rectF3.height() * pmVar.s;
        if (f7 < 1.0f && (rectF = this.f) != null) {
            f10 = AndroidUtilities.lerp((rectF.left * pmVar.r) + pmVar.n, f10, f7);
            f11 = AndroidUtilities.lerp((this.f.top * pmVar.s) + pmVar.p, f11, f7);
            width = AndroidUtilities.lerp(this.f.width() * pmVar.r, width, f7);
            height = AndroidUtilities.lerp(this.f.height() * pmVar.s, height, f7);
        }
        int i10 = this.i;
        if ((i10 & 4) == 0) {
            int i11 = pmVar.m;
            f11 += i11;
            height -= i11;
        }
        if ((i10 & 8) == 0) {
            height -= pmVar.m;
        }
        if ((i10 & 1) == 0) {
            int i12 = pmVar.m;
            f10 += i12;
            width -= i12;
        }
        if ((i10 & 2) == 0) {
            width -= pmVar.m;
        }
        rectF2.set(f10, f11, width + f10, height + f11);
        return rectF2;
    }
}
