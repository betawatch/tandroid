package ii;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class e3 {
    public final /* synthetic */ x3 a;

    public e3(x3 x3Var) {
        this.a = x3Var;
    }

    public final void a(a aVar) {
        x3 x3Var = this.a;
        ArrayList arrayList = x3Var.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !x3.x3(aVar)) {
            return;
        }
        int P3 = x3Var.P3(indexOf);
        if (P3 >= arrayList.size()) {
            P3 = arrayList.size() - 1;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        while (P3 >= indexOf) {
            arrayList.remove(P3);
            P3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !x3.x3(aVar3) && !x3.E3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        x3Var.Y2.N(false);
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        if (aVar2 != null) {
            x3Var.post(new p2(x3Var, aVar2, 22));
        }
    }
}
