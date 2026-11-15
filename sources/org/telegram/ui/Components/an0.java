package org.telegram.ui.Components;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class an0 extends tj0 {
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ org.telegram.messenger.np e;
    public final /* synthetic */ int f;
    public final /* synthetic */ TLRPC.Peer h;

    public an0(org.telegram.ui.ActionBar.e6 e6Var, List list, org.telegram.messenger.np npVar, int i7, TLRPC.Peer peer) {
        this.c = e6Var;
        this.d = list;
        this.e = npVar;
        this.f = i7;
        this.h = peer;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.size();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        en0 en0Var = (en0) e1Var.a;
        TLRPC.TL_sendAsPeer tL_sendAsPeer = (TLRPC.TL_sendAsPeer) this.d.get(i7);
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
        org.telegram.messenger.np npVar = this.e;
        boolean z10 = true;
        if (j10 >= 0) {
            TLRPC.User a22 = npVar.a2(Long.valueOf(j10));
            if (a22 != null) {
                en0Var.b.setText(org.telegram.messenger.q10.p(a22));
                en0Var.c.setText(org.telegram.messenger.hd.M0(2131743349, null));
                en0Var.a.setAvatar(a22);
            }
            jt0 jt0Var = en0Var.a;
            if (peer2 == null ? i7 != 0 : peer2.user_id != peer.user_id) {
                z10 = false;
            }
            jt0Var.a(z10, false);
            return;
        }
        TLRPC.Chat M0 = npVar.M0(Long.valueOf(-j10));
        if (M0 != null) {
            if (tL_sendAsPeer.premium_required) {
                StringBuilder sb2 = new StringBuilder();
                String str = M0.title;
                TextView textView = en0Var.b;
                sb2.append((Object) TextUtils.ellipsize(str, textView.getPaint(), this.f - org.telegram.messenger.g0.L(100.0f), TextUtils.TruncateAt.END));
                sb2.append(" d");
                SpannableString spannableString = new SpannableString(sb2.toString());
                eq eqVar = new eq(R.drawable.msg_mini_premiumlock, 0);
                eqVar.n = 1;
                eqVar.c(org.telegram.messenger.g0.L(14.0f));
                eqVar.a(org.telegram.ui.ActionBar.j6.C6);
                spannableString.setSpan(eqVar, spannableString.length() - 1, spannableString.length(), 33);
                textView.setEllipsize(null);
                textView.setText(spannableString);
            } else {
                en0Var.b.setEllipsize(TextUtils.TruncateAt.END);
                en0Var.b.setText(M0.title);
            }
            en0Var.c.setText(org.telegram.messenger.hd.G(M0.participants_count, (!org.telegram.messenger.t3.T(M0) || M0.megagroup) ? "Members" : "Subscribers", new Object[0]));
            en0Var.a.setAvatar(M0);
        }
        jt0 jt0Var2 = en0Var.a;
        if (peer2 == null ? i7 != 0 : peer2.channel_id != peer.channel_id) {
            z10 = false;
        }
        jt0Var2.a(z10, false);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new cj0(new en0(viewGroup.getContext(), this.c));
    }
}
