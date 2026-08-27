package ma;

import j$.util.Objects;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b {
    public final Field a;

    public b(Field field) {
        Objects.requireNonNull(field);
        this.a = field;
    }

    public final String toString() {
        return this.a.toString();
    }
}
