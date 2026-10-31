package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a6 extends Drawable {
    public final /* synthetic */ int a;
    public final Path b;
    public final Paint c;
    public final Object d;
    public final Object e;

    public a6(org.telegram.ui.m0 m0Var) {
        this.a = 1;
        this.e = m0Var;
        this.b = new Path();
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.d = new org.telegram.ui.Components.t5(new org.telegram.ui.ActionBar.w5(this, 18), 350L, gr.h, 0);
    }

    public void c() {
        invalidateSelf();
        ((org.telegram.ui.m0) this.e).O.setContentDescription(cd.L0(2131750588, null));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawPath(this.b, this.c);
                break;
            default:
                float d = ((org.telegram.ui.Components.t5) this.d).d(true);
                float centerX = getBounds().centerX();
                float centerY = getBounds().centerY();
                float width = getBounds().width();
                float f7 = 0.57f * width;
                Path path = this.b;
                path.rewind();
                float f10 = f7 / 2.0f;
                path.moveTo(centerX - org.telegram.messenger.i0.T1(f10, (-f7) / 2.0f, d), centerY);
                float f11 = f10 + centerX;
                path.lineTo(f11, centerY);
                float f12 = f11 - (0.27f * width);
                float f13 = (0.54f * width) / 2.0f;
                path.moveTo(f12, centerY - f13);
                path.lineTo(f11, centerY);
                path.lineTo(f12, f13 + centerY);
                canvas.save();
                float L = org.telegram.messenger.i0.L(2.0f);
                Paint paint = this.c;
                paint.setStrokeWidth(L);
                canvas.translate(0.0f, (-width) * 0.1f * d);
                canvas.rotate(d * 90.0f, centerX, centerY);
                canvas.drawPath(path, paint);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.i0.L(24.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -3;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.a) {
            case 0:
                super.onBoundsChange(rect);
                RectF rectF = (RectF) this.d;
                rectF.set(rect);
                Path path = this.b;
                path.reset();
                path.addRoundRect(rectF, (float[]) this.e, Path.Direction.CW);
                this.c.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{-16216082, -12207881}, new float[]{0.15f, 0.53f}, Shader.TileMode.CLAMP));
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i10);
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                invalidateSelf();
                break;
        }
    }

    public a6() {
        this.a = 0;
        this.c = new Paint(1);
        this.b = new Path();
        this.d = new RectF();
        this.e = new float[]{org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
