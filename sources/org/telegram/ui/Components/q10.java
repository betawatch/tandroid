package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q10 extends v4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ s10 d;

    public q10(s10 s10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = s10Var;
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
        s10 s10Var = this.d;
        if (i7 < size && i10 < s10Var.e.size()) {
            return ((org.telegram.messenger.u3) arrayList.get(i7)).equals(s10Var.e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - s10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= s10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.fj.B1((i7 < arrayList.size() ? ((org.telegram.messenger.u3) arrayList.get(i7)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.fj.B1((i10 < s10Var.e.size() ? ((org.telegram.messenger.u3) s10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) s10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) s10Var.f.get(size3)).peer);
    }

    @Override // v4.o
    public final int d() {
        s10 s10Var = this.d;
        return s10Var.f.size() + s10Var.e.size();
    }

    @Override // v4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
