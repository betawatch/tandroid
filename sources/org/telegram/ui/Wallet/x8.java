package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o9 b;

    public /* synthetic */ x8(o9 o9Var, int i10) {
        this.a = i10;
        this.b = o9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                o9 o9Var = this.b;
                if (o9Var.F && (editTextBoldCursor = o9Var.E) != null && editTextBoldCursor.isAttachedToWindow() && o9Var.E.hasWindowFocus()) {
                    o9Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(o9Var.E)) {
                        o9Var.F = false;
                        break;
                    }
                }
                break;
            case 1:
                o9 o9Var2 = this.b;
                float f7 = o9Var2.Y;
                if (f7 < 1.0f && o9Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    o9Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.u = lVar;
                    o9Var2.X.e(0.001f);
                    o9Var2.X.b(new z2(o9Var2, 2));
                    o9Var2.X.a(new n6(o9Var2, 1));
                    o9Var2.X.h();
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
                o9 o9Var3 = this.b;
                o9Var3.presentFragment(sn.W9(o9Var3.e.id));
                break;
            default:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, xc.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
