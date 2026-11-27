// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class e83 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ o83 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e83(o83 o83Var, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = o83Var;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        o83 o83Var = this.c;
        switch (b) {
            case 0:
                return new e83(o83Var, zw2Var, (byte) 0);
            default:
                return new e83(o83Var, zw2Var, (byte) 1);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((e83) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r15 == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        if (r4.f(r14) != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r15.k(r0, r14) == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        if (r15 != r3) goto L36;
     */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        vx2 vx2Var = vx2.a;
        o83 o83Var = this.c;
        switch (b) {
            case 0:
                byte b2 = this.b;
                f9c f9cVar = f9c.a;
                if (b2 == 0) {
                    ixe.b(obj);
                    u8a u8aVar = o83Var.i;
                    this.b = (byte) 1;
                    Object h = ((vp2) u8aVar.b).h(this);
                    if (h != vx2Var) {
                        h = f9cVar;
                        break;
                    }
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            ixe.b(obj);
                            return f9cVar;
                        }
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                mm4 d = o83Var.c().d();
                boolean z = d instanceof vs4;
                x01 x01Var = x01.b;
                mm4 D = z ? ((vs4) d).D(0, x01Var) : new ji1(d, u24.a, 0, x01Var, (byte) 1);
                z73 z73Var = new z73(o83Var, (byte) 1);
                this.b = (byte) 2;
                break;
            default:
                ri6 ri6Var = o83Var.h;
                byte b3 = this.b;
                try {
                    if (b3 == 0) {
                        ixe.b(obj);
                        if (!(ri6Var.r() instanceof sh4)) {
                            this.b = (byte) 1;
                            break;
                        } else {
                            return ri6Var.r();
                        }
                    } else {
                        if (b3 != 1) {
                            if (b3 == 2) {
                                ixe.b(obj);
                                return (i0b) obj;
                            }
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                    }
                    this.b = (byte) 2;
                    obj = o83Var.g(false, this);
                    break;
                } catch (Throwable th) {
                    return new a59(-1, th);
                }
        }
    }
}
