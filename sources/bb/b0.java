package bb;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b0 extends ed.j implements ld.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, cd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.a) {
            case 0:
                b0 b0Var = new b0((String) this.c, cVar, 0);
                b0Var.b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.c, cVar, 1);
                b0Var2.b = obj;
                return b0Var2;
        }
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) create((n1.b) obj, (cd.c) obj2);
                ad.j jVar = ad.j.a;
                b0Var.invokeSuspend(jVar);
                return jVar;
            default:
                return ((b0) create((k1.a0) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
        }
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                dd.a aVar = dd.a.a;
                l9.b.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = x.a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return ad.j.a;
            default:
                dd.a aVar2 = dd.a.a;
                l9.b.b(obj);
                k1.a0 a0Var = (k1.a0) obj2;
                return Boolean.valueOf(((a0Var instanceof k1.b) || (a0Var instanceof k1.g) || ((k1.a0) this.b) != a0Var) ? false : true);
        }
    }
}
