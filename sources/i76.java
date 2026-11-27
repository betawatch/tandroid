// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
