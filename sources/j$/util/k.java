package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class k extends i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new i(this.c);
    }

    @Override // j$.util.i, java.util.List
    public final java.util.List subList(int i, int i2) {
        k kVar;
        synchronized (this.b) {
            kVar = new k(this.c.subList(i, i2), this.b);
        }
        return kVar;
    }
}
