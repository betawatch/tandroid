package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gr b;
    public final /* synthetic */ String c;

    public /* synthetic */ er(gr grVar, String str, int i10) {
        this.a = i10;
        this.b = grVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.camera.i iVar;
        switch (this.a) {
            case 0:
                gr grVar = this.b;
                grVar.getClass();
                AndroidUtilities.runOnUIThread(new er(grVar, this.c, 1));
                break;
            default:
                gr grVar2 = this.b;
                grVar2.n = null;
                hr hrVar = grVar2.y;
                TLRPC.Chat chat = hrVar.r;
                int i10 = hrVar.e1;
                ArrayList arrayList = (ChatObject.isChannel(chat) || hrVar.s == null) ? null : new ArrayList(hrVar.s.participants.participants);
                ArrayList arrayList2 = i10 == 1 ? new ArrayList(hrVar.getContactsController().contacts) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    grVar2.s = false;
                    iVar = null;
                } else {
                    iVar = new org.telegram.messenger.camera.i(grVar2, str, arrayList, arrayList2, 18);
                }
                grVar2.h.h(str, i10 != 0, false, true, false, false, ChatObject.isChannel(hrVar.r) ? hrVar.N : 0L, false, hrVar.O, 1, 0L, iVar);
                break;
        }
    }
}
