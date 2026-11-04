package l1;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n extends hd.j implements od.q {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;

    public /* synthetic */ n(int i3, fd.c cVar) {
        super(i3, cVar);
    }

    @Override // od.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return new n((b0) this.c, (fd.c) obj3).invokeSuspend(dd.k.a);
            default:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, (fd.c) obj3);
                nVar.c = (d0) obj;
                return nVar.invokeSuspend(dd.k.a);
        }
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                gd.a aVar = gd.a.a;
                int i3 = this.b;
                if (i3 == 0) {
                    ib.b(obj);
                    b0 b0Var = (b0) this.c;
                    this.b = 1;
                    if (b0.b(b0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return dd.k.a;
            default:
                gd.a aVar2 = gd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                d0 d0Var = (d0) this.c;
                this.b = 1;
                d0Var.getClass();
                Object a10 = d0.a(d0Var, this);
                return a10 == aVar2 ? aVar2 : a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0 b0Var, fd.c cVar) {
        super(3, cVar);
        this.c = b0Var;
    }
}
