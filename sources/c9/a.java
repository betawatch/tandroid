package c9;

import j7.j5;
import java.util.HashSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a {
    public Object a = null;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet.add(u.a(cls));
        for (Class cls2 : clsArr) {
            j5.a(cls2, "Null interface");
            ((HashSet) this.d).add(u.a(cls2));
        }
    }

    public void a(m mVar) {
        if (((HashSet) this.d).contains(mVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(mVar);
    }

    public b b() {
        if (((f) this.g) != null) {
            return new b((String) this.a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.b, this.c, (f) this.g, (HashSet) this.f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.b = i10;
    }
}
