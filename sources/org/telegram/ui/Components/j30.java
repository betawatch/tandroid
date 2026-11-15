package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.mq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ m30 b;

    public j30(m30 m30Var, ArrayList arrayList) {
        this.b = m30Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        l30 l30Var = this.b.b;
        if (l30Var == null) {
            return null;
        }
        return l30Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        this.b.s((org.telegram.messenger.ff) this.a.get(0));
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean z() {
        return false;
    }
}
