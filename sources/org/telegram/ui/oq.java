package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        oi.h hVar;
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
                    hVar = null;
                } else {
                    hVar = new oi.h(qqVar2, str, arrayList, arrayList2, 19);
                }
                qqVar2.h.h(str, i7 != 0, false, true, false, false, org.telegram.messenger.v3.T(rqVar.n) ? rqVar.N : 0L, false, rqVar.O, 1, 0L, hVar);
                break;
        }
    }
}
