// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lxd implements cq7 {
    public static final lxd a = new lxd();
    public static final wa4 b = new wa4("logEventKey", b10.m(mlb.r(mmd.class, new eld(1))));
    public static final wa4 c = new wa4("eventCount", b10.m(mlb.r(mmd.class, new eld(2))));
    public static final wa4 d = new wa4("inferenceDurationStats", b10.m(mlb.r(mmd.class, new eld(3))));

    @Override // b44
    public final void a(Object obj, Object obj2) {
        rrd rrdVar = (rrd) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, rrdVar.a);
        dq7Var.a(c, rrdVar.b);
        dq7Var.a(d, rrdVar.c);
    }
}
