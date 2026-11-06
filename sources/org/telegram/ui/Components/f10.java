package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f10 extends v4.o {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ h10 d;

    public f10(h10 h10Var, ArrayList arrayList, ArrayList arrayList2) {
        this.d = h10Var;
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
        h10 h10Var = this.d;
        if (i7 < size && i10 < h10Var.e.size()) {
            return ((org.telegram.messenger.s3) arrayList.get(i7)).equals(h10Var.e.get(i10));
        }
        int size2 = i7 - arrayList.size();
        int size3 = i10 - h10Var.e.size();
        ArrayList arrayList2 = this.c;
        if (size3 < 0 || size3 >= h10Var.f.size() || size2 < 0 || size2 >= arrayList2.size()) {
            return org.telegram.messenger.ij.C1((i7 < arrayList.size() ? ((org.telegram.messenger.s3) arrayList.get(i7)).a : (TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.ij.C1((i10 < h10Var.e.size() ? ((org.telegram.messenger.s3) h10Var.e.get(i10)).a : (TLRPC.GroupCallParticipant) h10Var.f.get(size3)).peer);
        }
        return org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) arrayList2.get(size2)).peer) == org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) h10Var.f.get(size3)).peer);
    }

    @Override // v4.o
    public final int d() {
        h10 h10Var = this.d;
        return h10Var.f.size() + h10Var.e.size();
    }

    @Override // v4.o
    public final int e() {
        return this.c.size() + this.b.size();
    }
}
