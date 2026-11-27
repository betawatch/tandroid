// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jif extends nif {
    @Override // nif
    public final byte h(int i) {
        if (((47 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(qd4.n(i, "Index > length: ", ", 47"));
    }

    @Override // nif
    public final byte i(int i) {
        return this.b[i];
    }

    @Override // nif
    public final int j() {
        return 47;
    }
}
