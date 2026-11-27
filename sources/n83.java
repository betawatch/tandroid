// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n83 extends yfb implements is4 {
    public n89 a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ n89 d;
    public final /* synthetic */ o83 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n83(n89 n89Var, o83 o83Var, Object obj, boolean z, zw2 zw2Var) {
        super(2, zw2Var);
        this.d = n89Var;
        this.e = o83Var;
        this.f = obj;
        this.h = z;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        n83 n83Var = new n83(this.d, this.e, this.f, this.h, zw2Var);
        n83Var.c = obj;
        return n83Var;
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        return ((n83) create((pd4) obj, (zw2) obj2)).invokeSuspend(g9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.b(r2, r8) == r7) goto L15;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pd4 pd4Var;
        n89 n89Var;
        byte b = this.b;
        Object obj2 = this.f;
        o83 o83Var = this.e;
        n89 n89Var2 = this.d;
        vx2 vx2Var = vx2.a;
        if (b == 0) {
            ixe.b(obj);
            pd4 pd4Var2 = (pd4) this.c;
            nr5 c = o83Var.c();
            this.c = pd4Var2;
            this.a = n89Var2;
            this.b = (byte) 1;
            Object a = c.a(this);
            if (a != vx2Var) {
                pd4Var = pd4Var2;
                obj = a;
                n89Var = n89Var2;
            }
            return vx2Var;
        }
        if (b != 1) {
            if (b != 2) {
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ixe.b(obj);
            if (this.h) {
                o83Var.h.H(new k63(obj2 != null ? obj2.hashCode() : 0, n89Var2.a, obj2));
            }
            return g9c.a;
        }
        n89Var = this.a;
        pd4Var = (pd4) this.c;
        ixe.b(obj);
        n89Var.a = ((Number) obj).intValue();
        this.c = null;
        this.a = null;
        this.b = (byte) 2;
    }
}
