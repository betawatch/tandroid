package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ l8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                h9 h9Var = this.b;
                ChatObject.Call groupCall = h9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = h9Var.getMessagesController().getChat(l10);
                h9Var.M = chat;
                if (groupCall == null) {
                    h9Var.N = l10;
                    h9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.h2.m(chat, null, false, null, h9Var.getParentActivity(), h9Var, h9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.k0(true);
                break;
            case 2:
                h9 h9Var2 = this.b;
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(h9Var2, h9Var2.B);
                H.s = 8;
                if (h9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new h8(h9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new h8(h9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                h9 h9Var3 = this.b;
                h9Var3.getClass();
                h9.m0(h9Var3);
                break;
        }
    }
}
