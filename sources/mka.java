// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mka extends xrb {
    public final short c;
    public final short d;

    public mka(xrb xrbVar, int i, int i2) {
        super(xrbVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // xrb
    public final void a(pk0 pk0Var, byte[] bArr) {
        pk0Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
