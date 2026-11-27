// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class mje {
    public static final long a(long j) {
        long j2 = (j << 1) + 1;
        int i = bs3.d;
        int i2 = ds3.a;
        return j2;
    }

    public static final long b(long j) {
        long j2 = j << 1;
        int i = bs3.d;
        int i2 = ds3.a;
        return j2;
    }

    public static final long c(int i, fs3 fs3Var) {
        if (fs3Var.compareTo(fs3.d) > 0) {
            return d(i, fs3Var);
        }
        return b(TimeUnit.NANOSECONDS.convert(i, fs3Var.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5 > 4611686018427387903L) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j, fs3 fs3Var) {
        TimeUnit timeUnit = fs3Var.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return b(timeUnit2.convert(j, timeUnit));
        }
        long convert2 = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        long j2 = convert2 >= -4611686018427387903L ? 4611686018427387903L : -4611686018427387903L;
        convert2 = j2;
        return a(convert2);
    }
}
