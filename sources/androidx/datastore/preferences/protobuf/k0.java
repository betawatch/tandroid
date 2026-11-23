package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class k0 implements r0 {
    public r0[] a;

    @Override // androidx.datastore.preferences.protobuf.r0
    public final a1 a(Class cls) {
        for (r0 r0Var : this.a) {
            if (r0Var.b(cls)) {
                return r0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean b(Class cls) {
        for (r0 r0Var : this.a) {
            if (r0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
