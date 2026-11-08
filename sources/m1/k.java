package m1;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k extends kd.j implements rd.l {
    public Object a;
    public Serializable b;
    public Object c;
    public Object d;
    public Iterator e;
    public int f;
    public int h;
    public final /* synthetic */ b0 n;
    public final /* synthetic */ ui.e r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b0 b0Var, ui.e eVar, id.c cVar) {
        super(1, cVar);
        this.n = b0Var;
        this.r = eVar;
    }

    @Override // kd.a
    public final id.c create(id.c cVar) {
        return new k(this.n, this.r, cVar);
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        return ((k) create((id.c) obj)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ie.a dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.r rVar2;
        Iterator it;
        ie.a aVar;
        kotlin.jvm.internal.o oVar2;
        kotlin.jvm.internal.r rVar3;
        j jVar;
        ie.d dVar2;
        kotlin.jvm.internal.r rVar4;
        kotlin.jvm.internal.o oVar3;
        Object obj2;
        Object obj3;
        Object b10;
        int i7;
        jd.a aVar2 = jd.a.a;
        int i10 = this.h;
        ui.e eVar = this.r;
        b0 b0Var = this.n;
        if (i10 == 0) {
            af.b.c(obj);
            dVar = new ie.d();
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
                    i7 = this.f;
                    obj3 = this.a;
                    af.b.c(obj);
                    return new c(obj3, i7, ((Number) obj).intValue());
                }
                Object obj4 = (ie.a) this.c;
                rVar4 = (kotlin.jvm.internal.r) this.b;
                oVar3 = (kotlin.jvm.internal.o) this.a;
                af.b.c(obj);
                obj2 = obj4;
                try {
                    oVar3.a = true;
                    ((ie.d) obj2).f(null);
                    obj3 = rVar4.a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    m0 g10 = b0Var.g();
                    this.a = obj3;
                    this.b = null;
                    this.c = null;
                    this.f = hashCode;
                    this.h = 4;
                    b10 = g10.b(this);
                    if (b10 != aVar2) {
                        i7 = hashCode;
                        obj = b10;
                        return new c(obj3, i7, ((Number) obj).intValue());
                    }
                    return aVar2;
                } catch (Throwable th2) {
                    ((ie.d) obj2).f(null);
                    throw th2;
                }
            }
            it = this.e;
            jVar = (j) this.d;
            rVar3 = (kotlin.jvm.internal.r) this.c;
            oVar2 = (kotlin.jvm.internal.o) this.b;
            aVar = (ie.a) this.a;
            af.b.c(obj);
            while (it.hasNext()) {
                rd.p pVar = (rd.p) it.next();
                this.a = aVar;
                this.b = oVar2;
                this.c = rVar3;
                this.d = jVar;
                this.e = it;
                this.h = 2;
                if (pVar.invoke(jVar, this) == aVar2) {
                    break;
                }
            }
            rVar2 = rVar3;
            oVar = oVar2;
            dVar = aVar;
            eVar.d = null;
            this.a = oVar;
            this.b = rVar2;
            this.c = dVar;
            this.d = null;
            this.e = null;
            this.h = 3;
            dVar2 = (ie.d) dVar;
            if (dVar2.d(this) != aVar2) {
                rVar4 = rVar2;
                oVar3 = oVar;
                obj2 = dVar2;
                oVar3.a = true;
                ((ie.d) obj2).f(null);
                obj3 = rVar4.a;
                if (obj3 == null) {
                }
                m0 g102 = b0Var.g();
                this.a = obj3;
                this.b = null;
                this.c = null;
                this.f = hashCode;
                this.h = 4;
                b10 = g102.b(this);
                if (b10 != aVar2) {
                }
            }
            return aVar2;
        }
        rVar = (kotlin.jvm.internal.r) this.d;
        rVar2 = (kotlin.jvm.internal.r) this.c;
        oVar = (kotlin.jvm.internal.o) this.b;
        dVar = (ie.a) this.a;
        af.b.c(obj);
        rVar.a = ((c) obj).b;
        j jVar2 = new j(dVar, oVar, rVar2, b0Var);
        List list = (List) eVar.d;
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
        eVar.d = null;
        this.a = oVar;
        this.b = rVar2;
        this.c = dVar;
        this.d = null;
        this.e = null;
        this.h = 3;
        dVar2 = (ie.d) dVar;
        if (dVar2.d(this) != aVar2) {
        }
        return aVar2;
    }
}
