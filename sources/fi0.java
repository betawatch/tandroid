// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
