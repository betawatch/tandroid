package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class u extends p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new p(this.b);
    }

    @Override // j$.util.p, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new u(this.b.subList(i, i2));
    }
}
