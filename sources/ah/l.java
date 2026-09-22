package ah;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l extends Drawable {
    public dh.a a;
    public int b;
    public int c;
    public int f;
    public boolean j;
    public float k;
    public float d = 1.0f;
    public final RectF e = new RectF();
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint(1);

    public final void a(dh.a aVar) {
        this.a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.i.setStyle(style);
        b();
    }

    public final void b() {
        dh.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = i6.l1(this.d, aVar.a());
        this.c = i6.l1(this.d, this.a.c());
        int i10 = this.b;
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i11 = this.c;
        Paint paint2 = this.i;
        paint2.setColor(i11);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        float min = (Math.min(getBounds().width(), getBounds().height()) / 2.0f) - this.f;
        RectF rectF = this.e;
        rectF.set(centerX - min, centerY - min, centerX + min, centerY + min);
        if (this.j) {
            rectF.set(getBounds());
            min = this.k;
        }
        float f7 = min;
        Paint paint = this.g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f7, paint);
        }
        if (this.b != 0) {
            canvas2 = canvas;
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.c != 0) {
            ch.d.f(canvas2, rectF, f7, AndroidUtilities.dpf2(0.6666667f), false, this.i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d = i10 / 255.0f;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
