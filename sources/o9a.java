// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o9a {
    public static final n9a Companion = new n9a();
    public static final h26[] d = {null, null, ure.a(new tg8())};
    public final s9a a;
    public final orb b;
    public final Map c;

    public /* synthetic */ o9a(int i, s9a s9aVar, orb orbVar, Map map) {
        if (1 != (i & 1)) {
            sve.a(i, 1, m9a.a.d());
            throw null;
        }
        this.a = s9aVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = orbVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static o9a a(o9a o9aVar, s9a s9aVar, orb orbVar, Map map, int i) {
        if ((i & 1) != 0) {
            s9aVar = o9aVar.a;
        }
        if ((i & 2) != 0) {
            orbVar = o9aVar.b;
        }
        if ((i & 4) != 0) {
            map = o9aVar.c;
        }
        o9aVar.getClass();
        s9aVar.getClass();
        return new o9a(s9aVar, orbVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9a)) {
            return false;
        }
        o9a o9aVar = (o9a) obj;
        return ur5.a(this.a, o9aVar.a) && ur5.a(this.b, o9aVar.b) && ur5.a(this.c, o9aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        orb orbVar = this.b;
        int hashCode2 = (hashCode + (orbVar == null ? 0 : orbVar.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.a + ", backgroundTime=" + this.b + ", processDataMap=" + this.c + ')';
    }

    public o9a(s9a s9aVar, orb orbVar, Map map) {
        s9aVar.getClass();
        this.a = s9aVar;
        this.b = orbVar;
        this.c = map;
    }
}
