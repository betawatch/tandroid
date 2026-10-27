package b2;

import java.util.HashSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class n0 {
    public int a;
    public int b;
    public Object c;
    public Object d = null;
    public Object e;
    public Object f;
    public Object g;

    public n0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.c = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.g = new HashSet();
        hashSet.add(s9.s.a(cls));
        for (Class cls2 : clsArr) {
            com.google.android.gms.internal.play_billing.s1.a(cls2, "Null interface");
            ((HashSet) this.c).add(s9.s.a(cls2));
        }
    }

    public void a(s9.k kVar) {
        if (((HashSet) this.c).contains(kVar.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(kVar);
    }

    public s9.a b() {
        if (((s9.d) this.f) != null) {
            return new s9.a((String) this.d, new HashSet((HashSet) this.c), new HashSet((HashSet) this.e), this.a, this.b, (s9.d) this.f, (HashSet) this.g);
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
