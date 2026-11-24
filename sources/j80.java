// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j80 implements cq7 {
    public static final j80 a = new j80();
    public static final wa4 b = new wa4("currentCacheSizeBytes", b10.m(b10.l(fv8.class, new wy(1))));
    public static final wa4 c = new wa4("maxCacheSizeBytes", b10.m(b10.l(fv8.class, new wy(2))));

    @Override // b44
    public final void a(Object obj, Object obj2) {
        h3b h3bVar = (h3b) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, h3bVar.a);
        dq7Var.g(c, h3bVar.b);
    }
}
