package gb;

import android.util.Log;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class z0 extends kd.j implements rd.q {
    public int a;
    public /* synthetic */ ce.d b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ f1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(f1 f1Var, id.c cVar) {
        super(3, cVar);
        this.d = f1Var;
    }

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        z0 z0Var = new z0(this.d, (id.c) obj3);
        z0Var.b = (ce.d) obj;
        z0Var.c = (Throwable) obj2;
        return z0Var.invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i7 = this.a;
        if (i7 == 0) {
            af.b.c(obj);
            ce.d dVar = this.b;
            Throwable th2 = this.c;
            o0 a10 = this.d.b.a(null);
            k0 k0Var = new k0(a10, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + a10.a);
            this.b = null;
            this.a = 1;
            if (dVar.a(k0Var, this) == aVar) {
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
