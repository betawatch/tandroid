// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b93 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ h93 d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b93(h93 h93Var, int i, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.d = h93Var;
        this.e = i;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        int i = this.e;
        h93 h93Var = this.d;
        switch (b) {
            case 0:
                b93 b93Var = new b93(h93Var, i, px2Var, (byte) 0);
                b93Var.c = ((Boolean) obj).booleanValue();
                return b93Var;
            default:
                b93 b93Var2 = new b93(h93Var, i, px2Var, (byte) 1);
                b93Var2.c = ((Boolean) obj).booleanValue();
                return b93Var2;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((b93) create(bool, px2Var)).invokeSuspend(g7cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        iya iyaVar;
        boolean z;
        boolean z2;
        Object obj2;
        byte b = this.a;
        int i = this.e;
        ly2 ly2Var = ly2.a;
        h93 h93Var = this.d;
        switch (b) {
            case 0:
                boolean z3 = this.b;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        kr5 c = h93Var.c();
                        this.f = th;
                        this.c = z3;
                        this.b = (byte) 2;
                        Object b2 = c.b(this);
                        if (b2 == ly2Var) {
                            return ly2Var;
                        }
                        obj = b2;
                        th = th;
                        z3 = z3;
                    }
                }
                if (z3 == 0) {
                    tue.b(obj);
                    boolean z4 = this.c;
                    this.c = z4;
                    this.b = (byte) 1;
                    obj = h93Var.h(z4, this);
                    z3 = z4;
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.c;
                        th = (Throwable) this.f;
                        tue.b(obj);
                        z3 = z5;
                        i = ((Number) obj).intValue();
                        th = th;
                        iyaVar = new o39(i, th);
                        z = z3;
                        return new lw7(iyaVar, Boolean.valueOf(z));
                    }
                    boolean z6 = this.c;
                    tue.b(obj);
                    z3 = z6;
                }
                iyaVar = (iya) obj;
                z = z3;
                return new lw7(iyaVar, Boolean.valueOf(z));
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    tue.b(obj);
                    z2 = this.c;
                    this.c = z2;
                    this.b = (byte) 1;
                    obj = ((hd4) h93Var.j.getValue()).a(new q83(3, (px2) null), this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.f;
                        tue.b(obj);
                        i = ((Number) obj).intValue();
                        obj = obj2;
                        return new e73(obj == null ? obj.hashCode() : 0, i, obj);
                    }
                    z2 = this.c;
                    tue.b(obj);
                }
                if (z2) {
                    kr5 c2 = h93Var.c();
                    this.f = obj;
                    this.b = (byte) 2;
                    Object b4 = c2.b(this);
                    if (b4 == ly2Var) {
                        return ly2Var;
                    }
                    Object obj3 = obj;
                    obj = b4;
                    obj2 = obj3;
                    i = ((Number) obj).intValue();
                    obj = obj2;
                }
                return new e73(obj == null ? obj.hashCode() : 0, i, obj);
        }
    }
}
