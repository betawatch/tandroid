package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                    j8Var2.X.b(new s2(j8Var2, i10));
                    j8Var2.X.a(new x5(j8Var2, i10));
                    j8Var2.X.h();
                    break;
                }
                break;
            case 5:
                j8 j8Var3 = this.b;
                j8Var3.presentFragment(fo.W9(j8Var3.e.id));
                break;
            default:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, zc.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
