package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv implements ky, xs {
    public final /* synthetic */ jv a;

    public /* synthetic */ gv(jv jvVar) {
        this.a = jvVar;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.xs
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j3)) {
            return true;
        }
        jv jvVar = this.a;
        jvVar.l0(jvVar.getMessagesController().getUser(Long.valueOf(j3)));
        return true;
    }
}
