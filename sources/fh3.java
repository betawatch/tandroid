// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fh3 extends ja {
    public final long c;

    public fh3(long j) {
        super(0, false);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh3) && this.c == ((fh3) obj).c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.c));
    }
}
