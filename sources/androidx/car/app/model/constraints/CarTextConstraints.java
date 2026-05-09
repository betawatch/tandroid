package androidx.car.app.model.constraints;

import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CarTextConstraints {
    private final HashSet mAllowedTypes;
    public static final CarTextConstraints CONSERVATIVE = new CarTextConstraints(Collections.emptyList());
    public static final CarTextConstraints UNCONSTRAINED = new CarTextConstraints(Arrays.asList(CarIconSpan.class, ClickableSpan.class, DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
    public static final CarTextConstraints CLICKABLE_TEXT_ONLY = new CarTextConstraints(Arrays.asList(ClickableSpan.class, DistanceSpan.class, DurationSpan.class));
    public static final CarTextConstraints COLOR_ONLY = new CarTextConstraints(Arrays.asList(ForegroundCarColorSpan.class));
    public static final CarTextConstraints TEXT_ONLY = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class));
    public static final CarTextConstraints TEXT_AND_ICON = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, CarIconSpan.class));
    public static final CarTextConstraints TEXT_WITH_COLORS = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class));
    public static final CarTextConstraints TEXT_WITH_COLORS_AND_ICON = new CarTextConstraints(Arrays.asList(DistanceSpan.class, DurationSpan.class, ForegroundCarColorSpan.class, CarIconSpan.class));

    public void validateOrThrow(CarText carText) {
        checkSupportedSpans(carText.getSpans());
        Iterator<List<CarText.SpanWrapper>> it = carText.getSpansForVariants().iterator();
        while (it.hasNext()) {
            checkSupportedSpans(it.next());
        }
    }

    private void checkSupportedSpans(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class<?> cls = ((CarText.SpanWrapper) it.next()).getCarSpan().getClass();
            if (!this.mAllowedTypes.contains(cls)) {
                throw new IllegalArgumentException("CarSpan type is not allowed: " + cls.getSimpleName());
            }
        }
    }

    private CarTextConstraints(List list) {
        this.mAllowedTypes = new HashSet(list);
    }
}
