package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class av implements ux, vs {
    public final /* synthetic */ dv a;

    public /* synthetic */ av(dv dvVar) {
        this.a = dvVar;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.ui.vs
    public void c(TLRPC.User user) {
        this.a.p0(user);
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
        if (!org.telegram.messenger.o5.E(j10)) {
            return true;
        }
        dv dvVar = this.a;
        dvVar.p0(dvVar.getMessagesController().Z1(Long.valueOf(j10)));
        return true;
    }
}
