// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jz9 extends iz9 {
    public final ArrayList j;

    public jz9(n29 n29Var, long j, long j2, long j3, long j4, ArrayList arrayList, long j5, ArrayList arrayList2, long j6, long j7) {
        super(n29Var, j, j2, j3, j4, arrayList, j5, j6, j7);
        this.j = arrayList2;
    }

    @Override // nz9
    public final nz9 a() {
        return new jz9(this.a, this.b, 0L, this.d, this.e, this.f, this.i, this.j, this.g, this.h);
    }

    @Override // iz9
    public final long e(long j) {
        return this.j.size();
    }

    @Override // iz9
    public final n29 i(sb9 sb9Var, long j) {
        return (n29) this.j.get((int) (j - this.d));
    }

    @Override // iz9
    public final boolean j() {
        return true;
    }
}
