package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class s extends n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.n, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new s(this.b.subList(i, i2));
    }

    private Object writeReplace() {
        return new n(this.b);
    }
}
