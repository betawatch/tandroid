package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class d3 {
    public final /* synthetic */ w3 a;

    public d3(w3 w3Var) {
        this.a = w3Var;
    }

    public final void a(a aVar) {
        w3 w3Var = this.a;
        ArrayList arrayList = w3Var.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !w3.x3(aVar)) {
            return;
        }
        int P3 = w3Var.P3(indexOf);
        if (P3 >= arrayList.size()) {
            P3 = arrayList.size() - 1;
        }
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.d();
        }
        while (P3 >= indexOf) {
            arrayList.remove(P3);
            P3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !w3.x3(aVar3) && !w3.E3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        w3Var.Y2.N(false);
        h2 h2Var2 = w3Var.J3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        if (aVar2 != null) {
            w3Var.post(new o2(w3Var, aVar2, 22));
        }
    }
}
