package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yl implements ul0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void a(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.I = z4 ? 1 : 0;
        chatAttachAlertPhotoLayout.B.c1(true);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean b(int i10) {
        return this.a.D.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void c(View view, boolean z4) {
        if (z4 == this.a.H && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.D.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.p1.containsKey(Integer.valueOf(M.imageId));
    }
}
