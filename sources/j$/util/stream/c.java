package j$.util.stream;

/* loaded from: classes2.dex */
public abstract class c {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public abstract void clear();

    public c() {
        this.a = 4;
    }

    public c(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i7);
        }
        this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i7 - 1));
    }

    public final long count() {
        int i7 = this.c;
        if (i7 == 0) {
            return this.b;
        }
        return this.d[i7] + this.b;
    }
}
