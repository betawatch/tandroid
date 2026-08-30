package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class p {
    public static final o a = new o();
    public static final o b;

    static {
        o oVar = null;
        try {
            oVar = (o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = oVar;
    }
}
