package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class cm implements zl0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public cm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean b(int i10) {
        return this.a.G.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.K && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.a(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.G.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(M.imageId));
    }
}
