package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wf0 implements yf0 {
    public Bitmap a;
    public Canvas b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ zf0 i;

    public wf0(zf0 zf0Var) {
        this.i = zf0Var;
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

    @Override // org.telegram.ui.Components.yf0
    public final void b(zw zwVar, Canvas canvas) {
        Canvas canvas2;
        int i3;
        int i10;
        zf0 zf0Var = (zf0) zwVar.b;
        zf0 zf0Var2 = this.i;
        Paint paint = zf0Var2.a;
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int a10 = (int) ((1.0f - ((b8.be.a(zf0Var2.f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
        float width = (zf0Var2.getWidth() - this.f) / 2.0f;
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
        if (a10 != 255) {
            this.a.eraseColor(0);
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            float f10 = -width;
            this.b.translate(f10, 0.0f);
            zf0.a(zf0Var, this.b);
            this.b.restore();
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            if (zf0Var2.n != null) {
                this.b.save();
                this.b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                org.telegram.messenger.tr trVar = zf0Var2.n;
                if (trVar.c) {
                    float min = Math.min(trVar.e.width(), zf0Var2.n.e.height()) / 2.0f;
                    Canvas canvas3 = this.b;
                    float centerX = zf0Var2.n.e.centerX();
                    RectF rectF = zf0Var2.n.e;
                    canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, paint);
                } else if (trVar.b) {
                    this.b.drawPath(trVar.d, paint);
                } else {
                    float max = Math.max(trVar.e.width(), zf0Var2.n.e.height()) / 2.0f;
                    this.b.drawRoundRect(zf0Var2.n.e, max, max, paint);
                }
                this.b.restore();
            } else {
                this.b.drawRect(0.0f, 0.0f, this.f, org.telegram.messenger.g0.L(32.0f), paint);
            }
            this.b.restore();
            Utilities.stackBlurBitmap(this.a, (int) ((zf0Var2.d * 2.0f) / 6.0f));
            canvas.save();
            canvas.translate(width, 0.0f);
            i3 = 255;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, this.g, this.h, null);
            canvas2.scale(this.g / this.a.getWidth(), this.h / this.a.getHeight());
            canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.c);
            canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.d);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            i3 = 255;
        }
        if (a10 != 0) {
            if (a10 != i3) {
                i10 = a10;
                canvas2.saveLayerAlpha(width, 0.0f, width + this.f, this.e, i10);
            } else {
                i10 = a10;
            }
            zf0.a(zf0Var, canvas2);
            if (i10 != i3) {
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.yf0
    public final void d(int i3, int i10) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.recycle();
            this.a = null;
        }
        this.f = Math.min(org.telegram.messenger.g0.L(120.0f), i3);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.e = min;
        this.g = this.f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.a = Bitmap.createBitmap((int) (this.g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
    }

    @Override // org.telegram.ui.Components.yf0
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.Components.yf0
    public final /* synthetic */ void c(float f10) {
    }
}
