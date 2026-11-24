// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class m84 {
    public static final l84 a = new l84();
    public static final l84 b;

    static {
        gv8 gv8Var = gv8.c;
        l84 l84Var = null;
        try {
            l84Var = (l84) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = l84Var;
    }
}
