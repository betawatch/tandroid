package ai;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import ci.lc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w2 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final lc e;
    public boolean f;
    public s g;
    public v2 h;
    public boolean i;

    public w2(int i3) {
        this(i0.a.o(i3, 128), i3);
    }

    public final void a() {
        boolean z10 = this.e != null && this.i && org.telegram.messenger.lc.e(131072);
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        if (z10) {
            cg.j d = cg.j.d();
            s sVar = new s(this, 5);
            this.g = sVar;
            d.a(15, sVar);
        } else {
            cg.j.d().f(this.g);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        lc lcVar = this.e;
        if (lcVar != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    lcVar.d();
                }
                lcVar.a(canvas, this.a);
                canvas.restore();
                if (this.g == null) {
                    invalidateSelf();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = Math.min(rect.width(), rect.height()) / 2.0f;
        RectF rectF = this.b;
        rectF.set(rect);
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        lc lcVar = this.e;
        if (lcVar != null) {
            lcVar.g(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.d.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public w2(int i3, int i10) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i3;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new lc(1, 25);
        } else {
            this.e = null;
        }
    }
}
