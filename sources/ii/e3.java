package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e3 {
    public final /* synthetic */ x3 a;

    public e3(x3 x3Var) {
        this.a = x3Var;
    }

    public final void a(a aVar) {
        x3 x3Var = this.a;
        ArrayList arrayList = x3Var.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !x3.y3(aVar)) {
            return;
        }
        int Q3 = x3Var.Q3(indexOf);
        if (Q3 >= arrayList.size()) {
            Q3 = arrayList.size() - 1;
        }
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        while (Q3 >= indexOf) {
            arrayList.remove(Q3);
            Q3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !x3.y3(aVar3) && !x3.F3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        x3Var.W2.N(false);
        i2 i2Var2 = x3Var.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        if (aVar2 != null) {
            x3Var.post(new p2(x3Var, aVar2, 22));
        }
    }
}
