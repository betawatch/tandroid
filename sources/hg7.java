// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hg7 {
    public final qg7 a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ pm3 e;

    public hg7(pm3 pm3Var, qg7 qg7Var, int i, int i2, int i3) {
        this.e = pm3Var;
        this.a = qg7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        qg7 qg7Var = this.a;
        qg7 qg7Var2 = qg7.h;
        int i = this.d;
        if (qg7Var != qg7Var2) {
            return i;
        }
        vh4 vh4Var = (vh4) this.e.c;
        xs3 xs3Var = (xs3) vh4Var.c;
        String str = (String) vh4Var.b;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(xs3Var.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        qg7 qg7Var = this.a;
        sb.append(qg7Var);
        sb.append('(');
        vh4 vh4Var = (vh4) this.e.c;
        if (qg7Var == qg7.n) {
            xs3 xs3Var = (xs3) vh4Var.c;
            sb.append(xs3Var.a[this.c].charset().displayName());
        } else {
            String str = (String) vh4Var.b;
            int i = this.d;
            int i2 = this.b;
            String substring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < substring.length(); i3++) {
                if (substring.charAt(i3) < ' ' || substring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(substring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
