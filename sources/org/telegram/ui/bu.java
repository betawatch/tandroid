package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bu implements ww, yr {
    public final /* synthetic */ eu a;

    public /* synthetic */ bu(eu euVar) {
        this.a = euVar;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.yr
    public void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
        if (!org.telegram.messenger.n5.E(j3)) {
            return true;
        }
        eu euVar = this.a;
        euVar.q0(euVar.getMessagesController().c2(Long.valueOf(j3)));
        return true;
    }
}
