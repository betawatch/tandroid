package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;
import k2.g0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final g0 r;

    public l(b2.s sVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, j3, null);
        this.n = jVar;
        this.r = jVar == null ? new g0(new j(0L, -1L, null), 2) : null;
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // m2.m
    public final l2.h d() {
        return this.r;
    }

    @Override // m2.m
    public final j h() {
        return this.n;
    }
}
