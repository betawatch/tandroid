package gd;

import j3.r0;
import kotlin.jvm.internal.i;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i9 = b.a;
        b = Long.MAX_VALUE;
        c = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb2, int i9, int i10, int i11, String str) {
        CharSequence charSequence;
        sb2.append(i9);
        if (i10 != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(i10);
            i.e(valueOf, "<this>");
            if (i11 < 0) {
                throw new IllegalArgumentException(r0.m(i11, "Desired length ", " is less than zero."));
            }
            if (i11 <= valueOf.length()) {
                charSequence = valueOf.subSequence(0, valueOf.length());
            } else {
                StringBuilder sb3 = new StringBuilder(i11);
                int length = i11 - valueOf.length();
                int i12 = 1;
                if (1 <= length) {
                    while (true) {
                        sb3.append('0');
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                sb3.append((CharSequence) valueOf);
                charSequence = sb3;
            }
            String obj = charSequence.toString();
            int i13 = -1;
            int length2 = obj.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (obj.charAt(length2) != '0') {
                        i13 = length2;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length2 = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (i15 < 3) {
                sb2.append((CharSequence) obj, 0, i15);
            } else {
                sb2.append((CharSequence) obj, 0, ((i13 + 3) / 3) * 3);
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
            int i9 = (((int) j11) & 1) - (1 & ((int) j10));
            return j11 < 0 ? -i9 : i9;
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
        int i9;
        long j11;
        int i10;
        int i11;
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
            int i12 = b.a;
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
            i10 = 0;
            i9 = 1;
        } else {
            if ((((int) j12) & 1) == 1) {
                i9 = 1;
                j11 = ((j12 >> 1) % MediaDataController.MAX_STYLE_RUNS_COUNT) * MediaController.VIDEO_BITRATE_480;
            } else {
                i9 = 1;
                j11 = (j12 >> 1) % 1000000000;
            }
            i10 = (int) j11;
        }
        boolean z11 = c11 != j10;
        boolean z12 = c12 != 0;
        boolean z13 = c10 != 0;
        boolean z14 = (c13 == 0 && i10 == 0) ? false : true;
        if (z11) {
            sb2.append(c11);
            sb2.append('d');
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(c12);
            sb2.append('h');
            i11 = i13;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(c10);
            sb2.append('m');
            i11 = i14;
        }
        if (z14) {
            int i15 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (c13 != 0 || z11 || z12 || z13) {
                a(sb2, c13, i10, 9, "s");
            } else if (i10 >= 1000000) {
                a(sb2, i10 / MediaController.VIDEO_BITRATE_480, i10 % MediaController.VIDEO_BITRATE_480, 6, "ms");
            } else if (i10 >= 1000) {
                a(sb2, i10 / MediaDataController.MAX_STYLE_RUNS_COUNT, i10 % MediaDataController.MAX_STYLE_RUNS_COUNT, 3, "us");
            } else {
                sb2.append(i10);
                sb2.append("ns");
            }
            i11 = i15;
        }
        if (z10 && i11 > i9) {
            sb2.insert(i9, '(').append(')');
        }
        return sb2.toString();
    }
}
