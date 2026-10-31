package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vg0 implements xg0 {
    public Bitmap a;
    public Canvas b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ yg0 i;

    public vg0(yg0 yg0Var) {
        this.i = yg0Var;
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

    @Override // org.telegram.ui.Components.xg0
    public final void b(px pxVar, Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        yg0 yg0Var = (yg0) pxVar.b;
        yg0 yg0Var2 = this.i;
        Paint paint = yg0Var2.a;
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int a2 = (int) ((1.0f - ((w7.u.a(yg0Var2.f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
        float width = (yg0Var2.getWidth() - this.f) / 2.0f;
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.i0.L(32.0f));
        if (a2 != 255) {
            this.a.eraseColor(0);
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            float f7 = -width;
            this.b.translate(f7, 0.0f);
            yg0.a(yg0Var, this.b);
            this.b.restore();
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            if (yg0Var2.n != null) {
                this.b.save();
                this.b.translate(f7, org.telegram.messenger.i0.L(32.0f));
                org.telegram.messenger.ks ksVar = yg0Var2.n;
                if (ksVar.c) {
                    float min = Math.min(ksVar.e.width(), yg0Var2.n.e.height()) / 2.0f;
                    Canvas canvas3 = this.b;
                    float centerX = yg0Var2.n.e.centerX();
                    RectF rectF = yg0Var2.n.e;
                    canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, paint);
                } else if (ksVar.b) {
                    this.b.drawPath(ksVar.d, paint);
                } else {
                    float max = Math.max(ksVar.e.width(), yg0Var2.n.e.height()) / 2.0f;
                    this.b.drawRoundRect(yg0Var2.n.e, max, max, paint);
                }
                this.b.restore();
            } else {
                this.b.drawRect(0.0f, 0.0f, this.f, org.telegram.messenger.i0.L(32.0f), paint);
            }
            this.b.restore();
            Utilities.stackBlurBitmap(this.a, (int) ((yg0Var2.d * 2.0f) / 6.0f));
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
            yg0.a(yg0Var, canvas2);
            if (i11 != i10) {
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.xg0
    public final void d(int i10, int i11) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.recycle();
            this.a = null;
        }
        this.f = Math.min(org.telegram.messenger.i0.L(120.0f), i10);
        int min = Math.min(org.telegram.messenger.i0.L(220.0f), i11);
        this.e = min;
        this.g = this.f;
        int L = org.telegram.messenger.i0.L(32.0f) + min;
        this.h = L;
        this.a = Bitmap.createBitmap((int) (this.g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
    }

    @Override // org.telegram.ui.Components.xg0
    public final /* synthetic */ void a(float f7) {
    }

    @Override // org.telegram.ui.Components.xg0
    public final /* synthetic */ void c(float f7) {
    }
}
