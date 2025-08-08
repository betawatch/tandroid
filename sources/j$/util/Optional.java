package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return A.y(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
