// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class npb extends View implements li4 {
    public final Drawable a;
    public final int b;
    public Bitmap c;
    public final Paint d;
    public final Paint e;
    public float f;
    public final lm h;
    public final Path n;

    public npb(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(3);
        this.e = paint2;
        this.h = new lm(this, 0L, 350L, s33.h);
        this.n = new Path();
        this.a = b00.d(context, R.drawable.media_dual_camera2_shadow);
        this.b = R.drawable.media_dual_camera2;
        paint.setColor(-1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c == null) {
            this.c = BitmapFactory.decodeResource(getResources(), this.b);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float e = this.h.e(false, this.f);
        Drawable drawable = this.a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Rect rect = gl.Q;
        rect.set((getWidth() - intrinsicWidth) / 2, (getHeight() - intrinsicHeight) / 2, (getWidth() + intrinsicWidth) / 2, (getHeight() + intrinsicHeight) / 2);
        if (e <= 0.0f) {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        } else if (e < 1.0f) {
            canvas.save();
            Path path = this.n;
            path.rewind();
            path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f) * e, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            drawable.setBounds(rect);
            drawable.draw(canvas);
            canvas.restore();
        }
        if (e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, gl.L(16.0f) * e, this.d);
            canvas.save();
            Bitmap bitmap = this.c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rect, this.e);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // li4
    public void setInvert(float f) {
        this.a.setColorFilter(new PorterDuffColorFilter(bm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        this.d.setColor(bm2.f(f, -1, -16777216));
    }

    public void setValue(boolean z) {
        this.f = z ? 1.0f : 0.0f;
        invalidate();
    }
}
