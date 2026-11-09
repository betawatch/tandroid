package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h30 extends org.telegram.ui.pq0 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ k30 b;

    public h30(k30 k30Var, ArrayList arrayList) {
        this.b = k30Var;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final org.telegram.ui.yq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        j30 j30Var = this.b.b;
        if (j30Var == null) {
            return null;
        }
        return j30Var.getCloseIntoObject();
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.b.s((org.telegram.messenger.gf) this.a.get(0));
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean z() {
        return false;
    }
}
