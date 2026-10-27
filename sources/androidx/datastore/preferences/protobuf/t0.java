package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t0 implements b1 {
    public final a a;
    public final j1 b;
    public final n c;

    public t0(j1 j1Var, n nVar, a aVar) {
        this.b = j1Var;
        nVar.getClass();
        this.c = nVar;
        this.a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final Object a() {
        return ((u) ((w) this.a).d(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void b(Object obj, k0 k0Var) {
        this.c.getClass();
        a1.g.B(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void c(Object obj) {
        this.b.getClass();
        ((w) obj).unknownFields.e = false;
        this.c.getClass();
        a1.g.B(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int d(a aVar) {
        this.b.getClass();
        i1 i1Var = ((w) aVar).unknownFields;
        int i10 = i1Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i1Var.a; i12++) {
            int i13 = i1Var.b[i12] >>> 3;
            i11 += j.r(3, (g) i1Var.c[i12]) + j.z(i13) + j.y(2) + (j.y(1) * 2);
        }
        i1Var.d = i11;
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean e(Object obj) {
        this.c.getClass();
        a1.g.B(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void f(Object obj, e2.f fVar, m mVar) {
        this.b.getClass();
        w wVar = (w) obj;
        if (wVar.unknownFields == i1.f) {
            wVar.unknownFields = i1.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void g(w wVar, w wVar2) {
        c1.w(this.b, wVar, wVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int h(w wVar) {
        this.b.getClass();
        return wVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean i(w wVar, w wVar2) {
        this.b.getClass();
        return wVar.unknownFields.equals(wVar2.unknownFields);
    }
}
