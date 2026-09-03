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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class iq0 extends ql0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ lq0 h;

    public iq0(lq0 lq0Var, Context context) {
        this.h = lq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f != 1;
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

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // f2.o0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        if (l1Var.f == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) l1Var.a;
            if (i10 == 1 && this.d) {
                e7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                lq0 lq0Var = this.h;
                TLRPC.Dialog dialog = lq0Var.z0;
                boolean z10 = E != null && lq0Var.R.h((long) E.id) >= 0;
                org.telegram.ui.Cells.b7 b7Var = e7Var.b;
                int i11 = e7Var.f;
                p9 p9Var = e7Var.a;
                TextView textView = e7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    z4 = z10;
                } else if (chat == null) {
                    z4 = z10;
                    textView.setText("");
                } else if (chat.monoforum) {
                    z4 = z10;
                    textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                } else {
                    z4 = z10;
                    textView.setText(E.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    p9Var.setAnimatedEmojiDrawable(null);
                    p9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, e7Var.h));
                        b7Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        p9Var.e(user, b7Var);
                        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        b7Var.k(i11, chat2);
                        p9Var.e(chat, b7Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    p9Var.setImageDrawable(null);
                    p9Var.setAnimatedEmojiDrawable(new l5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    p9Var.setAnimatedEmojiDrawable(null);
                    ag.b bVar = new ag.b(E.icon_color);
                    n80 n80Var = new n80(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    n80Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    n80Var.i = 1.8f;
                    mq mqVar = new mq(bVar, n80Var, 0, 0);
                    mqVar.w = true;
                    p9Var.setImageDrawable(mqVar);
                }
                p9Var.setRoundRadius((chat == null || !chat.forum || z4) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                e7Var.d = dialog.id;
                e7Var.e = E.id;
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View e7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.g3) this.h).resourcesProvider;
            e7Var = new org.telegram.ui.Cells.e7(context, f6Var);
            e7Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            e7Var = new View(context);
            e7Var.setLayoutParams(new f2.w0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new dl0(e7Var);
    }
}
