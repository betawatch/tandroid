package og;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Cells.f8;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public abstract class d extends zl0 {
    public boolean e3;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.zl0
    public final void K0(Canvas canvas, RectF rectF, long j3) {
        super.K0(canvas, rectF, j3);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c) {
                float x10 = childAt.getX();
                float y3 = childAt.getY();
                if (rectF.intersects(x10, y3, childAt.getWidth() + x10, childAt.getHeight() + y3)) {
                    canvas.save();
                    canvas.translate(x10, y3);
                    f8 f8Var = (f8) ((c) childAt);
                    if (f8Var.L) {
                        f8Var.b(canvas, this);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.e3 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof c) {
                c cVar = (c) getChildAt(i10);
                canvas.save();
                canvas.translate(cVar.getX(), cVar.getY());
                f8 f8Var = (f8) cVar;
                if (f8Var.L) {
                    f8Var.b(canvas, this);
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
