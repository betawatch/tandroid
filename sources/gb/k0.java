package gb;

import a8.ab;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k0 {
    public static final j0 Companion = new j0();
    public static final gd.c[] d;
    public final o0 a;
    public final i1 b;
    public final Map c;

    static {
        gd.d[] dVarArr = gd.d.a;
        d = new gd.c[]{null, null, ab.a(new h0())};
    }

    public /* synthetic */ k0(int i7, o0 o0Var, i1 i1Var, Map map) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, i0.a.d());
            throw null;
        }
        this.a = o0Var;
        if ((i7 & 2) == 0) {
            this.b = null;
        } else {
            this.b = i1Var;
        }
        if ((i7 & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static k0 a(k0 k0Var, o0 sessionDetails, i1 i1Var, Map map, int i7) {
        if ((i7 & 1) != 0) {
            sessionDetails = k0Var.a;
        }
        if ((i7 & 2) != 0) {
            i1Var = k0Var.b;
        }
        if ((i7 & 4) != 0) {
            map = k0Var.c;
        }
        k0Var.getClass();
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        return new k0(sessionDetails, i1Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.j.a(this.a, k0Var.a) && kotlin.jvm.internal.j.a(this.b, k0Var.b) && kotlin.jvm.internal.j.a(this.c, k0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i1 i1Var = this.b;
        int hashCode2 = (hashCode + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public k0(o0 sessionDetails, i1 i1Var, Map map) {
        kotlin.jvm.internal.j.e(sessionDetails, "sessionDetails");
        this.a = sessionDetails;
        this.b = i1Var;
        this.c = map;
    }
}
