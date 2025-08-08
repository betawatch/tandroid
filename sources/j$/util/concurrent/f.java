package j$.util.concurrent;

/* loaded from: classes2.dex */
final class f extends k {
    final k[] e;

    f(k[] kVarArr) {
        super(-1, null, null, null);
        this.e = kVarArr;
    }

    @Override // j$.util.concurrent.k
    final k a(Object obj, int i) {
        int length;
        k l;
        Object obj2;
        k[] kVarArr = this.e;
        loop0: while (obj != null && kVarArr != null && (length = kVarArr.length) != 0 && (l = ConcurrentHashMap.l(kVarArr, (length - 1) & i)) != null) {
            do {
                int i2 = l.a;
                if (i2 == i && ((obj2 = l.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return l;
                }
                if (i2 < 0) {
                    if (l instanceof f) {
                        kVarArr = ((f) l).e;
                    } else {
                        return l.a(obj, i);
                    }
                } else {
                    l = l.d;
                }
            } while (l != null);
        }
        return null;
    }
}
