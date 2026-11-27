// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
