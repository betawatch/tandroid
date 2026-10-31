package la;

import ja.g;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d implements ka.a {
    public static final b f;
    public static final b h;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final c n = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [la.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [la.b] */
    static {
        final int i10 = 0;
        f = new ja.f() { // from class: la.b
            @Override // ja.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        h = new ja.f() { // from class: la.b
            @Override // ja.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, h);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, n);
        hashMap.remove(Date.class);
    }

    @Override // ka.a
    public final ka.a e(Class cls, ja.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
