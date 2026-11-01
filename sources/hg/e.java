package hg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.uk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class e extends uk0 {
    public boolean e3;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.uk0
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        super.J0(canvas, rectF, j10);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d) {
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    canvas.save();
                    canvas.translate(x10, y3);
                    d8 d8Var = (d8) ((d) childAt);
                    if (d8Var.L) {
                        d8Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.uk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.e3 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof d) {
                d dVar = (d) getChildAt(i10);
                canvas.save();
                canvas.translate(dVar.getX(), dVar.getY());
                d8 d8Var = (d8) dVar;
                if (d8Var.L) {
                    d8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.e3) {
            return;
        }
        super.invalidate();
        this.e3 = true;
    }
}
