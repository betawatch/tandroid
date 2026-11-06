package m1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class c1 extends kd.j implements rd.p {
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        return new c1(2, cVar);
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        c1 c1Var = (c1) create((ce.d) obj, (id.c) obj2);
        gd.k kVar = gd.k.a;
        c1Var.invokeSuspend(kVar);
        return kVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        af.b.c(obj);
        return gd.k.a;
    }
}
