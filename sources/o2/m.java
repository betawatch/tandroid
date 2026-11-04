package o2;

import b8.zb;
import d2.v;
import g2.n0;
import g9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class m {
    public final v a;
    public final i0 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(v vVar, List list, s sVar, List list2, List list3, List list4) {
        zb.f(!list.isEmpty());
        this.a = vVar;
        this.b = i0.q(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.c;
        long j11 = sVar.b;
        String str = n0.a;
        this.c = n0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract n2.i c();

    public abstract j d();
}
