// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fw3 extends cw3 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public bw3 c;
    public boolean d;

    @Override // cw3
    public final boolean a() {
        Bitmap[][] bitmapArr = gw3.f;
        bw3 bw3Var = this.c;
        return bitmapArr[bw3Var.a][bw3Var.b] != null;
    }

    @Override // cw3
    public final void b() {
        if (a()) {
            return;
        }
        bw3 bw3Var = this.c;
        gw3.i(bw3Var.a, bw3Var.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        boolean z = this.d;
        bw3 bw3Var = this.c;
        if (!a()) {
            gw3.i(bw3Var.a, bw3Var.b);
            Paint paint = gw3.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z2 = this.a;
            int i = z2 ? gw3.c : gw3.b;
            bounds = f;
            bounds.left = centerX - (i / 2);
            bounds.right = ((z2 ? gw3.c : gw3.b) / 2) + centerX;
            bounds.top = centerY - ((z2 ? gw3.c : gw3.b) / 2);
            bounds.bottom = ((z2 ? gw3.c : gw3.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        if (z) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
        }
        canvas.drawBitmap(gw3.f[bw3Var.a][bw3Var.b], (Rect) null, bounds, e);
        if (z) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
