// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fi0 {
    public int a;
    public int b;
    public String c;

    public static g1 a() {
        g1 g1Var = new g1();
        g1Var.b = 0;
        g1Var.c = "";
        return g1Var;
    }

    public final String toString() {
        int i = this.a;
        int i2 = xgd.a;
        qid qidVar = fbd.c;
        Integer valueOf = Integer.valueOf(i);
        return tb4.q("Response Code: ", (!qidVar.containsKey(valueOf) ? fbd.b : (fbd) qidVar.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
