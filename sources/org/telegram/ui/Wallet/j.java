package org.telegram.ui.Wallet;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.e90;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((ai.j3) obj2).run(Boolean.valueOf(((String) obj) == null));
                break;
            case 1:
                h0 h0Var = (h0) obj;
                ((Utilities.Callback2) obj2).run(h0Var, h0Var == null ? "LOCAL_STORAGE_ERROR" : null);
                break;
            case 2:
                String str = (String) obj;
                d2.k("approve session", str);
                ((e90) obj2).run(str);
                break;
            case 3:
                String str2 = (String) obj;
                d2.k("disconnect session", str2);
                ((Utilities.Callback) obj2).run(str2);
                break;
            default:
                a7 a7Var = (a7) obj2;
                a7Var.getClass();
                int i11 = ((Integer) obj).intValue() == 0 ? 12 : 24;
                if (a7Var.a != i11) {
                    a7Var.a = i11;
                    a7Var.W(a7Var.getParentActivity());
                    a7Var.Y();
                    a7Var.h.setText(a7Var.s != null ? LocaleController.formatSpannable(R.string.WalletImportCurrentPhraseInfo, Integer.valueOf(i11)) : LocaleController.formatSpannable(R.string.WalletImportPhraseInfo, Integer.valueOf(i11)));
                    break;
                }
                break;
        }
    }
}
