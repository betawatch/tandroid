package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c3 {
    public final /* synthetic */ v3 a;

    public c3(v3 v3Var) {
        this.a = v3Var;
    }

    public final void a(a aVar) {
        v3 v3Var = this.a;
        ArrayList arrayList = v3Var.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !v3.D3(aVar)) {
            return;
        }
        int V3 = v3Var.V3(indexOf);
        if (V3 >= arrayList.size()) {
            V3 = arrayList.size() - 1;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        while (V3 >= indexOf) {
            arrayList.remove(V3);
            V3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !v3.D3(aVar3) && !v3.K3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        v3Var.g3.O(false);
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        if (aVar2 != null) {
            v3Var.post(new m2(v3Var, aVar2, 22));
        }
    }
}
