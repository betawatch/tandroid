package gb;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
            b7.h.b(obj);
            ce.d dVar = this.b;
            Throwable th2 = this.c;
            n0 a10 = this.d.b.a(null);
            j0 j0Var = new j0(a10, null, null);
            StringBuilder sb2 = new StringBuilder("Init session datastore failed with exception message: ");
            sb2.append(th2.getMessage());
            sb2.append(". Emit fallback session ");
            p5.c.t(sb2, a10.a, "FirebaseSessions");
            this.b = null;
            this.a = 1;
            if (dVar.a(j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b7.h.b(obj);
        }
        return gd.k.a;
    }
}
