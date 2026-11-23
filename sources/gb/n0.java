package gb;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class n0 {
    public static final m0 Companion = new m0();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ n0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, l0.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = j3;
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
        int h = (e2.h(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j3 = this.d;
        return h + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public n0(long j3, String str, String str2, int i7) {
        this.a = str;
        this.b = str2;
        this.c = i7;
        this.d = j3;
    }
}
