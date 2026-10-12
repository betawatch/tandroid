package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ s7(i8 i8Var, int i10) {
        this.a = i10;
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                i8 i8Var = this.b;
                if (i8Var.F && (editTextBoldCursor = i8Var.E) != null && editTextBoldCursor.isAttachedToWindow() && i8Var.E.hasWindowFocus()) {
                    i8Var.E.requestFocus();
                    if (AndroidUtilities.showKeyboard(i8Var.E)) {
                        i8Var.F = false;
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
                i8 i8Var2 = this.b;
                float f7 = i8Var2.Y;
                if (f7 < 1.0f && i8Var2.X == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    i8Var2.X = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.u = lVar;
                    i8Var2.X.e(0.001f);
                    int i10 = 1;
                    i8Var2.X.b(new r2(i8Var2, i10));
                    i8Var2.X.a(new w5(i8Var2, i10));
                    i8Var2.X.h();
                    break;
                }
                break;
            case 5:
                i8 i8Var3 = this.b;
                i8Var3.presentFragment(fo.W9(i8Var3.e.id));
                break;
            default:
                org.telegram.messenger.q.r(R.string.WalletAddressCopiedBulletin, zc.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
