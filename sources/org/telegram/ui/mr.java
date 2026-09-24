package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;
    public final /* synthetic */ String c;

    public /* synthetic */ mr(or orVar, String str, int i10) {
        this.a = i10;
        this.b = orVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.l5 l5Var;
        switch (this.a) {
            case 0:
                or orVar = this.b;
                orVar.getClass();
                AndroidUtilities.runOnUIThread(new mr(orVar, this.c, 1));
                break;
            default:
                or orVar2 = this.b;
                orVar2.n = null;
                pr prVar = orVar2.y;
                TLRPC.Chat chat = prVar.r;
                int i10 = prVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || prVar.s == null) ? null : new ArrayList(prVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(prVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.s = false;
                    l5Var = null;
                } else {
                    l5Var = new org.telegram.ui.ActionBar.l5(orVar2, str, arrayList, arrayList2, 14);
                }
                orVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(prVar.r) ? prVar.N : 0L, false, prVar.O, 1, 0L, l5Var);
                break;
        }
    }
}
