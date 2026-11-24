// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k75 extends zde {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ n75 c;

    public k75(n75 n75Var, ArrayList arrayList, ArrayList arrayList2) {
        this.c = n75Var;
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override // zde
    public final boolean a(int i, int i2) {
        return true;
    }

    @Override // zde
    public final boolean b(int i, int i2) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        n75 n75Var = this.c;
        if (i < size && i2 < n75Var.e.size()) {
            return ((gc2) arrayList.get(i)).equals(n75Var.e.get(i2));
        }
        int size2 = i - arrayList.size();
        ArrayList arrayList2 = n75Var.e;
        ArrayList arrayList3 = n75Var.e;
        ArrayList arrayList4 = n75Var.f;
        int size3 = i2 - arrayList2.size();
        ArrayList arrayList5 = this.b;
        if (size3 < 0 || size3 >= arrayList4.size() || size2 < 0 || size2 >= arrayList5.size()) {
            return k27.B1((i < arrayList.size() ? ((gc2) arrayList.get(i)).a : (TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == k27.B1((i2 < arrayList3.size() ? ((gc2) arrayList3.get(i2)).a : (TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer);
        }
        return k27.B1(((TLRPC.GroupCallParticipant) arrayList5.get(size2)).peer) == k27.B1(((TLRPC.GroupCallParticipant) arrayList4.get(size3)).peer);
    }

    @Override // zde
    public final int c() {
        n75 n75Var = this.c;
        return n75Var.f.size() + n75Var.e.size();
    }

    @Override // zde
    public final int d() {
        return this.b.size() + this.a.size();
    }
}
