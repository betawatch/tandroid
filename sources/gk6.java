// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gk6 {
    public static final fk6 a;
    public static final fk6 b;

    static {
        gv8 gv8Var = gv8.c;
        fk6 fk6Var = null;
        try {
            fk6Var = (fk6) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = fk6Var;
        b = new fk6();
    }
}
