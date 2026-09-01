package kd;

import kotlin.jvm.internal.j;
import l.d;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i10 = b.a;
        b = Long.MAX_VALUE;
        c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i11);
            j.e(valueOf, "<this>");
            if (i12 < 0) {
                throw new IllegalArgumentException(d.k(i12, "Desired length ", " is less than zero."));
            }
            if (i12 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i12);
                int length = i12 - valueOf.length();
                int i13 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                sb2.append((CharSequence) valueOf);
                charSequence = sb2;
            }
            String obj = charSequence.toString();
            int i14 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i15 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i14 = length2;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length2 = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (i16 < 3) {
                sb.append((CharSequence) obj, 0, i16);
            } else {
                sb.append((CharSequence) obj, 0, ((i14 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static final boolean b(long j10) {
        return j10 == b || j10 == c;
    }

    public static final long c(long j10, c unit) {
        j.e(unit, "unit");
        if (j10 == b) {
            return Long.MAX_VALUE;
        }
        if (j10 == c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        c sourceUnit = (((int) j10) & 1) == 0 ? c.b : c.c;
        j.e(sourceUnit, "sourceUnit");
        return unit.a.convert(j11, sourceUnit.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).a;
        long j11 = this.a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j11) & 1) - (1 & ((int) j10));
            return j11 < 0 ? -i10 : i10;
        }
        if (j11 < j10) {
            return -1;
        }
        return j11 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        long j10;
        int c3;
        int i10;
        long j11;
        int i11;
        int i12;
        long j12 = this.a;
        if (j12 == 0) {
            return "0s";
        }
        if (j12 == b) {
            return "Infinity";
        }
        if (j12 == c) {
            return "-Infinity";
        }
        boolean z4 = j12 < 0;
        StringBuilder sb = new StringBuilder();
        if (z4) {
            sb.append('-');
        }
        if (j12 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i13 = b.a;
        }
        long c10 = c(j12, c.h);
        int c11 = b(j12) ? 0 : (int) (c(j12, c.f) % 24);
        if (b(j12)) {
            j10 = 0;
            c3 = 0;
        } else {
            j10 = 0;
            c3 = (int) (c(j12, c.e) % 60);
        }
        int c12 = b(j12) ? 0 : (int) (c(j12, c.d) % 60);
        if (b(j12)) {
            i11 = 0;
            i10 = 1;
        } else {
            if ((((int) j12) & 1) == 1) {
                i10 = 1;
                j11 = ((j12 >> 1) % MediaDataController.MAX_STYLE_RUNS_COUNT) * MediaController.VIDEO_BITRATE_480;
            } else {
                i10 = 1;
                j11 = (j12 >> 1) % 1000000000;
            }
            i11 = (int) j11;
        }
        boolean z10 = c10 != j10;
        boolean z11 = c11 != 0;
        boolean z12 = c3 != 0;
        boolean z13 = (c12 == 0 && i11 == 0) ? false : true;
        if (z10) {
            sb.append(c10);
            sb.append('d');
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i14 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            sb.append(c11);
            sb.append('h');
            i12 = i14;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i15 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            sb.append(c3);
            sb.append('m');
            i12 = i15;
        }
        if (z13) {
            int i16 = i12 + 1;
            if (i12 > 0) {
                sb.append(' ');
            }
            if (c12 != 0 || z10 || z11 || z12) {
                a(sb, c12, i11, 9, "s");
            } else if (i11 >= 1000000) {
                a(sb, i11 / MediaController.VIDEO_BITRATE_480, i11 % MediaController.VIDEO_BITRATE_480, 6, "ms");
            } else if (i11 >= 1000) {
                a(sb, i11 / MediaDataController.MAX_STYLE_RUNS_COUNT, i11 % MediaDataController.MAX_STYLE_RUNS_COUNT, 3, "us");
            } else {
                sb.append(i11);
                sb.append("ns");
            }
            i12 = i16;
        }
        if (z4 && i12 > i10) {
            sb.insert(i10, '(').append(')');
        }
        return sb.toString();
    }
}
