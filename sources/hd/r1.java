package hd;

import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r1 extends sc.h implements zc.p {
    public w1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, qc.c cVar) {
        super(cVar);
        this.f = v1Var;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        r1 r1Var = new r1(this.f, cVar);
        r1Var.e = obj;
        return r1Var;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((ed.c) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0063 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // sc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w1 c10;
        w1 w1Var;
        md.k kVar;
        ed.c cVar;
        rc.a aVar = rc.a.a;
        int i9 = this.d;
        if (i9 == 0) {
            y5.b(obj);
            ed.c cVar2 = (ed.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((u10 instanceof b1) && (c10 = ((b1) u10).c()) != null) {
                Object f10 = c10.f();
                kotlin.jvm.internal.i.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                md.k kVar2 = (md.k) f10;
                w1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(w1Var)) {
                }
            }
        } else if (i9 == 1) {
            y5.b(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            w1Var = this.b;
            cVar = (ed.c) this.e;
            y5.b(obj);
            kVar = kVar.g();
            if (!kVar.equals(w1Var)) {
                if (kVar instanceof q) {
                    q qVar = (q) kVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = w1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.c(rVar2, this);
                    rc.a aVar2 = rc.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(w1Var)) {
                }
            }
        }
        return oc.i.a;
    }
}
