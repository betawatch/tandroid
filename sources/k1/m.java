package k1;

import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a0 a0Var, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = a0Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((m) create((k) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
            default:
                return ((m) create((ce.c) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        if (r8 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r8 == r0) goto L43;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i10 = this.b;
                gd.i iVar = gd.i.a;
                if (i10 == 0) {
                    t7.b(obj);
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
                                    obj2 = a0Var.e(this);
                                    break;
                                }
                            } else if (kotlin.jvm.internal.i.a(b0Var, c0.a)) {
                                obj2 = a0Var.e(this);
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
                    t7.b(obj);
                }
                return iVar;
            default:
                a0 a0Var2 = this.d;
                ce.n nVar = a0Var2.f;
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t7.b(obj);
                    return gd.i.a;
                }
                t7.b(obj);
                ce.c cVar = (ce.c) this.c;
                b0 b0Var2 = (b0) nVar.c();
                if (!(b0Var2 instanceof b)) {
                    a0Var2.n.e(new i(b0Var2));
                }
                n nVar2 = new n(b0Var2, null, 0);
                this.b = 1;
                nVar.z(new ce.i(new kotlin.jvm.internal.n(), new p(cVar), nVar2), this);
                return aVar2;
        }
    }
}
