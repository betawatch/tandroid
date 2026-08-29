package jd;

import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q1 extends uc.h implements bd.p {
    public v1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(u1 u1Var, sc.c cVar) {
        super(cVar);
        this.f = u1Var;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        q1 q1Var = new q1(this.f, cVar);
        q1Var.e = obj;
        return q1Var;
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((gd.c) obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // uc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v1 c3;
        v1 v1Var;
        od.l lVar;
        gd.c cVar;
        tc.a aVar = tc.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            c7.b(obj);
            gd.c cVar2 = (gd.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((u10 instanceof a1) && (c3 = ((a1) u10).c()) != null) {
                Object f9 = c3.f();
                kotlin.jvm.internal.j.c(f9, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                od.l lVar2 = (od.l) f9;
                v1Var = c3;
                lVar = lVar2;
                cVar = cVar2;
                if (!lVar.equals(v1Var)) {
                }
            }
        } else if (i10 == 1) {
            c7.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.c;
            v1Var = this.b;
            cVar = (gd.c) this.e;
            c7.b(obj);
            lVar = lVar.g();
            if (!lVar.equals(v1Var)) {
                if (lVar instanceof q) {
                    q qVar = (q) lVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = v1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.c(rVar2, this);
                    tc.a aVar2 = tc.a.a;
                    return aVar;
                }
                lVar = lVar.g();
                if (!lVar.equals(v1Var)) {
                }
            }
        }
        return qc.i.a;
    }
}
