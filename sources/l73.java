// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l73 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ v73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l73(v73 v73Var, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = v73Var;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        v73 v73Var = this.c;
        switch (b) {
            case 0:
                return new l73(v73Var, fw2Var, (byte) 0);
            default:
                return new l73(v73Var, fw2Var, (byte) 1);
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((l73) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r15 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.f(r14) != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r15.h(r0, r14) == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        if (r15 != r3) goto L36;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        bx2 bx2Var = bx2.a;
        v73 v73Var = this.c;
        switch (b) {
            case 0:
                byte b2 = this.b;
                g5c g5cVar = g5c.a;
                if (b2 == 0) {
                    qse.b(obj);
                    c5a c5aVar = v73Var.i;
                    this.b = (byte) 1;
                    Object h = ((cp2) c5aVar.c).h(this);
                    if (h != bx2Var) {
                        h = g5cVar;
                        break;
                    }
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            qse.b(obj);
                            return g5cVar;
                        }
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                hk4 d = v73Var.c().d();
                boolean z = d instanceof rq4;
                o01 o01Var = o01.b;
                hk4 C = z ? ((rq4) d).C(0, o01Var) : new bi1(d, z14.a, 0, o01Var, (byte) 1);
                g73 g73Var = new g73(v73Var, (byte) 1);
                this.b = (byte) 2;
                break;
            default:
                qx4 qx4Var = v73Var.h;
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        qse.b(obj);
                        if (!(qx4Var.F() instanceof uf4)) {
                            this.b = (byte) 1;
                            break;
                        } else {
                            return qx4Var.F();
                        }
                    } else {
                        if (b3 != 1) {
                            if (b3 == 2) {
                                qse.b(obj);
                                return (fwa) obj;
                            }
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qse.b(obj);
                    }
                    this.b = (byte) 2;
                    obj = v73Var.g(false, this);
                    break;
                } catch (Throwable th) {
                    return new l19(-1, th);
                }
        }
    }
}
