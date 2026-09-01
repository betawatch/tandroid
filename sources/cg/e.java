package cg;

import android.graphics.Canvas;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Components.tl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class e extends tl0 {
    public boolean U2;

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.U2 = false;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if (getChildAt(i10) instanceof d) {
                d dVar = (d) getChildAt(i10);
                canvas.save();
                canvas.translate(dVar.getX(), dVar.getY());
                d8 d8Var = (d8) dVar;
                if (d8Var.I) {
                    d8Var.b(canvas, this);
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
