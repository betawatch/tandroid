package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {
    public static final Duration c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int compare = Long.compare(this.a, duration2.a);
        return compare != 0 ? compare : this.b - duration2.b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration k(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 = (int) (i10 + 1000000000);
            j11--;
        }
        return j(j11, i10);
    }

    public static Duration j(long j10, int i10) {
        if ((i10 | j10) == 0) {
            return c;
        }
        return new Duration(j10, i10);
    }

    public Duration(long j10, int i10) {
        this.a = j10;
        this.b = i10;
    }

    public long getSeconds() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        return (this.b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j10 = this.a;
        if (j10 < 0 && this.b > 0) {
            j10++;
        }
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j11 != 0) {
            sb.append(j11);
            sb.append('H');
        }
        if (i10 != 0) {
            sb.append(i10);
            sb.append('M');
        }
        if (i11 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.a >= 0 || this.b <= 0) {
            sb.append(i11);
        } else if (i11 == 0) {
            sb.append("-0");
        } else {
            sb.append(i11);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (this.a < 0) {
                sb.append(2000000000 - this.b);
            } else {
                sb.append(this.b + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
