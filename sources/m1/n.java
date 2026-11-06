package m1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n extends kd.j implements rd.q {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;

    public /* synthetic */ n(int i7, id.c cVar) {
        super(i7, cVar);
    }

    @Override // rd.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return new n((b0) this.c, (id.c) obj3).invokeSuspend(gd.k.a);
            default:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, (id.c) obj3);
                nVar.c = (d0) obj;
                return nVar.invokeSuspend(gd.k.a);
        }
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                if (i7 == 0) {
                    af.b.c(obj);
                    b0 b0Var = (b0) this.c;
                    this.b = 1;
                    if (b0.b(b0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return gd.k.a;
            default:
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return obj;
                }
                af.b.c(obj);
                d0 d0Var = (d0) this.c;
                this.b = 1;
                d0Var.getClass();
                Object a10 = d0.a(d0Var, this);
                return a10 == aVar2 ? aVar2 : a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0 b0Var, id.c cVar) {
        super(3, cVar);
        this.c = b0Var;
    }
}
