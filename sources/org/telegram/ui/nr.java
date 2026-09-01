package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;
    public final /* synthetic */ String c;

    public /* synthetic */ nr(pr prVar, String str, int i10) {
        this.a = i10;
        this.b = prVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih ihVar;
        switch (this.a) {
            case 0:
                pr prVar = this.b;
                prVar.getClass();
                AndroidUtilities.runOnUIThread(new nr(prVar, this.c, 1));
                break;
            default:
                pr prVar2 = this.b;
                prVar2.n = null;
                qr qrVar = prVar2.y;
                TLRPC.Chat chat = qrVar.r;
                int i10 = qrVar.b1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || qrVar.s == null) ? null : new ArrayList(qrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(qrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    prVar2.s = false;
                    ihVar = null;
                } else {
                    ihVar = new ih(prVar2, str, arrayList, arrayList2, 5);
                }
                prVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(qrVar.r) ? qrVar.K : 0L, false, qrVar.L, 1, 0L, ihVar);
                break;
        }
    }
}
