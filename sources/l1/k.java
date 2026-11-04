package l1;

import b8.ib;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends hd.j implements od.l {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public int h;
    public final /* synthetic */ b0 n;
    public final /* synthetic */ za.p r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b0 b0Var, za.p pVar, fd.c cVar) {
        super(1, cVar);
        this.n = b0Var;
        this.r = pVar;
    }

    @Override // hd.a
    public final fd.c create(fd.c cVar) {
        return new k(this.n, this.r, cVar);
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        return ((k) create((fd.c) obj)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fe.a dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.r rVar2;
        Iterator it;
        fe.a aVar;
        kotlin.jvm.internal.o oVar2;
        kotlin.jvm.internal.r rVar3;
        j jVar;
        fe.d dVar2;
        kotlin.jvm.internal.r rVar4;
        kotlin.jvm.internal.o oVar3;
        Object obj2;
        Object obj3;
        Object d;
        int i3;
        gd.a aVar2 = gd.a.a;
        int i10 = this.h;
        za.p pVar = this.r;
        b0 b0Var = this.n;
        if (i10 == 0) {
            ib.b(obj);
            dVar = new fe.d();
            oVar = new kotlin.jvm.internal.o();
            rVar = new kotlin.jvm.internal.r();
            this.a = dVar;
            this.b = oVar;
            this.c = rVar;
            this.d = rVar;
            this.h = 1;
            obj = b0.f(b0Var, true, this);
            if (obj != aVar2) {
                rVar2 = rVar;
            }
            return aVar2;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f;
                    obj3 = this.a;
                    ib.b(obj);
                    return new c(obj3, i3, ((Number) obj).intValue());
                }
                Object obj4 = (fe.a) this.c;
                rVar4 = (kotlin.jvm.internal.r) this.b;
                oVar3 = (kotlin.jvm.internal.o) this.a;
                ib.b(obj);
                obj2 = obj4;
                try {
                    oVar3.a = true;
                    ((fe.d) obj2).f(null);
                    obj3 = rVar4.a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    m0 g7 = b0Var.g();
                    this.a = obj3;
                    this.b = null;
                    this.c = null;
                    this.f = hashCode;
                    this.h = 4;
                    d = g7.d(this);
                    if (d != aVar2) {
                        i3 = hashCode;
                        obj = d;
                        return new c(obj3, i3, ((Number) obj).intValue());
                    }
                    return aVar2;
                } catch (Throwable th2) {
                    ((fe.d) obj2).f(null);
                    throw th2;
                }
            }
            it = this.e;
            jVar = (j) this.d;
            rVar3 = (kotlin.jvm.internal.r) this.c;
            oVar2 = (kotlin.jvm.internal.o) this.b;
            aVar = (fe.a) this.a;
            ib.b(obj);
            while (it.hasNext()) {
                od.p pVar2 = (od.p) it.next();
                this.a = aVar;
                this.b = oVar2;
                this.c = rVar3;
                this.d = jVar;
                this.e = it;
                this.h = 2;
                if (pVar2.invoke(jVar, this) == aVar2) {
                    break;
                }
            }
            rVar2 = rVar3;
            oVar = oVar2;
            dVar = aVar;
            pVar.c = null;
            this.a = oVar;
            this.b = rVar2;
            this.c = dVar;
            this.d = null;
            this.e = null;
            this.h = 3;
            dVar2 = (fe.d) dVar;
            if (dVar2.d(this) != aVar2) {
                rVar4 = rVar2;
                oVar3 = oVar;
                obj2 = dVar2;
                oVar3.a = true;
                ((fe.d) obj2).f(null);
                obj3 = rVar4.a;
                if (obj3 == null) {
                }
                m0 g72 = b0Var.g();
                this.a = obj3;
                this.b = null;
                this.c = null;
                this.f = hashCode;
                this.h = 4;
                d = g72.d(this);
                if (d != aVar2) {
                }
            }
            return aVar2;
        }
        rVar = (kotlin.jvm.internal.r) this.d;
        rVar2 = (kotlin.jvm.internal.r) this.c;
        oVar = (kotlin.jvm.internal.o) this.b;
        dVar = (fe.a) this.a;
        ib.b(obj);
        rVar.a = ((c) obj).b;
        j jVar2 = new j(dVar, oVar, rVar2, b0Var);
        List list = (List) pVar.c;
        if (list != null) {
            it = list.iterator();
            aVar = dVar;
            oVar2 = oVar;
            rVar3 = rVar2;
            jVar = jVar2;
            while (it.hasNext()) {
            }
            rVar2 = rVar3;
            oVar = oVar2;
            dVar = aVar;
        }
        pVar.c = null;
        this.a = oVar;
        this.b = rVar2;
        this.c = dVar;
        this.d = null;
        this.e = null;
        this.h = 3;
        dVar2 = (fe.d) dVar;
        if (dVar2.d(this) != aVar2) {
        }
        return aVar2;
    }
}
