package eg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ u1(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e2 e2Var = this.b;
                ze.d.s(e2Var.getContext(), "https://" + MessagesController.getInstance(e2Var.V).linkPrefix + "/nft/" + e2Var.A0.slug);
                break;
            case 1:
                e2 e2Var2 = this.b;
                try {
                    e2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                e2Var2.l0.c(e2Var2.H0);
                break;
            default:
                this.b.L0[0].setVisibility(8);
                break;
        }
    }
}
