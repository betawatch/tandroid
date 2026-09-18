package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class op0 implements gg.g0 {
    public final /* synthetic */ iq0 a;

    public op0(iq0 iq0Var) {
        this.a = iq0Var;
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
        iq0 iq0Var = this.a;
        iq0Var.E0 = arrayList;
        for (int i14 = 0; i14 < iq0Var.E0.size(); i14++) {
            gg.h0 h0Var = (gg.h0) iq0Var.E0.get(i14);
            TLObject tLObject2 = h0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.a, true);
            }
        }
        iq0Var.M.l();
    }
}
