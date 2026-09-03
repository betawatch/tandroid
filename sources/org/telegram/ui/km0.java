package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class km0 implements org.telegram.ui.Components.ki {
    public final /* synthetic */ fn0 a;

    public km0(fn0 fn0Var) {
        this.a = fn0Var;
    }

    @Override // org.telegram.ui.Components.ki
    public final void B0(org.telegram.ui.Components.wg wgVar) {
        wgVar.run();
    }

    @Override // org.telegram.ui.Components.ki
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        org.telegram.ui.Components.mi miVar;
        fn0 fn0Var = this.a;
        if (fn0Var.getParentActivity() == null || (miVar = fn0Var.O0) == null) {
            return;
        }
        if (i10 != 8 && i10 != 7) {
            miVar.dismissWithButtonClick(i10);
            fn0Var.F1(i10);
            return;
        }
        if (i10 != 8) {
            miVar.dismiss(true);
        }
        HashMap<Object, Object> selectedPhotos = fn0Var.O0.g0.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = fn0Var.O0.g0.getSelectedPhotosOrder();
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
        fn0Var.G1(arrayList);
    }

    @Override // org.telegram.ui.Components.ki
    public final void Q0() {
        AndroidUtilities.hideKeyboard(this.a.fragmentView.findFocus());
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ boolean b2() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ boolean h0() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void Z0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void o1(TLRPC.User user) {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Components.ki
    public final /* synthetic */ void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
