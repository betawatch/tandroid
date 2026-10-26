package m2;

import android.net.Uri;
import b2.x;
import f9.i0;
import java.util.ArrayList;
import java.util.List;
import jg.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final s0 r;

    public l(x xVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new s0(new j(0L, -1L, null), 9) : null;
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // m2.m
    public final l2.h c() {
        return this.r;
    }

    @Override // m2.m
    public final j d() {
        return this.n;
    }
}
