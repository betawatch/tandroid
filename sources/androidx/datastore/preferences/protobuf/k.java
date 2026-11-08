package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class k {
    public int a;
    public Object b;

    public abstract void a(int i7);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i7);

    public abstract int e(int i7);

    public abstract boolean f();

    public abstract h g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i7);

    public void y() {
        int u10;
        do {
            u10 = u();
            if (u10 == 0) {
                return;
            }
            int i7 = this.a;
            if (i7 >= 100) {
                throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i7 + 1;
            this.a--;
        } while (x(u10));
    }
}
