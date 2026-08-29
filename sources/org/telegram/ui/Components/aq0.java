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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aq0 extends il0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ dq0 h;

    public aq0(dq0 dq0Var, Context context) {
        this.h = dq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f != 1;
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

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        if (n1Var.f == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) n1Var.a;
            if (i10 == 1 && this.d) {
                d7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                dq0 dq0Var = this.h;
                TLRPC.Dialog dialog = dq0Var.y0;
                boolean z11 = E != null && dq0Var.Q.h((long) E.id) >= 0;
                org.telegram.ui.Cells.a7 a7Var = d7Var.b;
                int i11 = d7Var.f;
                t9 t9Var = d7Var.a;
                TextView textView = d7Var.c;
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
                    t9Var.setAnimatedEmojiDrawable(null);
                    t9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, d7Var.h));
                        a7Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        t9Var.e(user, a7Var);
                        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        a7Var.k(i11, chat2);
                        t9Var.e(chat, a7Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    t9Var.setImageDrawable(null);
                    t9Var.setAnimatedEmojiDrawable(new p5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    t9Var.setAnimatedEmojiDrawable(null);
                    yf.b bVar = new yf.b(E.icon_color);
                    h80 h80Var = new h80(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    h80Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    h80Var.i = 1.8f;
                    jq jqVar = new jq(bVar, h80Var, 0, 0);
                    jqVar.w = true;
                    t9Var.setImageDrawable(jqVar);
                }
                t9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                d7Var.d = dialog.id;
                d7Var.e = E.id;
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View d7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            c6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            d7Var = new org.telegram.ui.Cells.d7(context, c6Var);
            d7Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            d7Var = new View(context);
            d7Var.setLayoutParams(new f2.x0(-1, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
        }
        return new vk0(d7Var);
    }
}
