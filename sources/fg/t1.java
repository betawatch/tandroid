package fg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ t1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d2 d2Var = this.b;
                af.g.s(d2Var.getContext(), "https://" + MessagesController.getInstance(d2Var.V).linkPrefix + "/nft/" + d2Var.A0.slug);
                break;
            case 1:
                d2 d2Var2 = this.b;
                try {
                    d2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                d2Var2.l0.c(d2Var2.H0);
                break;
            default:
                this.b.L0[0].setVisibility(8);
                break;
        }
    }
}
