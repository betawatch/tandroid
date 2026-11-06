package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g extends h {
    public final int e;
    public final int f;

    public g(byte[] bArr, int i7, int i10) {
        super(bArr);
        h.i(i7, i7 + i10, bArr.length);
        this.e = i7;
        this.f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte f(int i7) {
        int i10 = this.f;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.b[this.e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(jg.g.j(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a8.p0.m(i7, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final void k(int i7, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int l() {
        return this.e;
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte m(int i7) {
        return this.b[this.e + i7];
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int size() {
        return this.f;
    }
}
