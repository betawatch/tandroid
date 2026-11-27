// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ci6 extends xo4 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci6(asb asbVar, byte b) {
        super(asbVar);
        this.f = b;
    }

    @Override // xo4, asb
    public final int e(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                asb asbVar = this.e;
                int e = asbVar.e(i, i2, z);
                return e == -1 ? asbVar.a(z) : e;
            default:
                return super.e(i, i2, z);
        }
    }

    @Override // xo4, asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        switch (this.f) {
            case 1:
                super.f(i, xrbVar, z);
                xrbVar.f = true;
                return xrbVar;
            default:
                return super.f(i, xrbVar, z);
        }
    }

    @Override // xo4, asb
    public final int k(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                asb asbVar = this.e;
                int k = asbVar.k(i, i2, z);
                return k == -1 ? asbVar.c(z) : k;
            default:
                return super.k(i, i2, z);
        }
    }

    @Override // xo4, asb
    public final zrb m(int i, zrb zrbVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, zrbVar, j);
                zrbVar.j = true;
                return zrbVar;
            default:
                return super.m(i, zrbVar, j);
        }
    }
}
