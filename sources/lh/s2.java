package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ zn c;
    public final /* synthetic */ long d;

    public /* synthetic */ s2(g5 g5Var, zn znVar, long j10, int i10) {
        this.a = i10;
        this.b = g5Var;
        this.c = znVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        zn znVar = this.c;
        g5 g5Var = this.b;
        switch (i10) {
            case 0:
                ic M = qc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                ic M2 = qc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
