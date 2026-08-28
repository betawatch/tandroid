package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements ig.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ pv(ViewGroup viewGroup, int i9) {
        this.a = i9;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ig.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((ww) this.b).drawChild(canvas, view, j10);
            case 1:
                return ((wk0) this.b).drawChild(canvas, view, j10);
            case 2:
                fw fwVar = ((wy) this.b).z0;
                if (view instanceof wf.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) ((wf.c) view);
                    if (d8Var.H) {
                        d8Var.b(canvas, fwVar);
                    }
                    canvas.restore();
                }
                return fwVar.drawChild(canvas, view, j10);
            case 3:
                return ((so0) this.b).drawChild(canvas, view, j10);
            default:
                return ((ws0) this.b).drawChild(canvas, view, j10);
        }
    }
}
