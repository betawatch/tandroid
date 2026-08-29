package bg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ w3(c4 c4Var, int i10) {
        this.a = i10;
        this.b = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new w3(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                c4 c4Var = this.b;
                nh.b0 b0Var = c4Var.D;
                if (b0Var != null) {
                    b0Var.run(null);
                    c4Var.D = null;
                }
                c4Var.dismiss();
                break;
        }
    }
}
