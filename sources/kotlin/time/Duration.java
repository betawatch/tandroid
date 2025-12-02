package kotlin.time;

import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes3.dex */
public final class Duration implements Comparable {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = constructor-impl(0);

    public static final /* synthetic */ Duration box-impl(long j) {
        return new Duration(j);
    }

    public static boolean equals-impl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).unbox-impl();
    }

    private static final long getValue-impl(long j) {
        return j >> 1;
    }

    public static int hashCode-impl(long j) {
        return SessionDetails$$ExternalSyntheticBackport0.m(j);
    }

    private static final boolean isInMillis-impl(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final boolean isInNanos-impl(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean isNegative-impl(long j) {
        return j < 0;
    }

    public static final boolean isPositive-impl(long j) {
        return j > 0;
    }

    public boolean equals(Object obj) {
        return equals-impl(this.rawValue, obj);
    }

    public int hashCode() {
        return hashCode-impl(this.rawValue);
    }

    public final /* synthetic */ long unbox-impl() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo-LRDsOJo(((Duration) obj).unbox-impl());
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    private static final DurationUnit getStorageUnit-impl(long j) {
        return isInNanos-impl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    public static long constructor-impl(long j) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (isInNanos-impl(j)) {
                long j2 = getValue-impl(j);
                if (-4611686018426999999L > j2 || j2 >= 4611686018427000000L) {
                    throw new AssertionError(getValue-impl(j) + " ns is out of nanoseconds range");
                }
            } else {
                long j3 = getValue-impl(j);
                if (-4611686018427387903L > j3 || j3 >= 4611686018427387904L) {
                    throw new AssertionError(getValue-impl(j) + " ms is out of milliseconds range");
                }
                long j4 = getValue-impl(j);
                if (-4611686018426L <= j4 && j4 < 4611686018427L) {
                    throw new AssertionError(getValue-impl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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

    public static final long unaryMinus-UwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-getValue-impl(j), ((int) j) & 1);
        return durationOf;
    }

    public static final boolean isInfinite-impl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    public static final boolean isFinite-impl(long j) {
        return !isInfinite-impl(j);
    }

    public static final long getAbsoluteValue-UwyO8pc(long j) {
        return isNegative-impl(j) ? unaryMinus-UwyO8pc(j) : j;
    }

    public int compareTo-LRDsOJo(long j) {
        return compareTo-LRDsOJo(this.rawValue, j);
    }

    public static int compareTo-LRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return isNegative-impl(j) ? -i : i;
    }

    public static final int getHoursComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        return (int) (getInWholeHours-impl(j) % 24);
    }

    public static final int getMinutesComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        return (int) (getInWholeMinutes-impl(j) % 60);
    }

    public static final int getSecondsComponent-impl(long j) {
        if (isInfinite-impl(j)) {
            return 0;
        }
        return (int) (getInWholeSeconds-impl(j) % 60);
    }

    public static final int getNanosecondsComponent-impl(long j) {
        long j2;
        if (isInfinite-impl(j)) {
            return 0;
        }
        if (isInMillis-impl(j)) {
            j2 = DurationKt.millisToNanos(getValue-impl(j) % MediaDataController.MAX_STYLE_RUNS_COUNT);
        } else {
            j2 = getValue-impl(j) % 1000000000;
        }
        return (int) j2;
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

    public static final long getInWholeDays-impl(long j) {
        return toLong-impl(j, DurationUnit.DAYS);
    }

    public static final long getInWholeHours-impl(long j) {
        return toLong-impl(j, DurationUnit.HOURS);
    }

    public static final long getInWholeMinutes-impl(long j) {
        return toLong-impl(j, DurationUnit.MINUTES);
    }

    public static final long getInWholeSeconds-impl(long j) {
        return toLong-impl(j, DurationUnit.SECONDS);
    }

    public static final long getInWholeMilliseconds-impl(long j) {
        return (isInMillis-impl(j) && isFinite-impl(j)) ? getValue-impl(j) : toLong-impl(j, DurationUnit.MILLISECONDS);
    }

    public String toString() {
        return toString-impl(this.rawValue);
    }

    public static String toString-impl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean z = isNegative-impl(j);
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        long j2 = getAbsoluteValue-UwyO8pc(j);
        long j3 = getInWholeDays-impl(j2);
        int i = getHoursComponent-impl(j2);
        int i2 = getMinutesComponent-impl(j2);
        int i3 = getSecondsComponent-impl(j2);
        int i4 = getNanosecondsComponent-impl(j2);
        int i5 = 0;
        boolean z2 = j3 != 0;
        boolean z3 = i != 0;
        boolean z4 = i2 != 0;
        boolean z5 = (i3 == 0 && i4 == 0) ? false : true;
        if (z2) {
            sb.append(j3);
            sb.append('d');
            i5 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i6 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append('h');
            i5 = i6;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i7 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('m');
            i5 = i7;
        }
        if (z5) {
            int i8 = i5 + 1;
            if (i5 > 0) {
                sb.append(' ');
            }
            if (i3 != 0 || z2 || z3 || z4) {
                appendFractional-impl(j, sb, i3, i4, 9, "s", false);
            } else if (i4 >= 1000000) {
                appendFractional-impl(j, sb, i4 / MediaController.VIDEO_BITRATE_480, i4 % MediaController.VIDEO_BITRATE_480, 6, "ms", false);
            } else if (i4 >= 1000) {
                appendFractional-impl(j, sb, i4 / MediaDataController.MAX_STYLE_RUNS_COUNT, i4 % MediaDataController.MAX_STYLE_RUNS_COUNT, 3, "us", false);
            } else {
                sb.append(i4);
                sb.append("ns");
            }
            i5 = i8;
        }
        if (z && i5 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    private static final void appendFractional-impl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String padStart = StringsKt.padStart(String.valueOf(i2), i3, '0');
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
            if (!z && i6 < 3) {
                sb.append((CharSequence) padStart, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }
}
