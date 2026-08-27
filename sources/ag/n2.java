package ag;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;

    public /* synthetic */ n2(y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                we.e.s(y2Var.getContext(), "https://" + MessagesController.getInstance(y2Var.U).linkPrefix + "/nft/" + y2Var.z0.slug);
                break;
            case 1:
                y2 y2Var2 = this.b;
                try {
                    y2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                y2Var2.k0.c(y2Var2.G0);
                break;
            default:
                this.b.K0[0].setVisibility(8);
                break;
        }
    }
}
