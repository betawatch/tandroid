package ce;

import a8.jd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r1 extends nd.h implements ud.p {
    public w1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ v1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(v1 v1Var, ld.c cVar) {
        super(cVar);
        this.f = v1Var;
    }

    @Override // nd.a
    public final ld.c create(Object obj, ld.c cVar) {
        r1 r1Var = new r1(this.f, cVar);
        r1Var.e = obj;
        return r1Var;
    }

    @Override // ud.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((zd.c) obj, (ld.c) obj2)).invokeSuspend(jd.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w1 c10;
        w1 w1Var;
        he.k kVar;
        zd.c cVar;
        md.a aVar = md.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            jd.b(obj);
            zd.c cVar2 = (zd.c) this.e;
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
                he.k kVar2 = (he.k) f7;
                w1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(w1Var)) {
                }
            }
        } else if (i10 == 1) {
            jd.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            w1Var = this.b;
            cVar = (zd.c) this.e;
            jd.b(obj);
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
                    md.a aVar2 = md.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(w1Var)) {
                }
            }
        }
        return jd.i.a;
    }
}
