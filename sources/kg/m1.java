package kg;

import org.telegram.messenger.vp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ m1(v1 v1Var, int i10) {
        this.a = i10;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v1 v1Var = this.b;
                gf.f.r(v1Var.getContext(), "https://" + vp.r1(v1Var.Q1).U2 + "/nft/" + v1Var.v2.slug);
                break;
            case 1:
                v1 v1Var2 = this.b;
                try {
                    v1Var2.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                v1Var2.g2.c(v1Var2.C2);
                break;
            default:
                this.b.G2[0].setVisibility(8);
                break;
        }
    }
}
