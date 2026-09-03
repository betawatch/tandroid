package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;
    public final /* synthetic */ String c;

    public /* synthetic */ or(qr qrVar, String str, int i10) {
        this.a = i10;
        this.b = qrVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kh khVar;
        switch (this.a) {
            case 0:
                qr qrVar = this.b;
                qrVar.getClass();
                AndroidUtilities.runOnUIThread(new or(qrVar, this.c, 1));
                break;
            default:
                qr qrVar2 = this.b;
                qrVar2.n = null;
                rr rrVar = qrVar2.y;
                TLRPC.Chat chat = rrVar.r;
                int i10 = rrVar.b1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || rrVar.s == null) ? null : new ArrayList(rrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(rrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    qrVar2.s = false;
                    khVar = null;
                } else {
                    khVar = new kh(qrVar2, str, arrayList, arrayList2, 5);
                }
                qrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(rrVar.r) ? rrVar.K : 0L, false, rrVar.L, 1, 0L, khVar);
                break;
        }
    }
}
