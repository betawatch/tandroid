package hi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g3 {
    public final /* synthetic */ z3 a;

    public g3(z3 z3Var) {
        this.a = z3Var;
    }

    public final void a(a aVar) {
        z3 z3Var = this.a;
        ArrayList arrayList = z3Var.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !z3.w3(aVar)) {
            return;
        }
        int O3 = z3Var.O3(indexOf);
        if (O3 >= arrayList.size()) {
            O3 = arrayList.size() - 1;
        }
        k2 k2Var = z3Var.J3;
        if (k2Var != null) {
            k2Var.d();
        }
        while (O3 >= indexOf) {
            arrayList.remove(O3);
            O3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !z3.w3(aVar3) && !z3.D3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        z3Var.Y2.N(false);
        k2 k2Var2 = z3Var.J3;
        if (k2Var2 != null) {
            k2Var2.h();
        }
        if (aVar2 != null) {
            z3Var.post(new r2(z3Var, aVar2, 22));
        }
    }
}
