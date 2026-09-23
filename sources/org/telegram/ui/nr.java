package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        org.telegram.ui.ActionBar.m5 m5Var;
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
                int i10 = qrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || qrVar.s == null) ? null : new ArrayList(qrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(qrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    prVar2.s = false;
                    m5Var = null;
                } else {
                    m5Var = new org.telegram.ui.ActionBar.m5(prVar2, str, arrayList, arrayList2, 14);
                }
                prVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(qrVar.r) ? qrVar.N : 0L, false, qrVar.O, 1, 0L, m5Var);
                break;
        }
    }
}
