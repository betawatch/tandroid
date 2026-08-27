package k1;

import h7.k6;
import ia.c0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n extends tc.i implements ad.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(z zVar, rc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = zVar;
    }

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
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

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n) create((k) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
            default:
                return ((n) create((ld.c) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                sc.a aVar = sc.a.a;
                int i10 = this.b;
                pc.i iVar = pc.i.a;
                if (i10 == 0) {
                    k6.b(obj);
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
                            } else if (kotlin.jvm.internal.j.a(a0Var, b0.a)) {
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
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                return iVar;
            default:
                z zVar2 = this.d;
                ld.m mVar = zVar2.f;
                sc.a aVar2 = sc.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                    return pc.i.a;
                }
                k6.b(obj);
                ld.c cVar = (ld.c) this.c;
                a0 a0Var2 = (a0) mVar.b();
                if (!(a0Var2 instanceof b)) {
                    zVar2.n.E(new i(a0Var2));
                }
                c0 c0Var = new c0(a0Var2, null, 1);
                this.b = 1;
                mVar.q(new ld.i(new kotlin.jvm.internal.o(), new ia.b0(cVar), c0Var), this);
                return aVar2;
        }
    }
}
