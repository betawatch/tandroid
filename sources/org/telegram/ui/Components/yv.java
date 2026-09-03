package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv implements ng.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ yv(ViewGroup viewGroup, int i10) {
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
                return ((rl0) this.b).drawChild(canvas, view, j10);
            case 2:
                pw pwVar = ((kz) this.b).A0;
                if (view instanceof bg.d) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) ((bg.d) view);
                    if (c8Var.I) {
                        c8Var.b(canvas, pwVar);
                    }
                    canvas.restore();
                }
                return pwVar.drawChild(canvas, view, j10);
            case 3:
                return ((lp0) this.b).drawChild(canvas, view, j10);
            default:
                return ((pt0) this.b).drawChild(canvas, view, j10);
        }
    }
}
