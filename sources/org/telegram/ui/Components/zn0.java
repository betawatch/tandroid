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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zn0 extends vk0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ MessagesController e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public zn0(org.telegram.ui.ActionBar.b6 b6Var, List list, MessagesController messagesController, int i9, TLRPC.Peer peer) {
        this.c = b6Var;
        this.d = list;
        this.e = messagesController;
        this.f = i9;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.size();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        do0 do0Var = (do0) q1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i9);
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
                do0Var.b.setText(UserObject.getUserName(user));
                do0Var.c.setText(LocaleController.getString(R.string.VoipGroupPersonalAccount));
                do0Var.a.setAvatar(user);
            }
            mu0 mu0Var = do0Var.a;
            if (peer2 == null ? i9 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            mu0Var.a(z10, false);
            return;
        }
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j11));
        if (chat != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = chat.title;
                TextView textView = do0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                eq eqVar = new eq(R.drawable.msg_mini_premiumlock, 0);
                eqVar.setTopOffset(1);
                eqVar.setSize(AndroidUtilities.dp(14.0f));
                eqVar.setColorKey(org.telegram.ui.ActionBar.f6.C6);
                spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                do0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                do0Var.b.setText(chat.title);
            }
            do0Var.c.setText(LocaleController.formatPluralString((!ChatObject.isChannel(chat) || chat.megagroup) ? "Members" : "Subscribers", chat.participants_count, new Object[0]));
            do0Var.a.setAvatar(chat);
        }
        mu0 mu0Var2 = do0Var.a;
        if (peer2 == null ? i9 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        mu0Var2.a(z10, false);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new ik0(new do0(viewGroup.getContext(), this.c));
    }
}
