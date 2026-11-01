package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ k8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                j9 j9Var = this.b;
                org.telegram.messenger.u3 f12 = j9Var.getMessagesController().f1(l4.longValue(), false, null);
                TLRPC.Chat L0 = j9Var.getMessagesController().L0(l4);
                j9Var.M = L0;
                if (f12 == null) {
                    j9Var.N = l4;
                    j9Var.getMessagesController().T2(0, l4.longValue(), true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.n1.l(L0, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    break;
                }
            default:
                j9 j9Var2 = this.b;
                j9Var2.getClass();
                j9.l0(j9Var2);
                break;
        }
    }
}
