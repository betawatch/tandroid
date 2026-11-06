package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class r {
    public static final q a = new q();
    public static final q b;

    static {
        y0 y0Var = y0.c;
        q qVar = null;
        try {
            qVar = (q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = qVar;
    }
}
