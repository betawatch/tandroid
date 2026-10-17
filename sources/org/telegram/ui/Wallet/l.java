package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.n80;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((ai.x8) obj2).run(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                j0 j0Var = (j0) obj;
                ((Utilities.Callback2) obj2).run(j0Var, j0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                f2.k("approve session", str);
                ((n80) obj2).run(str);
                break;
            case 3:
                String str2 = (String) obj;
                f2.k("disconnect session", str2);
                ((Utilities.Callback) obj2).run(str2);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new t3(11, (w7) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                z7 z7Var = (z7) obj2;
                z7Var.getClass();
                int i11 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (z7Var.a != i11) {
                    z7Var.a = i11;
                    z7Var.W(z7Var.getParentActivity());
                    z7Var.Y();
                    z7Var.h.setText(z7Var.s != null ? LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i11)) : LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i11)));
                    break;
                }
                break;
        }
    }
}
