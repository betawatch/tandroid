package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cm0 implements org.telegram.ui.Components.ii {
    public final /* synthetic */ wm0 a;

    public cm0(wm0 wm0Var) {
        this.a = wm0Var;
    }

    @Override // org.telegram.ui.Components.ii
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ki kiVar;
        wm0 wm0Var = this.a;
        if (wm0Var.getParentActivity() == null || (kiVar = wm0Var.N0) == null) {
            return;
        }
        if (i9 != 8 && i9 != 7) {
            kiVar.dismissWithButtonClick(i9);
            wm0Var.F1(i9);
            return;
        }
        if (i9 != 8) {
            kiVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = wm0Var.N0.f0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = wm0Var.N0.f0.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < selectedPhotosOrder.size(); i12++) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i12));
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
        wm0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void t(org.telegram.ui.Components.wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean t0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void u() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void A(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void E(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
