package cg;

import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ v1(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f2 f2Var = this.b;
                ye.d.s(f2Var.getContext(), "https://" + MessagesController.getInstance(f2Var.U).linkPrefix + "/nft/" + f2Var.z0.slug);
                break;
            case 1:
                f2 f2Var2 = this.b;
                try {
                    f2Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f2Var2.k0.c(f2Var2.G0);
                break;
            default:
                this.b.K0[0].setVisibility(8);
                break;
        }
    }
}
