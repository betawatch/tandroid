package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ o8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                l9 l9Var = this.b;
                ChatObject.Call groupCall = l9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = l9Var.getMessagesController().getChat(l4);
                l9Var.Q = chat;
                if (groupCall == null) {
                    l9Var.R = l4;
                    l9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.f2.l(chat, null, false, null, l9Var.getParentActivity(), l9Var, l9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                l9 l9Var2 = this.b;
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(l9Var2, l9Var2.F);
                H.s = 8;
                if (l9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new k8(l9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new k8(l9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                l9 l9Var3 = this.b;
                l9Var3.getClass();
                l9.m0(l9Var3);
                break;
        }
    }
}
