// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eud extends zud {
    public final int d;

    public eud(int i, byte[] bArr) {
        super(bArr);
        zud.k(0, i, bArr.length);
        this.d = i;
    }

    @Override // zud
    public final byte h(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(de9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b00.g(i, i2, "Index > length: ", ", "));
    }

    @Override // zud
    public final byte i(int i) {
        return this.b[i];
    }

    @Override // zud
    public final int j() {
        return this.d;
    }
}
