// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
