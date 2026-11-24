// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class gpe {
    public static int a(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long b0 = g8c.b0(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (b0 > 0 && b0 <= 2147483647L) {
                return (int) b0;
            }
        }
        return -2147483647;
    }
}
