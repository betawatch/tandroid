package gb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class x0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final k e;
    public final String f;
    public final String g;

    public x0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.j.e(sessionId, "sessionId");
        kotlin.jvm.internal.j.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.j.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.a = sessionId;
        this.b = firstSessionId;
        this.c = i7;
        this.d = j3;
        this.e = kVar;
        this.f = str;
        this.g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return kotlin.jvm.internal.j.a(this.a, x0Var.a) && kotlin.jvm.internal.j.a(this.b, x0Var.b) && this.c == x0Var.c && this.d == x0Var.d && kotlin.jvm.internal.j.a(this.e, x0Var.e) && kotlin.jvm.internal.j.a(this.f, x0Var.f) && kotlin.jvm.internal.j.a(this.g, x0Var.g);
    }

    public final int hashCode() {
        int h = (com.google.android.recaptcha.internal.a.h(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j3 = this.d;
        return this.g.hashCode() + com.google.android.recaptcha.internal.a.h((this.e.hashCode() + ((h + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
