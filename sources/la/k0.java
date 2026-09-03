package la;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final j e;
    public final String f;

    public k0(String sessionId, String firstSessionId, int i10, long j10, j jVar, String str) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i10;
        this.d = j10;
        this.e = jVar;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.j.a(this.a, k0Var.a) && kotlin.jvm.internal.j.a(this.b, k0Var.b) && this.c == k0Var.c && this.d == k0Var.d && kotlin.jvm.internal.j.a(this.e, k0Var.e) && kotlin.jvm.internal.j.a(this.f, k0Var.f);
    }

    public final int hashCode() {
        int e6 = (l.d.e(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j10 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((e6 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ')';
    }
}
