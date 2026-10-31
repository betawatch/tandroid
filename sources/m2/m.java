package m2;

import b2.x;
import e2.l0;
import e9.n0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class m {
    public final x a;
    public final n0 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(x xVar, List list, s sVar, List list2, List list3, List list4) {
        t6.f(!list.isEmpty());
        this.a = xVar;
        this.b = n0.u(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        long j10 = sVar.c;
        long j11 = sVar.b;
        String str = l0.a;
        this.c = l0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.i d();

    public abstract j h();
}
