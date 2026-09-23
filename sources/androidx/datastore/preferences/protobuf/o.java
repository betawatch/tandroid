package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
