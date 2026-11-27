// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class i76 {
    public static final h76 a;
    public static final h76 b;

    static {
        ow8 ow8Var = ow8.c;
        h76 h76Var = null;
        try {
            h76Var = (h76) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h76Var;
        b = new h76();
    }
}
