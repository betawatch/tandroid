// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d75 extends Drawable {
    public final Paint a;
    public final Paint b;
    public long c;
    public float d;
    public boolean e;
    public boolean f;
    public ImageView g;

    public d75() {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(1.5f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, gl.L(10.0f), this.a);
        int i = this.f ? -1147527 : -1;
        Paint paint = this.b;
        paint.setColor(i);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, gl.L(5.0f), paint);
        if (this.f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.c;
            if (j > 17) {
                j = 17;
            }
            this.c = elapsedRealtime;
            boolean z = this.e;
            if (!z) {
                float f = (j / 2000.0f) + this.d;
                this.d = f;
                if (f >= 1.0f) {
                    this.d = 1.0f;
                    this.e = true;
                }
            } else if (z) {
                float f2 = this.d - (j / 2000.0f);
                this.d = f2;
                if (f2 < 0.5f) {
                    this.d = 0.5f;
                    this.e = false;
                }
            }
            this.g.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
