package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.eq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ f30 b;

    public c30(f30 f30Var, ArrayList arrayList) {
        this.b = f30Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        e30 e30Var = this.b.b;
        if (e30Var == null) {
            return null;
        }
        return e30Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        this.b.s((org.telegram.messenger.ye) this.a.get(0));
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean z() {
        return false;
    }
}
