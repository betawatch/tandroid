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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fr0 extends lm0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ ir0 h;

    public fr0(ir0 ir0Var, Context context) {
        this.h = ir0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f != 1;
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

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        long j10;
        if (b1Var.f == 0) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) b1Var.a;
            if (i10 == 1 && this.d) {
                h7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                ir0 ir0Var = this.h;
                TLRPC.Dialog dialog = ir0Var.D0;
                boolean z10 = E != null && ir0Var.V.h((long) E.id) >= 0;
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
                    j10 = 0;
                } else if (chat == null) {
                    j10 = 0;
                    textView.setText("");
                } else if (chat.monoforum) {
                    j10 = 0;
                    textView.setText(MessagesController.getInstance(i11).getPeerName(DialogObject.getPeerDialogId(E.from_id)));
                } else {
                    j10 = 0;
                    textView.setText(E.title);
                }
                if (ChatObject.isMonoForum(chat)) {
                    w9Var.setAnimatedEmojiDrawable(null);
                    w9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, h7Var.h);
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
                } else if (E.icon_emoji_id != j10) {
                    w9Var.setImageDrawable(null);
                    w9Var.setAnimatedEmojiDrawable(new r5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    w9Var.setAnimatedEmojiDrawable(null);
                    og.a aVar = new og.a(E.icon_color);
                    g90 g90Var = new g90(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    g90Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    g90Var.i = 1.8f;
                    yq yqVar = new yq(aVar, g90Var, 0, 0);
                    yqVar.w = true;
                    w9Var.setImageDrawable(yqVar);
                }
                w9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                h7Var.d = dialog.id;
                h7Var.e = E.id;
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h7Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            g6Var = ((org.telegram.ui.ActionBar.h3) this.h).resourcesProvider;
            h7Var = new org.telegram.ui.Cells.h7(context, g6Var);
            h7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            h7Var = new View(context);
            h7Var.setLayoutParams(new s4.o0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new wl0(h7Var);
    }
}
