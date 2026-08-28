package fh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import gh.bb;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k2 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final bb e;
    public boolean f;
    public o1 g;
    public bg.i h;
    public boolean i;

    public k2(int i9) {
        this(i0.a.k(i9, 128), i9);
    }

    public final void a() {
        boolean z10 = this.e != null && this.i && LiteMode.isEnabled(131072);
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        if (z10) {
            ff.k d = ff.k.d();
            o1 o1Var = new o1(this, 2);
            this.g = o1Var;
            d.a(15, o1Var);
        } else {
            ff.k.d().g(this.g);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        bb bbVar = this.e;
        if (bbVar != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    bbVar.d();
                }
                bbVar.a(canvas, this.a);
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
        bb bbVar = this.e;
        if (bbVar != null) {
            bbVar.g(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.d.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public k2(int i9, int i10) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i9;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new bb(1, 25);
        } else {
            this.e = null;
        }
    }
}
