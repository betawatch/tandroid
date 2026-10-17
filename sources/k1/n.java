package k1;

import v7.i8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class n extends md.i implements td.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, kd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = zVar;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
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

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n) create((k) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
            default:
                return ((n) create((ee.c) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                ld.a aVar = ld.a.a;
                int i10 = this.b;
                id.i iVar = id.i.a;
                if (i10 == 0) {
                    i8.b(obj);
                    k kVar = (k) this.c;
                    boolean z10 = kVar instanceof i;
                    z zVar = this.d;
                    if (z10) {
                        i iVar2 = (i) kVar;
                        this.b = 1;
                        a0 a0Var = (a0) zVar.f.c();
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
                        if (z.b(zVar, (j) kVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                }
                return iVar;
            default:
                z zVar2 = this.d;
                ee.m mVar = zVar2.f;
                ld.a aVar2 = ld.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8.b(obj);
                    return id.i.a;
                }
                i8.b(obj);
                ee.c cVar = (ee.c) this.c;
                a0 a0Var2 = (a0) mVar.c();
                if (!(a0Var2 instanceof b)) {
                    zVar2.n.o(new i(a0Var2));
                }
                ab.b0 b0Var = new ab.b0(a0Var2, null, 1);
                this.b = 1;
                mVar.r(new ee.i(new kotlin.jvm.internal.n(), new ab.a0(cVar), b0Var), this);
                return aVar2;
        }
    }
}
