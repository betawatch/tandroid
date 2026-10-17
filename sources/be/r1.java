package be;

import v7.i8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class r1 extends md.h implements td.p {
    public w1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, kd.c cVar) {
        super(cVar);
        this.f = v1Var;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
        r1 r1Var = new r1(this.f, cVar);
        r1Var.e = obj;
        return r1Var;
    }

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((yd.c) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0063 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // md.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w1 c10;
        w1 w1Var;
        ge.k kVar;
        yd.c cVar;
        ld.a aVar = ld.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            i8.b(obj);
            yd.c cVar2 = (yd.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.b(rVar, this);
                return aVar;
            }
            if ((u10 instanceof b1) && (c10 = ((b1) u10).c()) != null) {
                Object f7 = c10.f();
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                ge.k kVar2 = (ge.k) f7;
                w1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(w1Var)) {
                }
            }
        } else if (i10 == 1) {
            i8.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            w1Var = this.b;
            cVar = (yd.c) this.e;
            i8.b(obj);
            kVar = kVar.g();
            if (!kVar.equals(w1Var)) {
                if (kVar instanceof q) {
                    q qVar = (q) kVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = w1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.b(rVar2, this);
                    ld.a aVar2 = ld.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(w1Var)) {
                }
            }
        }
        return id.i.a;
    }
}
