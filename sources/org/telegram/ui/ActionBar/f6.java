package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f6 extends Drawable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public Object d;

    public f6(int i10, int i11, int i12) {
        this.b = i10;
        this.c = i12;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i10);
        paint.setColor(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.c / 2.0f, (Paint) this.d);
                break;
            default:
                Rect bounds2 = getBounds();
                int i11 = this.c;
                int i12 = this.b;
                if (i12 != 7) {
                    if (i12 == 1 || i12 == 6) {
                        if (i11 <= 0) {
                            i11 = org.telegram.messenger.i0.L(20.0f);
                        }
                        i10 = i11;
                    } else {
                        i10 = i12 == 3 ? Math.max(bounds2.width(), bounds2.height()) / 2 : (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                    canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i10, t6.z);
                    break;
                } else {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    float L = i11 <= 0 ? org.telegram.messenger.i0.L(6.0f) : i11;
                    canvas.drawRoundRect((RectF) this.d, L, L, t6.z);
                    break;
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return this.c + this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return this.c + this.b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setColorFilter(colorFilter);
                break;
        }
    }

    public f6(int i10, int i11) {
        this.b = i10;
        this.c = i11;
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
