// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b73 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b73(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new b73((v73) obj2, fw2Var, (byte) 0);
            default:
                return new b73((xs5) obj2, fw2Var, (byte) 1);
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((b73) create((ik4) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            default:
                return ((b73) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    qse.b(obj);
                    this.b = true;
                    if (((v73) obj2).e(this) == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (!z) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                return g5c.a;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    qse.b(obj);
                    hk4 data = ((xs5) obj2).c.a.getData();
                    this.b = true;
                    obj = khe.b(data, this);
                    if (obj == bx2Var) {
                        return bx2Var;
                    }
                } else {
                    if (!z2) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                ih7 ih7Var = (ih7) obj;
                return ih7Var != null ? ih7Var.a() : d24.a;
        }
    }
}
