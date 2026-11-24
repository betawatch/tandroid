package j$.util.stream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class j2 implements h2 {
    public final h2 a;
    public final h2 b;
    public final long c;

    public j2(h2 h2Var, h2 h2Var2) {
        this.a = h2Var;
        this.b = h2Var2;
        this.c = h2Var2.count() + h2Var.count();
    }

    @Override // j$.util.stream.h2
    public final h2 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.h2
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.h2
    public final int h() {
        return 2;
    }

    @Override // j$.util.stream.h2
    public final /* bridge */ /* synthetic */ g2 a(int i) {
        return (g2) a(i);
    }
}
