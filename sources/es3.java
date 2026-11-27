// default package

import androidx.car.app.model.DurationSpan;
import j$.time.Duration;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class es3 {
    public static DurationSpan a(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }
}
