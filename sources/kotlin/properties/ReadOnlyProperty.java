package kotlin.properties;

import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface ReadOnlyProperty {
    Object getValue(Object obj, KProperty kProperty);
}
