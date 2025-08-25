package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class B {
    private static final B c = new B();
    private final boolean a;
    private final int b;

    private B() {
        this.a = false;
        this.b = 0;
    }

    public static B a() {
        return c;
    }

    private B(int i) {
        this.a = true;
        this.b = i;
    }

    public static B d(int i) {
        return new B(i);
    }

    public final int b() {
        if (!this.a) {
            throw new NoSuchElementException("No value present");
        }
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b = (B) obj;
        boolean z = this.a;
        if (z && b.a) {
            if (this.b == b.b) {
                return true;
            }
        } else if (z == b.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }
}
