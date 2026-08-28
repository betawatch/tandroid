package n4;

import d5.f0;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class m {
    public final t0 a;
    public final z b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(t0 t0Var, List list, s sVar, List list2, List list3, List list4) {
        d5.a.f(!list.isEmpty());
        this.a = t0Var;
        this.b = z.u(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        this.c = f0.O(sVar.c, 1000000L, sVar.b);
    }

    public abstract String b();

    public abstract m4.h c();

    public abstract j d();
}
