package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.r80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                ((r80) obj2).run(str);
                break;
            case 3:
                String str2 = (String) obj;
                e2.k("disconnect session", str2);
                ((Utilities.Callback) obj2).run(str2);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a6(2, (t7) obj2, (TLRPC.UserFull) obj));
                break;
            default:
                w7 w7Var = (w7) obj2;
                w7Var.getClass();
                int i11 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (w7Var.a != i11) {
                    w7Var.a = i11;
                    w7Var.X(w7Var.getParentActivity());
                    w7Var.Z();
                    w7Var.h.setText(w7Var.s != null ? LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i11)) : LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i11)));
                    break;
                }
                break;
        }
    }
}
