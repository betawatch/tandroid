package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u0 implements c1 {
    public final a a;
    public final k1 b;
    public final o c;

    public u0(k1 k1Var, o oVar, a aVar) {
        this.b = k1Var;
        oVar.getClass();
        this.c = oVar;
        this.a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final Object a() {
        return ((v) ((x) this.a).d(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void b(Object obj, l0 l0Var) {
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void c(Object obj) {
        this.b.getClass();
        ((x) obj).unknownFields.e = false;
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final int d(a aVar) {
        this.b.getClass();
        j1 j1Var = ((x) aVar).unknownFields;
        int i10 = j1Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < j1Var.a; i12++) {
            int i13 = j1Var.b[i12] >>> 3;
            g gVar = (g) j1Var.c[i12];
            i11 += k.r(3, gVar) + k.z(i13) + k.y(2) + (k.y(1) * 2);
        }
        j1Var.d = i11;
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean e(Object obj) {
        this.c.getClass();
        android.support.v4.media.a.v(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void f(x xVar, x xVar2) {
        d1.w(this.b, xVar, xVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final int g(x xVar) {
        this.b.getClass();
        return xVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final boolean h(x xVar, x xVar2) {
        this.b.getClass();
        return xVar.unknownFields.equals(xVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.c1
    public final void i(Object obj, i iVar, n nVar) {
        this.b.getClass();
        x xVar = (x) obj;
        if (xVar.unknownFields == j1.f) {
            xVar.unknownFields = j1.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
