package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                m9Var.Q = chat;
                if (groupCall == null) {
                    m9Var.R = l4;
                    m9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d2.l(chat, null, false, null, m9Var.getParentActivity(), m9Var, m9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.j0(true);
                break;
            case 2:
                m9 m9Var2 = this.b;
                org.telegram.ui.Components.j80 H = org.telegram.ui.Components.j80.H(m9Var2, m9Var2.F);
                H.s = 8;
                if (m9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new m8(m9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new m8(m9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                m9 m9Var3 = this.b;
                m9Var3.getClass();
                m9.l0(m9Var3);
                break;
        }
    }
}
