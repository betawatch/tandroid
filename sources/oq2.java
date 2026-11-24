// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oq2 extends ru3 {
    public static final Paint i = new Paint(2);
    public static final Rect j = new Rect();
    public pq2 c;
    public pq2 d;
    public lm e;
    public lm f;
    public pq2 g;
    public pq2 h;

    public static void c(Canvas canvas, pq2 pq2Var, Rect rect, float f) {
        int i2;
        Bitmap bitmap = (Bitmap) pq2.e.get(pq2Var.c);
        if (bitmap != null) {
            Paint paint = pq2Var.d ? qq2.b : i;
            if (f < 1.0f) {
                i2 = paint.getAlpha();
                paint.setAlpha((int) (i2 * f));
            } else {
                i2 = kk7.d4;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (f < 1.0f) {
                paint.setAlpha(i2);
            }
        }
    }

    @Override // ru3
    public final boolean a() {
        pq2 pq2Var = this.c;
        SparseArray sparseArray = pq2.e;
        return sparseArray.indexOfKey(pq2Var.c) >= 0 && sparseArray.indexOfKey(this.d.c) >= 0;
    }

    @Override // ru3
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
            Paint paint = vu3.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z = this.a;
            int i2 = z ? vu3.c : vu3.b;
            bounds = j;
            bounds.left = centerX - (i2 / 2);
            bounds.right = ((z ? vu3.c : vu3.b) / 2) + centerX;
            bounds.top = centerY - ((z ? vu3.c : vu3.b) / 2);
            bounds.bottom = ((z ? vu3.c : vu3.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        Rect rect = bounds;
        if (canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        byte b = 7;
        if (this.g != null) {
            lm lmVar = this.e;
            if (lmVar == null) {
                lm lmVar2 = new lm(0.0f, new mk2(this, b), 0L, 320L, s33.g);
                this.e = lmVar2;
                lmVar = lmVar2;
            }
            float e = lmVar.e(false, 1.0f);
            c(canvas, this.g, rect, Math.min(1.0f, e * 1.5f));
            c(canvas, this.c, rect, 1.0f - e);
            if (e >= 1.0f) {
                this.c = this.g;
                this.g = null;
            }
        } else {
            c(canvas, this.c, rect, 1.0f);
        }
        if (this.h == null) {
            c(canvas, this.d, rect, 1.0f);
            return;
        }
        lm lmVar3 = this.f;
        if (lmVar3 == null) {
            lm lmVar4 = new lm(0.0f, new mk2(this, b), 0L, 320L, s33.g);
            this.f = lmVar4;
            lmVar3 = lmVar4;
        }
        float e2 = lmVar3.e(false, 1.0f);
        c(canvas, this.h, rect, Math.min(1.0f, 1.5f * e2));
        c(canvas, this.d, rect, 1.0f - e2);
        if (e2 >= 1.0f) {
            this.d = this.h;
            this.h = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        i.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
