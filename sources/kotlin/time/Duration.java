package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt__StringsKt;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes3.dex */
public final class Duration implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = constructor-impl(0);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(4611686018427387903L);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    private static final void appendFractional-impl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        String padStart;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) padStart, 0, i6);
            }
            Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ Duration box-impl(long j) {
        return new Duration(j);
    }

    public static int compareTo-LRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return isNegative-impl(j) ? -i : i;
    }

    public static long constructor-impl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (isInNanos-impl(j)) {
                if (!new LongRange(-4611686018426999999L, 4611686018426999999L).contains(getValue-impl(j))) {
                    throw new AssertionError(getValue-impl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, 4611686018427387903L).contains(getValue-impl(j))) {
                    throw new AssertionError(getValue-impl(j) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(getValue-impl(j))) {
                    throw new AssertionError(getValue-impl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static boolean equals-impl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).unbox-impl();
    }

    public static final long getAbsoluteValue-UwyO8pc(long j) {
        return isNegative-impl(j) ? unaryMinus-UwyO8pc(j) : j;
    }

    public static final int getHoursComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        return (int) (getInWholeHours-impl(j) % 24);
    }

    public static final long getInWholeDays-impl(long j) {
        return toLong-impl(j, DurationUnit.DAYS);
    }

    public static final long getInWholeHours-impl(long j) {
        return toLong-impl(j, DurationUnit.HOURS);
    }

    public static final long getInWholeMilliseconds-impl(long j) {
        return (isInMillis-impl(j) && isFinite-impl(j)) ? getValue-impl(j) : toLong-impl(j, DurationUnit.MILLISECONDS);
    }

    public static final long getInWholeMinutes-impl(long j) {
        return toLong-impl(j, DurationUnit.MINUTES);
    }

    public static final long getInWholeSeconds-impl(long j) {
        return toLong-impl(j, DurationUnit.SECONDS);
    }

    public static final int getMinutesComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        return (int) (getInWholeMinutes-impl(j) % 60);
    }

    public static final int getNanosecondsComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        boolean z = isInMillis-impl(j);
        long j2 = getValue-impl(j);
        return (int) (z ? DurationKt.millisToNanos(j2 % MediaDataController.MAX_STYLE_RUNS_COUNT) : j2 % 1000000000);
    }

    public static final int getSecondsComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        return (int) (getInWholeSeconds-impl(j) % 60);
    }

    private static final DurationUnit getStorageUnit-impl(long j) {
        return isInNanos-impl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    private static final long getValue-impl(long j) {
        return j >> 1;
    }

    public static int hashCode-impl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    public static final boolean isFinite-impl(long j) {
        return !isInfinite-impl(j);
    }

    private static final boolean isInMillis-impl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean isInNanos-impl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean isInfinite-impl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean isNegative-impl(long j) {
        return j < 0;
    }

    public static final boolean isPositive-impl(long j) {
        return j > 0;
    }

    public static final long toLong-impl(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(getValue-impl(j), getStorageUnit-impl(j), unit);
    }

    public static String toString-impl(long j) {
        int i;
        long j2;
        StringBuilder sb;
        int i2;
        int i3;
        String str;
        boolean z;
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean z2 = isNegative-impl(j);
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append('-');
        }
        long j3 = getAbsoluteValue-UwyO8pc(j);
        long j4 = getInWholeDays-impl(j3);
        int i4 = getHoursComponent-impl(j3);
        int i5 = getMinutesComponent-impl(j3);
        int i6 = getSecondsComponent-impl(j3);
        int i7 = getNanosecondsComponent-impl(j3);
        int i8 = 0;
        boolean z3 = j4 != 0;
        boolean z4 = i4 != 0;
        boolean z5 = i5 != 0;
        boolean z6 = (i6 == 0 && i7 == 0) ? false : true;
        if (z3) {
            sb2.append(j4);
            sb2.append('d');
            i8 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i9 = i8 + 1;
            if (i8 > 0) {
                sb2.append(' ');
            }
            sb2.append(i4);
            sb2.append('h');
            i8 = i9;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i10 = i8 + 1;
            if (i8 > 0) {
                sb2.append(' ');
            }
            sb2.append(i5);
            sb2.append('m');
            i8 = i10;
        }
        if (z6) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb2.append(' ');
            }
            if (i6 != 0 || z3 || z4 || z5) {
                i = 9;
                j2 = j;
                sb = sb2;
                i2 = i6;
                i3 = i7;
                str = "s";
                z = false;
            } else {
                if (i7 >= 1000000) {
                    i2 = i7 / MediaController.VIDEO_BITRATE_480;
                    i3 = i7 % MediaController.VIDEO_BITRATE_480;
                    str = "ms";
                    z = false;
                    i = 6;
                } else if (i7 >= 1000) {
                    i2 = i7 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    i3 = i7 % MediaDataController.MAX_STYLE_RUNS_COUNT;
                    str = "us";
                    z = false;
                    i = 3;
                } else {
                    sb2.append(i7);
                    sb2.append("ns");
                    i8 = i11;
                }
                j2 = j;
                sb = sb2;
            }
            appendFractional-impl(j2, sb, i2, i3, i, str, z);
            i8 = i11;
        }
        if (z2 && i8 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long unaryMinus-UwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-getValue-impl(j), ((int) j) & 1);
        return durationOf;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo-LRDsOJo(((Duration) obj).unbox-impl());
    }

    public int compareTo-LRDsOJo(long j) {
        return compareTo-LRDsOJo(this.rawValue, j);
    }

    public boolean equals(Object obj) {
        return equals-impl(this.rawValue, obj);
    }

    public int hashCode() {
        return hashCode-impl(this.rawValue);
    }

    public String toString() {
        return toString-impl(this.rawValue);
    }

    public final /* synthetic */ long unbox-impl() {
        return this.rawValue;
    }
}
