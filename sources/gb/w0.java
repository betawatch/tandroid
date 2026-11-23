package gb;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class w0 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final k e;
    public final String f;
    public final String g;

    public w0(String sessionId, String firstSessionId, int i7, long j3, k kVar, String str, String firebaseAuthenticationToken) {
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
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return kotlin.jvm.internal.j.a(this.a, w0Var.a) && kotlin.jvm.internal.j.a(this.b, w0Var.b) && this.c == w0Var.c && this.d == w0Var.d && kotlin.jvm.internal.j.a(this.e, w0Var.e) && kotlin.jvm.internal.j.a(this.f, w0Var.f) && kotlin.jvm.internal.j.a(this.g, w0Var.g);
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
