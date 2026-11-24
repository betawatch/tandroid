package j$.util;

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class q implements Map.Entry {
    public final Map.Entry a;

    public q(Map.Entry entry) {
        this.a = (Map.Entry) Objects.requireNonNull(entry);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = this.a.getKey();
                Object key2 = entry.getKey();
                if (key == null ? key2 == null : key.equals(key2)) {
                    Object value = this.a.getValue();
                    Object value2 = entry.getValue();
                    if (value == null ? value2 == null : value.equals(value2)) {
                    }
                }
            }
            return false;
        }
        return true;
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
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString();
    }
}
