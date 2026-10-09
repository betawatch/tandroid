package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ t7(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                j8 j8Var = this.b;
                if (j8Var.F && (editTextBoldCursor = j8Var.E) != null && editTextBoldCursor.isAttachedToWindow() && j8Var.E.hasWindowFocus()) {
                    j8Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(j8Var.E)) {
                        j8Var.F = false;
                        break;
                    }
                }
                break;
            case 1:
                this.b.a0.setLoading(false);
                break;
            case 2:
                this.b.a0.setLoading(false);
                break;
            case 3:
                this.b.q0();
                break;
            case 4:
                j8 j8Var2 = this.b;
                float f7 = j8Var2.Y;
                if (f7 < 1.0f && j8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    j8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.u = lVar;
                    j8Var2.X.e(0.001f);
                    int i10 = 1;
                    j8Var2.X.b(new r2(j8Var2, i10));
                    j8Var2.X.a(new x5(j8Var2, i10));
                    j8Var2.X.h();
                    break;
                }
                break;
            case 5:
                j8 j8Var3 = this.b;
                j8Var3.presentFragment(zn.W9(j8Var3.e.id));
                break;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, ad.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
