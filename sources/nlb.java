// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nlb extends Drawable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public nlb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int max = Math.max(bounds.width(), bounds.height()) / 2;
        int i = this.a;
        int i2 = this.b;
        canvas.drawCircle((bounds.centerX() - i) + i2, bounds.centerY(), max + i + i2, cmb.z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
