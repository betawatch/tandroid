// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class a6a {
    public static final z5a Companion = new z5a();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ a6a(int i, String str, String str2, int i2, long j) {
        if (15 != (i & 15)) {
            are.a(i, 15, y5a.a.d());
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
        if (!(obj instanceof a6a)) {
            return false;
        }
        a6a a6aVar = (a6a) obj;
        return rp5.a(this.a, a6aVar.a) && rp5.a(this.b, a6aVar.b) && this.c == a6aVar.c && this.d == a6aVar.d;
    }

    public final int hashCode() {
        int j = (ir2.j(this.a.hashCode() * 31, 31, this.b) + this.c) * 31;
        long j2 = this.d;
        return j + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public a6a(long j, String str, String str2, int i) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
