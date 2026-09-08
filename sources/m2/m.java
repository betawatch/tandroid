package m2;

import e2.d0;
import e9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class m {
    public final b2.s a;
    public final i0 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(b2.s sVar, List list, s sVar2, List list2, List list3, List list4) {
        e2.d.b(!list.isEmpty());
        this.a = sVar;
        this.b = i0.v(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar2.a(this);
        long j3 = sVar2.c;
        long j10 = sVar2.b;
        String str = d0.a;
        this.c = d0.Y(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract l2.h d();

    public abstract j h();
}
