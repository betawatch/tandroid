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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class vp0 extends pm0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MessagesController e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public vp0(org.telegram.ui.ActionBar.e6 e6Var, List list, MessagesController messagesController, int i10, TLRPC.Peer peer) {
        this.c = e6Var;
        this.d = list;
        this.e = messagesController;
        this.f = i10;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        zp0 zp0Var = (zp0) d1Var.a;
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
                zp0Var.b.setText(UserObject.getUserName(user));
                zp0Var.c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                zp0Var.a.setAvatar(user);
            }
            iw0 iw0Var = zp0Var.a;
            if (peer2 == null ? i10 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            iw0Var.a(z10, false);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = chat.title;
                TextView textView = zp0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                er erVar = new er(R.drawable.msg_mini_premiumlock, 0);
                erVar.setTopOffset(1);
                erVar.setSize(AndroidUtilities.dp(14.0f));
                erVar.setColorKey(org.telegram.ui.ActionBar.i6.C6);
                spannableString.setSpan(erVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                zp0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                zp0Var.b.setText(chat.title);
            }
            zp0Var.c.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
            zp0Var.a.setAvatar(chat);
        }
        iw0 iw0Var2 = zp0Var.a;
        if (peer2 == null ? i10 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        iw0Var2.a(z10, false);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new am0(new zp0(viewGroup.getContext(), this.c));
    }
}
