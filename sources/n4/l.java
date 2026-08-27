package n4;

import android.net.Uri;
import h3.t0;
import java.util.ArrayList;
import java.util.List;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final n1.d r;

    public l(t0 t0Var, z zVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, rVar, arrayList, list, list2);
        Uri.parse(((b) zVar.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new n1.d(new j(0L, -1L, null), 2) : null;
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
