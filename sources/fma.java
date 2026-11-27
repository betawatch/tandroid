// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fma extends xtb {
    public final short c;
    public final short d;

    public fma(xtb xtbVar, int i, int i2) {
        super(xtbVar);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // xtb
    public final void a(qj0 qj0Var, byte[] bArr) {
        qj0Var.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
