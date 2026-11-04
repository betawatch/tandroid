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

    public c(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i3);
        }
        this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i3 - 1));
    }

    public final long count() {
        int i3 = this.c;
        if (i3 == 0) {
            return this.b;
        }
        return this.d[i3] + this.b;
    }
}
