package m1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(b0 b0Var, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        this.c = b0Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                return new m(this.c, cVar, 0);
            case 1:
                return new m(this.c, cVar, 1);
            default:
                return new m(this.c, cVar, 2);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((m) create((zd.z) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r13 == r0) goto L47;
     */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i7 = this.a;
        gd.k kVar = gd.k.a;
        b0 b0Var = this.c;
        switch (i7) {
            case 0:
                jd.a aVar = jd.a.a;
                int i10 = this.b;
                if (i10 == 0) {
                    af.b.c(obj);
                    this.b = 1;
                    return b0.d(b0Var, this) == aVar ? aVar : kVar;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                af.b.c(obj);
                return kVar;
            case 1:
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                if (i11 == 0) {
                    af.b.c(obj);
                    ui.e eVar = b0Var.i;
                    this.b = 1;
                    Object i12 = ((zd.t) eVar.c).i(this);
                    if (i12 != aVar2) {
                        i12 = kVar;
                        break;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        af.b.c(obj);
                        return kVar;
                    }
                    af.b.c(obj);
                }
                ce.c d = b0Var.g().d();
                be.a aVar3 = be.a.a;
                be.a aVar4 = be.a.b;
                boolean z9 = d instanceof de.e;
                id.i iVar = id.i.a;
                ce.c P = z9 ? ((de.e) d).P(iVar, 0, aVar4) : new ce.b(d, iVar, 0, aVar4, 1);
                gb.a1 a1Var = new gb.a1(b0Var, 2);
                this.b = 2;
                if (P.B(a1Var, this) != aVar2) {
                    return kVar;
                }
                return aVar2;
            default:
                h9.f1 f1Var = b0Var.h;
                jd.a aVar5 = jd.a.a;
                int i13 = this.b;
                try {
                    if (i13 == 0) {
                        af.b.c(obj);
                        if (f1Var.T1() instanceof l0) {
                            return f1Var.T1();
                        }
                        this.b = 1;
                        if (b0Var.h(this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            af.b.c(obj);
                            return (e1) obj;
                        }
                        af.b.c(obj);
                    }
                    this.b = 2;
                    obj = b0.e(b0Var, false, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                    return (e1) obj;
                } catch (Throwable th2) {
                    return new w0(-1, th2);
                }
        }
    }
}
