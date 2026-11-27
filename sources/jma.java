// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jma extends yfb implements is4 {
    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new jma(2, zw2Var);
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        jma jmaVar = (jma) create((nm4) obj, (zw2) obj2);
        f9c f9cVar = f9c.a;
        jmaVar.invokeSuspend(f9cVar);
        return f9cVar;
    }
}
