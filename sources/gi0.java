// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gi0 {
    public int a;
    public int b;
    public String c;

    public static h1 a() {
        h1 h1Var = new h1();
        h1Var.b = 0;
        h1Var.c = "";
        return h1Var;
    }

    public final String toString() {
        int i = this.a;
        int i2 = old.a;
        hnd hndVar = yfd.c;
        Integer valueOf = Integer.valueOf(i);
        return qd4.q("Response Code: ", (!hndVar.containsKey(valueOf) ? yfd.b : (yfd) hndVar.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
