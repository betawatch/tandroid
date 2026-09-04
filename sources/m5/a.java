package m5;

import m1.j;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i10, long j3) {
        if (i10 == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i10;
        this.b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int c10 = (j.c(this.a) ^ 1000003) * 1000003;
        long j3 = this.b;
        return c10 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i10 = this.a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? BuildConfig.BETA_URL : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb2.append(", nextRequestWaitMillis=");
        return a4.a.r(sb2, this.b, "}");
    }
}
