package ld;

import k7.q7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class q1 extends wc.h implements dd.p {
    public v1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(u1 u1Var, uc.c cVar) {
        super(cVar);
        this.f = u1Var;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        q1 q1Var = new q1(this.f, cVar);
        q1Var.e = obj;
        return q1Var;
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((id.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // wc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v1 c3;
        v1 v1Var;
        qd.k kVar;
        id.c cVar;
        vc.a aVar = vc.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            q7.b(obj);
            id.c cVar2 = (id.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((u10 instanceof a1) && (c3 = ((a1) u10).c()) != null) {
                Object f10 = c3.f();
                kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                qd.k kVar2 = (qd.k) f10;
                v1Var = c3;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(v1Var)) {
                }
            }
        } else if (i10 == 1) {
            q7.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            v1Var = this.b;
            cVar = (id.c) this.e;
            q7.b(obj);
            kVar = kVar.g();
            if (!kVar.equals(v1Var)) {
                if (kVar instanceof q) {
                    q qVar = (q) kVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = v1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.c(rVar2, this);
                    vc.a aVar2 = vc.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(v1Var)) {
                }
            }
        }
        return sc.i.a;
    }
}
