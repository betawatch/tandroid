// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ed3 implements Comparable {
    public final boolean a;
    public final boolean b;

    public ed3(ko4 ko4Var, int i) {
        this.a = (ko4Var.e & 1) != 0;
        this.b = qu6.c(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ed3 ed3Var = (ed3) obj;
        return pp2.a.c(this.b, ed3Var.b).c(this.a, ed3Var.a).e();
    }
}
