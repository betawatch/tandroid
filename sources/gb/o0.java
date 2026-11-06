package gb;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class o0 {
    public static final n0 Companion = new n0();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ o0(int i7, String str, String str2, int i10, long j3) {
        if (15 != (i7 & 15)) {
            oe.k.a(i7, 15, m0.a.d());
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
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.j.a(this.a, o0Var.a) && kotlin.jvm.internal.j.a(this.b, o0Var.b) && this.c == o0Var.c && this.d == o0Var.d;
    }

    public final int hashCode() {
        int h = (com.google.android.recaptcha.internal.a.h(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j3 = this.d;
        return h + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public o0(int i7, long j3, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i7;
        this.d = j3;
    }
}
