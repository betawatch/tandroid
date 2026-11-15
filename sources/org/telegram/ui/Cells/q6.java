package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q6 extends Drawable {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public q6(int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.b = ns.e4;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.c);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        switch (this.a) {
            case 1:
                return (ColorFilter) this.c;
            default:
                return super.getColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return this.b;
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
                return -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                ((Paint) this.c).setAlpha(i7);
                break;
            default:
                this.b = i7;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.c = colorFilter;
                break;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
