package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements lg.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ vv(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lg.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((dx) this.b).drawChild(canvas, view, j10);
            case 1:
                return ((jl0) this.b).drawChild(canvas, view, j10);
            case 2:
                lw lwVar = ((fz) this.b).z0;
                if (view instanceof zf.c) {
                    canvas.save();
                    canvas.translate(view.getX(), view.getY());
                    org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) ((zf.c) view);
                    if (b8Var.H) {
                        b8Var.b(canvas, lwVar);
                    }
                    canvas.restore();
                }
                return lwVar.drawChild(canvas, view, j10);
            case 3:
                return ((dp0) this.b).drawChild(canvas, view, j10);
            default:
                return ((ht0) this.b).drawChild(canvas, view, j10);
        }
    }
}
