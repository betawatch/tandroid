package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
