package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.nq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ j30 b;

    public g30(j30 j30Var, ArrayList arrayList) {
        this.b = j30Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        i30 i30Var = this.b.b;
        if (i30Var == null) {
            return null;
        }
        return i30Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.b.s((org.telegram.messenger.gf) this.a.get(0));
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
