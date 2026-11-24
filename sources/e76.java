// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class e76 {
    public static final d76 a;
    public static final d76 b;

    static {
        gv8 gv8Var = gv8.c;
        d76 d76Var = null;
        try {
            d76Var = (d76) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = d76Var;
        b = new d76();
    }
}
