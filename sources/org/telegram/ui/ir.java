package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr b;
    public final /* synthetic */ String c;

    public /* synthetic */ ir(kr krVar, String str, int i10) {
        this.a = i10;
        this.b = krVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf yfVar;
        switch (this.a) {
            case 0:
                kr krVar = this.b;
                krVar.getClass();
                AndroidUtilities.runOnUIThread(new ir(krVar, this.c, 1));
                break;
            default:
                kr krVar2 = this.b;
                krVar2.n = null;
                lr lrVar = krVar2.y;
                TLRPC.Chat chat = lrVar.r;
                int i10 = lrVar.a1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || lrVar.s == null) ? null : new ArrayList(lrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(lrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    krVar2.s = false;
                    yfVar = null;
                } else {
                    yfVar = new yf(krVar2, str, arrayList, arrayList2, 9);
                }
                krVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(lrVar.r) ? lrVar.J : 0L, false, lrVar.K, 1, 0L, yfVar);
                break;
        }
    }
}
