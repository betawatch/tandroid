package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j9 b;

    public /* synthetic */ n8(j9 j9Var, int i10) {
        this.a = i10;
        this.b = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                j9 j9Var = this.b;
                ChatObject.Call groupCall = j9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = j9Var.getMessagesController().getChat(l10);
                j9Var.M = chat;
                if (groupCall == null) {
                    j9Var.N = l10;
                    j9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.e2.m(chat, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                j9 j9Var2 = this.b;
                org.telegram.ui.Components.b70 H = org.telegram.ui.Components.b70.H(j9Var2, j9Var2.B);
                H.s = 8;
                if (j9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new j8(j9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new j8(j9Var2, 2), true);
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
