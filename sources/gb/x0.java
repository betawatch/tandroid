package gb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class x0 extends kd.j implements rd.q {
    public int a;
    public /* synthetic */ ce.d b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ d1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(d1 d1Var, id.c cVar) {
        super(3, cVar);
        this.d = d1Var;
    }

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        x0 x0Var = new x0(this.d, (id.c) obj3);
        x0Var.b = (ce.d) obj;
        x0Var.c = (Throwable) obj2;
        return x0Var.invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.a;
        if (i7 == 0) {
            af.b.c(obj);
            ce.d dVar = this.b;
            Throwable th2 = this.c;
            n0 a10 = this.d.b.a(null);
            j0 j0Var = new j0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            r.b.t(sb2, a10.a, "FirebaseSessions");
            this.b = null;
            this.a = 1;
            if (dVar.a(j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            af.b.c(obj);
        }
        return gd.k.a;
    }
}
