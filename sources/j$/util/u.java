package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
