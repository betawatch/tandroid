package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class Optional<T> {
    public static final Optional b = new Optional();
    public final Object a;

    public Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public Optional(Object obj) {
        this.a = Objects.requireNonNull(obj);
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
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
