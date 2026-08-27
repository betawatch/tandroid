package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class u extends p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.p, java.util.List
    public final java.util.List subList(int i10, int i11) {
        return new u(this.b.subList(i10, i11));
    }

    private Object writeReplace() {
        return new p(this.b);
    }
}
