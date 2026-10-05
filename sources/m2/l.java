package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final a4.m r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, j3, null);
        this.n = jVar;
        this.r = jVar == null ? new a4.m(new j(0L, -1L, null), 29) : null;
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
    public final j d() {
        return this.n;
    }
}
