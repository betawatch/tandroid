package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(b1 b1Var) {
        w wVar = (w) this;
        int i10 = wVar.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int e7 = b1Var.e(this);
        wVar.memoizedSerializedSize = e7;
        return e7;
    }

    public abstract void c(j jVar);
}
