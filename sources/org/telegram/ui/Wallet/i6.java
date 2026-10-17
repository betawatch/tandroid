package org.telegram.ui.Wallet;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class i6 extends Drawable {
    public static int[] k;
    public static int l;
    public static Bitmap m;
    public static Bitmap n;
    public static final int[] o = new int[2];
    public static final int[] p = new int[2];
    public final int c;
    public final int d;
    public Bitmap e;
    public float g;
    public float h;
    public final Paint a = new Paint(3);
    public final Paint b = new Paint(3);
    public float f = -1.0f;
    public int i = 255;
    public float j = 1.0f;

    public i6(int i10, int i11) {
        this.c = i10;
        this.d = i11;
    }

    public static int a(float f7) {
        return Math.max(0, Math.min(255, Math.round(f7 * 0.97f * 255.0f)));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e == null || this.i <= 0) {
            return;
        }
        Rect bounds = getBounds();
        float width = bounds.width() / this.e.getWidth();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.scale(width, bounds.height() / this.e.getHeight());
        if (this.j > 0.0f) {
            Paint paint = this.b;
            paint.setColor(-16777216);
            paint.setAlpha((int) (this.i * 0.35f * this.j));
            Bitmap bitmap = m;
            int[] iArr = o;
            canvas.drawBitmap(bitmap, iArr[0], (AndroidUtilities.dp(1.0f) / width) + iArr[1], paint);
            paint.setAlpha((int) (this.i * 0.55f * this.j));
            Bitmap bitmap2 = n;
            int[] iArr2 = p;
            canvas.drawBitmap(bitmap2, iArr2[0], iArr2[1], paint);
        }
        int i10 = this.i;
        Paint paint2 = this.a;
        paint2.setAlpha(i10);
        canvas.drawBitmap(this.e, 0.0f, 0.0f, paint2);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.i = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
