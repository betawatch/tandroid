package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements qy, ft {
    public final /* synthetic */ pv a;

    public /* synthetic */ mv(pv pvVar) {
        this.a = pvVar;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.qy
    public /* synthetic */ boolean K(wy wyVar) {
        return false;
    }

    @Override // org.telegram.ui.ft
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.qy
    public boolean u(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, fg1 fg1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j3)) {
            return true;
        }
        pv pvVar = this.a;
        pvVar.l0(pvVar.getMessagesController().getUser(Long.valueOf(j3)));
        return true;
    }
}
