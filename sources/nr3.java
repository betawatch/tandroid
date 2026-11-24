// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public enum nr3 {
    b(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(TimeUnit.MICROSECONDS),
    c(TimeUnit.MILLISECONDS),
    d(TimeUnit.SECONDS),
    e(TimeUnit.MINUTES),
    f(TimeUnit.HOURS),
    h(TimeUnit.DAYS);

    public final TimeUnit a;

    nr3(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
