package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        a4.a.y(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void c(Object obj, a0.h hVar, m mVar) {
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
    public final void d(Object obj) {
        this.b.getClass();
        ((w) obj).unknownFields.e = false;
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int e(a aVar) {
        this.b.getClass();
        i1 i1Var = ((w) aVar).unknownFields;
        int i10 = i1Var.d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i1Var.a; i12++) {
            int i13 = i1Var.b[i12] >>> 3;
            g gVar = (g) i1Var.c[i12];
            i11 += j.r(3, gVar) + j.z(i13) + j.y(2) + (j.y(1) * 2);
        }
        i1Var.d = i11;
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean f(Object obj) {
        this.c.getClass();
        a4.a.y(obj);
        throw null;
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
