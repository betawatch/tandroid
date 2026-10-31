package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
