package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nl implements al0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.al0
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.H = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.A.d1(true);
    }

    @Override // org.telegram.ui.Components.al0
    public final boolean b(int i10) {
        return this.a.C.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.al0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.G && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.w.d(q5Var);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.C.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.o1.containsKey(Integer.valueOf(M.imageId));
    }
}
