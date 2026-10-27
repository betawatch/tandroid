package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;
    public final /* synthetic */ String c;

    public /* synthetic */ jr(lr lrVar, String str, int i10) {
        this.a = i10;
        this.b = lrVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m4.v0 v0Var;
        switch (this.a) {
            case 0:
                lr lrVar = this.b;
                lrVar.getClass();
                AndroidUtilities.runOnUIThread(new jr(lrVar, this.c, 1));
                break;
            default:
                lr lrVar2 = this.b;
                lrVar2.n = null;
                mr mrVar = lrVar2.y;
                TLRPC.Chat chat = mrVar.n;
                int i10 = mrVar.d1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || mrVar.r == null) ? null : new ArrayList(mrVar.r.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(mrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    lrVar2.s = false;
                    v0Var = null;
                } else {
                    v0Var = new m4.v0(lrVar2, str, arrayList, arrayList2, 21);
                }
                lrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(mrVar.n) ? mrVar.M : 0L, false, mrVar.N, 1, 0L, v0Var);
                break;
        }
    }
}
