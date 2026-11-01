package m2;

import android.net.Uri;
import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final t r;

    public l(x xVar, n0 n0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) n0Var.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, null, j10);
        this.n = jVar;
        this.r = jVar == null ? new t(new j(0L, null, -1L), 0) : null;
    }

    @Override // m2.m
    public final String b() {
        return null;
    }

    @Override // m2.m
    public final l2.i d() {
        return this.r;
    }

    @Override // m2.m
    public final j h() {
        return this.n;
    }
}
