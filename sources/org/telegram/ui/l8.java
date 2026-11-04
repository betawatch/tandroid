package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ l8(h9 h9Var, int i3) {
        this.a = i3;
        this.b = h9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                h9 h9Var = this.b;
                org.telegram.messenger.r3 g12 = h9Var.getMessagesController().g1(l10.longValue(), false, null);
                TLRPC.Chat M0 = h9Var.getMessagesController().M0(l10);
                h9Var.N = M0;
                if (g12 == null) {
                    h9Var.O = l10;
                    h9Var.getMessagesController().V2(0, l10.longValue(), true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.n1.l(M0, null, false, null, h9Var.getParentActivity(), h9Var, h9Var.getAccountInstance());
                    break;
                }
            default:
                h9 h9Var2 = this.b;
                h9Var2.getClass();
                h9.l0(h9Var2);
                break;
        }
    }
}
