package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        gg ggVar;
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
                int i10 = jrVar.a1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || jrVar.s == null) ? null : new ArrayList(jrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(jrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    irVar2.s = false;
                    ggVar = null;
                } else {
                    ggVar = new gg(irVar2, str, arrayList, arrayList2, 7);
                }
                irVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(jrVar.r) ? jrVar.J : 0L, false, jrVar.K, 1, 0L, ggVar);
                break;
        }
    }
}
