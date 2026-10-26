package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr b;
    public final /* synthetic */ String c;

    public /* synthetic */ hr(jr jrVar, String str, int i10) {
        this.a = i10;
        this.b = jrVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m4.v0 v0Var;
        switch (this.a) {
            case 0:
                jr jrVar = this.b;
                jrVar.getClass();
                AndroidUtilities.runOnUIThread(new hr(jrVar, this.c, 1));
                break;
            default:
                jr jrVar2 = this.b;
                jrVar2.n = null;
                kr krVar = jrVar2.y;
                TLRPC.Chat chat = krVar.n;
                int i10 = krVar.d1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || krVar.r == null) ? null : new ArrayList(krVar.r.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(krVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    jrVar2.s = false;
                    v0Var = null;
                } else {
                    v0Var = new m4.v0(jrVar2, str, arrayList, arrayList2, 21);
                }
                jrVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(krVar.n) ? krVar.M : 0L, false, krVar.N, 1, 0L, v0Var);
                break;
        }
    }
}
