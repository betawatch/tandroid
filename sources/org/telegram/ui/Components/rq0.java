package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class rq0 extends vl0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ uq0 h;

    public rq0(uq0 uq0Var, Context context) {
        this.h = uq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f.get(i11);
    }

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) c1Var.a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                uq0 uq0Var = this.h;
                TLRPC.Dialog dialog = uq0Var.C0;
                boolean z11 = E != null && uq0Var.U.h((long) E.id) >= 0;
                org.telegram.ui.Cells.e7 e7Var = h7Var.b;
                int i11 = h7Var.f;
                w9 w9Var = h7Var.a;
                TextView textView = h7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    z10 = z11;
                } else if (chat == null) {
                    z10 = z11;
                    textView.setText("");
                } else if (chat.monoforum) {
                    z10 = z11;
                    textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                } else {
                    z10 = z11;
                    textView.setText(E.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    w9Var.setAnimatedEmojiDrawable(null);
                    w9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, h7Var.h));
                        e7Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        w9Var.e(user, e7Var);
                        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        e7Var.k(i11, chat2);
                        w9Var.e(chat, e7Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    w9Var.setImageDrawable(null);
                    w9Var.setAnimatedEmojiDrawable(new q5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    w9Var.setAnimatedEmojiDrawable(null);
                    ng.a aVar = new ng.a(E.icon_color);
                    w80 w80Var = new w80(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    w80Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    w80Var.i = 1.8f;
                    qq qqVar = new qq(aVar, w80Var, 0, 0);
                    qqVar.w = true;
                    w9Var.setImageDrawable(qqVar);
                }
                w9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                h7Var.d = dialog.id;
                h7Var.e = E.id;
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            d6Var = ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, d6Var);
            h7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new gl0(h7Var);
    }
}
