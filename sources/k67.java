// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k67 implements os9 {
    public final gu4 a;
    public final t7c b;
    public final l84 c;

    public k67(t7c t7cVar, l84 l84Var, gu4 gu4Var) {
        this.b = t7cVar;
        l84Var.getClass();
        this.c = l84Var;
        this.a = gu4Var;
    }

    @Override // os9
    public final gu4 a() {
        gu4 gu4Var = this.a;
        return wi8.A(gu4Var) ? gu4Var.i() : ((eu4) gu4Var.c(5)).b();
    }

    @Override // os9
    public final void b(Object obj, Object obj2) {
        rs9.k(this.b, obj, obj2);
    }

    @Override // os9
    public final void c(Object obj) {
        this.b.getClass();
        s7c s7cVar = ((gu4) obj).unknownFields;
        if (s7cVar.e) {
            s7cVar.e = false;
        }
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    @Override // os9
    public final boolean d(Object obj) {
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    @Override // os9
    public final boolean e(gu4 gu4Var, gu4 gu4Var2) {
        this.b.getClass();
        return gu4Var.unknownFields.equals(gu4Var2.unknownFields);
    }

    @Override // os9
    public final int f(gu4 gu4Var) {
        this.b.getClass();
        return gu4Var.unknownFields.hashCode();
    }

    @Override // os9
    public final void g(Object obj, k6d k6dVar) {
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    @Override // os9
    public final int h(gu4 gu4Var) {
        this.b.getClass();
        s7c s7cVar = gu4Var.unknownFields;
        int i = s7cVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < s7cVar.a; i3++) {
            int i4 = s7cVar.b[i3] >>> 3;
            m61 m61Var = (m61) s7cVar.c[i3];
            int h = pl2.h(i4) + pl2.g(2) + (pl2.g(1) << 1);
            int g = pl2.g(3);
            int size = m61Var.size();
            i2 += pl2.h(size) + size + g + h;
        }
        s7cVar.d = i2;
        return i2;
    }

    @Override // os9
    public final void i(Object obj, ag0 ag0Var, k84 k84Var) {
        this.b.getClass();
        t7c.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
