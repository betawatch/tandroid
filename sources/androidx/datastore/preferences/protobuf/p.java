package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
