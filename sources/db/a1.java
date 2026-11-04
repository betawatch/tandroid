package db;

import android.util.Log;
import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a1 extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.c = obj;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                return new a1((e1) this.c, cVar, 0);
            case 1:
                return new a1((e1) this.c, cVar, 1);
            default:
                return new a1((ja.d) this.c, cVar, 2);
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        wd.z zVar = (wd.z) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.a) {
        }
        return ((a1) create(zVar, cVar)).invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                gd.a aVar = gd.a.a;
                int i3 = this.b;
                if (i3 == 0) {
                    ib.b(obj);
                    ua.b bVar = new ua.b(11, e1Var.e.getData(), new y0(e1Var, null));
                    z0 z0Var = new z0(e1Var, 0);
                    this.b = 1;
                    if (bVar.U(z0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return dd.k.a;
            case 1:
                e1 e1Var2 = (e1) this.c;
                gd.a aVar2 = gd.a.a;
                int i10 = this.b;
                fd.c cVar = null;
                try {
                    if (i10 == 0) {
                        ib.b(obj);
                        l1.g gVar = e1Var2.e;
                        c1 c1Var = new c1(e1Var2, cVar, 0);
                        this.b = 1;
                        if (gVar.a(c1Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    j0 j0Var = e1Var2.h;
                    if (j0Var == null) {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                    e1Var2.h = j0.a(j0Var, null, e1Var2.d.a(), null, 5);
                }
                return dd.k.a;
            default:
                gd.a aVar3 = gd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    ib.b(obj);
                    zd.b data = ((ja.d) this.c).c.a.getData();
                    this.b = 1;
                    obj = zd.v.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                p1.b bVar2 = (p1.b) obj;
                return bVar2 != null ? bVar2.a() : ed.p.a;
        }
    }
}
