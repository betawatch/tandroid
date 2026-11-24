package j$.util.stream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class c {
    public final int a;
    public int b;
    public int c;
    public long[] d;

    public c(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            j$.time.g.j("Illegal Capacity: ", i);
            throw null;
        }
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        return i == 0 ? this.b : this.d[i] + this.b;
    }

    public c() {
        this.a = 4;
    }
}
