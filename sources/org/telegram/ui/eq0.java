package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class eq0 implements org.telegram.ui.Components.km0 {
    public final /* synthetic */ jq0 a;

    public eq0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    @Override // org.telegram.ui.Components.km0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        jq0 jq0Var = this.a;
        jq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) jq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        jq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.km0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.w.c(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean d(int i10) {
        jq0 jq0Var = this.a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        return jq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) jq0Var.f.get(i10)).id);
    }
}
