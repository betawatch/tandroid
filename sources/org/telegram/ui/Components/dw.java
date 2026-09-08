package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
