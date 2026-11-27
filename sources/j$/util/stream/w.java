package j$.util.stream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class w extends k1 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(a aVar, int i, byte b) {
        super(aVar, i);
        this.l = b;
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new t(this, n5Var, (byte) 2);
            case 1:
                return new x0(n5Var, (byte) 0);
            case 2:
                return new x0(this, n5Var, (byte) 2);
            case 3:
                return new f1(this, n5Var, (byte) 1);
            case 4:
                return n5Var;
            default:
                return new f1(this, n5Var, (byte) 4);
        }
    }
}
