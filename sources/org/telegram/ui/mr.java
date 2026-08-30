package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        ih ihVar;
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
                int i10 = prVar.b1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || prVar.s == null) ? null : new ArrayList(prVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(prVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    orVar2.s = false;
                    ihVar = null;
                } else {
                    ihVar = new ih(orVar2, str, arrayList, arrayList2, 5);
                }
                orVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(prVar.r) ? prVar.K : 0L, false, prVar.L, 1, 0L, ihVar);
                break;
        }
    }
}
