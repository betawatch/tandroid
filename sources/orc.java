// default package

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class orc extends Drawable {
    public static float[] k;
    public static Bitmap l;
    public static Bitmap m;
    public final int b;
    public final int c;
    public final Drawable d;
    public float f;
    public float g;
    public static final float[] j = {0.2126f, 0.7152f, 0.0722f};
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final Paint a = new Paint(3);
    public float e = -1.0f;
    public int h = jn7.d4;
    public float i = 1.0f;

    public orc(int i, int i2) {
        this.b = i;
        this.c = i2;
        Drawable e = c00.e(a.b, R.drawable.wallet_card_diamond);
        this.d = e;
        if (l != null) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(84, 84, Bitmap.Config.ARGB_8888);
        e.setBounds(0, 0, 84, 84);
        e.draw(new Canvas(createBitmap));
        Paint paint = new Paint();
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(15.0f, blur));
        l = createBitmap.extractAlpha(paint, n);
        paint.setMaskFilter(new BlurMaskFilter(4.5f, blur));
        m = createBitmap.extractAlpha(paint, o);
        createBitmap.recycle();
    }

    public static float[] a(float f, float f2, float f3) {
        float max = Math.max(f, Math.max(f2, f3));
        float min = max - Math.min(f, Math.min(f2, f3));
        float f4 = 0.55f * max;
        if (min > f4) {
            float f5 = f4 / min;
            f = qd4.A(f, max, f5, max);
            f2 = qd4.A(f2, max, f5, max);
            f3 = qd4.A(f3, max, f5, max);
        }
        return new float[]{f, f2, f3};
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h <= 0 || this.e < 0.0f) {
            return;
        }
        Rect bounds = getBounds();
        if (this.i > 0.0f) {
            float width = bounds.width() / 84.0f;
            canvas.save();
            canvas.translate(bounds.left, bounds.top);
            canvas.scale(width, bounds.height() / 84.0f);
            Paint paint = this.a;
            paint.setColor(-16777216);
            paint.setAlpha((int) (this.h * 0.35f * this.i));
            Bitmap bitmap = l;
            int[] iArr = n;
            canvas.drawBitmap(bitmap, iArr[0], (hl.L(1.0f) / width) + iArr[1], paint);
            paint.setAlpha((int) (this.h * 0.55f * this.i));
            Bitmap bitmap2 = m;
            int[] iArr2 = o;
            canvas.drawBitmap(bitmap2, iArr2[0], iArr2[1], paint);
            canvas.restore();
        }
        Drawable drawable = this.d;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.h);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.h = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
