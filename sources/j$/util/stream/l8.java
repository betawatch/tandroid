package j$.util.stream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class l8 extends j5 implements r8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ k8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(k8 k8Var, n5 n5Var, boolean z) {
        super(n5Var);
        this.e = k8Var;
        this.d = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((n5) obj);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept((n5) obj);
    }

    @Override // j$.util.stream.r8
    public final long v() {
        return this.b;
    }
}
