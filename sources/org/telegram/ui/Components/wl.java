package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wl implements tl0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void a(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        chatAttachAlertPhotoLayout.I = z4 ? 1 : 0;
        chatAttachAlertPhotoLayout.B.c1(true);
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean b(int i10) {
        return this.a.D.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void c(View view, boolean z4) {
        if (z4 == this.a.H && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.w.b(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.a.D.M(i10);
        return M != null && ChatAttachAlertPhotoLayout.p1.containsKey(Integer.valueOf(M.imageId));
    }
}
