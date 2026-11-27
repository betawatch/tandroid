// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jma extends yfb implements is4 {
    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new jma(2, zw2Var);
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        jma jmaVar = (jma) create((nm4) obj, (zw2) obj2);
        g9c g9cVar = g9c.a;
        jmaVar.invokeSuspend(g9cVar);
        return g9cVar;
    }
}
