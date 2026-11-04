package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c10 extends u4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ e10 d;

    public c10(e10 e10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = e10Var;
        this.b = arrayList;
        this.c = arrayList2;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        return true;
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        e10 e10Var = this.d;
        if (i3 < size && i10 < e10Var.e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i3)).equals(e10Var.e.get(i10));
        }
        int size2 = i3 - arrayList.size();
        int size3 = i10 - e10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= e10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.zi.C1((i3 < arrayList.size() ? ((org.telegram.messenger.s3) arrayList.get(i3)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.zi.C1((i10 < e10Var.e.size() ? ((org.telegram.messenger.s3) e10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) e10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) e10Var.f.get(size3)).peer);
    }

    @Override // u4.o
    public final int d() {
        e10 e10Var = this.d;
        return e10Var.f.size() + e10Var.e.size();
    }

    @Override // u4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
