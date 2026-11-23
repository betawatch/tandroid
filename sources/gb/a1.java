package gb;

import android.util.Log;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a1 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new a1((e1) this.c, cVar, 0);
            case 1:
                return new a1((e1) this.c, cVar, 1);
            default:
                return new a1((ka.d) this.c, cVar, 2);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((a1) create(zVar, cVar)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.c;
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                if (i7 == 0) {
                    c8.z.b(obj);
                    wf.b bVar = new wf.b(8, e1Var.e.getData(), new y0(e1Var, null));
                    z0 z0Var = new z0(e1Var, 0);
                    this.b = 1;
                    if (bVar.J(z0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8.z.b(obj);
                }
                return gd.k.a;
            case 1:
                e1 e1Var2 = (e1) this.c;
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                id.c cVar = null;
                try {
                    if (i10 == 0) {
                        c8.z.b(obj);
                        m1.g gVar = e1Var2.e;
                        c1 c1Var = new c1(e1Var2, cVar, 0);
                        this.b = 1;
                        if (gVar.a(c1Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c8.z.b(obj);
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    k0 k0Var = e1Var2.h;
                    if (k0Var == null) {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                    e1Var2.h = k0.a(k0Var, null, e1Var2.d.a(), null, 5);
                }
                return gd.k.a;
            default:
                jd.a aVar3 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    c8.z.b(obj);
                    ce.c data = ((ka.d) this.c).c.a.getData();
                    this.b = 1;
                    obj = ce.x.e(data, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c8.z.b(obj);
                }
                q1.b bVar2 = (q1.b) obj;
                return bVar2 != null ? bVar2.a() : hd.o.a;
        }
    }
}
