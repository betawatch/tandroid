package gb;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class v0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final k e;
    public final String f;
    public final String g;

    public v0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
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
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.j.a(this.a, v0Var.a) && kotlin.jvm.internal.j.a(this.b, v0Var.b) && this.c == v0Var.c && this.d == v0Var.d && kotlin.jvm.internal.j.a(this.e, v0Var.e) && kotlin.jvm.internal.j.a(this.f, v0Var.f) && kotlin.jvm.internal.j.a(this.g, v0Var.g);
    }

    public final int hashCode() {
        int h = (e2.h(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j3 = this.d;
        return this.g.hashCode() + e2.h((this.e.hashCode() + ((h + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
