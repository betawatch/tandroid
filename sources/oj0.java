// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class oj0 extends xrb {
    public final int c;
    public final int d;

    public oj0(xrb xrbVar, int i, int i2) {
        super(xrbVar);
        this.c = i;
        this.d = i2;
    }

    @Override // xrb
    public final void a(pk0 pk0Var, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i >= i2) {
                return;
            }
            if (i == 0 || (i == 31 && i2 <= 62)) {
                pk0Var.b(31, 5);
                if (i2 > 62) {
                    pk0Var.b(i2 - 31, 16);
                } else if (i == 0) {
                    pk0Var.b(Math.min(i2, 31), 5);
                } else {
                    pk0Var.b(i2 - 31, 5);
                }
            }
            pk0Var.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
