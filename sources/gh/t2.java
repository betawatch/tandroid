package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;
    public final /* synthetic */ qn c;
    public final /* synthetic */ long d;

    public /* synthetic */ t2(k5 k5Var, qn qnVar, long j10, int i9) {
        this.a = i9;
        this.b = k5Var;
        this.c = qnVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        long j10 = this.d;
        qn qnVar = this.c;
        k5 k5Var = this.b;
        switch (i9) {
            case 0:
                gc M = oc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                gc M2 = oc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
