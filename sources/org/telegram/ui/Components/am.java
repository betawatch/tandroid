package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class am implements ml0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean b(int i10) {
        return this.a.G.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.K && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.G.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(M.imageId));
    }
}
