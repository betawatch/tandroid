package ig;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends Drawable {
    public lg.a a;
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

    public final void a(lg.a aVar) {
        this.a = aVar;
        Paint.Style style = Paint.Style.STROKE;
        this.h.setStyle(style);
        this.i.setStyle(style);
        b();
    }

    public final void b() {
        lg.a aVar = this.a;
        if (aVar == null) {
            return;
        }
        this.b = f6.l1(this.d, aVar.e());
        this.c = f6.l1(this.d, this.a.g());
        int i9 = this.b;
        Paint paint = this.h;
        paint.setColor(i9);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        int i10 = this.c;
        Paint paint2 = this.i;
        paint2.setColor(i10);
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
        float f10 = min;
        Paint paint = this.g;
        if (Color.alpha(paint.getColor()) > 0) {
            canvas.drawCircle(centerX, centerY, f10, paint);
        }
        if (this.b != 0) {
            canvas2 = canvas;
            kg.d.f(canvas2, rectF, f10, AndroidUtilities.dpf2(1.0f), true, this.h);
        } else {
            canvas2 = canvas;
        }
        if (this.c != 0) {
            kg.d.f(canvas2, rectF, f10, AndroidUtilities.dpf2(0.6666667f), false, this.i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.d = i9 / 255.0f;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
