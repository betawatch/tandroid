package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class i extends g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.g, java.util.List
    public final java.util.List subList(int i, int i2) {
        i iVar;
        synchronized (this.b) {
            iVar = new i(this.c.subList(i, i2), this.b);
        }
        return iVar;
    }

    private Object writeReplace() {
        return new g(this.c);
    }
}
