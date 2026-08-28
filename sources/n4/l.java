package n4;

import android.net.Uri;
import h3.t0;
import java.util.ArrayList;
import java.util.List;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final n2.p r;

    public l(t0 t0Var, z zVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, rVar, arrayList, list, list2);
        Uri.parse(((b) zVar.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new n2.p(new j(0L, -1L, null), 1) : null;
    }

    @Override // n4.m
    public final String b() {
        return null;
    }

    @Override // n4.m
    public final m4.h c() {
        return this.r;
    }

    @Override // n4.m
    public final j d() {
        return this.n;
    }
}
