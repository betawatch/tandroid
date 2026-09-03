package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uo0 extends rl0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MessagesController e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public uo0(org.telegram.ui.ActionBar.g6 g6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.c = g6Var;
        this.d = list;
        this.e = messagesController;
        this.f = i10;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        yo0 yo0Var = (yo0) m1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j10 = peer.channel_id;
        long j11 = j10 != 0 ? -j10 : 0L;
        if (j11 == 0) {
            long j12 = peer.user_id;
            if (j12 != 0) {
                j11 = j12;
            }
        }
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.e;
        boolean z4 = true;
        if (j11 >= 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j11));
            if (user != null) {
                yo0Var.b.setText(UserObject.getUserName(user));
                yo0Var.c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                yo0Var.a.setAvatar(user);
            }
            fv0 fv0Var = yo0Var.a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z4 = false;
            }
            fv0Var.a(z4, false);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j11));
        if (chat != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb = new StringBuilder();
                String str = chat.title;
                TextView textView = yo0Var.b;
                sb.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                sb.append(" d");
                SpannableString spannableString = new SpannableString(sb.toString());
                oq oqVar = new oq(R.drawable.msg_mini_premiumlock, 0);
                oqVar.setTopOffset(1);
                oqVar.setSize(AndroidUtilities.dp(14.0f));
                oqVar.setColorKey(org.telegram.ui.ActionBar.k6.C6);
                spannableString.setSpan(oqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                yo0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                yo0Var.b.setText(chat.title);
            }
            yo0Var.c.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
            yo0Var.a.setAvatar(chat);
        }
        fv0 fv0Var2 = yo0Var.a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z4 = false;
        }
        fv0Var2.a(z4, false);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new el0(new yo0(viewGroup.getContext(), this.c));
    }
}
