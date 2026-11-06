package m1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a0 extends kd.j implements rd.p {
    public kotlin.jvm.internal.p a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kotlin.jvm.internal.p d;
    public final /* synthetic */ b0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlin.jvm.internal.p pVar, b0 b0Var, Object obj, boolean z9, id.c cVar) {
        super(2, cVar);
        this.d = pVar;
        this.e = b0Var;
        this.f = obj;
        this.h = z9;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        a0 a0Var = new a0(this.d, this.e, this.f, this.h, cVar);
        a0Var.c = obj;
        return a0Var;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((k0) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r6.b(r2, r7) == r0) goto L16;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        kotlin.jvm.internal.p pVar;
        jd.a aVar = jd.a.a;
        int i7 = this.b;
        Object obj2 = this.f;
        b0 b0Var = this.e;
        kotlin.jvm.internal.p pVar2 = this.d;
        if (i7 == 0) {
            af.b.c(obj);
            k0 k0Var2 = (k0) this.c;
            m0 g10 = b0Var.g();
            this.c = k0Var2;
            this.a = pVar2;
            this.b = 1;
            Object e10 = g10.e(this);
            if (e10 != aVar) {
                k0Var = k0Var2;
                obj = e10;
                pVar = pVar2;
            }
            return aVar;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            af.b.c(obj);
            if (this.h) {
                b0Var.h.h2(new c(obj2, obj2 != null ? obj2.hashCode() : 0, pVar2.a));
            }
            return gd.k.a;
        }
        pVar = this.a;
        k0Var = (k0) this.c;
        af.b.c(obj);
        pVar.a = ((Number) obj).intValue();
        this.c = null;
        this.a = null;
        this.b = 2;
    }
}
