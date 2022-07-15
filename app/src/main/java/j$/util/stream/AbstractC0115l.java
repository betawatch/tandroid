package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
/* renamed from: j$.util.stream.l */
/* loaded from: classes2.dex */
public abstract class AbstractC0115l {
    static {
        EnumC0091h enumC0091h = EnumC0091h.CONCURRENT;
        EnumC0091h enumC0091h2 = EnumC0091h.UNORDERED;
        EnumC0091h enumC0091h3 = EnumC0091h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0091h, enumC0091h2, enumC0091h3));
        Collections.unmodifiableSet(EnumSet.of(enumC0091h, enumC0091h2));
        Collections.unmodifiableSet(EnumSet.of(enumC0091h3));
        Collections.unmodifiableSet(EnumSet.of(enumC0091h2, enumC0091h3));
        Collections.emptySet();
    }

    public static double a(double[] dArr) {
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (!Double.isNaN(d) || !Double.isInfinite(d2)) ? d : d2;
    }

    public static double[] b(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
        return dArr;
    }
}
