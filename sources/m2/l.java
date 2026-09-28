package m2;

import android.net.Uri;
import e9.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
        this.r = jVar == null ? new l.d(new j(0L, -1L, null)) : null;
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
    public final j e() {
        return this.n;
    }
}
