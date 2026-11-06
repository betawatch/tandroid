package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h6 extends e6 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public d6 c;
    public boolean d;

    @Override // org.telegram.messenger.e6
    public final boolean a() {
        Bitmap[][] bitmapArr = i6.f;
        d6 d6Var = this.c;
        return bitmapArr[d6Var.a][d6Var.b] != null;
    }

    @Override // org.telegram.messenger.e6
    public final void b() {
        if (a()) {
            return;
        }
        d6 d6Var = this.c;
        i6.i(d6Var.a, d6Var.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        boolean z9 = this.d;
        d6 d6Var = this.c;
        if (!a()) {
            i6.i(d6Var.a, d6Var.b);
            Paint paint = i6.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z10 = this.a;
            int i7 = z10 ? i6.c : i6.b;
            bounds = f;
            bounds.left = centerX - (i7 / 2);
            bounds.right = ((z10 ? i6.c : i6.b) / 2) + centerX;
            bounds.top = centerY - ((z10 ? i6.c : i6.b) / 2);
            bounds.bottom = ((z10 ? i6.c : i6.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        if (z9) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
        }
        canvas.drawBitmap(i6.f[d6Var.a][d6Var.b], (Rect) null, bounds, e);
        if (z9) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        e.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
