package m1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        b7.h.b(obj);
        return gd.k.a;
    }
}
