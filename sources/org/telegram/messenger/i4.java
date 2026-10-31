package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i4 extends g6 {
    public static final Paint i = new Paint(2);
    public static final Rect j = new Rect();
    public j4 c;
    public j4 d;
    public org.telegram.ui.Components.t5 e;
    public org.telegram.ui.Components.t5 f;
    public j4 g;
    public j4 h;

    public static void c(Canvas canvas, j4 j4Var, Rect rect, float f7) {
        int i10;
        Bitmap bitmap = (Bitmap) j4.e.get(j4Var.c);
        if (bitmap != null) {
            Paint paint = j4Var.d ? k4.b : i;
            if (f7 < 1.0f) {
                i10 = paint.getAlpha();
                paint.setAlpha((int) (i10 * f7));
            } else {
                i10 = zs.e4;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (f7 < 1.0f) {
                paint.setAlpha(i10);
            }
        }
    }

    @Override // org.telegram.messenger.g6
    public final boolean a() {
        j4 j4Var = this.c;
        SparseArray sparseArray = j4.e;
        return sparseArray.indexOfKey(j4Var.c) >= 0 && sparseArray.indexOfKey(this.d.c) >= 0;
    }

    @Override // org.telegram.messenger.g6
    public final void b() {
        if (a()) {
            return;
        }
        this.c.a();
        this.d.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (!a()) {
            b();
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
            boolean z10 = this.a;
            int i10 = z10 ? k6.c : k6.b;
            bounds = j;
            bounds.left = centerX - (i10 / 2);
            bounds.right = ((z10 ? k6.c : k6.b) / 2) + centerX;
            bounds.top = centerY - ((z10 ? k6.c : k6.b) / 2);
            bounds.bottom = ((z10 ? k6.c : k6.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        if (this.g != null) {
            if (this.e == null) {
                this.e = new org.telegram.ui.Components.t5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.gr.g);
            }
            float e = this.e.e(false, 1.0f);
            c(canvas, this.g, bounds, Math.min(1.0f, e * 1.5f));
            c(canvas, this.c, bounds, 1.0f - e);
            if (e >= 1.0f) {
                this.c = this.g;
                this.g = null;
            }
        } else {
            c(canvas, this.c, bounds, 1.0f);
        }
        if (this.h == null) {
            c(canvas, this.d, bounds, 1.0f);
            return;
        }
        if (this.f == null) {
            this.f = new org.telegram.ui.Components.t5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.gr.g);
        }
        float e7 = this.f.e(false, 1.0f);
        c(canvas, this.h, bounds, Math.min(1.0f, 1.5f * e7));
        c(canvas, this.d, bounds, 1.0f - e7);
        if (e7 >= 1.0f) {
            this.d = this.h;
            this.h = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        i.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
