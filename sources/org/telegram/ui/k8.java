package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                    org.telegram.ui.Components.voip.m1.l(L0, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    break;
                }
            default:
                j9 j9Var2 = this.b;
                j9Var2.getClass();
                j9.k0(j9Var2);
                break;
        }
    }
}
