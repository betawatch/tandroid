package ha;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final j e;
    public final String f;

    public n0(String sessionId, String firstSessionId, int i9, long j10, j jVar, String str) {
        kotlin.jvm.internal.i.e(sessionId, "sessionId");
        kotlin.jvm.internal.i.e(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i9;
        this.d = j10;
        this.e = jVar;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.i.a(this.a, n0Var.a) && kotlin.jvm.internal.i.a(this.b, n0Var.b) && this.c == n0Var.c && this.d == n0Var.d && kotlin.jvm.internal.i.a(this.e, n0Var.e) && kotlin.jvm.internal.i.a(this.f, n0Var.f);
    }

    public final int hashCode() {
        int f10 = (j3.r0.f(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j10 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((f10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ')';
    }
}
