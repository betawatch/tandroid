package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ u8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                l9 l9Var = this.b;
                if (l9Var.F && (editTextBoldCursor = l9Var.E) != null && editTextBoldCursor.isAttachedToWindow() && l9Var.E.hasWindowFocus()) {
                    l9Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(l9Var.E)) {
                        l9Var.F = false;
                        break;
                    }
                }
                break;
            case 1:
                l9 l9Var2 = this.b;
                float f7 = l9Var2.Y;
                if (f7 < 1.0f && l9Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    l9Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.u = lVar;
                    l9Var2.X.e(0.001f);
                    l9Var2.X.b(new y2(l9Var2, 2));
                    l9Var2.X.a(new k6(l9Var2, 1));
                    l9Var2.X.h();
                    break;
                }
                break;
            case 2:
                this.b.a0.setLoading(false);
                break;
            case 3:
                this.b.a0.setLoading(false);
                break;
            case 4:
                this.b.q0();
                break;
            case 5:
                l9 l9Var3 = this.b;
                l9Var3.presentFragment(sn.W9(l9Var3.e.id));
                break;
            default:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, xc.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
