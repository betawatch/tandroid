// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class if0 extends tp5 {
    public final /* synthetic */ byte e;

    @Override // tp5
    public final ui6 b() {
        switch (this.e) {
            case 0:
                int i = this.d + 1;
                this.d = i;
                el6 el6Var = this.a;
                el6Var.g = i;
                if (el6Var.d() != '[') {
                    return null;
                }
                this.d++;
                vib e = e("![");
                el6 el6Var2 = this.a;
                zz0 zz0Var = el6Var2.i;
                zz0 zz0Var2 = new zz0(e, i, zz0Var, el6Var2.h, true);
                if (zz0Var != null) {
                    zz0Var.d = true;
                }
                el6Var2.i = zz0Var2;
                return e;
            default:
                int i2 = this.d;
                this.d = i2 + 1;
                vib e2 = e("[");
                el6 el6Var3 = this.a;
                zz0 zz0Var3 = el6Var3.i;
                zz0 zz0Var4 = new zz0(e2, i2, zz0Var3, el6Var3.h, false);
                if (zz0Var3 != null) {
                    zz0Var3.d = true;
                }
                el6Var3.i = zz0Var4;
                return e2;
        }
    }

    @Override // tp5
    public final char c() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
