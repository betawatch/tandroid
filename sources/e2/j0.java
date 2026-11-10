package e2;

import c8.tc;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j0 {
    public int a;
    public int b;
    public Object c;
    public Object d = null;
    public Object e;
    public Object f;
    public Object g;

    public j0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(u9.r.a(cls));
        for (Class cls2 : clsArr) {
            tc.a(cls2, "Null interface");
            ((HashSet) this.c).add(u9.r.a(cls2));
        }
    }

    public void a(u9.j jVar) {
        if (((HashSet) this.c).contains(jVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(jVar);
    }

    public u9.a b() {
        if (((u9.d) this.f) != null) {
            return new u9.a((String) this.d, new HashSet((HashSet) this.c), new HashSet((HashSet) this.e), this.a, this.b, (u9.d) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i7) {
        if (!(this.a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.a = i7;
    }
}
