package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
