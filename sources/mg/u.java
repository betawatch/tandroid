package mg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u extends pk0 {
    public float i1;
    public long j1;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.j1);
        this.j1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.i1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.i1;
            if (f10 != 0.0f) {
                this.i1 = Math.max(0.0f, f10 - (min / 150.0f));
                invalidate();
                if (this.i1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.i1;
            if (f11 != 1.0f) {
                this.i1 = Math.min(1.0f, (min / 150.0f) + f11);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 8 || this.i1 == 0.0f) {
            return;
        }
        this.i1 = 0.0f;
    }
}
