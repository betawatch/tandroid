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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class tq0 extends xl0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ wq0 h;

    public tq0(wq0 wq0Var, Context context) {
        this.h = wq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
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
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) c1Var.a;
            if (i10 == 1 && this.d) {
                i7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                wq0 wq0Var = this.h;
                TLRPC.Dialog dialog = wq0Var.C0;
                boolean z11 = E != null && wq0Var.U.h((long) E.id) >= 0;
                org.telegram.ui.Cells.f7 f7Var = i7Var.b;
                int i11 = i7Var.f;
                v9 v9Var = i7Var.a;
                TextView textView = i7Var.c;
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
                    v9Var.setAnimatedEmojiDrawable(null);
                    v9Var.setImageDrawable(null);
                    long peerDialogId = DialogObject.getPeerDialogId(E.from_id);
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, i7Var.h));
                        f7Var.m(i11, user);
                        if (user != null) {
                            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                        } else {
                            textView.setText("");
                        }
                        v9Var.e(user, f7Var);
                        v9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(peerDialogId));
                        if (chat2 != null) {
                            textView.setText(chat2.title);
                        } else {
                            textView.setText("");
                        }
                        f7Var.k(i11, chat2);
                        v9Var.e(chat, f7Var);
                    }
                } else if (E.icon_emoji_id != 0) {
                    v9Var.setImageDrawable(null);
                    v9Var.setAnimatedEmojiDrawable(new p5(13, UserConfig.selectedAccount, E.icon_emoji_id));
                } else {
                    v9Var.setAnimatedEmojiDrawable(null);
                    ng.a aVar = new ng.a(E.icon_color);
                    w80 w80Var = new w80(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    w80Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    w80Var.i = 1.8f;
                    pq pqVar = new pq(aVar, w80Var, 0, 0);
                    pqVar.w = true;
                    v9Var.setImageDrawable(pqVar);
                }
                v9Var.setRoundRadius((chat == null || !chat.forum || z10) ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(16.0f));
                i7Var.d = dialog.id;
                i7Var.e = E.id;
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View i7Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            f6Var = ((org.telegram.ui.ActionBar.f3) this.h).resourcesProvider;
            i7Var = new org.telegram.ui.Cells.i7(context, f6Var);
            i7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
        } else {
            i7Var = new View(context);
            i7Var.setLayoutParams(new s4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new il0(i7Var);
    }
}
