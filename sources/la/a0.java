package la;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public a0(int i10, long j10, String sessionId, String firstSessionId) {
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
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.j.a(this.a, a0Var.a) && kotlin.jvm.internal.j.a(this.b, a0Var.b) && this.c == a0Var.c && this.d == a0Var.d;
    }

    public final int hashCode() {
        int e = (kf.k0.e(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j10 = this.d;
        return e + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
