package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ l8(i9 i9Var, int i7) {
        this.a = i7;
        this.b = i9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                i9 i9Var = this.b;
                org.telegram.messenger.t3 i12 = i9Var.getMessagesController().i1(l10.longValue(), false, null);
                TLRPC.Chat O0 = i9Var.getMessagesController().O0(l10);
                i9Var.M = O0;
                if (i12 == null) {
                    i9Var.N = l10;
                    i9Var.getMessagesController().b3(0, l10.longValue(), true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.b2.l(O0, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
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
