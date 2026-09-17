package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ dw(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((kx) this.b).drawChild(canvas, view, j3);
            case 1:
                return ((ll0) this.b).drawChild(canvas, view, j3);
            case 2:
                tw twVar = ((kz) this.b).D0;
                if (view instanceof pg.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) ((pg.c) view);
                    if (f8Var.L) {
                        f8Var.b(canvas, twVar);
                    }
                    canvas.restore();
                }
                return twVar.drawChild(canvas, view, j3);
            case 3:
                return ((jp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((pt0) this.b).drawChild(canvas, view, j3);
        }
    }
}
