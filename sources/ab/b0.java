package ab;

import v7.i8;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class b0 extends md.i implements td.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // md.a
    public final kd.c create(Object obj, kd.c cVar) {
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

    @Override // td.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) create((n1.b) obj, (kd.c) obj2);
                id.i iVar = id.i.a;
                b0Var.invokeSuspend(iVar);
                return iVar;
            default:
                return ((b0) create((k1.a0) obj, (kd.c) obj2)).invokeSuspend(id.i.a);
        }
    }

    @Override // md.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ld.a aVar = ld.a.a;
                i8.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = x.a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return id.i.a;
            default:
                ld.a aVar2 = ld.a.a;
                i8.b(obj);
                k1.a0 a0Var = (k1.a0) obj2;
                return Boolean.valueOf(((a0Var instanceof k1.b) || (a0Var instanceof k1.g) || ((k1.a0) this.b) != a0Var) ? false : true);
        }
    }
}
