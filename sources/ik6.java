// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class ik6 {
    public static final hk6 a;
    public static final hk6 b;

    static {
        ow8 ow8Var = ow8.c;
        hk6 hk6Var = null;
        try {
            hk6Var = (hk6) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = hk6Var;
        b = new hk6();
    }
}
