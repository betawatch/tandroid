package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements iy, zs {
    public final /* synthetic */ kv a;

    public /* synthetic */ hv(kv kvVar) {
        this.a = kvVar;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // org.telegram.ui.iy
    public /* synthetic */ boolean K(oy oyVar) {
        return false;
    }

    @Override // org.telegram.ui.zs
    public void b(TLRPC.User user) {
        this.a.l0(user);
    }

    @Override // org.telegram.ui.iy
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j10)) {
            return true;
        }
        kv kvVar = this.a;
        kvVar.l0(kvVar.getMessagesController().getUser(Long.valueOf(j10)));
        return true;
    }
}
