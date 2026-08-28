package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(c1 c1Var) {
        x xVar = (x) this;
        int i9 = xVar.memoizedSerializedSize;
        if (i9 != -1) {
            return i9;
        }
        int d = c1Var.d(this);
        xVar.memoizedSerializedSize = d;
        return d;
    }

    public abstract void c(k kVar);
}
