package dg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                org.telegram.ui.web.y0 y0Var = y3Var.E;
                if (y0Var != null) {
                    y0Var.run(null);
                    y3Var.E = null;
                }
                y3Var.dismiss();
                break;
        }
    }
}
