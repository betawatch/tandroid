package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class g extends l {
    public final l[] e;

    public g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    public final l a(int i10, Object obj) {
        l k9;
        Object obj2;
        l[] lVarArr = this.e;
        loop0: while (true) {
            int length = lVarArr.length;
            if (length == 0 || (k9 = ConcurrentHashMap.k(lVarArr, (length - 1) & i10)) == null) {
                return null;
            }
            do {
                int i11 = k9.a;
                if (i11 != i10 || ((obj2 = k9.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i11 < 0) {
                        if (k9 instanceof g) {
                            lVarArr = ((g) k9).e;
                        } else {
                            return k9.a(i10, obj);
                        }
                    } else {
                        k9 = k9.d;
                    }
                }
            } while (k9 != null);
            return null;
        }
        return k9;
    }
}
