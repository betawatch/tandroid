package m2;

import android.net.Uri;
import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
import ji.w4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final w4 r;

    public l(x xVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) n0Var.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new w4(new j(0L, -1L, null), 6) : null;
    }

    @Override // m2.m
    public final String a() {
        return null;
    }

    @Override // m2.m
    public final l2.i d() {
        return this.r;
    }

    @Override // m2.m
    public final j f() {
        return this.n;
    }
}
