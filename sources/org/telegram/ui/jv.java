package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements ky, bt {
    public final /* synthetic */ mv a;

    public /* synthetic */ jv(mv mvVar) {
        this.a = mvVar;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean I(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.bt
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.ky
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        mv mvVar = this.a;
        mvVar.l0(mvVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
