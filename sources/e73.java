// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e73 extends ccb implements gq4 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e73(v73 v73Var, fw2 fw2Var) {
        super(3, fw2Var);
        this.c = v73Var;
    }

    @Override // gq4
    public final Object a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return new e73((v73) this.c, (fw2) obj3).invokeSuspend(g5cVar);
            default:
                ((Boolean) obj2).getClass();
                e73 e73Var = new e73(3, (fw2) obj3);
                e73Var.c = (oa4) obj;
                return e73Var.invokeSuspend(g5cVar);
        }
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        bx2 bx2Var = bx2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    qse.b(obj);
                    v73 v73Var = (v73) this.c;
                    this.b = true;
                    if (v73Var.b(this) == bx2Var) {
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
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                oa4 oa4Var = (oa4) this.c;
                this.b = true;
                oa4Var.getClass();
                Object a = oa4.a(oa4Var, this);
                return a == bx2Var ? bx2Var : a;
        }
    }

    public /* synthetic */ e73(int i, fw2 fw2Var) {
        super(i, fw2Var);
    }
}
