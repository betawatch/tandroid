package db;

import j$.util.Objects;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
