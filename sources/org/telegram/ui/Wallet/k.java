package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.q80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        int i11 = 1;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((bi.t8) obj2).run(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                i0 i0Var = (i0) obj;
                ((Utilities.Callback2) obj2).run(i0Var, i0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                e2.k("approve session", str);
                ((q80) obj2).run(str);
                break;
            case 3:
                String str2 = (String) obj;
                e2.k("disconnect session", str2);
                ((Utilities.Callback) obj2).run(str2);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new q6(i11, (t7) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                w7 w7Var = (w7) obj2;
                w7Var.getClass();
                int i12 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (w7Var.a != i12) {
                    w7Var.a = i12;
                    w7Var.X(w7Var.getParentActivity());
                    w7Var.Z();
                    w7Var.h.setText(w7Var.s != null ? LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i12)) : LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i12)));
                    break;
                }
                break;
        }
    }
}
