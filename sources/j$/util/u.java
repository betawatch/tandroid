package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
