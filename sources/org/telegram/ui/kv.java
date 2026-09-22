package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements oy, dt {
    public final /* synthetic */ nv a;

    public /* synthetic */ kv(nv nvVar) {
        this.a = nvVar;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean K(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.dt
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, eg1 eg1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j3)) {
            return true;
        }
        nv nvVar = this.a;
        nvVar.l0(nvVar.getMessagesController().getUser(Long.valueOf(j3)));
        return true;
    }
}
