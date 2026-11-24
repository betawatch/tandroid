// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class aga extends ccb implements gq4 {
    public boolean a;
    public /* synthetic */ ik4 b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ fga d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aga(fga fgaVar, fw2 fw2Var) {
        super(3, fw2Var);
        this.d = fgaVar;
    }

    @Override // gq4
    public final Object a(Object obj, Object obj2, Object obj3) {
        aga agaVar = new aga(this.d, (fw2) obj3);
        agaVar.b = (ik4) obj;
        agaVar.c = (Throwable) obj2;
        return agaVar.invokeSuspend(g5c.a);
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            qse.b(obj);
            ik4 ik4Var = this.b;
            Throwable th = this.c;
            a6a a = this.d.b.a(null);
            w5a w5aVar = new w5a(a, null, null);
            StringBuilder sb = new StringBuilder("Init session datastore failed with exception message: ");
            sb.append(th.getMessage());
            sb.append(". Emit fallback session ");
            ir2.x(sb, a.a, "FirebaseSessions");
            this.b = null;
            this.a = true;
            Object c = ik4Var.c(w5aVar, this);
            bx2 bx2Var = bx2.a;
            if (c == bx2Var) {
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
    }
}
