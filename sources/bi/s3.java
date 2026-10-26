package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ un c;
    public final /* synthetic */ long d;

    public /* synthetic */ s3(h7 h7Var, un unVar, long j10, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = unVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        un unVar = this.c;
        h7 h7Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.u = true;
                M.j();
                break;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.wc.b0(unVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.u = true;
                M2.j();
                break;
        }
    }
}
