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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pp0 extends yk0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ sp0 h;

    public pp0(sp0 sp0Var, Context context) {
        this.h = sp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f != 1;
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

    @Override // f2.q0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // f2.q0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        if (o1Var.f == 0) {
            org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) o1Var.a;
            if (i10 == 1 && this.d) {
                c7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                sp0 sp0Var = this.h;
                TLRPC.Dialog dialog = sp0Var.y0;
                boolean z11 = E != null && sp0Var.Q.h((long) E.id) >= 0;
                org.telegram.ui.Cells.z6 z6Var = c7Var.b;
                int i11 = c7Var.f;
                n9 n9Var = c7Var.a;
                TextView textView = c7Var.c;
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
                    n9Var.setAnimatedEmojiDrawable(null);
                    n9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, c7Var.h));
                        z6Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        n9Var.e(user, z6Var);
                        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        z6Var.k(i11, chat2);
                        n9Var.e(chat, z6Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    n9Var.setImageDrawable(null);
                    n9Var.setAnimatedEmojiDrawable(new k5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    n9Var.setAnimatedEmojiDrawable(null);
                    wf.a aVar = new wf.a(E.icon_color);
                    y70 y70Var = new y70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    y70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    y70Var.i = 1.8f;
                    dq dqVar = new dq(aVar, y70Var, 0, 0);
                    dqVar.w = true;
                    n9Var.setImageDrawable(dqVar);
                }
                n9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                c7Var.d = dialog.id;
                c7Var.e = E.id;
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            c6Var = ((org.telegram.ui.ActionBar.e3) this.h).resourcesProvider;
            c7Var = new org.telegram.ui.Cells.c7(context, c6Var);
            c7Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            c7Var = new View(context);
            c7Var.setLayoutParams(new f2.y0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new lk0(c7Var);
    }
}
