package mi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c3 {
    public final /* synthetic */ t3 a;

    public c3(t3 t3Var) {
        this.a = t3Var;
    }

    public final void a(a aVar) {
        t3 t3Var = this.a;
        ArrayList arrayList = t3Var.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !t3.A3(aVar)) {
            return;
        }
        int S3 = t3Var.S3(indexOf);
        if (S3 >= arrayList.size()) {
            S3 = arrayList.size() - 1;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        while (S3 >= indexOf) {
            arrayList.remove(S3);
            S3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !t3.A3(aVar3) && !t3.H3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        t3Var.g3.O(false);
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        if (aVar2 != null) {
            t3Var.post(new n2(t3Var, aVar2, 22));
        }
    }
}
