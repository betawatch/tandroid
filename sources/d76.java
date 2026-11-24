// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d76 {
    public static lr5 a(Object obj, long j) {
        lr5 lr5Var = (lr5) d8c.h(obj, j);
        if (((s3) lr5Var).a) {
            return lr5Var;
        }
        int size = lr5Var.size();
        hv8 j2 = ((hv8) lr5Var).j(size == 0 ? 10 : size << 1);
        d8c.o(obj, j, j2);
        return j2;
    }
}
