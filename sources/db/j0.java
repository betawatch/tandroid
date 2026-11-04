package db;

import b8.hb;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 {
    public static final i0 Companion = new i0();
    public static final dd.c[] d;
    public final n0 a;
    public final h1 b;
    public final Map c;

    static {
        dd.d[] dVarArr = dd.d.a;
        d = new dd.c[]{null, null, hb.a(new g0())};
    }

    public /* synthetic */ j0(int i3, n0 n0Var, h1 h1Var, Map map) {
        if (1 != (i3 & 1)) {
            le.k.a(i3, 1, h0.a.d());
            throw null;
        }
        this.a = n0Var;
        if ((i3 & 2) == 0) {
            this.b = null;
        } else {
            this.b = h1Var;
        }
        if ((i3 & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static j0 a(j0 j0Var, n0 sessionDetails, h1 h1Var, Map map, int i3) {
        if ((i3 & 1) != 0) {
            sessionDetails = j0Var.a;
        }
        if ((i3 & 2) != 0) {
            h1Var = j0Var.b;
        }
        if ((i3 & 4) != 0) {
            map = j0Var.c;
        }
        j0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new j0(sessionDetails, h1Var, map);
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
        h1 h1Var = this.b;
        int hashCode2 = (hashCode + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public j0(n0 sessionDetails, h1 h1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.a = sessionDetails;
        this.b = h1Var;
        this.c = map;
    }
}
