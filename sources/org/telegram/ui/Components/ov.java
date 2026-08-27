package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements jg.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ov(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jg.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((ww) this.b).drawChild(canvas, view, j10);
            case 1:
                return ((zk0) this.b).drawChild(canvas, view, j10);
            case 2:
                ew ewVar = ((yy) this.b).z0;
                if (view instanceof xf.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.a8 a8Var = (org.telegram.ui.Cells.a8) ((xf.c) view);
                    if (a8Var.H) {
                        a8Var.b(canvas, ewVar);
                    }
                    canvas.restore();
                }
                return ewVar.drawChild(canvas, view, j10);
            case 3:
                return ((so0) this.b).drawChild(canvas, view, j10);
            default:
                return ((ys0) this.b).drawChild(canvas, view, j10);
        }
    }
}
