package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ r8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                i9 i9Var = this.b;
                if (i9Var.F && (editTextBoldCursor = i9Var.E) != null && editTextBoldCursor.isAttachedToWindow() && i9Var.E.hasWindowFocus()) {
                    i9Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(i9Var.E)) {
                        i9Var.F = false;
                        break;
                    }
                }
                break;
            case 1:
                i9 i9Var2 = this.b;
                float f7 = i9Var2.Y;
                if (f7 < 1.0f && i9Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    i9Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.u = lVar;
                    i9Var2.X.e(0.001f);
                    i9Var2.X.b(new a3(i9Var2, 2));
                    i9Var2.X.a(new h6(i9Var2, 1));
                    i9Var2.X.h();
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
                i9 i9Var3 = this.b;
                i9Var3.presentFragment(qn.W9(i9Var3.e.id));
                break;
            default:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, xc.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
