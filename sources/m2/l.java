package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final l.d r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, j3, null);
        this.n = jVar;
        this.r = jVar == null ? new l.d(new j(0L, -1L, null), 4) : null;
    }

    @Override // m2.m
    public final String a() {
        return null;
    }

    @Override // m2.m
    public final l2.h d() {
        return this.r;
    }

    @Override // m2.m
    public final j f() {
        return this.n;
    }
}
