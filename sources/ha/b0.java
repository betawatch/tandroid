package ha;

import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 extends sc.i implements zc.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, qc.c cVar, int i9) {
        super(2, cVar);
        this.a = i9;
        this.c = obj;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.a) {
            case 0:
                b0 b0Var = new b0((String) this.c, cVar, 0);
                b0Var.b = obj;
                return b0Var;
            default:
                b0 b0Var2 = new b0((k1.a0) this.c, cVar, 1);
                b0Var2.b = obj;
                return b0Var2;
        }
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) create((n1.b) obj, (qc.c) obj2);
                oc.i iVar = oc.i.a;
                b0Var.invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.a0) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
        }
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.a;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                rc.a aVar = rc.a.a;
                y5.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = x.a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return oc.i.a;
            default:
                rc.a aVar2 = rc.a.a;
                y5.b(obj);
                k1.a0 a0Var = (k1.a0) obj2;
                return Boolean.valueOf(((a0Var instanceof k1.b) || (a0Var instanceof k1.g) || ((k1.a0) this.b) != a0Var) ? false : true);
        }
    }
}
