package ae;

import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s1 extends ld.i implements sd.p {
    public x1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ w1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(w1 w1Var, jd.c cVar) {
        super(cVar);
        this.f = w1Var;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
        s1 s1Var = new s1(this.f, cVar);
        s1Var.e = obj;
        return s1Var;
    }

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s1) create((xd.c) obj, (jd.c) obj2)).invokeSuspend(hd.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // ld.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x1 c10;
        x1 x1Var;
        fe.k kVar;
        xd.c cVar;
        kd.a aVar = kd.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            a8.b(obj);
            xd.c cVar2 = (xd.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((u10 instanceof c1) && (c10 = ((c1) u10).c()) != null) {
                Object f7 = c10.f();
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                fe.k kVar2 = (fe.k) f7;
                x1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(x1Var)) {
                }
            }
        } else if (i10 == 1) {
            a8.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            x1Var = this.b;
            cVar = (xd.c) this.e;
            a8.b(obj);
            kVar = kVar.g();
            if (!kVar.equals(x1Var)) {
                if (kVar instanceof q) {
                    q qVar = (q) kVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = x1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.c(rVar2, this);
                    kd.a aVar2 = kd.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(x1Var)) {
                }
            }
        }
        return hd.i.a;
    }
}
