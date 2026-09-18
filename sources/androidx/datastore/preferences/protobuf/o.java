package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
