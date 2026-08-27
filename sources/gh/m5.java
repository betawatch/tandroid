package gh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x5 b;

    public /* synthetic */ m5(x5 x5Var, int i10) {
        this.a = i10;
        this.b = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            default:
                x5 x5Var = this.b;
                x5Var.e0.N(true);
                AndroidUtilities.runOnUIThread(new m5(x5Var, 0), 150L);
                break;
        }
    }
}
