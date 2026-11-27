// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h90 {
    public j90 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final i90 a() {
        j90 j90Var;
        String str;
        String str2;
        if (this.e == 1 && (j90Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new i90(j90Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
