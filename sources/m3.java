// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class m3 implements Map.Entry {
    public final /* synthetic */ byte a;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (ese.a(getKey(), entry.getKey()) && ese.a(getValue(), entry.getValue())) {
                    }
                }
                break;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (u5f.a(getKey(), entry2.getKey()) && u5f.a(getValue(), entry2.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (o3f.a(getKey(), entry3.getKey()) && o3f.a(getValue(), entry3.getValue())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        switch (this.a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i = value.hashCode();
                    break;
                }
                break;
            case 1:
                Object key2 = getKey();
                Object value2 = getValue();
                hashCode = key2 == null ? 0 : key2.hashCode();
                if (value2 != null) {
                    i = value2.hashCode();
                    break;
                }
                break;
            default:
                Object key3 = getKey();
                Object value3 = getValue();
                hashCode = key3 == null ? 0 : key3.hashCode();
                if (value3 != null) {
                    i = value3.hashCode();
                    break;
                }
                break;
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return getKey() + "=" + getValue();
            case 1:
                return getKey() + "=" + getValue();
            default:
                return kt6.o(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
