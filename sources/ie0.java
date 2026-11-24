// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ie0 extends tn5 {
    public final /* synthetic */ byte e;

    @Override // tn5
    public final tg6 b() {
        switch (this.e) {
            case 0:
                int i = this.d + 1;
                this.d = i;
                bj6 bj6Var = this.a;
                bj6Var.g = i;
                if (bj6Var.d() != '[') {
                    return null;
                }
                this.d++;
                ugb e = e("![");
                bj6 bj6Var2 = this.a;
                sy0 sy0Var = bj6Var2.i;
                sy0 sy0Var2 = new sy0(e, i, sy0Var, bj6Var2.h, true);
                if (sy0Var != null) {
                    sy0Var.d = true;
                }
                bj6Var2.i = sy0Var2;
                return e;
            default:
                int i2 = this.d;
                this.d = i2 + 1;
                ugb e2 = e("[");
                bj6 bj6Var3 = this.a;
                sy0 sy0Var3 = bj6Var3.i;
                sy0 sy0Var4 = new sy0(e2, i2, sy0Var3, bj6Var3.h, false);
                if (sy0Var3 != null) {
                    sy0Var3.d = true;
                }
                bj6Var3.i = sy0Var4;
                return e2;
        }
    }

    @Override // tn5
    public final char c() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
