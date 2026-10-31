package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.yr0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ b40 b;

    public y30(b40 b40Var, ArrayList arrayList) {
        this.b = b40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        a40 a40Var = this.b.b;
        if (a40Var == null) {
            return null;
        }
        return a40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((org.telegram.messenger.ef) this.a.get(0));
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean z() {
        return false;
    }
}
