package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
