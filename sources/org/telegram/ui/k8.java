package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ k8(i9 i9Var, int i7) {
        this.a = i7;
        this.b = i9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                i9 i9Var = this.b;
                org.telegram.messenger.r3 g12 = i9Var.getMessagesController().g1(l10.longValue(), false, null);
                TLRPC.Chat M0 = i9Var.getMessagesController().M0(l10);
                i9Var.M = M0;
                if (g12 == null) {
                    i9Var.N = l10;
                    i9Var.getMessagesController().V2(0, l10.longValue(), true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.y1.l(M0, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
                    break;
                }
            default:
                i9 i9Var2 = this.b;
                i9Var2.getClass();
                i9.l0(i9Var2);
                break;
        }
    }
}
