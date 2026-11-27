package j$.util.stream;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class u extends b0 {
    public final /* synthetic */ byte l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a aVar, int i, byte b) {
        super(aVar, i);
        this.l = b;
    }

    @Override // j$.util.stream.a
    public final n5 M(int i, n5 n5Var) {
        switch (this.l) {
            case 0:
                return new t(this, n5Var, (byte) 0);
            case 1:
                return n5Var;
            case 2:
                return new t(this, n5Var, (byte) 3);
            case 3:
                return new x0(n5Var, (byte) 1);
            case 4:
                return new x0(this, n5Var, (byte) 3);
            case 5:
                return new f1(n5Var);
            default:
                return new f1(this, n5Var, (byte) 3);
        }
    }
}
