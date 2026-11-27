package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
