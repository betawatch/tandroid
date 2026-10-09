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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jr0 extends pm0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ mr0 h;

    public jr0(mr0 mr0Var, Context context) {
        this.h = mr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f != 1;
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

    @Override // s4.i0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        long j3;
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) d1Var.a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                mr0 mr0Var = this.h;
                TLRPC.Dialog dialog = mr0Var.C0;
                boolean z10 = E != null && mr0Var.U.h((long) E.id) >= 0;
                org.telegram.ui.Cells.e7 e7Var = h7Var.b;
                int i11 = h7Var.f;
                y9 y9Var = h7Var.a;
                TextView textView = h7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    j3 = 0;
                } else if (chat == null) {
                    j3 = 0;
                    textView.setText("");
                } else if (chat.monoforum) {
                    j3 = 0;
                    textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                } else {
                    j3 = 0;
                    textView.setText(E.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    y9Var.setAnimatedEmojiDrawable(null);
                    y9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, h7Var.h));
                        e7Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        y9Var.e(user, e7Var);
                        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        e7Var.k(i11, chat2);
                        y9Var.e(chat, e7Var);
                    }
                } else if (E.icon_emoji_id != j3) {
                    y9Var.setImageDrawable(null);
                    y9Var.setAnimatedEmojiDrawable(new s5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    y9Var.setAnimatedEmojiDrawable(null);
                    ng.a aVar = new ng.a(E.icon_color);
                    n90 n90Var = new n90(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    n90Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    n90Var.i = 1.8f;
                    fr frVar = new fr(aVar, n90Var, 0, 0);
                    frVar.w = true;
                    y9Var.setImageDrawable(frVar);
                }
                y9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                h7Var.d = dialog.id;
                h7Var.e = E.id;
            }
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            e6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, e6Var);
            h7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new am0(h7Var);
    }
}
