package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mm implements qm0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.qm0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean b(int i10) {
        return this.a.G.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.qm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.K && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.w.b(x5Var);
        }
    }

    @Override // org.telegram.ui.Components.qm0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.G.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(M.imageId));
    }
}
