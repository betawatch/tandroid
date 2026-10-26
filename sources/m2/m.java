package m2;

import a8.yb;
import b2.x;
import e2.n0;
import f9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class m {
    public final x a;
    public final i0 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(x xVar, List list, s sVar, List list2, List list3, List list4) {
        yb.g(!list.isEmpty());
        this.a = xVar;
        this.b = i0.u(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.c;
        long j11 = sVar.b;
        String str = n0.a;
        this.c = n0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h c();

    public abstract j d();
}
