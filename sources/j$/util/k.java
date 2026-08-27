package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class k extends i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.i, java.util.List
    public final java.util.List subList(int i10, int i11) {
        k kVar;
        synchronized (this.b) {
            kVar = new k(this.c.subList(i10, i11), this.b);
        }
        return kVar;
    }

    private Object writeReplace() {
        return new i(this.c);
    }
}
