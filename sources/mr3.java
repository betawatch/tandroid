// default package

import androidx.car.app.model.DurationSpan;
import j$.time.Duration;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class mr3 {
    public static DurationSpan a(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }
}
