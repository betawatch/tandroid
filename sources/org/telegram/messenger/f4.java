package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f4 extends e6 {
    public static final Paint i = new Paint(2);
    public static final Rect j = new Rect();
    public g4 c;
    public g4 d;
    public org.telegram.ui.Components.w5 e;
    public org.telegram.ui.Components.w5 f;
    public g4 g;
    public g4 h;

    public static void c(Canvas canvas, g4 g4Var, Rect rect, float f10) {
        int i7;
        Bitmap bitmap = (Bitmap) g4.e.get(g4Var.c);
        if (bitmap != null) {
            Paint paint = g4Var.d ? h4.b : i;
            if (f10 < 1.0f) {
                i7 = paint.getAlpha();
                paint.setAlpha((int) (i7 * f10));
            } else {
                i7 = qs.e4;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (f10 < 1.0f) {
                paint.setAlpha(i7);
            }
        }
    }

    @Override // org.telegram.messenger.e6
    public final boolean a() {
        g4 g4Var = this.c;
        SparseArray sparseArray = g4.e;
        return sparseArray.indexOfKey(g4Var.c) >= 0 && sparseArray.indexOfKey(this.d.c) >= 0;
    }

    @Override // org.telegram.messenger.e6
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
            boolean z9 = this.a;
            int i7 = z9 ? i6.c : i6.b;
            bounds = j;
            bounds.left = centerX - (i7 / 2);
            bounds.right = ((z9 ? i6.c : i6.b) / 2) + centerX;
            bounds.top = centerY - ((z9 ? i6.c : i6.b) / 2);
            bounds.bottom = ((z9 ? i6.c : i6.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        if (this.g != null) {
            if (this.e == null) {
                this.e = new org.telegram.ui.Components.w5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.xq.g);
            }
            float e10 = this.e.e(false, 1.0f);
            c(canvas, this.g, bounds, Math.min(1.0f, e10 * 1.5f));
            c(canvas, this.c, bounds, 1.0f - e10);
            if (e10 >= 1.0f) {
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
            this.f = new org.telegram.ui.Components.w5(0.0f, new a(this, 4), 0L, 320L, org.telegram.ui.Components.xq.g);
        }
        float e11 = this.f.e(false, 1.0f);
        c(canvas, this.h, bounds, Math.min(1.0f, 1.5f * e11));
        c(canvas, this.d, bounds, 1.0f - e11);
        if (e11 >= 1.0f) {
            this.d = this.h;
            this.h = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        i.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
