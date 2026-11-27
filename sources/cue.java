// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
