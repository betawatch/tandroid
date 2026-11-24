// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g93 extends eeb implements fs4 {
    public c79 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c79 d;
    public final /* synthetic */ h93 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g93(c79 c79Var, h93 h93Var, Object obj, boolean z, px2 px2Var) {
        super(2, px2Var);
        this.d = c79Var;
        this.e = h93Var;
        this.f = obj;
        this.h = z;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        g93 g93Var = new g93(this.d, this.e, this.f, this.h, px2Var);
        g93Var.c = obj;
        return g93Var;
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        return ((g93) create((sd4) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.b(r2, r8) == r7) goto L15;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sd4 sd4Var;
        c79 c79Var;
        byte b = this.b;
        Object obj2 = this.f;
        h93 h93Var = this.e;
        c79 c79Var2 = this.d;
        ly2 ly2Var = ly2.a;
        if (b == 0) {
            tue.b(obj);
            sd4 sd4Var2 = (sd4) this.c;
            kr5 c = h93Var.c();
            this.c = sd4Var2;
            this.a = c79Var2;
            this.b = (byte) 1;
            Object a = c.a(this);
            if (a != ly2Var) {
                sd4Var = sd4Var2;
                obj = a;
                c79Var = c79Var2;
            }
            return ly2Var;
        }
        if (b != 1) {
            if (b != 2) {
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tue.b(obj);
            if (this.h) {
                h93Var.h.F(new e73(obj2 != null ? obj2.hashCode() : 0, c79Var2.a, obj2));
            }
            return g7c.a;
        }
        c79Var = this.a;
        sd4Var = (sd4) this.c;
        tue.b(obj);
        c79Var.a = ((Number) obj).intValue();
        this.c = null;
        this.a = null;
        this.b = (byte) 2;
    }
}
