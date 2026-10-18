package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;
    public final /* synthetic */ sn c;
    public final /* synthetic */ long d;

    public /* synthetic */ x3(k7 k7Var, sn snVar, long j10, int i10) {
        this.a = i10;
        this.b = k7Var;
        this.c = snVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        sn snVar = this.c;
        k7 k7Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.Q1(), DialogObject.getShortName(j10))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.Q1(), DialogObject.getShortName(j10))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
