package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class l {
    private static final l c = new l();
    private final boolean a;
    private final long b;

    private l() {
        this.a = false;
        this.b = 0L;
    }

    public static l a() {
        return c;
    }

    private l(long j) {
        this.a = true;
        this.b = j;
    }

    public static l d(long j) {
        return new l(j);
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        boolean z = this.a;
        if (z && lVar.a) {
            if (this.b == lVar.b) {
                return true;
            }
        } else if (z == lVar.a) {
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
