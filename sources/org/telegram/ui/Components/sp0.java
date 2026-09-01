package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sp0 implements uf.x {
    public final /* synthetic */ mq0 a;

    public sp0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // uf.x
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((uf.y) arrayList.get(i13)).a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        mq0 mq0Var = this.a;
        mq0Var.B0 = arrayList;
        for (int i14 = 0; i14 < mq0Var.B0.size(); i14++) {
            uf.y yVar = (uf.y) mq0Var.B0.get(i14);
            TLObject tLObject2 = yVar.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.h3) mq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        mq0Var.J.l();
    }
}
