package be;

import kotlin.jvm.internal.i;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    public static final void a(StringBuilder sb2, int i10, int i11, int i12, String str) {
        CharSequence charSequence;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i11);
            i.e(valueOf, "<this>");
            if (i12 < 0) {
                throw new IllegalArgumentException(ic.a.j(i12, "Desired length ", " is less than zero."));
            }
            if (i12 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i12);
                int length = i12 - valueOf.length();
                int i13 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                sb3.append((CharSequence) valueOf);
                charSequence = sb3;
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
                sb2.append((CharSequence) obj, 0, i16);
            } else {
                sb2.append((CharSequence) obj, 0, ((i14 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static final boolean b(long j10) {
        return j10 == b || j10 == c;
    }

    public static final long c(long j10, c unit) {
        i.e(unit, "unit");
        if (j10 == b) {
            return Long.MAX_VALUE;
        }
        if (j10 == c) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 1;
        c sourceUnit = (((int) j10) & 1) == 0 ? c.b : c.c;
        i.e(sourceUnit, "sourceUnit");
        return unit.a.convert(j11, sourceUnit.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((a) obj).a;
        long j11 = this.a;
        long j12 = j11 ^ j10;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j11) & 1) - (((int) j10) & 1);
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
        int c10;
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
        boolean z10 = j12 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (j12 < 0) {
            j12 = (((int) j12) & 1) + ((-(j12 >> 1)) << 1);
            int i13 = b.a;
        }
        long c11 = c(j12, c.h);
        int c12 = b(j12) ? 0 : (int) (c(j12, c.f) % 24);
        if (b(j12)) {
            j10 = 0;
            c10 = 0;
        } else {
            j10 = 0;
            c10 = (int) (c(j12, c.e) % 60);
        }
        int c13 = b(j12) ? 0 : (int) (c(j12, c.d) % 60);
        if (b(j12)) {
            i10 = 1;
            i11 = 0;
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
        int i14 = c11 != j10 ? i10 : 0;
        int i15 = c12 != 0 ? i10 : 0;
        int i16 = c10 != 0 ? i10 : 0;
        int i17 = (c13 == 0 && i11 == 0) ? 0 : i10;
        if (i14 != 0) {
            sb2.append(c11);
            sb2.append('d');
            i12 = i10;
        } else {
            i12 = 0;
        }
        if (i15 != 0 || (i14 != 0 && (i16 != 0 || i17 != 0))) {
            int i18 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c12);
            sb2.append('h');
            i12 = i18;
        }
        if (i16 != 0 || (i17 != 0 && (i15 != 0 || i14 != 0))) {
            int i19 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(c10);
            sb2.append('m');
            i12 = i19;
        }
        if (i17 != 0) {
            int i20 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (c13 != 0 || i14 != 0 || i15 != 0 || i16 != 0) {
                a(sb2, c13, i11, 9, "s");
            } else if (i11 >= 1000000) {
                a(sb2, i11 / MediaController.VIDEO_BITRATE_480, i11 % MediaController.VIDEO_BITRATE_480, 6, "ms");
            } else if (i11 >= 1000) {
                a(sb2, i11 / MediaDataController.MAX_STYLE_RUNS_COUNT, i11 % MediaDataController.MAX_STYLE_RUNS_COUNT, 3, "us");
            } else {
                sb2.append(i11);
                sb2.append("ns");
            }
            i12 = i20;
        }
        if (z10 && i12 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
