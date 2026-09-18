package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;
    public final /* synthetic */ String c;

    public /* synthetic */ pr(rr rrVar, String str, int i10) {
        this.a = i10;
        this.b = rrVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.n5 n5Var;
        switch (this.a) {
            case 0:
                rr rrVar = this.b;
                rrVar.getClass();
                AndroidUtilities.runOnUIThread(new pr(rrVar, this.c, 1));
                break;
            default:
                rr rrVar2 = this.b;
                rrVar2.n = null;
                sr srVar = rrVar2.y;
                TLRPC.Chat chat = srVar.r;
                int i10 = srVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || srVar.s == null) ? null : new ArrayList(srVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(srVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    rrVar2.s = false;
                    n5Var = null;
                } else {
                    n5Var = new org.telegram.ui.ActionBar.n5(rrVar2, str, arrayList, arrayList2, 14);
                }
                rrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(srVar.r) ? srVar.N : 0L, false, srVar.O, 1, 0L, n5Var);
                break;
        }
    }
}
