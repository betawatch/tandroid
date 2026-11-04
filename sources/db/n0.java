package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 {
    public static final m0 Companion = new m0();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ n0(int i3, String str, String str2, int i10, long j10) {
        if (15 != (i3 & 15)) {
            le.k.a(i3, 15, l0.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return kotlin.jvm.internal.j.a(this.a, n0Var.a) && kotlin.jvm.internal.j.a(this.b, n0Var.b) && this.c == n0Var.c && this.d == n0Var.d;
    }

    public final int hashCode() {
        int g7 = (com.google.android.recaptcha.internal.a.g(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j10 = this.d;
        return g7 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public n0(int i3, long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i3;
        this.d = j10;
    }
}
