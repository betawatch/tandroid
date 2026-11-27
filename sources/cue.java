// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class cue {
    public static int a(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long b0 = gcc.b0(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (b0 > 0 && b0 <= 2147483647L) {
                return (int) b0;
            }
        }
        return -2147483647;
    }
}
