package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v10 extends s4.n {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ z10 d;

    public v10(z10 z10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = z10Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        z10 z10Var = this.d;
        if (i10 < size && i11 < z10Var.e.size()) {
            return ((org.telegram.messenger.v3) arrayList.get(i10)).equals(z10Var.e.get(i11));
        }
        int size2 = i10 - arrayList.size();
        int size3 = i11 - z10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= z10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.jj.C1((i10 < arrayList.size() ? ((org.telegram.messenger.v3) arrayList.get(i10)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.jj.C1((i11 < z10Var.e.size() ? ((org.telegram.messenger.v3) z10Var.e.get(i11)).a : (TLRPC.GroupCallParticipant) z10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) z10Var.f.get(size3)).peer);
    }

    @Override // s4.n
    public final int d() {
        z10 z10Var = this.d;
        return z10Var.f.size() + z10Var.e.size();
    }

    @Override // s4.n
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
