// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class e56 {
    public static final d56 a;
    public static final d56 b;

    static {
        ft8 ft8Var = ft8.c;
        d56 d56Var = null;
        try {
            d56Var = (d56) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = d56Var;
        b = new d56();
    }
}
