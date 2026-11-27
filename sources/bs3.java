// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class bs3 implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i = ds3.a;
        b = mje.a(4611686018427387903L);
        c = mje.a(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i2);
            valueOf.getClass();
            if (i3 < 0) {
                lq5.j(qd4.n(i3, "Desired length ", " is less than zero."));
                return;
            }
            if (i3 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - valueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) valueOf);
                charSequence = sb2;
            }
            String obj = charSequence.toString();
            int i5 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (obj.charAt(length2) == '0') {
                        if (i6 < 0) {
                            break;
                        } else {
                            length2 = i6;
                        }
                    } else {
                        i5 = length2;
                        break;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) obj, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) obj, 0, i7);
            }
        }
        sb.append(str);
    }

    public static int b(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final boolean c(long j) {
        return j == b || j == c;
    }

    public static final long d(long j, fs3 fs3Var) {
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        return fs3Var.a.convert(j >> 1, ((((int) j) & 1) == 0 ? fs3.b : fs3.c).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.a, ((bs3) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bs3) {
            return this.a == ((bs3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        int i;
        long j = this.a;
        if (j == 0) {
            return "0s";
        }
        if (j == b) {
            return "Infinity";
        }
        if (j == c) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = (((int) j) & 1) + ((-(j >> 1)) << 1);
            int i3 = ds3.a;
        }
        long d2 = d(j, fs3.h);
        int d3 = c(j) ? 0 : (int) (d(j, fs3.f) % 24);
        int d4 = c(j) ? 0 : (int) (d(j, fs3.e) % 60);
        int d5 = c(j) ? 0 : (int) (d(j, fs3.d) % 60);
        if (c(j)) {
            i = 0;
        } else {
            int i4 = ((int) j) & 1;
            long j2 = j >> 1;
            i = (int) (i4 == 1 ? (j2 % 1000) * 1000000 : j2 % 1000000000);
        }
        boolean z2 = d2 != 0;
        boolean z3 = d3 != 0;
        boolean z4 = d4 != 0;
        boolean z5 = (d5 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(d2);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(d3);
            sb.append('h');
            i2 = i5;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(d4);
            sb.append('m');
            i2 = i6;
        }
        if (z5) {
            int i7 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (d5 != 0 || z2 || z3 || z4) {
                a(sb, d5, i, 9, "s", false);
            } else if (i >= 1000000) {
                a(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                a(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i2 = i7;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
