package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xo0 implements pf.x {
    public final /* synthetic */ sp0 a;

    public xo0(sp0 sp0Var) {
        this.a = sp0Var;
    }

    @Override // pf.x
    public final void b(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((pf.y) arrayList.get(i13)).a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        sp0 sp0Var = this.a;
        sp0Var.A0 = arrayList;
        for (int i14 = 0; i14 < sp0Var.A0.size(); i14++) {
            pf.y yVar = (pf.y) sp0Var.A0.get(i14);
            TLObject tLObject2 = yVar.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) yVar.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) yVar.a, true);
            }
        }
        sp0Var.I.l();
    }
}
