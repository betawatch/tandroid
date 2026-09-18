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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ro0 extends ll0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MessagesController e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public ro0(org.telegram.ui.ActionBar.f6 f6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.c = f6Var;
        this.d = list;
        this.e = messagesController;
        this.f = i10;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        vo0 vo0Var = (vo0) c1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i10);
        TLRPC.Peer peer = tL_sendAsPeer.peer;
        long j3 = peer.channel_id;
        long j10 = j3 != 0 ? -j3 : 0L;
        if (j10 == 0) {
            long j11 = peer.user_id;
            if (j11 != 0) {
                j10 = j11;
            }
        }
        TLRPC.Peer peer2 = this.h;
        MessagesController messagesController = this.e;
        boolean z10 = true;
        if (j10 >= 0) {
            TLRPC.User user = messagesController.getUser(Long.valueOf(j10));
            if (user != null) {
                vo0Var.b.setText(UserObject.getUserName(user));
                vo0Var.c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                vo0Var.a.setAvatar(user);
            }
            gv0 gv0Var = vo0Var.a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            gv0Var.a(z10, false);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = chat.title;
                TextView textView = vo0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                oq oqVar = new oq(R.drawable.msg_mini_premiumlock, 0);
                oqVar.setTopOffset(1);
                oqVar.setSize(AndroidUtilities.dp(14.0f));
                oqVar.setColorKey(org.telegram.ui.ActionBar.j6.C6);
                spannableString.setSpan(oqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                vo0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                vo0Var.b.setText(chat.title);
            }
            vo0Var.c.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
            vo0Var.a.setAvatar(chat);
        }
        gv0 gv0Var2 = vo0Var.a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        gv0Var2.a(z10, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new wk0(new vo0(viewGroup.getContext(), this.c));
    }
}
