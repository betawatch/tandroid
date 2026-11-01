package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.xr0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ b40 b;

    public y30(b40 b40Var, ArrayList arrayList) {
        this.b = b40Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        a40 a40Var = this.b.b;
        if (a40Var == null) {
            return null;
        }
        return a40Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        this.b.s((org.telegram.messenger.ff) this.a.get(0));
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean z() {
        return false;
    }
}
