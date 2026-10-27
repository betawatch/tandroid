package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;
    public final /* synthetic */ wn c;
    public final /* synthetic */ long d;

    public /* synthetic */ s3(h7 h7Var, wn wnVar, long j10, int i10) {
        this.a = i10;
        this.b = h7Var;
        this.c = wnVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        wn wnVar = this.c;
        h7 h7Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.u = true;
                M.j();
                break;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.u = true;
                M2.j();
                break;
        }
    }
}
