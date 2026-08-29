package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class am0 implements org.telegram.ui.Components.li {
    public final /* synthetic */ vm0 a;

    public am0(vm0 vm0Var) {
        this.a = vm0Var;
    }

    @Override // org.telegram.ui.Components.li
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ni niVar;
        vm0 vm0Var = this.a;
        if (vm0Var.getParentActivity() == null || (niVar = vm0Var.N0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            niVar.dismissWithButtonClick(i10);
            vm0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            niVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = vm0Var.N0.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = vm0Var.N0.f0.getSelectedPhotosOrder();
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
        vm0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.li
    public final void L0() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Components.li
    public final void x0(org.telegram.ui.Components.zg zgVar) {
        zgVar.run();
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void U0(Object obj) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.li
    public final /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
