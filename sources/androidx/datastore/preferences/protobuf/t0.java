package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 implements b1 {
    public final a a;
    public final j1 b;
    public final o c;

    public t0(j1 j1Var, o oVar, a aVar) {
        this.b = j1Var;
        oVar.getClass();
        this.c = oVar;
        this.a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final Object a() {
        return ((u) ((w) this.a).d(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void b(Object obj, k0 k0Var) {
        this.c.getClass();
        a9.p.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void c(Object obj) {
        this.b.getClass();
        ((w) obj).unknownFields.e = false;
        this.c.getClass();
        a9.p.t(obj);
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
            g gVar = (g) i1Var.c[i12];
            i11 += k.r(3, gVar) + k.z(i13) + k.y(2) + (k.y(1) * 2);
        }
        i1Var.d = i11;
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean e(Object obj) {
        this.c.getClass();
        a9.p.t(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void f(w wVar, w wVar2) {
        c1.w(this.b, wVar, wVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final int g(w wVar) {
        this.b.getClass();
        return wVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final boolean h(w wVar, w wVar2) {
        this.b.getClass();
        return wVar.unknownFields.equals(wVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.b1
    public final void i(Object obj, i iVar, n nVar) {
        this.b.getClass();
        w wVar = (w) obj;
        if (wVar.unknownFields == i1.f) {
            wVar.unknownFields = i1.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
