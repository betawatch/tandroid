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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class op0 extends vk0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ rp0 h;

    public op0(rp0 rp0Var, Context context) {
        this.h = rp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i9) {
        int i10 = i9 - 1;
        if (this.d) {
            i10 = i9 - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f.get(i10);
    }

    @Override // f2.r0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == 0 ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        if (q1Var.f == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) q1Var.a;
            if (i9 == 1 && this.d) {
                f7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i9);
                rp0 rp0Var = this.h;
                TLRPC.Dialog dialog = rp0Var.y0;
                boolean z11 = E != null && rp0Var.Q.h((long) E.id) >= 0;
                org.telegram.ui.Cells.c7 c7Var = f7Var.b;
                int i10 = f7Var.f;
                o9 o9Var = f7Var.a;
                TextView textView = f7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    z10 = z11;
                } else if (chat == null) {
                    z10 = z11;
                    textView.setText("");
                } else if (chat.monoforum) {
                    z10 = z11;
                    textView.setText(MessagesController.getInstance(i10).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                } else {
                    z10 = z11;
                    textView.setText(E.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    o9Var.setAnimatedEmojiDrawable(null);
                    o9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, f7Var.h));
                        c7Var.m(i10, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        o9Var.e(user, c7Var);
                        o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        c7Var.k(i10, chat2);
                        o9Var.e(chat, c7Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    o9Var.setImageDrawable(null);
                    o9Var.setAnimatedEmojiDrawable(new k5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    o9Var.setAnimatedEmojiDrawable(null);
                    vf.a aVar = new vf.a(E.icon_color);
                    u70 u70Var = new u70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    u70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    u70Var.i = 1.8f;
                    fq fqVar = new fq(aVar, u70Var, 0, 0);
                    fqVar.w = true;
                    o9Var.setImageDrawable(fqVar);
                }
                o9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                f7Var.d = dialog.id;
                f7Var.e = E.id;
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View f7Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = this.c;
        if (i9 == 0 || i9 == 2) {
            b6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            f7Var = new org.telegram.ui.Cells.f7(context, b6Var);
            f7Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(100.0f)));
        } else {
            f7Var = new View(context);
            f7Var.setLayoutParams(new f2.a1(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new ik0(f7Var);
    }
}
