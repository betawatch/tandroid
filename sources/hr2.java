// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hr2 extends lv3 {
    public static final Paint i = new Paint(2);
    public static final Rect j = new Rect();
    public ir2 c;
    public ir2 d;
    public mm e;
    public mm f;
    public ir2 g;
    public ir2 h;

    public static void c(Canvas canvas, ir2 ir2Var, Rect rect, float f) {
        int i2;
        Bitmap bitmap = (Bitmap) ir2.e.get(ir2Var.c);
        if (bitmap != null) {
            Paint paint = ir2Var.d ? jr2.b : i;
            if (f < 1.0f) {
                i2 = paint.getAlpha();
                paint.setAlpha((int) (i2 * f));
            } else {
                i2 = jn7.d4;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (f < 1.0f) {
                paint.setAlpha(i2);
            }
        }
    }

    @Override // lv3
    public final boolean a() {
        ir2 ir2Var = this.c;
        SparseArray sparseArray = ir2.e;
        return sparseArray.indexOfKey(ir2Var.c) >= 0 && sparseArray.indexOfKey(this.d.c) >= 0;
    }

    @Override // lv3
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
            Paint paint = pv3.d;
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
            int i2 = z ? pv3.c : pv3.b;
            bounds = j;
            bounds.left = centerX - (i2 / 2);
            bounds.right = ((z ? pv3.c : pv3.b) / 2) + centerX;
            bounds.top = centerY - ((z ? pv3.c : pv3.b) / 2);
            bounds.bottom = ((z ? pv3.c : pv3.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        Rect rect = bounds;
        if (canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        byte b = 13;
        if (this.g != null) {
            mm mmVar = this.e;
            if (mmVar == null) {
                mm mmVar2 = new mm(0.0f, new vd2(this, b), 0L, 320L, k43.g);
                this.e = mmVar2;
                mmVar = mmVar2;
            }
            float e = mmVar.e(false, 1.0f);
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
        mm mmVar3 = this.f;
        if (mmVar3 == null) {
            mm mmVar4 = new mm(0.0f, new vd2(this, b), 0L, 320L, k43.g);
            this.f = mmVar4;
            mmVar3 = mmVar4;
        }
        float e2 = mmVar3.e(false, 1.0f);
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
