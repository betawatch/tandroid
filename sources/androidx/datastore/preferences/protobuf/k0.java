package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
