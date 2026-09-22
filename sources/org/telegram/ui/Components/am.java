package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class am implements zl0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.e1(true);
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean b(int i10) {
        return this.a.G.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.K && (view instanceof org.telegram.ui.Cells.u5)) {
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.w.b(u5Var);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.G.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(M.imageId));
    }
}
