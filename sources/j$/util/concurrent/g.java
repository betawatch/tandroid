package j$.util.concurrent;

/* loaded from: classes2.dex */
final class g extends l {
    final l[] e;

    g(l[] lVarArr) {
        super(-1, null, null);
        this.e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    final l a(int i, Object obj) {
        int length;
        l k;
        Object obj2;
        l[] lVarArr = this.e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (k = ConcurrentHashMap.k(lVarArr, (length - 1) & i)) != null) {
            do {
                int i2 = k.a;
                if (i2 == i && ((obj2 = k.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return k;
                }
                if (i2 < 0) {
                    if (k instanceof g) {
                        lVarArr = ((g) k).e;
                    } else {
                        return k.a(i, obj);
                    }
                } else {
                    k = k.d;
                }
            } while (k != null);
        }
        return null;
    }
}
