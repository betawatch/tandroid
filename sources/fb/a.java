package fb;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {
    public final Type a;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.a = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return d.k(this.a) + "[]";
    }
}
