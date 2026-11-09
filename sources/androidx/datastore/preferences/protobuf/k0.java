package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
