package dg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ s3(y3 y3Var, int i10) {
        this.a = i10;
        this.b = y3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s3(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                y3 y3Var = this.b;
                org.telegram.ui.web.a1 a1Var = y3Var.E;
                if (a1Var != null) {
                    a1Var.run(null);
                    y3Var.E = null;
                }
                y3Var.dismiss();
                break;
        }
    }
}
