package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class o {
    public static final n a = new n();
    public static final n b;

    static {
        n nVar = null;
        try {
            nVar = (n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = nVar;
    }
}
