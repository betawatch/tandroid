package gb;

import a8.bb;
import java.util.Map;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class j0 {
    public static final i0 Companion = new i0();
    public static final gd.c[] d;
    public final n0 a;
    public final g1 b;
    public final Map c;

    static {
        gd.d[] dVarArr = gd.d.a;
        d = new gd.c[]{null, null, bb.a(new g0())};
    }

    public /* synthetic */ j0(int i7, n0 n0Var, g1 g1Var, Map map) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, h0.a.d());
            throw null;
        }
        this.a = n0Var;
        if ((i7 & 2) == 0) {
            this.b = null;
        } else {
            this.b = g1Var;
        }
        if ((i7 & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static j0 a(j0 j0Var, n0 sessionDetails, g1 g1Var, Map map, int i7) {
        if ((i7 & 1) != 0) {
            sessionDetails = j0Var.a;
        }
        if ((i7 & 2) != 0) {
            g1Var = j0Var.b;
        }
        if ((i7 & 4) != 0) {
            map = j0Var.c;
        }
        j0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new j0(sessionDetails, g1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.j.a(this.a, j0Var.a) && kotlin.jvm.internal.j.a(this.b, j0Var.b) && kotlin.jvm.internal.j.a(this.c, j0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g1 g1Var = this.b;
        int hashCode2 = (hashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public j0(n0 sessionDetails, g1 g1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.a = sessionDetails;
        this.b = g1Var;
        this.c = map;
    }
}
