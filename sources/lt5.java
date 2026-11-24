// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lt5 extends ra9 implements eq4 {
    public rj7 b;
    public gg2 c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pt5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt5(fw2 fw2Var, pt5 pt5Var) {
        super(2, fw2Var);
        this.f = pt5Var;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        lt5 lt5Var = new lt5(fw2Var, this.f);
        lt5Var.e = obj;
        return lt5Var;
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        return ((lt5) create((o4a) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005f -> B:6:0x0071). Please report as a decompilation issue!!! */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rj7 b;
        rj7 rj7Var;
        qb6 qb6Var;
        o4a o4aVar;
        byte b2 = this.d;
        bx2 bx2Var = bx2.a;
        if (b2 == 0) {
            qse.b(obj);
            o4a o4aVar2 = (o4a) this.e;
            Object v = this.f.v();
            if (v instanceof gg2) {
                ig2 ig2Var = ((gg2) v).e;
                this.d = (byte) 1;
                o4aVar2.c(ig2Var, this);
                return bx2Var;
            }
            if ((v instanceof en5) && (b = ((en5) v).b()) != null) {
                Object f = b.f();
                f.getClass();
                qb6 qb6Var2 = (qb6) f;
                rj7Var = b;
                qb6Var = qb6Var2;
                o4aVar = o4aVar2;
                if (!qb6Var.equals(rj7Var)) {
                }
            }
        } else if (b2 == 1) {
            qse.b(obj);
        } else {
            if (b2 != 2) {
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qb6Var = this.c;
            rj7Var = this.b;
            o4aVar = (o4a) this.e;
            qse.b(obj);
            qb6Var = qb6Var.g();
            if (!qb6Var.equals(rj7Var)) {
                if (qb6Var instanceof gg2) {
                    gg2 gg2Var = (gg2) qb6Var;
                    ig2 ig2Var2 = gg2Var.e;
                    this.e = o4aVar;
                    this.b = rj7Var;
                    this.c = gg2Var;
                    this.d = (byte) 2;
                    o4aVar.c(ig2Var2, this);
                    return bx2Var;
                }
                qb6Var = qb6Var.g();
                if (!qb6Var.equals(rj7Var)) {
                }
            }
        }
        return g5c.a;
    }
}
