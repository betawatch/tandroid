package n3;

import b2.q0;
import b2.s0;
import b2.v;
import b2.v0;
import b2.w;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class a implements s0 {
    public static final w g;
    public static final w h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        v vVar = new v();
        vVar.r = v0.n("application/id3");
        g = new w(vVar);
        v vVar2 = new v();
        vVar2.r = v0.n("application/x-scte35");
        h = new w(vVar2);
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j10;
        this.d = j11;
        this.e = bArr;
    }

    @Override // b2.s0
    public final w a() {
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

    @Override // b2.s0
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.c == aVar.c && this.d == aVar.d && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j10 = this.c;
            int i10 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // b2.s0
    public final /* synthetic */ void b(q0 q0Var) {
    }
}
