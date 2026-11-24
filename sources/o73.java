// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o73 extends ccb implements qp4 {
    public Throwable a;
    public byte b;
    public final /* synthetic */ v73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o73(v73 v73Var, fw2 fw2Var) {
        super(1, fw2Var);
        this.c = v73Var;
    }

    @Override // of0
    public final fw2 create(fw2 fw2Var) {
        return new o73(this.c, fw2Var);
    }

    @Override // qp4
    public final Object invoke(Object obj) {
        return ((o73) create((fw2) obj)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r7 != r4) goto L14;
     */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        fwa fwaVar;
        byte b = this.b;
        v73 v73Var = this.c;
        bx2 bx2Var = bx2.a;
        try {
        } catch (Throwable th2) {
            kp5 c = v73Var.c();
            this.a = th2;
            this.b = (byte) 2;
            Object b2 = c.b(this);
            if (b2 != bx2Var) {
                obj = b2;
                th = th2;
            }
            return bx2Var;
        }
        if (b == 0) {
            qse.b(obj);
            this.b = (byte) 1;
            obj = v73Var.h(true, this);
        } else {
            if (b != 1) {
                if (b != 2) {
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = this.a;
                qse.b(obj);
                fwaVar = new l19(((Number) obj).intValue(), th);
                return new ku7(fwaVar, Boolean.TRUE);
            }
            qse.b(obj);
        }
        fwaVar = (fwa) obj;
        return new ku7(fwaVar, Boolean.TRUE);
    }
}
