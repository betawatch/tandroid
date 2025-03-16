package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class Preferences {

    public static final class Key {
        private final String name;

        public Key(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return Intrinsics.areEqual(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return this.name;
        }
    }

    public static final class Pair {
    }

    public abstract Map asMap();

    public abstract Object get(Key key);

    public final MutablePreferences toMutablePreferences() {
        Map mutableMap;
        mutableMap = MapsKt__MapsKt.toMutableMap(asMap());
        return new MutablePreferences(mutableMap, false);
    }

    public final Preferences toPreferences() {
        Map mutableMap;
        mutableMap = MapsKt__MapsKt.toMutableMap(asMap());
        return new MutablePreferences(mutableMap, true);
    }
}
