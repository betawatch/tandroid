package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class i6 extends f6 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public e6 c;
    public boolean d;

    @Override // org.telegram.messenger.f6
    public final boolean a() {
        Bitmap[][] bitmapArr = j6.f;
        e6 e6Var = this.c;
        return bitmapArr[e6Var.a][e6Var.b] != null;
    }

    @Override // org.telegram.messenger.f6
    public final void b() {
        if (a()) {
            return;
        }
        e6 e6Var = this.c;
        j6.i(e6Var.a, e6Var.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        boolean z10 = this.d;
        e6 e6Var = this.c;
        if (!a()) {
            j6.i(e6Var.a, e6Var.b);
            Paint paint = j6.d;
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
            int i7 = z11 ? j6.c : j6.b;
            bounds = f;
            bounds.left = centerX - (i7 / 2);
            bounds.right = ((z11 ? j6.c : j6.b) / 2) + centerX;
            bounds.top = centerY - ((z11 ? j6.c : j6.b) / 2);
            bounds.bottom = ((z11 ? j6.c : j6.b) / 2) + centerY;
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
        canvas.drawBitmap(j6.f[e6Var.a][e6Var.b], (Rect) null, bounds, e);
        if (z10) {
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
