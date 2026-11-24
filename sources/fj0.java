// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fj0 {
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
        int i2 = yid.a;
        skd skdVar = hdd.c;
        Integer valueOf = Integer.valueOf(i);
        return td4.r("Response Code: ", (!skdVar.containsKey(valueOf) ? hdd.b : (hdd) skdVar.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
