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

    public static s e(long j3, long j10) {
        if (j3 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(j3, j3, j10, j10);
    }

    public static s f(long j3, long j10) {
        if (j3 > j10) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(1L, 1L, j3, j10);
    }

    public s(long j3, long j10, long j11, long j12) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }

    public final int a(long j3, o oVar) {
        if (this.a < -2147483648L || this.d > 2147483647L || !d(j3)) {
            throw new j$.time.b(c(j3, oVar));
        }
        return (int) j3;
    }

    public final boolean d(long j3) {
        return j3 >= this.a && j3 <= this.d;
    }

    public final void b(long j3, o oVar) {
        if (!d(j3)) {
            throw new j$.time.b(c(j3, oVar));
        }
    }

    public final String c(long j3, o oVar) {
        if (oVar != null) {
            return "Invalid value for " + oVar + " (valid values " + this + "): " + j3;
        }
        return "Invalid value (valid values " + this + "): " + j3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j3 = this.a;
        long j10 = this.b;
        if (j3 > j10) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j11 = this.c;
        long j12 = this.d;
        if (j11 > j12) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j10 > j12) {
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
        long j3 = this.a;
        long j10 = this.b;
        long j11 = j3 + (j10 << 16) + (j10 >> 48);
        long j12 = this.c;
        long j13 = j11 + (j12 << 32) + (j12 >> 32);
        long j14 = this.d;
        long j15 = j13 + (j14 << 48) + (j14 >> 16);
        return (int) (j15 ^ (j15 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.a);
        if (this.a != this.b) {
            sb2.append('/');
            sb2.append(this.b);
        }
        sb2.append(" - ");
        sb2.append(this.c);
        if (this.c != this.d) {
            sb2.append('/');
            sb2.append(this.d);
        }
        return sb2.toString();
    }
}
