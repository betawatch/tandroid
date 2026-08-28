package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ m8(i9 i9Var, int i9) {
        this.a = i9;
        this.b = i9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Long l10 = (Long) view.getTag();
                i9 i9Var = this.b;
                ChatObject.Call groupCall = i9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = i9Var.getMessagesController().getChat(l10);
                i9Var.M = chat;
                if (groupCall == null) {
                    i9Var.N = l10;
                    i9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.e2.m(chat, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
                    break;
                }
            case 1:
                this.b.j0(true);
                break;
            case 2:
                i9 i9Var2 = this.b;
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(i9Var2, i9Var2.B);
                H.s = 8;
                if (i9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new i8(i9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new i8(i9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                i9 i9Var3 = this.b;
                i9Var3.getClass();
                i9.l0(i9Var3);
                break;
        }
    }
}
