package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class au implements tw, yr {
    public final /* synthetic */ du a;

    public /* synthetic */ au(du duVar) {
        this.a = duVar;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(zw zwVar) {
        return false;
    }

    @Override // org.telegram.ui.yr
    public void b(TLRPC.User user) {
        this.a.q0(user);
    }

    @Override // org.telegram.ui.tw
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        if (!org.telegram.messenger.m5.E(j3)) {
            return true;
        }
        du duVar = this.a;
        duVar.q0(duVar.getMessagesController().a2(Long.valueOf(j3)));
        return true;
    }
}
