package gb;

import android.util.Log;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b1 extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new b1((f1) this.c, cVar, 0);
            case 1:
                return new b1((f1) this.c, cVar, 1);
            default:
                return new b1((ka.d) this.c, cVar, 2);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        zd.z zVar = (zd.z) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((b1) create(zVar, cVar)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.c;
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                if (i7 == 0) {
                    af.b.c(obj);
                    wf.b bVar = new wf.b(9, f1Var.e.getData(), new z0(f1Var, null));
                    a1 a1Var = new a1(f1Var, 0);
                    this.b = 1;
                    if (bVar.B(a1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return gd.k.a;
            case 1:
                f1 f1Var2 = (f1) this.c;
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                id.c cVar = null;
                try {
                    if (i10 == 0) {
                        af.b.c(obj);
                        m1.g gVar = f1Var2.e;
                        d1 d1Var = new d1(f1Var2, cVar, 0);
                        this.b = 1;
                        if (gVar.a(d1Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                    }
                } catch (Exception e10) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                    k0 k0Var = f1Var2.h;
                    if (k0Var == null) {
                        kotlin.jvm.internal.j.h("localSessionData");
                        throw null;
                    }
                    f1Var2.h = k0.a(k0Var, null, f1Var2.d.a(), null, 5);
                }
                return gd.k.a;
            default:
                jd.a aVar3 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    af.b.c(obj);
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
                    af.b.c(obj);
                }
                q1.b bVar2 = (q1.b) obj;
                return bVar2 != null ? bVar2.a() : hd.o.a;
        }
    }
}
