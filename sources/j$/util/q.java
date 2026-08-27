package j$.util;

import java.util.Map;

/* loaded from: classes2.dex */
public final class q implements Map.Entry {
    public final Map.Entry a;

    public q(Map.Entry entry) {
        this.a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this != obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = this.a.getKey();
                Object key2 = entry.getKey();
                if (key == null) {
                    equals = key2 == null;
                } else {
                    equals = key.equals(key2);
                }
                if (equals) {
                    Object value = this.a.getValue();
                    Object value2 = entry.getValue();
                    if (value == null) {
                        equals2 = value2 == null;
                    } else {
                        equals2 = value.equals(value2);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
