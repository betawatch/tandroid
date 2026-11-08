package m1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u extends kd.j implements rd.l {
    public Throwable a;
    public int b;
    public final /* synthetic */ b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b0 b0Var, id.c cVar) {
        super(1, cVar);
        this.c = b0Var;
    }

    @Override // kd.a
    public final id.c create(id.c cVar) {
        return new u(this.c, cVar);
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        return ((u) create((id.c) obj)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        e1 e1Var;
        jd.a aVar = jd.a.a;
        int i7 = this.b;
        b0 b0Var = this.c;
        try {
        } catch (Throwable th3) {
            m0 g10 = b0Var.g();
            this.a = th3;
            this.b = 2;
            Object b10 = g10.b(this);
            if (b10 != aVar) {
                th2 = th3;
                obj = b10;
            }
        }
        if (i7 == 0) {
            af.b.c(obj);
            this.b = 1;
            obj = b0.f(b0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.a;
                af.b.c(obj);
                e1Var = new w0(((Number) obj).intValue(), th2);
                return new gd.e(e1Var, Boolean.TRUE);
            }
            af.b.c(obj);
        }
        e1Var = (e1) obj;
        return new gd.e(e1Var, Boolean.TRUE);
    }
}
