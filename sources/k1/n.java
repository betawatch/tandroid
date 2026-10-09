package k1;

import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class n extends ld.j implements sd.p {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, jd.c cVar, int i10) {
        super(2, cVar);
        this.a = i10;
        this.c = obj;
    }

    @Override // ld.a
    public final jd.c create(Object obj, jd.c cVar) {
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

    @Override // sd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((n) create((b0) obj, (jd.c) obj2)).invokeSuspend(hd.i.a);
            default:
                n nVar = (n) create((n1.b) obj, (jd.c) obj2);
                hd.i iVar = hd.i.a;
                nVar.invokeSuspend(iVar);
                return iVar;
        }
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                kd.a aVar = kd.a.a;
                a8.b(obj);
                b0 b0Var = (b0) obj2;
                return Boolean.valueOf(((b0Var instanceof b) || (b0Var instanceof g) || ((b0) this.b) != b0Var) ? false : true);
            default:
                kd.a aVar2 = kd.a.a;
                a8.b(obj);
                n1.b bVar = (n1.b) this.b;
                bVar.getClass();
                n1.d key = za.w.a;
                kotlin.jvm.internal.i.e(key, "key");
                bVar.b(key, (String) obj2);
                return hd.i.a;
        }
    }
}
