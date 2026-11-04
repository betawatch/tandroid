package l1;

import b8.ib;
import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends hd.j implements od.l {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ b0 c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kotlin.jvm.internal.r rVar, b0 b0Var, kotlin.jvm.internal.p pVar, fd.c cVar) {
        super(1, cVar);
        this.e = rVar;
        this.c = b0Var;
        this.f = pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [hd.j, od.p] */
    @Override // hd.a
    public final fd.c create(fd.c cVar) {
        switch (this.a) {
            case 0:
                return new x((kotlin.jvm.internal.r) this.e, this.c, (kotlin.jvm.internal.p) this.f, cVar);
            default:
                return new x(this.c, (fd.h) this.e, (od.p) this.f, cVar);
        }
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        fd.c cVar = (fd.c) obj;
        switch (this.a) {
        }
        return ((x) create(cVar)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r7v2, types: [hd.j, od.p] */
    @Override // hd.a
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
                gd.a aVar = gd.a.a;
                int i3 = this.b;
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
                if (i3 == 0) {
                    ib.b(obj);
                    this.d = rVar2;
                    this.b = 1;
                    obj = b0Var.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            pVar = (kotlin.jvm.internal.p) ((Serializable) this.d);
                            ib.b(obj);
                            pVar.a = ((Number) obj).intValue();
                            return dd.k.a;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar2 = (kotlin.jvm.internal.p) ((Serializable) this.d);
                        ib.b(obj);
                        pVar2.a = ((Number) obj).intValue();
                        return dd.k.a;
                    }
                    rVar = (kotlin.jvm.internal.r) ((Serializable) this.d);
                    ib.b(obj);
                }
                rVar.a = obj;
                m0 g7 = b0Var.g();
                this.d = pVar2;
                this.b = 2;
                obj = g7.d(this);
                if (obj == aVar) {
                    return aVar;
                }
                pVar = pVar2;
                pVar.a = ((Number) obj).intValue();
                return dd.k.a;
            default:
                gd.a aVar2 = gd.a.a;
                int i10 = this.b;
                b0 b0Var2 = this.c;
                if (i10 == 0) {
                    ib.b(obj);
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
                            ib.b(obj);
                            return obj4;
                        }
                        cVar = (c) this.d;
                        ib.b(obj);
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
                    ib.b(obj);
                }
                cVar = (c) obj;
                fd.h hVar = (fd.h) this.e;
                ae.d dVar = new ae.d((od.p) this.f, cVar, (fd.c) null);
                this.d = cVar;
                this.b = 2;
                obj = wd.b0.y(hVar, dVar, this);
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
    public x(b0 b0Var, fd.h hVar, od.p pVar, fd.c cVar) {
        super(1, cVar);
        this.c = b0Var;
        this.e = hVar;
        this.f = (hd.j) pVar;
    }
}
