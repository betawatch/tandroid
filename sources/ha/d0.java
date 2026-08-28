package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public d0(int i9, long j10, String sessionId, String firstSessionId) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i9;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.i.a(this.a, d0Var.a) && kotlin.jvm.internal.i.a(this.b, d0Var.b) && this.c == d0Var.c && this.d == d0Var.d;
    }

    public final int hashCode() {
        int f10 = (j3.r0.f(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j10 = this.d;
        return f10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
