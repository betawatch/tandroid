// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class nwd {
    public static ay2 a(ay2 ay2Var, by2 by2Var) {
        by2Var.getClass();
        if (rr5.a(ay2Var.getKey(), by2Var)) {
            return ay2Var;
        }
        return null;
    }

    public static cy2 b(ay2 ay2Var, by2 by2Var) {
        by2Var.getClass();
        return rr5.a(ay2Var.getKey(), by2Var) ? k34.a : ay2Var;
    }

    public static cy2 c(ay2 ay2Var, cy2 cy2Var) {
        cy2Var.getClass();
        return cy2Var == k34.a ? ay2Var : (cy2) cy2Var.fold(ay2Var, new qn2((byte) 1));
    }
}
