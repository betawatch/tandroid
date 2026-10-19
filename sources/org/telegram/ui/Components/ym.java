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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ym {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ zm O;
    public zm a;
    public MediaController.PhotoEntry b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public wh.f s;
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

    public ym(zm zmVar) {
        this.O = zmVar;
        this.a = zmVar;
    }

    public static void a(ym ymVar, MediaController.PhotoEntry photoEntry) {
        zm zmVar = ymVar.O;
        ymVar.b = photoEntry;
        if (photoEntry.isVideo) {
            ymVar.r = AndroidUtilities.formatShortDuration(photoEntry.duration);
        } else {
            ymVar.r = null;
        }
        if (ymVar.c == null) {
            ymVar.c = new ImageReceiver(zmVar.z);
            ymVar.d = new ImageReceiver(zmVar.z);
            ymVar.c.setDelegate(new q2(11, ymVar, photoEntry));
        }
        String str = photoEntry.thumbPath;
        if (str != null) {
            ymVar.c.setImage(ImageLocation.getForPath(str), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
            return;
        }
        if (photoEntry.path == null) {
            ymVar.c.setImageBitmap(org.telegram.ui.ActionBar.h6.R4);
            return;
        }
        if (photoEntry.isVideo) {
            ymVar.c.setImage(ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
            ymVar.c.setAllowStartAnimation(true);
            return;
        }
        ymVar.c.setOrientation(photoEntry.orientation, true);
        ymVar.c.setImage(ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path), null, null, null, org.telegram.ui.ActionBar.h6.R4, 0L, null, null, 0);
    }

    public static void b(ym ymVar, um umVar, MessageObject.GroupedMessagePosition groupedMessagePosition, boolean z10) {
        RectF rectF = ymVar.q;
        RectF rectF2 = ymVar.g;
        if (umVar == null || groupedMessagePosition == null) {
            if (!z10) {
                ymVar.j = 0.0f;
                ymVar.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ymVar.j = AndroidUtilities.lerp(ymVar.j, ymVar.k, ymVar.e());
            RectF rectF3 = ymVar.f;
            if (rectF3 != null) {
                AndroidUtilities.lerp(rectF3, rectF2, ymVar.e(), ymVar.f);
            }
            ymVar.k = 0.0f;
            ymVar.h = elapsedRealtime;
            return;
        }
        ymVar.i = groupedMessagePosition.flags;
        if (z10) {
            float e = ymVar.e();
            RectF rectF4 = ymVar.f;
            if (rectF4 != null) {
                AndroidUtilities.lerp(rectF4, rectF2, e, rectF4);
            }
            RectF rectF5 = ymVar.p;
            if (rectF5 != null) {
                AndroidUtilities.lerp(rectF5, rectF, e, rectF5);
            }
            ymVar.j = AndroidUtilities.lerp(ymVar.j, ymVar.k, e);
            ymVar.h = SystemClock.elapsedRealtime();
        }
        float f7 = groupedMessagePosition.left;
        float f10 = umVar.c;
        float f11 = f7 / f10;
        float f12 = groupedMessagePosition.top;
        float f13 = umVar.f;
        float f14 = f12 / f13;
        float f15 = groupedMessagePosition.pw / f10;
        float f16 = groupedMessagePosition.ph / f13;
        ymVar.k = 1.0f;
        rectF2.set(f11, f14, f15 + f11, f16 + f14);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(SharedConfig.bubbleRadius - 1);
        int i10 = ymVar.i;
        float f17 = (i10 & 5) == 5 ? dp2 : dp;
        float f18 = (i10 & 6) == 6 ? dp2 : dp;
        float f19 = (i10 & 10) == 10 ? dp2 : dp;
        if ((i10 & 9) == 9) {
            dp = dp2;
        }
        rectF.set(f17, f18, f19, dp);
        if (ymVar.f == null) {
            RectF rectF6 = new RectF();
            ymVar.f = rectF6;
            rectF6.set(rectF2);
        }
        if (ymVar.p == null) {
            RectF rectF7 = new RectF();
            ymVar.p = rectF7;
            rectF7.set(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0502 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Canvas canvas, boolean z10) {
        float f7;
        an anVar;
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
        float e = e();
        if (this.g == null || this.c == null) {
            return false;
        }
        zm zmVar = this.O;
        an anVar2 = zmVar.z;
        bn bnVar = anVar2.P;
        float f17 = anVar2.P.J == this ? anVar2.G : 0.0f;
        float lerp = AndroidUtilities.lerp(this.j, this.k, e);
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
        if (e < 1.0f && (rectF = this.p) != null) {
            f18 = AndroidUtilities.lerp(rectF.left, f18, e);
            f19 = AndroidUtilities.lerp(this.p.top, f19, e);
            f20 = AndroidUtilities.lerp(this.p.right, f20, e);
            f21 = AndroidUtilities.lerp(this.p.bottom, f21, e);
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
            anVar = anVar2;
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
                        this.s = wh.f.e(anVar2);
                    }
                    wh.f fVar = this.s;
                    int width = anVar2.getWidth();
                    int height = anVar2.getHeight();
                    anVar = anVar2;
                    c10 = 3;
                    i10 = 2;
                    fVar.c(canvas, anVar, width, height, 1.0f, false);
                    canvas.restore();
                    anVar.invalidate();
                    anVar.invalidate();
                    f10 = this.w;
                    str = null;
                    if (f10 != 1.0f || this.v == null) {
                        i11 = i10;
                        f11 = 255.0f;
                        if (f10 == 1.0f && (bitmap = this.v) != null) {
                            bitmap.recycle();
                            this.v = null;
                            anVar.invalidate();
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
                        float c12 = org.telegram.ui.Cells.c1.c(Math.min(16L, SystemClock.elapsedRealtime() - this.h), 250.0f, this.w, 1.0f);
                        this.w = c12;
                        Paint paint = this.x;
                        paint.setAlpha((int) ((1.0f - c12) * 255.0f));
                        canvas.drawBitmap(this.v, d.left, d.top, paint);
                        canvas.restore();
                        anVar.invalidate();
                    }
                    indexOf = zmVar.k.g.indexOf(this.b) + zmVar.b;
                    if (indexOf >= 0) {
                        str = (indexOf + 1) + "";
                    }
                    float f22 = this.c.getVisible() ? 1.0f : 0.0f;
                    z11 = Math.abs(this.M - f22) > 0.01f;
                    if (z11) {
                        long min = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
                        this.N = SystemClock.elapsedRealtime();
                        float f23 = min / 100.0f;
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
                    int i16 = (dp4 + dp5) * 2;
                    int i17 = dp5 * 4;
                    float f25 = f11;
                    Rect rect = this.I;
                    if (str == null && (this.E == null || (str4 = this.F) == null || !str4.equals(str))) {
                        if (this.E == null) {
                            this.E = Bitmap.createBitmap(i16, i16, Bitmap.Config.ARGB_8888);
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
                        int i18 = org.telegram.ui.ActionBar.h6.V9;
                        f14 = dp2;
                        textPaint2.setColor(org.telegram.ui.ActionBar.h6.w0(i18, bnVar.a));
                        int length = str.length();
                        float f26 = (length == 0 || length == 1 || length == i11) ? 14.0f : length != 3 ? 8.0f : 10.0f;
                        this.B.setTextSize(AndroidUtilities.dp(f26));
                        float f27 = i16 / 2.0f;
                        f15 = f12;
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W9, bnVar.a);
                        Paint paint2 = this.z;
                        paint2.setColor(w02);
                        float f28 = (int) f27;
                        float f29 = dp4;
                        canvas2.drawCircle(f28, f28, f29, paint2);
                        int offsetColor = AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.h6.w0(i18, bnVar.a), 1.0f, 1.0f);
                        Paint paint3 = this.A;
                        paint3.setColor(offsetColor);
                        paint3.setStyle(Paint.Style.STROKE);
                        paint3.setStrokeWidth(dp5);
                        canvas2.drawCircle(f28, f28, f29, paint3);
                        canvas2.drawText(str, f27 - (this.B.measureText(str) / 2.0f), f27 + AndroidUtilities.dp(1.0f) + AndroidUtilities.dp(f26 / 4.0f), this.B);
                        rect.set(0, 0, i16, i16);
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
                        float f30 = i16 * lerp;
                        float f31 = i17;
                        int i19 = (int) ((f14 - f30) + f31);
                        float f32 = f13 - f31;
                        int i20 = (int) (f32 + f30);
                        Rect rect2 = this.J;
                        rect2.set(i19, (int) f32, (int) (f14 + f31), i20);
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
                            float intrinsicWidth = bnVar.N.getIntrinsicWidth() + this.C.measureText(str2) + AndroidUtilities.dp(15.0f);
                            Drawable drawable = bnVar.N;
                            float max = Math.max(dp8, AndroidUtilities.dp(4.0f) + bnVar.N.getIntrinsicHeight());
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
                            canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.h6.i2);
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
                    return e >= 1.0f || z12;
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
                wh.f fVar2 = this.s;
                int width3 = anVar2.getWidth();
                int height2 = anVar2.getHeight();
                anVar = anVar2;
                c10 = 3;
                i10 = 2;
                fVar2.c(canvas, anVar, width3, height2, 1.0f, false);
                canvas.restore();
                anVar.invalidate();
                anVar.invalidate();
                f10 = this.w;
                str = null;
                if (f10 != 1.0f) {
                }
                i11 = i10;
                f11 = 255.0f;
                if (f10 == 1.0f) {
                    bitmap.recycle();
                    this.v = null;
                    anVar.invalidate();
                }
                indexOf = zmVar.k.g.indexOf(this.b) + zmVar.b;
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
                int i162 = (dp42 + dp52) * 2;
                int i172 = dp52 * 4;
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
                if (e >= 1.0f) {
                    return true;
                }
            }
            f7 = lerp3;
            anVar = anVar2;
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
        indexOf = zmVar.k.g.indexOf(this.b) + zmVar.b;
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
        int i1622 = (dp422 + dp522) * 2;
        int i1722 = dp522 * 4;
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
        if (e >= 1.0f) {
        }
    }

    public final Object clone() {
        ym ymVar = new ym(this.O);
        ymVar.g.set(this.g);
        ymVar.c = this.c;
        ymVar.b = this.b;
        return ymVar;
    }

    public final RectF d() {
        float f7 = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        an anVar = this.O.z;
        ym ymVar = anVar.P.J;
        if (ymVar != null && ymVar.b == this.b) {
            f7 = anVar.G;
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
        zm zmVar = this.O;
        float f10 = (rectF3.left * zmVar.r) + zmVar.n;
        float f11 = (rectF3.top * zmVar.s) + zmVar.p;
        float width = rectF3.width() * zmVar.r;
        float height = rectF3.height() * zmVar.s;
        if (f7 < 1.0f && (rectF = this.f) != null) {
            f10 = AndroidUtilities.lerp((rectF.left * zmVar.r) + zmVar.n, f10, f7);
            f11 = AndroidUtilities.lerp((this.f.top * zmVar.s) + zmVar.p, f11, f7);
            width = AndroidUtilities.lerp(this.f.width() * zmVar.r, width, f7);
            height = AndroidUtilities.lerp(this.f.height() * zmVar.s, height, f7);
        }
        int i10 = this.i;
        if ((i10 & 4) == 0) {
            int i11 = zmVar.m;
            f11 += i11;
            height -= i11;
        }
        if ((i10 & 8) == 0) {
            height -= zmVar.m;
        }
        if ((i10 & 1) == 0) {
            int i12 = zmVar.m;
            f10 += i12;
            width -= i12;
        }
        if ((i10 & 2) == 0) {
            width -= zmVar.m;
        }
        rectF2.set(f10, f11, width + f10, height + f11);
        return rectF2;
    }
}
