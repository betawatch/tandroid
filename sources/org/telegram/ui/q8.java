package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ q8(n9 n9Var, int i10) {
        this.a = i10;
        this.b = n9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                n9 n9Var = this.b;
                ChatObject.Call groupCall = n9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = n9Var.getMessagesController().getChat(l4);
                n9Var.Q = chat;
                if (groupCall == null) {
                    n9Var.R = l4;
                    n9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d2.l(chat, null, false, null, n9Var.getParentActivity(), n9Var, n9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                n9 n9Var2 = this.b;
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(n9Var2, n9Var2.F);
                H.s = 8;
                if (n9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new n8(n9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new n8(n9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                n9 n9Var3 = this.b;
                n9Var3.getClass();
                n9.m0(n9Var3);
                break;
        }
    }
}
