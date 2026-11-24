// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class j44 implements jd7 {
    public static final fm4 g;
    public static final fm4 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        em4 em4Var = new em4();
        em4Var.s = ud7.n("application/id3");
        g = new fm4(em4Var);
        em4 em4Var2 = new em4();
        em4Var2.s = ud7.n("application/x-scte35");
        h = new fm4(em4Var2);
    }

    public j44(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // jd7
    public final fm4 a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // jd7
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j44.class != obj.getClass()) {
            return false;
        }
        j44 j44Var = (j44) obj;
        return this.c == j44Var.c && this.d == j44Var.d && Objects.equals(this.a, j44Var.a) && this.b.equals(j44Var.b) && Arrays.equals(this.e, j44Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int j = ir2.j((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
        long j2 = this.c;
        int i2 = (j + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int hashCode = Arrays.hashCode(this.e) + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        this.f = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
