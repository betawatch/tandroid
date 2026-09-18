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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fq0 extends ll0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ iq0 h;

    public fq0(iq0 iq0Var, Context context) {
        this.h = iq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
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
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) c1Var.a;
            if (i10 == 1 && this.d) {
                g7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                iq0 iq0Var = this.h;
                TLRPC.Dialog dialog = iq0Var.C0;
                boolean z11 = E != null && iq0Var.U.h((long) E.id) >= 0;
                org.telegram.ui.Cells.d7 d7Var = g7Var.b;
                int i11 = g7Var.f;
                u9 u9Var = g7Var.a;
                TextView textView = g7Var.c;
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
                    u9Var.setAnimatedEmojiDrawable(null);
                    u9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, g7Var.h));
                        d7Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        u9Var.e(user, d7Var);
                        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        d7Var.k(i11, chat2);
                        u9Var.e(chat, d7Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    u9Var.setImageDrawable(null);
                    u9Var.setAnimatedEmojiDrawable(new o5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    u9Var.setAnimatedEmojiDrawable(null);
                    ng.a aVar = new ng.a(E.icon_color);
                    l80 l80Var = new l80(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    l80Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    l80Var.i = 1.8f;
                    pq pqVar = new pq(aVar, l80Var, 0, 0);
                    pqVar.w = true;
                    u9Var.setImageDrawable(pqVar);
                }
                u9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                g7Var.d = dialog.id;
                g7Var.e = E.id;
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.g3) this.h).resourcesProvider;
            g7Var = new org.telegram.ui.Cells.g7(context, f6Var);
            g7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            g7Var = new View(context);
            g7Var.setLayoutParams(new s4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new wk0(g7Var);
    }
}
