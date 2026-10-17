package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir b;
    public final /* synthetic */ String c;

    public /* synthetic */ gr(ir irVar, String str, int i10) {
        this.a = i10;
        this.b = irVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.camera.i iVar;
        switch (this.a) {
            case 0:
                ir irVar = this.b;
                irVar.getClass();
                AndroidUtilities.runOnUIThread(new gr(irVar, this.c, 1));
                break;
            default:
                ir irVar2 = this.b;
                irVar2.n = null;
                jr jrVar = irVar2.y;
                TLRPC.Chat chat = jrVar.r;
                int i10 = jrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || jrVar.s == null) ? null : new ArrayList(jrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(jrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.s = false;
                    iVar = null;
                } else {
                    iVar = new org.telegram.messenger.camera.i(irVar2, str, arrayList, arrayList2, 18);
                }
                irVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(jrVar.r) ? jrVar.N : 0L, false, jrVar.O, 1, 0L, iVar);
                break;
        }
    }
}
