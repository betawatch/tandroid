// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
