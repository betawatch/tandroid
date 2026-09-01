package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
