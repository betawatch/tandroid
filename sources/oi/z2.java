package oi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class z2 {
    public final /* synthetic */ q3 a;

    public z2(q3 q3Var) {
        this.a = q3Var;
    }

    public final void a(a aVar) {
        q3 q3Var = this.a;
        ArrayList arrayList = q3Var.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !q3.A3(aVar)) {
            return;
        }
        int S3 = q3Var.S3(indexOf);
        if (S3 >= arrayList.size()) {
            S3 = arrayList.size() - 1;
        }
        d2 d2Var = q3Var.R3;
        if (d2Var != null) {
            d2Var.d();
        }
        while (S3 >= indexOf) {
            arrayList.remove(S3);
            S3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !q3.A3(aVar3) && !q3.H3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        q3Var.g3.O(false);
        d2 d2Var2 = q3Var.R3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        if (aVar2 != null) {
            q3Var.post(new k2(q3Var, aVar2, 22));
        }
    }
}
