package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class k {
    private static final k c = new k();
    private final boolean a;
    private final int b;

    private k() {
        this.a = false;
        this.b = 0;
    }

    public static k a() {
        return c;
    }

    private k(int i) {
        this.a = true;
        this.b = i;
    }

    public static k d(int i) {
        return new k(i);
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        boolean z = this.a;
        if (z && kVar.a) {
            if (this.b == kVar.b) {
                return true;
            }
        } else if (z == kVar.a) {
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
