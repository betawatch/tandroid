package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t10 extends v4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ v10 d;

    public t10(v10 v10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = v10Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        return true;
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        v10 v10Var = this.d;
        if (i7 < size && i10 < v10Var.e.size()) {
            return ((org.telegram.messenger.u3) arrayList.get(i7)).equals(v10Var.e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - v10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= v10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.gj.B1((i7 < arrayList.size() ? ((org.telegram.messenger.u3) arrayList.get(i7)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.gj.B1((i10 < v10Var.e.size() ? ((org.telegram.messenger.u3) v10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) v10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) v10Var.f.get(size3)).peer);
    }

    @Override // v4.o
    public final int d() {
        v10 v10Var = this.d;
        return v10Var.f.size() + v10Var.e.size();
    }

    @Override // v4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
