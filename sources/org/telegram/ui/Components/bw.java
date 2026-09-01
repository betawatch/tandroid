package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw implements og.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ bw(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // og.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((kx) this.b).drawChild(canvas, view, j10);
            case 1:
                return ((tl0) this.b).drawChild(canvas, view, j10);
            case 2:
                rw rwVar = ((mz) this.b).A0;
                if (view instanceof cg.d) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) ((cg.d) view);
                    if (d8Var.I) {
                        d8Var.b(canvas, rwVar);
                    }
                    canvas.restore();
                }
                return rwVar.drawChild(canvas, view, j10);
            case 3:
                return ((np0) this.b).drawChild(canvas, view, j10);
            default:
                return ((qt0) this.b).drawChild(canvas, view, j10);
        }
    }
}
