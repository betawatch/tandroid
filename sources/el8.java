// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class el8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl8 b;

    public /* synthetic */ el8(kl8 kl8Var, byte b) {
        this.a = b;
        this.b = kl8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kl8 kl8Var = this.b;
        switch (b) {
            case 0:
                m01.u(kl8Var.getContext(), "https://" + uc7.s1(kl8Var.T1).N2 + "/nft/" + kl8Var.y2.slug);
                break;
            case 1:
                try {
                    kl8Var.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                kl8Var.j2.c(kl8Var.F2);
                break;
            default:
                kl8Var.J2[0].setVisibility(8);
                break;
        }
    }
}
