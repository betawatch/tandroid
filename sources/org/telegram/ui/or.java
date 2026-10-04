package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        org.telegram.ui.ActionBar.m5 m5Var;
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
                int i10 = rrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || rrVar.s == null) ? null : new ArrayList(rrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(rrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    qrVar2.s = false;
                    m5Var = null;
                } else {
                    m5Var = new org.telegram.ui.ActionBar.m5(qrVar2, str, arrayList, arrayList2, 14);
                }
                qrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(rrVar.r) ? rrVar.N : 0L, false, rrVar.O, 1, 0L, m5Var);
                break;
        }
    }
}
