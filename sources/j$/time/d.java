package j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d implements Comparable, Serializable {
    public static final d c = new d(0, 0);
    private final long a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int compare = Long.compare(this.a, dVar.a);
        return compare != 0 ? compare : this.b - dVar.b;
    }

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    public static d i(long j) {
        return f(j, 0);
    }

    public static d h() {
        return f(j$.com.android.tools.r8.a.f(Long.MAX_VALUE, j$.com.android.tools.r8.a.i(999999999L, 1000000000L)), (int) j$.com.android.tools.r8.a.h(999999999L, 1000000000L));
    }

    private static d f(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        return new d(j, i);
    }

    private d(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final long g() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == c) {
            return "PT0S";
        }
        long j = this.a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        int i3 = this.b;
        if (i2 == 0 && i3 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || i3 <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (i3 > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - i3);
            } else {
                sb.append(i3 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
