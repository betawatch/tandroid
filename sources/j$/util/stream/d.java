package j$.util.stream;

/* loaded from: classes2.dex */
abstract class d {
    protected final int a;
    protected int b;
    protected int c;
    protected long[] d;

    public abstract void clear();

    protected d() {
        this.a = 4;
    }

    protected d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    public final long count() {
        int i = this.c;
        if (i == 0) {
            return this.b;
        }
        return this.d[i] + this.b;
    }
}
