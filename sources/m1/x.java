package m1;

import java.io.Serializable;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class x extends kd.j implements rd.l {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ b0 c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, id.c cVar) {
        super(1, cVar);
        this.e = rVar;
        this.c = b0Var;
        this.f = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kd.j, rd.p] */
    @Override // kd.a
    public final id.c create(id.c cVar) {
        switch (this.a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.e, this.c, (kotlin.jvm.internal.p) this.f, cVar);
            default:
                return new x(this.c, (id.h) this.e, (rd.p) this.f, cVar);
        }
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.a) {
        }
        return ((x) create(cVar)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kd.j, rd.p] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.p pVar;
        c cVar;
        Object obj2;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.f;
                kotlin.jvm.internal.r rVar2 = (kotlin.jvm.internal.r) this.e;
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                b0 b0Var = this.c;
                try {
                } catch (b unused) {
                    Object obj3 = rVar2.a;
                    this.d = pVar2;
                    this.b = 3;
                    obj = b0Var.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i7 == 0) {
                    af.b.c(obj);
                    this.d = rVar2;
                    this.b = 1;
                    obj = b0Var.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            pVar = (kotlin.jvm.internal.p) ((Serializable) this.d);
                            af.b.c(obj);
                            pVar.a = ((Number) obj).intValue();
                            return gd.k.a;
                        }
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar2 = (kotlin.jvm.internal.p) ((Serializable) this.d);
                        af.b.c(obj);
                        pVar2.a = ((Number) obj).intValue();
                        return gd.k.a;
                    }
                    rVar = (kotlin.jvm.internal.r) ((Serializable) this.d);
                    af.b.c(obj);
                }
                rVar.a = obj;
                m0 g10 = b0Var.g();
                this.d = pVar2;
                this.b = 2;
                obj = g10.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                pVar = pVar2;
                pVar.a = ((Number) obj).intValue();
                return gd.k.a;
            default:
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                b0 b0Var2 = this.c;
                if (i10 == 0) {
                    af.b.c(obj);
                    this.b = 1;
                    obj = b0.f(b0Var2, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.d;
                            af.b.c(obj);
                            return obj4;
                        }
                        cVar = (c) this.d;
                        af.b.c(obj);
                        obj2 = cVar.b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == cVar.c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!kotlin.jvm.internal.j.a(cVar.b, obj)) {
                            this.d = obj;
                            this.b = 3;
                            if (b0Var2.j(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    af.b.c(obj);
                }
                cVar = (c) obj;
                id.h hVar = (id.h) this.e;
                be.l lVar = new be.l((rd.p) this.f, cVar, (id.c) null);
                this.d = cVar;
                this.b = 2;
                obj = zd.b0.y(hVar, lVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = cVar.b;
                if ((obj2 == null ? obj2.hashCode() : 0) == cVar.c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(b0 b0Var, id.h hVar, rd.p pVar, id.c cVar) {
        super(1, cVar);
        this.c = b0Var;
        this.e = hVar;
        this.f = (kd.j) pVar;
    }
}
