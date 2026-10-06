package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
