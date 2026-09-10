package k1;

import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n extends kd.j implements rd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, id.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                n nVar = new n((b0) this.c, cVar, 0);
                nVar.b = obj;
                return nVar;
            default:
                n nVar2 = new n((String) this.c, cVar, 1);
                nVar2.b = obj;
                return nVar2;
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n) create((b0) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
            default:
                n nVar = (n) create((n1.b) obj, (id.c) obj2);
                gd.i iVar = gd.i.a;
                nVar.invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                jd.a aVar = jd.a.a;
                u7.b(obj);
                b0 b0Var = (b0) obj2;
                return Boolean.valueOf(((b0Var instanceof b) || (b0Var instanceof g) || ((b0) this.b) != b0Var) ? false : true);
            default:
                jd.a aVar2 = jd.a.a;
                u7.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = za.v.a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return gd.i.a;
        }
    }
}
