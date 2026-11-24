// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oe5 extends pg0 {
    public final List d;
    public final long e;

    public oe5(long j, List list) {
        super(0L, list.size() - 1);
        this.e = j;
        this.d = list;
    }

    @Override // bk6
    public final long a() {
        b();
        return this.e + ((bf5) this.d.get((int) this.c)).e;
    }

    @Override // bk6
    public final long h() {
        b();
        bf5 bf5Var = (bf5) this.d.get((int) this.c);
        return this.e + bf5Var.e + bf5Var.c;
    }
}
