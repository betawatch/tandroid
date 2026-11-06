package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class zu extends Drawable {
    public final /* synthetic */ int a;
    public RectF b;
    public Paint c;

    public zu(int i7, byte b10) {
        this.a = i7;
        switch (i7) {
            case 2:
                break;
            default:
                this.b = new RectF();
                this.c = new Paint(1);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(30.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f), this.c);
                break;
            case 1:
                RectF rectF2 = this.b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.c);
                break;
            default:
                RectF rectF3 = this.b;
                rectF3.set(getBounds());
                rectF3.inset(0.0f, (rectF3.height() - org.telegram.messenger.g0.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.c);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -3;
            case 1:
                return -3;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i7);
                break;
            case 1:
                this.c.setAlpha(i7);
                break;
            default:
                this.c.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 1:
                this.c.setColorFilter(colorFilter);
                break;
        }
    }

    public zu(int i7) {
        this.a = 0;
        Paint paint = new Paint();
        this.c = paint;
        this.b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i7);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
