package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ n8(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                k9 k9Var = this.b;
                ChatObject.Call groupCall = k9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = k9Var.getMessagesController().getChat(l4);
                k9Var.Q = chat;
                if (groupCall == null) {
                    k9Var.R = l4;
                    k9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d2.l(chat, null, false, null, k9Var.getParentActivity(), k9Var, k9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                k9 k9Var2 = this.b;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(k9Var2, k9Var2.F);
                H.s = 8;
                if (k9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new j8(k9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new j8(k9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                k9 k9Var3 = this.b;
                k9Var3.getClass();
                k9.m0(k9Var3);
                break;
        }
    }
}
