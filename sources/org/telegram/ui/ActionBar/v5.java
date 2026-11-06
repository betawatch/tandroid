package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v5 extends Drawable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public Object d;

    public v5(int i7, int i10, int i11) {
        this.b = i7;
        this.c = i11;
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i7);
        paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7;
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.c / 2.0f, (Paint) this.d);
                break;
            default:
                Rect bounds2 = getBounds();
                int i10 = this.c;
                int i11 = this.b;
                if (i11 != 7) {
                    if (i11 == 1 || i11 == 6) {
                        if (i10 <= 0) {
                            i10 = org.telegram.messenger.g0.L(20.0f);
                        }
                        i7 = i10;
                    } else {
                        i7 = i11 == 3 ? Math.max(bounds2.width(), bounds2.height()) / 2 : (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                    }
                    canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), i7, k6.z);
                    break;
                } else {
                    if (((RectF) this.d) == null) {
                        this.d = new RectF();
                    }
                    ((RectF) this.d).set(bounds2);
                    float L = i10 <= 0 ? org.telegram.messenger.g0.L(6.0f) : i10;
                    canvas.drawRoundRect((RectF) this.d, L, L, k6.z);
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
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                ((Paint) this.d).setAlpha(i7);
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

    public v5(int i7, int i10) {
        this.b = i7;
        this.c = i10;
    }

    private final void a(int i7) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
