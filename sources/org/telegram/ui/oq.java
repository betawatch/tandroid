package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class oq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq b;
    public final /* synthetic */ String c;

    public /* synthetic */ oq(qq qqVar, String str, int i7) {
        this.a = i7;
        this.b = qqVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.camera.i iVar;
        switch (this.a) {
            case 0:
                qq qqVar = this.b;
                qqVar.getClass();
                org.telegram.messenger.g0.g3(new oq(qqVar, this.c, 1));
                break;
            default:
                qq qqVar2 = this.b;
                qqVar2.n = null;
                rq rqVar = qqVar2.E;
                TLRPC.Chat chat = rqVar.n;
                int i7 = rqVar.e1;
                ArrayList arrayList = (org.telegram.messenger.v3.T(chat) || rqVar.r == null) ? null : new ArrayList(rqVar.r.participants.participants);
                ArrayList arrayList2 = i7 == 1 ? new ArrayList(rqVar.getContactsController().f0) : null;
                String str = this.c;
                if (arrayList == null && arrayList2 == null) {
                    qqVar2.s = false;
                    iVar = null;
                } else {
                    iVar = new org.telegram.messenger.camera.i(qqVar2, str, arrayList, arrayList2, 18);
                }
                qqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.v3.T(rqVar.n) ? rqVar.N : 0L, false, rqVar.O, 1, 0L, iVar);
                break;
        }
    }
}
