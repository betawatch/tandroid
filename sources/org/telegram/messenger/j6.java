package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j6 extends g6 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public f6 c;
    public boolean d;

    @Override // org.telegram.messenger.g6
    public final boolean a() {
        Bitmap[][] bitmapArr = k6.f;
        f6 f6Var = this.c;
        return bitmapArr[f6Var.a][f6Var.b] != null;
    }

    @Override // org.telegram.messenger.g6
    public final void b() {
        if (a()) {
            return;
        }
        f6 f6Var = this.c;
        k6.i(f6Var.a, f6Var.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        boolean z10 = this.d;
        f6 f6Var = this.c;
        if (!a()) {
            k6.i(f6Var.a, f6Var.b);
            Paint paint = k6.d;
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
            int i10 = z11 ? k6.c : k6.b;
            bounds = f;
            bounds.left = centerX - (i10 / 2);
            bounds.right = ((z11 ? k6.c : k6.b) / 2) + centerX;
            bounds.top = centerY - ((z11 ? k6.c : k6.b) / 2);
            bounds.bottom = ((z11 ? k6.c : k6.b) / 2) + centerY;
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
        canvas.drawBitmap(k6.f[f6Var.a][f6Var.b], (Rect) null, bounds, e);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
