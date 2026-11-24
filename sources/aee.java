// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class aee implements cq7 {
    public static final aee a = new aee();
    public static final wa4 b = new wa4("maxMs", b10.m(mlb.q(ikd.class, new cid(1))));
    public static final wa4 c = new wa4("minMs", b10.m(mlb.q(ikd.class, new cid(2))));
    public static final wa4 d = new wa4("avgMs", b10.m(mlb.q(ikd.class, new cid(3))));
    public static final wa4 e = new wa4("firstQuartileMs", b10.m(mlb.q(ikd.class, new cid(4))));
    public static final wa4 f = new wa4("medianMs", b10.m(mlb.q(ikd.class, new cid(5))));
    public static final wa4 g = new wa4("thirdQuartileMs", b10.m(mlb.q(ikd.class, new cid(6))));

    @Override // b44
    public final void a(Object obj, Object obj2) {
        f5f f5fVar = (f5f) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, f5fVar.a);
        dq7Var.a(c, f5fVar.b);
        dq7Var.a(d, f5fVar.c);
        dq7Var.a(e, f5fVar.d);
        dq7Var.a(f, f5fVar.e);
        dq7Var.a(g, f5fVar.f);
    }
}
