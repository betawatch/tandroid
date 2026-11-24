// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class e75 extends Drawable {
    public long b;
    public boolean d;
    public final View e;
    public final Paint a = new Paint(1);
    public float c = 1.0f;

    public e75(View view) {
        this.e = view;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.e;
        if (view instanceof jia) {
            L = gl.L(1.0f) + centerY;
            centerX -= gl.L(3.0f);
        } else {
            L = gl.L(2.0f) + centerY;
        }
        Paint paint = this.a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.c * 255.0f));
        canvas.drawCircle(centerX, L, gl.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.b;
        if (j > 17) {
            j = 17;
        }
        this.b = elapsedRealtime;
        boolean z = this.d;
        if (!z) {
            float f = (j / 2000.0f) + this.c;
            this.c = f;
            if (f >= 1.0f) {
                this.c = 1.0f;
                this.d = true;
            }
        } else if (z) {
            float f2 = this.c - (j / 2000.0f);
            this.c = f2;
            if (f2 < 0.5f) {
                this.c = 0.5f;
                this.d = false;
            }
        }
        view.invalidate();
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
