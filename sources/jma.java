// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
