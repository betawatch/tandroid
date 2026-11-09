package m1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
