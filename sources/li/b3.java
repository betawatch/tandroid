package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class b3 {
    public final /* synthetic */ t3 a;

    public b3(t3 t3Var) {
        this.a = t3Var;
    }

    public final void a(a aVar) {
        t3 t3Var = this.a;
        ArrayList arrayList = t3Var.s3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !t3.A3(aVar)) {
            return;
        }
        int S3 = t3Var.S3(indexOf);
        if (S3 >= arrayList.size()) {
            S3 = arrayList.size() - 1;
        }
        f2 f2Var = t3Var.Q3;
        if (f2Var != null) {
            f2Var.d();
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
        t3Var.f3.O(false);
        f2 f2Var2 = t3Var.Q3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        if (aVar2 != null) {
            t3Var.post(new m2(t3Var, aVar2, 22));
        }
    }
}
