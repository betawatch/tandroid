package l1;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends hd.j implements od.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(b0 b0Var, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        this.c = b0Var;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                return new m(this.c, cVar, 0);
            case 1:
                return new m(this.c, cVar, 1);
            default:
                return new m(this.c, cVar, 2);
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((m) create((wd.z) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r13 == r0) goto L47;
     */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i3 = this.a;
        dd.k kVar = dd.k.a;
        b0 b0Var = this.c;
        int i10 = 2;
        switch (i3) {
            case 0:
                gd.a aVar = gd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    ib.b(obj);
                    this.b = 1;
                    return b0.d(b0Var, this) == aVar ? aVar : kVar;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.b(obj);
                return kVar;
            case 1:
                gd.a aVar2 = gd.a.a;
                int i12 = this.b;
                if (i12 == 0) {
                    ib.b(obj);
                    za.p pVar = b0Var.i;
                    this.b = 1;
                    Object i13 = ((wd.t) pVar.b).i(this);
                    if (i13 != aVar2) {
                        i13 = kVar;
                        break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ib.b(obj);
                        return kVar;
                    }
                    ib.b(obj);
                }
                zd.b e10 = b0Var.g().e();
                yd.a aVar3 = yd.a.a;
                yd.a aVar4 = yd.a.b;
                boolean z10 = e10 instanceof ae.g;
                fd.i iVar = fd.i.a;
                zd.b h = z10 ? ((ae.g) e10).h(iVar, 0, aVar4) : new ae.e(e10, iVar, 0, aVar4, 0);
                db.z0 z0Var = new db.z0(b0Var, i10);
                this.b = 2;
                if (h.U(z0Var, this) != aVar2) {
                    return kVar;
                }
                return aVar2;
            default:
                hi.d dVar = b0Var.h;
                gd.a aVar5 = gd.a.a;
                int i14 = this.b;
                try {
                    if (i14 == 0) {
                        ib.b(obj);
                        if (dVar.j2() instanceof l0) {
                            return dVar.j2();
                        }
                        this.b = 1;
                        if (b0Var.h(this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i14 != 1) {
                            if (i14 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ib.b(obj);
                            return (f1) obj;
                        }
                        ib.b(obj);
                    }
                    this.b = 2;
                    obj = b0.e(b0Var, false, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    return (f1) obj;
                } catch (Throwable th2) {
                    return new x0(-1, th2);
                }
        }
    }
}
