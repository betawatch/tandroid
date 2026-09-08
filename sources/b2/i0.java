package b2;

import java.util.HashSet;
import w7.o6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i0 {
    public int a;
    public int b;
    public Object c;
    public Object d = null;
    public Object e;
    public Object f;
    public Object g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(q9.r.a(cls));
        for (Class cls2 : clsArr) {
            o6.a(cls2, "Null interface");
            ((HashSet) this.c).add(q9.r.a(cls2));
        }
    }

    public void a(q9.j jVar) {
        if (((HashSet) this.c).contains(jVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(jVar);
    }

    public q9.a b() {
        if (((q9.d) this.f) != null) {
            return new q9.a((String) this.d, new HashSet((HashSet) this.c), new HashSet((HashSet) this.e), this.a, this.b, (q9.d) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.a = i10;
    }
}
