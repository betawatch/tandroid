package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vl implements kl0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.H = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.A.d1(true);
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean b(int i10) {
        return this.a.C.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.G && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.w.d(r5Var);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.C.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.o1.containsKey(Integer.valueOf(M.imageId));
    }
}
