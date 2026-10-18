package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class dm0 implements org.telegram.ui.Components.ri {
    public final /* synthetic */ xm0 a;

    public dm0(xm0 xm0Var) {
        this.a = xm0Var;
    }

    @Override // org.telegram.ui.Components.ri
    public final void J() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ri
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.ti tiVar;
        xm0 xm0Var = this.a;
        if (xm0Var.getParentActivity() == null || (tiVar = xm0Var.R0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            tiVar.dismissWithButtonClick(i10);
            xm0Var.E1(i10);
            return;
        }
        if (i10 != 8) {
            tiVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = xm0Var.R0.j0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = xm0Var.R0.j0.getSelectedPhotosOrder();
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
        xm0Var.F1(arrayList);
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean p0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final void r(org.telegram.ui.Components.gh ghVar) {
        ghVar.run();
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void E() {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void O(Object obj) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void X(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ri
    public final /* synthetic */ void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
