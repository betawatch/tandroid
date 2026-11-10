package j$.util.concurrent;

/* loaded from: classes2.dex */
public final class g extends k {
    public final k[] e;

    public g(k[] kVarArr) {
        super(-1, null, null);
        this.e = kVarArr;
    }

    @Override // j$.util.concurrent.k
    public final k a(int i7, Object obj) {
        k k10;
        Object obj2;
        k[] kVarArr = this.e;
        loop0: while (true) {
            int length = kVarArr.length;
            if (length == 0 || (k10 = ConcurrentHashMap.k(kVarArr, (length - 1) & i7)) == null) {
                return null;
            }
            do {
                int i10 = k10.a;
                if (i10 != i7 || ((obj2 = k10.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i10 < 0) {
                        if (k10 instanceof g) {
                            kVarArr = ((g) k10).e;
                        } else {
                            return k10.a(i7, obj);
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
