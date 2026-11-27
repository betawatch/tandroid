// default package

import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class n3 implements Map.Entry {
    public final /* synthetic */ byte a;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (tue.a(getKey(), entry.getKey()) && tue.a(getValue(), entry.getValue())) {
                    }
                }
                break;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (l8f.a(getKey(), entry2.getKey()) && l8f.a(getValue(), entry2.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (e6f.a(getKey(), entry3.getKey()) && e6f.a(getValue(), entry3.getValue())) {
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
                return qd4.y(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
