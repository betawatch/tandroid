// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ccb extends IllegalStateException {
    public final byte a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ccb(int i, int i2) {
        super(r0);
        String o;
        if (i == 0) {
            o = td4.o(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            o = td4.o(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            o = td4.o(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            o = td4.o(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                rjb.h();
                throw null;
            }
            o = td4.o(i2, "Player stuck suppressed for ", " ms");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ccb.class != obj.getClass()) {
            return false;
        }
        ccb ccbVar = (ccb) obj;
        return this.a == ccbVar.a && this.b == ccbVar.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
