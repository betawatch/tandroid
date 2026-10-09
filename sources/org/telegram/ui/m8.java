package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ m8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l4 = (Long) view.getTag();
                j9 j9Var = this.b;
                ChatObject.Call groupCall = j9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = j9Var.getMessagesController().getChat(l4);
                j9Var.Q = chat;
                if (groupCall == null) {
                    j9Var.R = l4;
                    j9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.f2.l(chat, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                j9 j9Var2 = this.b;
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(j9Var2, j9Var2.F);
                H.s = 8;
                if (j9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new i8(j9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new i8(j9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                j9 j9Var3 = this.b;
                j9Var3.getClass();
                j9.m0(j9Var3);
                break;
        }
    }
}
