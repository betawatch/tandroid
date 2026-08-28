package ch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import g7.n;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public final a b;
    public Bitmap c;
    public Canvas d;
    public int e;
    public float f;
    public int g;
    public int h;
    public final Paint a = new Paint(2);
    public int i = 255;

    public b(a aVar) {
        this.b = aVar;
    }

    public final void a(int i9, int i10, float f10, int i11) {
        int i12 = i11 * 2;
        int i13 = (int) ((i9 + i12) / f10);
        int i14 = (int) ((i10 + i12) / f10);
        Bitmap bitmap = this.c;
        if (bitmap != null && bitmap.getWidth() == i13 && this.c.getHeight() == i14) {
            this.c.eraseColor(0);
        } else {
            Bitmap bitmap2 = this.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.c = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
            this.d = new Canvas(this.c);
        }
        this.f = f10;
        this.e = i11;
        this.d.save();
        float f11 = i11 / f10;
        this.d.translate(f11, f11);
        float f12 = 1.0f / f10;
        this.d.scale(f12, f12);
        this.b.l(this.d, 255);
        Utilities.stackBlurBitmap(this.c, (int) f11);
        this.d.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9 = this.i;
        a aVar = this.b;
        if (i9 == 255) {
            canvas.save();
            canvas.translate(this.g, this.h);
            aVar.l(canvas, 255);
            canvas.restore();
            return;
        }
        if (i9 == 0) {
            return;
        }
        double d = i9 / 255.0d;
        double d9 = d / ((1.0d - d) * 6.0d);
        double d10 = 1.0d + d9;
        double sqrt = ((-d10) + Math.sqrt((d10 * d10) - (((-d9) * 4.0d) * (-d)))) / ((-2.0d) * d9);
        int b10 = n.b((int) (d9 * sqrt * 255.0d), 0, 255);
        int b11 = n.b((int) (sqrt * 255.0d), 0, 255);
        if (b11 > 0 && this.c != null) {
            Paint paint = this.a;
            paint.setAlpha(b11);
            canvas.save();
            int i10 = this.g;
            int i11 = this.e;
            canvas.translate(i10 - i11, this.h - i11);
            float f10 = this.f;
            canvas.scale(f10, f10);
            canvas.drawBitmap(this.c, 0.0f, 0.0f, paint);
            canvas.restore();
        }
        if (b10 > 0) {
            canvas.save();
            canvas.translate(this.g, this.h);
            aVar.l(canvas, b10);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.i = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i9, int i10, int i11, int i12) {
        this.g = i9;
        this.h = i10;
        super.setBounds(i9, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
