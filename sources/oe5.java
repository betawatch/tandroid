// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
