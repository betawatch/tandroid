package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g10 extends v4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ i10 d;

    public g10(i10 i10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = i10Var;
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
        i10 i10Var = this.d;
        if (i7 < size && i10 < i10Var.e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i7)).equals(i10Var.e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - i10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= i10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.ij.B1((i7 < arrayList.size() ? ((org.telegram.messenger.s3) arrayList.get(i7)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.ij.B1((i10 < i10Var.e.size() ? ((org.telegram.messenger.s3) i10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) i10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) i10Var.f.get(size3)).peer);
    }

    @Override // v4.o
    public final int d() {
        i10 i10Var = this.d;
        return i10Var.f.size() + i10Var.e.size();
    }

    @Override // v4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
