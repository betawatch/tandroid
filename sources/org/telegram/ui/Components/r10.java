package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r10 extends v4.p {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ t10 d;

    public r10(t10 t10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = t10Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // v4.p
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override // v4.p
    public final boolean b(int i7, int i10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        t10 t10Var = this.d;
        if (i7 < size && i10 < t10Var.e.size()) {
            return ((org.telegram.messenger.u3) arrayList.get(i7)).equals(t10Var.e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - t10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= t10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.fj.B1((i7 < arrayList.size() ? ((org.telegram.messenger.u3) arrayList.get(i7)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.fj.B1((i10 < t10Var.e.size() ? ((org.telegram.messenger.u3) t10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) t10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) t10Var.f.get(size3)).peer);
    }

    @Override // v4.p
    public final int d() {
        t10 t10Var = this.d;
        return t10Var.f.size() + t10Var.e.size();
    }

    @Override // v4.p
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
