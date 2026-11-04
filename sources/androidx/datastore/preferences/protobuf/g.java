package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends h {
    public final int e;
    public final int f;

    public g(byte[] bArr, int i3, int i10) {
        super(bArr);
        h.i(i3, i3 + i10, bArr.length);
        this.e = i3;
        this.f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte h(int i3) {
        int i10 = this.f;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.b[this.e + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(k2.p1.i(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.n(i3, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final void k(int i3, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int l() {
        return this.e;
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte m(int i3) {
        return this.b[this.e + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int size() {
        return this.f;
    }
}
