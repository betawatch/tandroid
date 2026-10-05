package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class j0 implements q0 {
    public q0[] a;

    @Override // androidx.datastore.preferences.protobuf.q0
    public final a1 a(Class cls) {
        for (q0 q0Var : this.a) {
            if (q0Var.b(cls)) {
                return q0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean b(Class cls) {
        for (q0 q0Var : this.a) {
            if (q0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
