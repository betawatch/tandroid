package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class q extends k {
    public q e;
    public q f;
    public q g;
    public q h;
    public boolean i;

    public q(int i7, Object obj, Object obj2, k kVar, q qVar) {
        super(i7, obj, obj2, kVar);
        this.e = qVar;
    }

    @Override // j$.util.concurrent.k
    public final k a(int i7, Object obj) {
        return b(i7, obj, null);
    }

    public final q b(int i7, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        q qVar = this;
        do {
            q qVar2 = qVar.f;
            q qVar3 = qVar.g;
            int i10 = qVar.a;
            if (i10 <= i7) {
                if (i10 >= i7) {
                    Object obj2 = qVar.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return qVar;
                    }
                    if (qVar2 != null) {
                        if (qVar3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i11 = ConcurrentHashMap.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        qVar2 = qVar3;
                                    }
                                }
                            }
                            q b10 = qVar3.b(i7, obj, cls);
                            if (b10 != null) {
                                return b10;
                            }
                        }
                    }
                }
                qVar = qVar3;
            }
            qVar = qVar2;
        } while (qVar != null);
        return null;
    }
}
