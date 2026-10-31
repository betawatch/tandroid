package k1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n extends ed.j implements ld.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, cd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = zVar;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.a) {
            case 0:
                n nVar = new n(this.d, cVar, 0);
                nVar.c = obj;
                return nVar;
            default:
                n nVar2 = new n(this.d, cVar, 1);
                nVar2.c = obj;
                return nVar2;
        }
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n) create((l) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
            default:
                return ((n) create((wd.c) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                dd.a aVar = dd.a.a;
                int i10 = this.b;
                ad.j jVar = ad.j.a;
                if (i10 == 0) {
                    l9.b.b(obj);
                    l lVar = (l) this.c;
                    boolean z10 = lVar instanceof j;
                    z zVar = this.d;
                    if (z10) {
                        j jVar2 = (j) lVar;
                        this.b = 1;
                        a0 a0Var = (a0) zVar.f.c();
                        if (!(a0Var instanceof b)) {
                            if (a0Var instanceof h) {
                                if (a0Var == jVar2.a) {
                                    obj2 = zVar.f(this);
                                    break;
                                }
                            } else if (kotlin.jvm.internal.i.a(a0Var, b0.a)) {
                                obj2 = zVar.f(this);
                                break;
                            } else if (a0Var instanceof g) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                        }
                        obj2 = jVar;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else if (lVar instanceof k) {
                        this.b = 2;
                        if (z.a(zVar, (k) lVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                }
                return jVar;
            default:
                z zVar2 = this.d;
                wd.m mVar = zVar2.f;
                dd.a aVar2 = dd.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l9.b.b(obj);
                    return ad.j.a;
                }
                l9.b.b(obj);
                wd.c cVar = (wd.c) this.c;
                a0 a0Var2 = (a0) mVar.c();
                if (!(a0Var2 instanceof b)) {
                    zVar2.n.m(new j(a0Var2));
                }
                bb.b0 b0Var = new bb.b0(a0Var2, null, 1);
                this.b = 1;
                mVar.p(new wd.i(new kotlin.jvm.internal.n(), new bb.a0(cVar), b0Var), this);
                return aVar2;
        }
    }
}
