// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum fs3 {
    b(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(TimeUnit.MICROSECONDS),
    c(TimeUnit.MILLISECONDS),
    d(TimeUnit.SECONDS),
    e(TimeUnit.MINUTES),
    f(TimeUnit.HOURS),
    h(TimeUnit.DAYS);

    public final TimeUnit a;

    fs3(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
