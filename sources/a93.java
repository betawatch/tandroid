// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a93 extends eeb implements rr4 {
    public Throwable a;
    public byte b;
    public final /* synthetic */ h93 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a93(h93 h93Var, px2 px2Var) {
        super(1, px2Var);
        this.c = h93Var;
    }

    @Override // og0
    public final px2 create(px2 px2Var) {
        return new a93(this.c, px2Var);
    }

    @Override // rr4
    public final Object invoke(Object obj) {
        return ((a93) create((px2) obj)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r7 != r4) goto L14;
     */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        iya iyaVar;
        byte b = this.b;
        h93 h93Var = this.c;
        ly2 ly2Var = ly2.a;
        try {
        } catch (Throwable th2) {
            kr5 c = h93Var.c();
            this.a = th2;
            this.b = (byte) 2;
            Object b2 = c.b(this);
            if (b2 != ly2Var) {
                obj = b2;
                th = th2;
            }
            return ly2Var;
        }
        if (b == 0) {
            tue.b(obj);
            this.b = (byte) 1;
            obj = h93Var.h(true, this);
        } else {
            if (b != 1) {
                if (b != 2) {
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = this.a;
                tue.b(obj);
                iyaVar = new o39(((Number) obj).intValue(), th);
                return new lw7(iyaVar, Boolean.TRUE);
            }
            tue.b(obj);
        }
        iyaVar = (iya) obj;
        return new lw7(iyaVar, Boolean.TRUE);
    }
}
