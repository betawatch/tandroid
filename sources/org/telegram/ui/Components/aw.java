package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class aw extends Drawable {
    public final /* synthetic */ int a;
    public RectF b;
    public Paint c;

    public /* synthetic */ aw(int i10, byte b10) {
        this.a = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f), this.c);
                break;
            case 1:
                RectF rectF2 = this.b;
                rectF2.set(getBounds());
                float height = rectF2.height() * 0.2f;
                canvas.drawRoundRect(rectF2, height, height, this.c);
                break;
            case 2:
                RectF rectF3 = this.b;
                rectF3.set(getBounds());
                rectF3.inset(AndroidUtilities.dp(1.0f), (rectF3.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.c);
                break;
            default:
                RectF rectF4 = this.b;
                rectF4.set(getBounds());
                rectF4.inset(0.0f, (rectF4.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.c);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i10);
                break;
            case 1:
                this.c.setAlpha(i10);
                break;
            case 2:
                this.c.setAlpha(i10);
                break;
            default:
                this.c.setAlpha(i10);
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

    public aw() {
        this.a = 1;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public aw(int i10) {
        this.a = 0;
        Paint paint = new Paint();
        this.c = paint;
        this.b = new RectF();
        paint.setAlpha(45);
        paint.setColor(i10);
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
