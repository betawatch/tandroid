package eg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ q3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new q3(this.b, 0));
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                w3 w3Var = this.b;
                org.telegram.ui.web.d1 d1Var = w3Var.E;
                if (d1Var != null) {
                    d1Var.run(null);
                    w3Var.E = null;
                }
                w3Var.dismiss();
                break;
        }
    }
}
