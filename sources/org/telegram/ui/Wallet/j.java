package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.j90;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((bi.y2) obj2).run(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                g0 g0Var = (g0) obj;
                ((Utilities.Callback2) obj2).run(g0Var, g0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                d2.k("approve session", str);
                ((j90) obj2).run(str);
                break;
            case 3:
                String str2 = (String) obj;
                d2.k("disconnect session", str2);
                ((Utilities.Callback) obj2).run(str2);
                break;
            default:
                z6 z6Var = (z6) obj2;
                z6Var.getClass();
                int i11 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (z6Var.a != i11) {
                    z6Var.a = i11;
                    z6Var.W(z6Var.getParentActivity());
                    z6Var.Y();
                    z6Var.h.setText(z6Var.s != null ? LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i11)) : LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i11)));
                    break;
                }
                break;
        }
    }
}
