// default package

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
