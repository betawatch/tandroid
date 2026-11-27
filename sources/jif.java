// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
