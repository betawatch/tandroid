package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class hq0 implements gg.g0 {
    public final /* synthetic */ br0 a;

    public hq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // gg.g0
    public final void a(a0.i iVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((gg.h0) arrayList.get(i13)).a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        br0 br0Var = this.a;
        br0Var.E0 = arrayList;
        for (int i14 = 0; i14 < br0Var.E0.size(); i14++) {
            gg.h0 h0Var = (gg.h0) br0Var.E0.get(i14);
            TLObject tLObject2 = h0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) br0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.a, true);
            }
        }
        br0Var.M.l();
    }
}
