package j$.util.concurrent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class g extends k {
    public final k[] e;

    public g(k[] kVarArr) {
        super(-1, null, null);
        this.e = kVarArr;
    }

    @Override // j$.util.concurrent.k
    public final k a(int i, Object obj) {
        int length;
        k k;
        Object obj2;
        loop0: while (true) {
            k[] kVarArr = this.e;
            if (kVarArr == null || (length = kVarArr.length) == 0 || (k = ConcurrentHashMap.k(kVarArr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = k.a;
                if (i2 != i || ((obj2 = k.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i2 >= 0) {
                        k = k.d;
                    } else {
                        if (!(k instanceof g)) {
                            return k.a(i, obj);
                        }
                        this = (g) k;
                    }
                }
            } while (k != null);
            return null;
        }
        return k;
    }
}
