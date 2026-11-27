// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class i83 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ o83 d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i83(o83 o83Var, int i, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = o83Var;
        this.e = i;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        int i = this.e;
        o83 o83Var = this.d;
        switch (b) {
            case 0:
                i83 i83Var = new i83(o83Var, i, zw2Var, (byte) 0);
                i83Var.c = ((Boolean) obj).booleanValue();
                return i83Var;
            default:
                i83 i83Var2 = new i83(o83Var, i, zw2Var, (byte) 1);
                i83Var2.c = ((Boolean) obj).booleanValue();
                return i83Var2;
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((i83) create(bool, zw2Var)).invokeSuspend(f9cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Type inference failed for: r0v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        i0b i0bVar;
        boolean z;
        boolean z2;
        Object obj2;
        byte b = this.a;
        int i = this.e;
        vx2 vx2Var = vx2.a;
        o83 o83Var = this.d;
        switch (b) {
            case 0:
                boolean z3 = this.b;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z3 != 0) {
                        nr5 c = o83Var.c();
                        this.f = th;
                        this.c = z3;
                        this.b = (byte) 2;
                        Object b2 = c.b(this);
                        if (b2 == vx2Var) {
                            return vx2Var;
                        }
                        obj = b2;
                        th = th;
                        z3 = z3;
                    }
                }
                if (z3 == 0) {
                    ixe.b(obj);
                    boolean z4 = this.c;
                    this.c = z4;
                    this.b = (byte) 1;
                    obj = o83Var.h(z4, this);
                    z3 = z4;
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (z3 != 1) {
                        if (z3 != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z5 = this.c;
                        th = (Throwable) this.f;
                        ixe.b(obj);
                        z3 = z5;
                        i = ((Number) obj).intValue();
                        th = th;
                        i0bVar = new a59(i, th);
                        z = z3;
                        return new rx7(i0bVar, Boolean.valueOf(z));
                    }
                    boolean z6 = this.c;
                    ixe.b(obj);
                    z3 = z6;
                }
                i0bVar = (i0b) obj;
                z = z3;
                return new rx7(i0bVar, Boolean.valueOf(z));
            default:
                byte b3 = this.b;
                if (b3 == 0) {
                    ixe.b(obj);
                    z2 = this.c;
                    this.c = z2;
                    this.b = (byte) 1;
                    obj = ((ed4) o83Var.j.getValue()).a(new x73(3, (zw2) null), this);
                    if (obj == vx2Var) {
                        return vx2Var;
                    }
                } else {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.f;
                        ixe.b(obj);
                        i = ((Number) obj).intValue();
                        obj = obj2;
                        return new k63(obj == null ? obj.hashCode() : 0, i, obj);
                    }
                    z2 = this.c;
                    ixe.b(obj);
                }
                if (z2) {
                    nr5 c2 = o83Var.c();
                    this.f = obj;
                    this.b = (byte) 2;
                    Object b4 = c2.b(this);
                    if (b4 == vx2Var) {
                        return vx2Var;
                    }
                    Object obj3 = obj;
                    obj = b4;
                    obj2 = obj3;
                    i = ((Number) obj).intValue();
                    obj = obj2;
                }
                return new k63(obj == null ? obj.hashCode() : 0, i, obj);
        }
    }
}
