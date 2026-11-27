// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
