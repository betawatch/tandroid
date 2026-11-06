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

    public static Duration k(long j3) {
        long j10 = j3 / 1000000000;
        int i7 = (int) (j3 % 1000000000);
        if (i7 < 0) {
            i7 = (int) (i7 + 1000000000);
            j10--;
        }
        return j(j10, i7);
    }

    public static Duration j(long j3, int i7) {
        if ((i7 | j3) == 0) {
            return c;
        }
        return new Duration(j3, i7);
    }

    public Duration(long j3, int i7) {
        this.a = j3;
        this.b = i7;
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
        long j3 = this.a;
        return (this.b * 51) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j3 = this.a;
        if (j3 < 0 && this.b > 0) {
            j3++;
        }
        long j10 = j3 / 3600;
        int i7 = (int) ((j3 % 3600) / 60);
        int i10 = (int) (j3 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j10 != 0) {
            sb2.append(j10);
            sb2.append('H');
        }
        if (i7 != 0) {
            sb2.append(i7);
            sb2.append('M');
        }
        if (i10 == 0 && this.b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (this.a >= 0 || this.b <= 0) {
            sb2.append(i10);
        } else if (i10 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i10);
        }
        if (this.b > 0) {
            int length = sb2.length();
            if (this.a < 0) {
                sb2.append(2000000000 - this.b);
            } else {
                sb2.append(this.b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new p((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
