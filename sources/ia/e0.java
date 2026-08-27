package ia;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public e0(int i10, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i10;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.j.a(this.a, e0Var.a) && kotlin.jvm.internal.j.a(this.b, e0Var.b) && this.c == e0Var.c && this.d == e0Var.d;
    }

    public final int hashCode() {
        int g10 = (i0.a.g(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j10 = this.d;
        return g10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
