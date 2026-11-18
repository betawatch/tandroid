package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r30 extends org.telegram.ui.oq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ u30 b;

    public r30(u30 u30Var, ArrayList arrayList) {
        this.b = u30Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        t30 t30Var = this.b.b;
        if (t30Var == null) {
            return null;
        }
        return t30Var.getCloseIntoObject();
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
