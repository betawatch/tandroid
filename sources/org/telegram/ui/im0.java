package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class im0 implements org.telegram.ui.Components.ji {
    public final /* synthetic */ dn0 a;

    public im0(dn0 dn0Var) {
        this.a = dn0Var;
    }

    @Override // org.telegram.ui.Components.ji
    public final void C() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ji
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        org.telegram.ui.Components.li liVar;
        dn0 dn0Var = this.a;
        if (dn0Var.getParentActivity() == null || (liVar = dn0Var.O0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            liVar.dismissWithButtonClick(i10);
            dn0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            liVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = dn0Var.O0.g0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = dn0Var.O0.g0.getSelectedPhotosOrder();
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
        dn0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ji
    public final void x(org.telegram.ui.Components.wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void D(Object obj) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void G(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Components.ji
    public final /* synthetic */ void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
