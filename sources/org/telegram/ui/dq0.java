package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class dq0 implements org.telegram.ui.Components.vl0 {
    public final /* synthetic */ hq0 a;

    public dq0(hq0 hq0Var) {
        this.a = hq0Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        hq0 hq0Var = this.a;
        hq0Var.T = z4 ? 1 : 0;
        if (z4) {
            f5Var = ((org.telegram.ui.ActionBar.p2) hq0Var).parentLayout;
            f5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        hq0Var.H.d1(true);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean b(int i10) {
        return this.a.I.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.vl0
    public final void c(View view, boolean z4) {
        if (z4 == this.a.U && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean d(int i10) {
        hq0 hq0Var = this.a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        return hq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) hq0Var.f.get(i10)).id);
    }
}
