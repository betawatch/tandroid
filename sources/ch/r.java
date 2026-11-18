package ch;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Components.vi0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r extends vi0 {
    public float n1;
    public long o1;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.o1);
        this.o1 = System.currentTimeMillis();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.n1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.n1;
            if (f10 != 0.0f) {
                this.n1 = org.telegram.ui.Cells.c0.B(min, 150.0f, f10, 0.0f);
                invalidate();
                if (this.n1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.n1;
            if (f11 != 1.0f) {
                this.n1 = org.telegram.ui.Cells.c0.f(min, 150.0f, f11, 1.0f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 8 || this.n1 == 0.0f) {
            return;
        }
        this.n1 = 0.0f;
    }
}
