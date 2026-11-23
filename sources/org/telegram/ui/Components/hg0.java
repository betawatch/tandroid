package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hg0 implements jg0 {
    public Bitmap a;
    public Canvas b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ kg0 i;

    public hg0(kg0 kg0Var) {
        this.i = kg0Var;
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

    @Override // org.telegram.ui.Components.jg0
    public final void c(hy hyVar, Canvas canvas) {
        Canvas canvas2;
        int i7;
        int i10;
        kg0 kg0Var = (kg0) hyVar.b;
        kg0 kg0Var2 = this.i;
        Paint paint = kg0Var2.a;
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        int a10 = (int) ((1.0f - ((c8.m9.a(kg0Var2.f, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
        float width = (kg0Var2.getWidth() - this.f) / 2.0f;
        canvas.save();
        canvas.translate(0.0f, -org.telegram.messenger.g0.L(32.0f));
        if (a10 != 255) {
            this.a.eraseColor(0);
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            float f10 = -width;
            this.b.translate(f10, 0.0f);
            kg0.a(kg0Var, this.b);
            this.b.restore();
            this.b.save();
            this.b.scale(this.a.getWidth() / this.g, this.a.getHeight() / this.h);
            if (kg0Var2.n != null) {
                this.b.save();
                this.b.translate(f10, org.telegram.messenger.g0.L(32.0f));
                bi.d2 d2Var = kg0Var2.n;
                if (d2Var.c) {
                    float min = Math.min(((RectF) d2Var.e).width(), ((RectF) kg0Var2.n.e).height()) / 2.0f;
                    Canvas canvas3 = this.b;
                    float centerX = ((RectF) kg0Var2.n.e).centerX();
                    RectF rectF = (RectF) kg0Var2.n.e;
                    canvas3.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, paint);
                } else if (d2Var.b) {
                    this.b.drawPath((Path) d2Var.d, paint);
                } else {
                    float max = Math.max(((RectF) d2Var.e).width(), ((RectF) kg0Var2.n.e).height()) / 2.0f;
                    this.b.drawRoundRect((RectF) kg0Var2.n.e, max, max, paint);
                }
                this.b.restore();
            } else {
                this.b.drawRect(0.0f, 0.0f, this.f, org.telegram.messenger.g0.L(32.0f), paint);
            }
            this.b.restore();
            Utilities.stackBlurBitmap(this.a, (int) ((kg0Var2.d * 2.0f) / 6.0f));
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
            kg0.a(kg0Var, canvas2);
            if (i10 != i7) {
                canvas2.restore();
            }
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.jg0
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

    @Override // org.telegram.ui.Components.jg0
    public final /* synthetic */ void a(float f10) {
    }

    @Override // org.telegram.ui.Components.jg0
    public final /* synthetic */ void b(float f10) {
    }
}
