package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
