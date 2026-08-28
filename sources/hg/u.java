package hg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u extends uj0 {
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
            float f10 = this.h1;
            if (f10 != 0.0f) {
                this.h1 = Math.max(0.0f, f10 - (min / 150.0f));
                invalidate();
                if (this.h1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.h1;
            if (f11 != 1.0f) {
                this.h1 = Math.min(1.0f, (min / 150.0f) + f11);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 != 8 || this.h1 == 0.0f) {
            return;
        }
        this.h1 = 0.0f;
    }
}
