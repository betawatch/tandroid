// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m95 extends qie {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ p95 c;

    public m95(p95 p95Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = p95Var;
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override // qie
    public final boolean a(int i, int i2) {
        return true;
    }

    @Override // qie
    public final boolean b(int i, int i2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        p95 p95Var = this.c;
        if (i < size && i2 < p95Var.e.size()) {
            return ((wc2) arrayList.get(i)).equals(p95Var.e.get(i2));
        }
        int size2 = i - arrayList.size();
        ArrayList arrayList2 = p95Var.e;
        ArrayList arrayList3 = p95Var.e;
        ArrayList arrayList4 = p95Var.f;
        int size3 = i2 - arrayList2.size();
        ArrayList arrayList5 = this.b;
        if (size3 < 0 || size3 >= arrayList4.size() || size2 < 0 || size2 >= arrayList5.size()) {
            return r47.B1((i < arrayList.size() ? ((wc2) arrayList.get(i)).a : (TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == r47.B1((i2 < arrayList3.size() ? ((wc2) arrayList3.get(i2)).a : (TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer);
        }
        return r47.B1(((TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == r47.B1(((TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer);
    }

    @Override // qie
    public final int c() {
        p95 p95Var = this.c;
        return p95Var.f.size() + p95Var.e.size();
    }

    @Override // qie
    public final int d() {
        return this.b.size() + this.a.size();
    }
}
