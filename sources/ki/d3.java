package ki;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class d3 {
    public final /* synthetic */ w3 a;

    public d3(w3 w3Var) {
        this.a = w3Var;
    }

    public final void a(a aVar) {
        w3 w3Var = this.a;
        ArrayList arrayList = w3Var.m3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !w3.D3(aVar)) {
            return;
        }
        int V3 = w3Var.V3(indexOf);
        if (V3 >= arrayList.size()) {
            V3 = arrayList.size() - 1;
        }
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        while (V3 >= indexOf) {
            arrayList.remove(V3);
            V3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !w3.D3(aVar3) && !w3.K3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        w3Var.Z2.N(false);
        h2 h2Var2 = w3Var.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        if (aVar2 != null) {
            w3Var.post(new o2(w3Var, aVar2, 22));
        }
    }
}
