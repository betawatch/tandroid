package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
