package m2;

import android.net.Uri;
import b2.w;
import e9.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final l2.f r;

    public l(w wVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(wVar, n0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) n0Var.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new l2.f(new j(0L, -1L, null), 2) : null;
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // m2.m
    public final l2.i c() {
        return this.r;
    }

    @Override // m2.m
    public final j h() {
        return this.n;
    }
}
