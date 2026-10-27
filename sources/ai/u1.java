package ai;

import a8.rc;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u1 extends Drawable {
    public static Path d;
    public final /* synthetic */ int a;
    public Bitmap b;
    public final Paint c;

    public /* synthetic */ u1(Bitmap bitmap, Paint paint, int i10) {
        this.a = i10;
        this.b = bitmap;
        this.c = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                if (!bounds.isEmpty()) {
                    Bitmap bitmap = this.b;
                    if (bitmap == null || bitmap.getWidth() != bounds.width() || this.b.getHeight() != bounds.height()) {
                        this.b = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
                        Path path = new Path();
                        Matrix matrix = new Matrix();
                        matrix.setScale(bounds.width() / 52.0f, bounds.height() / 52.0f);
                        if (d == null) {
                            d = rc.d("M25.0339 38.8535L16.4947 44.2223C15.6075 44.7802 14.4361 44.5131 13.8782 43.6258C13.6038 43.1893 13.5188 42.6601 13.6426 42.1598L15.0264 36.5704C15.4811 34.7334 16.7041 33.1809 18.3835 32.3088L26.359 28.1671C26.7894 27.9436 26.9572 27.4137 26.7337 26.9833C26.5595 26.6481 26.1903 26.4617 25.8172 26.5208L16.9312 27.9261C14.8088 28.2617 12.6463 27.6475 11.0173 26.2465L7.5978 23.3054C6.8032 22.622 6.71306 21.4239 7.39646 20.6293C7.7225 20.2503 8.18486 20.0153 8.68322 19.9753L18.8056 19.1622C19.5221 19.1046 20.1443 18.6473 20.4134 17.9809L24.2843 8.39097C24.6766 7.41912 25.7823 6.94929 26.7542 7.34157C27.232 7.53443 27.6108 7.91321 27.8037 8.39097L31.6745 17.9809C31.9435 18.6473 32.5659 19.1046 33.2822 19.1622L43.4582 19.9795C44.5029 20.0634 45.2817 20.9784 45.1978 22.023C45.1582 22.5159 44.9279 22.9737 44.5559 23.2992L36.7229 30.1527C36.1947 30.6149 35.9647 31.3308 36.125 32.0141L38.5201 42.2261C38.7594 43.2465 38.1263 44.2677 37.106 44.507C36.6119 44.6228 36.0921 44.536 35.6626 44.2659L27.054 38.8535C26.4366 38.4654 25.6513 38.4654 25.0339 38.8535Z");
                        }
                        d.transform(matrix, path);
                        Paint paint = new Paint(1);
                        paint.setColor(-1);
                        new Canvas(this.b).drawPath(path, paint);
                    }
                    canvas.drawBitmap(this.b, bounds.left, bounds.top, this.c);
                    break;
                }
                break;
            case 1:
                Bitmap bitmap2 = this.b;
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap2.getWidth(), getBounds().height() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, this.c);
                    canvas.restore();
                    break;
                }
                break;
            default:
                Bitmap bitmap3 = this.b;
                if (bitmap3 != null) {
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    canvas.scale(getBounds().width() / bitmap3.getWidth(), getBounds().height() / bitmap3.getHeight());
                    canvas.drawBitmap(bitmap3, 0.0f, 0.0f, this.c);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
        }
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
        }
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.c.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c.setColorFilter(colorFilter);
                break;
        }
    }

    public u1() {
        this.a = 0;
        this.c = new Paint(3);
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
