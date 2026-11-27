// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
