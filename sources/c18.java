// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c18 implements b7c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qcc c;
    public final /* synthetic */ nu0 d;
    public final /* synthetic */ h18 e;
    public final /* synthetic */ kcc f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ c34 r;

    public /* synthetic */ c18(int i, qcc qccVar, nu0 nu0Var, h18 h18Var, kcc kccVar, boolean z, boolean z2, c34 c34Var, byte b) {
        this.a = b;
        this.b = i;
        this.c = qccVar;
        this.d = nu0Var;
        this.e = h18Var;
        this.f = kccVar;
        this.h = z;
        this.n = z2;
        this.r = c34Var;
    }

    @Override // b7c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.a) {
            case 0:
                i18.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
            default:
                i18.a(this.b, this.c, this.d, tL_inputCheckPasswordSRP, this.e, this.f, this.h, this.n, this.r);
                break;
        }
    }
}
