package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tq0 implements ig.g0 {
    public final /* synthetic */ nr0 a;

    public tq0(nr0 nr0Var) {
        this.a = nr0Var;
    }

    @Override // ig.g0
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((ig.h0) arrayList.get(i13)).a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        nr0 nr0Var = this.a;
        nr0Var.F0 = arrayList;
        for (int i14 = 0; i14 < nr0Var.F0.size(); i14++) {
            ig.h0 h0Var = (ig.h0) nr0Var.F0.get(i14);
            TLObject tLObject2 = h0Var.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) h0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) h0Var.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.k3) nr0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) h0Var.a, true);
            }
        }
        nr0Var.N.l();
    }
}
