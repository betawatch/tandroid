package k1;

import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n extends sc.i implements zc.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, qc.c cVar, int i9) {
        super(2, cVar);
        this.a = i9;
        this.d = zVar;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
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

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n) create((k) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
            default:
                return ((n) create((kd.c) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                rc.a aVar = rc.a.a;
                int i9 = this.b;
                oc.i iVar = oc.i.a;
                if (i9 == 0) {
                    y5.b(obj);
                    k kVar = (k) this.c;
                    boolean z10 = kVar instanceof i;
                    z zVar = this.d;
                    if (z10) {
                        i iVar2 = (i) kVar;
                        this.b = 1;
                        a0 a0Var = (a0) zVar.f.b();
                        if (!(a0Var instanceof b)) {
                            if (a0Var instanceof h) {
                                if (a0Var == iVar2.a) {
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
                        obj2 = iVar;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else if (kVar instanceof j) {
                        this.b = 2;
                        if (z.a(zVar, (j) kVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i9 != 1 && i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                }
                return iVar;
            default:
                z zVar2 = this.d;
                kd.m mVar = zVar2.f;
                rc.a aVar2 = rc.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.b(obj);
                    return oc.i.a;
                }
                y5.b(obj);
                kd.c cVar = (kd.c) this.c;
                a0 a0Var2 = (a0) mVar.b();
                if (!(a0Var2 instanceof b)) {
                    zVar2.n.E(new i(a0Var2));
                }
                ha.b0 b0Var = new ha.b0(a0Var2, null, 1);
                this.b = 1;
                mVar.q(new kd.i(new kotlin.jvm.internal.n(), new ha.a0(cVar), b0Var), this);
                return aVar2;
        }
    }
}
