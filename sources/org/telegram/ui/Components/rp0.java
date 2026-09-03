package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rp0 implements uf.x {
    public final /* synthetic */ lq0 a;

    public rp0(lq0 lq0Var) {
        this.a = lq0Var;
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
        lq0 lq0Var = this.a;
        lq0Var.B0 = arrayList;
        for (int i14 = 0; i14 < lq0Var.B0.size(); i14++) {
            uf.y yVar = (uf.y) lq0Var.B0.get(i14);
            TLObject tLObject2 = yVar.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        lq0Var.J.l();
    }
}
