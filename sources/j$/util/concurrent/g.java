package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class g extends l {
    public final l[] e;

    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i9, Object obj) {
        l k10;
        Object obj2;
        l[] lVarArr = this.e;
        loop0: while (true) {
            int length = lVarArr.length;
            if (length == 0 || (k10 = ConcurrentHashMap.k(lVarArr, (length - 1) & i9)) == null) {
                return null;
            }
            do {
                int i10 = k10.a;
                if (i10 != i9 || ((obj2 = k10.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i10 < 0) {
                        if (k10 instanceof g) {
                            lVarArr = ((g) k10).e;
                        } else {
                            return k10.a(i9, obj);
                        }
                    } else {
                        k10 = k10.d;
                    }
                }
            } while (k10 != null);
            return null;
        }
        return k10;
    }
}
