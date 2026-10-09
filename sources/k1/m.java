package k1;

import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m extends ld.j implements sd.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a0 a0Var, jd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = a0Var;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        switch (this.a) {
            case 0:
                m mVar = new m(this.d, cVar, 0);
                mVar.c = obj;
                return mVar;
            default:
                m mVar2 = new m(this.d, cVar, 1);
                mVar2.c = obj;
                return mVar2;
        }
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((m) create((k) obj, (jd.c) obj2)).invokeSuspend(hd.i.a);
            default:
                return ((m) create((de.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                kd.a aVar = kd.a.a;
                int i10 = this.b;
                hd.i iVar = hd.i.a;
                if (i10 == 0) {
                    a8.b(obj);
                    k kVar = (k) this.c;
                    boolean z10 = kVar instanceof i;
                    a0 a0Var = this.d;
                    if (z10) {
                        i iVar2 = (i) kVar;
                        this.b = 1;
                        b0 b0Var = (b0) a0Var.f.c();
                        if (!(b0Var instanceof b)) {
                            if (b0Var instanceof h) {
                                if (b0Var == iVar2.a) {
                                    obj2 = a0Var.f(this);
                                    break;
                                }
                            } else if (kotlin.jvm.internal.i.a(b0Var, c0.a)) {
                                obj2 = a0Var.f(this);
                                break;
                            } else if (b0Var instanceof g) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                        }
                        obj2 = iVar;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    } else if (kVar instanceof j) {
                        this.b = 2;
                        if (a0.a(a0Var, (j) kVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                }
                return iVar;
            default:
                a0 a0Var2 = this.d;
                de.o oVar = a0Var2.f;
                kd.a aVar2 = kd.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a8.b(obj);
                    return hd.i.a;
                }
                a8.b(obj);
                de.c cVar = (de.c) this.c;
                b0 b0Var2 = (b0) oVar.c();
                if (!(b0Var2 instanceof b)) {
                    a0Var2.n.f(new i(b0Var2));
                }
                n nVar = new n(b0Var2, null, 0);
                this.b = 1;
                oVar.z(new de.i(new kotlin.jvm.internal.n(), new p(cVar), nVar), this);
                return aVar2;
        }
    }
}
