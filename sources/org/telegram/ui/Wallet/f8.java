package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ f8(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        g8 g8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g8Var.getParentActivity(), g8Var.getResourceProvider());
                alertDialog$Builder.a.T = id.M0(2131743124, null);
                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                break;
            default:
                g8Var.d0();
                break;
        }
    }
}
