package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rl implements xk0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.xk0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.H = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.A.d1(true);
    }

    @Override // org.telegram.ui.Components.xk0
    public final boolean b(int i9) {
        return this.a.C.j(i9) == 0;
    }

    @Override // org.telegram.ui.Components.xk0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.G && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.d(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.xk0
    public final boolean d(int i9) {
        MediaController.PhotoEntry M = this.a.C.M(i9);
        return M != null && ChatAttachAlertPhotoLayout.o1.containsKey(Integer.valueOf(M.imageId));
    }
}
