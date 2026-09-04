package k1;

import v7.t7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class d extends kd.j implements rd.l {
    public int a;

    @Override // kd.a
    public final id.c create(id.c cVar) {
        return new d(1, cVar);
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        d dVar = (d) create((id.c) obj);
        gd.i iVar = gd.i.a;
        dVar.invokeSuspend(iVar);
        return iVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            t7.b(obj);
            this.a = 1;
            throw null;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t7.b(obj);
        return gd.i.a;
    }
}
