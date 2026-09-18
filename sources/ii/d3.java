package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        if (indexOf < 0 || !w3.y3(aVar)) {
            return;
        }
        int Q3 = w3Var.Q3(indexOf);
        if (Q3 >= arrayList.size()) {
            Q3 = arrayList.size() - 1;
        }
        h2 h2Var = w3Var.J3;
        if (h2Var != null) {
            h2Var.d();
        }
        while (Q3 >= indexOf) {
            arrayList.remove(Q3);
            Q3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !w3.y3(aVar3) && !w3.F3(aVar3.b)) {
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
