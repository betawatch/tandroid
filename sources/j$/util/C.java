package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {
    private static final C c = new C();
    private final boolean a;
    private final int b;

    private C() {
        this.a = false;
        this.b = 0;
    }

    public static C a() {
        return c;
    }

    private C(int i) {
        this.a = true;
        this.b = i;
    }

    public static C d(int i) {
        return new C(i);
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
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        boolean z = this.a;
        if (z && c2.a) {
            if (this.b == c2.b) {
                return true;
            }
        } else if (z == c2.a) {
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
