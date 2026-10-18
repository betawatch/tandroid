package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
