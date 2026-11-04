package l1;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends hd.j implements od.l {
    public Throwable a;
    public int b;
    public final /* synthetic */ b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b0 b0Var, fd.c cVar) {
        super(1, cVar);
        this.c = b0Var;
    }

    @Override // hd.a
    public final fd.c create(fd.c cVar) {
        return new u(this.c, cVar);
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        return ((u) create((fd.c) obj)).invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        f1 f1Var;
        gd.a aVar = gd.a.a;
        int i3 = this.b;
        b0 b0Var = this.c;
        try {
        } catch (Throwable th3) {
            m0 g7 = b0Var.g();
            this.a = th3;
            this.b = 2;
            Object d = g7.d(this);
            if (d != aVar) {
                th2 = th3;
                obj = d;
            }
        }
        if (i3 == 0) {
            ib.b(obj);
            this.b = 1;
            obj = b0.f(b0Var, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = this.a;
                ib.b(obj);
                f1Var = new x0(((Number) obj).intValue(), th2);
                return new dd.e(f1Var, Boolean.TRUE);
            }
            ib.b(obj);
        }
        f1Var = (f1) obj;
        return new dd.e(f1Var, Boolean.TRUE);
    }
}
