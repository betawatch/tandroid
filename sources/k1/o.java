package k1;

import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o extends uc.i implements bd.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a0 a0Var, sc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = a0Var;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.a) {
            case 0:
                o oVar = new o(this.d, cVar, 0);
                oVar.c = obj;
                return oVar;
            default:
                o oVar2 = new o(this.d, cVar, 1);
                oVar2.c = obj;
                return oVar2;
        }
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((o) create((l) obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
            default:
                return ((o) create((md.c) obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                tc.a aVar = tc.a.a;
                int i10 = this.b;
                qc.i iVar = qc.i.a;
                if (i10 == 0) {
                    c7.b(obj);
                    l lVar = (l) this.c;
                    boolean z10 = lVar instanceof j;
                    a0 a0Var = this.d;
                    if (z10) {
                        j jVar = (j) lVar;
                        this.b = 1;
                        b0 b0Var = (b0) a0Var.f.b();
                        if (!(b0Var instanceof b)) {
                            if (b0Var instanceof h) {
                                if (b0Var == jVar.a) {
                                    obj2 = a0Var.f(this);
                                    break;
                                }
                            } else if (kotlin.jvm.internal.j.a(b0Var, c0.a)) {
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
                    } else if (lVar instanceof k) {
                        this.b = 2;
                        if (a0.a(a0Var, (k) lVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                }
                return iVar;
            default:
                a0 a0Var2 = this.d;
                md.m mVar = a0Var2.f;
                tc.a aVar2 = tc.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c7.b(obj);
                    return qc.i.a;
                }
                c7.b(obj);
                md.c cVar = (md.c) this.c;
                b0 b0Var2 = (b0) mVar.b();
                if (!(b0Var2 instanceof b)) {
                    a0Var2.n.E(new j(b0Var2));
                }
                ja.b0 b0Var3 = new ja.b0(b0Var2, null, 1);
                this.b = 1;
                mVar.e(new md.i(new kotlin.jvm.internal.o(), new ja.a0(cVar), b0Var3), this);
                return aVar2;
        }
    }
}
