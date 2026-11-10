package m1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ b0 d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(b0 b0Var, int i7, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.d = b0Var;
        this.e = i7;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        id.c cVar = (id.c) obj2;
        switch (i7) {
        }
        return ((v) create(bool, cVar)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        int i7;
        boolean z9;
        e1 e1Var;
        boolean z10;
        boolean z11;
        Object obj2;
        int i10;
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                boolean z12 = this.b;
                b0 b0Var = this.d;
                try {
                } catch (Throwable th3) {
                    if (z12 != 0) {
                        m0 g10 = b0Var.g();
                        this.f = th3;
                        this.c = z12;
                        this.b = 2;
                        Object b10 = g10.b(this);
                        if (b10 == aVar) {
                            return aVar;
                        }
                        z9 = z12;
                        th2 = th3;
                        obj = b10;
                    } else {
                        boolean z13 = z12;
                        th2 = th3;
                        i7 = this.e;
                        z9 = z13;
                    }
                }
                if (z12 == 0) {
                    af.b.c(obj);
                    boolean z14 = this.c;
                    this.c = z14;
                    this.b = 1;
                    obj = b0.f(b0Var, z14, this);
                    z12 = z14;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (z12 != 1) {
                        if (z12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z9 = this.c;
                        th2 = (Throwable) this.f;
                        af.b.c(obj);
                        i7 = ((Number) obj).intValue();
                        w0 w0Var = new w0(i7, th2);
                        z10 = z9;
                        e1Var = w0Var;
                        return new gd.e(e1Var, Boolean.valueOf(z10));
                    }
                    boolean z15 = this.c;
                    af.b.c(obj);
                    z12 = z15;
                }
                e1Var = (e1) obj;
                z10 = z12;
                return new gd.e(e1Var, Boolean.valueOf(z10));
            default:
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                b0 b0Var2 = this.d;
                if (i11 == 0) {
                    af.b.c(obj);
                    z11 = this.c;
                    this.c = z11;
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
                        af.b.c(obj);
                        i10 = ((Number) obj).intValue();
                        return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                    }
                    z11 = this.c;
                    af.b.c(obj);
                }
                if (!z11) {
                    obj2 = obj;
                    i10 = this.e;
                    return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                }
                m0 g11 = b0Var2.g();
                this.f = obj;
                this.b = 2;
                Object b11 = g11.b(this);
                if (b11 == aVar2) {
                    return aVar2;
                }
                obj2 = obj;
                obj = b11;
                i10 = ((Number) obj).intValue();
                return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
        }
    }
}
