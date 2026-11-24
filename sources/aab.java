// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class aab extends IllegalStateException {
    public final byte a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aab(int i, int i2) {
        super(r0);
        String n;
        if (i == 0) {
            n = tb4.n(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            n = tb4.n(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            n = tb4.n(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            n = tb4.n(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                sdb.a();
                throw null;
            }
            n = tb4.n(i2, "Player stuck suppressed for ", " ms");
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aab.class != obj.getClass()) {
            return false;
        }
        aab aabVar = (aab) obj;
        return this.a == aabVar.a && this.b == aabVar.b;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
