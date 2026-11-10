package androidx.car.app.model;

import j$.time.Duration;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class j {
    public static DurationSpan a(Duration duration) {
        Objects.requireNonNull(duration);
        return new DurationSpan(duration.getSeconds());
    }
}
