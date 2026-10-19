package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ qn c;
    public final /* synthetic */ long d;

    public /* synthetic */ w3(l7 l7Var, qn qnVar, long j10, int i10) {
        this.a = i10;
        this.b = l7Var;
        this.c = qnVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        qn qnVar = this.c;
        l7 l7Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.X1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(qnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.X1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
