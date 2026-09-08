package bb;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public f(Boolean bool, Double d, Integer num, Integer num2, Long l4) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.i.a(this.a, fVar.a) && kotlin.jvm.internal.i.a(this.b, fVar.b) && kotlin.jvm.internal.i.a(this.c, fVar.c) && kotlin.jvm.internal.i.a(this.d, fVar.d) && kotlin.jvm.internal.i.a(this.e, fVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.e;
        return hashCode4 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionRestartTimeout=" + this.c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
