package com.google.android.datatransport;

/* loaded from: classes.dex */
public abstract class Event {
    public abstract Integer getCode();

    public abstract Object getPayload();

    public abstract Priority getPriority();

    public abstract ProductData getProductData();

    public static Event ofData(int i, Object obj) {
        return new AutoValue_Event(Integer.valueOf(i), obj, Priority.DEFAULT, null);
    }

    public static Event ofData(Object obj, ProductData productData) {
        return new AutoValue_Event(null, obj, Priority.DEFAULT, productData);
    }

    public static Event ofData(Object obj) {
        return new AutoValue_Event(null, obj, Priority.DEFAULT, null);
    }

    public static Event ofTelemetry(int i, Object obj) {
        return new AutoValue_Event(Integer.valueOf(i), obj, Priority.VERY_LOW, null);
    }

    public static Event ofTelemetry(Object obj) {
        return new AutoValue_Event(null, obj, Priority.VERY_LOW, null);
    }

    public static Event ofUrgent(Object obj) {
        return new AutoValue_Event(null, obj, Priority.HIGHEST, null);
    }
}
