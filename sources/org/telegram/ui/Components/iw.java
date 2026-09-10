package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw implements zg.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ iw(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.j
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((px) this.b).drawChild(canvas, view, j3);
            case 1:
                return ((vl0) this.b).drawChild(canvas, view, j3);
            case 2:
                yw ywVar = ((rz) this.b).D0;
                if (view instanceof ng.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) ((ng.c) view);
                    if (g8Var.L) {
                        g8Var.b(canvas, ywVar);
                    }
                    canvas.restore();
                }
                return ywVar.drawChild(canvas, view, j3);
            case 3:
                return ((tp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((zt0) this.b).drawChild(canvas, view, j3);
        }
    }
}
