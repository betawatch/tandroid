package j$.time.temporal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q implements Serializable {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public static q i(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new q(j, j, j2, j2);
    }

    public static q j(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new q(1L, 1L, j, j2);
    }

    private q(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean f() {
        return this.a == this.b && this.c == this.d;
    }

    public final long e() {
        return this.a;
    }

    public final long d() {
        return this.d;
    }

    public final boolean g() {
        return this.a >= -2147483648L && this.d <= 2147483647L;
    }

    public final boolean h(long j) {
        return j >= this.a && j <= this.d;
    }

    public final int a(long j, a aVar) {
        if (g() && h(j)) {
            return (int) j;
        }
        throw new j$.time.c(c(j, aVar));
    }

    public final void b(long j, a aVar) {
        if (!h(j)) {
            throw new j$.time.c(c(j, aVar));
        }
    }

    private String c(long j, a aVar) {
        if (aVar != null) {
            return "Invalid value for " + aVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a + (j << 16) + (j >> 48);
        long j3 = this.c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.a;
        sb.append(j);
        long j2 = this.b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
