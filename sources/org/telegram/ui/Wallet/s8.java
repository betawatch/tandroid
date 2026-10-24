package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ s8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                j9 j9Var = this.b;
                if (j9Var.H && (editTextBoldCursor = j9Var.G) != null && editTextBoldCursor.isAttachedToWindow() && j9Var.G.hasWindowFocus()) {
                    j9Var.G.requestFocus();
                    if (AndroidUtilities.showKeyboard(j9Var.G)) {
                        j9Var.H = false;
                        break;
                    }
                }
                break;
            case 1:
                j9 j9Var2 = this.b;
                float f7 = j9Var2.a0;
                if (f7 < 1.0f && j9Var2.Z == null) {
                    o1.k kVar = new o1.k(new o1.j(f7));
                    j9Var2.Z = kVar;
                    o1.l lVar = new o1.l(1.0f);
                    lVar.a(0.55f);
                    lVar.b(65.0f);
                    kVar.u = lVar;
                    j9Var2.Z.e(0.001f);
                    j9Var2.Z.b(new z2(j9Var2, 2));
                    j9Var2.Z.a(new h6(j9Var2, 1));
                    j9Var2.Z.h();
                    break;
                }
                break;
            case 2:
                this.b.c0.setLoading(false);
                break;
            case 3:
                this.b.c0.setLoading(false);
                break;
            case 4:
                this.b.r0();
                break;
            case 5:
                j9 j9Var3 = this.b;
                j9Var3.presentFragment(sn.W9(j9Var3.e.id));
                break;
            default:
                org.telegram.messenger.v0.p(R.string.WalletAddressCopiedBulletin, xc.a0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
