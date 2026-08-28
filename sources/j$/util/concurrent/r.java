package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class r extends l {
    public r e;
    public r f;
    public r g;
    public r h;
    public boolean i;

    public r(int i9, Object obj, Object obj2, l lVar, r rVar) {
        super(i9, obj, obj2, lVar);
        this.e = rVar;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i9, Object obj) {
        return b(i9, obj, null);
    }

    public final r b(int i9, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        r rVar = this;
        do {
            r rVar2 = rVar.f;
            r rVar3 = rVar.g;
            int i10 = rVar.a;
            if (i10 <= i9) {
                if (i10 >= i9) {
                    Object obj2 = rVar.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i11 = ConcurrentHashMap.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        rVar2 = rVar3;
                                    }
                                }
                            }
                            r b10 = rVar3.b(i9, obj, cls);
                            if (b10 != null) {
                                return b10;
                            }
                        }
                    }
                }
                rVar = rVar3;
            }
            rVar = rVar2;
        } while (rVar != null);
        return null;
    }
}
