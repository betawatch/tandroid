package o2;

import android.net.Uri;
import d2.v;
import g9.i0;
import gi.w5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final w5 r;

    public l(v vVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(vVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, null, j10);
        this.n = jVar;
        this.r = jVar == null ? new w5(new j(0L, null, -1L), 19) : null;
    }

    @Override // o2.m
    public final String a() {
        return null;
    }

    @Override // o2.m
    public final n2.i c() {
        return this.r;
    }

    @Override // o2.m
    public final j d() {
        return this.n;
    }
}
