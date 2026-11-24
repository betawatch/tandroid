// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n83 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n83(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new n83((h93) obj2, px2Var, (byte) 0);
            default:
                return new n83((wu5) obj2, px2Var, (byte) 1);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((n83) create((jm4) obj, (px2) obj2)).invokeSuspend(g7cVar);
            default:
                return ((n83) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        ly2 ly2Var = ly2.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    tue.b(obj);
                    this.b = true;
                    if (((h93) obj2).e(this) == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (!z) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7c.a;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    tue.b(obj);
                    im4 data = ((wu5) obj2).c.a.getData();
                    this.b = true;
                    obj = lje.b(data, this);
                    if (obj == ly2Var) {
                        return ly2Var;
                    }
                } else {
                    if (!z2) {
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                lj7 lj7Var = (lj7) obj;
                return lj7Var != null ? lj7Var.a() : o34.a;
        }
    }
}
