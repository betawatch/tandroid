package ji;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c3 {
    public final /* synthetic */ v3 a;

    public c3(v3 v3Var) {
        this.a = v3Var;
    }

    public final void a(a aVar) {
        v3 v3Var = this.a;
        ArrayList arrayList = v3Var.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !v3.w3(aVar)) {
            return;
        }
        int O3 = v3Var.O3(indexOf);
        if (O3 >= arrayList.size()) {
            O3 = arrayList.size() - 1;
        }
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        while (O3 >= indexOf) {
            arrayList.remove(O3);
            O3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !v3.w3(aVar3) && !v3.D3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        v3Var.Y2.N(false);
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        if (aVar2 != null) {
            v3Var.post(new n2(v3Var, aVar2, 22));
        }
    }
}
