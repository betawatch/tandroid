// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class lc3 implements Comparable {
    public final boolean a;
    public final boolean b;

    public lc3(fm4 fm4Var, int i) {
        this.a = (fm4Var.e & 1) != 0;
        this.b = ls6.c(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lc3 lc3Var = (lc3) obj;
        return wo2.a.c(this.b, lc3Var.b).c(this.a, lc3Var.a).e();
    }
}
