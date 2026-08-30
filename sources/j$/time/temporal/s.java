package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public static s e(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(j10, j10, j11, j11);
    }

    public static s f(long j10, long j11) {
        if (j10 > j11) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j11) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(1L, 1L, j10, j11);
    }

    public s(long j10, long j11, long j12, long j13) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = j13;
    }

    public final int a(long j10, o oVar) {
        if (this.a < -2147483648L || this.d > 2147483647L || !d(j10)) {
            throw new j$.time.b(c(j10, oVar));
        }
        return (int) j10;
    }

    public final boolean d(long j10) {
        return j10 >= this.a && j10 <= this.d;
    }

    public final void b(long j10, o oVar) {
        if (!d(j10)) {
            throw new j$.time.b(c(j10, oVar));
        }
    }

    public final String c(long j10, o oVar) {
        if (oVar != null) {
            return "Invalid value for " + oVar + " (valid values " + this + "): " + j10;
        }
        return "Invalid value (valid values " + this + "): " + j10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j10 = this.a;
        long j11 = this.b;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j12 = this.c;
        long j13 = this.d;
        if (j12 > j13) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j11 > j13) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.a == sVar.a && this.b == sVar.b && this.c == sVar.c && this.d == sVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        long j11 = this.b;
        long j12 = j10 + (j11 << 16) + (j11 >> 48);
        long j13 = this.c;
        long j14 = j12 + (j13 << 32) + (j13 >> 32);
        long j15 = this.d;
        long j16 = j14 + (j15 << 48) + (j15 >> 16);
        return (int) (j16 ^ (j16 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }
}
