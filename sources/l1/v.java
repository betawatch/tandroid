package l1;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ b0 d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b0 b0Var, int i3, fd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = b0Var;
        this.e = i3;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                v vVar = new v(this.d, this.e, cVar, 0);
                vVar.c = ((Boolean) obj).booleanValue();
                return vVar;
            default:
                v vVar2 = new v(this.d, this.e, cVar, 1);
                vVar2.c = ((Boolean) obj).booleanValue();
                return vVar2;
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        int i3 = this.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        fd.c cVar = (fd.c) obj2;
        switch (i3) {
        }
        return ((v) create(bool, cVar)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int i3;
        boolean z10;
        f1 f1Var;
        boolean z11;
        boolean z12;
        Object obj2;
        int i10;
        switch (this.a) {
            case 0:
                gd.a aVar = gd.a.a;
                boolean z13 = this.b;
                b0 b0Var = this.d;
                try {
                } catch (Throwable th3) {
                    if (z13 != 0) {
                        m0 g7 = b0Var.g();
                        this.f = th3;
                        this.c = z13;
                        this.b = 2;
                        Object d = g7.d(this);
                        if (d == aVar) {
                            return aVar;
                        }
                        z10 = z13;
                        th2 = th3;
                        obj = d;
                    } else {
                        boolean z14 = z13;
                        th2 = th3;
                        i3 = this.e;
                        z10 = z14;
                    }
                }
                if (z13 == 0) {
                    ib.b(obj);
                    boolean z15 = this.c;
                    this.c = z15;
                    this.b = 1;
                    obj = b0.f(b0Var, z15, this);
                    z13 = z15;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (z13 != 1) {
                        if (z13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = this.c;
                        th2 = (Throwable) this.f;
                        ib.b(obj);
                        i3 = ((Number) obj).intValue();
                        x0 x0Var = new x0(i3, th2);
                        z11 = z10;
                        f1Var = x0Var;
                        return new dd.e(f1Var, Boolean.valueOf(z11));
                    }
                    boolean z16 = this.c;
                    ib.b(obj);
                    z13 = z16;
                }
                f1Var = (f1) obj;
                z11 = z13;
                return new dd.e(f1Var, Boolean.valueOf(z11));
            default:
                gd.a aVar2 = gd.a.a;
                int i11 = this.b;
                b0 b0Var2 = this.d;
                if (i11 == 0) {
                    ib.b(obj);
                    z12 = this.c;
                    this.c = z12;
                    this.b = 1;
                    obj = b0Var2.i(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f;
                        ib.b(obj);
                        i10 = ((Number) obj).intValue();
                        return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                    }
                    z12 = this.c;
                    ib.b(obj);
                }
                if (!z12) {
                    obj2 = obj;
                    i10 = this.e;
                    return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                }
                m0 g10 = b0Var2.g();
                this.f = obj;
                this.b = 2;
                Object d10 = g10.d(this);
                if (d10 == aVar2) {
                    return aVar2;
                }
                obj2 = obj;
                obj = d10;
                i10 = ((Number) obj).intValue();
                return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
        }
    }
}
