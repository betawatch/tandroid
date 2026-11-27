// default package

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f54 implements sf7 {
    public static final ko4 g;
    public static final ko4 h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        jo4 jo4Var = new jo4();
        jo4Var.s = dg7.n("application/id3");
        g = new ko4(jo4Var);
        jo4 jo4Var2 = new jo4();
        jo4Var2.s = dg7.n("application/x-scte35");
        h = new ko4(jo4Var2);
    }

    public f54(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // sf7
    public final ko4 a() {
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

    @Override // sf7
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
        if (obj == null || f54.class != obj.getClass()) {
            return false;
        }
        f54 f54Var = (f54) obj;
        return this.c == f54Var.c && this.d == f54Var.d && Objects.equals(this.a, f54Var.a) && this.b.equals(f54Var.b) && Arrays.equals(this.e, f54Var.e);
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int j = bs2.j((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
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

    @Override // sf7
    public final void b(lt6 lt6Var) {
    }
}
