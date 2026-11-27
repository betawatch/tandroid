// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
