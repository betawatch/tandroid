package bg;

import android.graphics.Canvas;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class e extends rl0 {
    public boolean U2;

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.U2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof d) {
                d dVar = (d) getChildAt(i10);
                canvas.save();
                canvas.translate(dVar.getX(), dVar.getY());
                c8 c8Var = (c8) dVar;
                if (c8Var.I) {
                    c8Var.b(canvas, this);
                }
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.U2) {
            return;
        }
        super.invalidate();
        this.U2 = true;
    }
}
