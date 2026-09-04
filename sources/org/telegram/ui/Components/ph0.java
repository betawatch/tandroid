package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ph0 implements rh0 {
    public Bitmap a;
    public Canvas b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ sh0 i;

    public ph0(sh0 sh0Var) {
        this.i = sh0Var;
        Paint paint = new Paint();
        this.c = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        paint.setFlags(7);
        paint.setFilterBitmap(true);
        paint2.setFlags(7);
        paint2.setFilterBitmap(true);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
    }

    @Override // org.telegram.ui.Components.rh0
    public final void c(kv kvVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        sh0 sh0Var = (sh0) kvVar.b;
        sh0 sh0Var2 = this.i;
        Paint paint = sh0Var2.a;
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int a2 = (int) ((1.0f - ((w7.p.a(sh0Var2.f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
        float width = (sh0Var2.getWidth() - this.f) / 2.0f;
        canvas.save();
        canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
        if (a2 != 255) {
            this.a.eraseColor(0);
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            float f7 = -width;
            this.b.translate(f7, 0.0f);
            sh0.a(sh0Var, this.b);
            this.b.restore();
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            if (sh0Var2.n != null) {
                this.b.save();
                this.b.translate(f7, AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo = sh0Var2.n;
                if (notchInfo.isLikelyCircle) {
                    float min = Math.min(notchInfo.bounds.width(), sh0Var2.n.bounds.height()) / 2.0f;
                    Canvas canvas3 = this.b;
                    float centerX = sh0Var2.n.bounds.centerX();
                    RectF rectF = sh0Var2.n.bounds;
                    canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, paint);
                } else if (notchInfo.isAccurate) {
                    this.b.drawPath(notchInfo.path, paint);
                } else {
                    float max = Math.max(notchInfo.bounds.width(), sh0Var2.n.bounds.height()) / 2.0f;
                    this.b.drawRoundRect(sh0Var2.n.bounds, max, max, paint);
                }
                this.b.restore();
            } else {
                this.b.drawRect(0.0f, 0.0f, this.f, AndroidUtilities.dp(32.0f), paint);
            }
            this.b.restore();
            Utilities.stackBlurBitmap(this.a, (int) ((sh0Var2.d * 2.0f) / 6.0f));
            canvas.save();
            canvas.translate(width, 0.0f);
            i10 = 255;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, this.g, this.h, null);
            canvas2.scale(this.g / this.a.getWidth(), this.h / this.a.getHeight());
            canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.c);
            canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.d);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            i10 = 255;
        }
        if (a2 != 0) {
            if (a2 != i10) {
                i11 = a2;
                canvas2.saveLayerAlpha(width, 0.0f, width + this.f, this.e, i11);
            } else {
                i11 = a2;
            }
            sh0.a(sh0Var, canvas2);
            if (i11 != i10) {
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.rh0
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.recycle();
            this.a = null;
        }
        this.f = Math.min(AndroidUtilities.dp(120.0f), i10);
        int min = Math.min(AndroidUtilities.dp(220.0f), i11);
        this.e = min;
        this.g = this.f;
        int dp = AndroidUtilities.dp(32.0f) + min;
        this.h = dp;
        this.a = Bitmap.createBitmap((int) (this.g / 6.0f), (int) (dp / 6.0f), Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
    }

    @Override // org.telegram.ui.Components.rh0
    public final /* synthetic */ void a(float f7) {
    }

    @Override // org.telegram.ui.Components.rh0
    public final /* synthetic */ void b(float f7) {
    }
}
