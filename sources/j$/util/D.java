package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class D {
    private static final D c = new D();
    private final boolean a;
    private final long b;

    private D() {
        this.a = false;
        this.b = 0L;
    }

    public static D a() {
        return c;
    }

    private D(long j) {
        this.a = true;
        this.b = j;
    }

    public static D d(long j) {
        return new D(j);
    }

    public final long b() {
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
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        boolean z = this.a;
        if (z && d.a) {
            if (this.b == d.b) {
                return true;
            }
        } else if (z == d.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
