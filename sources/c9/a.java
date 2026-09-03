package c9;

import j7.k5;
import java.util.HashSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        hashSet.add(t.a(cls));
        for (Class cls2 : clsArr) {
            k5.a(cls2, "Null interface");
            ((HashSet) this.d).add(t.a(cls2));
        }
    }

    public void a(l lVar) {
        if (((HashSet) this.d).contains(lVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(lVar);
    }

    public b b() {
        if (((e) this.g) != null) {
            return new b((String) this.a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.b, this.c, (e) this.g, (HashSet) this.f);
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
