package kotlin.properties;

import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public interface ReadOnlyProperty {
    Object getValue(Object obj, KProperty kProperty);
}
