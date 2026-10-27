package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                if (i9Var.I && (editTextBoldCursor = i9Var.H) != null && editTextBoldCursor.isAttachedToWindow() && i9Var.H.hasWindowFocus()) {
                    i9Var.H.requestFocus();
                    if (AndroidUtilities.showKeyboard(i9Var.H)) {
                        i9Var.I = false;
                        break;
                    }
                }
                break;
            case 1:
                i9 i9Var2 = this.b;
                float f7 = i9Var2.b0;
                if (f7 < 1.0f && i9Var2.a0 == null) {
                    o1.j jVar = new o1.j(new ac.a(f7));
                    i9Var2.a0 = jVar;
                    o1.k kVar = new o1.k(1.0f);
                    kVar.a(0.55f);
                    kVar.b(65.0f);
                    jVar.u = kVar;
                    i9Var2.a0.e(0.001f);
                    i9Var2.a0.b(new z2(i9Var2, 2));
                    i9Var2.a0.a(new h6(i9Var2, 1));
                    i9Var2.a0.h();
                    break;
                }
                break;
            case 2:
                this.b.d0.setLoading(false);
                break;
            case 3:
                this.b.d0.setLoading(false);
                break;
            case 4:
                this.b.s0();
                break;
            case 5:
                i9 i9Var3 = this.b;
                i9Var3.presentFragment(wn.ea(i9Var3.f.id));
                break;
            default:
                org.telegram.messenger.t.q(R.string.WalletAddressCopiedBulletin, wc.b0(this.b), R.raw.copy, 36);
                break;
        }
    }
}
