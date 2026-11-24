// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c8a {
    public static final b8a Companion = new b8a();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ c8a(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            dte.a(i, 15, a8a.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8a)) {
            return false;
        }
        c8a c8aVar = (c8a) obj;
        return rr5.a(this.a, c8aVar.a) && rr5.a(this.b, c8aVar.b) && this.c == c8aVar.c && this.d == c8aVar.d;
    }

    public final int hashCode() {
        int j = (ts2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j2 = this.d;
        return j + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public c8a(long j, String str, String str2, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
