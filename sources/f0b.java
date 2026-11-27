// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class f0b extends wo4 {
    public final /* synthetic */ zy9 b;
    public final /* synthetic */ zg2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0b(zg2 zg2Var, zy9 zy9Var, zy9 zy9Var2) {
        super(zy9Var);
        this.c = zg2Var;
        this.b = zy9Var2;
    }

    @Override // wo4, zy9
    public final yy9 e(long j) {
        yy9 e = this.b.e(j);
        bz9 bz9Var = e.a;
        long j2 = bz9Var.a;
        long j3 = bz9Var.b;
        long j4 = this.c.b;
        bz9 bz9Var2 = new bz9(j2, j3 + j4);
        bz9 bz9Var3 = e.b;
        return new yy9(bz9Var2, new bz9(bz9Var3.a, bz9Var3.b + j4));
    }
}
