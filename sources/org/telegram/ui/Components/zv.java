package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements ng.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ zv(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ng.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((ix) this.b).drawChild(canvas, view, j10);
            case 1:
                return ((sl0) this.b).drawChild(canvas, view, j10);
            case 2:
                pw pwVar = ((kz) this.b).A0;
                if (view instanceof bg.d) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) ((bg.d) view);
                    if (d8Var.I) {
                        d8Var.b(canvas, pwVar);
                    }
                    canvas.restore();
                }
                return pwVar.drawChild(canvas, view, j10);
            case 3:
                return ((mp0) this.b).drawChild(canvas, view, j10);
            default:
                return ((pt0) this.b).drawChild(canvas, view, j10);
        }
    }
}
