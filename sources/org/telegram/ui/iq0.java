package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iq0 implements org.telegram.ui.Components.ul0 {
    public final /* synthetic */ mq0 a;

    public iq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        mq0 mq0Var = this.a;
        mq0Var.T = z4 ? 1 : 0;
        if (z4) {
            f5Var = ((org.telegram.ui.ActionBar.p2) mq0Var).parentLayout;
            f5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        mq0Var.H.c1(true);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean b(int i10) {
        return this.a.I.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void c(View view, boolean z4) {
        if (z4 == this.a.U && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean d(int i10) {
        mq0 mq0Var = this.a;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        return mq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) mq0Var.f.get(i10)).id);
    }
}
