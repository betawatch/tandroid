package gb;

import android.util.Log;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class z0 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new z0((d1) this.c, cVar, 0);
            case 1:
                return new z0((d1) this.c, cVar, 1);
            default:
                return new z0((ka.d) this.c, cVar, 2);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((z0) create(zVar, cVar)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                d1 d1Var = (d1) this.c;
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                if (i7 == 0) {
                    b7.h.b(obj);
                    wf.b bVar = new wf.b(8, d1Var.e.getData(), new x0(d1Var, null));
                    y0 y0Var = new y0(d1Var, 0);
                    this.b = 1;
                    if (bVar.v(y0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b7.h.b(obj);
                }
                return gd.k.a;
            case 1:
                d1 d1Var2 = (d1) this.c;
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                id.c cVar = null;
                try {
                    if (i10 == 0) {
                        b7.h.b(obj);
                        m1.g gVar = d1Var2.e;
                        b1 b1Var = new b1(d1Var2, cVar, 0);
                        this.b = 1;
                        if (gVar.a(b1Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b7.h.b(obj);
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    j0 j0Var = d1Var2.h;
                    if (j0Var == null) {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                    d1Var2.h = j0.a(j0Var, null, d1Var2.d.a(), null, 5);
                }
                return gd.k.a;
            default:
                jd.a aVar3 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    b7.h.b(obj);
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
                    b7.h.b(obj);
                }
                q1.b bVar2 = (q1.b) obj;
                return bVar2 != null ? bVar2.a() : hd.o.a;
        }
    }
}
