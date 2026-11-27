// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g0c extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final /* synthetic */ int c;
    public final /* synthetic */ n0c d;

    public g0c(n0c n0cVar, int i) {
        this.d = n0cVar;
        this.c = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        float f = this.c;
        rectF.inset(f, f);
        float height = rectF.height() / 2.0f;
        int v0 = aob.v0(aob.O5, this.d.e);
        Paint paint = this.a;
        paint.setColor(v0);
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
