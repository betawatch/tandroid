package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class tf0 implements vf0 {
    public Bitmap a;
    public Canvas b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ wf0 i;

    public tf0(wf0 wf0Var) {
        this.i = wf0Var;
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

    @Override // org.telegram.ui.Components.vf0
    public final void b(ax axVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        wf0 wf0Var = (wf0) axVar.b;
        wf0 wf0Var2 = this.i;
        Paint paint = wf0Var2.a;
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int a10 = (int) ((1.0f - ((c8.j9.a(wf0Var2.f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
        float width = (wf0Var2.getWidth() - this.f) / 2.0f;
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
        if (a10 != 255) {
            this.a.eraseColor(0);
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            float f10 = -width;
            this.b.translate(f10, 0.0f);
            wf0.a(wf0Var, this.b);
            this.b.restore();
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            if (wf0Var2.n != null) {
                this.b.save();
                this.b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                org.telegram.messenger.bs bsVar = wf0Var2.n;
                if (bsVar.c) {
                    float min = Math.min(bsVar.e.width(), wf0Var2.n.e.height()) / 2.0f;
                    Canvas canvas3 = this.b;
                    float centerX = wf0Var2.n.e.centerX();
                    RectF rectF = wf0Var2.n.e;
                    canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, paint);
                } else if (bsVar.b) {
                    this.b.drawPath(bsVar.d, paint);
                } else {
                    float max = Math.max(bsVar.e.width(), wf0Var2.n.e.height()) / 2.0f;
                    this.b.drawRoundRect(wf0Var2.n.e, max, max, paint);
                }
                this.b.restore();
            } else {
                this.b.drawRect(0.0f, 0.0f, this.f, org.telegram.messenger.g0.L(32.0f), paint);
            }
            this.b.restore();
            Utilities.stackBlurBitmap(this.a, (int) ((wf0Var2.d * 2.0f) / 6.0f));
            canvas.save();
            canvas.translate(width, 0.0f);
            i7 = 255;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, this.g, this.h, null);
            canvas2.scale(this.g / this.a.getWidth(), this.h / this.a.getHeight());
            canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.c);
            canvas2.drawBitmap(this.a, 0.0f, 0.0f, this.d);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            i7 = 255;
        }
        if (a10 != 0) {
            if (a10 != i7) {
                i10 = a10;
                canvas2.saveLayerAlpha(width, 0.0f, width + this.f, this.e, i10);
            } else {
                i10 = a10;
            }
            wf0.a(wf0Var, canvas2);
            if (i10 != i7) {
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.vf0
    public final void d(int i7, int i10) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.recycle();
            this.a = null;
        }
        this.f = Math.min(org.telegram.messenger.g0.L(120.0f), i7);
        int min = Math.min(org.telegram.messenger.g0.L(220.0f), i10);
        this.e = min;
        this.g = this.f;
        int L = org.telegram.messenger.g0.L(32.0f) + min;
        this.h = L;
        this.a = Bitmap.createBitmap((int) (this.g / 6.0f), (int) (L / 6.0f), Bitmap.Config.ARGB_8888);
        this.b = new Canvas(this.a);
    }

    @Override // org.telegram.ui.Components.vf0
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.Components.vf0
    public final /* synthetic */ void c(float f10) {
    }
}
