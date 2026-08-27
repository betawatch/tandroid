package id;

import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r1 extends tc.h implements ad.p {
    public w1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, rc.c cVar) {
        super(cVar);
        this.f = v1Var;
    }

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        r1 r1Var = new r1(this.f, cVar);
        r1Var.e = obj;
        return r1Var;
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((fd.c) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0063 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w1 c10;
        w1 w1Var;
        nd.k kVar;
        fd.c cVar;
        sc.a aVar = sc.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            k6.b(obj);
            fd.c cVar2 = (fd.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((u10 instanceof b1) && (c10 = ((b1) u10).c()) != null) {
                Object f10 = c10.f();
                kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                nd.k kVar2 = (nd.k) f10;
                w1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(w1Var)) {
                }
            }
        } else if (i10 == 1) {
            k6.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            w1Var = this.b;
            cVar = (fd.c) this.e;
            k6.b(obj);
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
                    sc.a aVar2 = sc.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(w1Var)) {
                }
            }
        }
        return pc.i.a;
    }
}
