package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
