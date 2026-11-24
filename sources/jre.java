// default package

import java.math.RoundingMode;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class jre {
    public static int a(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long b0 = hac.b0(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (b0 > 0 && b0 <= 2147483647L) {
                return (int) b0;
            }
        }
        return -2147483647;
    }
}
