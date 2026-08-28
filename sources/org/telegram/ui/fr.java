package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir b;
    public final /* synthetic */ String c;

    public /* synthetic */ fr(ir irVar, String str, int i9) {
        this.a = i9;
        this.b = irVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k6 k6Var;
        switch (this.a) {
            case 0:
                ir irVar = this.b;
                irVar.getClass();
                AndroidUtilities.runOnUIThread(new fr(irVar, this.c, 1));
                break;
            default:
                ir irVar2 = this.b;
                irVar2.n = null;
                jr jrVar = irVar2.y;
                TLRPC.Chat chat = jrVar.r;
                int i9 = jrVar.a1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || jrVar.s == null) ? null : new ArrayList(jrVar.s.participants.participants);
                ArrayList arrayList2 = i9 == 1 ? new ArrayList(jrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.s = false;
                    k6Var = null;
                } else {
                    k6Var = new k6(irVar2, str, arrayList, arrayList2, 13);
                }
                irVar2.h.h(str, i9 != 0, false, true, false, false, ChatObject.isChannel(jrVar.r) ? jrVar.J : 0L, false, jrVar.K, 1, 0L, k6Var);
                break;
        }
    }
}
