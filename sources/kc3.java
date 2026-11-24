// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kc3 extends qc3 implements Comparable {
    public final int e;
    public final int f;

    public kc3(int i, sxb sxbVar, int i2, nc3 nc3Var, int i3) {
        super(i, sxbVar, i2);
        int i4;
        this.e = ls6.c(i3, nc3Var.B0) ? 1 : 0;
        fm4 fm4Var = this.d;
        int i5 = fm4Var.A;
        int i6 = -1;
        if (i5 != -1 && (i4 = fm4Var.B) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // qc3
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((kc3) obj).f);
    }
}
