// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kv5 extends rc9 implements fs4 {
    public ul7 b;
    public uh2 c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ov5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv5(px2 px2Var, ov5 ov5Var) {
        super(2, px2Var);
        this.f = ov5Var;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        kv5 kv5Var = new kv5(px2Var, this.f);
        kv5Var.e = obj;
        return kv5Var;
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        return ((kv5) create((q6a) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x005f -> B:6:0x0071). Please report as a decompilation issue!!! */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ul7 b;
        ul7 ul7Var;
        pd6 pd6Var;
        q6a q6aVar;
        byte b2 = this.d;
        ly2 ly2Var = ly2.a;
        if (b2 == 0) {
            tue.b(obj);
            q6a q6aVar2 = (q6a) this.e;
            Object v = this.f.v();
            if (v instanceof uh2) {
                wh2 wh2Var = ((uh2) v).e;
                this.d = (byte) 1;
                q6aVar2.c(wh2Var, this);
                return ly2Var;
            }
            if ((v instanceof ep5) && (b = ((ep5) v).b()) != null) {
                Object f = b.f();
                f.getClass();
                pd6 pd6Var2 = (pd6) f;
                ul7Var = b;
                pd6Var = pd6Var2;
                q6aVar = q6aVar2;
                if (!pd6Var.equals(ul7Var)) {
                }
            }
        } else if (b2 == 1) {
            tue.b(obj);
        } else {
            if (b2 != 2) {
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pd6Var = this.c;
            ul7Var = this.b;
            q6aVar = (q6a) this.e;
            tue.b(obj);
            pd6Var = pd6Var.g();
            if (!pd6Var.equals(ul7Var)) {
                if (pd6Var instanceof uh2) {
                    uh2 uh2Var = (uh2) pd6Var;
                    wh2 wh2Var2 = uh2Var.e;
                    this.e = q6aVar;
                    this.b = ul7Var;
                    this.c = uh2Var;
                    this.d = (byte) 2;
                    q6aVar.c(wh2Var2, this);
                    return ly2Var;
                }
                pd6Var = pd6Var.g();
                if (!pd6Var.equals(ul7Var)) {
                }
            }
        }
        return g7c.a;
    }
}
