package j$.util.concurrent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class q extends k {
    public q e;
    public q f;
    public q g;
    public q h;
    public boolean i;

    public q(int i, Object obj, Object obj2, k kVar, q qVar) {
        super(i, obj, obj2, kVar);
        this.e = qVar;
    }

    @Override // j$.util.concurrent.k
    public final k a(int i, Object obj) {
        return b(i, obj, null);
    }

    public final q b(int i, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        do {
            q qVar = this.f;
            q qVar2 = this.g;
            int i2 = this.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = this.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return this;
                    }
                    if (qVar != null) {
                        if (qVar2 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i3 = ConcurrentHashMap.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        qVar = qVar2;
                                    }
                                }
                            }
                            q b = qVar2.b(i, obj, cls);
                            if (b != null) {
                                return b;
                            }
                        }
                    }
                }
                this = qVar2;
            }
            this = qVar;
        } while (this != null);
        return null;
    }
}
