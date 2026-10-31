package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class l3 {
    public final /* synthetic */ d4 a;

    public l3(d4 d4Var) {
        this.a = d4Var;
    }

    public final void a(a aVar) {
        d4 d4Var = this.a;
        ArrayList arrayList = d4Var.s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !d4.A3(aVar)) {
            return;
        }
        int S3 = d4Var.S3(indexOf);
        if (S3 >= arrayList.size()) {
            S3 = arrayList.size() - 1;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        while (S3 >= indexOf) {
            arrayList.remove(S3);
            S3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !d4.A3(aVar3) && !d4.H3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        d4Var.f3.O(false);
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        if (aVar2 != null) {
            d4Var.post(new v2(d4Var, aVar2, 22));
        }
    }
}
