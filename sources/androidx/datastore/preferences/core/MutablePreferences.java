package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MutablePreferences extends Preferences {
    private final AtomicBoolean frozen;
    private final Map preferencesMap;

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    public MutablePreferences(Map preferencesMap, boolean z) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (this.frozen.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public Object get(Preferences.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.preferencesMap.get(key);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public Map asMap() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.preferencesMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public final void set(Preferences.Key key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        setUnchecked$datastore_preferences_core(key, obj);
    }

    public final void setUnchecked$datastore_preferences_core(Preferences.Key key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        if (obj == null) {
            remove(key);
            return;
        }
        if (!(obj instanceof Set)) {
            this.preferencesMap.put(key, obj);
            return;
        }
        Map map = this.preferencesMap;
        Set unmodifiableSet = Collections.unmodifiableSet(CollectionsKt.toSet((Iterable) obj));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(key, unmodifiableSet);
    }

    public final void putAll(Preferences.Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core();
        if (pairs.length <= 0) {
            return;
        }
        Preferences.Pair pair = pairs[0];
        throw null;
    }

    public final Object remove(Preferences.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        return this.preferencesMap.remove(key);
    }

    public boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return Intrinsics.areEqual(this.preferencesMap, ((MutablePreferences) obj).preferencesMap);
        }
        return false;
    }

    public int hashCode() {
        return this.preferencesMap.hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new Function1() { // from class: androidx.datastore.preferences.core.MutablePreferences$toString$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Map.Entry entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return "  " + ((Preferences.Key) entry.getKey()).getName() + " = " + entry.getValue();
            }
        }, 24, null);
    }
}
