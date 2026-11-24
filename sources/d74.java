// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class d74 {
    public static final c74 a = new c74();
    public static final c74 b;

    static {
        ft8 ft8Var = ft8.c;
        c74 c74Var = null;
        try {
            c74Var = (c74) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = c74Var;
    }
}
