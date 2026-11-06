package da;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i1 {
    public k1 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.e == 1 && (k1Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new j1(k1Var, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb2.append(" parameterKey");
        }
        if (this.c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
