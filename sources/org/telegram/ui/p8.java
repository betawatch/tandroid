package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ p8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                l9 l9Var = this.b;
                ChatObject.Call groupCall = l9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = l9Var.getMessagesController().getChat(l10);
                l9Var.N = chat;
                if (groupCall == null) {
                    l9Var.O = l10;
                    l9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, l9Var.getParentActivity(), l9Var, l9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                l9 l9Var2 = this.b;
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(l9Var2, l9Var2.C);
                H.s = 8;
                if (l9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new l8(l9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new l8(l9Var2, 2), true);
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
