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

    public c(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i9);
        }
        this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i9 - 1));
    }

    public final long count() {
        int i9 = this.c;
        if (i9 == 0) {
            return this.b;
        }
        return this.d[i9] + this.b;
    }
}
