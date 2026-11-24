// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class oi0 extends wpb {
    public final int c;
    public final int d;

    public oi0(wpb wpbVar, int i, int i2) {
        super(wpbVar);
        this.c = i;
        this.d = i2;
    }

    @Override // wpb
    public final void a(pj0 pj0Var, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i >= i2) {
                return;
            }
            if (i == 0 || (i == 31 && i2 <= 62)) {
                pj0Var.b(31, 5);
                if (i2 > 62) {
                    pj0Var.b(i2 - 31, 16);
                } else if (i == 0) {
                    pj0Var.b(Math.min(i2, 31), 5);
                } else {
                    pj0Var.b(i2 - 31, 5);
                }
            }
            pj0Var.b(bArr[this.c + i], 8);
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
