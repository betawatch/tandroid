package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class u30 extends org.telegram.ui.oq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ x30 b;

    public u30(x30 x30Var, ArrayList arrayList) {
        this.b = x30Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        w30 w30Var = this.b.b;
        if (w30Var == null) {
            return null;
        }
        return w30Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        this.b.s((org.telegram.messenger.ef) this.a.get(0));
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
