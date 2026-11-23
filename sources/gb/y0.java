package gb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y0 extends kd.j implements rd.q {
    public int a;
    public /* synthetic */ ce.d b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ e1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e1 e1Var, id.c cVar) {
        super(3, cVar);
        this.d = e1Var;
    }

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        y0 y0Var = new y0(this.d, (id.c) obj3);
        y0Var.b = (ce.d) obj;
        y0Var.c = (Throwable) obj2;
        return y0Var.invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.a;
        if (i7 == 0) {
            c8.z.b(obj);
            ce.d dVar = this.b;
            Throwable th2 = this.c;
            o0 a10 = this.d.b.a(null);
            k0 k0Var = new k0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            p5.c.t(sb2, a10.a, "FirebaseSessions");
            this.b = null;
            this.a = 1;
            if (dVar.a(k0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c8.z.b(obj);
        }
        return gd.k.a;
    }
}
