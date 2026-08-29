package ja;

import i7.c7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b0 extends uc.i implements bd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, sc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // uc.a
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.a) {
            case 0:
                b0 b0Var = new b0((String) this.c, cVar, 0);
                b0Var.b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.b0) this.c, cVar, 1);
                b0Var2.b = obj;
                return b0Var2;
        }
    }

    @Override // bd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) create((n1.b) obj, (sc.c) obj2);
                qc.i iVar = qc.i.a;
                b0Var.invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.b0) obj, (sc.c) obj2)).invokeSuspend(qc.i.a);
        }
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                tc.a aVar = tc.a.a;
                c7.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = x.a;
                kotlin.jvm.internal.j.e(key, "key");
                bVar.b(key, (String) obj2);
                return qc.i.a;
            default:
                tc.a aVar2 = tc.a.a;
                c7.b(obj);
                k1.b0 b0Var = (k1.b0) obj2;
                return Boolean.valueOf(((b0Var instanceof k1.b) || (b0Var instanceof k1.g) || ((k1.b0) this.b) != b0Var) ? false : true);
        }
    }
}
