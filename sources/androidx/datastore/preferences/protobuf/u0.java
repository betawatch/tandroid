package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u0 implements b1 {
    public final a a;
    public final i1 b;
    public final q c;

    public u0(i1 i1Var, q qVar, a aVar) {
        this.b = i1Var;
        qVar.getClass();
        this.c = qVar;
        this.a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final z a() {
        a aVar = this.a;
        return aVar instanceof z ? ((z) aVar).i() : ((x) ((z) aVar).c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void b(Object obj, Object obj2) {
        c1.k(this.b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void c(Object obj, l0 l0Var) {
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void d(Object obj) {
        this.b.getClass();
        h1 h1Var = ((z) obj).unknownFields;
        if (h1Var.e) {
            h1Var.e = false;
        }
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean e(Object obj) {
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int f(z zVar) {
        this.b.getClass();
        h1 h1Var = zVar.unknownFields;
        int i7 = h1Var.d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < h1Var.a; i11++) {
            int i12 = h1Var.b[i11] >>> 3;
            i10 += m.g(3, (h) h1Var.c[i11]) + m.j(i12) + m.i(2) + (m.i(1) * 2);
        }
        h1Var.d = i10;
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int g(z zVar) {
        this.b.getClass();
        return zVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean h(z zVar, z zVar2) {
        this.b.getClass();
        return zVar.unknownFields.equals(zVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void i(Object obj, d4.f fVar, p pVar) {
        this.b.getClass();
        i1.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
