package dh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import fh.l;
import java.util.Arrays;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j extends Drawable {
    public gh.a a;
    public int b;
    public int c;
    public int f;
    public fh.h j;
    public boolean l;
    public float m;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint g = new Paint(1);
    public final l h = new l();
    public final float[] i = new float[8];
    public int k = t6.b;

    public final void a() {
        this.k = t6.b;
        gh.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = m6.r1(this.d, aVar.A());
        this.c = m6.r1(this.d, this.a.O());
        this.j = new fh.h(g0.N(1.0f), this.b, g0.N(0.6666667f), this.c, 0.0f, 0, 0.0f, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.k != t6.b) {
            try {
                a();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.l) {
            rectF.set(getBounds());
            min = this.m;
        }
        Paint paint = this.g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, min, paint);
        }
        if (this.j != null) {
            Arrays.fill(this.i, min);
            this.h.a(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom, this.i, this.j, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d = i7 / 255.0f;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
