package k1;

import k7.q7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p extends wc.i implements dd.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(d0 d0Var, uc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = d0Var;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.a) {
            case 0:
                p pVar = new p(this.d, cVar, 0);
                pVar.c = obj;
                return pVar;
            default:
                p pVar2 = new p(this.d, cVar, 1);
                pVar2.c = obj;
                return pVar2;
        }
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((p) create((m) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
            default:
                return ((p) create((od.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                vc.a aVar = vc.a.a;
                int i10 = this.b;
                sc.i iVar = sc.i.a;
                if (i10 == 0) {
                    q7.b(obj);
                    m mVar = (m) this.c;
                    boolean z4 = mVar instanceof k;
                    d0 d0Var = this.d;
                    if (z4) {
                        k kVar = (k) mVar;
                        this.b = 1;
                        e0 e0Var = (e0) d0Var.f.b();
                        if (!(e0Var instanceof b)) {
                            if (e0Var instanceof i) {
                                if (e0Var == kVar.a) {
                                    obj2 = d0Var.f(this);
                                    break;
                                }
                            } else if (kotlin.jvm.internal.j.a(e0Var, f0.a)) {
                                obj2 = d0Var.f(this);
                                break;
                            } else if (e0Var instanceof h) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                        }
                        obj2 = iVar;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else if (mVar instanceof l) {
                        this.b = 2;
                        if (d0.a(d0Var, (l) mVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q7.b(obj);
                }
                return iVar;
            default:
                d0 d0Var2 = this.d;
                od.m mVar2 = d0Var2.f;
                vc.a aVar2 = vc.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q7.b(obj);
                    return sc.i.a;
                }
                q7.b(obj);
                od.c cVar = (od.c) this.c;
                e0 e0Var2 = (e0) mVar2.b();
                if (!(e0Var2 instanceof b)) {
                    d0Var2.n.k(new k(e0Var2));
                }
                q qVar = new q(e0Var2, null, 0);
                this.b = 1;
                mVar2.x(new od.i(new kotlin.jvm.internal.o(), new s(cVar), qVar), this);
                return aVar2;
        }
    }
}
