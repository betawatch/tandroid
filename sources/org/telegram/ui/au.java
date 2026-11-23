package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class au implements vw, yr {
    public final /* synthetic */ du a;

    public /* synthetic */ au(du duVar) {
        this.a = duVar;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(bx bxVar) {
        return false;
    }

    @Override // org.telegram.ui.yr
    public void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.vw
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
        if (!org.telegram.messenger.n5.E(j3)) {
            return true;
        }
        du duVar = this.a;
        duVar.q0(duVar.getMessagesController().c2(Long.valueOf(j3)));
        return true;
    }
}
