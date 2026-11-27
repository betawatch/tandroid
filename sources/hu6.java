// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hu6 extends aw6 {
    public final String a;
    public final gu6 b;

    public hu6(String str, gu6 gu6Var) {
        this.a = str;
        this.b = gu6Var;
    }

    @Override // aw6
    public final void f(int i) {
        gu6 gu6Var;
        String str = this.a;
        if (str == null || (gu6Var = this.b) == null) {
            return;
        }
        gu6Var.q(i, str);
    }

    @Override // aw6
    public final void i(int i) {
        gu6 gu6Var;
        String str = this.a;
        if (str == null || (gu6Var = this.b) == null) {
            return;
        }
        gu6Var.r(i, str);
    }
}
