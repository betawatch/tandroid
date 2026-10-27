package bh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.d3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w extends gl0 {
    public float m1;
    public long n1;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.n1);
        this.n1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.m1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f7 = this.m1;
            if (f7 != 0.0f) {
                this.m1 = d3.v(min, 150.0f, f7, 0.0f);
                invalidate();
                if (this.m1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.m1;
            if (f10 != 1.0f) {
                this.m1 = d3.d(min, 150.0f, f10, 1.0f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 8 || this.m1 == 0.0f) {
            return;
        }
        this.m1 = 0.0f;
    }
}
