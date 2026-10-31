package k1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends ed.j implements ld.l {
    public int a;

    @Override // ed.a
    public final cd.c create(cd.c cVar) {
        return new d(1, cVar);
    }

    @Override // ld.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((cd.c) obj);
        ad.j jVar = ad.j.a;
        dVar.invokeSuspend(jVar);
        return jVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        dd.a aVar = dd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            l9.b.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l9.b.b(obj);
        return ad.j.a;
    }
}
