package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m0 extends Drawable {
    public final /* synthetic */ int a;
    public Object b;
    public int c;

    public m0(int i9) {
        this.a = i9;
        switch (i9) {
            case 2:
                this.c = 255;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, (Paint) this.b);
                break;
            case 1:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.b);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 2:
                return this.c;
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        switch (this.a) {
            case 2:
                return (ColorFilter) this.b;
            default:
                return super.getColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return this.c;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return this.c;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            case 1:
                return -2;
            default:
                return -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                ((Paint) this.b).setAlpha(org.telegram.ui.ActionBar.f6.l1(i9 / 255.0f, this.c));
                break;
            case 1:
                ((Paint) this.b).setAlpha(i9);
                break;
            default:
                this.c = i9;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((Paint) this.b).setColorFilter(colorFilter);
                break;
            case 1:
                break;
            default:
                this.b = colorFilter;
                break;
        }
    }

    public m0(Paint paint, int i9) {
        this.a = 0;
        this.b = paint;
        this.c = i9;
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
