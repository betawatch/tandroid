package db;

import android.util.Log;
import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y0 extends hd.j implements od.q {
    public int a;
    public /* synthetic */ zd.c b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ e1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(e1 e1Var, fd.c cVar) {
        super(3, cVar);
        this.d = e1Var;
    }

    @Override // od.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        y0 y0Var = new y0(this.d, (fd.c) obj3);
        y0Var.b = (zd.c) obj;
        y0Var.c = (Throwable) obj2;
        return y0Var.invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        gd.a aVar = gd.a.a;
        int i3 = this.a;
        if (i3 == 0) {
            ib.b(obj);
            zd.c cVar = this.b;
            Throwable th2 = this.c;
            n0 a10 = this.d.b.a(null);
            j0 j0Var = new j0(a10, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th2.getMessage() + ". Emit fallback session " + a10.a);
            this.b = null;
            this.a = 1;
            if (cVar.b(j0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.b(obj);
        }
        return dd.k.a;
    }
}
