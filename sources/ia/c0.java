package ia;

import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c0 extends tc.i implements ad.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, rc.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.a) {
            case 0:
                c0 c0Var = new c0((String) this.c, cVar, 0);
                c0Var.b = obj;
                return c0Var;
            default:
                c0 c0Var2 = new c0((k1.a0) this.c, cVar, 1);
                c0Var2.b = obj;
                return c0Var2;
        }
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) create((n1.b) obj, (rc.c) obj2);
                pc.i iVar = pc.i.a;
                c0Var.invokeSuspend(iVar);
                return iVar;
            default:
                return ((c0) create((k1.a0) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
        }
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                sc.a aVar = sc.a.a;
                k6.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.e key = y.a;
                kotlin.jvm.internal.j.e(key, "key");
                bVar.b(key, (String) obj2);
                return pc.i.a;
            default:
                sc.a aVar2 = sc.a.a;
                k6.b(obj);
                k1.a0 a0Var = (k1.a0) this.b;
                k1.a0 a0Var2 = (k1.a0) obj2;
                boolean z10 = false;
                if (!(a0Var2 instanceof k1.b) && !(a0Var2 instanceof k1.g) && a0Var == a0Var2) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
