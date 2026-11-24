// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j95 extends age {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ m95 c;

    public j95(m95 m95Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = m95Var;
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override // age
    public final boolean a(int i, int i2) {
        return true;
    }

    @Override // age
    public final boolean b(int i, int i2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        m95 m95Var = this.c;
        if (i < size && i2 < m95Var.e.size()) {
            return ((rd2) arrayList.get(i)).equals(m95Var.e.get(i2));
        }
        int size2 = i - arrayList.size();
        ArrayList arrayList2 = m95Var.e;
        ArrayList arrayList3 = m95Var.e;
        ArrayList arrayList4 = m95Var.f;
        int size3 = i2 - arrayList2.size();
        ArrayList arrayList5 = this.b;
        if (size3 < 0 || size3 >= arrayList4.size() || size2 < 0 || size2 >= arrayList5.size()) {
            return k47.B1((i < arrayList.size() ? ((rd2) arrayList.get(i)).a : (TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == k47.B1((i2 < arrayList3.size() ? ((rd2) arrayList3.get(i2)).a : (TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer);
        }
        return k47.B1(((TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == k47.B1(((TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer);
    }

    @Override // age
    public final int c() {
        m95 m95Var = this.c;
        return m95Var.f.size() + m95Var.e.size();
    }

    @Override // age
    public final int d() {
        return this.b.size() + this.a.size();
    }
}
