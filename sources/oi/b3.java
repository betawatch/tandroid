package oi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b3 {
    public final /* synthetic */ s3 a;

    public b3(s3 s3Var) {
        this.a = s3Var;
    }

    public final void a(a aVar) {
        s3 s3Var = this.a;
        ArrayList arrayList = s3Var.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !s3.A3(aVar)) {
            return;
        }
        int S3 = s3Var.S3(indexOf);
        if (S3 >= arrayList.size()) {
            S3 = arrayList.size() - 1;
        }
        e2 e2Var = s3Var.R3;
        if (e2Var != null) {
            e2Var.d();
        }
        while (S3 >= indexOf) {
            arrayList.remove(S3);
            S3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !s3.A3(aVar3) && !s3.H3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        s3Var.g3.O(false);
        e2 e2Var2 = s3Var.R3;
        if (e2Var2 != null) {
            e2Var2.h();
        }
        if (aVar2 != null) {
            s3Var.post(new l2(s3Var, aVar2, 22));
        }
    }
}
