package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        int d = b1Var.d(this);
        wVar.memoizedSerializedSize = d;
        return d;
    }

    public abstract void c(j jVar);
}
