package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m9 b;

    public /* synthetic */ p8(m9 m9Var, int i10) {
        this.a = i10;
        this.b = m9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                m9 m9Var = this.b;
                ChatObject.Call groupCall = m9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = m9Var.getMessagesController().getChat(l4);
                m9Var.P = chat;
                if (groupCall == null) {
                    m9Var.Q = l4;
                    m9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, m9Var.getParentActivity(), m9Var, m9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.e0(true);
                break;
            case 2:
                m9 m9Var2 = this.b;
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(m9Var2, m9Var2.E);
                H.s = 8;
                if (m9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new n8(m9Var2, 0), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new n8(m9Var2, 1), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                m9 m9Var3 = this.b;
                m9Var3.getClass();
                m9.g0(m9Var3);
                break;
        }
    }
}
