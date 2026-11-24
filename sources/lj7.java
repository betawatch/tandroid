// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class lj7 {
    public static final kj7 a;
    public static final kj7 b;

    static {
        ft8 ft8Var = ft8.c;
        kj7 kj7Var = null;
        try {
            kj7Var = (kj7) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = kj7Var;
        b = new kj7();
    }
}
