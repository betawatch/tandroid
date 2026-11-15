package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j10 extends v4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ l10 d;

    public j10(l10 l10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = l10Var;
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
        l10 l10Var = this.d;
        if (i7 < size && i10 < l10Var.e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i7)).equals(l10Var.e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - l10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= l10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.gj.B1((i7 < arrayList.size() ? ((org.telegram.messenger.s3) arrayList.get(i7)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.gj.B1((i10 < l10Var.e.size() ? ((org.telegram.messenger.s3) l10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) l10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) l10Var.f.get(size3)).peer);
    }

    @Override // v4.o
    public final int d() {
        l10 l10Var = this.d;
        return l10Var.f.size() + l10Var.e.size();
    }

    @Override // v4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
