package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ip0 implements rf.y {
    public final /* synthetic */ dq0 a;

    public ip0(dq0 dq0Var) {
        this.a = dq0Var;
    }

    @Override // rf.y
    public final void a(a0.h hVar, ArrayList arrayList) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            TLObject tLObject = ((rf.z) arrayList.get(i13)).a;
            if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        dq0 dq0Var = this.a;
        dq0Var.A0 = arrayList;
        for (int i14 = 0; i14 < dq0Var.A0.size(); i14++) {
            rf.z zVar = (rf.z) dq0Var.A0.get(i14);
            TLObject tLObject2 = zVar.a;
            if (tLObject2 instanceof TLRPC.User) {
                i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                MessagesController.getInstance(i12).putUser((TLRPC.User) zVar.a, true);
            } else if (tLObject2 instanceof TLRPC.Chat) {
                i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                MessagesController.getInstance(i11).putChat((TLRPC.Chat) zVar.a, true);
            } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                i10 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                MessagesController.getInstance(i10).putEncryptedChat((TLRPC.EncryptedChat) zVar.a, true);
            }
        }
        dq0Var.I.l();
    }
}
