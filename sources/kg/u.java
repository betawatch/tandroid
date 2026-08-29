package kg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u extends fk0 {
    public float h1;
    public long i1;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.i1);
        this.i1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.h1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f9 = this.h1;
            if (f9 != 0.0f) {
                this.h1 = Math.max(0.0f, f9 - (min / 150.0f));
                invalidate();
                if (this.h1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.h1;
            if (f10 != 1.0f) {
                this.h1 = Math.min(1.0f, (min / 150.0f) + f10);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 8 || this.h1 == 0.0f) {
            return;
        }
        this.h1 = 0.0f;
    }
}
