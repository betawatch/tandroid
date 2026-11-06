package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    public static <T> Optional<T> of(T t6) {
        return new Optional<>(t6);
    }

    public T get() {
        T t6 = (T) this.a;
        if (t6 != null) {
            return t6;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public void ifPresent(Consumer<? super T> consumer) {
        a0.h hVar = (Object) this.a;
        if (hVar != null) {
            consumer.accept(hVar);
        }
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return (isPresent() && !predicate.test((Object) this.a)) ? empty() : this;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        U apply = function.apply((Object) this.a);
        return apply == null ? empty() : of(apply);
    }

    public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> function) {
        Objects.requireNonNull(function);
        if (!isPresent()) {
            return empty();
        }
        return (Optional) Objects.requireNonNull(function.apply((Object) this.a));
    }

    public Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) {
        Objects.requireNonNull(supplier);
        return isPresent() ? this : (Optional) Objects.requireNonNull(supplier.get());
    }

    public T orElse(T t6) {
        T t10 = (T) this.a;
        return t10 != null ? t10 : t6;
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
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
