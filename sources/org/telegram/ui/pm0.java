package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pm0 implements org.telegram.ui.Components.ri {
    public final /* synthetic */ kn0 a;

    public pm0(kn0 kn0Var) {
        this.a = kn0Var;
    }

    @Override // org.telegram.ui.Components.ri
    public final void A(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void R() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ri
    public final void p0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ti tiVar;
        kn0 kn0Var = this.a;
        if (kn0Var.getParentActivity() == null || (tiVar = kn0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            tiVar.dismissWithButtonClick(i10);
            kn0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            tiVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = kn0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = kn0Var.R0.j0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i13));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            String str = photoEntry.imagePath;
            if (str != null) {
                sendingMediaInfo.path = str;
            } else {
                sendingMediaInfo.path = photoEntry.path;
            }
            arrayList.add(sendingMediaInfo);
            photoEntry.reset();
        }
        kn0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean x0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void T(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void Y(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void z0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
