// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gge {
    public static Exception a(h1 h1Var, String str, Exception exc) {
        if (exc instanceof l23) {
            return new l23(h1Var, str);
        }
        if (exc instanceof bv4) {
            return new bv4(h1Var, str);
        }
        throw new kr4();
    }
}
