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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xp0 extends mm0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MessagesController e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public xp0(org.telegram.ui.ActionBar.u6 u6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.c = u6Var;
        this.d = list;
        this.e = messagesController;
        this.f = i10;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        bq0 bq0Var = (bq0) e1Var.a;
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
        boolean z10 = true;
        if (j11 >= 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j11));
            if (user != null) {
                bq0Var.b.setText(UserObject.getUserName(user));
                bq0Var.c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                bq0Var.a.setAvatar(user);
            }
            nw0 nw0Var = bq0Var.a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            nw0Var.a(z10, false);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j11));
        if (chat != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = chat.title;
                TextView textView = bq0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                zq zqVar = new zq(R.drawable.msg_mini_premiumlock, 0);
                zqVar.setTopOffset(1);
                zqVar.setSize(AndroidUtilities.dp(14.0f));
                zqVar.setColorKey(org.telegram.ui.ActionBar.y6.C6);
                spannableString.setSpan(zqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                bq0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                bq0Var.b.setText(chat.title);
            }
            bq0Var.c.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
            bq0Var.a.setAvatar(chat);
        }
        nw0 nw0Var2 = bq0Var.a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        nw0Var2.a(z10, false);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new bq0(viewGroup.getContext(), this.c));
    }
}
