package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(c1 c1Var) {
        x xVar = (x) this;
        int i10 = xVar.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int d = c1Var.d(this);
        xVar.memoizedSerializedSize = d;
        return d;
    }

    public abstract void c(k kVar);
}
