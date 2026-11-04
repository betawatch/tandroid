package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        boolean z10 = this.d;
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
            boolean z11 = this.a;
            int i3 = z11 ? i6.c : i6.b;
            bounds = f;
            bounds.left = centerX - (i3 / 2);
            bounds.right = ((z11 ? i6.c : i6.b) / 2) + centerX;
            bounds.top = centerY - ((z11 ? i6.c : i6.b) / 2);
            bounds.bottom = ((z11 ? i6.c : i6.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        if (z10) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
        }
        canvas.drawBitmap(i6.f[d6Var.a][d6Var.b], (Rect) null, bounds, e);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        e.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
