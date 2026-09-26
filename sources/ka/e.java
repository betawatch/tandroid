package ka;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class e implements ja.a {
    public static final b f;
    public static final b g;
    public final HashMap a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a(0);
    public static final d h = new d();

    /* JADX WARN: Type inference failed for: r0v1, types: [ka.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ka.b] */
    static {
        final int i10 = 0;
        f = new ia.f() { // from class: ka.b
            @Override // ia.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((ia.g) obj2).b((String) obj);
                        break;
                    default:
                        ((ia.g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        g = new ia.f() { // from class: ka.b
            @Override // ia.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((ia.g) obj2).b((String) obj);
                        break;
                    default:
                        ((ia.g) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    @Override // ja.a
    public final ja.a a(Class cls, ia.d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
